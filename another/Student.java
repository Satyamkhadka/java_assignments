class Student {

    String name;
    String id;
    int credits;

    public static void main(String[] args) {

    }

    Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.credits = 0; // initializing
    }

    String getName() {
        return this.name;
    }

    void changeName(String name) {
        this.name = name;
    }

    String getStudentID() {
        return this.id;
    }

    void addCredits(int credits) {
        this.credits = this.credits + credits;
    }

    String getLoginName() {
        return this.name;
    }

    String getStudentData() {
        return "ID: " + this.id + " " + " Name: " + this.name + " Credits: " + this.credits;
    }

}