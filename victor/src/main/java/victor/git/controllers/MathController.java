package victor.git.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/math")
    public class MathController {

        //http://localhost:8080/math/sum/3/5
        @RequestMapping("/sum/{numberOne}/{numberTwo}")
        public Double sum(
                @PathVariable("numberOne") Double numberOne,
                @PathVariable("numberTwo") Double numberTwo) {
            return numberOne + numberTwo;

        }
        //http://localhost:8080/math/sub/3/5

        @RequestMapping("/sub/{numberOne}/{numberTwo}")
        public Double sub(
                @PathVariable("numberOne") Double numberOne,
                @PathVariable("numberTwo") Double numberTwo) {

            return numberOne - numberTwo;
        }

        //http://localhost:8080/math/div/3/5
        @RequestMapping("/div/{numberOne}/{numberTwo}")
        public Double div(
                @PathVariable("numberOne") Double numberOne,
                @PathVariable("numberTwo") Double numberTwo) {

            return numberOne / numberTwo;


        }
        //http://localhost:8080/mult/div/3/5

        @RequestMapping("/mult/{numberOne}/{numberTwo}")
        public Double mult(
                @PathVariable("numberOne") Double numberOne,
                @PathVariable("numberTwo") Double numberTwo) {
            return numberOne * numberTwo;
        }
        //http://localhost:8080/media/div/3/5

        @RequestMapping("/media/{numberOne}/{numberTwo}")
        public Double media(
                @PathVariable("numberOne") Double numberOne,
                @PathVariable("numberTwo") Double numberTwo) {
            return (numberOne + numberTwo) /2 ;
        }
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
