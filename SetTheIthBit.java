public class SetTheIthBit {
    public static void main(String[] args) {
        int n = 10;
        int ithBit = 3;
        System.out.println(setIth(10,3));

    }
    static int setIth(int n,int findBit){
        return n | (1 << (findBit-1));
    }
}
