import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,dersSayisi=5;
        double average=0;


        Scanner scan=new Scanner(System.in);
        System.out.print("Matematik Notunuz:");
        mat=scan.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=scan.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=scan.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce=scan.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik=scan.nextInt();

        if(mat<0 || mat>100){
            mat=0;
            dersSayisi--;
        }
        if(fizik<0 || fizik>100){
            fizik=0;
            dersSayisi--;
        }
        if(kimya<0 || kimya>100){
            kimya=0;
            dersSayisi--;
        }
        if(turkce<0 ||turkce>100){
            turkce=0;
            dersSayisi--;
        }
        if(muzik<0 || muzik>100){
            muzik=0;
            dersSayisi--;
        }

        average=(mat+fizik+kimya+turkce+muzik)/dersSayisi;

        if (average<55){
            System.out.println("Kaldınız");
        }else{
            System.out.println("Geçtiniz");
        }
        System.out.println("Ortalamanız: "+average);








    }
}