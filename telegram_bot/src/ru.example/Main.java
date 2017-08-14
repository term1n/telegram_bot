package ru.example;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by sbt-ismakaev on 14.08.17.
 */
public class Main {

    public static void main(String[] args) {
        // Initialize Api Context
        ApiContextInitializer.init();

        // TODO Instantiate Telegram Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // TODO Register our bot
        try {
            botsApi.registerBot(new TelegramBot());
        } catch (TelegramApiException ex) {
            ex.printStackTrace();
        }
    }
}
