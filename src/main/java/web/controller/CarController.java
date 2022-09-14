package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;

@Controller
public class CarController {
    @Autowired
    private Service service;

    public CarController(Service service) {
        this.service = service;
    }
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "amount", required = false, defaultValue = "5") int amount, ModelMap model) {
        model.addAttribute("getCars", service.getCars(amount));
        return "/cars";

    }
}
