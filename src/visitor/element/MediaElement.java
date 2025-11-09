package visitor.element;

import visitor.visitor.MediaVisitor;

public interface MediaElement {
    void accept(MediaVisitor visitor);
}
