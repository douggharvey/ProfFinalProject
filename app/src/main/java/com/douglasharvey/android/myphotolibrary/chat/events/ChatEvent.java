package com.douglasharvey.android.myphotolibrary.chat.events;

import com.douglasharvey.android.myphotolibrary.chat.entities.ChatMessage;


public class ChatEvent {
    ChatMessage msg;

    public ChatEvent(ChatMessage msg) {
        this.msg = msg;
    }

    public ChatMessage getMessage() {
        return msg;
    }
}
