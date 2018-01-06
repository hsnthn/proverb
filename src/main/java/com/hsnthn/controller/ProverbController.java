package com.hsnthn.controller;

import com.hsnthn.model.Proverb;
import com.hsnthn.service.ProverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProverbController {

    @Autowired
    private ProverbService proverbService;

    @RequestMapping(value = "/search")
    public ModelAndView search(@RequestParam(value="initial", required=false, defaultValue="") String initial, Model model) throws Exception {
        model.addAttribute("initial", initial);

        List<Proverb> list = proverbService.findProverbService(initial);

        return  new ModelAndView("search","list",list);
    }

}