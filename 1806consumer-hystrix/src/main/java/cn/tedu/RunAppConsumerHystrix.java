package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//标识feign
@SpringCloudApplication
@EnableFeignClients			//启动feign客户端
public class RunAppConsumerHystrix {
	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerHystrix.class, args);
	}
}
