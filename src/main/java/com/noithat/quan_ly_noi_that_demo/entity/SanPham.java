package com.noithat.quan_ly_noi_that_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "san_pham")
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_san_pham")
    private Integer maSanPham;

    @Column(name = "ten_san_pham")
    private String tenSanPham;

    @Column(name = "gia")
    private Double gia;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "ma_thuong_hieu")
    private Integer maThuongHieu;

    @Column(name = "ma_danh_muc")
    private Integer maDanhMuc;

    @Column(name = "ma_loai_phong")
    private Integer maLoaiPhong;

    @Column(name = "ma_chat_lieu")
    private Integer maChatLieu;

    public Integer getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Integer maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(Integer maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public Integer getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(Integer maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public Integer getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(Integer maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public Integer getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(Integer maChatLieu) {
        this.maChatLieu = maChatLieu;
    }
}