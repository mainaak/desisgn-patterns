package structural.composite.children;

import structural.composite.encapsulator.MediaPlayer;

public class Button implements MediaPlayer {

    @Override
    public void playMusic() {
        System.out.println("Setting button to pause sign.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Setting button to play sign.");
    }

}
