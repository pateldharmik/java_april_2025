package jun14.interfaceDemo;

public class VLCMediaPlayer implements AudioPlayer,VideoPlayer{
    @Override
    public void forward() {
        System.out.println("VLC Media Player is fast forwarding");
    }

    @Override
    public void pause() {
        System.out.println("VLC Media Player is pausing");
    }

    @Override
    public void play() {
        System.out.println("VLC Media Player is playing");
    }

    @Override
    public void rewind() {
        System.out.println("VLC Media Player is rewinding");
    }

    @Override
    public void speed() {
        System.out.println("VLC Media Player is playing at 2x speed");
    }

    @Override
    public void stop() {
        System.out.println("VLC Media Player has stopped");
    }
}
