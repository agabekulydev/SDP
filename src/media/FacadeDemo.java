package media;

import media.facade.MediaFacade;

public class FacadeDemo {
    public static void main(String[] args) {

        MediaFacade mediaFacade = new MediaFacade();


        mediaFacade.play("song.mp3");


        mediaFacade.play("song.mp3");


        mediaFacade.play("movie.mp4");
    }
}
