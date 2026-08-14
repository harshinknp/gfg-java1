class Solution {
    void segregate0and1(int[] arr) {
        // code here\
        int q=0;
        int m=0;
        int n=arr.length;
        for( int i=0;i<n;i++){
            if(arr[i]==0)
            q=q+1;
            else
            m=m+1;
        }
        for(int i=0;i<q;i++)
        arr[i]=0;
        for(int i=q;i<n;i++)
        arr[i]=1;
    }
}
