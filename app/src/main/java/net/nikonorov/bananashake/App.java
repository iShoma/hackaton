package net.nikonorov.bananashake;

import android.app.Application;

import com.vk.sdk.VKSdk;
import com.vk.sdk.util.VKUtil;

import java.util.ArrayList;

/**
 * Created by vitaly on 25.03.16.
 */
public class App extends Application {

    public static ArrayList<City> cities = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();

        cities.add(new City(0, "Австралия", "Сидней", "sidney", "saber/saber.g3db", 47.706944, -104.1925, 1, 5));
        cities.add(new City(1, "Австралия", "Канберра", "canberra", "saber/saber.g3db",-35.306946, 149.195,  2, 9));

        cities.add(new City(2, "Новая Зеландия", "Веллингтон", "wellington", "saber/saber.g3db", 37.39411, -97.423225, 3, 13));
        cities.add(new City(3, "Новая Зеландия", "Окленд", "auckland", "saber/saber.g3db", -37.008057, 174.79167, 2, 10));

        cities.add(new City(4, "Китай", "Пекин", "beijing", "saber/saber.g3db", 40.080112, 116.58456, 1, 4));
        cities.add(new City(5, "Китай", "Шанхай", "shanghai", "saber/saber.g3db", 31.197874, 121.33632, 2, 8));

        cities.add(new City(6, "Япония", "Токио", "tokyo", "saber/saber.g3db", 35.76472, 140.38638, 2, 10));
        cities.add(new City(7, "Япония", "Йокогама", "yokohama", "saber/saber.g3db", 35.5075, 139.6175, 3, 14));

        cities.add(new City(8, "США", "Лос-Анджелес", "la", "saber/saber.g3db", -37.40173, -72.425446,  4, 20));
        cities.add(new City(9, "США", "Нью-Йорк", "nyc", "saber/saber.g3db", 40.777245, -73.872604, 3, 14));

        cities.add(new City(10, "Канада", "Брантфорд", "brantford", "saber/saber.g3db", 43.13139, -80.3425, 1, 5));
        cities.add(new City(11, "Канада", "Колингвуд ", "collingwood", "saber/saber.g3db", 44.449165, -80.15833,  3, 15));

        cities.add(new City(12, "Египет", "Каир", "cairo", "saber/saber.g3db", 30.121944, 31.405556, 2, 10));
        cities.add(new City(13, "Египет", "Hurghada", "hurghada", "saber/saber.g3db", 27.178316, 33.799435, 2, 9));

        cities.add(new City(14, "Марокко", "Рабат", "rabat", "saber/saber.g3db", 34.051468, -6.751519, 3, 13));
        cities.add(new City(15, "Марокко", "Касабланка", "casablanca", "saber/saber.g3db", 33.367466, -7.589967, 2, 7));

        cities.add(new City(16, "Россия", "Москва", "moscow", "saber/saber.g3db", 55.97264, 37.41459, 10, 50));
        cities.add(new City(17, "Россия", "Санкт-Петербург", "piter", "saber/saber.g3db", 27.765112, -82.62697, 10, 50));

        cities.add(new City(18, "Франция", "Париж", "paris", "saber/saber.g3db", 48.969444, 2.441389, 3, 9));
        cities.add(new City(19, "Франция", "Куршевель", "courcheval", "saber/saber.g3db", 45.3967, 6.63472, 4, 19));

        VKSdk.initialize(getApplicationContext());

        VKUtil.getCertificateFingerprint(this, this.getPackageName());

    }
}
