import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Kweku Running");
//
//        Area area = new Area();
//        area.setDim(3,5);
//        int result = area.getArea();
//        System.out.println(result);
//
//
//        Student stud = new Student();
//        stud.Name = "John";
//        stud.roll_no =2;
//
//        System.out.println();

//        Triangle triad = new Triangle(2,3,4);
//
//
//        triad.Print();

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the length: ");
//        int length = sc.nextInt();
//        System.out.println("Enter the breadth: ");
//        int breadth = sc.nextInt();
//
//        AreaRect are = new AreaRect(length, breadth);
//        int ff = are.returnArea();
//        System.out.println(ff);

        System.out.println("Enter real1: ");
        int n_o = sc.nextInt();
        System.out.println("Enter imaginary1: ");
        int n_tw = sc.nextInt();
        System.out.println("Enter real2: ");
        int n_th = sc.nextInt();
        System.out.println("Enter imaginary2: ");
        int n_fo = sc.nextInt();

        Complex res = new Complex(n_o, n_tw, n_th, n_fo);

        res.add();
        res.subtract();
        res.multiply();




    }
}
