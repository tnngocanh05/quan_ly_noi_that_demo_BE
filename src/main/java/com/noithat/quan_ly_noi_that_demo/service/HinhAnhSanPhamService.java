package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.HinhAnhSanPham;

import java.util.List;

public interface HinhAnhSanPhamService {

    List<HinhAnhSanPham> getAll();

    HinhAnhSanPham getById(Integer id);

    HinhAnhSanPham create(HinhAnhSanPham hinhAnhSanPham);

    HinhAnhSanPham update(Integer id, HinhAnhSanPham hinhAnhSanPham);

    void delete(Integer id);
}