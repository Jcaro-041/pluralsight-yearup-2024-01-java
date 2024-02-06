public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 3;
        }
        int result = numbers[3];
        System.out.println(result);
        }

        }