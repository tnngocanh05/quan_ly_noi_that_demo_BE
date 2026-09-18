package com.noithat.quan_ly_noi_that_demo.dto.request;

public class SanPhamRequestDTO {

    private String tenSanPham;
    private Double gia;
    private String moTa;
    private Integer maThuongHieu;
    private Integer maDanhMuc;
    private Integer maLoaiPhong;
    private Integer maChatLieu;

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