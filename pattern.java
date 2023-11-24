import java.util.*;

public class pattern{
    public static void main(String[] args){
        Scanner S =new Scanner(System.in);
        int n = 4;
        int m = 5;
        // Solid rectangle stars
        for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Half pyramid design
        for(int a = 1;a<=n;a++){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
