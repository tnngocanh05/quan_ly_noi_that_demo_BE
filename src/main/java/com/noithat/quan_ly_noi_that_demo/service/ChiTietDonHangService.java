package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.ChiTietDonHang;

import java.util.List;

public interface ChiTietDonHangService {

    List<ChiTietDonHang> getAll();

    ChiTietDonHang getById(Integer id);

    ChiTietDonHang create(ChiTietDonHang chiTietDonHang);

    ChiTietDonHang update(Integer id, ChiTietDonHang chiTietDonHang);

    void delete(Integer id);
}