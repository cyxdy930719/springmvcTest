package com.neuedu.web;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller/*扫描进handlemapping处理请求*/
public class WebTest {
    /*HttpServletRequest ModelMap Model Map都可以放值，modelmap常用*/
    /*@RequestMapping("/a.do")
    public String web(HttpServletRequest request){
        request.setAttribute("a","dsafsfsfs");
        return "a";
    }*/
    @RequestMapping("/a.do")
    public String web(ModelMap maps){
        maps.addAttribute("a","dsad sdasdada");
        return "a";
    }
    @RequestMapping("/b.do")
    public String b(@RequestParam("a") String name, String pwd){
        System.out.println(name+"   "+pwd);
        return "b";
    }
    /*@RequestMapping("/b.do")
    public String b(User user){
        System.out.println(user.getName()+user.getPwd());
        return "b";
    }*/
    @RequestMapping("/list.do")
    public String list(){

        return "list";
    }
}
