import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BattingAvg {
//  {Batting Average} = Runs Scored\Number of dismissals
//{Number of dismissals = Number of innings - Number of innings he remained Not Out}

    public static void main(String[] args) {
        System.out.print("Enter Total Number of runs scored by player :");
        Scanner in = new Scanner(System.in) ;
        int run = in.nextInt();
        System.out.print("Enter total number of innings played by player :");
        int innings = in.nextInt();
        System.out.print("Total number of times Player no out :");
        int not_out = in.nextInt() ;
        int dissmisal = innings - not_out ;
        float batting_avg = run / dissmisal ;
        System.out.print("batting avg of a player is :"+ batting_avg);


    }
}
