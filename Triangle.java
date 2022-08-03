public class Triangle {
    public int a;
    public int b;
    public int c;

    public Triangle(int a1, int a2, int a3){
        this.a = a1;
        this.b = a2;
        this.c = a3;
    }

    public void Print(){
        int area = (int) (0.5 * b * c);
        int perimeter = a+b+c;
        System.out.println("Area is: " +area);
        System.out.println("perimeter is: " +perimeter);
    }

}
