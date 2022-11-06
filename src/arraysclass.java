import java.util.Random;
import java.util.Scanner;

public class arraysclass {
    public static void main(String[] args) {
//Step 1_____________________________________________________________________________________
        Random random = new Random();
        Scanner in = new Scanner(System.in);


        int[] dataPoints = new int[100];
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = random.nextInt(100)+ 1;
        }

        for (int e = 0; e < dataPoints.length; e++){
            System.out.printf("Index: %5d Value: %5d     ", e, dataPoints[e]);
            if(e % 2 != 0){
                System.out.println("");
            }
        }

        for (int f = 0; f < dataPoints.length; f++){
            sum = dataPoints[f] + sum;
        }
        System.out.printf("\n Sum of all Index numbers combined: %5d", sum);

//Step 2 __________________________________________________________________________________
        int rangeOne;
        int rangeTwo;
        boolean foundOne = true;
        boolean foundTwo = true;
        int maximum = 0;
        int minimum = 101;
        int repeat = 0;
        double average = 0;
        double total = 0;
        rangeOne = SafeInput.getRangedInt(in, "Enter a number: ", 1, 100);


        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == rangeOne){
                repeat = repeat + 1;
                foundOne = false;
            }
        }
        if (foundOne){
            System.out.println("Your number was not found");
        }
        System.out.println("\n Number of times your number came up: " + repeat);


        rangeTwo = SafeInput.getRangedInt(in, "Enter a number: ", 1, 100);


        for (int f = 0; f < dataPoints.length; f++){
            if (dataPoints[f] == rangeTwo){
                System.out.println(rangeTwo + " was found at array: " + f);
                foundTwo = false;
                break;
            }
        }
        if (foundTwo){
            System.out.println("Your number was not found");
        }

        for (int g = 0; g < dataPoints.length; g++){
            //maximum
            if (dataPoints[g] > maximum){
                maximum = dataPoints[g];
            }
            //minimum
            if (dataPoints[g] < minimum){
                minimum = dataPoints[g];
            }
        }
        System.out.println("The maximum is: " + maximum);
        System.out.println("The minimum is: " + minimum);

        for (int h = 0; h < dataPoints.length; h++){
            total = total + dataPoints[h];
            average = total / 100;
        }
        System.out.println("The average is: " + average);


    }




}


