public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i ; j < arr.length ; j++) {
                if ((j-i+1)%2!=0) {
                    for (int k = i ; k <= j ; k++) {
                        sum+=arr[k];
                    }
                }
            }
        }
        return sum;
    }
}
