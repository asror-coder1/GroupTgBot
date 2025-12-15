package group_tg;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Mybot extends TelegramLongPollingBot {
    MyBotService myBotService = new MyBotService();
    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage()&&update.getMessage().hasText()){
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

//            foydalanuvchidan ma'lumot olish

            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();

            if (text.equals("/start")){
                try {
                    execute(myBotService.Language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }

    @Override
    public String getBotUsername() {
        return "";
    }




    @Override
    public String getBotToken() {

        return "";
    }
}
