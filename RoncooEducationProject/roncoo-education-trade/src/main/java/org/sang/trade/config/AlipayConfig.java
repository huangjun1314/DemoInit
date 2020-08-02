package org.sang.trade.config;

import org.springframework.stereotype.Component;

@Component
public class AlipayConfig {
    // 商户appid
    private  String APPID = "2016101500695653";
    // 私钥 pkcs8格式的
    private  String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCmquWHDiq008jkchBNYtJJCoLkoSMkGWZCK8hZXLc/oAW3ZMw4dEAaVQo9Le36n26VOSHATQyvqNCduBfNEYJyTHQilsr4WsalxiTJtP2AV2aHyU6DM0kSs1NEnZVe1EThKzGwFGFVfsRnDkRYjLnr8GKbG0Gt5X4zrtHCtJ9pdTqiAsDgmQCeH1R+keCZgkrv7U0MkDuvkeNCG5EI4atJmaHhw+q42qoj/dOlOE7036n9l6ey0n9hiw316VB2AusOi9IPJabEVzTCmzQEL73GGZntbsbzvZ2wdCE/hm/XtG3o3DzqobomSD8e8R4/vS2G68hdX1w0jDOBO4QT8bZxAgMBAAECggEAFOrDzbRgdbtSriEGnL+3RoV0Mf9rKp+pbsqR5W02blzF+uNCoh8s4GEl3NHD2T1jIoU+ECVbXzxfmju9ePYmmfOwa5rjNFIoNivs+Aen/RB7BLWmDd9E33z0CVuBoJohXuUN4lxcbt9vBMQMndRjjRHpPjAoiQuRUCkzmC0VCKYC218o0/FcPJaH/aQV97Xq1Uvxz3Kuv779+9YpF3qvMsJ+Sf1FJbogtX1le1a2bzg4INcPC3ljarIId/tJJdin2+3ldWya9QTnfOjYhewsTH62jwapVqICbjWi7qA3sUWmVe0CXGBCmImWogJQea6cstrCZ0L/ctbPcZcChzK+8QKBgQDa5prQYmY7G+7XtOqXrOKXEEyjDBwH3vCVg7puh5RNDcptev6G9FypxnEf0B8YzpDaH0PrvpnBXaXFb9UeN9irHLIf7tuZRoYD2TQELwlwG/jnqe8wbIU0/UUsLzX8B/Yzbdu8LBkmrYox57dlWWiyh4Xq4RwK3A8IV3M9V9wJXQKBgQDC6g+x5e5KsUHOTDgGynPcu8dpMCcRyEv36ETIUTDGTPACLrK954+isTWV5hYjInWNIqvCGZ61u8QRdr36Hvv6BUedqtKti8Pqi3Vlt29giVJui2uoKq0P5QMJOWzb+GmM8Vuwakp7uthorCGV6m+MChcskokjqOgqjzQOpEQMJQKBgATIdSmIfONdwOJFubqGtIzIdmQ5p4Mkg+1Aa5puq/bjDkFGJrmcLUooY+BmE8fe+5tIg5trFsD64txljSqT3dAfWGUKOxImUFdVL6XHwVUJx26IcAmG1YJK5nAIuA1Bv0dwZxS9ge8ua46bmY5FXdxIycxQDuTN2iY8gvAcM1qhAoGAbhk+clOZ7bEApeIhx5w2JBohwsYDW6UTXF5j8+8AqRKug90S8/hIBzMoPJryKDh/xBAwivxjzO3aC69SEmXMGWdAE8x5IrSPHv5VevZJwHLxECZK0nwAs7i9pUk9t2czX/y5uQXhOtDJCx8n/YGmLqlIe9HuCymOsvOfCSI6mc0CgYEAlaQCQlCUxVFfPzrPZgDLVrtQV75deZYTAdko534k9a8RI2TvFIgFtWg6dQDdtxfKya90MVzSo9eNZRNuzbdtVg7biG/SNYfjS1NcfRdclm27mQ8K7L2IjldiOXpgatqgVfDGKpyQTS77re+hYfVjiwcXjyQQUxwIksyJUe/G2Kg=";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    private  String notify_url = "http://localhost:8085/user/alipay/notify";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    private  String return_url = "http://localhost:8085/user/alipay/return";
    // 请求网关地址
    private  String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    private  String CHARSET = "utf-8";
    // 返回格式
    private  String FORMAT = "json";
    // 支付宝公钥
    private  String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA01E1tAIGkbjyfFwq/5QpFCKTWpQPARi1R7ousXLEUfqU1aN2ZqJRIE4G/DxfJhbXcGnLRaYDCcBGKF5EDBe75lHWfJywfhaODZocR63fgJGJ6To1p6usBWp2YbiDHd++NEySoSDP14Z7q+aGfi10k0+sDQ9Nn+2KUX+BM7/zD2i+cg8Om5TpEEow4ryi+ddow1nqE8gwivAl6ifzwc5KwEhFCHAAegUH82urrJcIp1muy19Kt5Waf2ixTBx+qofAyP9/fuxXXuXtg8OATe4ahK531ASnHp9UkAqsyVyGyYoRdpcdq8Q7NTIxN4h6f6m5MQo82WdR7MnL3JLS02A4wQIDAQAB";
    // 日志记录目录
    private  String log_path = "/logs";
    // RSA
    private  String SIGNTYPE = "RSA";

    //支付成功跳转页
    private String paymentSuccessUrl="/success";
    //支付失败跳转页
    private String paymentFailureUrl="/fail";










    public String getAPPID() {
        return APPID;
    }

    public void setAPPID(String APPID) {
        this.APPID = APPID;
    }

    public String getRSA_PRIVATE_KEY() {
        return RSA_PRIVATE_KEY;
    }

    public void setRSA_PRIVATE_KEY(String RSA_PRIVATE_KEY) {
        this.RSA_PRIVATE_KEY = RSA_PRIVATE_KEY;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getCHARSET() {
        return CHARSET;
    }

    public void setCHARSET(String CHARSET) {
        this.CHARSET = CHARSET;
    }

    public String getFORMAT() {
        return FORMAT;
    }

    public void setFORMAT(String FORMAT) {
        this.FORMAT = FORMAT;
    }

    public String getALIPAY_PUBLIC_KEY() {
        return ALIPAY_PUBLIC_KEY;
    }

    public void setALIPAY_PUBLIC_KEY(String ALIPAY_PUBLIC_KEY) {
        this.ALIPAY_PUBLIC_KEY = ALIPAY_PUBLIC_KEY;
    }

    public String getLog_path() {
        return log_path;
    }

    public void setLog_path(String log_path) {
        this.log_path = log_path;
    }

    public String getSIGNTYPE() {
        return SIGNTYPE;
    }

    public void setSIGNTYPE(String SIGNTYPE) {
        this.SIGNTYPE = SIGNTYPE;
    }

    public String getPaymentSuccessUrl() {
        return paymentSuccessUrl;
    }

    public void setPaymentSuccessUrl(String paymentSuccessUrl) {
        this.paymentSuccessUrl = paymentSuccessUrl;
    }

    public String getPaymentFailureUrl() {
        return paymentFailureUrl;
    }

    public void setPaymentFailureUrl(String paymentFailureUrl) {
        this.paymentFailureUrl = paymentFailureUrl;
    }
}
