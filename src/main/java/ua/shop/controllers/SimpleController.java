package ua.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.shop.entities.Good;
import ua.shop.entities.RealBrand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SimpleController {
    @RequestMapping("/goods.do")
    public ModelAndView getGood() {
        List<Good> goods = new ArrayList<Good>();
        Good good1 = new Good("Phone", 900);
        Good good2 = new Good("TV", 1800);
        goods.add(good1);
        goods.add(good2);
        List<RealBrand> brands = new ArrayList<RealBrand>();
        RealBrand brand1 = new RealBrand("Samsung", 1000, 2);
        RealBrand brand2 = new RealBrand("LG", 1050, 5);
        brands.add(brand1);
        brands.add(brand2);
        Map<String, List<? extends Object>> models = new HashMap<String, List<? extends Object>>();
        models.put("list_of_goods", goods);
        models.put("list_of_brand", brands);
      return new ModelAndView("goods", models);
    }

    @RequestMapping("/goods2.do")
    public ModelAndView getGood2() {
        List<Good> goods = new ArrayList<Good>();
        Good good1 = new Good("Phone", 900);
        Good good2 = new Good("TV", 1800);
        goods.add(good1);
        goods.add(good2);
        return new ModelAndView("goods", "list_of_goods", goods);
    }


}
