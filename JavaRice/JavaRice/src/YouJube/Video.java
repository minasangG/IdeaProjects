package YouJube;

public class Video {
    private final String videoTitle;
    private final String videoCreator;
    private final int videoLengthInMinutes;

    public Video(String videoTitle, String videoCreator, int videoLengthInMinutes) {
        this.videoTitle = videoTitle;
        this.videoCreator = videoCreator;
        this.videoLengthInMinutes = videoLengthInMinutes;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoCreator() {
        return videoCreator;
    }

    public int getVideoLengthInMinutes() {
        return videoLengthInMinutes;
    }
}
