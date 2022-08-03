public class AreaRect {
    public int length;
    public int breadth;

    public AreaRect(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int returnArea(){
        int a = length * breadth;
        return a;
    }
}
