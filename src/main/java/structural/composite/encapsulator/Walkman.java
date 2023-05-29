package structural.composite.encapsulator;

import java.util.ArrayList;
import java.util.List;

public class Walkman implements MediaPlayer, Encapsulator {

    private final List<MediaPlayer> components;

    public Walkman() {
        components = new ArrayList<>();
    }

    @Override
    public void addComponent(MediaPlayer component) {
        components.add(component);
    }

    @Override
    public void removeComponent(MediaPlayer component) {
        components.remove(component);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing on Walkman player");
        components.forEach(MediaPlayer::playMusic);
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping on Walkman player");
        components.forEach(MediaPlayer::stopMusic);
    }
}
