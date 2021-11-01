import java.util.Scanner;

public class smallest_num_of_notes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        if (1<=t && t<=1000) {
            for (int i = 0; i < t; i++) {
                int n=sc.nextInt();
                int count=0;
                if (1<=n && n<=Math.pow(10, 6)) {
                    while (n>0) {
                        count +=n/100;
                        n=n%100;
                        count +=n/50;
                        n=n%50;
                        count +=n/10;
                        n=n%10;
                        count +=n/5;
                        n=n%5;
                        count +=n/2;
                        n=n%2;
                        count +=n/1;
                        n=n%1;
                    }
                    System.out.println(count);
                }
                
            }
        }
    }
}
