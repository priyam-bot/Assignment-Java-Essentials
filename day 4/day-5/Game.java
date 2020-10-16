package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the best cricketer?","What is the closest planet to sun?","Which country has best suits?"};
    String[] options1={"MS Dhoni","Earth","Germany"};
    String[] options2={"Virat Kholi","Venus","Australia"};
    String[] options3={"Sachin Tendulkar","Mercury","Italy"};
    String[] options4={"Gautam Gambhir","Jupiter","France"};
    int[] answers={1,3,3};


    public void initGame()
    {

        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }


        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Bahot hi unda khele hai aap!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Maaf karna mai aapki sahyata nahi kar sakta");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}
