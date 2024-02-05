import com.lianafinaritra.buildpattern.model.Car;
import com.lianafinaritra.buildpattern.model.CarBuilder;
import com.lianafinaritra.buildpattern.model.Director;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {
    @Test
    public void builder_car_ok(){
        Director newClient = new Director();
        CarBuilder newCarBuilder = new CarBuilder();
        newCarBuilder.setSeats(5);
        newCarBuilder.setGPS("x: 10 y: 80");
        newCarBuilder.setTripComputer("SUV Trip Computer");
        Car newCar = newCarBuilder.getResult();
        newClient.makeSUV(newCarBuilder);

        assertEquals("SUV Car", newCar.getEngine().getName());
        assertEquals(5, newCar.getSeats());
        assertEquals("x: 10 y: 80", newCar.getGps());
        assertEquals("SUV Trip Computer", newCar.getTripComputer());
    }
}

