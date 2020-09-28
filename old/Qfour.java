import java.util.Scanner;

class Qfour {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numberOfGuest = 0;
        System.out.println("People having same initials as birthday person can sit in special table:");
        System.out.println("Enter number of guests:");
        numberOfGuest = scan.nextInt();
        scan.nextLine(); // Consume newline left-over
        System.out.println("enter name of birthday person:");
        String name = scan.nextLine();
        System.out.println(name);
        String[] fnames = new String[numberOfGuest];
        String[] lnames = new String[numberOfGuest];

        for (int i = 0; i < numberOfGuest; i++) {
            System.out.println("Enter first name of guest");
            fnames[i] = scan.nextLine();
            System.out.println("Enter last name of guest");
            lnames[i] = scan.nextLine();
        }

        System.out.println("People siting in special table are:");
        char birthdayPersonInitial = name.charAt(0);
        for (int i = 0; i < numberOfGuest; i++) {
            if (fnames[i].charAt(0) == birthdayPersonInitial) {
                System.out.print(fnames[i].toLowerCase() + " ");
                System.out.println(lnames[i].toUpperCase());
            }
        }
        scan.close();
    }

}