public class Car {
    public static void main(String[] args) {

        // color is received by car here and set to below variable.
        String color = "Red";

        switch (color) {
            case "Red":
                System.out.println("Stop the car now.");
                break;
            case "Yellow":
                System.out.println("Slow down and stop.");
                break;
            default:
                System.out.println("No colours observed. continue. ");
                break;
        }
    }
}
