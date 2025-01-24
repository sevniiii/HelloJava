package practice;

class Phone {
    public String model;

    public String color;

    public String chargingType;


    public Phone() {
        this.model = "iphone 14 pro";
        this.color = "흰색";
    }

    public Phone(String model, String color, String chargingType) {
        this.model = model;
        this.color = color;
        this.chargingType = chargingType;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone iphone = new Phone("iphone14", "검정색", "8핀");

        System.out.println(phone);
        System.out.println(iphone.model + " / " + iphone.color + " / " + iphone.chargingType);

    }
}
