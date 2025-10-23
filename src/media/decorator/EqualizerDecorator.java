package media.decorator;

import media.core.Player;


public class EqualizerDecorator extends PlayerDecorator {

    public EqualizerDecorator(Player wrappee) {
        super(wrappee);
    }

    @Override
    public void play(String source) {

        System.out.println("[EQ] Adding equalizer to: " + source);
        wrappee.play(source);
    }
}
