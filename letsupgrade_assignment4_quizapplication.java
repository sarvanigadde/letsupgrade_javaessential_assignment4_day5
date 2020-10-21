package com.quizApllication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Game game=new Game();
      game.initGame();
      game.play();
    }
}
public class Question {
    Scanner sc = new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;
    public boolean askQuestion(){
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("Please choose an option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;

        }
           return false;
    }
}
public class Players {
    Scanner sc = new Scanner(System.in);
    String name;
     int Score=0;
    public void getDetail() {
        System.out.println("name :");
        name = sc.nextLine();
    }
}
public class Game {

      Question[] questions=new Question[3];
      Players player=new Players();
     public void initGame() {

         for (int i = 0; i < 3; i++) {
             questions[i] = new Question();

         }
         questions[0].question="How is my fav hero?";
         questions[0].option1 = "ntr";
         questions[0].option2 = "nani";
         questions[0].option3 = "prabhas";
         questions[0].option4 = "mahesh";
         questions[0].correctAnswer = 1;
         questions[1].question="How is my fav colour?";
         questions[1].option1 = "black";
         questions[1].option2 = "red";
         questions[1].option3 = "pink";
         questions[1].option4 = "blue";
         questions[1].correctAnswer = 3;
         questions[2].question="How is my fav place?";
         questions[2].option1 = "goa";
         questions[2].option2 = "delhi";
         questions[2].option3 = "aaraku";
         questions[2].option4 = "mumbai";
         questions[2].correctAnswer = 1;
     }
         public void play () {


        player.getDetail();
        for(int i=0;i<3;i++){
           boolean status=questions[i].askQuestion();
            if(status==true){
                System.out.println("well done");
                player.Score++;
            }
            else{
                System.out.println("better luck next time");
            }
        }
             System.out.println(player.name+" your score is "+ player.Score);

         }

     }
   
