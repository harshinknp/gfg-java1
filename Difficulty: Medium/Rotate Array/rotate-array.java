class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
         reverse(arr,0,n-1);
         reverse(arr,0,n-1-d);
         reverse(arr,n-d,n-1);
    }
    public  void reverse(int arr[],int i,int j){
      while(i<j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
        i++;j--;
    }
        
    }
    }