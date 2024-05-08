import INTERRFACES.SpecialDiscount;

public class Chairs extends Furniture implements SpecialDiscount {
    private Integer wheels;

    public Chairs(Integer stock, Float price, String name, Integer wheels) {
        super(stock, price, name);
        this.wheels = wheels;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }


    @Override
    public float SpecialDiscount(float price, float discountPrice) {

        float discount = (float) ((price * discountPrice) / 100.0);
        float priceWithDiscount = price - discountPrice;
        return priceWithDiscount;
    }


    @Override
    public String toString() {
        return "Chairs{" +
                super.toString() +
                " PriceIncreace: $ " + this.updatePrice(5f) +
                " precio con dto $ " + SpecialDiscount(200f,20f )+
                " wheels= " + wheels +
                "} ";
    }
}
