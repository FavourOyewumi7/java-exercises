import java.util.ArrayList;

public class Complex {
    public int real1;
    public int imaginary1;
    public int real2;
    public int imaginary2;

    ArrayList <Object> favour = new ArrayList();
    



    public Complex(int a, int b, int c, int d){
        this.real1 = a;
        this.imaginary1 = b;
        this.real2 = c;
        this.imaginary2 = d;
    }

    public void add(){
        int z = real1 + real2;
        int y = imaginary1 + imaginary2;

        System.out.println("Result ="+ z+'+'+ y+'i');
    }

    public void subtract(){
        int x = Math.abs(real1 - real2);
        int w = Math.abs(imaginary1 - imaginary2);

        System.out.println("Result ="+ x+'+'+ w+'i');
    }

    public void multiply(){
        int v = real1 * real2;
        int u = imaginary1 * imaginary2 * -1;
        int t = real1 * imaginary2;
        int s = real2 * imaginary1;

        System.out.println("Result ="+(v+u)+"+"+(t+s)+"i");
    }
}


