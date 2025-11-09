package visitor.visitor;

import visitor.element.Movie;
import visitor.element.Podcast;

public interface MediaVisitor {
    void visit(Movie movie);
    void visit(Podcast podcast);
}
