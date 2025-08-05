package ch05_package_inheritance.general.myhealth;

public class Health extends Human{
    private double s_weight = 0.0;
    private double fatrate = 0.0;
    private String result = null;

    public Health(String name, String gender, double height, double weight) {
        super(name, gender, height, weight);
        this.s_weight = s_weight;
        this.fatrate = fatrate;
        this.result = result;
    }
}
