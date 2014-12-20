/**
 * Created by Administrator on 2014/12/20.
 */
<!--创建ajax对象-->
function getXhr() {
    var xhr = null;
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHttp')
    }
    return xhr;
}
//根据id得到对应的dom对象
function $(id){
    return document.getElementById(id);
}
/*获取dom对象的value属性*/
function $F(id){
    return $(id).value;
}