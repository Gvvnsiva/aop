package org.dxc.aop.config;

import org.dxc.aop.model.Employee;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"org.dxc.aop"})
@EnableAspectJAutoProxy

public class SpringConfig {
	public Employee getEmpl() {
		
		Employee employee=new Employee();
		employee.setEname("siva");
		System.out.println(employee.getEname());
		
		
		
		return employee;
		
	}
}
