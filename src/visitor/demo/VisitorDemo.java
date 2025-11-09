package visitor.demo;

import visitor.element.*;
import visitor.visitor.*;

import java.util.List;

public class VisitorDemo {
    public static void main(String[] args) {
        List<MediaElement> library = List.of(
                new Movie("Inception", "Christopher Nolan", 148),
                new Podcast("Java Talks", "Aidos", 10)
        );

        InfoVisitor infoVisitor = new InfoVisitor();
        DurationVisitor durationVisitor = new DurationVisitor();

        System.out.println("📀 Media Library Information:");
        library.forEach(media -> media.accept(infoVisitor));

        library.forEach(media -> media.accept(durationVisitor));
        System.out.println("\n⏱ Total Duration: " + durationVisitor.getTotalDuration() + " minutes");
    }
}
