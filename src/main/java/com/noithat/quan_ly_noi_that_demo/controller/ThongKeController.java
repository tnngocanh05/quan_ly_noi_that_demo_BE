package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.service.ThongKeService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/thong-ke")
public class ThongKeController {

    private final ThongKeService thongKeService;

    public ThongKeController(ThongKeService thongKeService) {
        this.thongKeService = thongKeService;
    }

    // Thống kê tổng quan
    @GetMapping
    public Map<String, Object> thongKeTongQuan() {
        return thongKeService.thongKeTongQuan();
    }

    // Thống kê đơn hàng hôm nay
    @GetMapping("/don-hang-hom-nay")
    public Long donHangHomNay() {
        return thongKeService.donHangHomNay();
    }

    // Thống kê doanh thu hôm nay
    @GetMapping("/doanh-thu-hom-nay")
    public Double doanhThuHomNay() {
        return thongKeService.doanhThuHomNay();
    }

    // Thống kê doanh thu tháng này
    @GetMapping("/doanh-thu-thang")
    public Double doanhThuThang() {
        return thongKeService.doanhThuThang();
    }

    // Thống kê tổng người dùng
    @GetMapping("/tong-nguoi-dung")
    public Long tongNguoiDung() {
        return thongKeService.tongNguoiDung();
    }

    // Thống kê sản phẩm bán chạy
    @GetMapping("/san-pham-ban-chay")
    public String sanPhamBanChay() {
        return thongKeService.sanPhamBanChay();
    }
}