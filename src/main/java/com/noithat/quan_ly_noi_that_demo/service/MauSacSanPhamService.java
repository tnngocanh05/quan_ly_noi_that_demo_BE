package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.MauSacSanPham;

import java.util.List;

public interface MauSacSanPhamService {

    List<MauSacSanPham> getAll();

    MauSacSanPham getById(Integer id);

    MauSacSanPham create(MauSacSanPham mauSacSanPham);

    MauSacSanPham update(Integer id, MauSacSanPham mauSacSanPham);

    void delete(Integer id);
}