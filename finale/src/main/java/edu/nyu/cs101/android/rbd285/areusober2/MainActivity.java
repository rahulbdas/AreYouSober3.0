package edu.nyu.cs101.android.rbd285.areusober2;
//edu.nyu.cs101.android.rbd285.areusober2

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import java.util.Random;


/**this app lets you take a quiz of 10 questions to see if you are sober enough to drive or not
 *
 *
 * @author rahuldas
 *
 * @version 2.3
 */
public class MainActivity extends AppCompatActivity {


//creating variables so that we can hold them later
    private Questions mquest = new Questions();

    private TextView mScore;
    private TextView mquestion;

    private String manswer;

    private Button mchoice1;
    private Button mchoice2;
    private Button mchoice3;
    private Button mchoice4;

    private int mscore1 = 0;

    int s = 21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiates the array list





//instattiating these variables so they can be used later on
        mScore = (TextView) findViewById(R.id.score);
        mquestion = (TextView) findViewById(R.id.quest);

        mchoice1 = (Button) findViewById(R.id.choice1);
        mchoice2 = (Button) findViewById(R.id.choice2);
        mchoice3 = (Button) findViewById(R.id.choice3);
        mchoice4 = (Button) findViewById(R.id.choice4);

        nextquest(mscore1);

        /**
         * this will determine if the button pressed was the correct answer
         * it will increase the score by 1
         * and it will go on to the next question
         *
         * if the score is woring it will tell you and go on to the next question
         */

        mchoice1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (mchoice1.getText() == manswer) {
                    mscore1++;
                    newscore(mscore1);
                    nextquest(mscore1);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    nextquest(mscore1);



                }
            }


        });

        /**
         * this will determine if the button pressed was the correct answer
         * it will increase the score by 1
         * and it will go on to the next question
         */

        mchoice2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (mchoice2.getText() == manswer) {
                    mscore1++;
                    newscore(mscore1);
                    nextquest(mscore1);

                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    nextquest(mscore1);


                }
            }


        });

        /**
         * this will determine if the button pressed was the correct answer
         * it will increase the score by 1
         * and it will go on to the next question
         */

        mchoice3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (mchoice3.getText().equals(manswer)) {
                    mscore1++;
                    newscore(mscore1);
                    nextquest(mscore1);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    nextquest(mscore1);

                }
            }


        });

        /**
         * this will determine if the button pressed was the correct answer
         * it will increase the score by 1
         * and it will go on to the next question
         *
         */

        mchoice4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (mchoice4.getText().equals(manswer)) {
                    mscore1++;
                    //change the score
                    newscore(mscore1);

                    //next question
                    nextquest(mscore1);

                    //show the score on the screen
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    nextquest(mscore1);

                }
            }


        });



    }

    /**
     * this will show the score on the screen
     *
     * @param score1 this will take in the original score
     */

    private void newscore(int score1) {
        mScore.setText("" + mscore1);
    }

    /**
     * this will move on to the next question
     * there will only be 10 questions asked to the user out of the bank of 20
     * the randomness is a little confusing, basically if the quesiton is used, it will change the array in the questions clss
     *
     *
     */

    public void nextquest(int score1) {

//instantiate random vairable
        Random rand = new Random();


        if (s > 10) {


            //int c = rand.nextInt(list.lenght());



            //int x = num.get(c);
           // while (num2.contains(x)){
              // c = rand.nextInt(num.size());
              //  x = num.get(c);

           // }
            //num2.add(x);




            //num.get(x);

            int x = mquest.random();




            mquestion.setText(mquest.getquestion(x));
            mchoice1.setText(mquest.getChoice1(x));
            mchoice2.setText(mquest.getChoice2(x));
            mchoice3.setText(mquest.getChoice3(x));
            mchoice4.setText(mquest.getChoice4(x));
            manswer = mquest.getanswer(x);
            //num.remove(c);

            //mquest.delquestion(x);
            s = s - 1;


        } else {

            double mscore = mscore1 / 10.0;

            mquestion.setText("Press any two buttons to see if it is safe for you to drive.");


            if (mscore > .7) {
                Toast.makeText(MainActivity.this, "You have Passed! You can drive", Toast.LENGTH_SHORT).show();

            } else {

                Toast.makeText(MainActivity.this, "You are too drunk to drive. Call a taxi.", Toast.LENGTH_SHORT).show();
            }

        }
    }
}

