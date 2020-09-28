import java.util.Scanner;

class QuestionTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[7];

        // input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter" + (i + 1) + " position number");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}