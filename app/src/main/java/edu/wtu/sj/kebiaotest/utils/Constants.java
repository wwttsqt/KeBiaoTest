package edu.wtu.sj.kebiaotest.utils;

/**
 * 常量类
 */
public class Constants {
    // 用于SharedPreferences保存程序状态文件时
    public static final String APP_DATA = "app_data";
    public static final String FIRST_INSTALL = "first_install";
    public static final String TIME_OF_ENROLLMENT = "time_of_enrollment";


    // 要查询的信息的类型
    public static final int SEARCH_SCHEDULE = 1;
    public static final int SEARCH_SCORE = 2;

    // Jsoup解析后传递的Map所用的key值
    public static final String STUDENTNAME = "studentName";
    public static final String FAILEDINFO = "failedInfo";

    /**
     * 验证码网址
     */
    public static final String VERIFICATION_CODE_URL = "http://****.****.edu.cn/(o3peb555lzmmpd45xbiztw45)/CheckCode.aspx";
    /**
     * 教务系统登录界面网址
     */
    public static final String EDUCATION_SYSTEM_LOGIN_URL = "http://ids.wtu.edu.cn/amserver/UI/Login?goto=http://my.wtu.edu.cn/index.portal";
    /**
     * 查询课表的网址
     */
    public static final String SEARCH_SCHEDULE_URL = "http://****.****.edu.cn/(o3peb555lzmmpd45xbiztw45)/xskbcx.aspx?xh=" + Constants.LOGIN_BODY_NAME_USERNAME + "&xm=" + Constants.STUDENTNAME + "&gnmkdm=N121603";
    /**
     * 查询成绩的网址
     */
    public static final String SEARCH_SCORE_URL = "http://****.****.edu.cn/(o3peb555lzmmpd45xbiztw45)/xscj.aspx?xh=" + Constants.LOGIN_BODY_NAME_USERNAME + "&xm=" + Constants.STUDENTNAME + "&gnmkdm=N121605";

    // 请求头
    public static final String HEADER_NAME_HOST = "Host";
    public static final String HEADER_VALUE_HOST = "****.****.edu.cn";
    public static final String HEADER_NAME_REFERER ="Referer";
    //public static final String HEADER_VALUE_REFERER ="http://****.****.edu.cn/(jrjgihf014aciqyozl13wo55)/default2.aspx";
    public static final String HEADER_VALUE_REFERER ="http://****.****.edu.cn/(jrjgihf014aciqyozl13wo55)/xs_main.aspx?xh=";
    public static final String HEADER_NAME_AGENT ="User-Agent";
    public static final String HEADER_VALUE_AGENT ="Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E; InfoPath.3)";
    // 登录时的请求参数
    public static final String LOGIN_BODY_NAME_VIEWSTATE = "__VIEWSTATE";
    public static final String LOGIN_BODY_VALUE_VIEWSTATE = "dDwyODE2NTM0OTg7Oz72zDwUlNWz9xsg90dgX5NnyPvw9Q==";
    public static final String LOGIN_BODY_NAME_VIEWSTATEGENERATOR = "__VIEWSTATEGENERATOR";
    public static final String LOGIN_BODY_VALUE_VIEWSTATEGENERATOR = "92719903";
    public static final String LOGIN_BODY_NAME_BUTTON1 = "Button1";
    public static final String LOGIN_BODY_VALUE_BUTTON1 = "";
    public static final String LOGIN_BODY_NAME_HIDPDRS = "hidPdrs";
    public static final String LOGIN_BODY_VALUE_HIDPDRS = "";
    public static final String LOGIN_BODY_NAME_HIDSC = "hidsc";
    public static final String LOGIN_BODY_VALUE_HIDSC = "";
    public static final String LOGIN_BODY_NAME_LANGUAGE = "lbLanguage";
    public static final String LOGIN_BODY_VALUE_LANGUAGE = "";
    public static final String LOGIN_BODY_NAME_TYPE = "RadioButtonList1";
    public static final String LOGIN_BODY_VALUE_TYPE = "学生";
    public static final String LOGIN_BODY_NAME_USERNAME = "IDToken1";
    public static final String LOGIN_BODY_VALUE_USERNAME = "";
    public static final String LOGIN_BODY_NAME_PASSWORD = "IDToken2";
    public static final String LOGIN_BODY_VALUE_PASSWORD = "";
    public static final String LOGIN_BODY_NAME_SECRETCODE = "txtSecretCode";
    public static final String LOGIN_BODY_VALUE_SECRETCODE = "";

    // 查询课表时的请求参数
    public static final String SCHEDULE_BODY_NAME_EVENTARGUMENT = "__EVENTARGUMENT";
    public static final String SCHEDULE_BODY_VALUE_EVENTARGUMENT = "";
    public static final String SCHEDULE_BODY_NAME_EVENTTARGET = "__EVENTTARGET";
    public static final String SCHEDULE_BODY_VALUE_EVENTTARGET = "xqd";
    public static final String SCHEDULE_BODY_NAME_VIEWSTATE = "__VIEWSTATE";
    public static final String SCHEDULE_BODY_VALUE_VIEWSTATE = "dDwzOTI4ODU2MjU7dDw7bDxpPDE+Oz47bDx0PDtsPGk8MT47aTwyPjtpPDQ+O2k8Nz47aTw5PjtpPDExPjtpPDEzPjtpPDE1PjtpPDI0PjtpPDI2PjtpPDI4PjtpPDMwPjtpPDMyPjtpPDM0Pjs+O2w8dDxwPHA8bDxUZXh0Oz47bDxcZTs+Pjs+Ozs+O3Q8dDxwPHA8bDxEYXRhVGV4dEZpZWxkO0RhdGFWYWx1ZUZpZWxkOz47bDx4bjt4bjs+Pjs+O3Q8aTw1PjtAPDIwMTYtMjAxNzsyMDE1LTIwMTY7MjAxNC0yMDE1OzIwMTMtMjAxNDsyMDEyLTIwMTM7PjtAPDIwMTYtMjAxNzsyMDE1LTIwMTY7MjAxNC0yMDE1OzIwMTMtMjAxNDsyMDEyLTIwMTM7Pj47bDxpPDM+Oz4+Ozs+O3Q8dDw7O2w8aTwwPjs+Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPOWtpuWPt++8mjEyMTAwMzUzMTAxNzs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w85aeT5ZCN77ya6ZmI5YWo5rSLOz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDzlrabpmaLvvJrnlLXlrZDkv6Hmga/lrabpmaI7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPOS4k+S4mu+8mui9r+S7tuW3peeoizs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w86KGM5pS/54+t77ya6L2v5Lu2MTMxMTs+Pjs+Ozs+O3Q8O2w8aTwxPjs+O2w8dDxAMDw7Ozs7Ozs7Ozs7Pjs7Pjs+Pjt0PHA8bDxWaXNpYmxlOz47bDxvPGY+Oz4+O2w8aTwxPjs+O2w8dDxAMDw7Ozs7Ozs7Ozs7Pjs7Pjs+Pjt0PEAwPHA8cDxsPFBhZ2VDb3VudDtfIUl0ZW1Db3VudDtfIURhdGFTb3VyY2VJdGVtQ291bnQ7RGF0YUtleXM7PjtsPGk8MT47aTwwPjtpPDA+O2w8Pjs+Pjs+Ozs7Ozs7Ozs7Oz47Oz47dDxAMDxwPHA8bDxQYWdlQ291bnQ7XyFJdGVtQ291bnQ7XyFEYXRhU291cmNlSXRlbUNvdW50O0RhdGFLZXlzOz47bDxpPDE+O2k8Mz47aTwzPjtsPD47Pj47Pjs7Ozs7Ozs7Ozs+O2w8aTwwPjs+O2w8dDw7bDxpPDE+O2k8Mj47aTwzPjs+O2w8dDw7bDxpPDA+O2k8MT47aTwyPjtpPDM+O2k8ND47aTw1PjtpPDY+Oz47bDx0PHA8cDxsPFRleHQ7PjtsPOWGm+aUv+iuree7gzs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w85L6v56S+57qiOz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwxLjA7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPDAxLTE4Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47Pj47dDw7bDxpPDA+O2k8MT47aTwyPjtpPDM+O2k8ND47aTw1PjtpPDY+Oz47bDx0PHA8cDxsPFRleHQ7PjtsPOaVsOaNrue7k+aehOivvueoi+iuvuiuoTs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w8546L5Lit5Y2OOz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwxLjA7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPDAxLTE4Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47Pj47dDw7bDxpPDA+O2k8MT47aTwyPjtpPDM+O2k8ND47aTw1PjtpPDY+Oz47bDx0PHA8cDxsPFRleHQ7PjtsPOeUteWtkOW3peiJuuWunuS5oCgxKTs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w86aG+5bCP5YWwOz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwyLjA7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPDAxLTE4Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDwmbmJzcFw7Oz4+Oz47Oz47Pj47Pj47Pj47dDxAMDxwPHA8bDxQYWdlQ291bnQ7XyFJdGVtQ291bnQ7XyFEYXRhU291cmNlSXRlbUNvdW50O0RhdGFLZXlzOz47bDxpPDE+O2k8MD47aTwwPjtsPD47Pj47Pjs7Ozs7Ozs7Ozs+Ozs+O3Q8QDA8cDxwPGw8UGFnZUNvdW50O18hSXRlbUNvdW50O18hRGF0YVNvdXJjZUl0ZW1Db3VudDtEYXRhS2V5czs+O2w8aTwxPjtpPDM+O2k8Mz47bDw+Oz4+Oz47Ozs7Ozs7Ozs7PjtsPGk8MD47PjtsPHQ8O2w8aTwxPjtpPDI+O2k8Mz47PjtsPHQ8O2w8aTwwPjtpPDE+O2k8Mj47aTwzPjtpPDQ+Oz47bDx0PHA8cDxsPFRleHQ7PjtsPDIwMTMtMjAxNDs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w8MTs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w855S15a2Q5bel6Im65a6e5LmgKDEpOz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDzpob7lsI/lhbA7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPDIuMDs+Pjs+Ozs+Oz4+O3Q8O2w8aTwwPjtpPDE+O2k8Mj47aTwzPjtpPDQ+Oz47bDx0PHA8cDxsPFRleHQ7PjtsPDIwMTMtMjAxNDs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w8MTs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w85pWw5o2u57uT5p6E6K++56iL6K6+6K6hOz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDznjovkuK3ljY47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPDEuMDs+Pjs+Ozs+Oz4+O3Q8O2w8aTwwPjtpPDE+O2k8Mj47aTwzPjtpPDQ+Oz47bDx0PHA8cDxsPFRleHQ7PjtsPDIwMTMtMjAxNDs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w8MTs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w85Yab5pS/6K6t57uDOz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDzkvq/npL7nuqI7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPDEuMDs+Pjs+Ozs+Oz4+Oz4+Oz4+Oz4+Oz4+Oz5G7ilC7i7h18wADZkqrYw5fmyfBg==";
    public static final String SCHEDULE_BODY_NAME_VIEWSTATEGENERATOR = "__VIEWSTATEGENERATOR";
    public static final String SCHEDULE_BODY_VALUE_VIEWSTATEGENERATOR = "55530A43";
    public static final String SCHEDULE_BODY_NAME_SCHOOLYEAR = "xnd";
    public static final String SCHEDULE_BODY_VALUE_SCHOOLYEAR = "2013-2014";
    public static final String SCHEDULE_BODY_NAME_TERM = "XQD";
    public static final String SCHEDULE_BODY_VALUE_TERM = "1";
    // 查询成绩时的请求参数
    public static final String SCORE_BODY_NAME_VIEWSTATE = "__VIEWSTATE";
    public static final String SCORE_BODY_VALUE_VIEWSTATE = "dDw0MTg3MjExMDA7dDw7bDxpPDE+Oz47bDx0PDtsPGk8MT47aTwxNT47aTwxNz47aTwyMz47aTwyNT47aTwyNz47aTwyOT47aTwzMD47aTwzMj47aTwzND47aTwzNj47aTw0OD47aTw1Mj47PjtsPHQ8dDw7dDxpPDE3PjtAPFxlOzIwMDEtMjAwMjsyMDAyLTIwMDM7MjAwMy0yMDA0OzIwMDQtMjAwNTsyMDA1LTIwMDY7MjAwNi0yMDA3OzIwMDctMjAwODsyMDA4LTIwMDk7MjAwOS0yMDEwOzIwMTAtMjAxMTsyMDExLTIwMTI7MjAxMi0yMDEzOzIwMTMtMjAxNDsyMDE0LTIwMTU7MjAxNS0yMDE2OzIwMTYtMjAxNzs+O0A8XGU7MjAwMS0yMDAyOzIwMDItMjAwMzsyMDAzLTIwMDQ7MjAwNC0yMDA1OzIwMDUtMjAwNjsyMDA2LTIwMDc7MjAwNy0yMDA4OzIwMDgtMjAwOTsyMDA5LTIwMTA7MjAxMC0yMDExOzIwMTEtMjAxMjsyMDEyLTIwMTM7MjAxMy0yMDE0OzIwMTQtMjAxNTsyMDE1LTIwMTY7MjAxNi0yMDE3Oz4+Oz47Oz47dDxwPDtwPGw8b25jbGljazs+O2w8cHJldmlldygpXDs7Pj4+Ozs+O3Q8cDw7cDxsPG9uY2xpY2s7PjtsPHdpbmRvdy5jbG9zZSgpXDs7Pj4+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w85a2m5Y+377yaMTIxMDAzNTMxMDE3Oz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDzlp5PlkI3vvJrpmYjlhajmtIs7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPOWtpumZou+8mueUteWtkOS/oeaBr+WtpumZojs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w85LiT5Lia77yaOz4+Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDzova/ku7blt6XnqIs7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPOihjOaUv+ePre+8mui9r+S7tjEzMTE7Pj47Pjs7Pjt0PEAwPDs7Ozs7Ozs7Ozs+Ozs+O3Q8QDA8Ozs7Ozs7Ozs7Oz47Oz47dDxwPHA8bDxUZXh0Oz47bDxTSERKWFk7Pj47Pjs7Pjt0PEAwPDs7Ozs7Ozs7Ozs+Ozs+Oz4+Oz4+Oz6Ias3pbdZ5OrR6552SwC/h8yZ3eA==";
    public static final String SCORE_BODY_NAME_VIEWSTATEGENERATOR = "__VIEWSTATEGENERATOR";
    public static final String SCORE_BODY_VALUE_VIEWSTATEGENERATOR = "8963BEEC";
    public static final String SCORE_BODY_NAME_BUTTON1 = "Button1";
    public static final String SCORE_BODY_VALUE_BUTTON1 = "按学期查询";
    public static final String SCORE_BODY_NAME_SCHOOLYEAR = "ddlXN";
    public static final String SCORE_BODY_VALUE_SCHOOLYEAR = "2013-2014";
    public static final String SCORE_BODY_NAME_TERM = "ddlXQ";
    public static final String SCORE_BODY_VALUE_TERM = "1";
    public static final String SCORE_BODY_NAME_TXTQSCJ = "txtQSCJ";
    public static final String SCORE_BODY_VALUE_TXTQSCJ = "0";
    public static final String SCORE_BODY_NAME_TXTZZCJ = "txtZZCJ";
    public static final String SCORE_BODY_VALUE_TXTZZCJ = "100";

}
