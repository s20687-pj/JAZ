package pl.pjatk.karkra.Conroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/test")
@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloController(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> findCar(){
        return ResponseEntity.ok(new Car("hello"));
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> someValue(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/abc")
    public ResponseEntity<String> somevalueReqparam (@RequestParam String someValue){
        return ResponseEntity.ok(someValue);
    }

    @PostMapping("model")
    public ResponseEntity<Car> inputCar(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }
}
