function selectOnchang(obj){
    var value = obj.options[obj.selectedIndex].value;
}
function subjectCodeSelectOnchang(obj){
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
    // var value = obj.options[obj.selectedIndex].value;
    // alert(value)
}
function initTabs(){
    $("#tab1").addClass('active');
    $("#tab2").removeClass('active');
    $("#tab3").removeClass('active');
    $("#basicInfo").addClass('active');
    $("#basicInfo").addClass('in');
    $("#exmInfo").removeClass('active');
    $("#exmInfo").removeClass('in');
    $("#exmInclination").removeClass('active');
    $("#exmInclination").removeClass('in');

    $("#stuNameLabelDiv").attr("class","form-group")
    $("#stuNameDiv").attr("class","form-group")
    $("#stuTelLabelDiv").attr("class","form-group")
    $("#stuTelDiv").attr("class","form-group")
}
// $("#next_modal").click(function () {
//
//     if ($("#tab1").attr("class")=="active"){
//         $("#tab1").removeClass('active');
//         $("#tab2").addClass('active');
//         $("#tab3").removeClass('active');
//         $("#basicInfo").removeClass('active');
//         $("#basicInfo").removeClass('in');
//         $("#exmInfo").addClass('active');
//         $("#exmInfo").addClass('in');
//         $("#exmInclination").removeClass('active');
//         $("#exmInclination").removeClass('in');
//     }else if ($("#tab2").attr("class")=="active"){
//         $("#tab1").removeClass('active');
//         $("#tab2").removeClass('active');
//         $("#tab3").addClass('active');
//         $("#basicInfo").removeClass('active');
//         $("#basicInfo").removeClass('in');
//         $("#exmInfo").removeClass('active');
//         $("#exmInfo").removeClass('in');
//         $("#exmInclination").addClass('active');
//         $("#exmInclination").addClass('in');
//     }else if ($("#tab3").attr("class")=="active"){
//         $("#tab1").addClass('active');
//         $("#tab2").removeClass('active');
//         $("#tab3").removeClass('active');
//         $("#basicInfo").addClass('active');
//         $("#basicInfo").addClass('in');
//         $("#exmInfo").removeClass('active');
//         $("#exmInfo").removeClass('in');
//         $("#exmInclination").removeClass('active');
//         $("#exmInclination").removeClass('in');
//     }
// })

function initNewModel(){
    initTabs()
    var modal = $('#editModal')
    modal.find('#editModalLabel').text("添加学生")
    modal.find('#stuNameTitle').text("")
    modal.find('#stuId').text("")
    modal.find('#stuTel').val("")

    modal.find('#stuName').val("")
    modal.find('#stuEmail').val("")
    modal.find('#stuQq').val("")
    modal.find('#stuSex').val(0)


    modal.find('#province').val("21")
    modal.find('#city').val("2101")
    modal.find('#district').val("210101")
    initSelect("province","21")
    initSelect("city","2101")
    modal.find('#stuHighschoolCode').val("0")
    // alert($("#stuHighschoolCode").find("option:selected").text())
    // initHighschoolSeletList("210101")

    // modal.find('#province').val("000000")
    // initSelect("province","000000")
    // modal.find('#city').val("000000")
    // modal.find('#district').val("000000")

    // modal.find('#stuHighschoolCode').val("0")
    // modal.find('#stuHighschoolName').val("")
    modal.find('#stuYear').val("")
    modal.find('#stuHighschoolClass').val("")
    modal.find('#stuRace').val(0)
    modal.find('#stuSubjectCode').val(0)
    modal.find('#stuLanguageCode').val(1)
    modal.find('#stuHeight').val("")
    modal.find('#stuPoint').val("")
    // modal.find('#stuPointPolicyAddpoint').val("")
    modal.find('#stuEyesight').val(9)
    modal.find('#stuColourWeakness').val(9)

    modal.find("#stuPoint4Label").html("请选科类")
    modal.find("#stuPoint5Label").html("请选科类")
    modal.find("#stuPoint6Label").html("请选科类")
    modal.find('#stuPoint1').val("")
    modal.find('#stuPoint2').val("")
    modal.find('#stuPoint3').val("")
    modal.find('#stuPoint4').val("")
    modal.find('#stuPoint5').val("")
    modal.find('#stuPoint6').val("")

    // modal.find('#stuPassword').val("")
    modal.find('#subjectSortable').html("<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 130px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">请选择科类</p></div>")
    // modal.find('#gdsub_1').prop("checked",false);
    // modal.find('#gdsub_2').prop("checked",false);
    // modal.find('#gdsub_3').prop("checked",false);
    // modal.find('#gdsub_4').prop("checked",false);
    // modal.find('#gdsub_5').prop("checked",false);
    // modal.find('#gdsub_6').prop("checked",false);
    // modal.find('#gdsub_7').prop("checked",false);
    // modal.find('#gdsub_8').prop("checked",false);
    // modal.find('#gdsub_9').prop("checked",false);
    // modal.find('#field_1').prop("checked",false);
    // modal.find('#field_2').prop("checked",false);
    // modal.find('#field_3').prop("checked",false);
    // modal.find('#field_4').prop("checked",false);
    // modal.find('#field_5').prop("checked",false);
    // modal.find('#sub1_0').attr("class","btn btn-primary active")
    modal.find('#sub1_0').attr("checked","true")
    // modal.find('#sub1_1').attr("class","btn btn-primary")
    // modal.find('#sub1_2').attr("class","btn btn-primary")
    // modal.find('#sub2_0').attr("class","btn btn-primary active")
    modal.find('#sub2_0').attr("checked","true")
    // modal.find('#sub2_1').attr("class","btn btn-primary")
    // modal.find('#sub2_2').attr("class","btn btn-primary")
    // modal.find('#sub3_0').attr("class","btn btn-primary active")
    modal.find('#sub3_0').attr("checked","true")
    // modal.find('#sub3_1').attr("class","btn btn-primary")
    // modal.find('#sub3_2').attr("class","btn btn-primary")
    // modal.find('#sub4_0').attr("class","btn btn-primary active")
    modal.find('#sub4_0').attr("checked","true")
    // modal.find('#sub4_1').attr("class","btn btn-primary")
    // modal.find('#sub4_2').attr("class","btn btn-primary")
    // modal.find('#sub5_0').attr("class","btn btn-primary active")
    modal.find('#sub5_0').attr("checked","true")
    // modal.find('#sub5_1').attr("class","btn btn-primary")
    // modal.find('#sub5_2').attr("class","btn btn-primary")

    modal.find('#field_6').val("");
    modal.find('#pre_college').val("");
    modal.find('#pre_city').val("");
    modal.find('#graduate_1').prop("checked",false);
    modal.find('#graduate_2').prop("checked",false);
    modal.find('#graduate_3').prop("checked",false);
    modal.find('#special_1').prop("checked",false);
    modal.find('#special_2').prop("checked",false);
    modal.find('#other_info').val("");
    $( ".check" ).button();
}
$(".new").click(function(){
    if (this.name.split("_")[0]=="new"){
        initNewModel();
    }
})
$(".delete").click(function(){
    if (this.name.split("_")[0]=="delete"){
        var modal = $('#deleteModal')
        modal.find('#delete_id').text(this.name.split("_")[1])
        modal.find('#delete_name').text($("#stuName"+this.name.split("_")[1]).html())
    }
})
$("#studentList").on("click",".delete",function(){
    if (this.name.split("_")[0]=="delete"){
        var modal = $('#deleteModal')
        modal.find('#delete_id').text(this.name.split("_")[1])
        modal.find('#delete_name').text($("#stuName"+this.name.split("_")[1]).html())
    }
})
$(".guide").click(function(){
    if (this.name.split("_")[0]=="guide"){
        // alert(this.name.split("_")[1])
        $(window).attr('location','./guideStudent?stu_id='+this.name.split("_")[1]);

    }
})
$("#studentList").on("click",".guide",function(){
    if (this.name.split("_")[0]=="guide"){
        $(window).attr('location','./guideStudent?stu_id='+this.name.split("_")[1]);
    }
})

$("#studentList").on("click",".edit",function(){
    if (this.name.split("_")[0]=="edit"){
        initTabs()
        var modal = $('#editModal')
        modal.find('#editModalLabel').text("修改学生：")
        modal.find('#stuId').text(this.name.split("_")[1])
        modal.find('#stuTel').val(this.name.split("_")[1])
        $.ajax({
            url:"./findStuId/"+this.name.split("_")[1],
            type: "get",
            success: function (data) {
                if(data=="timeout"){
                    $(window).attr('location','./login');
                }
                modal.find('#stuNameTitle').text(data.stuName)
                modal.find('#stuTel').val(data.stuTel)
                modal.find('#stuName').val(data.stuName)
                modal.find('#stuEmail').val(data.stuEmail)
                modal.find('#stuQq').val(data.stuQq)
                modal.find('#stuSex').val(data.stuSex)

                initSelect("province",data.stuProvinceCode.substr(0,2))
                initSelect("city",data.stuCityCode.substr(0,4))
                modal.find('#province').val(data.stuProvinceCode.substr(0,2))
                modal.find('#city').val(data.stuCityCode.substr(0,4))
                modal.find('#district').val(data.stuDistrictCode)

                modal.find('#stuHighschoolCode').val(data.stuHighschoolCode)
                // modal.find('#stuHighschoolName').val(data.stuHighschoolName)
                modal.find('#stuYear').val(data.stuYear)
                modal.find('#stuHighschoolClass').val(data.stuHighschoolClass)
                modal.find('#stuRace').val(data.stuRace)
                modal.find('#stuSubjectCode').val(data.stuSubjectCode)
                modal.find('#stuLanguageCode').val(data.stuLanguageCode)
                modal.find('#stuHeight').val(data.stuHeight)
                modal.find('#stuPoint').val(data.stuPoint)
                // modal.find('#stuPointPolicyAddpoint').val(data.stuPointPolicyAddpoint)
                modal.find('#stuEyesight').val(data.stuEyesight)
                modal.find('#stuColourWeakness').val(data.stuColourWeakness)
                if(data.stuSubjectCode=='1'){
                    $("#stuPoint4Label").html("政")
                    $("#stuPoint5Label").html("史")
                    $("#stuPoint6Label").html("地")
                }else if(data.stuSubjectCode=='5'){
                    $("#stuPoint4Label").html("物")
                    $("#stuPoint5Label").html("化")
                    $("#stuPoint6Label").html("生")
                }else {
                    $("#stuPoint4Label").html("请选科类")
                    $("#stuPoint5Label").html("请选科类")
                    $("#stuPoint6Label").html("请选科类")
                }


                if(data.stuPointDetail!="" && data.stuPointDetail!=null){
                    modal.find('#stuPoint1').val(data.stuPointDetail.split(",")[0])
                    modal.find('#stuPoint2').val(data.stuPointDetail.split(",")[1])
                    modal.find('#stuPoint3').val(data.stuPointDetail.split(",")[2])
                    modal.find('#stuPoint4').val(data.stuPointDetail.split(",")[3])
                    modal.find('#stuPoint5').val(data.stuPointDetail.split(",")[4])
                    modal.find('#stuPoint6').val(data.stuPointDetail.split(",")[5])

                }


                if(data.stuGoodSubject==null||data.stuGoodSubject.split(",").length==1){
                    // modal.find('#gdsub_1').prop("checked",false);
                    // modal.find('#gdsub_2').prop("checked",false);
                    // modal.find('#gdsub_3').prop("checked",false);
                    // modal.find('#gdsub_4').prop("checked",false);
                    // modal.find('#gdsub_5').prop("checked",false);
                    // modal.find('#gdsub_6').prop("checked",false);
                    // modal.find('#gdsub_7').prop("checked",false);
                    // modal.find('#gdsub_8').prop("checked",false);
                    // modal.find('#gdsub_9').prop("checked",false);
                    // $( ".check" ).button();
                    if(data.stuSubjectCode=="1"){
                        var str = "<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">语文</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">数学</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">英语</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">政治</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">历史</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">地理</p></div>"
                        $('#subjectSortable').html(str)
                    }else if(data.stuSubjectCode=="5"){
                        var str = "<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">语文</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">数学</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">英语</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">物理</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">化学</p></div>"
                            +"<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">生物</p></div>"
                        $('#subjectSortable').html(str)
                    }else{
                        $('#subjectSortable').html("<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 130px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">请选择科类</p></div>")
                    }

                }else {
                    // data.stuGoodSubject.split(",")[0]==0 ? modal.find('#gdsub_1').prop("checked",false) : modal.find('#gdsub_1').prop("checked",true);
                    // data.stuGoodSubject.split(",")[1]==0 ? modal.find('#gdsub_2').prop("checked",false) : modal.find('#gdsub_2').prop("checked",true);
                    // data.stuGoodSubject.split(",")[2]==0 ? modal.find('#gdsub_3').prop("checked",false) : modal.find('#gdsub_3').prop("checked",true);
                    // data.stuGoodSubject.split(",")[3]==0 ? modal.find('#gdsub_4').prop("checked",false) : modal.find('#gdsub_4').prop("checked",true);
                    // data.stuGoodSubject.split(",")[4]==0 ? modal.find('#gdsub_5').prop("checked",false) : modal.find('#gdsub_5').prop("checked",true);
                    // data.stuGoodSubject.split(",")[5]==0 ? modal.find('#gdsub_6').prop("checked",false) : modal.find('#gdsub_6').prop("checked",true);
                    // data.stuGoodSubject.split(",")[6]==0 ? modal.find('#gdsub_7').prop("checked",false) : modal.find('#gdsub_7').prop("checked",true);
                    // data.stuGoodSubject.split(",")[7]==0 ? modal.find('#gdsub_8').prop("checked",false) : modal.find('#gdsub_8').prop("checked",true);
                    // data.stuGoodSubject.split(",")[8]==0 ? modal.find('#gdsub_9').prop("checked",false) : modal.find('#gdsub_9').prop("checked",true);
                    // $( ".check" ).button();
                    var stuGoodSubjectHtml = ""
                    for (var i=0;i<data.stuGoodSubject.split(",").length;i++){
                        stuGoodSubjectHtml+="<div class=\"ui-state-default\" style=\"margin-right: 10px;width: 50px;display: inline;float: left;color: #8c8e8a;cursor: pointer;height: 30px;text-align: center;vertical-align: middle\"><p class=\"subject-item\" style=\"padding-top: 4px;\">"+data.stuGoodSubject.split(",")[i]+"</p></div>"
                    }
                    modal.find('#subjectSortable').html(stuGoodSubjectHtml)
                }

                if(data.stuIntentSubject==null||data.stuIntentSubject.split(",").length==1){
                    // modal.find('#field_1').prop("checked",false);
                    // modal.find('#field_2').prop("checked",false);
                    // modal.find('#field_3').prop("checked",false);
                    // modal.find('#field_4').prop("checked",false);
                    // modal.find('#field_5').prop("checked",false);
                    // modal.find('#field_6').val("");
                    // $( ".check" ).button();
                }else {
                    //overwrite
                    if(data.stuIntentSubject.split(",")[0]==0){
                        modal.find('#sub1_0').attr("class","btn btn-primary active")
                        modal.find('#sub1_1').attr("class","btn btn-primary")
                        modal.find('#sub1_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[0]==1){
                        modal.find('#sub1_0').attr("class","btn btn-primary")
                        modal.find('#sub1_1').attr("class","btn btn-primary active")
                        modal.find('#sub1_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[0]==2){
                        modal.find('#sub1_0').attr("class","btn btn-primary")
                        modal.find('#sub1_1').attr("class","btn btn-primary")
                        modal.find('#sub1_2').attr("class","btn btn-primary active")
                    }
                    if(data.stuIntentSubject.split(",")[1]==0){
                        modal.find('#sub2_0').attr("class","btn btn-primary active")
                        modal.find('#sub2_1').attr("class","btn btn-primary")
                        modal.find('#sub2_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[1]==1){
                        modal.find('#sub2_0').attr("class","btn btn-primary")
                        modal.find('#sub2_1').attr("class","btn btn-primary active")
                        modal.find('#sub2_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[1]==2){
                        modal.find('#sub2_0').attr("class","btn btn-primary")
                        modal.find('#sub2_1').attr("class","btn btn-primary")
                        modal.find('#sub2_2').attr("class","btn btn-primary active")
                    }
                    if(data.stuIntentSubject.split(",")[2]==0){
                        modal.find('#sub3_0').attr("class","btn btn-primary active")
                        modal.find('#sub3_1').attr("class","btn btn-primary")
                        modal.find('#sub3_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[2]==1){
                        modal.find('#sub3_0').attr("class","btn btn-primary")
                        modal.find('#sub3_1').attr("class","btn btn-primary active")
                        modal.find('#sub3_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[2]==2){
                        modal.find('#sub3_0').attr("class","btn btn-primary")
                        modal.find('#sub3_1').attr("class","btn btn-primary")
                        modal.find('#sub3_2').attr("class","btn btn-primary active")
                    }
                    if(data.stuIntentSubject.split(",")[3]==0){
                        modal.find('#sub4_0').attr("class","btn btn-primary active")
                        modal.find('#sub4_1').attr("class","btn btn-primary")
                        modal.find('#sub4_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[3]==1){
                        modal.find('#sub4_0').attr("class","btn btn-primary")
                        modal.find('#sub4_1').attr("class","btn btn-primary active")
                        modal.find('#sub4_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[3]==2){
                        modal.find('#sub4_0').attr("class","btn btn-primary")
                        modal.find('#sub4_1').attr("class","btn btn-primary")
                        modal.find('#sub4_2').attr("class","btn btn-primary active")
                    }
                    if(data.stuIntentSubject.split(",")[4]==0){
                        modal.find('#sub5_0').attr("checked","true")
                        // modal.find('#sub5_1').attr("class","btn btn-primary")
                        // modal.find('#sub5_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[4]==1){
                        // modal.find('#sub5_0').attr("class","btn btn-primary")
                        modal.find('#sub5_1').attr("checked","true")
                        // modal.find('#sub5_2').attr("class","btn btn-primary")
                    }else if(data.stuIntentSubject.split(",")[4]==2){
                        // modal.find('#sub5_0').attr("class","btn btn-primary")
                        // modal.find('#sub5_1').attr("class","btn btn-primary")
                        modal.find('#sub5_2').attr("checked","true")
                    }
                    // End of overwrite
                    // //overwrite
                    // if(data.stuIntentSubject.split(",")[0]==0){
                    //     modal.find('#sub1_0').attr("class","btn btn-primary active")
                    //     modal.find('#sub1_1').attr("class","btn btn-primary")
                    //     modal.find('#sub1_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[0]==1){
                    //     modal.find('#sub1_0').attr("class","btn btn-primary")
                    //     modal.find('#sub1_1').attr("class","btn btn-primary active")
                    //     modal.find('#sub1_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[0]==2){
                    //     modal.find('#sub1_0').attr("class","btn btn-primary")
                    //     modal.find('#sub1_1').attr("class","btn btn-primary")
                    //     modal.find('#sub1_2').attr("class","btn btn-primary active")
                    // }
                    // if(data.stuIntentSubject.split(",")[1]==0){
                    //     modal.find('#sub2_0').attr("class","btn btn-primary active")
                    //     modal.find('#sub2_1').attr("class","btn btn-primary")
                    //     modal.find('#sub2_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[1]==1){
                    //     modal.find('#sub2_0').attr("class","btn btn-primary")
                    //     modal.find('#sub2_1').attr("class","btn btn-primary active")
                    //     modal.find('#sub2_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[1]==2){
                    //     modal.find('#sub2_0').attr("class","btn btn-primary")
                    //     modal.find('#sub2_1').attr("class","btn btn-primary")
                    //     modal.find('#sub2_2').attr("class","btn btn-primary active")
                    // }
                    // if(data.stuIntentSubject.split(",")[2]==0){
                    //     modal.find('#sub3_0').attr("class","btn btn-primary active")
                    //     modal.find('#sub3_1').attr("class","btn btn-primary")
                    //     modal.find('#sub3_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[2]==1){
                    //     modal.find('#sub3_0').attr("class","btn btn-primary")
                    //     modal.find('#sub3_1').attr("class","btn btn-primary active")
                    //     modal.find('#sub3_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[2]==2){
                    //     modal.find('#sub3_0').attr("class","btn btn-primary")
                    //     modal.find('#sub3_1').attr("class","btn btn-primary")
                    //     modal.find('#sub3_2').attr("class","btn btn-primary active")
                    // }
                    // if(data.stuIntentSubject.split(",")[3]==0){
                    //     modal.find('#sub4_0').attr("class","btn btn-primary active")
                    //     modal.find('#sub4_1').attr("class","btn btn-primary")
                    //     modal.find('#sub4_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[3]==1){
                    //     modal.find('#sub4_0').attr("class","btn btn-primary")
                    //     modal.find('#sub4_1').attr("class","btn btn-primary active")
                    //     modal.find('#sub4_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[3]==2){
                    //     modal.find('#sub4_0').attr("class","btn btn-primary")
                    //     modal.find('#sub4_1').attr("class","btn btn-primary")
                    //     modal.find('#sub4_2').attr("class","btn btn-primary active")
                    // }
                    // if(data.stuIntentSubject.split(",")[4]==0){
                    //     modal.find('#sub5_0').attr("class","btn btn-primary active")
                    //     modal.find('#sub5_1').attr("class","btn btn-primary")
                    //     modal.find('#sub5_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[4]==1){
                    //     modal.find('#sub5_0').attr("class","btn btn-primary")
                    //     modal.find('#sub5_1').attr("class","btn btn-primary active")
                    //     modal.find('#sub5_2').attr("class","btn btn-primary")
                    // }else if(data.stuIntentSubject.split(",")[4]==2){
                    //     modal.find('#sub5_0').attr("class","btn btn-primary")
                    //     modal.find('#sub5_1').attr("class","btn btn-primary")
                    //     modal.find('#sub5_2').attr("class","btn btn-primary active")
                    // }
                    // //End of overwrite
                    // data.stuIntentSubject.split(",")[0]==0 ? modal.find('#field_1').prop("checked",false) : modal.find('#field_1').prop("checked",true);
                    // data.stuIntentSubject.split(",")[1]==0 ? modal.find('#field_2').prop("checked",false) : modal.find('#field_2').prop("checked",true);
                    // data.stuIntentSubject.split(",")[2]==0 ? modal.find('#field_3').prop("checked",false) : modal.find('#field_3').prop("checked",true);
                    // data.stuIntentSubject.split(",")[3]==0 ? modal.find('#field_4').prop("checked",false) : modal.find('#field_4').prop("checked",true);
                    // data.stuIntentSubject.split(",")[4]==0 ? modal.find('#field_5').prop("checked",false) : modal.find('#field_5').prop("checked",true);
                    modal.find('#field_6').val(data.stuIntentSubject.split(",")[5]);
                    $( ".check" ).button();
                }

                modal.find('#pre_college').val(data.stuIntentCollege);
                modal.find('#pre_city').val(data.stuIntentCity);

                if(data.stuAfterGraduation==null||data.stuAfterGraduation.split(",").length==1){
                    modal.find('#graduate_1').prop("checked",false);
                    modal.find('#graduate_2').prop("checked",false);
                    modal.find('#graduate_3').prop("checked",false);
                    $( ".check" ).button();
                }else {
                    data.stuAfterGraduation.split(",")[0]==0 ?  (null): modal.find('#graduate_1').trigger("click");
                    data.stuAfterGraduation.split(",")[1]==0 ? modal.find('#graduate_2').prop("checked",false) : modal.find('#graduate_2').prop("checked",true);
                    data.stuAfterGraduation.split(",")[2]==0 ? modal.find('#graduate_3').prop("checked",false) : modal.find('#graduate_3').prop("checked",true);
                    $( ".check" ).button();
                }

                if(data.stuSpecialType==null||data.stuSpecialType.split(",").length==1){
                    modal.find('#special_1').prop("checked",false);
                    modal.find('#special_2').prop("checked",false);
                    $( ".check" ).button();
                }else {
                    data.stuSpecialType.split(",")[0]==0 ? modal.find('#special_1').prop("checked",false) : modal.find('#special_1').prop("checked",true);
                    data.stuSpecialType.split(",")[1]==0 ? modal.find('#special_2').prop("checked",false) : modal.find('#special_2').prop("checked",true);
                    $( ".check" ).button();
                }
                modal.find('#other_info').val(data.stuOtherInfo);

            },
            error: function () {

            },
        })
    }
})

/*<![CDATA[*/
$("#delete").click(function(){
    var modal = $('#deleteModal')
    params = {
        stuId:modal.find('#delete_id').text()
    }
    $.ajax({
        url:"./deleteStudent",
        type: "post",
        datatype:"text",
        data: params,
        success: function (data) {
            if(data=="timeout"){
                // alert("连接超时，请重新登录")
                $(window).attr('location','./login');
            }else {
                modal.modal('hide')
                if(data=="cantdelete"){
                    alert("学生已进行职业测试，无法删除")
                }else if(data=="success"){
                    $("#info"+params.stuId).remove()
                }

                // $(".pagination-container").remove()
                // pagesInit()
//                    alert("修改成功")
            }
        },
        error: function () {
            alert("删除失败")
        },
    })
})
toast_list = []
function checking() {
    result_list=[];
    toast_list="";

    // $("#stuEmailLabelDiv").attr("class","form-group")
    // if(($("#stuEmail").val()==null)||($('#stuEmail').val()=="")){
    //
    //     result_list.push("#stuEmail")
    //     toast_list.push("请填写邮箱")
    // }
    // $("#stuQqLabelDiv").attr("class","form-group")
    // if(($("#stuQq").val()==null)||($('#stuQq').val()=="")){
    //     // alert("性别没填")
    //     result_list.push("#stuQq")
    //     toast_list.push("请填写QQ")
    // }y
    // toast_list.push("尚未补充如下信息:")

    $("#stuSexLabelDiv").attr("class","form-group")
    if($("#stuSex").val()==0){
        // alert("性别没填")
        result_list.push("#stuSex")
        toast_list=toast_list+" 性别"
    }
    $("#stuHighschoolCodeLabelDiv").attr("class","form-group")
    if($("#stuHighschoolCode").val()==0){
        // alert("学校没填")
        result_list.push("#stuHighschoolCode")
        toast_list=toast_list+" 高中"
    }
    $("#stuYearLabelDiv").attr("class","form-group")
    if(  ($("#stuYear").val()==null) || ($("#stuYear").val()=="") ){
        // alert("入学没填")
        result_list.push("#stuYear")
        toast_list=toast_list+" 入学年份"
    }
    $("#stuHighschoolClassLabelDiv").attr("class","form-group")
    if(($("#stuHighschoolClass").val()==null)||($("#stuHighschoolClass").val()=="")){
        // alert("班级没填")
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
        // alert("身高没填")
        result_list.push("#stuHeight")
        toast_list=toast_list+" 身高"
    }
    $("#stuEyesightLabelDiv").attr("class","form-group")
    if($("#stuEyesight").val()==9){
        // alert("身高没填")
        result_list.push("#stuEyesight")
        toast_list=toast_list+" 视力"
    }
    $("#stuColourWeaknessLabelDiv").attr("class","form-group")
    if($("#stuColourWeakness").val()==9){
        // alert("身高没填")
        result_list.push("#stuColourWeakness")
        toast_list=toast_list+" 是否色弱"
    }
    $("#stuPointLabelDiv").attr("class","form-group")
    if (($("#stuPoint").val()==null)||($("#stuPoint").val()=="")||($("#stuPoint").val()==0)){
        // alert("估分OK ")
        result_list.push("#stuPoint");
        toast_list=toast_list+" 请估分"
    }
    return result_list
}
$("#save1").click(function(){
    var modal = $('#editModal')
    // $("#stuNameDiv").attr("class","form-group")
    // $("#stuNameLabelDiv").attr("class","form-group")
    // $("#stuTelDiv").attr("class","form-group")
    // $("#stuTelLabelDiv").attr("class","form-group")

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
    // if($("#stuTel").val()=='')
    var ret = /^[\d]{5,20}$/;
    //ififif


    // 性别1
    // 学校2
    // 入学3
    // 班级4
    // 身高5
    // 身高5
    // 估分6

    result_list = checking();
    // for (i=0;i<result_list.length;i++){
    //     alert(i+" "+result_list[i])
    // }

    // for(i=0;i<6;i++){
    //     alert(i+"-"+check_result_list[i])
    // }

    // alert($("#stuId").text())

    if(ret.test(str) && $("#stuName").val()!=""&&result_list.length==0){
        $(this).popover('hide');
        params = {
            stuId:$("#stuId").text(),
//                stuPassword:$("#stuPassword").val(),
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
            stuSubjectCode:$("#stuSubjectCode").val(),
            stuLanguageCode:$("#stuLanguageCode").val(),
            stuHeight:$("#stuHeight").val(),
            stuPoint:$("#stuPoint").val(),
//                stuPointPolicyAddpoint:$("#stuPointPolicyAddpoint").val(),
            stuEyesight:$("#stuEyesight").val(),
            stuColourWeakness:$("#stuColourWeakness").val(),
            stuPointDetail:($("#stuPoint1").val()==""?0:$("#stuPoint1").val())+","+($("#stuPoint2").val()==""?0:$("#stuPoint2").val())+","+($("#stuPoint3").val()==""?0:$("#stuPoint3").val())+","+($("#stuPoint4").val()==""?0:$("#stuPoint4").val())+","+($("#stuPoint5").val()==""?0:$("#stuPoint5").val())+","+($("#stuPoint6").val()==""?0:$("#stuPoint6").val()),
            // stuPointDetail:$("#stuPoint1").val()+","+$("#stuPoint2").val()+","+$("#stuPoint3").val()+","+$("#stuPoint4").val()+","+$("#stuPoint5").val()+","+$("#stuPoint6").val(),
            // stuGoodSubject:($("#gdsub_1").prop("checked")==false?0:1)+","+($("#gdsub_2").prop("checked")==false?0:1)+","+($("#gdsub_3").prop("checked")==false?0:1)+","+($("#gdsub_4").prop("checked")==false?0:1)+","+($("#gdsub_5").prop("checked")==false?0:1)+","+($("#gdsub_6").prop("checked")==false?0:1)+","+($("#gdsub_7").prop("checked")==false?0:1)+","+($("#gdsub_8").prop("checked")==false?0:1)+","+($("#gdsub_9").prop("checked")==false?0:1),
            stuGoodSubject:subjectSortableStr,
            // stuIntentSubject:($("#field_1").prop("checked")==false?0:1)+","+($("#field_2").prop("checked")==false?0:1)+","+($("#field_3").prop("checked")==false?0:1)+","+($("#field_4").prop("checked")==false?0:1)+","+($("#field_5").prop("checked")==false?0:1)+","+$("#field_6").val(),
            stuIntentSubject:stuIntentSubjectStr,
            stuIntentCollege:$("#pre_college").val(),
            stuIntentCity:$("#pre_city").val(),
            stuAfterGraduation:($("#graduate_1").prop("checked")==false?0:1)+","+($("#graduate_2").prop("checked")==false?0:1)+","+($("#graduate_3").prop("checked")==false?0:1),
            stuSpecialType:($("#special_1").prop("checked")==false?0:1)+","+($("#special_2").prop("checked")==false?0:1),
            stuOtherInfo:$("#other_info").val(),

        }
        $.ajax({
            url:"./updateStudent",
            type: "post",
            datatype:"text",
            data: params,
            success: function (stuid) {
                if(stuid=="timeout"){
                    // alert("连接超时，请重新登录")
                    $(window).attr('location','./login');
                }else {
                    // modal.modal('hide')
                    if (params.stuId==""){
                        var sex_text = "未设置"
                        if(params.stuSex=="0"){
                            sex_text = "<img src='images/index/ico_dk1.png' style='width: 27px;height: 27px'/>"
                        }else if(params.stuSex=="1"){
                            sex_text = "<img src='images/index/ico_male1.png' style='width: 27px;height: 25px'/>"
                        }else if(params.stuSex=="2"){
                            sex_text = "<img src='images/index/ico_female1.png' style='width: 27px;height: 27px'/>"
                        }
                        var status_text = "未设置"
                        if(params.stuStatus=="0"){
                            status_text = "未指导"
                        }else if(params.stuStatus=="1"){
                            status_text = "已指导"
                        }else {
                            status_text = "未指导"
                        }
                        var subject_text = ""
                        if(params.stuSubjectCode=="1"){
                            subject_text = "文史"
                        }else if(params.stuSubjectCode=="5"){
                            subject_text = "理工"
                        }else {
                            subject_text = ""
                        }

                        $("tbody").append("<tr id='info"+stuid+"'>" +
                            "<td id='stuName"+stuid+"' style='font-size: 15px'>"+params.stuName+"</td>" +
                            "<td id='stuSex"+stuid+"'>"+sex_text+"</td>" +
                            "<td id='stuHighschoolName"+stuid+"'>"+highschoolDictionary[params.stuHighschoolCode]+"</td>" +
                            "<td id='stuSubjectCode"+stuid+"'>"+subject_text+"</td>" +
                            "<td id='stuPoint"+stuid+"' style='color: #eb594c;font-size: 15px'>"+params.stuPoint+"</td>" +
                            "<td id='stuTel"+stuid+"'>"+params.stuTel+"</td>" +
                            //                            "<td id='stuStatus"+stuid+"'>"+status_text+"</td>" +
                            "<td style='text-align: center;width: 150px'>" +
                            "<a name='delete_"+stuid+"' class='delete'  data-toggle='modal' data-target='#deleteModal' style='cursor: pointer;'><img  src='images/index/ico_delete.png' style='width: 20px;height: 20px'></img></a>" +
                            "&nbsp;<a name='edit_"+stuid+"' class='edit' data-toggle='modal' data-target='#editModal' style='cursor: pointer;padding-left: 20px;'><img src='images/index/ico_edit.png' style='width: 20px;height: 18px'></img></a>" +
                            "&nbsp;<a name='guide_"+stuid+"' class='guide' data-toggle='modal' data-target='#' style='cursor: pointer;padding-left: 20px'><img src='images/index/ico_guide.png' style='width: 20px;height: 20px'></img></a>" +

                            // "<button name='delete_"+stuid+"' class='delete btn btn-primary btn-sm btn-danger' data-toggle='modal' data-target='#deleteModal' style='background:url(images/index/ico_delete.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 20px;height: 20px' > </button>" +
                            // "&nbsp;<button name='edit_"+stuid+"' class='edit btn btn-primary btn-sm' data-toggle='modal' data-target='#editModal'  style='padding-left: 20px;background:url(images/index/ico_edit.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 18px;height: 20px'></button>" +
                            // "&nbsp;<button name='guide_"+stuid+"' class='guide btn btn-primary btn-sm' data-toggle='modal' data-target='#'  style='padding-left: 20px;background:url(images/index/ico_guide.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 20px;height: 20px'></button>"+
                            // "<img name='delete_"+stuid+"' class='delete' data-toggle='modal' data-target='#deleteModal' src='images/index/ico_delete.png' style='cursor: pointer;width: 20px;height: 20px'></img>" +

                            // "<button name='edit_"+stuid+"' class='edit btn btn-primary btn-sm' data-toggle='modal' data-target='#editModal'>编辑信息</button>" +
                            // "&nbsp;<button name='guide_"+stuid+"' class='guide btn btn-primary btn-sm' data-toggle='modal' data-target='#'>指导</button>" +
                            // "&nbsp;&nbsp;&nbsp;<button name='delete_"+stuid+"' class='delete btn btn-primary btn-sm btn-danger' data-toggle='modal' data-target='#deleteModal'>删除</button>" +

                            "</td>" +
                            "</tr>")
//                        $(".pagination-container").remove()
                        initNewModel();
                        bootoast({
                            message: '添加成功',
                            type: 'success',
                            position:'top',
                            timeout:0.7
                        });
                    }else {
                        $("#stuTel"+params.stuId).html(params.stuTel)
                        $("#stuHighschoolName"+params.stuId).html(highschoolDictionary[params.stuHighschoolCode])
                        $("#stuName"+params.stuId).html(params.stuName)
                        $("#stuName_dis").html(params.stuName)
                        if (params.stuSubjectCode=="1"){
                            $("#stuSubjectCode"+params.stuId).html("文史")
                        }else if (params.stuSubjectCode=="5"){
                            $("#stuSubjectCode"+params.stuId).html("理工")
                        }
                        if (params.stuSex=="0"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_dk1.png' style='width: 27px;height: 27px'/>")
                        }else if (params.stuSex=="1"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_male1.png' style='width: 27px;height: 25px'/>")
                        }else if (params.stuSex=="2"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_female1.png' style='width: 27px;height: 27px'/>")
                        }
                        $("#stuPoint"+params.stuId).html(params.stuPoint)

                        // $("#stuPoint"+params.stuId).style("color: #eb594c;font-size: 15px")
                        // bootoast({
                        //     message: '保存成功',
                        //     type: 'success',
                        //     position:'right-top',
                        //     timeout:1.5
                        // });
                        hi_if_info_compelet=1;
                        // if($('#save1').hasClass('in')){
                        //     $("#save1").popover('hide');
                        // } else
                        // {
                        //     $("#save1").attr('data-content',"保存成功");
                        //     $("#save1").popover('show');
                        // }
                        //2
                        // $("#badge-alter").fadeOut("fast");
                        // $("#for_new").empty();
                        // $("#for_new").html();
                        // $("#badge-alter").fadeIn("fast");
                        // setTimeout("auto_hide()",2000);
                        easy_notify("保存成功",2000);
                        // alert("保存成功");
                        $("html,body").animate({scrollTop:0}, 500);

                    }

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
            // bootoast({
            //     message: '请填写姓名',
            //     type: 'warning',
            //     position:'top',
            //     timeout:1.3
            // });
            //asdasd
            // bootoast({
            //     message: '请填写姓名orange',
            //     type: 'warning',
            //     position:'right-bottom',
            //     timeout:1.3
            // });
            //
            //overwrite :想去掉这些提示，这些是棉花的红色标记，在我改版之后应该是不用了。
            // $("#tab1").addClass('active');
            // $("#tab2").removeClass('active');
            // $("#tab3").removeClass('active');
            // //
            // $("#basicInfo").addClass('active');
            // $("#basicInfo").addClass('in');
            // $("#exmInfo").removeClass('active');
            // $("#exmInfo").removeClass('in');
            // $("#exmInclination").removeClass('active');
            // $("#exmInclination").removeClass('in');
            //
            // $("#stuNameLabelDiv").attr("class","form-group has-error")
            // $("#stuNameDiv").attr("class","form-group has-error")
        }
        if(!ret.test(str)){
            //尚未补充如下信息:
            toast_list=" 电话"+toast_list
            // bootoast({
            //     message: '请填写电话',
            //     type: 'warning',
            //     position:'top',
            //     timeout:1.3
            // });
            //overwrite :想去掉这些提示，这些是棉花的红色标记，在我改版之后应该是不用了。
            // $("#tab1").addClass('active');
            // $("#tab2").removeClass('active');
            // $("#tab3").removeClass('active');
            // $("#basicInfo").addClass('active');
            // $("#basicInfo").addClass('in');
            // $("#exmInfo").removeClass('active');
            // $("#exmInfo").removeClass('in');
            // $("#exmInclination").removeClass('active');
            // $("#exmInclination").removeClass('in');
            //
            // $("#stuTelLabelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
        }

        // #stuSubjectCode#stuRace#stuHeight#stuEyesight#stuColourWeakness#stuPoint
        if ("#stuSex#stuHighschoolCode#stuYear#stuHighschoolClass".indexOf(result_list[0])!=-1){

        }else{

        }

        if($('#save1').hasClass('in')){
            $(this).popover('hide');
        } else
        {
            $(this).attr('data-content',toast_list);
            $(this).popover('show');
        }

        // $("#save1").popover({title: "尚未补充如下信息:", content: toast_list,});
        // $("#save1").popover("show");
        // $('#save').popover('show');
        // for (i=0;i<result_list.length;i++){
        //     bootoast({
        //         message: toast_list[i],
        //         type: 'warning',
        //         position:'top',
        //         timeout:1.3
        //     });
        //     labeldiv=result_list[i]+"LabelDiv"
        //     self_div=result_list[i]+"Div"
        //     // alert(labeldiv)
        //     $(labeldiv).attr("class","form-group has-error")
        // }
        // if
    }
})
$("#save2").click(function(){
    var modal = $('#editModal')
    // $("#stuNameDiv").attr("class","form-group")
    // $("#stuNameLabelDiv").attr("class","form-group")
    // $("#stuTelDiv").attr("class","form-group")
    // $("#stuTelLabelDiv").attr("class","form-group")

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
    // if($("#stuTel").val()=='')
    var ret = /^[\d]{5,20}$/;
    //ififif


    // 性别1
    // 学校2
    // 入学3
    // 班级4
    // 身高5
    // 身高5
    // 估分6

    result_list = checking();
    // for (i=0;i<result_list.length;i++){
    //     alert(i+" "+result_list[i])
    // }

    // for(i=0;i<6;i++){
    //     alert(i+"-"+check_result_list[i])
    // }

    // alert($("#stuId").text())

    if(ret.test(str) && $("#stuName").val()!=""&&result_list.length==0){
        $(this).popover('hide');
        params = {
            stuId:$("#stuId").text(),
//                stuPassword:$("#stuPassword").val(),
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
            stuSubjectCode:$("#stuSubjectCode").val(),
            stuLanguageCode:$("#stuLanguageCode").val(),
            stuHeight:$("#stuHeight").val(),
            stuPoint:$("#stuPoint").val(),
//                stuPointPolicyAddpoint:$("#stuPointPolicyAddpoint").val(),
            stuEyesight:$("#stuEyesight").val(),
            stuColourWeakness:$("#stuColourWeakness").val(),
            stuPointDetail:($("#stuPoint1").val()==""?0:$("#stuPoint1").val())+","+($("#stuPoint2").val()==""?0:$("#stuPoint2").val())+","+($("#stuPoint3").val()==""?0:$("#stuPoint3").val())+","+($("#stuPoint4").val()==""?0:$("#stuPoint4").val())+","+($("#stuPoint5").val()==""?0:$("#stuPoint5").val())+","+($("#stuPoint6").val()==""?0:$("#stuPoint6").val()),
            // stuPointDetail:$("#stuPoint1").val()+","+$("#stuPoint2").val()+","+$("#stuPoint3").val()+","+$("#stuPoint4").val()+","+$("#stuPoint5").val()+","+$("#stuPoint6").val(),
            // stuGoodSubject:($("#gdsub_1").prop("checked")==false?0:1)+","+($("#gdsub_2").prop("checked")==false?0:1)+","+($("#gdsub_3").prop("checked")==false?0:1)+","+($("#gdsub_4").prop("checked")==false?0:1)+","+($("#gdsub_5").prop("checked")==false?0:1)+","+($("#gdsub_6").prop("checked")==false?0:1)+","+($("#gdsub_7").prop("checked")==false?0:1)+","+($("#gdsub_8").prop("checked")==false?0:1)+","+($("#gdsub_9").prop("checked")==false?0:1),
            stuGoodSubject:subjectSortableStr,
            // stuIntentSubject:($("#field_1").prop("checked")==false?0:1)+","+($("#field_2").prop("checked")==false?0:1)+","+($("#field_3").prop("checked")==false?0:1)+","+($("#field_4").prop("checked")==false?0:1)+","+($("#field_5").prop("checked")==false?0:1)+","+$("#field_6").val(),
            stuIntentSubject:stuIntentSubjectStr,
            stuIntentCollege:$("#pre_college").val(),
            stuIntentCity:$("#pre_city").val(),
            stuAfterGraduation:($("#graduate_1").prop("checked")==false?0:1)+","+($("#graduate_2").prop("checked")==false?0:1)+","+($("#graduate_3").prop("checked")==false?0:1),
            stuSpecialType:($("#special_1").prop("checked")==false?0:1)+","+($("#special_2").prop("checked")==false?0:1),
            stuOtherInfo:$("#other_info").val(),

        }
        $.ajax({
            url:"./updateStudent",
            type: "post",
            datatype:"text",
            data: params,
            success: function (stuid) {
                if(stuid=="timeout"){
                    // alert("连接超时，请重新登录")
                    $(window).attr('location','./login');
                }else {
                    // modal.modal('hide')
                    if (params.stuId==""){
                        var sex_text = "未设置"
                        if(params.stuSex=="0"){
                            sex_text = "<img src='images/index/ico_dk1.png' style='width: 27px;height: 27px'/>"
                        }else if(params.stuSex=="1"){
                            sex_text = "<img src='images/index/ico_male1.png' style='width: 27px;height: 25px'/>"
                        }else if(params.stuSex=="2"){
                            sex_text = "<img src='images/index/ico_female1.png' style='width: 27px;height: 27px'/>"
                        }
                        var status_text = "未设置"
                        if(params.stuStatus=="0"){
                            status_text = "未指导"
                        }else if(params.stuStatus=="1"){
                            status_text = "已指导"
                        }else {
                            status_text = "未指导"
                        }
                        var subject_text = ""
                        if(params.stuSubjectCode=="1"){
                            subject_text = "文史"
                        }else if(params.stuSubjectCode=="5"){
                            subject_text = "理工"
                        }else {
                            subject_text = ""
                        }

                        $("tbody").append("<tr id='info"+stuid+"'>" +
                            "<td id='stuName"+stuid+"' style='font-size: 15px'>"+params.stuName+"</td>" +
                            "<td id='stuSex"+stuid+"'>"+sex_text+"</td>" +
                            "<td id='stuHighschoolName"+stuid+"'>"+highschoolDictionary[params.stuHighschoolCode]+"</td>" +
                            "<td id='stuSubjectCode"+stuid+"'>"+subject_text+"</td>" +
                            "<td id='stuPoint"+stuid+"' style='color: #eb594c;font-size: 15px'>"+params.stuPoint+"</td>" +
                            "<td id='stuTel"+stuid+"'>"+params.stuTel+"</td>" +
                            //                            "<td id='stuStatus"+stuid+"'>"+status_text+"</td>" +
                            "<td style='text-align: center;width: 150px'>" +
                            "<a name='delete_"+stuid+"' class='delete'  data-toggle='modal' data-target='#deleteModal' style='cursor: pointer;'><img  src='images/index/ico_delete.png' style='width: 20px;height: 20px'></img></a>" +
                            "&nbsp;<a name='edit_"+stuid+"' class='edit' data-toggle='modal' data-target='#editModal' style='cursor: pointer;padding-left: 20px;'><img src='images/index/ico_edit.png' style='width: 20px;height: 18px'></img></a>" +
                            "&nbsp;<a name='guide_"+stuid+"' class='guide' data-toggle='modal' data-target='#' style='cursor: pointer;padding-left: 20px'><img src='images/index/ico_guide.png' style='width: 20px;height: 20px'></img></a>" +

                            // "<button name='delete_"+stuid+"' class='delete btn btn-primary btn-sm btn-danger' data-toggle='modal' data-target='#deleteModal' style='background:url(images/index/ico_delete.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 20px;height: 20px' > </button>" +
                            // "&nbsp;<button name='edit_"+stuid+"' class='edit btn btn-primary btn-sm' data-toggle='modal' data-target='#editModal'  style='padding-left: 20px;background:url(images/index/ico_edit.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 18px;height: 20px'></button>" +
                            // "&nbsp;<button name='guide_"+stuid+"' class='guide btn btn-primary btn-sm' data-toggle='modal' data-target='#'  style='padding-left: 20px;background:url(images/index/ico_guide.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 20px;height: 20px'></button>"+
                            // "<img name='delete_"+stuid+"' class='delete' data-toggle='modal' data-target='#deleteModal' src='images/index/ico_delete.png' style='cursor: pointer;width: 20px;height: 20px'></img>" +

                            // "<button name='edit_"+stuid+"' class='edit btn btn-primary btn-sm' data-toggle='modal' data-target='#editModal'>编辑信息</button>" +
                            // "&nbsp;<button name='guide_"+stuid+"' class='guide btn btn-primary btn-sm' data-toggle='modal' data-target='#'>指导</button>" +
                            // "&nbsp;&nbsp;&nbsp;<button name='delete_"+stuid+"' class='delete btn btn-primary btn-sm btn-danger' data-toggle='modal' data-target='#deleteModal'>删除</button>" +

                            "</td>" +
                            "</tr>")
//                        $(".pagination-container").remove()
                        initNewModel();
                        bootoast({
                            message: '添加成功',
                            type: 'success',
                            position:'top',
                            timeout:0.7
                        });
                    }else {
                        $("#stuTel"+params.stuId).html(params.stuTel)
                        $("#stuHighschoolName"+params.stuId).html(highschoolDictionary[params.stuHighschoolCode])
                        $("#stuName"+params.stuId).html(params.stuName)
                        $("#stuName_dis").html(params.stuName)
                        if (params.stuSubjectCode=="1"){
                            $("#stuSubjectCode"+params.stuId).html("文史")
                        }else if (params.stuSubjectCode=="5"){
                            $("#stuSubjectCode"+params.stuId).html("理工")
                        }
                        if (params.stuSex=="0"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_dk1.png' style='width: 27px;height: 27px'/>")
                        }else if (params.stuSex=="1"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_male1.png' style='width: 27px;height: 25px'/>")
                        }else if (params.stuSex=="2"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_female1.png' style='width: 27px;height: 27px'/>")
                        }
                        $("#stuPoint"+params.stuId).html(params.stuPoint)

                        // $("#stuPoint"+params.stuId).style("color: #eb594c;font-size: 15px")
                        // bootoast({
                        //     message: '保存成功',
                        //     type: 'success',
                        //     position:'right-top',
                        //     timeout:1.5
                        // });
                        hi_if_info_compelet=1;
                        // alert("保存成功");


                        // if($('#save2').hasClass('in')){
                        //     $("#save2").popover('hide');
                        // } else
                        // {
                        //     $("#save2").attr('data-content',"保存成功");
                        //     $("#save2").popover('show');
                        // }
                        easy_notify("保存成功",2000);
                        // $("#badge-alter").fadeOut("fast");
                        // $("#for_new").empty();
                        // $("#for_new").html("保存成功");
                        // $("#badge-alter").fadeIn("fast");
                        // setTimeout("auto_hide()",2000);
                        $("html,body").animate({scrollTop:0}, 500);
                    }

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
            // bootoast({
            //     message: '请填写姓名',
            //     type: 'warning',
            //     position:'top',
            //     timeout:1.3
            // });
            //asdasd
            // bootoast({
            //     message: '请填写姓名orange',
            //     type: 'warning',
            //     position:'right-bottom',
            //     timeout:1.3
            // });
            //
            //overwrite :想去掉这些提示，这些是棉花的红色标记，在我改版之后应该是不用了。
            // $("#tab1").addClass('active');
            // $("#tab2").removeClass('active');
            // $("#tab3").removeClass('active');
            // //
            // $("#basicInfo").addClass('active');
            // $("#basicInfo").addClass('in');
            // $("#exmInfo").removeClass('active');
            // $("#exmInfo").removeClass('in');
            // $("#exmInclination").removeClass('active');
            // $("#exmInclination").removeClass('in');
            //
            // $("#stuNameLabelDiv").attr("class","form-group has-error")
            // $("#stuNameDiv").attr("class","form-group has-error")
        }
        if(!ret.test(str)){
            //尚未补充如下信息:
            toast_list=" 电话"+toast_list
            // bootoast({
            //     message: '请填写电话',
            //     type: 'warning',
            //     position:'top',
            //     timeout:1.3
            // });
            //overwrite :想去掉这些提示，这些是棉花的红色标记，在我改版之后应该是不用了。
            // $("#tab1").addClass('active');
            // $("#tab2").removeClass('active');
            // $("#tab3").removeClass('active');
            // $("#basicInfo").addClass('active');
            // $("#basicInfo").addClass('in');
            // $("#exmInfo").removeClass('active');
            // $("#exmInfo").removeClass('in');
            // $("#exmInclination").removeClass('active');
            // $("#exmInclination").removeClass('in');
            //
            // $("#stuTelLabelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
            // $("#stuTelDiv").attr("class","form-group has-error")
        }

        // #stuSubjectCode#stuRace#stuHeight#stuEyesight#stuColourWeakness#stuPoint
        if ("#stuSex#stuHighschoolCode#stuYear#stuHighschoolClass".indexOf(result_list[0])!=-1){

        }else{

        }
        if($('#save1').hasClass('in')){
            $(this).popover('hide');
        } else
        {
            $(this).attr('data-content',toast_list);
            $(this).popover('show');
        }
        // $('#save').popover('show');
        // for (i=0;i<result_list.length;i++){
        //     bootoast({
        //         message: toast_list[i],
        //         type: 'warning',
        //         position:'top',
        //         timeout:1.3
        //     });
        //     labeldiv=result_list[i]+"LabelDiv"
        //     self_div=result_list[i]+"Div"
        //     // alert(labeldiv)
        //     $(labeldiv).attr("class","form-group has-error")
        // }
        // if
    }
})
$("#save3").click(function(){
    var modal = $('#editModal')
    // $("#stuNameDiv").attr("class","form-group")
    // $("#stuNameLabelDiv").attr("class","form-group")
    // $("#stuTelDiv").attr("class","form-group")
    // $("#stuTelLabelDiv").attr("class","form-group")

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
    // if($("#stuTel").val()=='')
    var ret = /^[\d]{5,20}$/;
    //ififif


    // 性别1
    // 学校2
    // 入学3
    // 班级4
    // 身高5
    // 身高5
    // 估分6

    result_list = checking();
    // for (i=0;i<result_list.length;i++){
    //     alert(i+" "+result_list[i])
    // }

    // for(i=0;i<6;i++){
    //     alert(i+"-"+check_result_list[i])
    // }

    // alert($("#stuId").text())

    if(ret.test(str) && $("#stuName").val()!=""&&result_list.length==0){
        $(this).popover('hide');
        params = {
            stuId:$("#stuId").text(),
//                stuPassword:$("#stuPassword").val(),
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
            stuSubjectCode:$("#stuSubjectCode").val(),
            stuLanguageCode:$("#stuLanguageCode").val(),
            stuHeight:$("#stuHeight").val(),
            stuPoint:$("#stuPoint").val(),
//                stuPointPolicyAddpoint:$("#stuPointPolicyAddpoint").val(),
            stuEyesight:$("#stuEyesight").val(),
            stuColourWeakness:$("#stuColourWeakness").val(),
            stuPointDetail:($("#stuPoint1").val()==""?0:$("#stuPoint1").val())+","+($("#stuPoint2").val()==""?0:$("#stuPoint2").val())+","+($("#stuPoint3").val()==""?0:$("#stuPoint3").val())+","+($("#stuPoint4").val()==""?0:$("#stuPoint4").val())+","+($("#stuPoint5").val()==""?0:$("#stuPoint5").val())+","+($("#stuPoint6").val()==""?0:$("#stuPoint6").val()),
            // stuPointDetail:$("#stuPoint1").val()+","+$("#stuPoint2").val()+","+$("#stuPoint3").val()+","+$("#stuPoint4").val()+","+$("#stuPoint5").val()+","+$("#stuPoint6").val(),
            // stuGoodSubject:($("#gdsub_1").prop("checked")==false?0:1)+","+($("#gdsub_2").prop("checked")==false?0:1)+","+($("#gdsub_3").prop("checked")==false?0:1)+","+($("#gdsub_4").prop("checked")==false?0:1)+","+($("#gdsub_5").prop("checked")==false?0:1)+","+($("#gdsub_6").prop("checked")==false?0:1)+","+($("#gdsub_7").prop("checked")==false?0:1)+","+($("#gdsub_8").prop("checked")==false?0:1)+","+($("#gdsub_9").prop("checked")==false?0:1),
            stuGoodSubject:subjectSortableStr,
            // stuIntentSubject:($("#field_1").prop("checked")==false?0:1)+","+($("#field_2").prop("checked")==false?0:1)+","+($("#field_3").prop("checked")==false?0:1)+","+($("#field_4").prop("checked")==false?0:1)+","+($("#field_5").prop("checked")==false?0:1)+","+$("#field_6").val(),
            stuIntentSubject:stuIntentSubjectStr,
            stuIntentCollege:$("#pre_college").val(),
            stuIntentCity:$("#pre_city").val(),
            stuAfterGraduation:($("#graduate_1").prop("checked")==false?0:1)+","+($("#graduate_2").prop("checked")==false?0:1)+","+($("#graduate_3").prop("checked")==false?0:1),
            stuSpecialType:($("#special_1").prop("checked")==false?0:1)+","+($("#special_2").prop("checked")==false?0:1),
            stuOtherInfo:$("#other_info").val(),

        }
        $.ajax({
            url:"./updateStudent",
            type: "post",
            datatype:"text",
            data: params,
            success: function (stuid) {
                if(stuid=="timeout"){
                    // alert("连接超时，请重新登录")
                    $(window).attr('location','./login');
                }else {
                    // modal.modal('hide')
                    if (params.stuId==""){
                        var sex_text = "未设置"
                        if(params.stuSex=="0"){
                            sex_text = "<img src='images/index/ico_dk1.png' style='width: 27px;height: 27px'/>"
                        }else if(params.stuSex=="1"){
                            sex_text = "<img src='images/index/ico_male1.png' style='width: 27px;height: 25px'/>"
                        }else if(params.stuSex=="2"){
                            sex_text = "<img src='images/index/ico_female1.png' style='width: 27px;height: 27px'/>"
                        }
                        var status_text = "未设置"
                        if(params.stuStatus=="0"){
                            status_text = "未指导"
                        }else if(params.stuStatus=="1"){
                            status_text = "已指导"
                        }else {
                            status_text = "未指导"
                        }
                        var subject_text = ""
                        if(params.stuSubjectCode=="1"){
                            subject_text = "文史"
                        }else if(params.stuSubjectCode=="5"){
                            subject_text = "理工"
                        }else {
                            subject_text = ""
                        }

                        $("tbody").append("<tr id='info"+stuid+"'>" +
                            "<td id='stuName"+stuid+"' style='font-size: 15px'>"+params.stuName+"</td>" +
                            "<td id='stuSex"+stuid+"'>"+sex_text+"</td>" +
                            "<td id='stuHighschoolName"+stuid+"'>"+highschoolDictionary[params.stuHighschoolCode]+"</td>" +
                            "<td id='stuSubjectCode"+stuid+"'>"+subject_text+"</td>" +
                            "<td id='stuPoint"+stuid+"' style='color: #eb594c;font-size: 15px'>"+params.stuPoint+"</td>" +
                            "<td id='stuTel"+stuid+"'>"+params.stuTel+"</td>" +
                            //                            "<td id='stuStatus"+stuid+"'>"+status_text+"</td>" +
                            "<td style='text-align: center;width: 150px'>" +
                            "<a name='delete_"+stuid+"' class='delete'  data-toggle='modal' data-target='#deleteModal' style='cursor: pointer;'><img  src='images/index/ico_delete.png' style='width: 20px;height: 20px'></img></a>" +
                            "&nbsp;<a name='edit_"+stuid+"' class='edit' data-toggle='modal' data-target='#editModal' style='cursor: pointer;padding-left: 20px;'><img src='images/index/ico_edit.png' style='width: 20px;height: 18px'></img></a>" +
                            "&nbsp;<a name='guide_"+stuid+"' class='guide' data-toggle='modal' data-target='#' style='cursor: pointer;padding-left: 20px'><img src='images/index/ico_guide.png' style='width: 20px;height: 20px'></img></a>" +

                            // "<button name='delete_"+stuid+"' class='delete btn btn-primary btn-sm btn-danger' data-toggle='modal' data-target='#deleteModal' style='background:url(images/index/ico_delete.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 20px;height: 20px' > </button>" +
                            // "&nbsp;<button name='edit_"+stuid+"' class='edit btn btn-primary btn-sm' data-toggle='modal' data-target='#editModal'  style='padding-left: 20px;background:url(images/index/ico_edit.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 18px;height: 20px'></button>" +
                            // "&nbsp;<button name='guide_"+stuid+"' class='guide btn btn-primary btn-sm' data-toggle='modal' data-target='#'  style='padding-left: 20px;background:url(images/index/ico_guide.png) no-repeat center;background-size:20px 20px;display: inline-block;border: none;width: 20px;height: 20px'></button>"+
                            // "<img name='delete_"+stuid+"' class='delete' data-toggle='modal' data-target='#deleteModal' src='images/index/ico_delete.png' style='cursor: pointer;width: 20px;height: 20px'></img>" +

                            // "<button name='edit_"+stuid+"' class='edit btn btn-primary btn-sm' data-toggle='modal' data-target='#editModal'>编辑信息</button>" +
                            // "&nbsp;<button name='guide_"+stuid+"' class='guide btn btn-primary btn-sm' data-toggle='modal' data-target='#'>指导</button>" +
                            // "&nbsp;&nbsp;&nbsp;<button name='delete_"+stuid+"' class='delete btn btn-primary btn-sm btn-danger' data-toggle='modal' data-target='#deleteModal'>删除</button>" +

                            "</td>" +
                            "</tr>")
//                        $(".pagination-container").remove()
                        initNewModel();
                        bootoast({
                            message: '添加成功',
                            type: 'success',
                            position:'top',
                            timeout:0.7
                        });
                    }else {
                        $("#stuTel"+params.stuId).html(params.stuTel)
                        $("#stuHighschoolName"+params.stuId).html(highschoolDictionary[params.stuHighschoolCode])
                        $("#stuName"+params.stuId).html(params.stuName)
                        $("#stuName_dis").html(params.stuName)
                        if (params.stuSubjectCode=="1"){
                            $("#stuSubjectCode"+params.stuId).html("文史")
                        }else if (params.stuSubjectCode=="5"){
                            $("#stuSubjectCode"+params.stuId).html("理工")
                        }
                        if (params.stuSex=="0"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_dk1.png' style='width: 27px;height: 27px'/>")
                        }else if (params.stuSex=="1"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_male1.png' style='width: 27px;height: 25px'/>")
                        }else if (params.stuSex=="2"){
                            $("#stuSex"+params.stuId).html("<img src='images/index/ico_female1.png' style='width: 27px;height: 27px'/>")
                        }
                        $("#stuPoint"+params.stuId).html(params.stuPoint)

                        hi_if_info_compelet=1;
                        easy_notify("保存成功",2000);
                        $("html,body").animate({scrollTop:0}, 500);
                    }

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


/*<![CDATA[*/
function initSearch(){
    var table_list=document.getElementById("stu_list");
    var search_input=document.getElementsByClassName("search");
    search_input[1].onclick=function(){
        for(var i=0;i<table_list.tBodies[0].rows.length;i++) {
            table_list.tBodies[0].rows[i].hidden='hidden';
        }
        for(var i=0;i<table_list.tBodies[0].rows.length;i++) {
            var search_str=table_list.tBodies[0].rows[i].cells[0].innerHTML.toUpperCase()+table_list.tBodies[0].rows[i].cells[2].innerHTML.toUpperCase()+table_list.tBodies[0].rows[i].cells[5].innerHTML.toUpperCase();
            var inputstr=search_input[0].value.toUpperCase();
            //使用string.toUpperCase()(将字符串中的字符全部转换成大写)或string.toLowerCase()(将字符串中的字符全部转换成小写)
            //所谓忽略大小写的搜索就是将用户输入的字符串全部转换大写或小写，然后把信息表中的字符串的全部转换成大写或小写，最后再去比较两者转换后的字符就行了
            /*******************************JS实现表格忽略大小写搜索*********************************/
            if(search_str==inputstr){
                table_list.tBodies[0].rows[i].removeAttribute("hidden");
            }
            else{
                // table_list.tBodies[0].rows[i].hidden='hidden';
            }
            /***********************************JS实现表格的模糊搜索*************************************/
            //表格的模糊搜索的就是通过JS中的一个search()方法，使用格式，string1.search(string2);如果
            //用户输入的字符串是其一个子串，就会返回该子串在主串的位置，不匹配则会返回-1，故操作如下
            if(search_str.search(inputstr)!=-1){table_list.tBodies[0].rows[i].removeAttribute("hidden");}
            // else{table_list.tBodies[0].rows[i].hidden='hidden';}
            /***********************************JS实现表格的多关键字搜索********************************/
            //表格的多关键字搜索，加入用户所输入的多个关键字之间用空格隔开，就用split方法把一个长字符串以空格为标准，分成一个字符串数组，
            //然后以一个循环将切成的数组的子字符串与信息表中的字符串比较
            // var arr=inputstr.split(' ');
            // for(var j=0;j<arr.length;j++)
            // {
            //     if(search_str.search(arr[j])!=-1){table_list.tBodies[0].rows[i].removeAttribute("hidden");}
            // }
        }
        var subject_select=document.getElementById("search_subject");
        var inputstr="";
        if(subject_select.value=="0"){
            inputstr="";
        }else{
            if(subject_select.value=="1"){
                inputstr="文史";
            }else if(subject_select.value=="2"){
                inputstr="理工";
            }
            // search function
            for(var i=0;i<table_list.tBodies[0].rows.length;i++) {
                var search_str=table_list.tBodies[0].rows[i].cells[3].innerHTML;
                if(search_str==inputstr){
                    // table_list.tBodies[0].rows[i].removeAttribute("hidden");
                }
                else{
                    table_list.tBodies[0].rows[i].hidden='hidden';
                }
            }
        }
        var point_select=document.getElementById("search_point");
        var min_point=0;
        var max_point=750;
        if(point_select.value=="-1"||point_select.value=="6"){
            if(point_select.value=="-1"){

            }else if(point_select.value=="6"){
                // search function
                for(var i=0;i<table_list.tBodies[0].rows.length;i++) {
                    var search_str=table_list.tBodies[0].rows[i].cells[4].innerHTML;
                    if(search_str=="" || search_str==null){
                        // table_list.tBodies[0].rows[i].removeAttribute("hidden");
                    }else{
                        table_list.tBodies[0].rows[i].hidden='hidden';
                    }
                }
            }

        }else{
            if(point_select.value=="0"){
                min_point=0;
                max_point=750;
            }else if(point_select.value=="1"){
                min_point=0;
                max_point=300;
            }else if(point_select.value=="2"){
                min_point=300;
                max_point=400;
            }else if(point_select.value=="3"){
                min_point=400;
                max_point=500;
            }else if(point_select.value=="4"){
                min_point=500;
                max_point=600;
            }else if(point_select.value=="5"){
                min_point=600;
                max_point=750;
            }
            // search function
            for(var i=0;i<table_list.tBodies[0].rows.length;i++) {
                var search_str=table_list.tBodies[0].rows[i].cells[4].innerHTML;
                var search_point = parseInt(search_str);
                if(search_point>=min_point && search_point<=max_point){
                    // table_list.tBodies[0].rows[i].removeAttribute("hidden");
                }else{
                    table_list.tBodies[0].rows[i].hidden='hidden';
                }
            }
        }

    }

}

/*]]>*/
