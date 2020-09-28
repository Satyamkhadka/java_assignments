import java.util.Scanner;

class Qtwo {

  static String[] SONGS = { "song1", "song2", "song3", "song4", "song5" };
  static int[] VOTES = { 0, 0, 0, 0, 0 };
  static int USERS = 10;

  public static void main(String args[]) {
    int input = 0;
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.println(SONGS[i]);

    }
    for (int i = 0; i < USERS; i++) {
      input = 0;
      System.out.println("Vote your fav song");
      input = scan.nextInt();
      input--; // index starts at 0 . counting starts at 1
      VOTES[input]++;
    }

    int greatest = 0;
    int greatestIndex = 0;
    for (int j = 0; j < 5; j++) {
      if (VOTES[j] > greatest) {
        greatest = VOTES[j];
        greatestIndex = j;
      }
    }

    System.out.println("most popular song is: " + SONGS[greatestIndex]);
    System.out.println("Number of votes for popular song is: " + greatest);
    scan.close();
  }

}