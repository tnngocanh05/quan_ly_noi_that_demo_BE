package com.noithat.quan_ly_noi_that_demo.repository;

import com.noithat.quan_ly_noi_that_demo.entity.HinhAnhSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HinhAnhSanPhamRepository extends JpaRepository<HinhAnhSanPham, Integer> {
}