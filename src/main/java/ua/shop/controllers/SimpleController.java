package ua.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.shop.entities.Good;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SimpleController {
    @RequestMapping("/goods.do")
    public ModelAndView getGood() {
        List<Good> goods = new ArrayList<Good>();
        Good good1 = new Good("Phone", 900);
        Good good2 = new Good("TV", 1800);
        goods.add(good1);
        goods.add(good2);
        return new ModelAndView("goods", "list_of_goods", goods);
    }
}
