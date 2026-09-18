package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.ThuongHieu;
import com.noithat.quan_ly_noi_that_demo.service.ThuongHieuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/thuong-hieu")
public class ThuongHieuController {

    private final ThuongHieuService thuongHieuService;

    public ThuongHieuController(ThuongHieuService thuongHieuService) {
        this.thuongHieuService = thuongHieuService;
    }

    @GetMapping
    public List<ThuongHieu> getAll() {
        return thuongHieuService.getAll();
    }

    @GetMapping("/{id}")
    public ThuongHieu getById(@PathVariable Integer id) {
        return thuongHieuService.getById(id);
    }

    @PostMapping
    public ThuongHieu create(@RequestBody ThuongHieu thuongHieu) {
        return thuongHieuService.create(thuongHieu);
    }

    @PutMapping("/{id}")
    public ThuongHieu update(@PathVariable Integer id,
                             @RequestBody ThuongHieu thuongHieu) {

        return thuongHieuService.update(id, thuongHieu);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        thuongHieuService.delete(id);
    }
}