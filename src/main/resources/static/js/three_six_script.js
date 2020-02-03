function start_search1() {
    min_score1 = $("#min1").val()
    if(min_score1==""){
        min_score1 = 0;
    }
    max_score1 = $("#max1").val()
    if(max_score1==""){
        max_score1 = 750;
    }
    $.ajax({
        url:"/get_query_num_before_search",
        data:{
            "score_min":min_score1,
            "score_max":max_score1,
            "school_name":$("#section1_school_name").val()
        },
        type:"post",
        dataType:"text",
        success:function (nums) {
            alert(nums)
            return nums;
        },
        error: function () {
            alert("无网络,请检查您的网络连接")
        }
    });
}
function search1(offset) {
    if (parseFloat(offset).toString()=="NaN"){
        offset=0;
    }
    min_score1 = $("#min1").val()
    if(min_score1==""){
        min_score1 = 0;
    }
    max_score1 = $("#max1").val()
    if(max_score1==""){
        max_score1 = 750;
    }

    $.ajax({
        url:"/search_school_1",
        data:{
            "score_min":min_score1,
            "score_max":max_score1,
            "school_name":$("#section1_school_name").val(),
            "offset":offset
        },
        type:"post",
        dataType:"text",
        success:function (ret) {
            console.log(ret)
        },
        error: function () {
            alert("aaa")
        }
    })
}