package YouJube;

public class Database implements YouJube.Interfaces.Database {
    @Override
    public void store(Video video) {
        System.out.println("VideoTitle: " + video.getVideoTitle());
        System.out.println("Author: " + video.getVideoCreator());
        System.out.println("Length: " + video.getVideoLengthInMinutes());
    }
}
