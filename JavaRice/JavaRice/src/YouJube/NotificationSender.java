package YouJube;

public class NotificationSender implements YouJube.Interfaces.NotificationSender {
    @Override
    public void sendMessage(Video video) {
        System.out.println("Video sent to: " + video.getVideoCreator());
    }
}
