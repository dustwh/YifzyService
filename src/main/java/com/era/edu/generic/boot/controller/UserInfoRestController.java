package com.era.edu.generic.boot.controller;

import com.era.edu.generic.boot.domain.Student;
import com.era.edu.generic.boot.domain.StudentRepository;
import com.era.edu.generic.boot.domain.Stueva;
import com.era.edu.generic.boot.domain.StuevaRepository;
import com.era.edu.generic.boot.entity.University4ShouCang;
import com.era.edu.generic.boot.service.UniversityService;
import com.era.edu.generic.boot.service.ZhuanYeJiHuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserInfoRestController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StuevaRepository stuevaRepository;
    @Autowired
    private UniversityService universityService;
    @Autowired
    private ZhuanYeJiHuaService zhuanYeJiHuaService;
//    @RequestMapping("/UserInfo")
    public ModelAndView toStudentManage(HttpSession session, HttpServletResponse response) {

        if (session.getAttribute("stuId")==null){
            try {
                response.sendRedirect("/");
                return new ModelAndView();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        ModelAndView mv = new ModelAndView("auth/manageStudent");

//        mv.addObject("students", studentRepository.findAll());
//        System.out.println(studentRepository.queryByTchrid("0000000001"));
//        System.out.println((String)session.getAttribute("stuId"));
        Integer stuId = (Integer) session.getAttribute("stuId");

        System.out.println(stuId);
        System.out.println("8");
//        Student student = studentRepository.findOne(stuId);
        mv.addObject("studentname", studentRepository.findOne(stuId).getStuName());
        mv.addObject("stuId", stuId);
        System.out.println("9");
        return mv;
    }
    @RequestMapping("/findStuId/{stuId}")
    public Student findStuById(@PathVariable Integer stuId) {
//        studentRepository.queryById(stuId);
        return studentRepository.findOne(stuId);
    }

    @RequestMapping("/SaveInfo")
    public String SaveInfo(Integer stuId,String stuTel,String stuName,String stuEmail,String stuQq,String stuSex,String stuProvinceCode,String stuCityCode,String stuDistrictCode,String stuHighschoolCode,String stuYear,String stuHighschoolClass,String stuRace,String stuSubjectCode,String stuLanguageCode,String stuHeight,String stuPoint,String stuEyesight,String stuColourWeakness,String stuPointDetail,String stuGoodSubject,String stuIntentSubject,String stuIntentCollege,String stuIntentCity,String stuAfterGraduation,String stuSpecialType,String stuOtherInfo,String isNewSe,String stuPointDetailNewexam,String stuGoodSubjectNewexam){
        Student stu = studentRepository.findOne(stuId);
        stu.setInfo(stuTel,
                stuName,
                stuTel,//新建用户初始密码与电话相同
                stuSubjectCode,
                stuSex,
                stuRace,
                stuHeight,
                stuEmail,
                stuQq,
                stuLanguageCode,
                stuPoint,
                stuProvinceCode,stuCityCode,stuDistrictCode,
                stuEyesight,
                stuColourWeakness,
                stuPointDetail,
                stuHighschoolCode,
                stuYear,
                stuHighschoolClass,
                stuGoodSubject,
                stuIntentSubject,
                stuIntentCollege,
                stuIntentCity,
                stuAfterGraduation,
                stuSpecialType,
                stuOtherInfo,
                isNewSe,
                stuPointDetailNewexam,
                stuGoodSubjectNewexam,"1,1,1,0,0,0","1","");
        studentRepository.save(stu);
        return "ok";
    }
    @RequestMapping(value="/updateStudent", method = RequestMethod.POST)
    public String findStuById(HttpSession session, HttpServletResponse response ,@RequestParam("stuId") Integer stuId,
                              @RequestParam("stuTel") String stuTel,
                              @RequestParam("stuName") String stuName,
//                              @RequestParam("stuPassword") String stuPassword,
                              @RequestParam("stuSubjectCode") String stuSubjectCode,
                              @RequestParam("stuSex") String stuSex,
                              @RequestParam("stuRace") String stuRace,
                              @RequestParam("stuHeight") String stuHeight,
                              @RequestParam("stuEmail") String stuEmail,
                              @RequestParam("stuQq") String stuQq,
                              @RequestParam("stuLanguageCode") String stuLanguageCode,
                              @RequestParam("stuPoint") String stuPoint,
                              @RequestParam("stuProvinceCode") String stuProvinceCode,
                              @RequestParam("stuCityCode") String stuCityCode,
                              @RequestParam("stuDistrictCode") String stuDistrictCode,
                              @RequestParam("stuEyesight") String stuEyesight,
                              @RequestParam("stuColourWeakness") String stuColourWeakness,
                              @RequestParam("stuPointDetail") String stuPointDetail,
                              @RequestParam("stuHighschoolCode") String stuHighschoolCode,
                              @RequestParam("stuYear") String stuYear,
                              @RequestParam("stuHighschoolClass") String stuHighschoolClass,
                              @RequestParam("stuGoodSubject") String stuGoodSubject,
                              @RequestParam("stuIntentSubject") String stuIntentSubject,
                              @RequestParam("stuIntentCollege") String stuIntentCollege,
                              @RequestParam("stuIntentCity") String stuIntentCity,
                              @RequestParam("stuAfterGraduation") String stuAfterGraduation,
                              @RequestParam("stuSpecialType") String stuSpecialType,
                              @RequestParam("stuOtherInfo") String stuOtherInfo,
                              @RequestParam("stuIsNewexam") String stuIsNewexam,
                              @RequestParam("stuPointDetailNewexam") String stuPointDetailNewexam,
                              @RequestParam("stuGoodSubjectNewexam") String stuGoodSubjectNewexam)
    {
        if (session.getAttribute("stuId")==null){
            return "timeout";
        }
        if (session.getAttribute("stuId")!=null){
            System.out.println("OK");
            Student stu = new Student();
            if(stuProvinceCode.equals("0000000000")){
                stuProvinceCode="000000";
                stuCityCode="000000";
                stuDistrictCode="000000";
            }
            if (stuId==null){
//            stu.setStuId(null);
//            stu.setStuId(studentManageService.getNewStuid());
                stu.setStuTchrId((String)session.getAttribute("stuId"));
                System.out.println("getID");
//            stu.setStuPassword(stuTel);
                stu.setInfo(stuTel,
                        stuName,
                        stuTel,//新建用户初始密码与电话相同
                        stuSubjectCode,
                        stuSex,
                        stuRace,
                        stuHeight,
                        stuEmail,
                        stuQq,
                        stuLanguageCode,
                        stuPoint,
                        stuProvinceCode,stuCityCode,stuDistrictCode,
                        stuEyesight,
                        stuColourWeakness,
                        stuPointDetail,
                        stuHighschoolCode,
                        stuYear,
                        stuHighschoolClass,
                        stuGoodSubject,
                        stuIntentSubject,
                        stuIntentCollege,
                        stuIntentCity,
                        stuAfterGraduation,
                        stuSpecialType,
                        stuOtherInfo,
                        stuIsNewexam,
                        stuPointDetailNewexam,
                        stuGoodSubjectNewexam,"0,0,0,0,0,0","1",""
                );

            }else {
                System.out.println("id is"+stuId);
                stu = studentRepository.findOne(stuId);
                stu.setInfo(stuTel,
                        stuName,
                        stu.getStuPassword(),
                        stuSubjectCode,
                        stuSex,
                        stuRace,
                        stuHeight,
                        stuEmail,
                        stuQq,
                        stuLanguageCode,
                        stuPoint,
                        stuProvinceCode,stuCityCode,stuDistrictCode,
                        stuEyesight,
                        stuColourWeakness,
                        stuPointDetail,
                        stuHighschoolCode,
                        stuYear,
                        stuHighschoolClass,

                        stuGoodSubject,
                        stuIntentSubject,
                        stuIntentCollege,
                        stuIntentCity,
                        stuAfterGraduation,
                        stuSpecialType,
                        stuOtherInfo,
                        stuIsNewexam,
                        stuPointDetailNewexam,
                        stuGoodSubjectNewexam,
                        "1,1,1,0,0,0","1",""
                );
                System.out.println("set");
            }



            if (stuHeight==""){
                stu.setStuHeight(null);
            }
            if (stuPoint==""){
                stu.setStuPoint(null);
            }
//        if(stuPointPolicyAddpoint==""){
//            stu.setStuPointPolicyAddpoint(null);
//        }
            if(stuHighschoolClass==""){
                stu.setStuHighschoolClass(null);
            }
            if(stuYear==""){
                stu.setStuYear(null);
            }
            System.out.println(stu);
            studentRepository.save(stu);

            Integer idInt = studentRepository.findStudentByStuTel(stu.getStuTel()).getStuId();
            if(stuId==null){
                stuevaRepository.save(new Stueva(idInt,'0','0', "000000000", "0,0,0,0,0,0",'0',"","0,0,0,0,0,0,0,0","","",'0',"","",'0',"",'0',"",'0',"",'0',"",'0',0,'0',"",'0',""));
            }
            return idInt.toString();
        }else {
            return "timeout";
        }


    }
    @RequestMapping("/deleteStudent")
    public String deleteById(@RequestParam("stuId") Integer stuId) {
        try {
            stuevaRepository.findByStuId(stuId).getEvaId();
        }catch (NullPointerException e){
            studentRepository.delete(stuId);
            return "success";
        }
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        if(stueva.getIsEnn()=='1'||stueva.getIsEnn()=='1'){
            return "cantdelete";
        }else {
            stuevaRepository.delete(stueva.getEvaId());
            studentRepository.delete(stuId);
            return "success";
        }

    }
    @RequestMapping(value="/findAllFavourite", method = RequestMethod.POST)
    public Object findAllFavourite(HttpSession session, HttpServletResponse response ,@RequestParam("stuId") Integer stuId,@RequestParam("stuSubjectCode") String stuSubjectCode){
        if (session.getAttribute("id")==null){
            return "timeout";
        }
//        shouCangRepository.findAllByYhid(stuId.toString());
//        ShouCang shouCang = shouCangRepository.findAllByYhid(stuId.toString());
//        List<University4ShouCang> shouCangList = universityService.getShouCangUniversity(stuId.toString(),"5",true);
//        System.out.println(shouCangList.get(0).getDx_yxdm());
//        stueva.setIsRealised(isRealised);
//        stuevaRepository.save(stueva);
//        return shouCangRepository.findAllByYhid(stuId.toString());
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("univercitys", universityService.getShouCangUniversity(stuId.toString(),stuSubjectCode,true));
        resultMap.put("majors", zhuanYeJiHuaService.getZhuanYeOfShouCang(stuId.toString(),stuSubjectCode,true));
//        rt.setData(resultMap);
        return resultMap;
    }
    //    public ModelAndView guideStudent(HttpSession session, @RequestParam("stuId" required=false) String stuId){

}
