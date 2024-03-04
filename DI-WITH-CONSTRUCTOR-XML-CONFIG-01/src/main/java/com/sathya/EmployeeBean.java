package com.sathya;

public class EmployeeBean 
{
	private int empId;
	private String empName;
	private AddressBean  addr;
	public EmployeeBean() 
	{
		super();
	}
	public EmployeeBean(int empId, String empName, AddressBean addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}
	public void printEmployee()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println(addr);
	}

}
