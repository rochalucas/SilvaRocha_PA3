import java.security.SecureRandom;
import java.util.Scanner;

public class problem1 {

    public static double question(int type, int difficulty) {
        Scanner in = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        double average;
        int sum = 0;
        int index=0;

        int feedback;

        int num1=0;
        int num2=0;
        int ans=0;
        int input =0;
        int mix=0;

        while (index < 10) {

            if (difficulty == 1)
            {
                num1 = rand.nextInt(10);
                num2 = rand.nextInt(10);
            }

            else if (difficulty == 2)
            {
                num1 = rand.nextInt(100);
                num2 = rand.nextInt(100);
            }

            else if (difficulty == 3)
            {
                num1 = rand.nextInt(1000);
                num2 = rand.nextInt(1000);
            }
            else if (difficulty ==  4)
            {
                num1 = rand.nextInt(10000);
                num2 = rand.nextInt(10000);
            }

            if (type == 1)
            {
                ans =  num1 + num2;
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                input = in.nextInt();
            }

            else if (type == 2)
            {
                //the following implementation is made so that there will be
                //no negative numbers as answers
                if (num1 > num2)
                {
                    ans = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");
                    input = in.nextInt();
                }
                else
                {
                    ans =  num2 - num1;
                    System.out.println("How much is " + num2 + " minus " + num1 + "?");
                    input = in.nextInt();
                }

            }

            else if (type == 3)
            {
                ans =  num1 * num2;
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                input = in.nextInt();
            }

            else if (type == 4)
            {
                //the following implementation is made to make sure neither
                //the divisor nor the dividend is zero
                if (num1 == 0)
                    num1++;
                if (num2 == 0)
                    num2++;

                //The following implementation is made so that
                //the answers will always be integers
                int temp = num1 * num2;
                ans = temp / num2;
                System.out.println("How much is " + temp + " divided " + num2 + "?");
                input = in.nextInt();

            }


            else if (type == 5)
            {
                mix = rand.nextInt(4);
                if (mix == 0)
                {
                    ans =  num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");
                    input = in.nextInt();
                }
                else if (mix == 1)
                {
                    if (num1 > num2)
                    {
                        ans = num1 - num2;
                        System.out.println("How much is " + num1 + " minus " + num2 + "?");
                        input = in.nextInt();
                    }
                    else
                    {
                        ans =  num2 - num1;
                        System.out.println("How much is " + num2 + " minus " + num1 + "?");
                        input = in.nextInt();
                    }
                }
                else if (mix == 2)
                {
                    ans =  num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");
                    input = in.nextInt();
                }
                else if (mix == 3)
                {
                    if (num1 == 0)
                        num1++;
                    if (num2 == 0)
                        num2++;

                    int temp = num1 * num2;
                    ans = temp / num2;
                    System.out.println("How much is " + temp + " divided " + num2 + "?");
                    input = in.nextInt();
                }
            }

            if (ans != input) {
                feedback = rand.nextInt(4);
                switch (feedback) {
                    case 0:
                        System.out.println("Wrong. Please try again.");
                        break;
                    case 1:
                        System.out.println("No. Keep trying!");
                        break;
                    case 2:
                        System.out.println("That's not the correct answer. Please try again.");
                        break;
                    case 3:
                        System.out.println("That is incorrect.");
                        break;

                }
            }

            else {

            feedback = rand.nextInt(4);
            switch (feedback)
            {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Good job!");
                    break;
                case 2:
                    System.out.println("That's correct!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
            }
            sum++;

            }

            index++;
        }

        average =  (double) sum / 10.0 ;
        return average;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("What type of arithmetic problem would you like to practice?");
            System.out.println("\t1 : addition.\n\t2 : subtraction.\n\t3 : multiplication.\n\t4 : division." +
                               "\n\t5 : mix mode.\n\t6 : exit.");
            int type = in.nextInt();

            if (type == 6)
                break;

            System.out.println("Please enter the difficulty level: ");
            System.out.println("\t1 : easy.\n\t2 : medium.\n\t3 : hard.\n\t4 : extra hard.\n\t5 : exit");

            int difficulty = in.nextInt();

            if (difficulty == 5)
                break;


            double average = question(type, difficulty);

            System.out.printf("Your score is %.1f\n", average*100);

            if (average < 0.75)
                System.out.println("Please ask your teacher for extra help.");
            else
                System.out.println("Congratulations, you are ready to go to the next level!");
        }


    }

}


