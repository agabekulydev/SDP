package media.facade;

import media.subsystems.Cache;
import media.subsystems.Decoder;
import media.subsystems.PlayerEngine;

public class MediaFacade {
    private final Cache cache;
    private final Decoder decoder;
    private final PlayerEngine playerEngine;

    public MediaFacade() {
        this.cache = new Cache();
        this.decoder = new Decoder();
        this.playerEngine = new PlayerEngine();
    }

    public void play(String filename) {

        if (cache.isCached(filename)) {
            System.out.println("Fetching from cache...");
            playerEngine.play(cache.getFromCache(filename));
        } else {

            String decoded = decoder.decode(filename);
            cache.addToCache(filename, decoded);
            playerEngine.play(decoded);
        }
    }
}
