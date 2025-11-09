package visitor.element;

import visitor.visitor.MediaVisitor;

public class Movie implements MediaElement {
    private final String title;
    private final String director;
    private final double duration;

    public Movie(String title, String director, double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public double getDuration() { return duration; }

    @Override
    public void accept(MediaVisitor visitor) {
        visitor.visit(this);
    }
}
