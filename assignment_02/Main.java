package assignment_02;


import java.util.Scanner;

public class Main {
        public static void main(String args[]) {
            SoNguyenTo snt = new SoNguyenTo("hello");
            for (int i = 0; i < 50; i++) {
                System.out.println("SNT: " + snt.timSoNguyenToTiepTheo());
            }
        }
}
