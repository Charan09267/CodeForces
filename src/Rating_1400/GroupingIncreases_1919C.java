package Rating_1400;

import java.util.Scanner;

public class GroupingIncreases_1919C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while(tc-- > 0){

            int n = sc.nextInt();
            int x = Integer.MAX_VALUE , y = Integer.MAX_VALUE;
            int ans = 0;

            for(int i=0;i<n;i++){
                int ai = sc.nextInt();

                if(x > y){
                    int temp = x;
                    x = y;
                    y = temp;
                }

                if(ai <= x){
                    x = ai;
                }else if(ai <= y){
                    y = ai;
                }else{
                    x = ai;
                    ans++;
                }
            }

            System.out.println(ans);

        }
    }
}
