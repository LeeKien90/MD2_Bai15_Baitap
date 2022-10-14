import ra.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập vào cạnh đầu tiên của tam giác: ");
            float a = Float.parseFloat(sc.nextLine());
            System.out.println("Nhập vào cạnh thứ 2 của tam giác: ");
            float b = Float.parseFloat(sc.nextLine());
            System.out.println("Nhập vào cạnh thứ 3 của tam giác: ");
            float c = Float.parseFloat(sc.nextLine());
            if (a+b<c || b+c<a || a+c<b ||a <0 || b<0 || c<0){
                throw new IllegalTriangleException("Đây không phải 3 cạnh của 1 tam giác");
            } else {
                System.out.println(" Đây là 3 cạnh của 1 tam giác");

            }

        }catch (NumberFormatException ex){
            throw new IllegalTriangleException("Không phải 3 cạnh của tam giác");
        }
    }
}