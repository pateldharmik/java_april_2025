package jun14.interfaceDemo;

public class YoutubeMusic implements AudioPlayer, VideoPlayer {
    @Override
    public void forward() {
        System.out.println("YouTubeMusic is fast forwarding");
    }

    @Override
    public void pause() {
        System.out.println("YouTubeMusic is pausing");
    }

    @Override
    public void play() {
        System.out.println("YouTubeMusic is playing");
    }

    @Override
    public void rewind() {
        System.out.println("YouTubeMusic is rewinding");
    }

    @Override
    public void speed() {
        System.out.println("YouTubeMusic is playing at 2x speed");
    }

    @Override
    public void stop() {
        System.out.println("YouTubeMusic has stopped");
    }
}
