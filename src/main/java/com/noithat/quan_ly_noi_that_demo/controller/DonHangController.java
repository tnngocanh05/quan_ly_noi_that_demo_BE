package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.DonHang;
import com.noithat.quan_ly_noi_that_demo.service.DonHangService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/don-hang")
public class DonHangController {

    private final DonHangService donHangService;

    public DonHangController(DonHangService donHangService) {
        this.donHangService = donHangService;
    }

    @GetMapping
    public List<DonHang> getAll() {
        return donHangService.getAll();
    }

    @GetMapping("/{id}")
    public DonHang getById(@PathVariable Integer id) {
        return donHangService.getById(id);
    }

    @PostMapping
    public DonHang create(@RequestBody DonHang donHang) {
        return donHangService.create(donHang);
    }

    @PutMapping("/{id}")
    public DonHang update(
            @PathVariable Integer id,
            @RequestBody DonHang donHang) {

        return donHangService.update(id, donHang);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        donHangService.delete(id);
    }
}