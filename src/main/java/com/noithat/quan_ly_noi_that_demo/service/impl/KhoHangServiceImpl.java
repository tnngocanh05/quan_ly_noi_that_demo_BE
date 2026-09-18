package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.KhoHang;
import com.noithat.quan_ly_noi_that_demo.repository.KhoHangRepository;
import com.noithat.quan_ly_noi_that_demo.service.KhoHangService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoHangServiceImpl implements KhoHangService {

    private final KhoHangRepository khoHangRepository;

    public KhoHangServiceImpl(KhoHangRepository khoHangRepository) {
        this.khoHangRepository = khoHangRepository;
    }

    @Override
    public List<KhoHang> getAll() {
        return khoHangRepository.findAll();
    }

    @Override
    public KhoHang getById(Integer id) {
        return khoHangRepository.findById(id).orElse(null);
    }

    @Override
    public KhoHang create(KhoHang khoHang) {
        return khoHangRepository.save(khoHang);
    }

    @Override
    public KhoHang update(Integer id, KhoHang khoHang) {

        KhoHang old = khoHangRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setMaSanPham(khoHang.getMaSanPham());
        old.setSoLuongNhap(khoHang.getSoLuongNhap());
        old.setSoLuongDaBan(khoHang.getSoLuongDaBan());
        old.setSoLuongTon(khoHang.getSoLuongTon());

        return khoHangRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        khoHangRepository.deleteById(id);
    }
}