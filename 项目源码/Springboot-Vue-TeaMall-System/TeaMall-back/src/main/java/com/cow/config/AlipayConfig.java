package com.cow.config;


import com.alipay.api.request.AlipayTradePagePayRequest;

import com.cow.util.general.PropertiesUtil;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 */
@Data
@Component
public class AlipayConfig {
    /**
     * 沙箱appId
     */
    public static final String APPID = "9021000135614710";

    /**
     * 请求网关  固定
     */
    public static final String URL = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

    /**
     * 编码
     */
    public static final String CHARSET = "UTF-8";

    /**
     * 返回格式
     */
    public static final String FORMAT = "json";

    /**
     * RSA2
     */
    public static final String SIGNTYPE = "RSA2";

    /**
     * 异步通知地址
     */
    public static final String NOTIFY_URL = "http://" + PropertiesUtil.getDomain() + "/alipay/notify";

    /**
     * 同步地址
     */
    public static final String RETURN_URL = "http://" + PropertiesUtil.getDomain() + "/alipay" +
            "/success";

    /**
     * 应用私钥 pkcs8格式
     */
    public static final String RSA_PRIVATE_KEY =
           "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDDHiiVvKUql4rBkWy/KHorlZtsx14Pugz+n13dFdEmZpkovFx92TtFQwKasbODVFK72c0aDzj4xyl3QdHg4dzsMfhSrhLieYIIc3qB9PIkggekGc2scijxlwf6CthXzTK7PKMtxgFiqukcgByQNawtaNpzI/LCosx85Z6Vz3Xf06BFoVVspWB5dBH8jJYaMCNHkplqRyU5f+tOiGfwMJsFUr7Aq2tHZDkjH1u3OsgI0ysUlX8XXrEnwxudAUvlriltMlCLc7Lt/P8In/YjRWh1h0mBbiStpciXIhs2r3huD6Yn0NTPMyXBnayMrU/deyv/dN0s9uHhff5LIn1BFXfJAgMBAAECggEBAI+UR8U4FkprTX33Z5CbVptv8flwE/V6sUlFOKsR/OBHK3lgcqdhDU6AaxAup6yChocZVOZSQVhAJnFNjAXx7sIYW2VsFxV02I0jfQjYmL7ouHq3SjQVpa9xtjr3dA/YPfauPl3WkPpsTjHczCgKdvLLb8S+tUsoxVU7GyGeklzrctUMPKVnJ2aQLReye5MVJalLpJl0Gb5IseBfiO4xQPDTkoemzKri/t8oOVTsZQ5PBaG75bAtYBDnLfMz0Xl/R6FT7nF7WleLa+fU/leNZeF0MeX2zVxNpeckFgwIJPqXlJtsSwNxRwkGNqhy3r/XgS76peL0/c3bhHVvWFNUugECgYEA4rg4KN5wKrwNs3tFwHIzoqh0WEJ+9UOPALi1cpTjB2QQyPANXY1iMjZBAMnQSEC7l44NssqxUsMaB2Vo7JcEHojhMR83xALB6NjhIRo+tq8qe/H42svIaiohOnuGPV3wYwiYxGSz2r421tktq56uTgUfLitwbZQqFRy21X0S96kCgYEA3FEfp7i1HYvCLxzgg9CEWXm63JlYSrO7rveIUPV0zJ6s0g0q+ky7ctqHGs6jxAArQomXL0dHPt7tGHOBoLWsgp+hGXLe4QcJgnsIvpwkkqGxLVqVWAy4Ch1TRzlRa4uiM7OCDKi7DUEkRRZ9s/b/kSG77aLG/TMbsaE69/ByEyECgYEAkq6/XumzRmLOtn2d/kmk0KsOQwAapdIk1kGq20wqqmB6X5a3/vv3OSdS3RC1GdoPxJkakb+EBFjIIVriDJgUCTFkCOT6rm1eSajv1vvk8UrZQMGn0N8hdlZ1kyHSEygQ2/H27LF+j5qbXlu6qZuLiFzV9IgUQEEpDOm7/NnkCKkCgYBA5QRV+uoeUdRY3EClkv3o/Ro1cFW5a0eVOgRFFIfa3cI5/Pbz0zZDlmrFUqiaSxJy/uQxYOVzd2aPFTbRh7HQqARj4poT3mbGsEbbHlMHfekaWtwym0x6bjjhedipvO+CGxXrdKfkN5PfZciRAeg1b6JTVOcYHb3CjKM59PElAQKBgCFESDWII8ruyWNVr+haC4ue8HnucPXz9Y9Bl2CJi9onB/eF0KMVWmmf5Xdfp+H9W3av0GFMbYeoX83d1QVky9n08I2xog3K+JdlcQmT08A81eKx5liU9pBPbo+QuH0lge59LiYz8h13HX9iAPwGM0Xqi5602GQBtbgfCnhrZMzp";
    /**
     * 沙箱支付宝公钥z'z'z
     */
    public static final String ALIPAY_PUBLIC_KEY =
           "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsGXLEqs1RxzykT8Fd2beJsdrErfh7fyxLz5PUGDzXzCbEvb+NZqMz6CnYEAB0eFyBuOp33nMSigg3pQk3SgqoKLH9ym/H76HQtVOUeonP5FofHh/gUZ3+FaBZoQHPP532JFZuS2ecHHR12bzTxyCWJMsZ/3qp2O0WDg01Z6pKoFq1MLcCfT2DZQ72B8wA3SPIz5YuJ44gOfwuX82J8zDUJitXDw+kIf9c6i6PuQO9v6+uW8ubCfHG39E1PDGCVnzENDt5cDz3JSQombdxjAvQ2r4Yq7e4osDnVTujvE/Nd1Hg4po5VyIhdqqmi8RWkmdNQsdqRHlT9DwVk+t6GdwMQIDAQAB";
    private AlipayConfig() {
    }


    //多列模式的 aliPayRequest
    @Bean
    public AlipayTradePagePayRequest alipayTradePagePayRequest(){
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        return alipayRequest;
    }
}
