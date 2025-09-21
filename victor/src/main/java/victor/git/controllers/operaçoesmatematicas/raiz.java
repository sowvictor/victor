package victor.git.controllers.operaçoesmatematicas;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class raiz {
    //http://localhost:8080/raiz/5
    @RequestMapping("/raiz/{number}")
    public Double raiz(
            @PathVariable("number") Double number) {

        if (number < 0) {
            throw new UnsupportedOperationException("It is not possible to get the square root of a negative number!");
        }

        return Math.sqrt(number);
    }
}
