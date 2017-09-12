package com.example.simonanger.solidlab;

/**
 * Created by simonanger on 12/09/2017.
 */

public class LongestDistance extends Competition {

    public LongestDistance() {
        super("Longest Winner", CompetitionType.DISTANCE);
    }

    public Athlete winner(){
        Athlete winner = null;
        double winnersLength = 0.0;
        for (Athlete runner : this.runners) {
            if (runner.longestDistance() > winnersLength) {
                winnersLength = runner.longestDistance();
                winner = runner;
            }
        }
        return winner;

    }
}

//
//    double length = 0;
//        for(Run run : runs) {
//                if (run.getDistance() > length) {
//                length = run.getDistance();
//                }
//                }
//                return length;
//                }