package demoTest;

public class HealthPolicy extends policy{
	int policyId;
    String blood_group;
    int premium_amount;

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public int getPremium_amount() {
        return premium_amount;
    }

    public void setPremium_amount(int premium_amount) {
        this.premium_amount = premium_amount;
    }  
}
