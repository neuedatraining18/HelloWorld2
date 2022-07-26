public class Main {

    public static void main(String[] args) {
       int i = 7;
        System.out.println(i);
        int j;
        j = 19;
        System.out.println(j);
        long myVariable = 176;
        long anotherVariable = 9000000000L;
        int first = 50;
        int second = 100;
        int third = first+10;
        System.out.println(third);
        first = 65;
        System.out.println(first);
        System.out.println(third);
        System.out.println("first * 3 = " + first * 3);

        System.out.println(second / 50);
        System.out.println(second / first);

        double size = 17.3;
        float smallerSize = 17.1f;
        double largerSize = 18;
        int extraLargeSize = 19;
        extraLargeSize = extraLargeSize+1;
        extraLargeSize++;
        extraLargeSize--;
        System.out.println(extraLargeSize);


        int remainder = 26 % 7;
        System.out.println(remainder);

        boolean iAmHappy = true;
        boolean iAmSad = false;

        char firstInitial = 'M';

        int[] participantAges = {23,21,19,24,22};
        System.out.println("Ages:" + participantAges[2]);
        participantAges[0] = 24;
        System.out.println(participantAges[0]);

    }

}
