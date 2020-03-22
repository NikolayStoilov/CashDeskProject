package JavaProject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Cashier edno = new Cashier("Pesho");
        Cashier dve = new Cashier ("Gosho");
        Receipt r = new Receipt(edno,"25/05/15 14:20");
        Shop s = new Shop();
        Goods mlqko = new Goods(10,"Mlqko",2.5,"25/03.12");
        Receipt r2 = new Receipt(dve,"23/02/17 15:03");
        Goods sirene = new Goods(11,"Sirene",2.0,"26/03/12");
        s.addCashier(edno);
        s.addCashier(dve);
        s.addGood(mlqko,7);
        s.addGood(sirene,3);
        s.addReceipt(r);
        s.addReceipt(r2);
        CheckOut cashdesk1 = new CheckOut(s,r);
        CheckOut cashdesk2 = new CheckOut(s,r2);
        Thread thread1 = new Thread(cashdesk1,"CashDesk 1");
        Thread thread2 = new Thread(cashdesk2,"CashDesk 2");
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        try {
            cashdesk1.sellGoods(mlqko,3,r2);
            cashdesk2.sellGoods(sirene,2,r2);
            cashdesk1.sellGoods(mlqko, 4, r);
        } catch(NotEnoughGoodsInShop n){
            System.err.println("Exception " + n + " caught");
        }
       /* System.out.println(s.totalRevenue());
        System.out.println(r.totalRevenue());
        System.out.println(s.totalRevenue());
        System.out.println(r2.totalRevenue());*/


        r.writeReceipt(r.fileOutput());
        r2.writeReceipt(r2.fileOutput());
        r.readReceipt(r.fileOutput());
        r2.readReceipt(r2.fileOutput());


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Starting threads!");

        thread1.start();
        thread2.start();
        System.out.println("Thread " + Thread.currentThread().getName() + " state: " + Thread.currentThread().getState());



    }

}



