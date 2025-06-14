package jun14.interfaceDemo;

public class YouTube implements AudioPlayer,VideoPlayer{
    @Override
    public void forward() {
        System.out.println("YouTube is fast forwarding");
    }

    @Override
    public void pause() {
        System.out.println("YouTube is pausing");
    }

    @Override
    public void play() {
        System.out.println("YouTube is playing");
    }

    @Override
    public void rewind() {
        System.out.println("YouTube is rewinding");
    }

    @Override
    public void speed() {
        System.out.println("YouTube is playing at 2x speed");
    }

    @Override
    public void stop() {
        System.out.println("YouTube has stopped");
    }
}
