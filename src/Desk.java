public class Desk extends Furniture{
    private float height;
    private float wide;

    public Desk(Integer stock, Float price, String name, float height, float wide) {
        super(stock, price, name);
        this.height = height;
        this.wide = wide;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWide() {
        return wide;
    }

    public void setWide(float wide) {
        this.wide = wide;
    }

    @Override
    public String toString() {
        return "Desk{" +
                super.toString()+
                "height=" + height +
                ", wide=" + wide +
                " PriceIncreace: $ " + this.updatePrice(10f) +
                "} " ;
    }
}
