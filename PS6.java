package Arrays.PS;

public class PS6 {
    public static int countElements(int[] arr){
        int n = arr.length;
        int count =0;
        for(int i=0; i<n; i++){
            boolean smaller = false, greater = false;
            for(int j=0; j<n; j++){
                if(1!=j){
                    if(arr[j]<arr[i])
                        smaller = true;
                    else if (arr[j]>arr[i])
                        greater = true;
                }
            }
            if(smaller && greater)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {11,7,2,15};
        int count = countElements(arr);
        System.out.println(count);
    }
}
