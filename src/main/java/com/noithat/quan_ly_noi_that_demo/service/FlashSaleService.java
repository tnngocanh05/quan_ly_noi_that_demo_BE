package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.FlashSale;

import java.util.List;

public interface FlashSaleService {

    List<FlashSale> getAll();

    FlashSale getById(Integer id);

    FlashSale create(FlashSale flashSale);

    FlashSale update(Integer id, FlashSale flashSale);

    void delete(Integer id);
}