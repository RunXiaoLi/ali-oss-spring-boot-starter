package com.reset.project.dormitory.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "oss")
public class OssProperties {

    /**
     * oss对外服务的访问域名
     */
    private String endpoint;

    /**
     * oss的key
     */
    private String accessId;

    /**
     * oss的密钥
     */
    private String accessKey;

    /**
     * oss的bucket名称
     */
    private String bucketName;

    /**
     * oss的host地址
     * 例如：https://reset.oss-cn-beijing.aliyuncs.com
     * bucketName + endpoint
     */
    private String host;
}
