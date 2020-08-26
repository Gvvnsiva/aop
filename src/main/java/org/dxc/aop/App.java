package org.dxc.aop;

import org.dxc.aop.config.SpringConfig;
import org.dxc.aop.model.Employee;
import org.dxc.aop.service.CustomerService;
import org.dxc.aop.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
        @SuppressWarnings("resource")
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class); 
        // 2. get the objects from the container 
        Employee e=applicationContext.getBean(Employee.class);
        EmployeeService employeeService=(EmployeeService)applicationContext.getBean("employeeService"); 
        CustomerService customerService=(CustomerService)applicationContext.getBean("customerService"); 
         //Employee employee=new Employee();
        // System.out.println(employee.getEname());
        employeeService.registerEmployee(); 
        customerService.registerCustomer(); 
        System.out.println(e.getEname());
     
    }
}
