public class XorFromZeroToA {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(xor(a));

    }
    static int xor(int a){
        if(a%4 == 0){
            return a;
        }
        if(a%4 == 1){
            return 1;
        }
        if(a%4 == 2){
            return a+1;
        }
        return 0;

    }
}
