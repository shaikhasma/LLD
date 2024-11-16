package copy_object;


import java.util.Arrays;

class DeepCopyDemo implements Cloneable{
    int x;
    int[] arr;
    public DeepCopyDemo(int x, int[] arr){
        this.x = x;
        this.arr = arr;
    }

    @Override
    public DeepCopyDemo clone() {
        try {
            DeepCopyDemo deepCopy =  (DeepCopyDemo) super.clone();
            //Deep copy of array
            deepCopy.arr = arr.clone();
            return deepCopy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    // int[] arr ==> [I
}
public class DeepCopy {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        System.out.println(arr);
       /* DeepCopyDemo object = new DeepCopyDemo(100, arr);
        DeepCopyDemo deepCopy = object.clone();
        deepCopy.arr[0] = 9999;

        System.out.println("Deep Copy Object array 0th element " + deepCopy.arr[0]);
        System.out.println("Original Object array 0th element " + object.arr[0]);*/
    }
}
