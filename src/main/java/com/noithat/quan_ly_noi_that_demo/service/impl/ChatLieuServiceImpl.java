package com.noithat.quan_ly_noi_that_demo.service.impl;

import com.noithat.quan_ly_noi_that_demo.entity.ChatLieu;
import com.noithat.quan_ly_noi_that_demo.repository.ChatLieuRepository;
import com.noithat.quan_ly_noi_that_demo.service.ChatLieuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatLieuServiceImpl implements ChatLieuService {

    private final ChatLieuRepository chatLieuRepository;

    public ChatLieuServiceImpl(ChatLieuRepository chatLieuRepository) {
        this.chatLieuRepository = chatLieuRepository;
    }

    @Override
    public List<ChatLieu> getAll() {
        return chatLieuRepository.findAll();
    }

    @Override
    public ChatLieu getById(Integer id) {
        return chatLieuRepository.findById(id).orElse(null);
    }

    @Override
    public ChatLieu create(ChatLieu chatLieu) {
        return chatLieuRepository.save(chatLieu);
    }

    @Override
    public ChatLieu update(Integer id, ChatLieu chatLieu) {

        ChatLieu old = chatLieuRepository.findById(id).orElse(null);

        if (old == null) {
            return null;
        }

        old.setTenChatLieu(chatLieu.getTenChatLieu());

        return chatLieuRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        chatLieuRepository.deleteById(id);
    }
}