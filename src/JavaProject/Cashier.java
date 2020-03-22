package JavaProject;

public class Cashier {
    private   int cashierID;
    private static int number=0;
    private  String cashierName;

    public Cashier (){
        cashierID++;
    }

    public Cashier(String cashierName) {
        this.cashierName = cashierName;
        number++;
        cashierID=number;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public  int getCashierID() {
        return cashierID;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "cashierName='" + cashierName + '\'' + "cashierIDNumber: = " + cashierID +
                '}';
    }
}
