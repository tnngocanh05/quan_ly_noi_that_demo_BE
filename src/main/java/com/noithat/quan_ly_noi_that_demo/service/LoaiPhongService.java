package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.LoaiPhong;

import java.util.List;

public interface LoaiPhongService {

    List<LoaiPhong> getAll();

    LoaiPhong getById(Integer id);

    LoaiPhong create(LoaiPhong loaiPhong);

    LoaiPhong update(Integer id, LoaiPhong loaiPhong);

    void delete(Integer id);
}