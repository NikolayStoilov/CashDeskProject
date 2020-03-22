package JavaProject;

public class NotEnoughGoodsInShop extends Exception {
    int numberOfGoods;
    Goods g;
    int numberOfGoodsThatAreNotEnough;

    public NotEnoughGoodsInShop (){

    }

    public NotEnoughGoodsInShop (int numberOfGoodsThatAreNotEnough,int numberOfGoods,Goods g){
        this.numberOfGoods=numberOfGoods;
this.numberOfGoodsThatAreNotEnough=numberOfGoodsThatAreNotEnough;
        this.g=g;
    }

    public int getNumberOfGoods() {
        return numberOfGoods;
    }

    public int getNumberOfGoodsThatAreNotEnough() {
        return numberOfGoodsThatAreNotEnough;
    }

    public Goods getG() {
        return g;
    }

    @Override
    public String toString() {
        return "NotEnoughGoodsInShop{" +
                "numberOfGoods that are not enough: = " + numberOfGoodsThatAreNotEnough + ";" + " number of Goods that are available: = " + numberOfGoods +
                ", goods=" + g +
                "} " + super.toString() ;
    }
}
