public class BitOfNumber {
    public static void main(String[] args) {
        int n = 10;
        int findBit = 4;
        System.out.println(findBitNum(n,findBit));

    }
    static int findBitNum(int n,int findBit){
        return n & (1 << (findBit-1));
    }
}
