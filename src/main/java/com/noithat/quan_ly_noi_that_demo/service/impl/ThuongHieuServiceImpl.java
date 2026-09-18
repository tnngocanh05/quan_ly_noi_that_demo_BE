package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.ThuongHieu;
import com.noithat.quan_ly_noi_that_demo.repository.ThuongHieuRepository;
import com.noithat.quan_ly_noi_that_demo.service.ThuongHieuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThuongHieuServiceImpl implements ThuongHieuService {

    private final ThuongHieuRepository thuongHieuRepository;

    public ThuongHieuServiceImpl(ThuongHieuRepository thuongHieuRepository) {
        this.thuongHieuRepository = thuongHieuRepository;
    }

    @Override
    public List<ThuongHieu> getAll() {
        return thuongHieuRepository.findAll();
    }

    @Override
    public ThuongHieu getById(Integer id) {
        return thuongHieuRepository.findById(id).orElse(null);
    }

    @Override
    public ThuongHieu create(ThuongHieu thuongHieu) {
        return thuongHieuRepository.save(thuongHieu);
    }

    @Override
    public ThuongHieu update(Integer id, ThuongHieu thuongHieu) {

        ThuongHieu old = thuongHieuRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setTenThuongHieu(thuongHieu.getTenThuongHieu());
        old.setMoTa(thuongHieu.getMoTa());

        return thuongHieuRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        thuongHieuRepository.deleteById(id);
    }
}