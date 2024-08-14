import java.util.Arrays;

public class SumOfTopTwoInteger {
    public int sumOfTwoIntegers(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("mảng này phải lớn hơn 2 phần tử");
        }
        Arrays.sort(array);
        int sum = array[array.length - 1] + array[array.length - 2];
        return sum;
    }
}
