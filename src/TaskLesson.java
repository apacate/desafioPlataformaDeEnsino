public class TaskLesson extends Lesson {
    private String description;
    private int questionCount;

    public TaskLesson(String title, String description, int questionCount) {
        super(title);
        this.description = description;
        this.questionCount = questionCount;
    }

    @Override
    public int duration() {
        return questionCount * 300; // Cada questão leva 5 minutos (300 segundos)
    }
}
