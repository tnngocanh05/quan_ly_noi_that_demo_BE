package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.VanChuyen;
import com.noithat.quan_ly_noi_that_demo.service.VanChuyenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/van-chuyen")
public class VanChuyenController {

    private final VanChuyenService vanChuyenService;

    public VanChuyenController(VanChuyenService vanChuyenService) {
        this.vanChuyenService = vanChuyenService;
    }

    @GetMapping
    public List<VanChuyen> getAll() {
        return vanChuyenService.getAll();
    }

    @GetMapping("/{id}")
    public VanChuyen getById(@PathVariable Integer id) {
        return vanChuyenService.getById(id);
    }

    @PostMapping
    public VanChuyen create(@RequestBody VanChuyen vanChuyen) {
        return vanChuyenService.create(vanChuyen);
    }

    @PutMapping("/{id}")
    public VanChuyen update(
            @PathVariable Integer id,
            @RequestBody VanChuyen vanChuyen) {

        return vanChuyenService.update(id, vanChuyen);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        vanChuyenService.delete(id);
    }
}