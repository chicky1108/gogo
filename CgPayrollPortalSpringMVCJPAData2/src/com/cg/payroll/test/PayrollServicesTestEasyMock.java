package com.cg.payroll.test;

import java.util.ArrayList;
import java.util.List;

//import org.easymock.EasyMock;
//import org.junit.Before;
//import org.junit.BeforeClass;

import com.cg.payroll.bean.Associate;
import com.cg.payroll.bean.BankDetails;
import com.cg.payroll.bean.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class PayrollServicesTestEasyMock 
{
   /* private static PayrollServices payrollServices;
    private static AssociateDAO mockAssociateDao;
    
    @BeforeClass
    public static void setUpTestEnv()
    {
    	mockAssociateDao = EasyMock.mock(AssociateDAO.class);
    	payrollServices = new PayrollServicesImpl(mockAssociateDao);
			
    }
    @Before
    public void setUpTestMockData()
    {
    	Associate associate1 = new Associate(101,78000,"Ankita","Dutta","Analyst","Fresher","ABCD308","ankdutta04@gmail.com",
    			new Salary(380000,1800,1800),new BankDetails(12345,"CITI","54637"));
    	Associate associate2 = new Associate(102,78000,"Subodra","Banik","Analyst","Fresher","ABCD308","sub@gmail.com",
    			new Salary(400000,1800,1800),new BankDetails(12345,"CITI","54637"));
    	Associate associate3 = new Associate(63772, "Soniya", "Rajak", "YTP", "Analyst","AFHS6473","Aabc@gmail.com", 
    			new Salary(500000,40000,1200), new BankDetails(54738, "HDFC", "64738"));
    	
    	ArrayList<Associate> associatesList = new ArrayList<>();
    	associatesList.add(associate1);
    	associatesList.add(associate2);
    	
    	EasyMock.expect(mockAssociateDao.save(associate3)).andReturn(associate3);
    	
    	EasyMock.expect(mockAssociateDao.findOne(101)).andReturn(associate1);
    	EasyMock.expect(mockAssociateDao.findOne(102)).andReturn(associate2);
    	EasyMock.expect(mockAssociateDao.findOne(1234)).andReturn(null);
    	EasyMock.expect(mockAssociateDao.findAll()).andReturn(associatesList);
    	EasyMock.replay(mockAssociateDao);
    }*/
}