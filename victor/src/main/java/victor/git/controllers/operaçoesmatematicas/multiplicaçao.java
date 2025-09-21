package victor.git.controllers.operaçoesmatematicas;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class multiplicaçao {
    //http://localhost:8080/math/mult/3/5

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(
            @PathVariable("numberOne") Double numberOne,
            @PathVariable("numberTwo") Double numberTwo) {
        return numberOne * numberTwo;
    }
}
