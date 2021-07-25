package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockIsEmptyException extends Exception {

    public BeerStockIsEmptyException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed is already empty: %s", id, quantityToDecrement));
    }
}
