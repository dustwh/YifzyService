function selectOnchang(obj){
    var value = obj.options[obj.selectedIndex].value;
}
function subjectCodeSelectOnchang(obj){
    if($("input[name=is_new_ce]:checked").val()==0){
        if($(obj).val()=='1'){
            $("#stuPoint4Label").html("政")
            $("#stuPoint5Label").html("史")
            $("#stuPoint6Label").html("地")

            var str = "<li class=\"ui-state-default\">语文</li>"
                +"<li class=\"ui-state-default\">数学</li>"
                +"<li class=\"ui-state-default\">外语</li>"
                +"<li class=\"ui-state-default\">历史</li>"
                +"<li class=\"ui-state-default\">政治</li>"
                +"<li class=\"ui-state-default\">地理</li>"
            $('#subjectSortable').html(str)
        }else if($(obj).val()=='5'){
            $("#stuPoint4Label").html("物")
            $("#stuPoint5Label").html("化")
            $("#stuPoint6Label").html("生")

            var str = "<li class=\"ui-state-default\">语文</li>"
                +"<li class=\"ui-state-default\">数学</li>"
                +"<li class=\"ui-state-default\">外语</li>"
                +"<li class=\"ui-state-default\">物理</li>"
                +"<li class=\"ui-state-default\">化学</li>"
                +"<li class=\"ui-state-default\">生物</li>"
            $('#subjectSortable').html(str)
        }else{
            $("#stuPoint4Label").html("请选科类")
            $("#stuPoint5Label").html("请选科类")
            $("#stuPoint6Label").html("请选科类")
            $('#subjectSortable').html("<li class=\"ui-state-default\">请选择科类</li>")
        }
    }
}

/*<![CDATA[*/
toast_list = []
function checking() {
    result_list=[];
    toast_list="";
    if(is_new_ce=="0"||is_new_ce==0){

        // 高亮
        if($("#stuSex").val()==0){
            result_list.push("#stuSex")
            toast_list=toast_list+" 性别"
        }
        $("#stuHighschoolCodeLabelDiv").attr("class","form-group")
        if($("#stuHighschoolCode").val()==0){
            result_list.push("#stuHighschoolCode")
            toast_list=toast_list+" 高中"
        }
        $("#stuYearLabelDiv").attr("class","form-group")
        if(  ($("#stuYear").val()==null) || ($("#stuYear").val()=="") ){
            result_list.push("#stuYear")
            toast_list=toast_list+" 入学年份"
        }
        $("#stuHighschoolClassLabelDiv").attr("class","form-group")


        if(($("#stuHighschoolClass").val()==null)||($("#stuHighschoolClass").val()=="")){
            result_list.push("#stuHighschoolClass")
            toast_list=toast_list+" 班级"
        }

        $("#stuSubjectCodeLabelDiv").attr("class","form-group")
        if ($("#stuSubjectCode").val()==0){
            result_list.push("#stuSubjectCode")
            toast_list=toast_list+" 科类（文理）"
        }

        $("#stuRaceLabelDiv").attr("class","form-group")
        if ($("#stuRace").val()==0){
            result_list.push("#stuRace")
            toast_list=toast_list+" 民族"
        }
        $("#stuHeightLabelDiv").attr("class","form-group")
        if(($("#stuHeight").val()==null)||($("#stuHeight").val()=="")){
            result_list.push("#stuHeight")
            toast_list=toast_list+" 身高"
        }
        $("#stuEyesightLabelDiv").attr("class","form-group")
        if($("#stuEyesight").val()==9){
            result_list.push("#stuEyesight")
            toast_list=toast_list+" 视力"
        }
        $("#stuColourWeaknessLabelDiv").attr("class","form-group")
        if($("#stuColourWeakness").val()==9){
            result_list.push("#stuColourWeakness")
            toast_list=toast_list+" 是否色弱"
        }
        $("#stuPointLabelDiv").attr("class","form-group")
        if (($("#stuPoint").val()==null)||($("#stuPoint").val()=="")||($("#stuPoint").val()==0)){
            result_list.push("#stuPoint");
            toast_list=toast_list+"请估分"
        }
    }else{
        $("#stuSexLabelDiv").attr("class","form-group")
        if($("#stuSex").val()==0){
            result_list.push("#stuSex")
            toast_list=toast_list+" 性别"
        }
        $("#stuHighschoolCodeLabelDiv").attr("class","form-group")
        if($("#stuHighschoolCode").val()==0){
            result_list.push("#stuHighschoolCode")
            toast_list=toast_list+" 高中"
        }
        $("#stuYearLabelDiv").attr("class","form-group")
        if(  ($("#stuYear").val()==null) || ($("#stuYear").val()=="") ){
            result_list.push("#stuYear")
            toast_list=toast_list+" 入学年份"
        }
        $("#stuHighschoolClassLabelDiv").attr("class","form-group")
        if(($("#stuHighschoolClass").val()==null)||($("#stuHighschoolClass").val()=="")){
            result_list.push("#stuHighschoolClass")
            toast_list=toast_list+" 班级"
        }
        $("#stuSubjectCodeLabelDiv").attr("class","form-group")

        if ($("#stuSubjectCodeNewCe").val()==0){
            result_list.push("#stuSubjectCode")
            toast_list=toast_list+" 偏好（文理）"
        }
        $("#stuRaceLabelDiv").attr("class","form-group")
        if ($("#stuRace").val()==0){
            result_list.push("#stuRace")
            toast_list=toast_list+" 民族"
        }
        $("#stuHeightLabelDiv").attr("class","form-group")
        if(($("#stuHeight").val()==null)||($("#stuHeight").val()=="")){
            result_list.push("#stuHeight")
            toast_list=toast_list+" 身高"
        }
        $("#stuEyesightLabelDiv").attr("class","form-group")
        if($("#stuEyesight").val()==9){
            result_list.push("#stuEyesight")
            toast_list=toast_list+" 视力"
        }
        $("#stuColourWeaknessLabelDiv").attr("class","form-group")
        if($("#stuColourWeakness").val()==9){
            result_list.push("#stuColourWeakness")
            toast_list=toast_list+" 是否色弱"
        }

    }
    return result_list
}
$(".save").click(function(){
    var newSubjectSortableStr = ""
    var newSubjectSortableStrList = []
    var newTlist = $("#subjectSortableShowForNewCe").children("li")
    if(newTlist.length==0){
        newSubjectSortableStr=","
    }else {
        for(var i=0;i<newTlist.length;i++){
            var newTid =  newTlist[i].innerHTML
            newSubjectSortableStrList.push(newTid)
            newSubjectSortableStr+=newTid+","
        }
    }
    newSubjectSortableStr=newSubjectSortableStr.substr(0,newSubjectSortableStr.length-1)
    var subjectSortableStr = ""
    var subjectSortableStrList = []
    var tlist = $("#subjectSortable").children("li")
    if(tlist.length==0){
        subjectSortableStr=","
    }else {
        for(var i=0;i<tlist.length;i++){
            var tid =  tlist[i].innerHTML
            subjectSortableStrList.push(tid)
            subjectSortableStr+=tid+","
        }
    }
    subjectSortableStr=subjectSortableStr.substr(0,subjectSortableStr.length-1)
    var stuIntentSubjectStr = ""
    if ($('#sub1_0').children().is(':checked'))stuIntentSubjectStr+="0"
    if ($('#sub1_1').children().is(':checked'))stuIntentSubjectStr+="1"
    if ($('#sub1_2').children().is(':checked'))stuIntentSubjectStr+="2"
    stuIntentSubjectStr+=","
    if ($('#sub2_0').children().is(':checked'))stuIntentSubjectStr+="0"
    if ($('#sub2_1').children().is(':checked'))stuIntentSubjectStr+="1"
    if ($('#sub2_2').children().is(':checked'))stuIntentSubjectStr+="2"
    stuIntentSubjectStr+=","
    if ($('#sub3_0').children().is(':checked'))stuIntentSubjectStr+="0"
    if ($('#sub3_1').children().is(':checked'))stuIntentSubjectStr+="1"
    if ($('#sub3_2').children().is(':checked'))stuIntentSubjectStr+="2"
    stuIntentSubjectStr+=","
    if ($('#sub4_0').children().is(':checked'))stuIntentSubjectStr+="0"
    if ($('#sub4_1').children().is(':checked'))stuIntentSubjectStr+="1"
    if ($('#sub4_2').children().is(':checked'))stuIntentSubjectStr+="2"
    stuIntentSubjectStr+=","
    if ($('#sub5_0').children().is(':checked'))stuIntentSubjectStr+="0"
    if ($('#sub5_1').children().is(':checked'))stuIntentSubjectStr+="1"
    if ($('#sub5_2').children().is(':checked'))stuIntentSubjectStr+="2"
    stuIntentSubjectStr+=","
    stuIntentSubjectStr+=$("#field_6").val()

    var str = $("#stuTel").val();
    var ret = /^[\d]{5,20}$/;
    result_list = checking();
    if(ret.test(str) && $("#stuName").val()!=""&&result_list.length==0){
        $(this).popover('hide');
        po=($("#stuPoint1NewCe").val()==""?0:parseInt($("#stuPoint1NewCe").val()))+($("#stuPoint2NewCe").val()==""?0:parseInt($("#stuPoint2NewCe").val()))+($("#stuPoint3NewCe").val()==""?0:parseInt($("#stuPoint3NewCe").val()))+($("#stuPoint4NewCe").val()==""?0:parseInt($("#stuPoint4NewCe").val()))+($("#stuPoint5NewCe").val()==""?0:parseInt($("#stuPoint5NewCe").val()))+($("#stuPoint6NewCe").val()==""?0:parseInt($("#stuPoint6NewCe").val()))+($("#stuPoint7NewCe").val()==""?0:parseInt($("#stuPoint7NewCe").val()))+($("#stuPoint8NewCe").val()==""?0:parseInt($("#stuPoint8NewCe").val()))+($("#stuPoint9NewCe").val()==""?0:parseInt($("#stuPoint9NewCe").val()))
        params = {
            stuId:$("#stuId").text(),
            stuTel:$("#stuTel").val(),
            stuName:$("#stuName").val(),
            stuEmail:$("#stuEmail").val(),
            stuQq:$("#stuQq").val(),
            stuSex:$("#stuSex").val(),
            stuProvinceCode:$("#province").val()+"0000",
            stuCityCode:$("#city").val()+"00",
            stuDistrictCode:$("#district").val(),
            stuHighschoolCode:$("#stuHighschoolCode").val(),
            stuYear:$("#stuYear").val(),
            stuHighschoolClass:$("#stuHighschoolClass").val(),
            stuRace:$("#stuRace").val(),
            stuSubjectCode:$("input[name=is_new_ce]:checked").val()==1?$("#stuSubjectCodeNewCe").val():$("#stuSubjectCode").val(),
            stuLanguageCode:$("#stuLanguageCode").val(),
            stuHeight:$("#stuHeight").val(),
            stuPoint:$("input[name=is_new_ce]:checked").val()==0?$("#stuPoint").val():po,
            stuEyesight:$("#stuEyesight").val(),
            stuColourWeakness:$("#stuColourWeakness").val(),
            stuPointDetail:($("#stuPoint1").val()==""?0:$("#stuPoint1").val())+","+($("#stuPoint2").val()==""?0:$("#stuPoint2").val())+","+($("#stuPoint3").val()==""?0:$("#stuPoint3").val())+","+($("#stuPoint4").val()==""?0:$("#stuPoint4").val())+","+($("#stuPoint5").val()==""?0:$("#stuPoint5").val())+","+($("#stuPoint6").val()==""?0:$("#stuPoint6").val()),
            stuGoodSubject:subjectSortableStr,
            stuIntentSubject:stuIntentSubjectStr,
            stuIntentCollege:$("#pre_college").val(),
            stuIntentCity:$("#pre_city").val(),
            stuAfterGraduation:($("#graduate_1").prop("checked")==false?0:1)+","+($("#graduate_2").prop("checked")==false?0:1)+","+($("#graduate_3").prop("checked")==false?0:1),
            stuSpecialType:($("#special_1").prop("checked")==false?0:1)+","+($("#special_2").prop("checked")==false?0:1),
            stuOtherInfo:$("#other_info").val(),
            isNewSe:$("input[name=is_new_ce]:checked").val(),
            stuPointDetailNewexam:$("input[name=is_new_ce]:checked").val()==0?"0,0,0,0,0,0,0,0,0": ($("#stuPoint1NewCe").val()==""?0:$("#stuPoint1NewCe").val())+","+($("#stuPoint2NewCe").val()==""?0:$("#stuPoint2NewCe").val())+","+($("#stuPoint3NewCe").val()==""?0:$("#stuPoint3NewCe").val())+","+($("#stuPoint4NewCe").val()==""?0:$("#stuPoint4NewCe").val())+","+($("#stuPoint5NewCe").val()==""?0:$("#stuPoint5NewCe").val())+","+($("#stuPoint6NewCe").val()==""?0:$("#stuPoint6NewCe").val())+","+($("#stuPoint7NewCe").val()==""?0:$("#stuPoint7NewCe").val())+","+($("#stuPoint8NewCe").val()==""?0:$("#stuPoint8NewCe").val())+","+($("#stuPoint9NewCe").val()==""?0:$("#stuPoint9NewCe").val()),
            stuGoodSubjectNewexam:$("input[name=is_new_ce]:checked").val()==0?"语文,数学,外语,物理,化学,生物,政治,历史,地理":newSubjectSortableStr
        }
        console.log(params);
        $.ajax({
            url:"./SaveInfo",
            type: "post",
            datatype:"text",
            data: params,
            success: function (ret) {
                if (ret=="ok"){
                    $("html,body").animate({scrollTop:0}, 500);
                    hi_if_info_compelet=1;
                    easy_notify("保存成功",2000);

                    $.ajax({
                        url:"./findStuId/"+stuId,
                        type: "get",
                        success: function (data) {
                            $("#self_info_update_date").html(data.stuInfoUpdateTime!=null?new Date(data.stuInfoUpdateTime).toLocaleString():"-")
                        },
                        error: function () {
                            // easy_notify("请检查网络连接",5000);
                        }
                    })

                }
            },
            error: function () {
                if(params.stuId==""){
                    alert("添加失败,电话号码重复或服务器未响应")
                }else {
                    alert("修改失败")
                }
            },
        })
    }else{
        if ($("#stuName").val()!=""){
        }else {
            toast_list=" 姓名"+toast_list
        }
        if(!ret.test(str)){
            toast_list=" 电话"+toast_list
        }

        if ("#stuSex#stuHighschoolCode#stuYear#stuHighschoolClass".indexOf(result_list[0])!=-1){
            $(this).attr('data-content',toast_list);
            $(this).popover('show');
        }else{

        }
        if($('#save1').hasClass('in')){
            $(this).popover('hide');
        } else
        {
            $(this).attr('data-content',toast_list);
            $(this).popover('show');
        }
    }
})
/*]]>*/