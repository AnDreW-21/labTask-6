package pp3;
public class Client extends Object{

    //Client attributes
    protected Account account;
    protected SpecialAccount specialAccount;
    protected String name, address;
    protected String nationalID, phone;

    //Setters and getters methods
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //parametrized constructor "Account"
    public Client( String name, String nationalID, String address, String phone, Account account) {
        this.account = account;
        this.name = name;
        this.address = address;
        this.nationalID = nationalID;
        this.phone = phone;
    }
    //parametrized constructor "Special Account"
    public Client( String name, String nationalID, String address, String phone, SpecialAccount accS) {
        this.specialAccount = accS;
        this.name = name;
        this.address = address;
        this.nationalID = nationalID;
        this.phone = phone;
    }
    //Overriding the method toString
    @Override
    public String toString() {
        return "Client: " +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nNationalID: " + nationalID +
                "\nPhone: " + phone +
                "\nAccount:" + account;
    }
}

