public class VideoLesson extends Lesson {
    private String url;
    private int durationInSeconds;

    public VideoLesson(String title, String url, int durationInSeconds) {
        super(title);
        this.url = url;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public int duration() {
        return durationInSeconds; // Duração é a própria duração do vídeo
    }
}
