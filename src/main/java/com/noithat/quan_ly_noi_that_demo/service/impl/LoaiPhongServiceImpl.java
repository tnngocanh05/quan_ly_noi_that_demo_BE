package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.LoaiPhong;
import com.noithat.quan_ly_noi_that_demo.repository.LoaiPhongRepository;
import com.noithat.quan_ly_noi_that_demo.service.LoaiPhongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiPhongServiceImpl implements LoaiPhongService {

    private final LoaiPhongRepository loaiPhongRepository;

    public LoaiPhongServiceImpl(LoaiPhongRepository loaiPhongRepository) {
        this.loaiPhongRepository = loaiPhongRepository;
    }

    @Override
    public List<LoaiPhong> getAll() {
        return loaiPhongRepository.findAll();
    }

    @Override
    public LoaiPhong getById(Integer id) {
        return loaiPhongRepository.findById(id).orElse(null);
    }

    @Override
    public LoaiPhong create(LoaiPhong loaiPhong) {
        return loaiPhongRepository.save(loaiPhong);
    }

    @Override
    public LoaiPhong update(Integer id, LoaiPhong loaiPhong) {

        LoaiPhong old = loaiPhongRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setTenLoaiPhong(loaiPhong.getTenLoaiPhong());

        return loaiPhongRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        loaiPhongRepository.deleteById(id);
    }
}