package edu.nyu.cs101.android.rbd285.areusober2;

import java.util.Random;


public class Questions {


    //these are all the quesitons that will be asked

    private int[] newlist = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


    private String Questions[] = {
            "What is 7 x 3 ?",
            "What is 9 x 8 ?",
            "What is the capital of the USA?",
            "How many sides are in an Octagon?",
            "What is the capital of Russia?",
            "How many sides does a circle have?",
            "What month comes after July?",
            "How many days are in October?",
            "What color is the White House?",
            "Who is the current president of the USA?",
            "How many inches in a foot?",
            "What is 8 + 3 + 3 x 4 ?",
            "If your going 80 miles per hour, how long does it take you to get 80 miles?",
            "How many weeks in a year?",
            "How many days in a year?",
            "If your going 40 miles per hour, how long does it take you to get 80 miles?",
            "If your going 10 miles per hour, how long does it take you to get 80 miles?",
            "Which color is not a primary color?",
            "What is 2 x 3.6 ?",
            "What is 4 x 4 - 4 x 4 ?",


    };

//these are the answer choices

    private String[][] choices = {
            {"10", "21", "45", "34"},
            {"72", "73", "77", "80"},
            {"Toronto", "Washington D.C", "Atlanta", "NYC"},
            {"6", "7", "4", "8"},
            {"Paris", "St. Petersburg", "Moscow", "Atlanta"},
            {"6", "0", "2", "1"},
            {"August", "June", "May", "January"},
            {"31", "21", "29", "30"},
            {"Green", "Black", "Yellow", "White"},
            {"Beyonce", "Hillary Clinton", "Donald Trump", "Obama"},
            {"12", "8", "10", "100"},
            {"23", "24", "25", "22"},
            {".5", "1", "2", "2.5"},
            {"52", "49", "44", "53"},
            {"365", "370", "366", "364"},
            {"2", "2.5", "3", "2.25"},
            {"8.5", "5", "7.5", "8"},
            {"Red", "Brown", "Blue", "Yellow"},
            {"7.2", "7.1", "7", "7.3"},
            {"24", "0", "6", "32"}
    };


    //these are the actual answers
    private String[] answers = {"21", "72", "Washington D.C.", "8", "Moscow", "0", "August", "31", "White", "Donald Trump", "12", "23", "1", "52", "365", "2", "8", "Brown", "7.2", "0"};


    /**
     * this will get the quesion in the array of questions
     *
     * @param x; index
     * @return the question at index x
     */
    public String getquestion(int x) {

        String quest = Questions[x];
        return quest;
    }

    /**
     * this will return the answer choices for the questio
     *
     * @param x this is the integer of the location of the answer choices
     * @return the first choice
     */
    public String getChoice1(int x) {

        String choice1 = choices[x][0];
        return choice1;

    }


    /**
     * this will return the answer choices for the questio
     *
     * @param x this is the integer of the location of the answer choices
     * @return the second choice
     */
    public String getChoice2(int x) {

        String choice2 = choices[x][1];
        return choice2;

    }

    /**
     * this will return the answer choices for the questio
     *
     * @param x this is the integer of the location of the answer choices
     * @return the third choice
     */
    public String getChoice3(int x) {

        String choice3 = choices[x][2];
        return choice3;

    }

    /**
     * this will return the answer choices for the questio
     *
     * @param x this is the integer of the location of the answer choices
     * @return the fourth choice
     */
    public String getChoice4(int x) {

        String choice4 = choices[x][3];
        return choice4;

    }

    /**
     * this will get the answer
     *
     * @param x
     * @return a stirng of the anser
     */

    public String getanswer(int x) {
        String s = answers[x];
        return s;


    }

    /**
     * this is for the validation of the questions so that the questions do not repeat
     * this makes the already used integer into a null, and then there is validation against not picking a null value
     *
     * @param x
     */

    public void delquestion(int x) {

        String[] Questions2 = new String[20];

        for (int s = 0; s < getQuestions().length; s++) {

            if (s == x) {

                Questions2[x] = null;

            } else {
                Questions2[s] = Questions[s];

            }
        }

        Questions = Questions2;


    }

    /**
     * this is a getter for choices
     *
     * @return a string [][] 2d array
     */

    public String[][] getChoices() {

        return choices;

    }

    /**
     * this is a getter for the answers
     *
     * @return a string[]
     */

    public String[] getAnswers() {

        return answers;

    }

    /**
     * this is a getter for the questions
     *
     * @return a string array
     */
    public String[] getQuestions() {

        return Questions;
    }

    /**
     * this randmozies the questions asked so ne questions repeats itself,
     * basically uses an array full of 20 0's and changes each 0 to a 1 if that has been used
     *
     * @return
     */

    public int random() {

        Random rand = new Random();
        int c = 0;


        int d = rand.nextInt(20);


        if (newlist[d] == 0) {
            c = d;
            newlist[d] = 1;

        } else {
            boolean f = true;
            while (f) {

                d = rand.nextInt(20);
                if (newlist[d] == 0) {
                    c = d;
                    newlist[d] = 1;
                    f = false;


                }


            }


        }
        return c;

    }
}
