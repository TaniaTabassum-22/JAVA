public class SecondSmallestElement{
    public static void main(String[] args) {

        int[] arr = {20, 50, 30, 8, 78, 98};
        int result = secondSmallestElement(arr);
        System.out.println(result);
    
    }
    
    public static int secondSmallestElement(int[] arr) {
        int n = arr.length;
        int smallValue = Integer.MAX_VALUE; 
        int secondSmallest = Integer.MAX_VALUE; 
    
        
        for (int i = 0; i < n; i++) { 
            if (arr[i] < smallValue) {
                secondSmallest = smallValue; 
                smallValue = arr[i]; 
            } else if (arr[i] < secondSmallest && arr[i] != smallValue) {
                secondSmallest = arr[i]; 
            }
        }
        return (secondSmallest);
    
    }
}