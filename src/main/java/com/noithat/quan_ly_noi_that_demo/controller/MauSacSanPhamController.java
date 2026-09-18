package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.MauSacSanPham;
import com.noithat.quan_ly_noi_that_demo.service.MauSacSanPhamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mau-sac-san-pham")
public class MauSacSanPhamController {

    private final MauSacSanPhamService mauSacSanPhamService;

    public MauSacSanPhamController(
            MauSacSanPhamService mauSacSanPhamService) {

        this.mauSacSanPhamService = mauSacSanPhamService;
    }

    @GetMapping
    public List<MauSacSanPham> getAll() {
        return mauSacSanPhamService.getAll();
    }

    @GetMapping("/{id}")
    public MauSacSanPham getById(@PathVariable Integer id) {
        return mauSacSanPhamService.getById(id);
    }

    @PostMapping
    public MauSacSanPham create(
            @RequestBody MauSacSanPham mauSacSanPham) {

        return mauSacSanPhamService.create(mauSacSanPham);
    }

    @PutMapping("/{id}")
    public MauSacSanPham update(
            @PathVariable Integer id,
            @RequestBody MauSacSanPham mauSacSanPham) {

        return mauSacSanPhamService.update(id, mauSacSanPham);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        mauSacSanPhamService.delete(id);
    }
}