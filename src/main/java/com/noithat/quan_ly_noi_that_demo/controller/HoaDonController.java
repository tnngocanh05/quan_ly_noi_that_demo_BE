package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.HoaDon;
import com.noithat.quan_ly_noi_that_demo.repository.HoaDonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hoa-don")
public class HoaDonController {

    private final HoaDonRepository hoaDonRepository;

    public HoaDonController(HoaDonRepository hoaDonRepository) {
        this.hoaDonRepository = hoaDonRepository;
    }

    @GetMapping
    public List<HoaDon> getAll() {
        return hoaDonRepository.findAll();
    }

    @GetMapping("/{id}")
    public HoaDon getById(@PathVariable Integer id) {
        return hoaDonRepository.findById(id).orElse(null);
    }

    @PostMapping
    public HoaDon create(@RequestBody HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @PutMapping("/{id}")
    public HoaDon update(@PathVariable Integer id,
                         @RequestBody HoaDon hoaDon) {

        hoaDon.setMaHoaDon(id);
        return hoaDonRepository.save(hoaDon);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        hoaDonRepository.deleteById(id);
        return "Xoa hoa don thanh cong";
    }
}