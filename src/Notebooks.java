public class Notebooks extends ComputerProducts{

    private Integer GB;

    public Notebooks(Integer stock, Float price, String name, String producer, Integer GB) {
        super(stock, price, name, producer);
        this.GB = GB;
    }

    public Integer getGB() {
        return GB;
    }

    public void setGB(Integer GB) {
        this.GB = GB;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                 super.toString() +
                " PriceIncreace: $ " + this.updatePrice(20f) +
                "GB=" + GB +
                "} ";
    }
}
