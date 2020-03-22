package JavaProject;

import java.util.ArrayList;

public class Shop implements  Revenue{
    private ArrayList<Goods> listOfGoods;
    private ArrayList<Cashier> listOfCashiers;
    private ArrayList<Receipt> listOfReceipts;

    public ArrayList<Goods> getListOfGoods() {
        return listOfGoods;
    }

    public ArrayList<Cashier> getListOfCashiers() {
        return listOfCashiers;
    }

    public ArrayList<Receipt> getListOfReceipts() {
        return listOfReceipts;
    }

    public Shop() {
        listOfGoods=new ArrayList<>();
        listOfCashiers=new ArrayList<>();
        listOfReceipts=new ArrayList<>();

    }
    public void addCashier(Cashier c) {
        if (listOfCashiers.contains(c)) {
            System.out.println("You have already added that cashier to your shop");
        } else {
            listOfCashiers.add(c);
            System.out.println("You have added cashier: " + c.getCashierName() + " in your shop");
        }
    }
 public void addReceipt (Receipt r){

            if (listOfReceipts.contains(r)){
                System.out.println("There is already a receipt with that number");
            }
            else{
                listOfReceipts.add(r);
            }


 }
    public void addGood (Goods g,int n){
        for (int i = 0;i < n;i++){
            listOfGoods.add(g);
        }
        System.out.println("You have added " + g.getGoodsName()+ " " + n + " times in the shop");
    }
    public void addGoodsInReceipt(Goods g,int cnt,Receipt r){
        for(int i=0;i<cnt;i++){
            r.getListOfGoodsInReceipt().add(g);
        }
    }

    @Override
    public double totalRevenue() {
        double sum = 0;
        for (Receipt r:listOfReceipts) {
            sum+=r.totalRevenue();
        }
        System.out.print("The total revenue for the moment for this shop is: ");
return sum;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "listOfGoods=" + listOfGoods +
                ", listOfCashiers=" + listOfCashiers +
                ", listOfReceipts=" + listOfReceipts +
                '}';
    }
}
