
$(function() {
    $.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型
        dataType: "json",//预期服务器返回的数据类型
        url: "/user/getKana" ,//url
        success: function (result) {
            console.log(result);//打印服务端返回的数据(调试用)
            if (result.code === 0) {
                if (result.kana.length>1){
                    $("#kana").css("font-size",150)
                }else{
                    $("#kana").css("font-size",300)
                }
                $("#kana").html(result.kana)
                $("#kanaID").val(result.kanaID)
                $("#userID").val(result.userID)
            }
            ;
        },
        error : function() {
            alert("获取假名异常！");
        }
    });
});

function submitForm () { // 点击“提交”按钮，执行的方法
    $.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型
        dataType: "json",//预期服务器返回的数据类型
        url: "/kana/kanaSubmit" ,//url
        data: $('#japanForm').serialize(),
        success: function (result) {
            console.log(result);//打印服务端返回的数据(调试用)
            if (result.resultCode == 200) {
                alert("SUCCESS");
            }
            ;
        },
        error : function() {
            alert("异常！");
        }
    });
}

function anotherWord() {
    alert("another")
}