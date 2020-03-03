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
import javax.persistence.Id;
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
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.Security;



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
        String point = student.getStuPoint();
        String year = student.getStuYear();
        String subjectCode = student.getStuSubjectCode();
        String provinceCode = student.getStuProvinceCode();
        String cityCode = student.getStuCityCode();
        String districtCode = student.getStuDistrictCode();
        String stuHighschoolCode = student.getStuHighschoolCode();
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
    @RequestMapping("/wxSaveInitInfo")
    public String wxSaveInitInfo(HttpServletRequest request,HttpSession session,String telInfo, String markInfo, String yearInfo, String subjectcode, String provinceInfo, String cityInfo, String districtInfo, String schoolInfo){

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
    @RequestMapping("/t")
    public String t(HttpServletRequest request,HttpSession session) {
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "cookies信息为null";
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("JSESSIONID")){
                System.out.println("JSessionId："+cookie.getValue());
                int stuId = (int) session.getAttribute("stuId");
                return session.getAttribute("stuId").toString();
            }
        }
        return "cookies信息错误";
    }

    @ResponseBody
    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        return session.getAttribute("stuId").toString();
    }

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

        while (recSchoolOptimisticIter.hasNext()){
            TbFinFsyx tbFinFsyxOptimistic = recSchoolOptimisticIter.next();
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
            String schoolCodeTmp = tbFinFsyxSchoolPessimistic.getFfsxYxdm();
            String pointTmp = tbFinFsyxSchoolPessimistic.getFfsxZdfs01();
            String schoolNameTmp = tbDaxueRepository.getNameById(schoolCodeTmp);
            System.out.println(schoolNameTmp);
            System.out.println(schoolCodeTmp);
            System.out.println(pointTmp);
            recSchoolNamePessimisticList.add(schoolNameTmp);
        }

        jsonObject.put("name",name);
        jsonObject.put("point",point);
        jsonObject.put("schoolCode",schoolCode);
        jsonObject.put("subject",subject);
        jsonObject.put("subjectCode",subjectCode);
        jsonObject.put("recSchoolOptimistic",recSchoolNameOptimisticList);
        jsonObject.put("recSchoolNormal",recSchoolNameNormalList);
        jsonObject.put("recSchoolPessimistic",recSchoolNamePessimisticList);
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
    @RequestMapping("/getPhoneNumber")
    public String wxOauth(String encryptedData, String iv, String codes, HttpServletRequest request, HttpSession session) throws Exception{
        Object res = getPhoneNumber(encryptedData,codes,iv,request,session);
        return res.toString();
    }

    public Object getPhoneNumber(String encryptedData, String code, String iv,HttpServletRequest request, HttpSession session) {
        //传入code后然后获取openid和session_key的，把他们封装到json里面
        JSONObject json = getSessionKeyOropenid(code);
        String session_key = "";
        if (json != null) {
            session_key = json.getString("session_key");
            // 被加密的数据
            byte[] dataByte = Base64.decode(encryptedData);
            // 加密秘钥
            byte[] keyByte = Base64.decode(session_key);
            // 偏移量
            byte[] ivByte = Base64.decode(iv);
            try {
                // 如果密钥不足16位，那么就补足.
                int base = 16;
                if (keyByte.length % base != 0) {
                    int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                    byte[] temp = new byte[groups * base];
                    Arrays.fill(temp, (byte) 0);
                    System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                    keyByte = temp;
                }
                // 初始化
                Security.addProvider(new BouncyCastleProvider());
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
                AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
                parameters.init(new IvParameterSpec(ivByte));
                cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
                byte[] resultByte = cipher.doFinal(dataByte);
                if (null != resultByte && resultByte.length > 0) {
                    String result = new String(resultByte, "UTF-8");
                    JSONObject jsonObject =JSONObject.parseObject(result);
                    String stu_phone=jsonObject.get("phoneNumber").toString();
                    System.out.println(stu_phone);
                    StudentLoginBean studentLoginBean = studentLoginRepository.findByStuTel(stu_phone);
                    System.out.println("1");
                    String sessionId = session.getId();
                    jsonObject.put("yifzySessionId",sessionId);
                    if (studentLoginBean!=null){
                        //有用户
                        System.out.println("2");
                        Integer stuId = studentLoginBean.getStuId();
                        session.setAttribute("stuId",stuId);
                        Student student=studentRepository.findOne(stuId);
                        if (student.getStuProvinceCode()==null||student.getStuCityCode()==null||student.getStuDistrictCode()==null||(student.getStuHighschoolCode()!=null&&Integer.parseInt(student.getStuHighschoolCode())==0)||student.getStuHighschoolCode()==null||student.getStuYear()==null||(student.getStuYear()=="2017"&&Integer.parseInt(student.getStuSubjectCode())==0)||student.getStuPoint()==null){
                            //有未完善的信息的情况
                            jsonObject.put("if_info_compelet","0");
                            System.out.println("info not complete");
//                            jsonObject.put("mark",student.getStuPoint());
//                            jsonObject.put("grade",2020-Integer.parseInt(student.getStuYear()));
//                            jsonObject.put("subject",student.getStuSubjectCode());
                        }else {
                            //信息完善的情况
                            jsonObject.put("if_info_compelet","1");
                            System.out.println("info complete");
                        }
                    }else{
                        //无用户
                        //创建学生,然后比照信息不完善
                        Student stu = new Student();
                        stu.setStuTchrId("281");//281 is the id of system teacher
                        stu.setStuTel(stu_phone);
                        stu.setStuPassword(stu_phone);
                        studentRepository.save(stu);
                        Integer stuId = studentRepository.findStudentByStuTel(stu_phone).getStuId();
                        session.setAttribute("stuId",stuId);
                        stuevaRepository.save(new Stueva(stuId));
                        System.out.println("3");
                    }
                    return jsonObject;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
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

}