package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.DanhGiaSanPham;
import com.noithat.quan_ly_noi_that_demo.repository.DanhGiaSanPhamRepository;
import com.noithat.quan_ly_noi_that_demo.service.DanhGiaSanPhamService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DanhGiaSanPhamServiceImpl
        implements DanhGiaSanPhamService {

    private final DanhGiaSanPhamRepository danhGiaSanPhamRepository;

    public DanhGiaSanPhamServiceImpl(
            DanhGiaSanPhamRepository danhGiaSanPhamRepository) {

        this.danhGiaSanPhamRepository = danhGiaSanPhamRepository;
    }

    @Override
    public List<DanhGiaSanPham> getAll() {
        return danhGiaSanPhamRepository.findAll();
    }

    @Override
    public DanhGiaSanPham getById(Integer id) {
        return danhGiaSanPhamRepository
                .findById(id)
                .orElse(null);
    }

    @Override
    public DanhGiaSanPham create(
            DanhGiaSanPham danhGiaSanPham) {

        if (danhGiaSanPham.getNgayDanhGia() == null) {
            danhGiaSanPham.setNgayDanhGia(LocalDateTime.now());
        }

        return danhGiaSanPhamRepository.save(danhGiaSanPham);
    }

    @Override
    public DanhGiaSanPham update(
            Integer id,
            DanhGiaSanPham danhGiaSanPham) {

        DanhGiaSanPham old =
                danhGiaSanPhamRepository
                        .findById(id)
                        .orElse(null);

        if (old == null) {
            return null;
        }

        old.setMaSanPham(danhGiaSanPham.getMaSanPham());
        old.setMaNguoiDung(danhGiaSanPham.getMaNguoiDung());
        old.setSoSao(danhGiaSanPham.getSoSao());
        old.setBinhLuan(danhGiaSanPham.getBinhLuan());

        // Giữ nguyên ngày đánh giá cũ
        return danhGiaSanPhamRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        danhGiaSanPhamRepository.deleteById(id);
    }
}