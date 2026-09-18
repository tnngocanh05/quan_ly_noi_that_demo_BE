package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.NguoiDung;
import com.noithat.quan_ly_noi_that_demo.repository.NguoiDungRepository;
import com.noithat.quan_ly_noi_that_demo.service.NguoiDungService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {

    private final NguoiDungRepository nguoiDungRepository;

    public NguoiDungServiceImpl(NguoiDungRepository nguoiDungRepository) {
        this.nguoiDungRepository = nguoiDungRepository;
    }

    @Override
    public List<NguoiDung> getAll() {
        return nguoiDungRepository.findAll();
    }

    @Override
    public NguoiDung getById(Integer id) {
        return nguoiDungRepository.findById(id).orElse(null);
    }

    @Override
    public NguoiDung create(NguoiDung nguoiDung) {
        return nguoiDungRepository.save(nguoiDung);
    }

    @Override
    public NguoiDung update(Integer id, NguoiDung nguoiDung) {

        NguoiDung old =
                nguoiDungRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setHoTen(nguoiDung.getHoTen());
        old.setEmail(nguoiDung.getEmail());
        old.setMatKhau(nguoiDung.getMatKhau());
        old.setSoDienThoai(nguoiDung.getSoDienThoai());
        old.setDiaChi(nguoiDung.getDiaChi());
        old.setVaiTro(nguoiDung.getVaiTro());

        return nguoiDungRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        nguoiDungRepository.deleteById(id);
    }
}