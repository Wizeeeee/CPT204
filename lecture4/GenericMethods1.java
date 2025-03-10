package lecture4;

public class GenericMethods1 {
    public static <E> void print(E[] list) {
    for (int i = 0; i < list.length; i++) 
   System.out.print(list[i] + " ");
    System.out.println();
    }
    public static void main(String[] args) {
    String[] s3 = {"Hello", "again"};
    GenericMethods1.<String>print(s3); 
   // OR simply:
    print(s3);

    Integer[] intArray = {1, 2, 3, 4, 5};
    GenericMethods1.<Integer>print(intArray);
    }

    }