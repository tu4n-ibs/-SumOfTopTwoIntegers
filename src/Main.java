public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 3, 5};
        SumOfTopTwoInteger sumOfTopTwoInteger = new SumOfTopTwoInteger();
        int result = sumOfTopTwoInteger.sumOfTwoIntegers(array);
        System.out.println("result: " + result);
    }
}