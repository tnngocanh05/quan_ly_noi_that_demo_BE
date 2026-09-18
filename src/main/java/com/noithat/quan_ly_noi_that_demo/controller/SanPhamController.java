package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.dto.request.SanPhamRequestDTO;
import com.noithat.quan_ly_noi_that_demo.dto.response.SanPhamResponseDTO;
import com.noithat.quan_ly_noi_that_demo.service.SanPhamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/san-pham")
public class SanPhamController {

    private final SanPhamService sanPhamService;

    public SanPhamController(SanPhamService sanPhamService) {
        this.sanPhamService = sanPhamService;
    }

    @GetMapping
    public List<SanPhamResponseDTO> getAll() {
        return sanPhamService.getAll();
    }

    @GetMapping("/{id}")
    public SanPhamResponseDTO getById(
            @PathVariable Integer id) {

        return sanPhamService.getById(id);
    }

    @PostMapping
    public SanPhamResponseDTO create(
            @RequestBody SanPhamRequestDTO request) {

        return sanPhamService.create(request);
    }

    @PutMapping("/{id}")
    public SanPhamResponseDTO update(
            @PathVariable Integer id,
            @RequestBody SanPhamRequestDTO request) {

        return sanPhamService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        sanPhamService.delete(id);
    }
}