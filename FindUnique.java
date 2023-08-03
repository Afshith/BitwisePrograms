public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[]arr){
        int answer=0;
        for(int i : arr){
            answer^=i;
        }
        return answer;
    }
}
