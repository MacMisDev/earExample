package pl.edu.ug.inf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.ug.inf.service.CalcService;

@Controller("calcController")
public class CalcControllerImpl implements CalcController{

    @Autowired
    private CalcService calcService;

    @Override
    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public String showHome() {

        return "home.jsp";
    }

    @Override
    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public String count(ModelMap modelMap, @RequestParam String number1, @RequestParam String number2, @RequestParam String operation) {

        try {
            modelMap.addAttribute("result", calcService.count(Double.parseDouble(number1), Double.parseDouble(number2), operation));
        } catch (NumberFormatException e) {
            modelMap.addAttribute("error", "zly format i/lub niedozwolone dzialanie");
        }
        return "home.jsp";
    }

}
