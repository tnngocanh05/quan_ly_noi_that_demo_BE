package com.noithat.quan_ly_noi_that_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "van_chuyen")
public class VanChuyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_van_chuyen")
    private Integer maVanChuyen;

    @Column(name = "ma_don_hang")
    private Integer maDonHang;

    @Column(name = "ma_van_don")
    private String maVanDon;

    @Column(name = "don_vi_van_chuyen")
    private String donViVanChuyen;

    @Column(name = "trang_thai")
    private String trangThai;

    public Integer getMaVanChuyen() {
        return maVanChuyen;
    }

    public void setMaVanChuyen(Integer maVanChuyen) {
        this.maVanChuyen = maVanChuyen;
    }

    public Integer getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(Integer maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getMaVanDon() {
        return maVanDon;
    }

    public void setMaVanDon(String maVanDon) {
        this.maVanDon = maVanDon;
    }

    public String getDonViVanChuyen() {
        return donViVanChuyen;
    }

    public void setDonViVanChuyen(String donViVanChuyen) {
        this.donViVanChuyen = donViVanChuyen;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}