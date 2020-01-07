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
      if (Math.random() >= 0.5) {
        heads++;
        System.out.println("heads");
      } else {
        System.out.println("tails");
      }
      count++;
    }
    System.out.println("It took " + count +" flips to flip " + n + " head(s) in a row.");
  }

  // Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

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