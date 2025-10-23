package media.decorator;

import media.core.Player;

/**
 * Декоратор, который добавляет логирование для плеера.
 */
public class LoggingDecorator extends PlayerDecorator {

    public LoggingDecorator(Player wrappee) {
        super(wrappee);
    }

    @Override
    public void play(String source) {

        System.out.println("[LOG] Playing: " + source);
        wrappee.play(source);
    }
}
