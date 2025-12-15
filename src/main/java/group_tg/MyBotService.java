package group_tg;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    public SendMessage Language(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("assalomu aleykum hurmatli mijoz botimizga hush kelibsiz!!!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFFUzbek");
        button.setCallbackData("UzbektiliId");
        row.add(button);
        rowList.add(row);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDF8English");
        button.setCallbackData("EnglishtiliId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }









}
