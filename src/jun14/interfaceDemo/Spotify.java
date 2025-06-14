package jun14.interfaceDemo;

public class Spotify implements AudioPlayer{
    @Override
    public void forward() {
        System.out.println("Spotify is fast forwarding");
    }

    @Override
    public void pause() {
        System.out.println("Spotify is pausing");
    }

    @Override
    public void play() {
        System.out.println("Spotify is playing");
    }

    @Override
    public void rewind() {
        System.out.println("Spotify is rewinding");
    }

    @Override
    public void speed() {
        System.out.println("Spotify is playing at 2x speed");
    }

    @Override
    public void stop() {
        System.out.println("Spotify has stopped");
    }
}
