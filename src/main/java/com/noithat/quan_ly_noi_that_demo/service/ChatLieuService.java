package com.noithat.quan_ly_noi_that_demo.service;

import com.noithat.quan_ly_noi_that_demo.entity.ChatLieu;

import java.util.List;

public interface ChatLieuService {

    List<ChatLieu> getAll();

    ChatLieu getById(Integer id);

    ChatLieu create(ChatLieu chatLieu);

    ChatLieu update(Integer id, ChatLieu chatLieu);

    void delete(Integer id);
}