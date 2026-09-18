package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.DanhGiaSanPham;

import java.util.List;

public interface DanhGiaSanPhamService {

    List<DanhGiaSanPham> getAll();

    DanhGiaSanPham getById(Integer id);

    DanhGiaSanPham create(DanhGiaSanPham danhGiaSanPham);

    DanhGiaSanPham update(Integer id, DanhGiaSanPham danhGiaSanPham);

    void delete(Integer id);
}