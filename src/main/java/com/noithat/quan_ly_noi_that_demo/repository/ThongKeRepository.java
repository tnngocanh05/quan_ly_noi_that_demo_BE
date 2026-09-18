package com.noithat.quan_ly_noi_that_demo.repository;

import com.noithat.quan_ly_noi_that_demo.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ThongKeRepository extends JpaRepository<DonHang, Integer> {
    //Thống kê
    @Query(value = "SELECT COUNT(*) FROM san_pham", nativeQuery = true)
    Long tongSanPham();

    @Query(value = "SELECT COUNT(*) FROM don_hang", nativeQuery = true)
    Long tongDonHang();

    @Query(value = "SELECT IFNULL(SUM(tong_tien),0) FROM don_hang", nativeQuery = true)
    Double tongDoanhThu();

    //Thống kê đơn hàng hôm nay
    @Query(value = """
        SELECT COUNT(*)
        FROM don_hang
        WHERE DATE(ngay_dat) = CURDATE()
        """, nativeQuery = true)
    Long donHangHomNay();

    //Thống kê doanh thu hôm nay
    @Query(value = """
        SELECT IFNULL(SUM(tong_tien),0)
        FROM don_hang
        WHERE DATE(ngay_dat) = CURDATE()
        """, nativeQuery = true)
    Double doanhThuHomNay();


    //Thống kê doanh thu tháng này
    @Query(value = """
        SELECT IFNULL(SUM(tong_tien),0)
        FROM don_hang
        WHERE MONTH(ngay_dat)=MONTH(CURDATE())
        AND YEAR(ngay_dat)=YEAR(CURDATE())
        """, nativeQuery = true)
    Double doanhThuThang();

    //Thống kê tổng người dùng
    @Query(value = "SELECT COUNT(*) FROM nguoi_dung", nativeQuery = true)
    Long tongNguoiDung();

    //Thống kê san phẩm bán chạy
    @Query(value = """
SELECT sp.ten_san_pham
FROM chi_tiet_don_hang ctdh
JOIN san_pham sp
ON ctdh.ma_san_pham = sp.ma_san_pham
GROUP BY sp.ten_san_pham
ORDER BY SUM(ctdh.so_luong) DESC
LIMIT 1
""", nativeQuery = true)
    String sanPhamBanChay();
}