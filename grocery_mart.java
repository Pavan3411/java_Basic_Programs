public class grocery_mart {
    private String CustName;
    private String CustId;
    private String CustPhNo;
    private double AccBal;
    private String Address;

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustId() {
        return CustId;
    }

    public void setCustId(String custId) {
        CustId = custId;
    }

    public String getCustPhNo() {
        return CustPhNo;
    }

    public void setCustPhNo(String custPhNo) {
        CustPhNo = custPhNo;
    }

    public double getAccBal() {
        return AccBal;
    }

    public void setAccBal(double accBal) {
        AccBal = accBal;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public void Shop(double amount){
        if(AccBal >= amount){
            double rembal = AccBal - amount;
            System.out.println("Thanks for shopping . Your balance amount is: " + rembal);
            AccBal = rembal;
        } else {
            double lowamount = amount - AccBal;
            System.out.println("Insufficient Amount: Add more money " + lowamount);
        }
    }

    public void rechargeAccount(double recharge){
        AccBal = AccBal + recharge;
        System.out.println("Thanks for recharging. Your new balance is: " + AccBal);
    }
}
