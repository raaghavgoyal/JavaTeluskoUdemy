package BeforeS2L44;
public class JaggedArray {
    public static void main(String[] args) {
        //this program teaches us to traverse an array with for-each as well as simple for loop
        // also we have a new topic called jagged array(means 2D array with diff sized subarrays)
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[3];
        for(int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*10);
            }
        }
        for(int a[] : arr){
            for (int e : a) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
