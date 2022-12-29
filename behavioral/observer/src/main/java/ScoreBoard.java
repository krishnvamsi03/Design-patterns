import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {

    String score;

    String scoreBoardType;

    String matchId;

    List<Observer> observers = new ArrayList<>();

    public ScoreBoard(String matchId, String scoreBoardType) {
        this.matchId = matchId;
        this.scoreBoardType = scoreBoardType;
    }

    public void updateScoreBoard(String score) {
        this.score = score;
        observers.forEach(o -> o.updateScore(this));
    }

    public String getScore() {
        return score;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "ScoreBoard{" +
                "score='" + score + '\'' +
                ", scoreBoardType='" + scoreBoardType + '\'' +
                ", matchId='" + matchId + '\'' +
                '}';
    }
}
