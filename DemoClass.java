
class Item {

    int shippingWeight;
    String description;

    // additional
    int price;
    int quantity;
    int TAX = 13;

    Item(int shippingWeight, String description, int price, int quantity) {
        this.shippingWeight = shippingWeight;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    int getPriceForQuantity() {
        return this.price * this.quantity;
    }

    int getTax() {
        return (this.TAX / 100) * this.price;
    }

    int inStock() {
        return quantity;
    }

}

class DemoClass {
    public static void main(String[] args) {

        Item i = new Item(50, "this is nice item", 100, 5);

    }
}