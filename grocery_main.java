public class grocery_main {
    public static void main(String[] args) {
        grocery_mart myAccount = new grocery_mart();
        myAccount.setCustName("Pavan");
        myAccount.setAccBal(500.52);
        myAccount.setCustId("#12345");
        myAccount.setCustPhNo("932849612");
        myAccount.setAddress("India");

        myAccount.Shop(498.52);
        myAccount.Shop(100);

        myAccount.rechargeAccount(700);
        myAccount.Shop(670);
    }
}
