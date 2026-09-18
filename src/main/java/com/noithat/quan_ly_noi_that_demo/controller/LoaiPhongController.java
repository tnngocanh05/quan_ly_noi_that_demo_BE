package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.LoaiPhong;
import com.noithat.quan_ly_noi_that_demo.service.LoaiPhongService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loai-phong")
public class LoaiPhongController {

    private final LoaiPhongService loaiPhongService;

    public LoaiPhongController(LoaiPhongService loaiPhongService) {
        this.loaiPhongService = loaiPhongService;
    }

    @GetMapping
    public List<LoaiPhong> getAll() {
        return loaiPhongService.getAll();
    }

    @GetMapping("/{id}")
    public LoaiPhong getById(@PathVariable Integer id) {
        return loaiPhongService.getById(id);
    }

    @PostMapping
    public LoaiPhong create(@RequestBody LoaiPhong loaiPhong) {
        return loaiPhongService.create(loaiPhong);
    }

    @PutMapping("/{id}")
    public LoaiPhong update(
            @PathVariable Integer id,
            @RequestBody LoaiPhong loaiPhong) {

        return loaiPhongService.update(id, loaiPhong);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        loaiPhongService.delete(id);
    }
}