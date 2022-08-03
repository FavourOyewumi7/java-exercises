public class Average {
    public int int_a;
    public int int_b;
    public int int_c;

    public Average(int a, int b, int c){
        this.int_a = a;
        this.int_b = b;
        this.int_c = c;
    }

    public void returnAverage(){
        int z = int_a+ int_b + int_c;
        int ave = z/3;
        System.out.println("Average is: "+ ave);
    }

}
