package ru.nikulin.TgBot.service;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.nikulin.TgBot.config.BotConfig;

@Component
public class TelegramBot extends TelegramLongPollingBot {

    final BotConfig config;

    public TelegramBot(BotConfig config){
        this.config = config;
    }

    @Override
    public String getBotUsername() {
        return null;

    }

    @Override
    public String getBotToken(){
        return null;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
