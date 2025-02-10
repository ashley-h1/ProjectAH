import java.util.Scanner;
public class Tests{
    //private fields
    private double ave;
    private int count;
    private int score;
    //constructors
    public Tests(){
        setScore(0);
    }
    //methods
    public double getAve(){
        return this.ave;
    }
    public void getAverage(){
        Scanner avrgScanner = new Scanner(System.in);
        double sum = 0;
        int amnt = 0;
        int on = 1;
        while (on > 0){
            System.out.println("Enter your test scores(-1 to quit): ");
            int newTest = avrgScanner.nextInt();
            if (newTest < 0){
                on = -1;
                System.out.println("Quitting");
                break;
            }
            else{
                sum = sum + newTest;
                amnt ++;
            }
        }
        this.count = amnt;
        this.ave = sum/amnt;
        avrgScanner.close();
    }
    public int getCount(){
        return this.count;
    }
    public int getScore(){
        return this.score;
    }
    void setScore(int newScore){
        this.score = newScore;
    }
    public String toString(){
        String formatted = String.format("%.2f", this.ave);
        String output = "The average of the " + this.count;
        output += " tests is: ";
        output += formatted;
        return output;
    }
}