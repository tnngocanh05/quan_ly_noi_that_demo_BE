package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.ChiTietDonHang;
import com.noithat.quan_ly_noi_that_demo.service.ChiTietDonHangService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chi-tiet-don-hang")
public class ChiTietDonHangController {

    private final ChiTietDonHangService chiTietDonHangService;

    public ChiTietDonHangController(
            ChiTietDonHangService chiTietDonHangService) {

        this.chiTietDonHangService = chiTietDonHangService;
    }

    @GetMapping
    public List<ChiTietDonHang> getAll() {
        return chiTietDonHangService.getAll();
    }

    @GetMapping("/{id}")
    public ChiTietDonHang getById(@PathVariable Integer id) {
        return chiTietDonHangService.getById(id);
    }

    @PostMapping
    public ChiTietDonHang create(
            @RequestBody ChiTietDonHang chiTietDonHang) {

        return chiTietDonHangService.create(chiTietDonHang);
    }

    @PutMapping("/{id}")
    public ChiTietDonHang update(
            @PathVariable Integer id,
            @RequestBody ChiTietDonHang chiTietDonHang) {

        return chiTietDonHangService.update(id, chiTietDonHang);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        chiTietDonHangService.delete(id);
    }
}