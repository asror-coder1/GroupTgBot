package group_tg;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    public SendMessage menu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Bo'limni tanlang");

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);

        KeyboardRow r1 = new KeyboardRow();
        r1.add("\uD83D\uDCDA Kitoblar");
        r1.add("⭐\uFE0F Sevimlilar");


        KeyboardRow r2 = new KeyboardRow();
        r2.add("\uD83D\uDD0D Qidirish");
        r2.add("ℹ\uFE0F Bot haqida");

        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(r1);
        rows.add(r2);
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(markup);
        return sendMessage;
    }



}


