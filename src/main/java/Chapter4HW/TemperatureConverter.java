package Chapter4HW;

public class TemperatureConverter {

    public String convertTemp(int temperature, char convertTo) {
        if (convertTo == 'F') {
            return "convert to Farengeyts";
        }
        if (convertTo == 'C') {
            return "convert to Celsius";
        }
        return "Something is broken";
    }
}
