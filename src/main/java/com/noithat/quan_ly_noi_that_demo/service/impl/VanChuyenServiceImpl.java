package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.VanChuyen;
import com.noithat.quan_ly_noi_that_demo.repository.VanChuyenRepository;
import com.noithat.quan_ly_noi_that_demo.service.VanChuyenService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VanChuyenServiceImpl implements VanChuyenService {

    private final VanChuyenRepository vanChuyenRepository;

    public VanChuyenServiceImpl(VanChuyenRepository vanChuyenRepository) {
        this.vanChuyenRepository = vanChuyenRepository;
    }

    @Override
    public List<VanChuyen> getAll() {
        return vanChuyenRepository.findAll();
    }

    @Override
    public VanChuyen getById(Integer id) {
        return vanChuyenRepository.findById(id).orElse(null);
    }

    @Override
    public VanChuyen create(VanChuyen vanChuyen) {
        return vanChuyenRepository.save(vanChuyen);
    }

    @Override
    public VanChuyen update(Integer id, VanChuyen vanChuyen) {

        VanChuyen old =
                vanChuyenRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setMaDonHang(vanChuyen.getMaDonHang());
        old.setMaVanDon(vanChuyen.getMaVanDon());
        old.setDonViVanChuyen(vanChuyen.getDonViVanChuyen());
        old.setTrangThai(vanChuyen.getTrangThai());

        return vanChuyenRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        vanChuyenRepository.deleteById(id);
    }
}