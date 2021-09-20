/* Problem statement
Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers.
 */

public class Bikers
{
    public static void main(String[] args) {
        int[] racers = new int[]{200, 210, 190, 213, 198};

        float avg = (racers[0] + racers[1] + racers[2] + racers[3] + racers[4]) / 5;

        for (int i = 0; i < 5; i++)
        {
            if(racers[i] > avg)
            {
                System.out.println("Racer " +(i + 1)+ " qualified");
            }
        }


    }
}