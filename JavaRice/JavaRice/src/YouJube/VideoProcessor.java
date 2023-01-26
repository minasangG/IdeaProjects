package YouJube;

import YouJube.Interfaces.Database;
import YouJube.Interfaces.NotificationSender;
import YouJube.Interfaces.Encoder;

public class VideoProcessor {
    private final Database database;
    private final Encoder encoder;
    private final NotificationSender notificationSender;

    public VideoProcessor(Database database, Encoder encoder, NotificationSender notificationSender) {
        this.database = database;
        this.encoder = encoder;
        this.notificationSender = notificationSender;
    }

    public void process(Video video) {
        database.store(video);
        encoder.encode();
        notificationSender.sendMessage(video);

    }
}
