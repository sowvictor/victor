package victor.git.controllers.operaçoesmatematicas;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class media {
    //http://localhost:8080/math/media/3/5

    @RequestMapping("/media/{numberOne}/{numberTwo}")
    public Double media(
            @PathVariable("numberOne") Double numberOne,
            @PathVariable("numberTwo") Double numberTwo) {
        return (numberOne + numberTwo) /2 ;
    }
}
