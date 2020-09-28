class Payment {
    String customer_id;
    String name;
    String card_type;
    String card_no;

    // constructors

    Payment(String customer_id) {
        this.customer_id = customer_id;
    }

    Payment(String customer_id, String name, String card_type, String card_no) {
        this.customer_id = customer_id;
        this.name = name;
        this.card_type = card_type;
        this.card_no = card_no;
    }

    // getters
    public String getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getCard_type() {
        return card_type;
    }

    public String getCard_no() {
        return card_no;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
}

class Demo {
    public static void main(String[] args) {

        Payment p = new Payment("1");

    }
}