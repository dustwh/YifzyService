package com.era.edu.generic.boot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.era.edu.generic.boot.domain.*;
//import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.client.RestTemplate;
//
import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;
//import 4 needed
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;


@Controller
@RequestMapping("/weapp")
public class WeChatController {
    @Autowired
    private StudentLoginRepository studentLoginRepository;
    @Autowired
    private StuevaRepository stuevaRepository;
    @Autowired
    private StudentRepository studentRepository;
//    @Autowired
//    private ThreeSixRepository threeSixRepository;
//    @Autowired
//    private SubInterestRepository subInterestRepository;
//    @Autowired
//    private HolQuestionRepository holQuestionRepository;
    @Autowired
    private EnnQuestionRepository ennQuestionRepository;
    @Autowired
    private SubInterestRepository subInterestRepository;
    @Autowired
    private HolQuestionRepository holQuestionRepository;
    @Autowired
    private TbFinFsyxRepository tbFinFsyxRepository;
    @Autowired
    private TbDaxueRepository tbDaxueRepository;
    @Autowired
    private MajorSimplifyRepository majorSimplifyRepository;
    @Autowired
    private MajorRegularRepository majorRegularRepository;
    @Autowired
    UnivRepository univercityRepository;
    @Autowired
    private WechatNewsRepository wechatNewsRepository;

    @ResponseBody
    @RequestMapping("/getCanSeeReport")
    public String getCanSeeReport(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        int isEnn = Integer.parseInt(String.valueOf(stueva.getIsEnn()));
        int isHol = Integer.parseInt(String.valueOf(stueva.getIsHol()));
        int isSi = Integer.parseInt(String.valueOf(stueva.getIsSi()));
        if (isEnn==1&&isHol==1&&isSi==1){
            return "yes";
        }else{
            return "no";
        }
    }

    @ResponseBody
    @RequestMapping("/getNews")
    public Object getNews(String newsId){
        JSONObject jsonObject=new JSONObject();
        WechatNews wechatNews=wechatNewsRepository.findOne(Integer.parseInt(newsId));
        jsonObject.put("tittle",wechatNews.getNewsTittle());
        jsonObject.put("content",wechatNews.getNewsContent());
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping("/getRecSchoolInfo")
    public Object getRecSchoolInfo(String schoolCode){
        JSONObject jsonObject=new JSONObject();
        Univ univercity=univercityRepository.findByDxYxdm(schoolCode);
        String univrctName=univercity.getUnivrctName();
        String univrctTag=univercity.getUnivrctTag();
        String univrctType=univercity.getUnivrctType();
        String univrctLocation=univercity.getUnivrctLocation();
        String univrctAffiliate=univercity.getUnivrctAffiliate();
        String univrctLevel=univercity.getUnivrctLevel();
        String univrctHomePage=univercity.getUnivrctHomePage();
        jsonObject.put("univrctName",univrctName);
        jsonObject.put("univrctTag",univrctTag);
        jsonObject.put("univrctType",univrctType);
        jsonObject.put("univrctLocation",univrctLocation);
        jsonObject.put("univrctAffiliate",univrctAffiliate);
        jsonObject.put("univrctLevel",univrctLevel);
        jsonObject.put("univrctHomePage",univrctHomePage);
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping("/isDoneWXQuiz")
    public String isDoneWXQuiz(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        int isEnn = Integer.parseInt(String.valueOf(stueva.getIsEnn()));
        int isHol = Integer.parseInt(String.valueOf(stueva.getIsHol()));
        int isSi = Integer.parseInt(String.valueOf(stueva.getIsSi()));
        if (isEnn+isHol+isSi==3){
            return "ok";
        }else{
            return "no";
        }
    }

    @ResponseBody
    @RequestMapping("/wxSaveNewCEChoose")
    public String wxSaveNewCEChoose(HttpSession session,String subResult){
        int stuId = (int) session.getAttribute("stuId");
        Student student=studentRepository.findOne(stuId);
        student.setStuSelectedSubjectNewexam(subResult);
        studentRepository.save(student);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/getMajorRepo")
    public ArrayList<String> getMajorRepo(String majorCode){
        ArrayList<MajorSimplify> list = majorSimplifyRepository.findByFatherId(majorCode);
        Iterator<MajorSimplify> iterator = list.iterator();
        ArrayList<String> ret = new ArrayList<String>();
        System.out.println(list.size());
        System.out.println(list.toString());
        while (iterator.hasNext()){
            MajorSimplify majorSimplify = iterator.next();
            ret.add(majorSimplify.getMsId()+"-"+majorSimplify.getMsName());
        }
        return ret;
    }

    @ResponseBody
    @RequestMapping("/getMajorInfo")
    public Object getMajorInfo(String majorCode){
        MajorRegular majorRegular = majorRegularRepository.findOne(majorCode);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("majrName",majorRegular.getMajrName());
        jsonObject.put("majrSchedule",majorRegular.getMajrSchedule());
        jsonObject.put("majrDegree",majorRegular.getMajrDegree());
        jsonObject.put("majrIntroduce",majorRegular.getMajrIntroduce());
        jsonObject.put("majrAim",majorRegular.getMajrAim());
        jsonObject.put("majrRequire",majorRegular.getMajrRequire());
        jsonObject.put("majrFamous",majorRegular.getMajrFamous());
        jsonObject.put("majrClasses",majorRegular.getMajrClasses());
        jsonObject.put("majrSubjectRequire",majorRegular.getMajrSubjectRequire());
        jsonObject.put("majrKnowledgePower",majorRegular.getMajrKnowledgePower());
        jsonObject.put("majrDirection",majorRegular.getMajrDirection());
        jsonObject.put("majrOccupation",majorRegular.getMajrOccupation());
        return jsonObject;
    }


    @ResponseBody
    @RequestMapping("/getNextEnn")
    public String getNextEnn(String towhich){
        int siId=Integer.parseInt(towhich);
        return ennQuestionRepository.findOne(siId).getTextA()+"&"+ennQuestionRepository.findOne(siId).getTextB();
    }

    @ResponseBody
    @RequestMapping("/getNextSi")
    public String getNextSi(String towhich){
        int siId=Integer.parseInt(towhich);
        return subInterestRepository.findOne(siId).getText();
    }


    @ResponseBody
    @RequestMapping("/getNextHol")
    public String getNextHol(String towhich){
        int siId=Integer.parseInt(towhich);
        return holQuestionRepository.findOne(siId).getText()+"&"+holQuestionRepository.findOne(siId).getMark1()+"&"+holQuestionRepository.findOne(siId).getMark1();
    }

    @ResponseBody
    @RequestMapping("/getWxEnnResult")
    public String getWxEnnResult(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String ennResultOrigin = stueva.getEnnResult();
        String ennResRet="";
        for (int i = 0;i<8;i++){
            ennResRet=ennResRet+ennResultOrigin.charAt(i)+",";
        }
        ennResRet=ennResRet+ennResultOrigin.charAt(8);
        return ennResRet;
    }

    @ResponseBody
    @RequestMapping("/getWxHolRes")
    public String getWxHolRes(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String holResult = stueva.getHolResult();
        return holResult;
    }


    @ResponseBody
    @RequestMapping("/getItlRes")
    public String getItlRes(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String inteleResult = stueva.getInteleResult();
        return inteleResult;
    }

    @ResponseBody
    @RequestMapping("/getWxMajorRecList")
    public String getWxMajorRecList(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String majors = stueva.getGuideSubjectList();
        return majors;
    }



    @ResponseBody
    @RequestMapping("/infoInitGetInfo")
    public Object infoInitGetInfo(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        JSONObject jsonObject = new JSONObject();
//        need null exception dealing
        Student student=studentRepository.findOne(stuId);
        String name = student.getStuName();
        String point = student.getStuPoint();
        String year = student.getStuYear();
        String subjectCode = student.getStuSubjectCode();
        String provinceCode = student.getStuProvinceCode();
        String cityCode = student.getStuCityCode();
        String districtCode = student.getStuDistrictCode();
        String stuHighschoolCode = student.getStuHighschoolCode();
        jsonObject.put("name",name);
        jsonObject.put("point",point);
        jsonObject.put("year",year);
        jsonObject.put("subjectCode",subjectCode);
        jsonObject.put("provinceCode",provinceCode);
        jsonObject.put("cityCode",cityCode);
        jsonObject.put("districtCode",districtCode);
        jsonObject.put("stuHighschoolCode",stuHighschoolCode);
        return jsonObject;
    }



    @ResponseBody
    @RequestMapping("/wxSaveInitInfoOld")
    public String wxSaveInitInfoOld(HttpServletRequest request,HttpSession session,String telInfo, String markInfo, String yearInfo, String subjectcode, String provinceInfo, String cityInfo, String districtInfo, String schoolInfo){

//        Student student = studentRepository.findStudentByStuTel(tel);
//        student.setStuName(name);
//        student.setTmpPlace(tmpplace);
//        student.setStuIsNewexam(isnewce);
//        studentRepository.save(student);

//        System.out.println(telInfo);
//        System.out.println(markInfo);
//        System.out.println(yearInfo);
//        System.out.println(subjectcode);
//        System.out.println(provinceInfo);
//        System.out.println(cityInfo);
//        System.out.println(districtInfo);
//        System.out.println(schoolInfo);

        Integer stuId = null;
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "nullCookie";
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("JSESSIONID")){
                System.out.println("JSessionId："+cookie.getValue());
                stuId = (int) session.getAttribute("stuId");
                if (stuId==null){
                    return "overdue";
                }else {
                    Student stu = studentRepository.findOne(stuId);
                    stu.setStuTel(telInfo);
                    stu.setStuPassword(telInfo);
                    stu.setStuPoint(markInfo);
                    stu.setStuYear(yearInfo);
                    stu.setStuSubjectCode(subjectcode);
                    stu.setStuProvinceCode(provinceInfo);
                    stu.setStuCityCode(cityInfo);
                    stu.setStuDistrictCode(districtInfo);
                    stu.setStuHighschoolCode(schoolInfo);
                    studentRepository.save(stu);
                    return "saveSuccess";
                }
            }
        }
        return "wrongCookie";
    }

    @ResponseBody
    @RequestMapping("/wxSaveInitInfo")
    public String wxSaveInitInfo(HttpServletRequest request,HttpSession session,String stuName,String telInfo, String markInfo, String yearInfo, String subjectcode, String provinceInfo, String cityInfo, String districtInfo, String schoolInfo){

//        Student student = studentRepository.findStudentByStuTel(tel);
//        student.setStuName(name);
//        student.setTmpPlace(tmpplace);
//        student.setStuIsNewexam(isnewce);
//        studentRepository.save(student);

//        System.out.println(telInfo);
//        System.out.println(markInfo);
//        System.out.println(yearInfo);
//        System.out.println(subjectcode);
//        System.out.println(provinceInfo);
//        System.out.println(cityInfo);
//        System.out.println(districtInfo);
//        System.out.println(schoolInfo);
        int stuId = (int) session.getAttribute("stuId");
        Student stu=studentRepository.findOne(stuId);
        String openId= (String) session.getAttribute("openid");
        stu.setStuName(stuName);
        stu.setStuTel(telInfo);
        stu.setStuPassword(telInfo);
        stu.setStuPoint(markInfo);
        stu.setStuYear(yearInfo);
        stu.setStuSubjectCode(subjectcode);
        stu.setStuProvinceCode(provinceInfo);
        stu.setStuCityCode(cityInfo);
        stu.setStuDistrictCode(districtInfo);
        stu.setStuHighschoolCode(schoolInfo);
        stu.setTmpPlace(openId);
        studentRepository.save(stu);
        return "saveSuccess";
    }

//    @ResponseBody
//    @RequestMapping("/t")
//    public String t(HttpServletRequest request,HttpSession session) {
//        Cookie[] cookies = request.getCookies();
//        if (Objects.isNull(cookies)){
//            return "cookies信息为null";
//        }
//        for (Cookie cookie:cookies){
//            if (cookie.getName().equals("JSESSIONID")){
//                System.out.println("JSessionId："+cookie.getValue());
//                int stuId = (int) session.getAttribute("stuId");
//                return session.getAttribute("stuId").toString();
//            }
//        }
//        return "cookies信息错误";
//    }
//
//    @ResponseBody
//    @RequestMapping("/testSession")
//    public String testSession(HttpSession session){
//        return session.getAttribute("stuId").toString();
//    }

    @ResponseBody
    @RequestMapping("/HomePageInfoGet")
    public Object getHomePageInfo(HttpSession session){
        JSONObject jsonObject = new JSONObject();
        int stuId = (int) session.getAttribute("stuId");
        Student student=studentRepository.findOne(stuId);
        String name = student.getStuName();
        String point = student.getStuPoint();
        String schoolCode = student.getStuHighschoolCode();
        String year = student.getStuYear();
        String subjectCode=student.getStuSubjectCode();
        String subject = "新高考";
        String isnewCE="1";
        ArrayList<TbFinFsyx> recSchoolOptimistic=null;
        ArrayList<TbFinFsyx> recSchoolNormal=null;
        ArrayList<TbFinFsyx> recSchoolPessimistic=null;
        if ("2017".equals(year)){
            isnewCE="0";
            subject=subjectCode.equals("1")?"文科":"理科";
            recSchoolOptimistic = tbFinFsyxRepository.getRecSchoolOldCE(Integer.parseInt(point)+10,Integer.parseInt(point),subjectCode);
            System.out.println(Integer.parseInt(point)+10);
            System.out.println(Integer.parseInt(point));
            System.out.println(subjectCode);
            recSchoolNormal = tbFinFsyxRepository.getRecSchoolOldCE(Integer.parseInt(point),Integer.parseInt(point)-10,subjectCode);
            recSchoolPessimistic = tbFinFsyxRepository.getRecSchoolOldCEASC(Integer.parseInt(point)-10,Integer.parseInt(point)-20,subjectCode);
        }else{
            recSchoolOptimistic = tbFinFsyxRepository.getRecSchool(Integer.parseInt(point)+10,Integer.parseInt(point));
            recSchoolNormal = tbFinFsyxRepository.getRecSchool(Integer.parseInt(point),Integer.parseInt(point)-10);
            recSchoolPessimistic = tbFinFsyxRepository.getRecSchoolASC(Integer.parseInt(point)-10,Integer.parseInt(point)-20);
        }
        Iterator<TbFinFsyx> recSchoolOptimisticIter = recSchoolOptimistic.iterator();
        Iterator<TbFinFsyx> recSchoolNormalIter = recSchoolNormal.iterator();
        Iterator<TbFinFsyx> recSchoolPessimisticIter = recSchoolPessimistic.iterator();

        ArrayList<String> recSchoolNameOptimisticList = new ArrayList<String>();
        ArrayList<String> recSchoolNameNormalList = new ArrayList<String>();
        ArrayList<String> recSchoolNamePessimisticList = new ArrayList<String>();
        ArrayList<String> recCodesopts=new ArrayList<String>();
        ArrayList<String> recCodesnors=new ArrayList<String>();
        ArrayList<String> recCodespess=new ArrayList<String>();
        while (recSchoolOptimisticIter.hasNext()){
            TbFinFsyx tbFinFsyxOptimistic = recSchoolOptimisticIter.next();
            recCodesopts.add(tbFinFsyxOptimistic.getFfsxYxdm());
            String schoolCodeTmp = tbFinFsyxOptimistic.getFfsxYxdm();
            String pointTmp = tbFinFsyxOptimistic.getFfsxZdfs01();
            String schoolNameTmp = tbDaxueRepository.getNameById(schoolCodeTmp);
            System.out.println(schoolNameTmp);
            System.out.println(schoolCodeTmp);
            System.out.println(pointTmp);
            recSchoolNameOptimisticList.add(schoolNameTmp);
        }
        while (recSchoolNormalIter.hasNext()){
            TbFinFsyx tbFinFsyxSchoolNormal = recSchoolNormalIter.next();
            recCodesnors.add(tbFinFsyxSchoolNormal.getFfsxYxdm());
            String schoolCodeTmp = tbFinFsyxSchoolNormal.getFfsxYxdm();
            String pointTmp = tbFinFsyxSchoolNormal.getFfsxZdfs01();
            String schoolNameTmp = tbDaxueRepository.getNameById(schoolCodeTmp);
            System.out.println(schoolNameTmp);
            System.out.println(schoolCodeTmp);
            System.out.println(pointTmp);
            recSchoolNameNormalList.add(schoolNameTmp);
        }
        while (recSchoolPessimisticIter.hasNext()){
            TbFinFsyx tbFinFsyxSchoolPessimistic = recSchoolPessimisticIter.next();
            recCodespess.add(tbFinFsyxSchoolPessimistic.getFfsxYxdm());
            String schoolCodeTmp = tbFinFsyxSchoolPessimistic.getFfsxYxdm();
            String pointTmp = tbFinFsyxSchoolPessimistic.getFfsxZdfs01();
            String schoolNameTmp = tbDaxueRepository.getNameById(schoolCodeTmp);
            System.out.println(schoolNameTmp);
            System.out.println(schoolCodeTmp);
            System.out.println(pointTmp);
            recSchoolNamePessimisticList.add(schoolNameTmp);
        }

        jsonObject.put("name",name);
        jsonObject.put("year",year);
        jsonObject.put("point",point);
        jsonObject.put("schoolCode",schoolCode);
        jsonObject.put("subject",subject);
        jsonObject.put("subjectCode",subjectCode);
        jsonObject.put("recSchoolOptimistic",recSchoolNameOptimisticList);
        jsonObject.put("recSchoolNormal",recSchoolNameNormalList);
        jsonObject.put("recSchoolPessimistic",recSchoolNamePessimisticList);
        jsonObject.put("recCodesopts",recCodesopts);
        jsonObject.put("recCodesnors",recCodesnors);
        jsonObject.put("recCodespess",recCodespess);
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping("/minePageInfoOnload")
    public Object minePageInfoOnLoad(HttpSession session){
        JSONObject jsonObject = new JSONObject();
        int stuId = (int) session.getAttribute("stuId");
        Student student=studentRepository.findOne(stuId);
        String name = student.getStuName();
        String year = student.getStuYear();
        String chineseMark="0";
        String mathMark="0";
        String flMark="0";
        String newCELabel="";
        String sub1="待选";
        String sub2="待选";
        String sub3="待选";
        String sub1mark="0";
        String sub2mark="0";
        String sub3mark="0";
        int isChooseComplete;
        String noChooseReason="未进行分科分数设定，请点击右下角编辑";
        String total = student.getStuPoint();
        String subject15 = student.getStuSubjectCode();
        if ("2017".equals(year)){
            newCELabel="非新高考";
            if (subject15.equals("1")){
                isChooseComplete=1;
                System.out.println("文理代码"+subject15);
                sub1="政治";
                sub2="历史";
                sub3="地理";
            }else if (subject15.equals("5")){
                isChooseComplete=1;
                System.out.println("文理代码"+subject15);
                sub1="物理";
                sub2="化学";
                sub3="生物";
            }else {
                isChooseComplete=-1;
                noChooseReason="请选择文理";
            }
            String pointDetailStr = student.getStuPointDetail();
            String[] pointDetailArr = pointDetailStr.split(",");
            chineseMark=pointDetailArr[0];
            mathMark=pointDetailArr[1];
            flMark=pointDetailArr[2];
            sub1mark=pointDetailArr[3];
            sub2mark=pointDetailArr[4];
            sub3mark=pointDetailArr[5];
        }else{
            newCELabel="新高考";
            System.out.println("新高考");
            String newCeSubChooseStr=student.getStuSelectedSubjectNewexam();
            String studentPointDetailString=student.getStuPointDetailNewexam();
            String[] newCeChooseList = newCeSubChooseStr.split(",");
            String[] newCeChooseMarks = studentPointDetailString.split(",");
            String[] subList={"物理","化学","生物","政治","历史","地理"};
            ArrayList<String> chooseResult = new ArrayList<String>();
            ArrayList<String> chooseMark  =  new ArrayList<String>();
            int chooseSubcount=0;
            chineseMark=newCeChooseMarks[0];
            mathMark=newCeChooseMarks[1];
            flMark=newCeChooseMarks[2];
            for (int i = 0;i<6;i++){
                if (newCeChooseList[i].equals("1")){
                    chooseSubcount++;
                    chooseResult.add(subList[i]);
                    chooseMark.add(newCeChooseMarks[i+3]);
                }
            }
            if (chooseSubcount==3){
                isChooseComplete=1;
                sub1=chooseResult.get(0);
                sub1mark = chooseMark.get(0);
                sub2=chooseResult.get(1);
                sub2mark = chooseMark.get(1);
                sub3=chooseResult.get(2);
                sub3mark = chooseMark.get(2);
            }else {
                isChooseComplete=-2;
                noChooseReason="请进行选科";
            }
        }
        jsonObject.put("name",name);
        jsonObject.put("year",year);
        jsonObject.put("subjectCode",subject15);
        jsonObject.put("newCELabel",newCELabel);
        jsonObject.put("isChooseComplete",isChooseComplete);
        jsonObject.put("noChooseReason",noChooseReason);
        jsonObject.put("chineseMark",chineseMark);
        jsonObject.put("mathMark",mathMark);
        jsonObject.put("flMark",flMark);
        jsonObject.put("sub1",sub1);
        jsonObject.put("sub1mark",sub1mark);
        jsonObject.put("sub2",sub2);
        jsonObject.put("sub2mark",sub2mark);
        jsonObject.put("sub3",sub3);
        jsonObject.put("sub3mark",sub3mark);
        jsonObject.put("total",total);
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping("/savePoint")
    public String savePoint(HttpSession session, String year, String chineseMark, String mathMark, String flMark, String sub1mark, String sub2mark, String sub3mark){
        int stuId = (int) session.getAttribute("stuId");
        Student student=studentRepository.findOne(stuId);
        System.out.println(year);
        System.out.println(chineseMark);
        System.out.println(mathMark);
        System.out.println(flMark);
        System.out.println(sub1mark);
        System.out.println(sub2mark);
        System.out.println(sub3mark);
        student.setStuPoint(Integer.parseInt(chineseMark)+Integer.parseInt(mathMark)+Integer.parseInt(flMark)+Integer.parseInt(sub1mark)+Integer.parseInt(sub2mark)+Integer.parseInt(sub3mark)+"");
        if (Integer.parseInt(year)<=2017){
            student.setStuPointDetail(chineseMark+","+mathMark+","+flMark+","+sub1mark+","+sub2mark+","+sub3mark);
            studentRepository.save(student);
        }else {
            System.out.println("新高考");
            String selected = student.getStuSelectedSubjectNewexam();
            String pointDetailNewCE = chineseMark+","+mathMark+","+flMark;
            String [] selectedArray=selected.split(",");
            ArrayList<String> list = new ArrayList<String>();
            list.add(sub1mark);
            list.add(sub2mark);
            list.add(sub3mark);
            int j = 0;
            for(int i = 0;i<6;i++){
                if(selectedArray[i].equals("0")){
                    System.out.println(selectedArray[i]);
                    pointDetailNewCE=pointDetailNewCE+","+"0";
                }else {
                    System.out.println(selectedArray[i]);
                    System.out.println(i);
                    pointDetailNewCE=pointDetailNewCE+","+list.get(j);
                    j++;
                }
            }
            student.setStuPointDetailNewexam(pointDetailNewCE);
            studentRepository.save(student);
        }
        return "ok";
    }

    public String getGuideSubjectCodes(HttpSession session){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        return stueva.getGuideSubjectList();
    }

    @ResponseBody
    @RequestMapping("/getGuidSubjectNames")
    public ArrayList<String> getGuidSubjectNames(HttpSession session){
        String guideSubjectCodes = getGuideSubjectCodes(session);
        String rets="";
        if (!guideSubjectCodes.equals("")){
            String[] guideSubjectCodesArr = guideSubjectCodes.split(",");
            ArrayList<String> ret = new ArrayList<String>();
            for(String eachSub:guideSubjectCodesArr){
                MajorSimplify majorSimplify=majorSimplifyRepository.findOne(eachSub);
                ret.add(majorSimplify.getMsName());
            }
            return ret;
        }else{
            return null;
        }
    }

    @ResponseBody
    @RequestMapping("/login")
    public String wxOauth(String codes, HttpServletRequest request, HttpSession session) throws Exception{
        Object res = getPhoneNumber(codes,request,session);
        return res.toString();
    }

    public Object getPhoneNumber(String code,HttpServletRequest request, HttpSession session) {
        //传入code后然后获取openid和session_key的，把他们封装到json里面
        JSONObject json = getSessionKeyOropenid(code);
        String session_key = (String) json.get("session_key");
        String openid = (String) json.get("openid");

        System.out.println("session_key"+session_key);
        System.out.println("openid"+openid);
//        find student by openid
        Student student = studentRepository.findStudentByTmpPlace(openid);
        String sessionId = session.getId();


        json.put("yifzySessionId",sessionId);
        session.setAttribute("openid",openid);
        if (student!=null){
            String stu_phone = student.getStuTel();
            StudentLoginBean studentLoginBean = studentLoginRepository.findByStuTel(stu_phone);
            Integer stuId = studentLoginBean.getStuId();
            session.setAttribute("stuId",stuId);
            json.put("if_info_compelet","1");
            json.put("stu_tel",stu_phone);
            System.out.println("if_info_compelet"+"1");
            System.out.println("stu_tel"+stu_phone);
        }else{
            json.put("if_info_compelet","0");
        }
//        if (json != null) {
//            session_key = json.getString("session_key");
//            // 被加密的数据
//            byte[] dataByte = Base64.decode(encryptedData);
//            // 加密秘钥
//            byte[] keyByte = Base64.decode(session_key);
//            // 偏移量
//            byte[] ivByte = Base64.decode(iv);
//            try {
//                // 如果密钥不足16位，那么就补足.
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
//                    JSONObject jsonObject =JSONObject.parseObject(result);
//                    String stu_phone=jsonObject.get("phoneNumber").toString();
//                    System.out.println(stu_phone);
//                    StudentLoginBean studentLoginBean = studentLoginRepository.findByStuTel(stu_phone);
//                    System.out.println("1");
//                    String sessionId = session.getId();
//                    jsonObject.put("yifzySessionId",sessionId);
//                    if (studentLoginBean!=null){
//                        //有用户
//                        System.out.println("2");
//                        Integer stuId = studentLoginBean.getStuId();
//                        session.setAttribute("stuId",stuId);
//                        Student student=studentRepository.findOne(stuId);
//                        if (student.getStuProvinceCode()==null||student.getStuCityCode()==null||student.getStuDistrictCode()==null||(student.getStuHighschoolCode()!=null&&Integer.parseInt(student.getStuHighschoolCode())==0)||student.getStuHighschoolCode()==null||student.getStuYear()==null||(student.getStuYear()=="2017"&&Integer.parseInt(student.getStuSubjectCode())==0)||student.getStuPoint()==null){
//                            //有未完善的信息的情况
//                            jsonObject.put("if_info_compelet","0");
//                            System.out.println("info not complete");
////                            jsonObject.put("mark",student.getStuPoint());
////                            jsonObject.put("grade",2020-Integer.parseInt(student.getStuYear()));
////                            jsonObject.put("subject",student.getStuSubjectCode());
//                        }else {
//                            //信息完善的情况
//                            jsonObject.put("if_info_compelet","1");
//                            System.out.println("info complete");
//                        }
//                    }else{
//                        //无用户
//                        //创建学生,然后比照信息不完善
//                        Student stu = new Student();
//                        stu.setStuTchrId("281");//281 is the id of system teacher
//                        stu.setStuTel(stu_phone);
//                        stu.setStuPassword(stu_phone);
//                        studentRepository.save(stu);
//                        Integer stuId = studentRepository.findStudentByStuTel(stu_phone).getStuId();
//                        session.setAttribute("stuId",stuId);
//                        stuevaRepository.save(new Stueva(stuId));
//                        System.out.println("3");
//                        jsonObject.put("if_info_compelet","0");
//                    }
//                    return jsonObject;
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        return json;
    }
    @ResponseBody
    @RequestMapping("/fillPhone")
    public String fillPhone(String tel,HttpSession session){
        System.out.println(tel);
        String openId= (String) session.getAttribute("openid");
        Student student = studentRepository.findStudentByStuTel(tel);
        if(student!=null){
            System.out.println("有学生");

            studentRepository.save(student);
            session.setAttribute("stuId",student.getStuId());
        }else {
            System.out.println("创建学生");
            Student stu = new Student();
            stu.setStuTchrId("281");//281 is the id of system teacher
            stu.setStuTel(tel);
            stu.setStuPassword(tel);

            studentRepository.save(stu);
            Integer stuId = studentRepository.findStudentByStuTel(tel).getStuId();
            session.setAttribute("stuId",stuId);
            stuevaRepository.save(new Stueva(stuId));
        }
        return tel;
    }

    public static JSONObject getSessionKeyOropenid(String code) {
        //微信端登录code值
        String wxCode = code;
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";  //请求地址 https://api.weixin.qq.com/sns/jscode2session
        Map<String, String> requestUrlParam = new HashMap<String, String>();
        requestUrlParam.put("appid", "wxe193ea85e9346a5f");  //开发者设置中的appId
        requestUrlParam.put("secret", "d5b3961eddd15dd0962c11ea98f74437"); //开发者设置中的appSecret
        requestUrlParam.put("js_code", wxCode); //小程序调用wx.login返回的code
        requestUrlParam.put("grant_type", "authorization_code");    //默认参数 authorization_code
        //发送post请求读取调用微信 https://api.weixin.qq.com/sns/jscode2session 接口获取openid用户唯一标识
        JSONObject jsonObject = JSON.parseObject(sendPost(requestUrl, requestUrlParam));
        return jsonObject;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url 发送请求的 URL
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, Map<String, ?> paramMap) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        String param = "";
        Iterator<String> it = paramMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            param += key + "=" + paramMap.get(key) + "&";
        }

        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("Accept-Charset", "utf-8");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

//    tmp dealing
    @ResponseBody
    @RequestMapping("/wxcalculatePTypes")
    public String wxCalculateEnneagram(HttpSession session,String enneagram_answer){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
//        int stuId = studentRepository.findStudentByStuTel(tel).getStuId();
//        Stueva stueva = stuevaRepository.findByStuId(stuId);
        System.out.println("WX-enneagram_answer--"+enneagram_answer);
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
    @ResponseBody
    @RequestMapping("/wxCalculateSITest")
    public String wxCalculateSITest(HttpSession session,String SI_answer,String SI_sort){
        int stuId = (int) session.getAttribute("stuId");
        Stueva stueva = stuevaRepository.findByStuId(stuId);
        String si_result_str = "";
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
    @RequestMapping("/wxCalculateJobInterest")
    public String wxCalculateJobInterest(HttpSession session,String holland_answer,String sortresult){
        int stuId = (int) session.getAttribute("stuId");
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

}