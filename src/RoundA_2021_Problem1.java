import java.util.*;

public class RoundA_2021_Problem1{
    public static void main(String args[]){
        Scanner sc =  new Scanner (System.in);

        int T = sc.nextInt();

        for (int i=1;i<=T;i++){

            int N = sc.nextInt();

            int K1 = sc.nextInt();
            String str="";
            int k=-1;
            if(k<N){
                k++;
                str = sc.next();
            }

            int score =0;

            for (int j = 0; j<N/2;j++){
                int temp = (N-2) - (j) + 1 ;
                if (str.charAt(j) != str.charAt(temp)){
                    score++;
                }
            }
            if (score == K1){
                System.out.println("Case #"+(i)+": 0");
            }
            if(K1<score){
                System.out.println("Case #"+(i)+": "+(score-K1));
            }
            if(K1>score){
                System.out.println("Case #"+(i)+": "+(-score+K1));
            }
        }
    }
}