package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.KhoHang;
import com.noithat.quan_ly_noi_that_demo.service.KhoHangService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kho-hang")
public class KhoHangController {

    private final KhoHangService khoHangService;

    public KhoHangController(KhoHangService khoHangService) {
        this.khoHangService = khoHangService;
    }

    @GetMapping
    public List<KhoHang> getAll() {
        return khoHangService.getAll();
    }

    @GetMapping("/{id}")
    public KhoHang getById(@PathVariable Integer id) {
        return khoHangService.getById(id);
    }

    @PostMapping
    public KhoHang create(@RequestBody KhoHang khoHang) {
        return khoHangService.create(khoHang);
    }

    @PutMapping("/{id}")
    public KhoHang update(
            @PathVariable Integer id,
            @RequestBody KhoHang khoHang) {

        return khoHangService.update(id, khoHang);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        khoHangService.delete(id);
    }
}