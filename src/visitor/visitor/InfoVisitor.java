package visitor.visitor;

import visitor.element.Movie;
import visitor.element.Podcast;

public class InfoVisitor implements MediaVisitor {
    @Override
    public void visit(Movie movie) {
        System.out.println("🎬 Movie: " + movie.getTitle() +
                " directed by " + movie.getDirector() +
                " (" + movie.getDuration() + " min)");
    }

    @Override
    public void visit(Podcast podcast) {
        System.out.println("🎙 Podcast: " + podcast.getTitle() +
                " hosted by " + podcast.getHost() +
                " [" + podcast.getEpisodeCount() + " episodes]");
    }
}
