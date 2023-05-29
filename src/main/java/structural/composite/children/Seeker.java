package structural.composite.children;

import structural.composite.encapsulator.MediaPlayer;

public class Seeker implements MediaPlayer {

    @Override
    public void playMusic() {
        System.out.println("Moving seeker from left to right.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping seeker at the current position.");
    }
}
