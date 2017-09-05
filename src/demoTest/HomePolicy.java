package demoTest;

public class HomePolicy extends policy {
	int policyId;
    int premium_amt;
    float plot_area;

    public float getPlot_area() {
        return plot_area;
    }

    public void setPlot_area(float plot_area) {
        this.plot_area = plot_area;
    }
    
    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public int getPremium_amt() {
        return premium_amt;
    }

    public void setPremium_amt(int premium_amt) {
        this.premium_amt = premium_amt;
    }

}
