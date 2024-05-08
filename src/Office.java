public abstract class Office {
    public Integer stock;
    public Float price;
    public String name;

    public Office(Integer stock, Float price, String name) {
        this.stock = stock;
        this.price = price;
        this.name = name;

    }

    public Office() {
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float updatePrice(float percent) {
        float increace =  (this.price * (percent / 100));
        return this.price += increace;
    }
    @Override
    public String toString() {
        return "Office{" +
                "stock=" + stock +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }


}
