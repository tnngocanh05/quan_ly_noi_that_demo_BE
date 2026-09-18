package com.noithat.quan_ly_noi_that_demo.ai.controller;

import com.noithat.quan_ly_noi_that_demo.ai.dto.DesignRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.noithat.quan_ly_noi_that_demo.ai.service.GeminiService;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin("*")
public class AIController {

    @Autowired
    private GeminiService geminiService;

    @PostMapping("/design")
    public String design(@RequestBody DesignRequest request){

        String prompt = """
Bạn là chuyên gia thiết kế nội thất.

Hãy trả về JSON.

Loại phòng: %s

Diện tích: %.0f m2

Ngân sách: %.0f VNĐ

Phong cách: %s

Màu sắc: %s

Yêu cầu: %s

JSON gồm:

room

style

objects

Mỗi object gồm:

name

position

rotation

scale

Không giải thích.

Không markdown.

Chỉ JSON.
"""
                .formatted(
                        request.getLoaiPhong(),
                        request.getDienTich(),
                        request.getNganSach(),
                        request.getPhongCach(),
                        request.getMauSac(),
                        request.getYeuCau()
                );

        return geminiService.generateDesign(prompt);

    }

}