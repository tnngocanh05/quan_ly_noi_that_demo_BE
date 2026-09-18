package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.VanChuyen;

import java.util.List;

public interface VanChuyenService {

    List<VanChuyen> getAll();

    VanChuyen getById(Integer id);

    VanChuyen create(VanChuyen vanChuyen);

    VanChuyen update(Integer id, VanChuyen vanChuyen);

    void delete(Integer id);
}