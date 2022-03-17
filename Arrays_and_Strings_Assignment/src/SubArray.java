import java.util.Scanner;
public class SubArray {

    int count=0;

    boolean sum(int []arr, int n,int sum){
        if(sum < 0) {
            count++;
            return true;
        }
        if(arr.length == 0 && sum > 0)
            return false;
        if(arr[n-1]<sum){
            return sum(arr,n-1,sum);
        }
        return sum(arr,n-1,sum) || sum(arr,n-1,sum-arr[n-1]);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        boolean x = sum(a,n,-1);

        System.out.println("Output is : " + count);

    }
}