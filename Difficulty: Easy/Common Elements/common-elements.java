class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer>c=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                c.add(a[i]);
            
            i++;
            j++;}
            else if(a[i]>b[j]) j++;
            else i++;
        }
        return c;
    }
}