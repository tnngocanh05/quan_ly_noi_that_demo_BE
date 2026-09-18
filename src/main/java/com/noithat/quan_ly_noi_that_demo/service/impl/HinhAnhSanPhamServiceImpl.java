package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.HinhAnhSanPham;
import com.noithat.quan_ly_noi_that_demo.repository.HinhAnhSanPhamRepository;
import com.noithat.quan_ly_noi_that_demo.service.HinhAnhSanPhamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HinhAnhSanPhamServiceImpl implements HinhAnhSanPhamService {

    private final HinhAnhSanPhamRepository hinhAnhSanPhamRepository;

    public HinhAnhSanPhamServiceImpl(HinhAnhSanPhamRepository hinhAnhSanPhamRepository) {
        this.hinhAnhSanPhamRepository = hinhAnhSanPhamRepository;
    }

    @Override
    public List<HinhAnhSanPham> getAll() {
        return hinhAnhSanPhamRepository.findAll();
    }

    @Override
    public HinhAnhSanPham getById(Integer id) {
        return hinhAnhSanPhamRepository.findById(id).orElse(null);
    }

    @Override
    public HinhAnhSanPham create(HinhAnhSanPham hinhAnhSanPham) {
        return hinhAnhSanPhamRepository.save(hinhAnhSanPham);
    }

    @Override
    public HinhAnhSanPham update(Integer id, HinhAnhSanPham hinhAnhSanPham) {

        HinhAnhSanPham old = hinhAnhSanPhamRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setMaSanPham(hinhAnhSanPham.getMaSanPham());
        old.setDuongDanAnh(hinhAnhSanPham.getDuongDanAnh());

        return hinhAnhSanPhamRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        hinhAnhSanPhamRepository.deleteById(id);
    }
}