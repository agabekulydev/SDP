package media;

import media.core.Player;
import media.core.BasicPlayer;
import media.decorator.LoggingDecorator;
import media.decorator.EqualizerDecorator;

public class Demo {
    public static void main(String[] args) {

        // ===== Decorator =====
        Player basicPlayer = new BasicPlayer();
        Player loggedPlayer = new LoggingDecorator(basicPlayer); // Декорируем логированием
        Player eqLoggedPlayer = new EqualizerDecorator(loggedPlayer); // Добавляем эквалайзер

        eqLoggedPlayer.play("song.mp3");
    }
}
