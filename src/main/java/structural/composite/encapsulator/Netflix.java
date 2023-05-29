package structural.composite.encapsulator;

import java.util.ArrayList;
import java.util.List;

public class Netflix implements MediaPlayer, Encapsulator {

    private volatile List<MediaPlayer> components;

    public Netflix() {
        components = new ArrayList<>();
    }

    @Override
    public void playMusic() {
        System.out.println("Playing on Netflix video player");
        components.forEach(MediaPlayer::playMusic);
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping on Netflix video player");
        components.forEach(MediaPlayer::stopMusic);
    }

    @Override
    public void addComponent(MediaPlayer component) {
        components.add(component);
    }

    @Override
    public void removeComponent(MediaPlayer component) {
        components.remove(component);
    }
}
