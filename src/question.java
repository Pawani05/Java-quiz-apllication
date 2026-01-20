public class question {
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    char correctAnswer;

    public question(String q, String o1, String o2, String o3, String o4, char ans) {
        question = q;
        option1 = o1;
        option2 = o2;
        option3 = o3;
        option4 = o4;
        correctAnswer = ans;
    }
}
