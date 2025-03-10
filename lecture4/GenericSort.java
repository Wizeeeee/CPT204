package lecture4;
public class GenericSort {
    public static void main(String[] args) {
    Integer[] intArray={new Integer(2),new Integer(4),new Integer(3)};
    sort(intArray); // or Arrays.sort(intArray);
    printList(intArray); 
   }
    public static void sort(Object[] list) {
    Object currentMax;
    int currentMaxIndex;
    for (int i = list.length- 1; i >= 1; i--) {
    currentMax = list[i]; 
   currentMaxIndex = i; // Find the maximum in the list[0..i]
    for (int j = i - 1; j >= 0; j--) {
    if (((Comparable)currentMax).compareTo(list[j]) < 0) {
    currentMax = list[j];
    currentMaxIndex = j;
    }
    }
    list[currentMaxIndex] = list[i];
    list[i] = currentMax;
    }
    }
    public static void printList(Object[] list) {
    for (int i=0;i<list.length;i++) System.out.print(list[i]+" ");}}
   