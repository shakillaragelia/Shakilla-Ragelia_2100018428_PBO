import java.util.Scanner;
class tugas1PBO {
    public static void main(String args[]) {
        char[] a = {'x','y','z','h','g'};
        int[][] x = {{0,1}, {2,3}, {4,5}};

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int n = input.nextInt();                //Input
        System.out.println("Nilainya : " + n);  //output

        if (n % 2 == 0) {
            System.out.println("adalah Bilangan Genap");
        } else {
            System.out.println(" adalah Bilangan Ganjil");
        }

        System.out.println("ARRAY 1D");
        for(int i=0; i<5; i++){        //perulangan For & array 1D
            System.out.println("Index " + i + " = " + a[i]);
        }
        int f = 0;
        while (f < 5) { //While
            System.out.println("HALLO TODOS!");
            f++;
        }
        int e = 0;
        do { //Do while
            System.out.println("SOY RAGEL!");
            e++;
        }
        while (e < 5);

        System.out.println("ARRAY 2D");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}