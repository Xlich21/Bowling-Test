public class BowlingGame {

    protected int[] rolls = new int [21];
    protected int rollNo = 0;
    protected int score = 0;

    public void roll(int i) {
        rolls [rollNo] = i;
        rollNo++;
    }

    public int score() {
        for (int frame = 0; frame < 20; frame += 2) {
            if (rolls[frame] == 10) {
                score+= 10 + rolls [frame+2] + rolls [frame+3];
            } else if ((rolls[frame] + rolls[frame + 1]) == 10) {
                score = 10 + rolls [frame+2];
            } else {
                score += rolls[frame] + rolls[frame + 1];
            }
        }
        return score;

    }


}

