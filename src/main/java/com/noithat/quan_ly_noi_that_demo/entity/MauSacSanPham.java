package com.noithat.quan_ly_noi_that_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mau_sac_san_pham")
public class MauSacSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_mau_sac")
    private Integer maMauSac;

    @Column(name = "ma_san_pham")
    private Integer maSanPham;

    @Column(name = "ten_mau_sac")
    private String tenMauSac;

    public Integer getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(Integer maMauSac) {
        this.maMauSac = maMauSac;
    }

    public Integer getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Integer maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }
}