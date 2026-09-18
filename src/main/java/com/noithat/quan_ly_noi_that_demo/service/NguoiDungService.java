package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.NguoiDung;

import java.util.List;

public interface NguoiDungService {

    List<NguoiDung> getAll();

    NguoiDung getById(Integer id);

    NguoiDung create(NguoiDung nguoiDung);

    NguoiDung update(Integer id, NguoiDung nguoiDung);

    void delete(Integer id);
}