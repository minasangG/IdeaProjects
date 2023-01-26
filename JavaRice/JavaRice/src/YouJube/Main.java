package YouJube;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String videoTitle = InputReader.readText("Enter Video Title: ");
        String videoCreator = InputReader.readText("Enter Video Creator: ");
        int lengthInMinutes = InputReader.readNumber("Enter Video Length: ");

        Video video = new Video(videoTitle, videoCreator, lengthInMinutes);
        VideoProcessor videoProcessor = new VideoProcessor
                (new Database(), new Encoder(), new NotificationSender());
        videoProcessor.process(video);
    }
}
