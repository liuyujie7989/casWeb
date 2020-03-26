package com.liuyujiie.AblitUtil;

import com.liuyujiie.AblitUtil.CallAbilityService;
import com.ohaotian.plugin.tapclient.EnableTapClients;
import com.ohaotian.plugin.tapclient.config.TapProperties;
import com.ohaotian.plugin.tapclient.proxy.TapCaller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author admin
 */
@EnableTapClients(basePackageClasses = {CallAbilityService.class})
@Configuration
public class AbilityConfig {

    @Value("${ablit.appid}")
    private String appId;
    @Value("${ablit.appkey}")
    private String appKey;
    @Value("${ablit.url}")
    private String url;


    /**
     * 配置实际调用能力平台的代理客户端
     * @param tapProperties
     * @return
     */
    @Bean
    public TapCaller tapCaller(TapProperties tapProperties) {
        return new TapCaller(tapProperties);
    }

    /**
     * 配置接入地址，APP_ID APP_SECET
     * @return
     */
    @Bean
    public TapProperties tapProperties(){
        TapProperties props = new TapProperties();
        props.setAppId(appId);
        props.setBaseUrl(url);
        props.setAppSecret(appKey);
        return props;
    }

}
