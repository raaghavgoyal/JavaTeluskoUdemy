package S3L66Project1;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService(){
        questions[0] = new Question(1,"Which of the languages was founded in  1985? ",
        "Java","Cpp","Python","C#","Java");
        questions[1] = new Question(2, "size of int", "2", "6", "4", "8", "4");
        questions[2] = new Question(3, "size of double", "2", "6", "4", "8", "8");
        questions[3] = new Question(4, "size of char", "2", "6", "4", "8", "2");
        questions[4] = new Question(5, "size of long", "1", "6", "4", "8", "8");

    }

    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.println("Question no. : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }
        for(String s: selection){
            System.out.println(s);
        }
    }
    public void printScore(){
        int score = 0;
        for(int i = 0; i<questions.length; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
                System.out.println("act answer: "+ actualAnswer);
            }
        }
        System.out.println("Your score is : "+score);
    }

}
