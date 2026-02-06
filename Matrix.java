import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        int ch;

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("1.Addition  2.Multiplication  3.Transpose");
        ch = sc.nextInt();

        switch (ch) {

            case 1: 
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        c[i][j] = a[i][j] + b[i][j];
                break;

            case 2: 
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
                break;

            case 3: 
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(a[j][i] + " ");
                    System.out.println();
                }
                return;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}