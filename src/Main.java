public class Main {

    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            total = total * nums[i];
        }
        System.out.println(total);
    }
}
