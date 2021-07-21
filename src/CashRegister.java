public class CashRegister {
    private int totalIntCargo;
    private double totalPrideCargo;
    private MemberCard memberCard;
    private double totalPridePurchase;
    private double receivedMoney;
    private double changeMoney;

    public CashRegister() {
        this.totalIntCargo = totalIntCargo;
        this.totalPrideCargo = totalPrideCargo;
        this.memberCard = new MemberCard("no membership card","Null",0);
        this.totalPridePurchase = totalPridePurchase;
        this.receivedMoney = receivedMoney;
        this.changeMoney = changeMoney;
    }

    public void purchaseItem (double purchase){
        this.totalIntCargo += 1;
        this.totalPrideCargo += purchase;
    }

    public void pay (double cash, int stamp){
        if (this.memberCard.getName()=="no membership card"){
            this.totalPridePurchase = this.totalPrideCargo - stamp;
            System.out.println("จำนวนสินค้าทั้งหมด "+totalIntCargo+" ราคาสินค้ารวม "+totalPrideCargo+" บาท");
            System.out.println("ลูกค้า "+ memberCard.getName() +" จ่ายเงิน "+ cash +" บาท และต้องการใช้ E-Stamp "+ stamp +" ดวง เพื่อเป็นส่วนลด");
            System.out.println("แสดงราคาสินค้ารวมหลังลดราคา "+ this.totalPridePurchase +" เงินทอน "+(cash-totalPridePurchase)+"บาท");
        }
        else {
            this.totalPridePurchase = this.totalPrideCargo - stamp;
            System.out.println("จำนวนสินค้าทั้งหมด "+totalIntCargo+" ราคาสินค้ารวม "+totalPrideCargo+" บาท");
            System.out.println("ลูกค้า "+ memberCard.getName() +" จ่ายเงิน "+ cash +" บาท และต้องการใช้ E-Stamp "+ stamp +" ดวง เพื่อเป็นส่วนลด");
            System.out.println("แสดงราคาสินค้ารวมหลังลดราคา "+ this.totalPridePurchase +" เงินทอน "+(cash-totalPridePurchase)+"บาท");
        }
    }

    public void clear (){
        this.totalIntCargo = 0;
        this.totalPrideCargo = 0;
        this.memberCard = new MemberCard("no membership card","Null",0);
        this.totalPridePurchase = 0;
        this.receivedMoney = 0;
        this.changeMoney = 0;
    }



    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public int getTotalIntCargo() {
        return totalIntCargo;
    }

    public double getTotalPrideCargo() {
        return totalPrideCargo;
    }

    public double getTotalPridePurchase() {
        return totalPridePurchase;
    }

    public double getReceivedMoney() {
        return receivedMoney;
    }

    public double getChangeMoney() {
        return changeMoney;
    }
}
