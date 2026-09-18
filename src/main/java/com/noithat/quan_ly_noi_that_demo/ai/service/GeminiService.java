package com.noithat.quan_ly_noi_that_demo.ai.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    @Autowired
    private Client client;

    public String generateDesign(String prompt) {

        try {

            GenerateContentResponse response =
                    client.models.generateContent(
                            "gemini-2.5-flash",
                            prompt,
                            null
                    );

            return response.text();

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException("Lỗi gọi Gemini: " + e.getMessage());

        }

    }

}