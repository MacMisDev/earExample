package pl.edu.ug.inf.controller;

import org.springframework.ui.ModelMap;

public interface CalcController {

    public String showHome();
    public String count(ModelMap modelMap, String number1, String number2, String operation);
}
