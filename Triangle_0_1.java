import java.util.*;
public class Triangle_0_1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N=sc.nextInt();
        for (int i=1;i<=N;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
