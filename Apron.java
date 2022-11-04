import java.util.Scanner;
public abstract class Apron implements Pesawat {
    @Override
    public abstract void setApron();

    @Override
    public abstract void tampil();

    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("KODE APRON/ID MASKAPAI :");
        System.out.println("1. Garuda Indonesia");
        System.out.println("2. Citilink");
        System.out.println("3. Batik Air");
        System.out.println("4. Air Asia");
        System.out.println("5. Lion Air");
        System.out.println("Masukkan kode maskapai, maka pesawat akan otomatis masuk ke apron sesuai kode maskapai");

        int menu = 0, z = 0, a, cari;
        Maskapai[] data = new Maskapai[50];
        data[z] = new Maskapai();
        data[z].setId();
        while (menu != 6) {
            System.out.print("menu...\n1.input\t\t2.view\n3.search\t4.update\n5.delete\t6.exit\n : ");
            menu = data[0].in.nextInt();
            if (menu == 1) {
                z++;
                data[z] = new Maskapai();
                data[z].setId(data[z - 1].getId());
                data[z].setApron();
            } else if (menu == 2) {
                if (z < 1)
                    System.out.println("data kosong");
                else {
                    a = 0;
                    while (a < z) {
                        a++;
                        System.out.println("---" + a + "---");
                        data[a].tampil();
                    }
                }
            } else if (menu == 3 || menu == 4 || menu == 5) {
                System.out.print("masukkan id maskapai : ");
                cari = data[0].in.nextInt();
                a = 1;
                while (a <= z) {
                    if (data[a].getId() == cari)
                        break;
                    a++;
                }
                if (a <= z) {
                    if (menu == 3)
                        data[a].tampil();
                    else if (menu == 4) {
                        data[a].tampil();
                        data[a].setApron();
                    } else {
                        while (a < z) {
                            data[a] = data[a + 1];
                            a++;
                        }
                        z--;
                        System.out.println("data " + cari + " berhasil dihapus");
                    }
                } else
                    System.out.println("data tidak ditemukan");
            } else if (menu == 6)
                System.out.println("keluar...");
            else
                System.out.println("data tidak ada");
        }
    }
}