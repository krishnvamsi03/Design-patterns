public class ObserverMain {
    public static void main(String[] args) {
        Observer observer = new CricketScoreBoardObs();
        ScoreBoard sb = new ScoreBoard("234", "cricket");
        sb.addObserver(observer);
        System.out.println(sb);

        sb.updateScoreBoard("32/1 5.5 overs");

        System.out.println(sb);
    }
}
