import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y,sum,suma,sumb;
        x=in.nextInt();
        y=in.nextInt();
        sum=x+y;
        suma=x-y;
        sumb=x*y;

        System.out.printf("%d\n",sum);
        System.out.printf("%d\n",suma);
        System.out.printf("%d\n",sumb);
        in.close();



    }
}
