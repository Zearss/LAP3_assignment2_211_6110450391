public class MemberCard {
    private String name;
    private String numberPhone;
    private double totalMoneyPurchase;
    private int totalStamp;

    public MemberCard(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public MemberCard(String name, String numberPhone, int totalStamp) {
        this(name, numberPhone);
        this.totalStamp = totalStamp;
    }


    public double addPurchase(double purchase){
        totalMoneyPurchase = totalMoneyPurchase+purchase;
        if (purchase>=50){
            double stamp = purchase/50;
            totalStamp = (int) (totalStamp + Math.floor(stamp));
            return totalStamp;
        }
        return totalMoneyPurchase;
    }

    public boolean userStamp(int stamp){
        if (stamp>=totalStamp){
            totalStamp = totalStamp - stamp;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
    public String getNumberPhone() {
        return numberPhone;
    }
    public double getTotalMoneyPurchase() {
        return totalMoneyPurchase;
    }
    public int getTotalStamp() {
        return totalStamp;
    }

    public void setTotalMoneyPurchase(double totalMoneyPurchase) {
        this.totalMoneyPurchase = totalMoneyPurchase;
    }
    public void setTotalStamp(int totalStamp) {
        this.totalStamp = totalStamp;
    }

    @Override
    public String toString() {
        return "MemberCard{" +
                "name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", totalMoneyPurchase=" + totalMoneyPurchase +
                ", totalStamp=" + totalStamp +
                '}';
    }
}
