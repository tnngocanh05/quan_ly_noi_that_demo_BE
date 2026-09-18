package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.ChiTietDonHang;
import com.noithat.quan_ly_noi_that_demo.repository.ChiTietDonHangRepository;
import com.noithat.quan_ly_noi_that_demo.service.ChiTietDonHangService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService {

    private final ChiTietDonHangRepository chiTietDonHangRepository;

    public ChiTietDonHangServiceImpl(
            ChiTietDonHangRepository chiTietDonHangRepository) {

        this.chiTietDonHangRepository = chiTietDonHangRepository;
    }

    @Override
    public List<ChiTietDonHang> getAll() {
        return chiTietDonHangRepository.findAll();
    }

    @Override
    public ChiTietDonHang getById(Integer id) {
        return chiTietDonHangRepository.findById(id).orElse(null);
    }

    @Override
    public ChiTietDonHang create(ChiTietDonHang chiTietDonHang) {
        return chiTietDonHangRepository.save(chiTietDonHang);
    }

    @Override
    public ChiTietDonHang update(
            Integer id,
            ChiTietDonHang chiTietDonHang) {

        ChiTietDonHang old =
                chiTietDonHangRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setMaDonHang(chiTietDonHang.getMaDonHang());
        old.setMaSanPham(chiTietDonHang.getMaSanPham());
        old.setSoLuong(chiTietDonHang.getSoLuong());
        old.setDonGia(chiTietDonHang.getDonGia());

        return chiTietDonHangRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        chiTietDonHangRepository.deleteById(id);
    }
}