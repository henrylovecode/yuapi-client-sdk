package com.yupi.yupiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * FileName:     SignUtils
 * CreateBy:     IntelliJ IDEA
 * Author:       wei
 * Date:         2023-05-09
 * Description :
 */
public class SignUtils {

    /**
     * 生成签名
     * @param body
     * @param secretKey
     * @return
     */
    public static String getSign(String body, String secretKey){
        Digester digester = new Digester(DigestAlgorithm.SHA256);
        String content =  body + "." + secretKey;
        return digester.digestHex(content);
    }


}
