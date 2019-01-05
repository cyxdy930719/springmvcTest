package com.neuedu.web;

import com.neuedu.pojo.User;
import com.neuedu.service.UserServiceImpl;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
    private UserServiceImpl service = new UserServiceImpl();
    @RequestMapping("/list.do")
    public String list(ModelMap maps){
        List<User> lists = service.getUsers();
        maps.addAttribute("lists",lists);
        return "list";
    }
    @RequestMapping("/list1.do")
    public String list1(String name,String pwd){
        User u  = new User();
        u.setName(name);
        u.setPwd(pwd);
        service.insertOne(u);
        return "redirect:list.do";
    }
    @RequestMapping("/update.do")
    public String getOne(String username,ModelMap maps){
        User user = service.getOne(username);
        maps.addAttribute("user",user);
        return "list2";
    }
    @RequestMapping("/doupdate.do")
    public String update(String name,String pwd){
        User u = new User();
        u.setName(name);
        u.setPwd(pwd);
        service.updateOne(u);
        return "redirect:list.do";
    }
    @RequestMapping("/delete.do")
    public String deleteOne(String username){
        service.delOne(username);
        return"redirect:list.do";
    }
}
