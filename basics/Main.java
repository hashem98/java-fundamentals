import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static String pluralize (String name,int count){
        if (count==1){
            return name;
        }else{
            return name+"s";
        }
    }
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 20;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipHeads(10);
        clock();

    }


    public static void clock(){
        while (true){
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            while (second==LocalDateTime.now().getSecond()){
                continue;
            }
            System.out.println(time);
        }}
    public static void flipHeads (int n){
        Random random = new Random();
        int counter=0 , hFlips=0 ,tFlips=0;
        while(counter<n)
        {
            double randomNum = random.nextDouble();
            if(randomNum<0.5)
            {
                System.out.println("tails");
                tFlips++;
                counter++;
            }
            else
            {
                System.out.println("heads");
                counter++;
                hFlips++;
            }
        }
        System.out.println("It took "+n+" flips to flip "+hFlips+" head in a row.");
    }
}