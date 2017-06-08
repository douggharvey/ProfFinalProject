package com.douglasharvey.android.myphotolibrary.chat;

import com.douglasharvey.android.myphotolibrary.chat.events.ChatEvent;


public interface ChatPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void setChatRecipient(String recipient);

    void sendMessage(String msg);
    void onEventMainThread(ChatEvent event);


}
