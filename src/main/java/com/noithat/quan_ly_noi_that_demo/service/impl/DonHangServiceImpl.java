package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.DonHang;
import com.noithat.quan_ly_noi_that_demo.repository.DonHangRepository;
import com.noithat.quan_ly_noi_that_demo.service.DonHangService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonHangServiceImpl implements DonHangService {

    private final DonHangRepository donHangRepository;

    public DonHangServiceImpl(DonHangRepository donHangRepository) {
        this.donHangRepository = donHangRepository;
    }

    @Override
    public List<DonHang> getAll() {
        return donHangRepository.findAll();
    }

    @Override
    public DonHang getById(Integer id) {
        return donHangRepository.findById(id).orElse(null);
    }

    @Override
    public DonHang create(DonHang donHang) {
        return donHangRepository.save(donHang);
    }

    @Override
    public DonHang update(Integer id, DonHang donHang) {

        DonHang old =
                donHangRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setMaNguoiDung(donHang.getMaNguoiDung());
        old.setNguoiNhan(donHang.getNguoiNhan());
        old.setSoDienThoaiNhan(donHang.getSoDienThoaiNhan());
        old.setDiaChiGiaoHang(donHang.getDiaChiGiaoHang());
        old.setTongTien(donHang.getTongTien());
        old.setTrangThai(donHang.getTrangThai());
        old.setNgayDat(donHang.getNgayDat());

        return donHangRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        donHangRepository.deleteById(id);
    }
}