package com.example.demo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConcept {

	@Bean
	@Scope(value="singleton")
	public MyBean myBean() {
		return new MyBean();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

ctx.register(ScopeConcept.class);
ctx.refresh();

MyBean mb1 = ctx.getBean(MyBean.class);
System.out.println(mb1.hashCode());

MyBean mb2 = ctx.getBean(MyBean.class);
System.out.println(mb2.hashCode());

ctx.close();

	}

}
