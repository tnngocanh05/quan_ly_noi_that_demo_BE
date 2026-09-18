package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.dto.request.DanhMucRequestDTO;
import com.noithat.quan_ly_noi_that_demo.dto.response.DanhMucResponseDTO;
import com.noithat.quan_ly_noi_that_demo.service.DanhMucService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/danh-muc")
public class DanhMucController {

    private final DanhMucService danhMucService;

    public DanhMucController(DanhMucService danhMucService) {
        this.danhMucService = danhMucService;
    }

    @GetMapping
    public List<DanhMucResponseDTO> getAll() {
        return danhMucService.getAll();
    }

    @GetMapping("/{id}")
    public DanhMucResponseDTO getById(@PathVariable Integer id) {
        return danhMucService.getById(id);
    }

    @PostMapping
    public DanhMucResponseDTO create(@RequestBody DanhMucRequestDTO request) {
        return danhMucService.create(request);
    }

    @PutMapping("/{id}")
    public DanhMucResponseDTO update(
            @PathVariable Integer id,
            @RequestBody DanhMucRequestDTO request) {

        return danhMucService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        danhMucService.delete(id);
    }
}