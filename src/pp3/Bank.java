package pp3;

public class Bank extends Object {
    //Bank attributes
    private String name;
    private String address;
    private int phone;
    public SpecialAccount[] arrayList_AC;
    public CommercialClient[] arrayList_CL;
    //Static counters for set accounts and users
    static int count_AC = 0;
    static int count_CL = 0;

    //default constructor
    public Bank() {
        arrayList_AC = new SpecialAccount[100];
        arrayList_CL = new CommercialClient[100];
        name = null;
        address = null;
        phone = 1234567;
    }

    //parametrized constructor
    public Bank(String name, String address, int phone) {
        arrayList_AC = new SpecialAccount[100];
        arrayList_CL = new CommercialClient[100];
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    //Setters and getters function
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return ("Bank_Name: "+name);
    }

    public String getAddress() {
        return ("Bank_Address: "+address);
    }

    public int getPhone() {
        System.out.print("Bank_number: ");
        return (phone);
    }

    //print all accounts method
    public void printAll_A() {
        for (int i = 0; i < count_AC; i++) {
            System.out.println(arrayList_AC[i]);
        }
    }

    //method for add account
    public void addAccount(SpecialAccount a) {
        arrayList_AC[count_AC] = a;
        count_AC++;
    }

    //method for print all clients
    public void printAll_C() {
        for (int i = 0; i < count_AC; i++) {
            System.out.println(arrayList_CL[i]);
        }
    }

    //method for add client
    public void addClient(CommercialClient AC) {
        arrayList_AC[count_AC] = AC.getSpecial_AC();
        arrayList_CL[count_CL] = AC;
        count_CL++;
        count_AC++;
    }

}




