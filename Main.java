class WeatherSensor {
    double temperature;
    double humidity;

    WeatherSensor(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    void displayConditions() {
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
    }

    boolean isStormLikely() {
        return humidity > 80 && temperature > 25;
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherSensor sensor = new WeatherSensor(28.5, 85.0);
        sensor.displayConditions();
        System.out.println("Storm likely? " + sensor.isStormLikely());
    }
}
