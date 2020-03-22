package JavaProject;

public class Goods {
    private int goodsID;
    private String goodsName;
    private double price;
    private String expirationDate;

    public Goods(){

    }

    public Goods(int goodsID, String goodsName, double price, String expirationDate) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsID=" + goodsID +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
