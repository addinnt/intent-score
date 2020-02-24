package id.putraprima.skorbola.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Model implements Parcelable {

    private String homeName;
    private String awayName;
    private int homeScore;
    private int awayScore;
    private String winner;

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Model(String homeName, String awayName) {
        this.homeName = homeName;
        this.awayName = awayName;
    }

    public Model(String homeName, String awayName, int homeScore, int awayScore) {
        this.homeName = homeName;
        this.awayName = awayName;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    protected Model(Parcel in) {
        homeName = in.readString();
        awayName = in.readString();
        homeScore = in.readInt();
        awayScore = in.readInt();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getAwayName() {
        return awayName;
    }

    public void setAwayName(String awayName) {
        this.awayName = awayName;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(homeName);
        parcel.writeString(awayName);
        parcel.writeInt(homeScore);
        parcel.writeInt(awayScore);
    }
}
