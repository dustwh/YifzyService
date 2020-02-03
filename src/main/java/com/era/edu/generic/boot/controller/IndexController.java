package com.era.edu.generic.boot.controller;

import com.era.edu.generic.boot.domain.*;
import com.era.edu.generic.boot.service.UniversityService;
import com.era.edu.generic.boot.service.ZhuanYeJiHuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
//这个类的所有查询是为了最快实现业务的糟糕写法，都需要后续优化。
@Controller
public class IndexController {
    @Autowired
    private StudentLoginRepository studentLoginRepository;
    @Autowired
    private StuevaRepository stuevaRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private UniversityService universityService;
    @Autowired
    private ZhuanYeJiHuaService zhuanYeJiHuaService;
    @RequestMapping("/")
    public String toR1(HttpServletResponse response){
        try {
            String strNewUrl_stu = "https://www.yifzy.com/teacher";
            response.sendRedirect(strNewUrl_stu);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
//    @RequestMapping("")
//    public String toR2(HttpServletResponse response){
//        System.out.println("into''");
//        try {
//            String strNewUrl_stu = "https://www.yifzy.com/teacher";
//            response.sendRedirect(strNewUrl_stu);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }



    @RequestMapping("/{institution_name}")
    public String toIndex(@PathVariable("institution_name") String institution_name, HttpServletResponse response, HttpServletRequest request, HttpSession session, Model model) {

        boolean is_not_in_ins_list=true;
//        System.out.println("boolean init:"+is_not_in_ins_list);
        String [] ins_names = {"bohai","jinchuang","lexue","lixue","longcheng","pan","qidu","ruicheng","shanshan","student","tiancheng","xinxueba","yuanmeng","taidou","silu","fc","future_thing","huize","zhidian","xinshidai","juneng","threesixpage"};
        for (int i=0;i<ins_names.length;i++){
            if (ins_names[i].equals(institution_name)){
                is_not_in_ins_list=false;
                break;
            }
        }
//        System.out.println("boolean result:"+is_not_in_ins_list);
        String institution_path = request.getServletPath();
        int institution_path_length =institution_path.length();
        String if_slash = institution_path.substring(institution_path_length-1,institution_path_length);
        if ("/".equals(if_slash)){
//            System.out.println("with slash");
            institution_path = institution_path.substring(0,institution_path_length-1);
//            System.out.println("new ServletPath"+institution_path);
//            String strNewUrl_stu = "http://" + request.getServerName() + institution_path;
            String strNewUrl_stu = "http://" + request.getServerName() +":8080"+institution_path;
//            System.out.println("print URL:"+strNewUrl_stu);
            try {
                response.sendRedirect(strNewUrl_stu);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        if (institution_name.equals("404")||institution_name.equals("500")||is_not_in_ins_list ){
//            System.out.println(institution_name);
//            System.out.println("no param");
//            try {
////                String strNewUrl_stu = "http://" + request.getServerName() + request.getContextPath()+"/student";//this is in the server
//                String strNewUrl_stu2 = "http://" + request.getServerName() + request.getContextPath()+":8080/student";
//                System.out.println(strNewUrl_stu2);
//                response.sendRedirect(strNewUrl_stu2);
//            }catch (IOException e) {
//                e.printStackTrace();
//            }
            return "No_Institution";
        }else {
//            System.out.println("institution_name="+institution_name);
            model.addAttribute("inst_name",institution_name);
        }





//        if(!request.getRequestURL().toString().startsWith("https")){
        if(!(1==1)){
//            System.out.println("http->https://"+request.getServerName() + request.getContextPath()+"/"+institution_name);
            String strNewUrl = "https://" + request.getServerName() + request.getContextPath()+"/"+institution_name;
            try {
//                System.out.println("sendredirect之前");
                response.sendRedirect(strNewUrl);
//                System.out.println("sendredirect之后");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }else {
//            System.out.println("qweqweqwe"+request.getServerName());
//            System.out.println("qweqweqwe"+request.getContextPath());

//            System.out.println("already https");
            if (session.getAttribute("stuId")==null){
//                System.out.println("未登陆");
                model.addAttribute("stuName",null);
                return "index";
            }else {
                String next_dest = (String) session.getAttribute("next_dest");
                session.setAttribute("next_dest","");
                int stuId = (int) session.getAttribute("stuId");
                StudentLoginBean studentLoginBean = studentLoginRepository.findOne(stuId);
                String stuName = studentLoginBean.getStuName();
                Stueva stueva = stuevaRepository.findByStuId(stuId);
                Student student=studentRepository.findOne(stuId);
                String h_status_code = String.valueOf(stueva.getIsHol());
                String e_status_code = String.valueOf(stueva.getIsEnn());
                String release = String.valueOf(stueva.getIsRealised());
                String is_si= String.valueOf(stueva.getIsSi());
                String is_msslm= String.valueOf(stueva.getIsMsslm());
                String is_mssmhs= String.valueOf(stueva.getIsMssmhs());
                String is_msea= String.valueOf(stueva.getIsMsea());
                String is_tms= String.valueOf(stueva.getIsTms());
                String is_cct= String.valueOf(stueva.getIsCct());
                String is_hs= String.valueOf(stueva.getIsHs());
                String is_pf= String.valueOf(stueva.getIsPf());
                String is_new_ce=student.getStuIsNewexam();


                if (Integer.parseInt(student.getStuSex())==0||(student.getStuHighschoolCode()!=null&&Integer.parseInt(student.getStuHighschoolCode())==0)||student.getStuHighschoolCode()==null||student.getStuYear()==null||student.getStuHighschoolClass()==null||Integer.parseInt(student.getStuSubjectCode())==0||Integer.parseInt(student.getStuRace())==0||student.getStuHeight()==null||Integer.parseInt(student.getStuEyesight())==9||Integer.parseInt(student.getStuColourWeakness())==9||student.getStuPoint()==null){
                    model.addAttribute("if_info_compelet","0");
                }else {
                    model.addAttribute("if_info_compelet","1");
                }

                if (h_status_code.equals("1")&&e_status_code.equals("1")&&release.equals("1")){
                    model.addAttribute("JI_status","做答完毕");
                    model.addAttribute("PT_status","做答完毕");
                    model.addAttribute("report_status","1");
                    model.addAttribute("reason","0");
                }else{
                    model.addAttribute("report_status","0");
                    if (release.equals("1")){
                        model.addAttribute("JI_status","做答完毕");
                        model.addAttribute("PT_status","立即测试");
//                        model.addAttribute("reason","<h5 style='color: #eb4f37'>未进行性格分析测试</h5>");
                        model.addAttribute("reason","未进行性格分析测试");
                    }else {
                        if (h_status_code.equals("1")&&e_status_code.equals("1")){
                            model.addAttribute("JI_status","做答完毕");
                            model.addAttribute("PT_status","做答完毕");
                            model.addAttribute("reason","教师未发布");
                        }
                        if (h_status_code.equals("1")&&e_status_code.equals("0")){
                            model.addAttribute("JI_status","做答完毕");
                            model.addAttribute("PT_status","立即测试");
                            model.addAttribute("reason","未进行性格分析测试&nbsp;&nbsp;教师未发布");
                        }
                        if (h_status_code.equals("0")&&e_status_code.equals("1")){
                            model.addAttribute("JI_status","立即测试");
                            model.addAttribute("PT_status","做答完毕");
                            model.addAttribute("reason","未进行职业兴趣测试&nbsp;&nbsp;教师未发布");
                        }
                        if (h_status_code.equals("0")&&e_status_code.equals("0")){
                            model.addAttribute("JI_status","立即测试");
                            model.addAttribute("PT_status","立即测试");
                            model.addAttribute("reason","未进行职业兴趣测试&nbsp;&nbsp;未进行性格分析测试&nbsp;&nbsp;教师未发布");
                        }
                    }
                }


                if ("1"==is_si){
                    model.addAttribute("si_status","做答完毕");
                }else {
                    model.addAttribute("si_status","1");
                }
                if ("1"==is_msslm){
                    model.addAttribute("msslm_status","做答完毕");
                }else {
                    model.addAttribute("msslm_status","1");
                }
                if ("1"==is_mssmhs){
                    model.addAttribute("mssmhs_status","做答完毕");
                }else {
                    model.addAttribute("mssmhs_status","1");
                }
                if ("1"==is_msea){
                    model.addAttribute("msea_status","做答完毕");
                }else {
                    model.addAttribute("msea_status","1");
                }
                if ("1"==is_tms){
                    model.addAttribute("tms_status","做答完毕");
                }else {
                    model.addAttribute("tms_status","1");
                }
                if ("1"==is_cct){
                    model.addAttribute("cct_status","做答完毕");
                }else {
                    model.addAttribute("cct_status","1");
                }
                if ("1"==is_hs){
                    model.addAttribute("hs_status","做答完毕");
                }else {
                    model.addAttribute("hs_status","1");
                }
                if ("1"==is_pf){
                    model.addAttribute("pf_status","做答完毕");
                }else {
                    model.addAttribute("pf_status","1");
                }
                model.addAttribute("is_new_ce",is_new_ce);

                model.addAttribute("next_dest",next_dest);
                model.addAttribute("stuId",stuId);
                model.addAttribute("stuName",stuName);
                model.addAttribute("stuId",stuId);
                model.addAttribute("release",release);

                Student studentemp = studentRepository.findOne(stuId);
                String stuSubjectCode = studentemp.getStuSubjectCode();
                model.addAttribute("guideSubjectList", stuevaRepository.findByStuId(stuId).getGuideSubjectList().equals("")?new ArrayList():stuevaRepository.findByStuId(stuId).getGuideSubjectList().split(","));
                model.addAttribute("univercitys", universityService.getShouCangUniversity(String.valueOf(stuId),stuSubjectCode,true));
                model.addAttribute("majors", zhuanYeJiHuaService.getZhuanYeOfShouCang(String.valueOf(stuId),stuSubjectCode,true));
                return "index";
            }
//            return "index";
        }
    }
}