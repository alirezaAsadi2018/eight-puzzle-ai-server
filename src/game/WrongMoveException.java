package game;

public class WrongMoveException extends ArrayIndexOutOfBoundsException {
    WrongMoveException(){
        super("Wrong Move!");
    }
}
