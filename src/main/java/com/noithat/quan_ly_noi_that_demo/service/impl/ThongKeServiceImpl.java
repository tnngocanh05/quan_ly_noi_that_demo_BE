package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.repository.ThongKeRepository;
import com.noithat.quan_ly_noi_that_demo.service.ThongKeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ThongKeServiceImpl implements ThongKeService {

    private final ThongKeRepository thongKeRepository;

    public ThongKeServiceImpl(ThongKeRepository thongKeRepository) {
        this.thongKeRepository = thongKeRepository;
    }

    @Override
    public Map<String, Object> thongKeTongQuan() {

        Map<String, Object> result = new HashMap<>();

        result.put("tongSanPham",
                thongKeRepository.tongSanPham());

        result.put("tongDonHang",
                thongKeRepository.tongDonHang());

        result.put("tongDoanhThu",
                thongKeRepository.tongDoanhThu());

        return result;
    }

    @Override
    public Long donHangHomNay() {
        return thongKeRepository.donHangHomNay();
    }

    @Override
    public Double doanhThuHomNay() {
        return thongKeRepository.doanhThuHomNay();
    }

    @Override
    public Double doanhThuThang() {
        return thongKeRepository.doanhThuThang();
    }

    @Override
    public Long tongNguoiDung() {
        return thongKeRepository.tongNguoiDung();
    }

    @Override
    public String sanPhamBanChay() {
        return thongKeRepository.sanPhamBanChay();
    }
}