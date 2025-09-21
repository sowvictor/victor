package victor.git.controllers.operaçoesmatematicas;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class divisao {
    //http://localhost:8080/math/div/3/5
    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double div(
            @PathVariable("numberOne") Double numberOne,
            @PathVariable("numberTwo") Double numberTwo) {

        return numberOne / numberTwo;


    }
}
