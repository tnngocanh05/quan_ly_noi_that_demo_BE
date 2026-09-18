package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.DonHang;

import java.util.List;

public interface DonHangService {

    List<DonHang> getAll();

    DonHang getById(Integer id);

    DonHang create(DonHang donHang);

    DonHang update(Integer id, DonHang donHang);

    void delete(Integer id);
}