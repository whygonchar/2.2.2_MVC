package web.Service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private static List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 5, 2008));
        cars.add(new Car("Audi", 2, 2004));
        cars.add(new Car("Honda", 4, 1999));
        cars.add(new Car("Mercedes", 500, 1995));
        cars.add(new Car("Volvo", 60, 2010));
    }

    @Override
    public List<Car> getCars(Integer count) {
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
        return cars.subList(0,count);
    }

}
