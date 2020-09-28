import java.util.Scanner;

class Qthree {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int numberOfSongs = 0;
        int totalMinutes = 0;
        int totalSeconds = 0;
        int addionalMinutesFromExtraSeconds = 0;
        System.out.println("enter number of songs");
        numberOfSongs = scan.nextInt();

        int[][] songs = new int[numberOfSongs][2];
        for (int i = 0; i < numberOfSongs; i++) {
            System.out.println("Enter song's minutes");
            songs[i][0] = scan.nextInt();
            System.out.println("Enter song's seconds");
            songs[i][1] = scan.nextInt();
        }

        for (int i = 0; i < numberOfSongs; i++) {
            totalMinutes += songs[i][0];
            totalSeconds += songs[i][1];
        }
        // to calculate effective seconds
        addionalMinutesFromExtraSeconds = totalSeconds / 60;
        // adding those extra minutes
        totalMinutes += addionalMinutesFromExtraSeconds;
        // removing those extra seconds from the total seconds
        totalSeconds = totalSeconds - (addionalMinutesFromExtraSeconds * 60);

        System.out.println("total minutes: " + totalMinutes + "  total seconds: " + totalSeconds);
        scan.close();
    }
}