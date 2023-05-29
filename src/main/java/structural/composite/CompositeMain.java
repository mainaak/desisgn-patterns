package structural.composite;

import structural.composite.children.Button;
import structural.composite.children.Seeker;
import structural.composite.encapsulator.MediaPlayer;
import structural.composite.encapsulator.Netflix;
import structural.composite.encapsulator.Walkman;

public class CompositeMain {

    public static void main(String[] args) {

        MediaPlayer seeker = new Seeker();
        MediaPlayer button = new Button();

        Walkman player = new Walkman();
        player.addComponent(seeker);
        player.addComponent(button);

        MediaPlayer netflixSeeker = new Seeker();
        MediaPlayer netflixButton = new Button();

        Netflix netflix = new Netflix();
        netflix.addComponent(netflixSeeker);
        netflix.addComponent(netflixButton);

        player.addComponent(netflix);

        player.playMusic();
        player.stopMusic();
    }
}
