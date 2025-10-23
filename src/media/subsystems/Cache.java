package media.subsystems;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private final Map<String, String> cache = new HashMap<>();

    public boolean isCached(String filename) {
        return cache.containsKey(filename);
    }

    public void addToCache(String filename, String content) {
        cache.put(filename, content);
    }

    public String getFromCache(String filename) {
        return cache.get(filename);
    }
}
