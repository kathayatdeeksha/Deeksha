package demoproject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainStudent {
public static void main(String[] args) {
	Resource res=new ClassPathResource("bean.xml");
	BeanFactory factory=new XmlBeanFactory(res);
	Student stu=(Student)factory.getBean("mybean");
	System.out.println(stu.getStudentname());
	
}
}
	