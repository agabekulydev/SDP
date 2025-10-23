package media.core;

public class BasicPlayer implements Player{
    @Override
    public void play(String source){
        System.out.println("Playing basic media: " + source);
    }
}
