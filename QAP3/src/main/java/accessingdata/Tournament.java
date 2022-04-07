package accessingdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tournament {

    @Id
    @GeneratedValue
    private long id;


    private String tournamentStartDate;
    private String tournamentEndDate;
    private String tournamentLocation;
    private double tournamentCashPrize;

    // Get/set Methods

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTournamentStartDate() {
        return tournamentStartDate;
    }

    public void setTournamentStartDate(String tournamentStartDate) {
        this.tournamentStartDate = tournamentStartDate;
    }

    public String getTournamentEndDate() {
        return tournamentEndDate;
    }

    public void setTournamentEndDate(String tournamentEndDate) {
        this.tournamentEndDate = tournamentEndDate;
    }

    public String getTournamentLocation() {
        return tournamentLocation;
    }

    public void setTournamentLocation(String tournamentLocation) {
        this.tournamentLocation = tournamentLocation;
    }

    public double getTournamentCashPrizeAmount() {
        return tournamentCashPrize;
    }

    public void setTournamentCashPrizeAmount(double tournamentCashPrizeAmount) {
        this.tournamentCashPrize = tournamentCashPrizeAmount;
    }
}