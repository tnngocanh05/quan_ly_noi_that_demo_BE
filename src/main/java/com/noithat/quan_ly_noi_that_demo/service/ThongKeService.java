package com.noithat.quan_ly_noi_that_demo.service;

import java.util.Map;

public interface ThongKeService {

    Map<String, Object> thongKeTongQuan();

    Long donHangHomNay();

    Double doanhThuHomNay();

    Double doanhThuThang();

    Long tongNguoiDung();

    String sanPhamBanChay();
}