//Reversing array elements: [1,3,5,7,0] -> [0,7,5,3,1]
public class ReversingArray {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 5, 7, 0};

        //System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
