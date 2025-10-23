package media.decorator;

import media.core.Player;


public abstract class PlayerDecorator implements Player {
    protected final Player wrappee;


    public PlayerDecorator(Player wrappee) {
        this.wrappee = wrappee;
    }
}
