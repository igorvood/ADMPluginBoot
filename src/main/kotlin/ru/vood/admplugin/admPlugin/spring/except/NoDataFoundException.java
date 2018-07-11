package ru.vood.admplugin.admPlugin.spring.except;

public class NoDataFoundException extends CoreExeption {

    public NoDataFoundException() {
        super("Данные не найдены");
    }
}
