public class Fibonacci {
    public static void main(String[] args) {
        int[] fibSeq = new int[40];
        int total = 0;
        int even = 0;
        int divByThree = 0;
        int totDivByThree = 0;
        double average = 0;

        for (int i=0; i< fibSeq.length; i++){
            if(i == 0){
                fibSeq[0] = 0;
            }
            else if(i == 1)
            {
                fibSeq[1] = 1;
            }
            else {
                fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];
                }
            System.out.println("Fibonacci Seq "+ (i+1) +": "+ fibSeq[i]);
            total += fibSeq[i];
            if (fibSeq[i] % 2 == 0) {
                even+=1;
            }
            else if(fibSeq[i] % 3 == 0) {
                divByThree+=1;
                totDivByThree+=fibSeq[i];
            }
         }
        average = total / 40.0;
        System.out.println("Total:"+total);
        System.out.println("Even:"+even);
        System.out.println("Divisible by 3:"+divByThree);
        System.out.println("Total of numbers divisible by 3:" + totDivByThree);
        System.out.println("Average number:" + average);


    }
}
