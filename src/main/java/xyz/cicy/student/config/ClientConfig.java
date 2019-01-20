package xyz.cicy.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import xyz.cicy.student.StudentService;
import xyz.cicy.student.StudentServiceBean;

@Configuration
public class ClientConfig
{
	@Bean
	HessianProxyFactoryBean hessianProxy()
	{
		HessianProxyFactoryBean hessianProxy = new HessianProxyFactoryBean();
		hessianProxy.setServiceInterface(StudentService.class);
		hessianProxy.setServiceUrl("http://localhost:8080/StudentService");

		return hessianProxy;
	}

	/*@Bean
	HttpInvokerProxyFactoryBean hessianProxy()
	{
        HttpInvokerProxyFactoryBean hessianProxy=new HttpInvokerProxyFactoryBean();
		hessianProxy.setServiceInterface(StudentService.class);
		hessianProxy.setServiceUrl("http://localhost:8080/StudentService");

		return hessianProxy;
	}*/

	@Bean
	public StudentServiceBean studentServiceBean()
	{
		return new StudentServiceBean();
	}
}
