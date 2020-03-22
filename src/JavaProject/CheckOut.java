package JavaProject;

public class CheckOut implements Runnable {
    private Receipt receipt;
    private Shop shop;

    public CheckOut() {
    }

    public CheckOut(Shop shop,Receipt receipt) {
        this.shop = shop;
        this.receipt = receipt;

    }

    public String getCashierName() {
        return receipt.getCashier().getCashierName();
    }

    public Shop getShop() {
        return shop;
    }

    public synchronized void sellGoods(Goods g,int n,Receipt r) throws NotEnoughGoodsInShop {
        int cnt = 0;
        for (int i = 0; i < shop.getListOfGoods().size(); i++) {
            if (shop.getListOfGoods().get(i) == g) {
                cnt++;
            }
        }
        if (cnt >= n) {
            for (int i = 0; i < n; i++) {
                r.getListOfGoodsInReceipt().add(g);
                shop.getListOfGoods().remove(g);
            }
        }
        else {
            throw new NotEnoughGoodsInShop(n-cnt,cnt,g);

        }


    }
    public Receipt getReceipt() {
        return receipt;
    }
    public void run() {
        for(Goods g:receipt.getListOfGoodsInReceipt()){
            System.out.println("Cashier: " + receipt.getCashier().getCashierName() + " is selling: " + g.getGoodsName() + " - " + g.getPrice() + " leva");
        }
        System.out.println("Cashier: " + receipt.getCashier().getCashierName() + " Total cost for the receipt: " +receipt.totalRevenue() + " leva");

    }

}
