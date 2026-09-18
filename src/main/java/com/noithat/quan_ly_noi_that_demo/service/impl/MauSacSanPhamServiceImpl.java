package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.MauSacSanPham;
import com.noithat.quan_ly_noi_that_demo.repository.MauSacSanPhamRepository;
import com.noithat.quan_ly_noi_that_demo.service.MauSacSanPhamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MauSacSanPhamServiceImpl implements MauSacSanPhamService {

    private final MauSacSanPhamRepository mauSacSanPhamRepository;

    public MauSacSanPhamServiceImpl(
            MauSacSanPhamRepository mauSacSanPhamRepository) {

        this.mauSacSanPhamRepository = mauSacSanPhamRepository;
    }

    @Override
    public List<MauSacSanPham> getAll() {
        return mauSacSanPhamRepository.findAll();
    }

    @Override
    public MauSacSanPham getById(Integer id) {
        return mauSacSanPhamRepository.findById(id).orElse(null);
    }

    @Override
    public MauSacSanPham create(MauSacSanPham mauSacSanPham) {
        return mauSacSanPhamRepository.save(mauSacSanPham);
    }

    @Override
    public MauSacSanPham update(
            Integer id,
            MauSacSanPham mauSacSanPham) {

        MauSacSanPham old =
                mauSacSanPhamRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setMaSanPham(mauSacSanPham.getMaSanPham());
        old.setTenMauSac(mauSacSanPham.getTenMauSac());

        return mauSacSanPhamRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        mauSacSanPhamRepository.deleteById(id);
    }
}