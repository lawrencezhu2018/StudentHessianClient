package xyz.cicy.student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.cicy.student.config.ClientConfig;

public class Main
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);
		StudentServiceBean bean = context.getBean(StudentServiceBean.class);
		System.out.println(bean.findScore("cc"));
	}
}
