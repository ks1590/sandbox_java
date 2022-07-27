public class Body1 {
    double height;
    double weight;
 
   public Body1(double h, double w) {
        set(h, w);
    }

    public void set(double h, double w) {
        height = h;
        weight = w;
    }

    public double calcStdWeight() {
        double bmi = weight / (Math.pow(height/100, 2));
        return bmi;
    }

    public void printMessage(double bmi) {
        String result = "";
        if(bmi < 18.5) {
            result = "underweight";
        } else if(bmi >= 25.0) {
            result = "overweight";
        } else {
            result = "normal";
        }
        
        System.out.println(String.format("%.1f", bmi));
        System.out.println(result);
    }
}