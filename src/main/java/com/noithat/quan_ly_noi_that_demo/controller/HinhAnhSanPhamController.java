package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.HinhAnhSanPham;
import com.noithat.quan_ly_noi_that_demo.service.HinhAnhSanPhamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hinh-anh-san-pham")
public class HinhAnhSanPhamController {

    private final HinhAnhSanPhamService hinhAnhSanPhamService;

    public HinhAnhSanPhamController(HinhAnhSanPhamService hinhAnhSanPhamService) {
        this.hinhAnhSanPhamService = hinhAnhSanPhamService;
    }

    @GetMapping
    public List<HinhAnhSanPham> getAll() {
        return hinhAnhSanPhamService.getAll();
    }

    @GetMapping("/{id}")
    public HinhAnhSanPham getById(@PathVariable Integer id) {
        return hinhAnhSanPhamService.getById(id);
    }

    @PostMapping
    public HinhAnhSanPham create(@RequestBody HinhAnhSanPham hinhAnhSanPham) {
        return hinhAnhSanPhamService.create(hinhAnhSanPham);
    }

    @PutMapping("/{id}")
    public HinhAnhSanPham update(
            @PathVariable Integer id,
            @RequestBody HinhAnhSanPham hinhAnhSanPham) {

        return hinhAnhSanPhamService.update(id, hinhAnhSanPham);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        hinhAnhSanPhamService.delete(id);
    }
}