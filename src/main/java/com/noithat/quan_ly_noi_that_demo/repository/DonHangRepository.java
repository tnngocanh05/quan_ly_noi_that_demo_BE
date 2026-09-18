package com.noithat.quan_ly_noi_that_demo.repository;

import com.noithat.quan_ly_noi_that_demo.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonHangRepository
        extends JpaRepository<DonHang, Integer> {
}