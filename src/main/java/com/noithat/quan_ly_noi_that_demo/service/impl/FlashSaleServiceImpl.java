package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.FlashSale;
import com.noithat.quan_ly_noi_that_demo.repository.FlashSaleRepository;
import com.noithat.quan_ly_noi_that_demo.service.FlashSaleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashSaleServiceImpl implements FlashSaleService {

    private final FlashSaleRepository flashSaleRepository;

    public FlashSaleServiceImpl(FlashSaleRepository flashSaleRepository) {
        this.flashSaleRepository = flashSaleRepository;
    }

    @Override
    public List<FlashSale> getAll() {
        return flashSaleRepository.findAll();
    }

    @Override
    public FlashSale getById(Integer id) {
        return flashSaleRepository.findById(id).orElse(null);
    }

    @Override
    public FlashSale create(FlashSale flashSale) {
        return flashSaleRepository.save(flashSale);
    }

    @Override
    public FlashSale update(Integer id, FlashSale flashSale) {

        FlashSale old =
                flashSaleRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setMaSanPham(flashSale.getMaSanPham());
        old.setGiaKhuyenMai(flashSale.getGiaKhuyenMai());
        old.setNgayBatDau(flashSale.getNgayBatDau());
        old.setNgayKetThuc(flashSale.getNgayKetThuc());

        return flashSaleRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        flashSaleRepository.deleteById(id);
    }
}