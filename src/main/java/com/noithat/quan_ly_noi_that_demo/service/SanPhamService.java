package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.dto.request.SanPhamRequestDTO;
import com.noithat.quan_ly_noi_that_demo.dto.response.SanPhamResponseDTO;

import java.util.List;

public interface SanPhamService {

    List<SanPhamResponseDTO> getAll();

    SanPhamResponseDTO getById(Integer id);

    SanPhamResponseDTO create(SanPhamRequestDTO request);

    SanPhamResponseDTO update(Integer id, SanPhamRequestDTO request);

    void delete(Integer id);
}