public class RoomActivity extends Activity {
    private String roomType;
    private int numOfParticipant;

    public RoomActivity(String activityName, char organiser, double budget, String date, String roomType,
            int numOfParticipant) {
        super(activityName, organiser, budget, date);
        this.roomType = roomType;
        this.numOfParticipant = numOfParticipant;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumOfParticipant() {
        return this.numOfParticipant;
    }

    public void setNumOfParticipant(int numOfParticipant) {
        this.numOfParticipant = numOfParticipant;
    }

    public double roomCharges() {
        double charges = 0;
        if (super.getOrganiser() == 'G') {
            charges = 1500;
        } else if (super.getOrganiser() == 'P') {
            charges = numOfParticipant * 25.00;
        } else if (super.getOrganiser() == 'U') {
            charges = numOfParticipant * 10.00;
        }

        return charges;
    }

    public String toString() {
        return super.toString() + "\nRoom Type: " + this.roomType + "\nNumber of Participant: " + this.numOfParticipant;
    }

}
