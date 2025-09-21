package victor.git.controllers.operaçoesmatematicas;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class soma {
    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") Double numberOne,
            @PathVariable("numberTwo") Double numberTwo) {
        return numberOne + numberTwo;

    }
}
