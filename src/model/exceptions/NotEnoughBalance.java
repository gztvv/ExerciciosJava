package model.exceptions;

import model.entities.Account;

public class NotEnoughBalance extends Exception  {
    public NotEnoughBalance(  String msg) {
        super(msg);
    }
}
