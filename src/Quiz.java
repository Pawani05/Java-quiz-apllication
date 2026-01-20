import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        question[] questions = new question[3];

        questions[0] = new question(
            "Which language is used for Android development?",
            "A. Python", "B. Java", "C. C++", "D. PHP", 'B'
        );

        questions[1] = new question(
            "Which keyword is used to inherit a class in Java?",
            "A. this", "B. super", "C. extends", "D. implement", 'C'
        );

        questions[2] = new question(
            "Which method is the entry point of Java program?",
            "A. start()", "B. run()", "C. main()", "D. init()", 'C'
        );

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ". " + questions[i].question);
            System.out.println(questions[i].option1);
            System.out.println(questions[i].option2);
            System.out.println(questions[i].option3);
            System.out.println(questions[i].option4);
            System.out.print("Enter your answer (A/B/C/D): ");

            char answer = sc.next().toUpperCase().charAt(0);
            if (answer == questions[i].correctAnswer) {
                score++;
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}
