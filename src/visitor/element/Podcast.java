package visitor.element;

import visitor.visitor.MediaVisitor;

public class Podcast implements MediaElement {
    private final String title;
    private final String host;
    private final int episodeCount;

    public Podcast(String title, String host, int episodeCount) {
        this.title = title;
        this.host = host;
        this.episodeCount = episodeCount;
    }

    public String getTitle() { return title; }
    public String getHost() { return host; }
    public int getEpisodeCount() { return episodeCount; }

    @Override
    public void accept(MediaVisitor visitor) {
        visitor.visit(this);
    }
}
