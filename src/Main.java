public class Main {
    public static void main(String[] args) {
        MemberCard johnCustomer = new MemberCard("John","a");
        johnCustomer.addPurchase(360);
        johnCustomer.addPurchase(486.5);
        System.out.println(johnCustomer.toString());

        MemberCard smithCustomer = new MemberCard("Smith","0678901234",35);
        smithCustomer.addPurchase(35);
        smithCustomer.addPurchase(186);
        smithCustomer.addPurchase(311);
        System.out.println(smithCustomer.toString());

        CashRegister cashRegister = new CashRegister() ;
        cashRegister.purchaseItem(15) ;
        cashRegister.purchaseItem(16.50) ;
        cashRegister.purchaseItem(24) ;
        cashRegister.purchaseItem(18) ;
        cashRegister.purchaseItem(30) ;
        cashRegister.setMemberCard(johnCustomer) ;
        cashRegister.pay(500,4);
        cashRegister.clear() ;
        System.out .println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        cashRegister. purchaseItem(34) ;
        cashRegister .purchaseItem(65) ;
        cashRegister .purchaseItem(20) ;
        cashRegister.pay(100,30);
        cashRegister.clear();




    }
}
