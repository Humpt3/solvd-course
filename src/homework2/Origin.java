package homework2;

public class Origin {
    private int branchNumber;

    private int phoneNumber;
    private String location;


    public Origin(int branchNumber, int phoneNumber, String location) {
        this.branchNumber = branchNumber;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String originDetails() {
        return "Branch number: " + getBranchNumber() + " " + "Phone number: " + getPhoneNumber() + " " + "Location: " + getLocation();
    }
}
