package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.dto.request.SanPhamRequestDTO;
import com.noithat.quan_ly_noi_that_demo.dto.response.SanPhamResponseDTO;
import com.noithat.quan_ly_noi_that_demo.entity.SanPham;
import com.noithat.quan_ly_noi_that_demo.repository.SanPhamRepository;
import com.noithat.quan_ly_noi_that_demo.service.SanPhamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SanPhamServiceImpl implements SanPhamService {

    private final SanPhamRepository sanPhamRepository;

    public SanPhamServiceImpl(SanPhamRepository sanPhamRepository) {
        this.sanPhamRepository = sanPhamRepository;
    }

    @Override
    public List<SanPhamResponseDTO> getAll() {

        return sanPhamRepository.findAll()
                .stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SanPhamResponseDTO getById(Integer id) {

        SanPham sanPham = sanPhamRepository
                .findById(id)
                .orElse(null);

        if (sanPham == null) {
            return null;
        }

        return convertToResponseDTO(sanPham);
    }

    @Override
    public SanPhamResponseDTO create(SanPhamRequestDTO request) {

        SanPham sanPham = new SanPham();

        sanPham.setTenSanPham(request.getTenSanPham());
        sanPham.setGia(request.getGia());
        sanPham.setMoTa(request.getMoTa());
        sanPham.setMaThuongHieu(request.getMaThuongHieu());
        sanPham.setMaDanhMuc(request.getMaDanhMuc());
        sanPham.setMaLoaiPhong(request.getMaLoaiPhong());
        sanPham.setMaChatLieu(request.getMaChatLieu());

        SanPham savedSanPham = sanPhamRepository.save(sanPham);

        return convertToResponseDTO(savedSanPham);
    }

    @Override
    public SanPhamResponseDTO update(
            Integer id,
            SanPhamRequestDTO request) {

        SanPham sanPham = sanPhamRepository
                .findById(id)
                .orElse(null);

        if (sanPham == null) {
            return null;
        }

        sanPham.setTenSanPham(request.getTenSanPham());
        sanPham.setGia(request.getGia());
        sanPham.setMoTa(request.getMoTa());
        sanPham.setMaThuongHieu(request.getMaThuongHieu());
        sanPham.setMaDanhMuc(request.getMaDanhMuc());
        sanPham.setMaLoaiPhong(request.getMaLoaiPhong());
        sanPham.setMaChatLieu(request.getMaChatLieu());

        SanPham updatedSanPham =
                sanPhamRepository.save(sanPham);

        return convertToResponseDTO(updatedSanPham);
    }

    @Override
    public void delete(Integer id) {
        sanPhamRepository.deleteById(id);
    }

    // Entity → ResponseDTO
    private SanPhamResponseDTO convertToResponseDTO(SanPham sanPham) {

        SanPhamResponseDTO response = new SanPhamResponseDTO();

        response.setMaSanPham(sanPham.getMaSanPham());
        response.setTenSanPham(sanPham.getTenSanPham());
        response.setGia(sanPham.getGia());
        response.setMoTa(sanPham.getMoTa());
        response.setMaThuongHieu(sanPham.getMaThuongHieu());
        response.setMaDanhMuc(sanPham.getMaDanhMuc());
        response.setMaLoaiPhong(sanPham.getMaLoaiPhong());
        response.setMaChatLieu(sanPham.getMaChatLieu());

        return response;
    }
}