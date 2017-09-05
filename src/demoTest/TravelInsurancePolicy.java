package demoTest;

public class TravelInsurancePolicy extends policy  {
	int policyId;
    String type_of_travel;
    String country_travelling_to;
    String departure_date;
    String arrival_date;
    int no_of_days;
    int premium_amt;

    public int getPremium_amt() {
        return premium_amt;
    }

    public void setPremium_amt(int premium_amt) {
        this.premium_amt = premium_amt;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getCountry_travelling_to() {
        return country_travelling_to;
    }

    public void setCountry_travelling_to(String country_travelling_to) {
        this.country_travelling_to = country_travelling_to;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public int getNo_of_days() {
        return no_of_days;
    }

    public void setNo_of_days(int no_of_days) {
        this.no_of_days = no_of_days;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getType_of_travel() {
        return type_of_travel;
    }

    public void setType_of_travel(String type_of_travel) {
        this.type_of_travel = type_of_travel;
    }

}
