//quiz game 

import java.util.Scanner;
import java.util.Stack;

public class quizgame {
    public static void main(String[] args) {
        System.out.println("Welcome to our Quiz game !");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=sc.next();

        System.out.println();

        String q1=" 1. Who is the prime minister of india. ?\n"
                +" (a) Narendra modi\n (b) Amit shah\n (c) Yogi\n (d) rajnath singh\n";

        String q2=" 2. who is the president of india. ?\n"
                +" (a) Nirmala sitaraman\n (b) ram nayik\n (c) Draupadi murmu\n (d) smriti irani\n";

        String q3=" 3. capital of india before new delhi. ?\n"
                +" (a) chennai\n (b) kolkata\n (c) mumbai\n (d) bengaluru\n";

        String q4=" 4. what is the national game of india. ?\n"
                +" (a) football\n (b) cricket\n (c) NoOne\n (d) hockey\n";

        String q5=" 5. Article 17 says. ?\n"
                +" (a) child labour\n (b) untouchability\n (c) discrimination\n (d) fundamental rights\n";

        question[] questions={
                new question(q1,"a"),
                new question(q2,"c"),
                new question(q3,"b"),
                new question(q4,"c"),
                new question(q5,"b"),

        };
        taketest(questions);

        System.out.println("Thank you "+name+" for playing quiz. ");

    }

    public static void taketest(question [] questions){
        int score=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer=sc.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println(" You got  "+score+ "/ "+questions.length);

    }

}
