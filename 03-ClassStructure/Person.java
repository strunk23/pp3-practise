public class Person {
    String name;
    float weight;
    float height;
    double BMI;
    String correctBMI;

    public Person(String Name) {
        name = Name;
    }

    public Person(String Name, float Weight, float Height){
        name = Name;
        weight = Weight;
        height = Height;
    }

    void setWeightAndHeight(float Weight, float Height) {
        weight = Weight;
        height = Height;
    }

    void calculateBMI() {
        BMI = (weight/Math.pow(height, 2))*10000;
        if (BMI <= 18.5  & BMI > 0) {
            correctBMI = "BMI too low";
        } else if (BMI >= 24.9 & BMI > 0) {
            correctBMI = "BMI too high";
        } else {
            correctBMI = "BMI correct";
        }
    }

    public String displayRecord() {
        return (name + " ," + weight + "kg ," + height + "cm ,BMI: " + BMI + " ," + correctBMI);
    }

}
