class Customer {
    String name, address, card_number;
    int pin;

    public static void main(String[] args) {
        System.out.println("Running successfully..");
    }

    Customer(String name, String address, String card_number, int pin) {
        this.name = name;
        this.address = address;
        this.card_number = card_number;
        this.pin = pin;
    }

    boolean verifyPassword(int pin) {
        if (this.pin == pin) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

}