package Arrays.PS;

public class PS9 {
    static int xorOr(int arr[], int N){
        int evens =0, odds=0;
        for(int i=0; i<N; i++){
            if((i+1)%2==0 && arr[i]%2==0)
                evens += arr[i];
            else if((i+1)%2!=0 && arr[i]%2!=0)
                odds+= arr[i];

        }
        return Math.abs(odds-evens);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,5};
        int N = arr.length;
        System.out.println(xorOr(arr,N));
    }
}
