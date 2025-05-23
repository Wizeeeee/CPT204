import java.math.BigInteger;  

public class LargeNumbers {  
    public static void main(String[] args) {  
        // 调用函数以打印符合条件的数字  
        findLargeNumbers();  
    }  

    public static void findLargeNumbers() {  
        BigInteger count = BigInteger.ZERO; // 记录找到的符合条件的数字数量  
        BigInteger num = BigInteger.TEN.pow(49); // 起始点，50 位数字的最小值是 10^49  
    //至少十个数
        while (count.compareTo(BigInteger.TEN) < 0) {  
            // 检查这个数字是否能被 2 或 3 整除  
            if (num.mod(BigInteger.TWO).equals(BigInteger.ZERO) || num.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {  
                System.out.println(num); // 打印符合条件的数字  
                count = count.add(BigInteger.ONE); // 找到一个数字后，计数加一  
            }  
            num = num.add(BigInteger.ONE); // 检查下一个数字  
        }  
    }  
}