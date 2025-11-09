package visitor.visitor;

import visitor.element.Movie;
import visitor.element.Podcast;

public class DurationVisitor implements MediaVisitor {
    private double totalDuration = 0;

    @Override
    public void visit(Movie movie) {
        totalDuration += movie.getDuration();
    }

    @Override
    public void visit(Podcast podcast) {
        totalDuration += podcast.getEpisodeCount() * 0.5; // 30 мин на эпизод
    }

    public double getTotalDuration() {
        return totalDuration;
    }
}
