package JavaProject;

import java.io.*;
import java.util.ArrayList;

public class Receipt implements Revenue {
    private int receiptID;
    private Cashier cashier;
    private String dateAndHour;
    private ArrayList<Goods> listOfGoodsInReceipt;
private static int number=0;
public Receipt (){

}

    public Receipt(Cashier cashier, String date) {
    number++;
    receiptID=number;
        this.cashier = cashier;
        this.dateAndHour = date;
        listOfGoodsInReceipt = new ArrayList<>();
    }
public String fileOutput(){
    return  String.valueOf(getReceiptID()) + " Receipt.txt";
}
    public  int getReceiptID() {
        return receiptID;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public String getDateAndHour() {
        return dateAndHour;
    }

    public void setDateAndHour(String dateAndHour) {
        this.dateAndHour = dateAndHour;
    }
public ArrayList<Goods> getListOfGoodsInReceipt(){
    return listOfGoodsInReceipt;
}

    @Override
    public double totalRevenue() {
        double sum = 0;
        for (Goods g:listOfGoodsInReceipt) {
            sum+=g.getPrice();
        }
        return sum ;
    }



    public int totalReceipts(){
        System.out.println("The number of receipts for the moment is: ");
    return receiptID;
    }

    public void writeReceipt (String outputFileName){
        try (FileWriter fout = new FileWriter(new File(outputFileName), false);){
            if (this != null) {
                fout.append(this.pechatane() + System.lineSeparator());

            }

        }
        catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }
public void readReceipt (String outputFilename)  {
    try (FileReader fis = new FileReader(new File(outputFilename))) {
        BufferedReader bufferedReader = new BufferedReader(fis);

        String line;
        if ((line = bufferedReader.readLine()) != null) {
            line = this.pechatane();
            System.out.println(line);
        }
    }
    catch (IOException e) {
        System.out.println("IOException " + e);
    }
}
    @Override
    public String toString() {
        return "Receipt{" +
                "cashier=" + cashier +
                ", dateAndHour='" + dateAndHour + '\'' + "Receipt ID number: = " + receiptID +
                ", listOfGoodsInReceipt=" + listOfGoodsInReceipt +
                '}';
    }
    public String pechatane (){
    return "Receipt{" +
            "cashier=" + cashier +
            ", dateAndHour='" + dateAndHour + '\'' + "Receipt ID number: = " + receiptID +
            ", listOfGoodsInReceipt=" + listOfGoodsInReceipt + "Total Revenue for the Receipt= " + this.totalRevenue() +
            '}';
    }
}
