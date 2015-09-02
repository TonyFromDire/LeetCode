public class Solution {
    public List<Integer> getRow(int rowIndex) {
            	 List<Integer> test=new ArrayList<Integer>();
        Integer[] arr = new Integer[rowIndex + 1];
        Arrays.fill(arr, 0);
        arr[0]=1;
        int i;
        for ( i= 1; i <= rowIndex; i++) 
        	for (int j = i; j>=1; j--) {
        		arr[j]=arr[j]+arr[j-1];
			}
       
        return Arrays.asList(arr);
    }
}