public class Loops {
    public static void main(String[] args) {
        for (int i =50; i<=55; i++) {
            System.out.println(i*3);
        }

        int[] numbers = {12,16,9,4,22,104,66};
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        int counter = 0;
        while (counter < 10) {
            System.out.println("hello");
            counter++;
        }
        System.out.println("finished");


        int[] selectedNumbers = {1,3,8,2,7,4,5,9,10,6};
        int counter2 = 0;
        while(selectedNumbers[counter2] < 7)
        {
            System.out.println(counter2);
            System.out.println(selectedNumbers[counter2]);
            counter2++;
        }
        int myAge = 26;
        while(myAge < 20){

        }


    }
}
