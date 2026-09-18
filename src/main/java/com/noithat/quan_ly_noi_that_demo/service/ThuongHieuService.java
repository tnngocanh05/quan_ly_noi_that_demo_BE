package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.ThuongHieu;

import java.util.List;

public interface ThuongHieuService {

    List<ThuongHieu> getAll();

    ThuongHieu getById(Integer id);

    ThuongHieu create(ThuongHieu thuongHieu);

    ThuongHieu update(Integer id, ThuongHieu thuongHieu);

    void delete(Integer id);
}