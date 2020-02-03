package com.era.edu.generic.boot.controller;


import com.era.edu.generic.boot.domain.StudentLoginBean;
import com.era.edu.generic.boot.domain.Student;
import com.era.edu.generic.boot.domain.StudentRepository;
import com.era.edu.generic.boot.domain.StudentLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private StudentLoginRepository studentLoginRepository;
    @Autowired
    private StudentRepository studentRepository;

//    old login page
//    @RequestMapping("/login")
//    public String toLogin() {
//        return "common/login";
//    }

//    login
    @ResponseBody
    @RequestMapping("/findUser")
    public String verifyLogin(HttpSession session, String login_username, String login_password,String next_dest){
        StudentLoginBean student = studentLoginRepository.findByStuTel(login_username);
        if (student!=null){
            if (login_password.equals(student.getStuPassword())){
                session.setAttribute("stuId",student.getStuId());
                System.out.println("===================================================================================================================================================================:"+next_dest);
                session.setAttribute("next_dest",next_dest);
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------user want to go:"+next_dest);
                return "success";
            }else {
                System.out.println("from index-para pwd err");
                return "pwd_err";
            }
        }else{
            System.out.println("from index-para user err");
            return "user_err";
        }
    }



    @ResponseBody
    @RequestMapping("/modPwd")
    public String modPwd(HttpSession session, String whichUser, String newPwd){
        StudentLoginBean student = studentLoginRepository.findByStuTel(whichUser);
        if (student!=null){
            if (newPwd.length()<6){
                return "short";
            }else {
                student.setStuPassword(newPwd);
                studentLoginRepository.save(student);
                session.setAttribute("stuId",student.getStuId());
                session.setAttribute("next_dest","");
                return "success";
            }
        }else{
            return "not_find";
        }
    }
    @ResponseBody
    @RequestMapping("/modPwd_v")
    public String modPwdAfterVerify(HttpSession session, String whichUser, String oldPwd, String newPwd){
        StudentLoginBean student = studentLoginRepository.findByStuTel(whichUser);
        if (student!=null){
            if(!student.getStuPassword().equals(oldPwd)){

                System.out.println("pwd_err");
                System.out.println(student.getStuPassword());
                System.out.println(oldPwd);
                return "pwd_err";
            }
            if (newPwd.length()<6){
                System.out.println("shortshort");
                return "short";
            }else {
                System.out.println("success");
                student.setStuPassword(newPwd);
                studentLoginRepository.save(student);
                session.setAttribute("stuId",student.getStuId());
                session.setAttribute("next_dest","");
                return "success";
            }
        }else{
            System.out.println("not_find");
            return "notFind";
        }
    }

//    to user-info
    @ResponseBody
    @RequestMapping("/user-info")
    public String toSwitch(HttpSession session){
        if (session.getAttribute("stuId")==null){
            return "timeout";
        }
        System.out.println("2");
        return "success";
    }

//    to logout
    @ResponseBody
    @RequestMapping("/logout")
    public String toLogout(HttpSession session, HttpServletResponse response){
        session.invalidate();
        return "success";
    }

}