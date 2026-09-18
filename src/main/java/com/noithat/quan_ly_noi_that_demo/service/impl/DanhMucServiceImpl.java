package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.dto.request.DanhMucRequestDTO;
import com.noithat.quan_ly_noi_that_demo.dto.response.DanhMucResponseDTO;
import com.noithat.quan_ly_noi_that_demo.entity.DanhMuc;
import com.noithat.quan_ly_noi_that_demo.repository.DanhMucRepository;
import com.noithat.quan_ly_noi_that_demo.service.DanhMucService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DanhMucServiceImpl implements DanhMucService {

    private final DanhMucRepository danhMucRepository;

    public DanhMucServiceImpl(DanhMucRepository danhMucRepository) {
        this.danhMucRepository = danhMucRepository;
    }

    @Override
    public List<DanhMucResponseDTO> getAll() {

        List<DanhMuc> danhMucs = danhMucRepository.findAll();

        List<DanhMucResponseDTO> result = new ArrayList<>();

        for (DanhMuc item : danhMucs) {
            result.add(toResponse(item));
        }

        return result;
    }

    @Override
    public DanhMucResponseDTO getById(Integer id) {

        DanhMuc danhMuc = danhMucRepository.findById(id).orElse(null);

        if (danhMuc == null) {
            return null;
        }

        return toResponse(danhMuc);
    }

    @Override
    public DanhMucResponseDTO create(DanhMucRequestDTO request) {

        DanhMuc danhMuc = new DanhMuc();

        danhMuc.setTenDanhMuc(request.getTenDanhMuc());

        DanhMuc saved = danhMucRepository.save(danhMuc);

        return toResponse(saved);
    }

    @Override
    public DanhMucResponseDTO update(Integer id, DanhMucRequestDTO request) {

        DanhMuc old = danhMucRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setTenDanhMuc(request.getTenDanhMuc());

        DanhMuc saved = danhMucRepository.save(old);

        return toResponse(saved);
    }

    @Override
    public void delete(Integer id) {
        danhMucRepository.deleteById(id);
    }

    private DanhMucResponseDTO toResponse(DanhMuc danhMuc) {

        DanhMucResponseDTO dto = new DanhMucResponseDTO();

        dto.setMaDanhMuc(danhMuc.getMaDanhMuc());
        dto.setTenDanhMuc(danhMuc.getTenDanhMuc());

        return dto;
    }
}