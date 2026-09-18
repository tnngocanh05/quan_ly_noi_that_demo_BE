package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.KhoHang;

import java.util.List;

public interface KhoHangService {

    List<KhoHang> getAll();

    KhoHang getById(Integer id);

    KhoHang create(KhoHang khoHang);

    KhoHang update(Integer id, KhoHang khoHang);

    void delete(Integer id);
}