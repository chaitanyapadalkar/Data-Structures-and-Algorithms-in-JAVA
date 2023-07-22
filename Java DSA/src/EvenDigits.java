public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {26, 8};
        System.out.println(findNumbers(nums));

    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int digits = finddigits(num);

        return digits % 2 == 0;
    }

    static int finddigits(int num) {
//        if (num < 0)
//            num = num * -1;
//
//        if (num == 0)
//            return 1;
//
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num /= 10;
//        }
//
//        return count;

        if(num<0){
            num=num*-1;
        }
        return ((int)Math.log10(num)) +1;
    }
}
