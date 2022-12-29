public class CricketScoreBoardObs implements Observer {

    @Override
    public void updateScore(ScoreBoard sb) {
        System.out.println("Current score is " + sb.getScore());
    }
}
