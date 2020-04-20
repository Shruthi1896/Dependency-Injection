package inject.com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
public static void main(String[] args) {
	ApplicationContext Context=new ClassPathXmlApplicationContext("beans.xml");
	Human man=Context.getBean("sruu",Human.class);
	man.startpumb();
	
} 
}
