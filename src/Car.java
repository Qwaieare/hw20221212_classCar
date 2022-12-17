import java.util.Arrays;
import java.util.*;
public class Car {

    // Определяем свойства класса
    public String brand; // марка автомобиля
    public String model; // модель автомобиля
    public String color; // цвет кузова
    public String productionCountry; // страна сборки
    public double engineVolume; // объем двигателя в литрах
    public int productionYear; // год производства

    // Конструктор
    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
        if (productionYear >= 2001) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        }
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (engineVolume >= 1.6) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
      }
    // Определяем функции класса
      public String toString() {
          return "Автомобиль марки " +
                  this.brand + ", модель " +
                  this.model + ", год выпуска " +
                  this.productionYear + ", страна сборки " +
                  this.productionCountry + ", цвет кузова " + this.color +
                  ", объем двигателя в литрах " + this.engineVolume;
            }

}
