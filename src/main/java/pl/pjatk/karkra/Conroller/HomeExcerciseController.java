package pl.pjatk.karkra.Conroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeExcerciseController {

    @GetMapping("{someValue}")
    public ResponseEntity<Car> somevaluePathVariable (@PathVariable String someValue){
        return ResponseEntity.ok(new Car(someValue));
    }
    @GetMapping("")
    public ResponseEntity<Car> somevalueRequestParam (@RequestParam String someValue){
        return ResponseEntity.ok(new Car(someValue));
    }

    @PutMapping("{someValue}")
    public ResponseEntity<String> inputCar(@RequestBody Car car, @PathVariable String someValue){
        return ResponseEntity.ok("@Request Body: " + car.getName() +"\n@Path Variable: " + someValue);
    }

    @PostMapping("")
    public ResponseEntity<Car> inputCar(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("{someValue}")
    public ResponseEntity<Car> deleteCar(@PathVariable String someValue){
        return ResponseEntity.ok().build();
    }

}
