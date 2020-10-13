package com.yuan.mystudy.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mystudy
 * @description: 读取配置文件
 * @author: yuanmenghuai
 * @create: 2020-10-13 15:23
 **/
@RestController
@RefreshScope
public class ConfigClientController {

	private static final Logger logger = LoggerFactory.getLogger(ConfigClientController.class);

	@Value("${config.info}")    // 注入配置中心中的config.info配置信息
	private String configInfo;

	@GetMapping("/config/info")
	public String getConfigInfo() {
		return configInfo;
	}


}
