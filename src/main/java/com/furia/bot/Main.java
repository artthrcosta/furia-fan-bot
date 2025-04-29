package com.furia.bot;

import com.furia.bot.FuriaFanBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new FuriaFanBot());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
