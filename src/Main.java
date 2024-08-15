import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Lesson> lessons = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int numberOfLessons = sc.nextInt();

        for (int i = 1; i <= numberOfLessons; i++) {
            System.out.println("Dados da " + i + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char type = sc.next().charAt(0);

            System.out.print("Título: ");
            sc.nextLine();  // Consumir a linha pendente
            String title = sc.nextLine();

            if (type == 'c') {
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int duration = sc.nextInt();
                lessons.add(new VideoLesson(title, url, duration));
            } else if (type == 't') {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();
                lessons.add(new TaskLesson(title, description, questionCount));
            }
        }

        // Calcula a duração total do curso
        int totalDuration = 0;
        for (Lesson lesson : lessons) {
            totalDuration += lesson.duration();
        }

        System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");
        sc.close();
    }
    }
