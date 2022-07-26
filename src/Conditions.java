public class Conditions {
    public static void main(String[] args) {
        int testScore = 100;
    if (testScore > 50) {
        System.out.println("Congratulations");
    } else if (testScore==50){
        System.out.println("not sure");
        }
    else{
        System.out.println("Sorry failed");
        }
    switch (testScore) {
        case 0:
            System.out.println("did you even take the test?");
            break;
        case 100:
            System.out.println("you got top marks");
            break;
        default:
            System.out.println("you didn't do anything special");
    }

    int maxScore = 100;
    if (testScore > 50 && testScore < maxScore)
    {
        System.out.println(testScore);
    }
        if (testScore < 10 || testScore > 90)
        {
            System.out.println("You are at the boundary");
        }

    }
}
