package pp3;
//inheritance class from client
public class CommercialClient extends Client {
    //private attribute
    private String commercialID;
    // setters and getters function
    public String getCommercialID() {
        return commercialID;
    }

    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }
    public SpecialAccount getSpecial_AC(){
        return specialAccount;
    }
    //parametrized constructor
    public CommercialClient(String name, String commercialID, String address, String phone, SpecialAccount acc) {
        super(name, "00000000000000", address, phone, acc);
        this.commercialID = commercialID;
    }
    //Overriding the method toString
    @Override
    public String toString() {
        return "CommercialClient:" +
                "\nName: " + name +
                "\nAddress: " + address +
                "\ncommercialID: " + commercialID +
                "\nPhone: " + phone +
                "\nAccount: " + specialAccount;
    }
}