package com.springMVC.controller.admin;

import com.springMVC.model.NewModel;
import com.springMVC.service.impl.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "newControllerOfAdmin")
public class NewController {

    @Autowired
    private NewService newService;

    @RequestMapping(value = "/quan-tri/bai-viet/danh-sach", method = RequestMethod.GET)
    public ModelAndView showList(@ModelAttribute("model") NewModel model) {
        // Chỗ này trả data trong mav về cho trang view
        ModelAndView mav = new ModelAndView("admin/new/list");
        model.setListResult(newService.findAll());
        mav.addObject("model", model);
        return mav;
    }

    @RequestMapping(value = "/quan-tri/bai-viet/chinh-sua", method = RequestMethod.GET)
    public ModelAndView editNew() {
        // Chỗ này trả data trong mav về cho trang view
        ModelAndView mav = new ModelAndView("admin/new/edit");
        return mav;
    }
}
