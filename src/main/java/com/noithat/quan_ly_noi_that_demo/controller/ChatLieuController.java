package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.ChatLieu;
import com.noithat.quan_ly_noi_that_demo.service.ChatLieuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat-lieu")
public class ChatLieuController {

    private final ChatLieuService chatLieuService;

    public ChatLieuController(ChatLieuService chatLieuService) {
        this.chatLieuService = chatLieuService;
    }

    @GetMapping
    public List<ChatLieu> getAll() {
        return chatLieuService.getAll();
    }

    @GetMapping("/{id}")
    public ChatLieu getById(@PathVariable Integer id) {
        return chatLieuService.getById(id);
    }

    @PostMapping
    public ChatLieu create(@RequestBody ChatLieu chatLieu) {
        return chatLieuService.create(chatLieu);
    }

    @PutMapping("/{id}")
    public ChatLieu update(
            @PathVariable Integer id,
            @RequestBody ChatLieu chatLieu) {

        return chatLieuService.update(id, chatLieu);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        chatLieuService.delete(id);
    }
}