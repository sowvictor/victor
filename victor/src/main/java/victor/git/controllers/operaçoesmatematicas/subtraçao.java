package victor.git.controllers.operaçoesmatematicas;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class subtraçao {
    //http://localhost:8080/math/sub/3/5

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable("numberOne") Double numberOne,
            @PathVariable("numberTwo") Double numberTwo) {

        return numberOne - numberTwo;
    }
}
