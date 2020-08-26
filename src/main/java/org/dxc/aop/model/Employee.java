package org.dxc.aop.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
private String ename;

public String getEname() {
	return ename;
}
@Value("siva")
public void setEname(String ename) {
	this.ename = ename;
}
}
