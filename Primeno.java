import java.util.Scanner;
public  class Primeno{
    public static void main(String[] abc){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int count=0;
        for(int i=1; i<=n; i++){
            if(n %i==0)
            count ++;
        }
        if (count ==2)
        System.out.println("prime number");
        else
        System.out.println("not a prime number");
    }
}