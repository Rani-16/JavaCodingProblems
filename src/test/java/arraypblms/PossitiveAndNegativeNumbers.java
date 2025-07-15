package arraypblms;

public class PossitiveAndNegativeNumbers {

    public boolean possitiveNegative() {

        int[] arr = {1, -2, 5, -4, 3, -6};
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] >= 0 && arr[i + 1] >= 0) || (arr[i] < 0 && arr[i + 1] < 0)) {       //compare nearby two numbers
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        PossitiveAndNegativeNumbers positive = new PossitiveAndNegativeNumbers();
        boolean result = positive.possitiveNegative();
        System.out.println(result);
    }
}
