package Assigment;

public class ques1 {
	
    public static class Info {
        String name;
        int age;
        String city;
        int pincode;

        public Info(String name, int age, String city, int pincode) {
            this.name = name;
            this.age = age;
            this.city = city;
            this.pincode = pincode;
        }

        public void print_info() {
            System.out.println(name + " " + age + " " + city + " " + pincode);
        }
    }

    public static void main(String[] args) {
        // WAP to print your name, age, city, and pin code on the screen (Using Class)
        Info in = new Info("Paramnoor", 20, "Jammu", 180011);
        in.print_info();
    }
}
