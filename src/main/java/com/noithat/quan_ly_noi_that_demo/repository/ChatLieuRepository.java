package com.noithat.quan_ly_noi_that_demo.repository;

import com.noithat.quan_ly_noi_that_demo.entity.ChatLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatLieuRepository extends JpaRepository<ChatLieu, Integer> {
}