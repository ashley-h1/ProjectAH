//
public class Tests{
    public static void main(String args[]){
        //create variables for 3 test scores, display the scores and their average
        double scoreOne = 88.2;
        double scoreTwo = 78.9;
        double scoreThree = 97.6;
        //calculate average
        double addedTogether = scoreOne + scoreTwo + scoreThree;
        double average = addedTogether/3;
        //print everything
        System.out.println("Test score 1: " + scoreOne);
        System.out.println("Test score 2: " + scoreTwo);
        System.out.println("Test score 3: " + scoreThree);
        System.out.println("The average of the three test scores is: " + average);
    }

}