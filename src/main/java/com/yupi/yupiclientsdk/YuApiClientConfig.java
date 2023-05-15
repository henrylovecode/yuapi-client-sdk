package com.yupi.yupiclientsdk;

import com.yupi.yupiclientsdk.client.YuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * FileName:     YuApiClientConfig
 * CreateBy:     IntelliJ IDEA
 * Author:       wei
 * Date:         2023-05-10
 * Description :
 */
@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class YuApiClientConfig {


    private String accessKey;

    private String secretKey;

    @Bean
    public YuApiClient yuApiClient(){
        return new YuApiClient(accessKey , secretKey);
    }


}
