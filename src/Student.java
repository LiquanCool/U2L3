public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    public Student(String f, String l, int g) {
        firstName = f;
        lastName = l;
        gradYear = g;
    }
    public void updateGradYear(int newGradYear){
        gradYear = newGradYear;
    }
    public void addTestScore(double newTestScore){
        accumulatedTestScores += newTestScore;
        testScoreCount ++;
    }


}
