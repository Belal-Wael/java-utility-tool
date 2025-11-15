public class UtilityTool {

    public static void main(String[] args) {
        System.out.println("Welcome to My Utility Tool!");
        System.out.println("1 + 2 = " + addNumbers(1, 2));
        System.out.println("Current Time: " + getCurrentTime());
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    public static String getCurrentTime() {
        return java.time.LocalTime.now().toString();
    }
}
