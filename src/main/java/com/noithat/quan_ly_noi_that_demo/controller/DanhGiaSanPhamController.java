package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.DanhGiaSanPham;
import com.noithat.quan_ly_noi_that_demo.service.DanhGiaSanPhamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/danh-gia-san-pham")
public class DanhGiaSanPhamController {

    private final DanhGiaSanPhamService danhGiaSanPhamService;

    public DanhGiaSanPhamController(
            DanhGiaSanPhamService danhGiaSanPhamService) {

        this.danhGiaSanPhamService = danhGiaSanPhamService;
    }

    @GetMapping
    public List<DanhGiaSanPham> getAll() {
        return danhGiaSanPhamService.getAll();
    }

    @GetMapping("/{id}")
    public DanhGiaSanPham getById(
            @PathVariable Integer id) {

        return danhGiaSanPhamService.getById(id);
    }

    @PostMapping
    public DanhGiaSanPham create(
            @RequestBody DanhGiaSanPham danhGiaSanPham) {

        return danhGiaSanPhamService.create(danhGiaSanPham);
    }

    @PutMapping("/{id}")
    public DanhGiaSanPham update(
            @PathVariable Integer id,
            @RequestBody DanhGiaSanPham danhGiaSanPham) {

        return danhGiaSanPhamService.update(id, danhGiaSanPham);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        danhGiaSanPhamService.delete(id);
    }
}