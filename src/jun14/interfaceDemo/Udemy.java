package jun14.interfaceDemo;

public class Udemy implements AudioPlayer,VideoPlayer{
    @Override
    public void forward() {
        System.out.println("Udemy is fast forwarding");
    }

    @Override
    public void pause() {
        System.out.println("Udemy is pausing");
    }

    @Override
    public void play() {
        System.out.println("Udemy is playing");
    }

    @Override
    public void rewind() {
        System.out.println("Udemy is rewinding");
    }

    @Override
    public void speed() {
        System.out.println("Udemy is playing at 2x speed");
    }

    @Override
    public void stop() {
        System.out.println("Udemy has stopped");
    }
}
