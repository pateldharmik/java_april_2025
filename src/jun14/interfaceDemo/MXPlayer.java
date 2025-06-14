package jun14.interfaceDemo;

public class MXPlayer implements AudioPlayer,VideoPlayer{
    @Override
    public void forward() {
        System.out.println("MXPlayer is fast forwarding");
    }

    @Override
    public void pause() {
        System.out.println("MXPlayer is pausing");
    }

    @Override
    public void play() {
        System.out.println("MXPlayer is playing");
    }

    @Override
    public void rewind() {
        System.out.println("MXPlayer is rewinding");
    }

    @Override
    public void speed() {
        System.out.println("MXPlayer is playing at 2x speed");
    }

    @Override
    public void stop() {
        System.out.println("MXPlayer has stopped");
    }

    public void callingAll(){
        play();
        pause();
        forward();
        rewind();
        speed();
        stop();
    }
}
