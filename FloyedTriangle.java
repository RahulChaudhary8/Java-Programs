import java.util.*;

public class FloyedTriangle {
    public static void main(String args[]) {
       int k=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for (int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
      
      

    }

}
