import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

 class Quiz {
     static int score = 0;
     static int totalnoofquestion = 5;
     static int questionnumber = 0;

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int time = 10; // Timer set for 30 seconds

            @Override
            public void run() {
                if (time > 0) {
                    System.out.println(+ time + " seconds");
                    time--;
                } else {
                    System.out.println(" oops time's over!");
                    timer.cancel();
                    display();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); 

        start();
    }

    private static void start() {
        String[] questions = {
                "What is the full form of JVM?",
                "Who invented java?",
                "What is the full form of JDBC?",
                "What is the full form of oop in java?",
                "how many drivers are there in jdbc?"
        };
        String[] answers = {"java virtual machine", "James Gosling", "java database connectivity", "object oriented programming", "4"};

        Scanner scanner = new Scanner(System.in);

        while (questionnumber < totalnoofquestion) {
            System.out.println(questions[questionnumber]);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(answers[questionnumber])) {
                System.out.println("correct answer!");
                score++;
            } else {
                System.out.println("wrong! The answer is: " + answers[questionnumber]);
            }
            questionnumber++;
        }

        display();
    }

    private static void display() {
        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + "/" + totalnoofquestion);
    }
}
