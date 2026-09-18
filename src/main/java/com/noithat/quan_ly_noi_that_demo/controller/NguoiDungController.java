package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.NguoiDung;
import com.noithat.quan_ly_noi_that_demo.service.NguoiDungService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nguoi-dung")
public class NguoiDungController {

    private final NguoiDungService nguoiDungService;

    public NguoiDungController(NguoiDungService nguoiDungService) {
        this.nguoiDungService = nguoiDungService;
    }

    @GetMapping
    public List<NguoiDung> getAll() {
        return nguoiDungService.getAll();
    }

    @GetMapping("/{id}")
    public NguoiDung getById(@PathVariable Integer id) {
        return nguoiDungService.getById(id);
    }

    @PostMapping
    public NguoiDung create(@RequestBody NguoiDung nguoiDung) {
        return nguoiDungService.create(nguoiDung);
    }

    @PutMapping("/{id}")
    public NguoiDung update(
            @PathVariable Integer id,
            @RequestBody NguoiDung nguoiDung) {

        return nguoiDungService.update(id, nguoiDung);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        nguoiDungService.delete(id);
    }
}