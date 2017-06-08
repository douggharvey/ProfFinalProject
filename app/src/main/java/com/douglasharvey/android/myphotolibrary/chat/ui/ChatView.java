package com.douglasharvey.android.myphotolibrary.chat.ui;

import com.douglasharvey.android.myphotolibrary.chat.entities.ChatMessage;


public interface ChatView {
    void sendMessage();
    void onMessageReceived(ChatMessage msg);
}
