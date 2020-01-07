import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static String pluralize (String word, int number) {
    return (number > 1 || number == 0) ? word + "s" : word;
  }


  public static void flipNHeads (int n) {
    int heads = 0;
    int count = 0;
    while (heads < n) {
      count++;
      if (Math.random() >= 0.5) {
        heads++;
        System.out.println("heads");
      } else {
        heads = 0;
        System.out.println("tails");
      }
    }

    System.out.println("It took " + count +" flips to flip " + n + " head(s) in a row.");
  }

  public static void clock() {
    String previousTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    int hz = 0;
    while (true) {
      LocalDateTime now = LocalDateTime.now();
      int second = now.getSecond();
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      hz++;
      if (second % 1 == 0 && !time.equals(previousTime)) {
        char hzChar = ' ';
        if (hz >= 1000) hzChar = 'k';
        if (hz >= 10000) hzChar = 'M';
        if (hz >= 100000) hzChar = 'G';
        System.out.println(time +" " + hz + hzChar + "Hz");
        previousTime = time;
        hz = 0;
      }
    }
  }

  public static void main (String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    
    flipNHeads(2);
    flipNHeads(5);

    clock();
  }
}