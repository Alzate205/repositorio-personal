package encapsulation;

public class MainFutbol {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName("pablo");
        soccerPlayer.setGoalsScored(45);
        soccerPlayer.setJerseyNumber(10);
        System.out.println(soccerPlayer.getName());
    }
}
