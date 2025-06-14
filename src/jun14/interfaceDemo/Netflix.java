package jun14.interfaceDemo;

public class Netflix implements VideoPlayer{
    @Override
    public void forward() {
        System.out.println("Netflix is fast forwarding");
    }

    @Override
    public void pause() {
        System.out.println("Netflix is pausing");
    }

    @Override
    public void play() {
        System.out.println("Netflix is playing");
    }

    @Override
    public void rewind() {
        System.out.println("Netflix is rewinding");
    }

    @Override
    public void speed() {
        System.out.println("Netflix is playing at 2x speed");
    }

    @Override
    public void stop() {
        System.out.println("Netflix has stopped");
    }
}
