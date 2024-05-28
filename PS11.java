package Arrays.PS;

public class PS11 {
    static int findSingle(int A[],int arr_size)
    {
        for(int i=0;i<arr_size; i++){
            int count =0;
            for(int j=0; j<arr_size; j++){
                if(A[i]==A[j]){
                    count++;
                }
            }
            if(count==1){
                return A[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,3,4};
        int n = arr.length;

        System.out.println("Element occuring once is " + findSingle(arr,n));
    }
}
