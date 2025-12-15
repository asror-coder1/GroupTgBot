package group_tg;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

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

        }
    }

    @Override
    public String getBotUsername() {
        return "shopping111Bot";
    }




    @Override
    public String getBotToken() {

        return "7772292896:AAGZhKZ4_4x9JGnxy98AEo8Xcgj9dx4Kh_A";
    }
}
