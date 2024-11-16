package CopyObject;

class ShallowCopyDemo implements Cloneable{
    int x;
    int[] arr;
    public ShallowCopyDemo(int x, int[] arr){
        this.x = x;
        this.arr = arr;
    }

    @Override
    public ShallowCopyDemo clone() {
        try {
            return (ShallowCopyDemo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class ShallowCopy {
    public static void main(String[] args) {
      int[] arr = { 1,2,3,4,5};
      ShallowCopyDemo object = new ShallowCopyDemo(100, arr);
      ShallowCopyDemo shallowCopy = object.clone();
      shallowCopy.arr[0] = 9999;

      System.out.println("Shallow Copy Object array 0th element " + shallowCopy.arr[0]);
      System.out.println("Original Object array 0th element " + object.arr[0]);

    }
}
