package demoTest;

public class VehiclePolicy extends policy{
	int policyId;
    int vehicleNo;
    int licenceNo;
    String vehicleType;
    int premium_amt;

    public int getPremium_amt() {
        return premium_amt;
    }

    public void setPremium_amt(int premium_amt) {
        this.premium_amt = premium_amt;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(int licenceNo) {
        this.licenceNo = licenceNo;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    } 

}
