package com.era.edu.generic.boot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.era.edu.generic.boot.domain.*;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;
//import 4 needed
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.Security;


//分包分层不合理，时间充裕时优化
@Controller
public class EvaController {
    @Autowired
    private StudentLoginRepository studentLoginRepository;
    @Autowired
    private StuevaRepository stuevaRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ThreeSixRepository threeSixRepository;
    @Autowired
    private SubInterestRepository subInterestRepository;
    @Autowired
    private HolQuestionRepository holQuestionRepository;
    @Autowired
    private EnnQuestionRepository ennQuestionRepository;



    @RequestMapping("splogout")
    public String SpLogout(Model model, HttpSession session,HttpServletResponse response){
        session.invalidate();
        model.addAttribute("h_status","请先登录");
        model.addAttribute("e_status","请先登录");
        try {
            response.sendRedirect("./eva/StartPersonelTest");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "PersonelTest";
    }

    @RequestMapping("/StartPersonelTest")
    public String toStartPersonelTest(HttpServletRequest request, HttpSession session, Model model, HttpServletResponse response) {

        System.out.println(request.getRequestURL().toString());
        if (session.getAttribute("stuId")==null){
            model.addAttribute("stuName",null);
            model.addAttribute("JI_status","请先登录");
            model.addAttribute("PT_status","请先登录");
            return "PersonelTest";
        }else {
            int stuId = (int) session.getAttribute("stuId");
            System.out.println("StartPersonelTest.toStartPersonelTest(): current user:"+stuId);
            StudentLoginBean studentLoginBean = studentLoginRepository.findOne(stuId);
            String stuName = studentLoginBean.getStuName();
            char h_status_code = stuevaRepository.findByStuId(stuId).getIsHol();
            char e_status_code = stuevaRepository.findByStuId(stuId).getIsEnn();
            char release =stuevaRepository.findByStuId(stuId).getIsRealised();
//            Student student=studentRepository.findStudentByStuTel(studentLoginBean.getStuTel());
            Student student=studentRepository.findOne(stuId);
            if (student.getStuEmail().equals("")||"".equals(student.getStuQq())||Integer.parseInt(student.getStuSex())==0||Integer.parseInt(student.getStuHighschoolCode())==0||student.getStuYear()==null||student.getStuHighschoolClass()==null||Integer.parseInt(student.getStuSubjectCode())==0||Integer.parseInt(student.getStuRace())==0||student.getStuHeight()==null||Integer.parseInt(student.getStuEyesight())==9||Integer.parseInt(student.getStuColourWeakness())==9||student.getStuPoint()==null){
                model.addAttribute("info","为了更加准确的生成报告，请您首先完善个人信息");
                try {
                    response.sendRedirect("../UserInfo");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return "/UserInfo";
            }

            if (h_status_code=='1'&&release=='0'){
                model.addAttribute("JI_status","做答完毕待审阅");
            }else if (h_status_code=='1'&&release=='1'){
                model.addAttribute("JI_status","查看报告");
            }else {
                model.addAttribute("JI_status","立 即 测 试");
            }

            if (e_status_code=='1'){
                model.addAttribute("PT_status","做答完毕");
            }
            else if(e_status_code!='1'){
                model.addAttribute("PT_status","立 即 测 试");
            }


            model.addAttribute("stuName",stuName);
            return "PersonelTest";
        }
    }

    @RequestMapping("/StartJobInterests")
//    Holland
    public String toStartJobInterests(HttpSession session, HttpServletResponse response, Model model){
        if (session.getAttribute("stuId")==null){
            System.out.println("StartJobInterests.toStartJobInterests(): null");
            model.addAttribute("stuName",null);
            model.addAttribute("h_status","请先登录");
            model.addAttribute("e_status","请先登录");
            try {
                response.sendRedirect("./eva/StartPersonelTest");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "PersonelTest";
        }
        int stuId = (int) session.getAttribute("stuId");
        StudentLoginBean studentLoginBean = studentLoginRepository.findOne(stuId);
        String stuName = studentLoginBean.getStuName();
        char h_status_code = stuevaRepository.findByStuId(stuId).getIsHol();
        char release =stuevaRepository.findByStuId(stuId).getIsRealised();

        model.addAttribute("stuName",stuName);
        if (h_status_code=='1'&&release=='1'){
            String majors = stuevaRepository.findByStuId(stuId).getGuideSubjectList();
            String[] major = majors.split(",");
            String hol_result = stuevaRepository.findByStuId(stuId).getHolResult();
            String[] hol_result_string_array = hol_result.split(",");
            double[] hol_result_double_array = new double[6];
            for (int i=0;i<6;i++){
                hol_result_double_array[i] = Double.parseDouble(hol_result_string_array[i]);
            }
            System.out.println(hol_result_double_array);
            for (int i=0;i<6;i++){
                System.out.println(hol_result_double_array[i]);
            }
            model.addAttribute("result", hol_result_double_array);
            model.addAttribute("majors",major);
            return "wholeJobInterestResult";
        }else if (h_status_code=='1'&& release=='0'){
//            int[] data = new int[6];
//            for (int i = 0;i<6;i++){
//                int every = hol_result.charAt(i)-48;
//                data[i] = every;
//            }
            String hol_result = stuevaRepository.findByStuId(stuId).getHolResult();
            String[] hol_result_string_array = hol_result.split(",");
            double[] hol_result_double_array = new double[6];
            for (int i=0;i<6;i++){
                hol_result_double_array[i] = Double.parseDouble(hol_result_string_array[i]);
            }
            System.out.println(hol_result_double_array);
            for (int i=0;i<6;i++){
                System.out.println(hol_result_double_array[i]);
            }
            model.addAttribute("result", hol_result_double_array);
            return "partJobInterestResult";
        }else if (h_status_code=='0'&& release=='0'){
            return "T-StartJobInterests";
        }else {
            return "T-StartJobInterests";
        }

    }


    @RequestMapping("/StartPTypes")
//    Ennagrame
    public String toStartPTypes(HttpSession session,HttpServletResponse response,Model model){

        if (session.getAttribute("stuId")==null){
            System.out.println("StartPTypes.toStartPTypes(): null");
            model.addAttribute("stuName",null);
            model.addAttribute("h_status","请先登录");
            model.addAttribute("e_status","请先登录");
            try {
                response.sendRedirect("./eva/StartPersonelTest");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "PersonelTest";
        }

        int stuId = (int) session.getAttribute("stuId");
        StudentLoginBean studentLoginBean = studentLoginRepository.findOne(stuId);
        String stuName = studentLoginBean.getStuName();
        char e_status_code = stuevaRepository.findByStuId(stuId).getIsEnn();
        model.addAttribute("stuName",stuName);
        if (e_status_code=='1'){
            String enn_result = stuevaRepository.findByStuId(stuId).getEnnResult();
            int[] data = new int[9];
            for (int i = 0;i<9;i++){
                int every = enn_result.charAt(i)-48;
                data[i] = every;
            }
            model.addAttribute("result", data);
            return "partPTypesResult";
        }else if (e_status_code=='2'){
            String enn_result = stuevaRepository.findByStuId(stuId).getEnnResult();
            int[] data = new int[9];
            for (int i = 0;i<9;i++){
                int every = enn_result.charAt(i)-48;
                data[i] = every;
            }
            model.addAttribute("result", data);
            return "wholePTypesResult";
        }
        return "T-PTypes";
    }

    @RequestMapping("/TestStartHollandTest")
    public String toTestStartHolland(HttpSession session,Model model){
        int stuId = (int) session.getAttribute("stuId");
        StudentLoginBean studentLoginBean = studentLoginRepository.findOne(stuId);
        String stuName = studentLoginBean.getStuName();
        char h_status_code = stuevaRepository.findByStuId(stuId).getIsHol();
        model.addAttribute("stuName",stuName);


        System.out.println("_____________________________________________"+stuName+"_______________________________--");
        return "T-StartJobInterests";
    }
    @RequestMapping("/TestStartEnnTest")
    public String toTestStartEnn(HttpSession session,Model model){
        int stuId = (int) session.getAttribute("stuId");
        StudentLoginBean studentLoginBean = studentLoginRepository.findOne(stuId);
        String stuName = studentLoginBean.getStuName();
        char e_status_code = stuevaRepository.findByStuId(stuId).getIsEnn();
        model.addAttribute("stuName",stuName);
        return "T-PTypes";
    }


    public String dealWithHolland(){
        return "";
    }


    @ResponseBody
    @RequestMapping("/calculateJobInterest")
    public String calculateHolland(String holland_answer,String sortresult,String my_answer, Model model,HttpSession session){
//        System.out.println("calculateJobInterest.calculateHolland(): "+holland_answer);
//        System.out.println("calculateJobInterest.calculateHolland(): "+sortresult);
        System.out.println("my_answer"+my_answer);
        int stuId = (int) session.getAttribute("stuId");
//        System.out.println(stuId);
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setMyInteleAnswer(my_answer);
        stuevaRepository.save(stueva);

        char isHol = stueva.getIsHol();
        double [] result = new double[]{0.0,0.0,0.0,0.0,0.0,0.0};
        for(int i = 0; i < 60; i++){
            int p = holland_answer.charAt(i)-48;
            if (p<6){
                result[p]=result[p]+1.0;
            }
        }
        for (int i=0;i<6;i++){
            System.out.println(result[i]);
        }




        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
//      新增题目与表格顺序映射关系
        map.put(1,1);
        map.put(2,2);
        map.put(3,5);
        map.put(4,4);
        map.put(5,3);
        map.put(6,0);
        //        thisthis
        for (int i=0;i<6;i++){
            int mapp = sortresult.charAt(i*2)-48;
            System.out.println("mapp : "+mapp);
            double addon=(6.0-i)/10;
            System.out.println("addon: "+addon);
            result[map.get(mapp)]=result[map.get(mapp)]+addon;
        }

        String he_result = holland_answer.substring(60,63);
        Map<Integer, int[]> hol2intele = new HashMap<>();
        double[] intele_double_array ={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        hol2intele.put(1, new int[]{1, 2, 3, 7});
        hol2intele.put(2, new int[]{1, 4, 6, 7});
        hol2intele.put(5, new int[]{0, 2, 4, 6});
        hol2intele.put(4, new int[]{0, 3, 4, 5});
        hol2intele.put(3, new int[]{0, 5, 6, 7});
        hol2intele.put(0, new int[]{1, 2, 3, 5});
        for (int i=0;i<6;i++){
            intele_double_array[hol2intele.get(i)[0]]=intele_double_array[hol2intele.get(i)[0]]+result[i]*3;
            intele_double_array[hol2intele.get(i)[1]]=intele_double_array[hol2intele.get(i)[1]]+result[i]*3;
            intele_double_array[hol2intele.get(i)[2]]=intele_double_array[hol2intele.get(i)[2]]+result[i]*3;
            intele_double_array[hol2intele.get(i)[3]]=intele_double_array[hol2intele.get(i)[3]]+result[i]*3;
        }
        if (he_result.charAt(0)=='0'){
            intele_double_array[4] = intele_double_array[4]/2;
        }else if (he_result.charAt(0)=='1'){
            intele_double_array[4]=intele_double_array[4]/2+49.1;
        }
        if (he_result.charAt(1)=='0'){
            intele_double_array[3] = intele_double_array[3]/2;
        }else if (he_result.charAt(0)=='1'){
            intele_double_array[3]=intele_double_array[3]/2+49.1;
        }
        if (he_result.charAt(2)=='0'){
            intele_double_array[7] = intele_double_array[7]/2;
        }else if (he_result.charAt(0)=='1'){
            intele_double_array[7]=intele_double_array[7]/2+49.1;
        }
        for (int i=0;i<8;i++){
            intele_double_array[i] = intele_double_array[i]/3+66;
        }
        String h_result="";
        for (int i = 0; i < 6; i++) {
            h_result = h_result+result[i]+",";
        }
        String h_result_exclude_symbol = h_result.substring(0,h_result.length()-1);

        String intele_result="";
        for (int i = 0; i < 8; i++) {
            intele_result = intele_result+(int)Math.ceil(intele_double_array[i])+",";
        }
        String intele_result_exclude_symbol = intele_result.substring(0,intele_result.length()-1);

        System.out.println("------------------EXCLUDE---------------------------");
        System.out.println(intele_result_exclude_symbol);
        System.out.println("------------------EXCLUDE---------------------------");
        stueva.setIsHol('1');
        stueva.setHolResult(h_result_exclude_symbol);
        System.out.println(h_result_exclude_symbol);
        stueva.setInteleResult(intele_result_exclude_symbol);
        stuevaRepository.save(stueva);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/wxCalculateJobInterest")
    public String wxCalculateJobInterest(String tel,String holland_answer,String sortresult){
        int stuId = studentRepository.findStudentByStuTel(tel).getStuId();
        Stueva stueva = stuevaRepository.findByStuId(stuId);

        char isHol = stueva.getIsHol();
        double [] result = new double[]{0.0,0.0,0.0,0.0,0.0,0.0};
        for(int i = 0; i < 60; i++){
            int p = holland_answer.charAt(i)-48;
            if (p<6){
                result[p]=result[p]+1.0;
            }
        }
        for (int i=0;i<6;i++){
            System.out.println(result[i]);
        }
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,5);
        map.put(4,4);
        map.put(5,3);
        map.put(6,0);
        //        thisthis
        for (int i=0;i<6;i++){
            int mapp = sortresult.charAt(i*2)-48;
            System.out.println("mapp : "+mapp);
            double addon=(6.0-i)/10;
            System.out.println("addon: "+addon);
            result[map.get(mapp)]=result[map.get(mapp)]+addon;
        }

        String he_result = holland_answer.substring(60,63);
        Map<Integer, int[]> hol2intele = new HashMap<>();
        double[] intele_double_array ={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        hol2intele.put(1, new int[]{1, 2, 3, 7});
        hol2intele.put(2, new int[]{1, 4, 6, 7});
        hol2intele.put(5, new int[]{0, 2, 4, 6});
        hol2intele.put(4, new int[]{0, 3, 4, 5});
        hol2intele.put(3, new int[]{0, 5, 6, 7});
        hol2intele.put(0, new int[]{1, 2, 3, 5});
        for (int i=0;i<6;i++){
            intele_double_array[hol2intele.get(i)[0]]=intele_double_array[hol2intele.get(i)[0]]+result[i]*3;
            intele_double_array[hol2intele.get(i)[1]]=intele_double_array[hol2intele.get(i)[1]]+result[i]*3;
            intele_double_array[hol2intele.get(i)[2]]=intele_double_array[hol2intele.get(i)[2]]+result[i]*3;
            intele_double_array[hol2intele.get(i)[3]]=intele_double_array[hol2intele.get(i)[3]]+result[i]*3;
        }
        if (he_result.charAt(0)=='0'){
            intele_double_array[4] = intele_double_array[4]/2;
        }else if (he_result.charAt(0)=='1'){
            intele_double_array[4]=intele_double_array[4]/2+49.1;
        }
        if (he_result.charAt(1)=='0'){
            intele_double_array[3] = intele_double_array[3]/2;
        }else if (he_result.charAt(0)=='1'){
            intele_double_array[3]=intele_double_array[3]/2+49.1;
        }
        if (he_result.charAt(2)=='0'){
            intele_double_array[7] = intele_double_array[7]/2;
        }else if (he_result.charAt(0)=='1'){
            intele_double_array[7]=intele_double_array[7]/2+49.1;
        }
        //increase point提分
        for (int i=0;i<8;i++){
            intele_double_array[i] = intele_double_array[i]/3+66;
        }
        String h_result="";
        for (int i = 0; i < 6; i++) {
            h_result = h_result+result[i]+",";
        }
        String h_result_exclude_symbol = h_result.substring(0,h_result.length()-1);

        String intele_result="";
        for (int i = 0; i < 8; i++) {
            intele_result = intele_result+(int)Math.ceil(intele_double_array[i])+",";
        }
        String intele_result_exclude_symbol = intele_result.substring(0,intele_result.length()-1);

        System.out.println("------------------EXCLUDE---------------------------");
        System.out.println(intele_result_exclude_symbol);
        System.out.println("------------------EXCLUDE---------------------------");
        stueva.setIsHol('1');
        stueva.setHolResult(h_result_exclude_symbol);
        System.out.println(h_result_exclude_symbol);
        stueva.setInteleResult(intele_result_exclude_symbol);
        stuevaRepository.save(stueva);
        return "success";
    }


    @ResponseBody
    @RequestMapping("/calculatePTypes")
    public String calculateEnneagram(HttpSession session,String enneagram_answer, Model model){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setMyEnnAnswer(enneagram_answer);
        stuevaRepository.save(stueva);
        char isEnn = stueva.getIsEnn();
        int [] result = new int[]{0,0,0,0,0,0,0,0,0};
        int [][] table = {{1,4},
                {3,6},
                {8,0},
                {2,4},
                {5,7},
                {1,0},
                {2,6},
                {7,3},
                {8,5},
                {2,0},
                {7,6},
                {1,3},
                {4,8},
                {5,2},
                {7,0},
                {3,4},
                {8,1},
                {5,6},
                {0,4},
                {1,7},
                {5,3},
                {6,0},
                {1,2},
                {3,8},
                {4,5},
                {7,2},
                {8,6},
                {3,0},
                {1,5},
                {2,8},
                {4,7},
                {5,0},
                {1,6},
                {2,3},
                {7,8},
                {4,6}};
        for(int i = 0; i < enneagram_answer.length(); i++) {
            int p = enneagram_answer.charAt(i)-48;
            result[table[i][p]]++;
        }
        for (int i=0;i<9;i++){
            result[i]=(int) (result[i]*0.75+4);
            if (result[i]==10){
                result[i]=9;
            }
        }
        String e_result="";
        for (int i = 0; i < 9; i++) {
            e_result = e_result+result[i];
        }
        stueva.setIsEnn('1');
        stueva.setEnnResult(e_result);
        stuevaRepository.save(stueva);
        return "ok";
    }

//    @ResponseBody
//    @RequestMapping("/wxcalculatePTypes")
//    public String wxCalculateEnneagram(String tel,String enneagram_answer){
//        int stuId = studentRepository.findStudentByStuTel(tel).getStuId();
//        Stueva stueva = stuevaRepository.findByStuId(stuId);
//
//        stueva.setMyEnnAnswer(enneagram_answer);
//        stuevaRepository.save(stueva);
//        char isEnn = stueva.getIsEnn();
//        int [] result = new int[]{0,0,0,0,0,0,0,0,0};
//        int [][] table = {{1,4},
//                {3,6},
//                {8,0},
//                {2,4},
//                {5,7},
//                {1,0},
//                {2,6},
//                {7,3},
//                {8,5},
//                {2,0},
//                {7,6},
//                {1,3},
//                {4,8},
//                {5,2},
//                {7,0},
//                {3,4},
//                {8,1},
//                {5,6},
//                {0,4},
//                {1,7},
//                {5,3},
//                {6,0},
//                {1,2},
//                {3,8},
//                {4,5},
//                {7,2},
//                {8,6},
//                {3,0},
//                {1,5},
//                {2,8},
//                {4,7},
//                {5,0},
//                {1,6},
//                {2,3},
//                {7,8},
//                {4,6}};
//        for(int i = 0; i < enneagram_answer.length(); i++) {
//            int p = enneagram_answer.charAt(i)-48;
//            result[table[i][p]]++;
//        }
//        for (int i=0;i<9;i++){
//            result[i]=(int) (result[i]*0.75+4);
//            if (result[i]==10){
//                result[i]=9;
//            }
//        }
//        String e_result="";
//        for (int i = 0; i < 9; i++) {
//            e_result = e_result+result[i];
//        }
//        stueva.setIsEnn('1');
//        stueva.setEnnResult(e_result);
//        stuevaRepository.save(stueva);
//        return "ok";
//    }

//    @RequestMapping("/h")
//    @ResponseBody
//    public String toMyReport(HttpSession session,Model model,HttpServletResponse response){
//        return "h";
//    }


    @RequestMapping("/MyReport")
    public String toMyReportOld(HttpSession session,Model model,HttpServletResponse response){

        System.out.println("MyReport.toMyReport(): null");
        if (session.getAttribute("stuId") == null){
            model.addAttribute("stuName","未登录");
            System.out.println("MyReport This one redirect");
//            try {
//                response.sendRedirect("./loginInFirst");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            return "loginInFirst";
        }else {
            int stuId = (int) session.getAttribute("stuId");
            StudentLoginBean studentLoginBean = studentLoginRepository.findOne(stuId);
            String stuName = studentLoginBean.getStuName();
            model.addAttribute("stuName",stuName);
        }
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        char h_status_code = stueva.getIsHol();
        char release =stueva.getIsRealised();
        String intele_result_string =stueva.getInteleResult();
        System.out.println("--------------------------------------------");
        System.out.println(intele_result_string);
        String[] intele_result = intele_result_string.split(",");
        int[] intele_result_array = new int[8];

        System.out.println("--------------------------------------------");
        for (int i=0;i<8;i++){
            intele_result_array[i] = Integer.parseInt(intele_result[i]);
            System.out.println(intele_result_array[i]);
        }

        System.out.println("--------------------------------------------");


        char e_status_code = stueva.getIsEnn();

        if (h_status_code=='1'&&release=='1'&&e_status_code!='0'){

            String enn_result = stueva.getEnnResult();
            int[] data = new int[9];
            for (int i = 0;i<9;i++){
                int every = enn_result.charAt(i)-48;
                data[i] = every;
            }

            for (int i=0;i<9;i++){
                System.out.println(data[i]);
            }


            String majors = stueva.getGuideSubjectList();
            String[] major = majors.split(",");

            String hol_result = stueva.getHolResult();
            String[] hol_result_string_array = hol_result.split(",");
            double[] hol_result_double_array = new double[6];

            for (int i=0;i<6;i++){
                hol_result_double_array[i] = Double.parseDouble(hol_result_string_array[i]);
            }

            System.out.println("MyReport End");
            model.addAttribute("result", hol_result_double_array);
            model.addAttribute("PTresult", data);
            model.addAttribute("majors",major);
            model.addAttribute("intele",intele_result_array);
            for (int i=0;i<major.length;i++){
                System.out.println(major[i]);
            };
            return "TestReport";
        }else if (h_status_code=='1'&&release=='0'){
            return "wait4teachers";
        }else if (h_status_code=='0'){
            return "JIFirst";
        }else if (e_status_code=='0'){
            return "PTFirst";
        }
        System.out.println("Can not be here");
        return "PersonelTest";
    }
    @RequestMapping("/threesixpage")
    public String toThreeSixTool(){
        return "threeSixStandAlonePage";
    }

    @RequestMapping("/CheckReport")
    public String toMyReportInstitution(@RequestParam(value="stuid_param") String stuid_param, HttpSession session, Model model, HttpServletResponse response){

        System.out.println("CheckReport : "+stuid_param);



//        StudentLoginBean studentLoginBean = studentLoginRepository.findOne(stuid_url);
//        String stuName = studentLoginBean.getStuName();
//        model.addAttribute("stuName",stuName);
//

        int stuId = Integer.parseInt(stuid_param);
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        char h_status_code = stueva.getIsHol();
        char release =stueva.getIsRealised();
        String intele_result_string =stueva.getInteleResult();
        System.out.println("--------------------------------------------");
        System.out.println(intele_result_string);
        String[] intele_result = intele_result_string.split(",");
        int[] intele_result_array = new int[8];

        System.out.println("--------------------------------------------");
        for (int i=0;i<8;i++){
            intele_result_array[i] = Integer.parseInt(intele_result[i]);
            System.out.println(intele_result_array[i]);
        }

        System.out.println("--------------------------------------------");


        char e_status_code = stueva.getIsEnn();

        if (h_status_code=='1'&&e_status_code!='0'){

            String enn_result = stueva.getEnnResult();
            int[] data = new int[9];
            for (int i = 0;i<9;i++){
                int every = enn_result.charAt(i)-48;
                data[i] = every;
            }

            for (int i=0;i<9;i++){
                System.out.println(data[i]);
            }


            String majors = stueva.getGuideSubjectList();
            String[] major = majors.split(",");

            String hol_result = stueva.getHolResult();
            String[] hol_result_string_array = hol_result.split(",");
            double[] hol_result_double_array = new double[6];

            for (int i=0;i<6;i++){
                hol_result_double_array[i] = Double.parseDouble(hol_result_string_array[i]);
            }

            System.out.println("MyReport End");
            model.addAttribute("result", hol_result_double_array);
            model.addAttribute("PTresult", data);
            model.addAttribute("majors",major);
            model.addAttribute("intele",intele_result_array);
            for (int i=0;i<major.length;i++){
                System.out.println(major[i]);
            };
            return "TestReport";
        }else if (h_status_code=='1'&&release=='0'){
            return "wait4teachers";
        }else if (h_status_code=='0'){
            return "JIFirst";
        }else if (e_status_code=='0'){
            return "PTFirst";
        }
        System.out.println("Can not be here");
        return "PersonelTest";
    }

    @ResponseBody
    @RequestMapping("/wxCalculateSITest")
    public String wxCalculateSITest(String tel,String SI_answer,String SI_sort){
        int stuId = studentRepository.findStudentByStuTel(tel).getStuId();
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String si_result_str = "";
        System.out.println(tel);
        System.out.println(SI_answer);
        System.out.println(SI_sort);
        float [] si_result = new float[]{0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<54;i++){
            si_result[i%6] = si_result[i%6]+SI_answer.charAt(i)-48;
        }
        for(int i=0;i<6;i++){
            int mapp = SI_sort.charAt(i*2)-49;
            float addon= (float) ((6.0-i)/10);
            si_result[mapp]=si_result[mapp]+addon;
        }
        for (int i=0;i<12;i++){
//            System.out.println(si_result[i]);
            si_result_str = si_result_str+si_result[i]+",";
        }
        si_result_str = si_result_str.substring(0,si_result_str.length()-1);
        System.out.println(si_result_str);
        stueva.setIsSi('1');
        stueva.setSiResult(si_result_str);
        stuevaRepository.save(stueva);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/calculateSITest")
    public String calculateSITest(HttpSession session,String SI_answer,String SI_sort,String SI_my_answer,Model model){

        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
//        Student student=studentRepository.findOne(stuId);
//        String good_sub = student.getStuGoodSubject();
//        String [] good_sub_array = good_sub.split(",");
        stueva.setMySiAnswer(SI_my_answer);
        stueva.setSiTime(new Date());
        stuevaRepository.save(stueva);
//        地理 历史 政治 生物 物理 化学 3科 3科
        String si_result_str = "";
        float [] si_result = new float[]{0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<54;i++){
            si_result[i%6] = si_result[i%6]+SI_answer.charAt(i)-48;
        }
        for(int i=0;i<6;i++){
            int mapp = SI_sort.charAt(i*2)-49;
            float addon= (float) ((6.0-i)/10);
            si_result[mapp]=si_result[mapp]+addon;
        }
        for (int i=0;i<12;i++){
//            System.out.println(si_result[i]);
            si_result_str = si_result_str+si_result[i]+",";
        }
        si_result_str = si_result_str.substring(0,si_result_str.length()-1);
        System.out.println(si_result_str);
        stueva.setIsSi('1');
        stueva.setSiResult(si_result_str);
        stuevaRepository.save(stueva);
        return "ok";
    }

//    pro need delete
//    @ResponseBody
//    @RequestMapping("/wxget_is_si")
//    public String wxget_is_si(String tel){
//        int stuId = studentRepository.findStudentByStuTel(tel).getStuId();
//        Stueva stueva = stuevaRepository.findByStuId(stuId);
//        System.out.println(stueva.getIsSi());
//        return String.valueOf(stueva.getIsSi());
//    }

    @ResponseBody
    @RequestMapping("/get_si_result")
    public String getSiResult(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String siResultReturn = "";
        String siResult = stueva.getSiResult();
        //        地理 历史 政治 生物 物理 化学 3科 3科

        String  [] siResultRoundHundredString = siResult.substring(0,29).split(",");

        for (int i =0;i<6;i++){
            String tmp = String.valueOf(Double.parseDouble(siResultRoundHundredString[i])*2.2-1.0);
            siResultReturn = siResultReturn+tmp.substring(0,4)+",";
        }
        return siResultReturn.substring(0,siResultReturn.length()-1);
    }
    @ResponseBody
    @RequestMapping("/get_si_time")
    public Date getSiTime(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        return stueva.getSiTime();
    }

    @ResponseBody
    @RequestMapping("/MSSLM_answer")
    public String calculateMSSLMTest(HttpSession session,String MSSLM_answer){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setMsslmTime(new Date());
        stueva.setMsslmAnswer(MSSLM_answer);
        stueva.setIsMsslm('1');
        stuevaRepository.save(stueva);
        return "ok";
    }
    @ResponseBody
    @RequestMapping("/get_MSSLM_result")
    public String getMSSLMTest(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String raw_answer = stueva.getMsslmAnswer();
        int point=0;
        String msslm_class="";
        for (int i = 0;i<20;i++){
            if(raw_answer.charAt(i)=='1'){
                point++;
            }
        }
        if (point>=0&&point<=5){
            msslm_class="A";
        }else if (point>5&&point<=13){
            msslm_class="B";
        }else {
            msslm_class="C";
        }
        return msslm_class;
    }
    @ResponseBody
    @RequestMapping("/get_msslm_time")
    public Date get_msslm_time(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        return stueva.getMsslmTime();
    }
    @ResponseBody
    @RequestMapping("/calculateMssmhs")
    public String calculateMssmhs(HttpSession session,String mssmhs_answer){
        System.out.println(mssmhs_answer);
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setMssmhsTime(new Date());
        stueva.setMssmhsAnswer(mssmhs_answer);
        stueva.setIsMssmhs('1');
        stuevaRepository.save(stueva);
        return "ok";
    }
    @ResponseBody
    @RequestMapping("/getMssmhs")
    public String getMssmhs(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String raw_answer = stueva.getMssmhsAnswer();
        double total=0;
        double qp=0;
        double pz=0;
        double dd=0;
        double rjgxmg=0;
        double yy=0;
        double jl=0;
        double xxyl=0;
        double sybl=0;
        double qxbw=0;
        double xlbph=0;
        qp = raw_answer.charAt(2)+raw_answer.charAt(9)+raw_answer.charAt(11)+raw_answer.charAt(21)+raw_answer.charAt(22)+raw_answer.charAt(47)-288;
        pz = raw_answer.charAt(10)+raw_answer.charAt(19)+raw_answer.charAt(23)+raw_answer.charAt(25)+raw_answer.charAt(46)+raw_answer.charAt(48)-288;
        dd = raw_answer.charAt(18)+raw_answer.charAt(20)+raw_answer.charAt(24)+raw_answer.charAt(49)+raw_answer.charAt(51)+raw_answer.charAt(57)-288;
        rjgxmg=raw_answer.charAt(3)+raw_answer.charAt(16)+raw_answer.charAt(17)+raw_answer.charAt(44)+raw_answer.charAt(50)+raw_answer.charAt(58)-288;
        yy=raw_answer.charAt(4)+raw_answer.charAt(12)+raw_answer.charAt(13)+raw_answer.charAt(15)+raw_answer.charAt(43)+raw_answer.charAt(56)-288;
        jl=raw_answer.charAt(5)+raw_answer.charAt(14)+raw_answer.charAt(33)+raw_answer.charAt(42)+raw_answer.charAt(45)+raw_answer.charAt(55)-288;
        xxyl=raw_answer.charAt(30)+raw_answer.charAt(32)+raw_answer.charAt(35)+raw_answer.charAt(37)+raw_answer.charAt(39)+raw_answer.charAt(54)-288;
        sybl=raw_answer.charAt(0)+raw_answer.charAt(7)+raw_answer.charAt(8)+raw_answer.charAt(28)+raw_answer.charAt(38)+raw_answer.charAt(40)-288;
        qxbw=raw_answer.charAt(1)+raw_answer.charAt(6)+raw_answer.charAt(26)+raw_answer.charAt(31)+raw_answer.charAt(34)+raw_answer.charAt(52)-288;
        xlbph=raw_answer.charAt(27)+raw_answer.charAt(29)+raw_answer.charAt(36)+raw_answer.charAt(41)+raw_answer.charAt(53)+raw_answer.charAt(59)-288;
        total = Math.round((qp+pz+dd+rjgxmg+yy+jl+xxyl+sybl+qxbw+xlbph)/60);

        qp=Math.round(qp/6);
        pz=Math.round(pz/6);
        dd=Math.round(dd/6);
        rjgxmg=Math.round(rjgxmg/6);
        yy=Math.round(yy/6);
        jl=Math.round(jl/6);
        xxyl=Math.round(xxyl/6);
        sybl=Math.round(sybl/6);
        qxbw=Math.round(qxbw/6);
        xlbph=Math.round(xlbph/6);
        String re = ""+total+","+qp+"," +pz +","+dd +","+rjgxmg +","+yy +","+jl +","+xxyl +","+sybl +","+qxbw +","+xlbph;
        return re;
    }
    @ResponseBody
    @RequestMapping("/get_mssmhs_time")
    public Date get_mssmhs_time(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        return stueva.getMssmhsTime();
    }
    @ResponseBody
    @RequestMapping("/calculateMsea")
    public String calculateMsea(HttpSession session,String msea_answer){
        System.out.println(msea_answer);
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setMseaTime(new Date());
        stueva.setMseaAnswer(msea_answer);
        stueva.setIsMsea('1');
        stuevaRepository.save(stueva);
        return "ok";
    }
    @ResponseBody
    @RequestMapping("/getMsea")
    public String getMsea(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String msea_res = stueva.getMseaAnswer();
        int ret = 0;
        for(int i = 0;i<37;i++){
            ret = ret+(msea_res.charAt(i)-48);
        }
        return ""+ret;
    }
    @ResponseBody
    @RequestMapping("/get_msea_time")
    public Date get_msea_time(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        return stueva.getMseaTime();
    }
    @ResponseBody
    @RequestMapping("/calculateTms")
    public String calculateTms(HttpSession session,String tms_answer){
        System.out.println(tms_answer);
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setTmsTime(new Date());
        stueva.setTmsAnswer(tms_answer);
        stueva.setIsTms('1');
        stuevaRepository.save(stueva);
        return "ok";
    }
    @ResponseBody
    @RequestMapping("/getTms")
    public String getTms(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String tmsAnswer= stueva.getTmsAnswer();
        double target_focus=0;
        double temper_control=0;
        double optim_sense=0;
        double family_support=0;
        double relationship_reinforcement=0;
        String ret = "";
        target_focus = (tmsAnswer.charAt(2)+tmsAnswer.charAt(3)+tmsAnswer.charAt(10)+tmsAnswer.charAt(19)+tmsAnswer.charAt(23)-48*5)/5;
        temper_control = (tmsAnswer.charAt(0)+tmsAnswer.charAt(1)+tmsAnswer.charAt(4)+tmsAnswer.charAt(20)+tmsAnswer.charAt(22)+tmsAnswer.charAt(26)-48*6)/6;
        optim_sense = (tmsAnswer.charAt(9)+tmsAnswer.charAt(12)+tmsAnswer.charAt(13)+tmsAnswer.charAt(24)-48*4)/4;
        family_support = (tmsAnswer.charAt(7)+tmsAnswer.charAt(14)+tmsAnswer.charAt(15)+tmsAnswer.charAt(16)+tmsAnswer.charAt(18)+tmsAnswer.charAt(21)-48*6)/6;
        relationship_reinforcement = (tmsAnswer.charAt(5)+tmsAnswer.charAt(6)+tmsAnswer.charAt(8)+tmsAnswer.charAt(11)+tmsAnswer.charAt(17)+tmsAnswer.charAt(25)-48*6)/6;

        target_focus =Math.round(target_focus);
        temper_control =Math.round(temper_control);
        optim_sense =Math.round(optim_sense);
        family_support =Math.round(family_support);
        relationship_reinforcement =Math.round(relationship_reinforcement);
        ret = ""+target_focus+","+temper_control+"," +optim_sense+"," +family_support+"," +relationship_reinforcement;
        return ret;
    }
    @ResponseBody
    @RequestMapping("/get_tms_time")
    public Date get_tms_time(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        return stueva.getTmsTime();
    }



    @ResponseBody
    @RequestMapping("/calculateCct")
    public String calculateCct(HttpSession session,Integer cct_answer){
        System.out.println(cct_answer);
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setCctTime(new Date());
        stueva.setCctAnswer(cct_answer);
        stueva.setIsCct('1');
        stuevaRepository.save(stueva);
        return "ok";
    }
    @ResponseBody
    @RequestMapping("/getCct")
    public String getCct(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        int CctAnswer = stueva.getCctAnswer();
        String res = "";
        if (CctAnswer<=101){
            res="注意力比较差，学习效率很低,是注意力不集中的学生，最需要提高注意力";
        }else if(CctAnswer>=102&&CctAnswer<=115){
            res="注意力一般，刚好及格，学习效率比较低,更需要提高注意力";
        }else if(CctAnswer>=116&&CctAnswer<=137){
            res="注意力比较强，学习效率比较高,需要提高注意力";
        }else if (CctAnswer>=138){
            res="注意力非常强，学习效率高";
        }
        return res;
    }


    @ResponseBody
    @RequestMapping("/get_cct_time")
    public Date get_cct_time(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        return stueva.getCctTime();
    }


    @ResponseBody
    @RequestMapping("/calculateHs")
    public String calculateHs(HttpSession session,String hs_answer){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setHsTime(new Date());
        stueva.setHsAnswer(hs_answer);
        stueva.setIsHs('1');
        stuevaRepository.save(stueva);
        return "ok";
    }
    @ResponseBody
    @RequestMapping("/getHs")
    public String getHs(){
        return "Get Hs Result";
    }

    @ResponseBody
    @RequestMapping("/calculatePf")
    public String calculatePf(HttpSession session,String pf_answer){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        stueva.setPfTime(new Date());
        stueva.setPfAnswer(pf_answer);
        System.out.println(pf_answer);
        stueva.setIsPf('1');
        stuevaRepository.save(stueva);
        return "ok";
    }
    @ResponseBody
    @RequestMapping("/getPf")
    public String getPf(){
        return "Get Pf Result";
    }

//    @ResponseBody
//    @RequestMapping("/calculateMssmhs")
//    public String calculateMssmhs(){
//        return "Calculate  Mssmhs Result";
//    }
//    @ResponseBody
//    @RequestMapping("/getMssmhs")
//    public String getMssmhs(){
//        return "Get Mssmhs Result";
//    }

    @ResponseBody
    @RequestMapping("/get_query_num_before_search")
    public int getQueryNumBeforeSearch(int score_min,int score_max,String school_name){
        int total = threeSixRepository.getQueryNumbers("%"+school_name+"%",score_min,score_max);
        System.out.println(total);
        return total;
    }

    @ResponseBody
    @RequestMapping("/search_school_1")
    public ArrayList<ThreeSix> getSearchSchool1Result(HttpSession session,int score_min,int score_max,String school_name,int offset){
//        int stuId = (int) session.getAttribute("stuId");
        ArrayList<ThreeSix> threeSix = threeSixRepository.getQuery("%"+school_name+"%",score_min,score_max,offset);
        return threeSix;
    }

    @ResponseBody
    @RequestMapping("/get_querybymj_num")
    public int getQueryNumBeforeSearch2(int score_min,int score_max,String [] province,String [] majors){

        int total = threeSixRepository.getQueryByMajorNumbers(majors,province,score_min,score_max);
        System.out.println(total);
        return total;
    }

    @ResponseBody
    @RequestMapping("/search_major_2")
//    public ArrayList<ThreeSix> getSearchMajorResult(HttpSession session,int score_min,int score_max,String [] province,String [] majors,int offset) {
    public ArrayList<ThreeSix> getSearchMajorResult(HttpSession session,int score_min,int score_max,String [] province,String [] majors) {
        System.out.println(score_min);
        System.out.println(score_max);
        System.out.println(province);
        System.out.println(majors);
//        System.out.println(offset);
        ArrayList<ThreeSix> threeSix = threeSixRepository.getQuery2(majors,province,score_min,score_max);
        System.out.println("size"+threeSix.size());
        return threeSix;
    }


    @RequestMapping("/AlreadyDoneJobsInterests")
    public String toAlreadyDoneHol(){
        return "AlreadyDoneJobInterests";
    }
    @RequestMapping("/AlreadyDonePTypes")
    public String toAlreadyDoneEnn(){
        return "AlreadyDoneEnn";
    }

    @RequestMapping("/ps")
    public String toPs(){
        return "PagShow";
    }

//    @ResponseBody
//    @RequestMapping("/wxtst")
//    public String wxTst(String tel){
//        return tel;
//    }
//
//    @ResponseBody
//    @RequestMapping("/wxFindUser")
//    public String wxVerifyLogin(String code){
//        System.out.println(code);
//        String url="https://api.weixin.qq.com/sns/jscode2session?appid="+"wx454b6ceca00eceac"+
//                "&secret="+"4ff35b9b07d356ea0531205e6a98a527"+"&js_code="+ code +"&grant_type=authorization_code";
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
//        if(responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK)
//        {
//            String sessionData = responseEntity.getBody();
////            Gson gson = new Gson();
//            System.out.println(sessionData);
//        }
//        return null;
//    }
//
//
//
//    @ResponseBody
//    @RequestMapping("/gpn")
//    public String wxOauth(String encryptedData,String iv,String codes) throws Exception{
//        System.out.println("----------------------------------------------------------------");
//        System.out.println("1");
//        System.out.println(encryptedData);
//        System.out.println(iv);
//        System.out.println(codes);
//        System.out.println("----------------------------------------------------------------");
//
//        Object res = getPhoneNumber(encryptedData,codes,iv);
//
//        return res.toString();
//    }
//
//    public Object getPhoneNumber(String encryptedData, String code, String iv) {
//        //传入code后然后获取openid和session_key的，把他们封装到json里面
//        System.out.println("----------------------------------------------------------------");
//        System.out.println("2");
//        System.out.println(encryptedData);
//        System.out.println(code);
//        System.out.println(iv);
//        System.out.println("----------------------------------------------------------------");
//        JSONObject json = getSessionKeyOropenid(code);
//        String session_key = "";
//        if (json != null) {
//
//            session_key = json.getString("session_key");
//            // 被加密的数据
//            byte[] dataByte = Base64.decode(encryptedData);
//            // 加密秘钥
//            byte[] keyByte = Base64.decode(session_key);
//            // 偏移量
//            byte[] ivByte = Base64.decode(iv);
//            try {
//                // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
//                int base = 16;
//                if (keyByte.length % base != 0) {
//                    int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
//                    byte[] temp = new byte[groups * base];
//                    Arrays.fill(temp, (byte) 0);
//                    System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
//                    keyByte = temp;
//                }
//                // 初始化
//                Security.addProvider(new BouncyCastleProvider());
//                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//                SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
//                AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
//                parameters.init(new IvParameterSpec(ivByte));
//                cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
//                byte[] resultByte = cipher.doFinal(dataByte);
//                if (null != resultByte && resultByte.length > 0) {
//                    String result = new String(resultByte, "UTF-8");
//                    return JSONObject.parseObject(result);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }
//
//    public static JSONObject getSessionKeyOropenid(String code) {
//        //微信端登录code值
//        System.out.println("----------------------------------------------------------------");
//        System.out.println("3");
//        System.out.println(code);
//        System.out.println("----------------------------------------------------------------");
//        String wxCode = code;
//        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";  //请求地址 https://api.weixin.qq.com/sns/jscode2session
//        Map<String, String> requestUrlParam = new HashMap<String, String>();
//        requestUrlParam.put("appid", "wxe193ea85e9346a5f");  //开发者设置中的appId
//        requestUrlParam.put("secret", "d5b3961eddd15dd0962c11ea98f74437"); //开发者设置中的appSecret
//        requestUrlParam.put("js_code", wxCode); //小程序调用wx.login返回的code
//        requestUrlParam.put("grant_type", "authorization_code");    //默认参数 authorization_code
//
//        //发送post请求读取调用微信 https://api.weixin.qq.com/sns/jscode2session 接口获取openid用户唯一标识
//        JSONObject jsonObject = JSON.parseObject(sendPost(requestUrl, requestUrlParam));
//        return jsonObject;
//    }
//
//    /**
//     * 向指定 URL 发送POST方法的请求
//     *
//     * @param url 发送请求的 URL
//     * @return 所代表远程资源的响应结果
//     */
//    public static String sendPost(String url, Map<String, ?> paramMap) {
//        PrintWriter out = null;
//        BufferedReader in = null;
//        String result = "";
//
//        String param = "";
//        Iterator<String> it = paramMap.keySet().iterator();
//
//        while (it.hasNext()) {
//            String key = it.next();
//            param += key + "=" + paramMap.get(key) + "&";
//        }
//
//        try {
//            URL realUrl = new URL(url);
//            // 打开和URL之间的连接
//            URLConnection conn = realUrl.openConnection();
//            // 设置通用的请求属性
//            conn.setRequestProperty("accept", "*/*");
//            conn.setRequestProperty("connection", "Keep-Alive");
//            conn.setRequestProperty("Accept-Charset", "utf-8");
//            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//            // 发送POST请求必须设置如下两行
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            // 获取URLConnection对象对应的输出流
//            out = new PrintWriter(conn.getOutputStream());
//            // 发送请求参数
//            out.print(param);
//            // flush输出流的缓冲
//            out.flush();
//            // 定义BufferedReader输入流来读取URL的响应
//            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
//            String line;
//            while ((line = in.readLine()) != null) {
//                result += line;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        //使用finally块来关闭输出流、输入流
//        finally {
//            try {
//                if (out != null) {
//                    out.close();
//                }
//                if (in != null) {
//                    in.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return result;
//    }
//
//    @ResponseBody
//    @RequestMapping("/wxfakelogin")
//    public String wxfakelogin(String tel){
//        System.out.println(tel);
//        Student student = studentRepository.findStudentByStuTel(tel);
//        try {
//            String name = student.getStuName();
//            String province = student.getStuProvinceCode();
//            String city = student.getStuCityCode();
//            String district = student.getStuDistrictCode();
//            String highschool = student.getStuHighschoolCode();
//            String isnewce = student.getStuIsNewexam();
//            String tmpplace = student.getTmpPlace();
////            System.out.println(name);
////            System.out.println(province);
////            System.out.println(city);
////            System.out.println(district);
////            System.out.println(highschool);
////            System.out.println(isnewce);
////            System.out.println(tmpplace);
//            if (province.length()==0||city.length()==0 ||district.length()==0||highschool.length()==0){
//                if (tmpplace==null){
//                    //补充信息
//                    System.out.println("补充信息1");
//                    //忽然决定不向后台传数据，于是不带返回json字符串了先。所有信息让他自己写一下。
//                    return "1";
//                }else {
//                    //正常跳转
//                    System.out.println("正常跳转2");
//                    //忽然决定不向后台传数据，于是不带返回json字符串了先。
//                    return "0";
//                }
//            }else {
//                //正常跳转
//                System.out.println("正常跳转3");
//                //忽然决定不向后台传数据，于是不带返回json字符串了先。
//                return "0";
//            }
//
//        }catch (Exception e){
//            //需要注册
//            System.out.println("需要注册");
////            Map map = new HashMap();
////            map.put("code",-1);
////            map.put("tel",tel);
////            String jsonStr = gson.toJson(map);
//            return "-1";
//        }
//    }



}