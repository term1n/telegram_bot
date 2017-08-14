package ru.example;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by sbt-ismakaev on 14.08.17.
 */
public class TelegramBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        System.out.println("onUpdateReceived");

        if (update != null && update.hasMessage() && update.getMessage().hasText()) {
            String inputMessage = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            SendMessage sm = new SendMessage().setChatId(chatId).setText(inputMessage);
            try {
                sendMessage(sm);
            } catch (TelegramApiException ex) {
                ex.printStackTrace();
            }
        }

    }

    public String getBotUsername() {
        return "te4min_bot";
    }

    public String getBotToken() {
        return "204318271:AAEF3c_vY35XpsdTdB9xUqxwEU9yoCIuWyQ";
    }

    public void onClosing() {

    }
}
