public class ComputerProducts extends Office {

   public String producer;

    public ComputerProducts(Integer stock, Float price, String name, String producer) {
        super(stock, price, name);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return   super.toString()+

                "producer='" + producer + '\'' +
                "} ";
    }
}
