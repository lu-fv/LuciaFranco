import INTERRFACES.SpecialDiscount;

public class Printer extends ComputerProducts implements SpecialDiscount {

    private Integer printerByMin;
    private Float  discountPrice;
    public Printer(Integer stock, Float price, String name, String producer, Integer printerByMin) {
        super(stock, price, name, producer);
        this.printerByMin = printerByMin;
    }

    public Integer getPrinterByMin() {
        return printerByMin;
    }

    public void setPrinterByMin(Integer printerByMin) {
        this.printerByMin = printerByMin;
    }

    @Override
    public float SpecialDiscount(float price, float discountPrice) {
        float discount = (float) ((price * discountPrice) / 100.0);
        float priceWithDiscount = price - discountPrice;
        return priceWithDiscount;
    }


    @Override
    public String toString() {
        return super.toString() +
                "precio con dto " + SpecialDiscount(this.price,10f )+
                " PriceIncreace: $ " + this.updatePrice(15f) +
                " printerByMin= " + printerByMin +
                "} ";
    }
}
