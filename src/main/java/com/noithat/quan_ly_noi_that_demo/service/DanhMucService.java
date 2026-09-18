package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.dto.request.DanhMucRequestDTO;
import com.noithat.quan_ly_noi_that_demo.dto.response.DanhMucResponseDTO;

import java.util.List;

public interface DanhMucService {

    List<DanhMucResponseDTO> getAll();

    DanhMucResponseDTO getById(Integer id);

    DanhMucResponseDTO create(DanhMucRequestDTO request);

    DanhMucResponseDTO update(Integer id, DanhMucRequestDTO request);

    void delete(Integer id);
}