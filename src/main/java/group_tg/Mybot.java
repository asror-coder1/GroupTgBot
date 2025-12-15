package group_tg;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Mybot extends TelegramLongPollingBot {
    MyBotService myBotService = new MyBotService();
    @Override
    public void onUpdateReceived(Update update) {

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
