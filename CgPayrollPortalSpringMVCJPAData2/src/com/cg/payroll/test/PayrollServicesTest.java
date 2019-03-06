package com.cg.payroll.test;

//import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;

import com.cg.payroll.bean.Associate;
import com.cg.payroll.bean.BankDetails;
import com.cg.payroll.bean.Salary;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;


//import junit.framework.Assert;

public class PayrollServicesTest 
{

	/*
	 * private static PayrollServices services;
	 * 
	 * @BeforeClass public static void setUpTestEnv() { services = new
	 * PayrollServicesImpl(); }
	 * 
	 * @Before public void setUpTestData() { Associate associate1 = new
	 * Associate(101,78000,"Ankita","Dutta","Analyst","Fresher","ABCD308",
	 * "ankdutta04@gmail.com", new Salary(380000,1800,1800),new
	 * BankDetails(12345,"CITI","54637")); Associate associate2 = new
	 * Associate(102,78000,"Subodra","Banik","Analyst","Fresher","ABCD308",
	 * "sub@gmail.com", new Salary(400000,1800,1800),new
	 * BankDetails(12345,"CITI","54637"));
	 * 
	 * PayrollDBUtil.associates.put(associate1.getAssociateId(), associate1);
	 * PayrollDBUtil.associates.put(associate2.getAssociateId(), associate2);
	 * 
	 * PayrollDBUtil.ASSOCIATE_ID_COUNTER = 102;
	 * 
	 * }
	 * 
	 * @Test(expected = AssociateDetailNotFoundException.class) public void
	 * testGetAssociateDetailsForInvalidAssociateId() throws
	 * AssociateDetailNotFoundException { services.getAssociateDetails(1234); }
	 * 
	 * @Test public void testGetAssociateDetailsValidAssociateId() throws
	 * AssociateDetailNotFoundException { Associate expectedAssociate = new
	 * Associate(102,78000,"Subodra","Banik","Analyst","Fresher","ABCD308",
	 * "sub@gmail.com", new Salary(400000,1800,1800),new
	 * BankDetails(12345,"CITI","54637")); Associate actualAssociate =
	 * services.getAssociateDetails(102);
	 * Assert.assertEquals(expectedAssociate,actualAssociate); }
	 * 
	 * @Test public void testAcceptAssociateDetailsForValidData() throws
	 * AssociateDetailNotFoundException { int expectedId = 103; int actualId =
	 * services.acceptAssociateDetails("Vansh", "Gupta", "vanshtw@gmail.com",
	 * "Microsoft", "SoftwareEngineer", "ABCF2298", 120000, 500000, 12000, 10000,
	 * 532891,"CITI", "63728"); Assert.assertEquals(expectedId,actualId); }
	 * 
	 * @Test(expected = AssociateDetailNotFoundException.class) public void
	 * testCalculateNetSalaryForInvalidAssociateId() throws
	 * AssociateDetailNotFoundException { services.calculateNetSalary(1324); }
	 * 
	 * @Test public void testCalculateNetSalaryForValidAssociateId() throws
	 * AssociateDetailNotFoundException { double expectedNetSalary = 8172381; double
	 * actualNetSalary = services.calculateNetSalary(101);
	 * assertEquals(expectedNetSalary, actualNetSalary); }
	 * 
	 * @Test public void testGetAllAssociatesDetails() { Associate associate1 = new
	 * Associate(101,78000,"Ankita","Dutta","Analyst","Fresher","ABCD308",
	 * "ankdutta04@gmail.com", new Salary(380000,1800,1800),new
	 * BankDetails(12345,"CITI","54637")); Associate associate2 = new
	 * Associate(102,78000,"Subodra","Banik","Analyst","Fresher","ABCD308",
	 * "sub@gmail.com", new Salary(400000,1800,1800),new
	 * BankDetails(12345,"CITI","54637"));
	 * 
	 * ArrayList<Associate> expectedAssociateList = new ArrayList<>();
	 * expectedAssociateList.add(associate1); expectedAssociateList.add(associate2);
	 * ArrayList<Associate> actualAssociateList =
	 * (ArrayList<Associate>)services.getAllAssociateDetails();
	 * Collections.sort(expectedAssociateList);
	 * Collections.sort(actualAssociateList);
	 * Assert.assertEquals(expectedAssociateList, actualAssociateList);
	 * 
	 * }
	 * 
	 * @After public void tearDownTestData() { PayrollDBUtil.associates.clear();
	 * PayrollDBUtil.ASSOCIATE_ID_COUNTER=100; }
	 * 
	 * @AfterClass public static void tearDownTestEnv() { services = null; }
	 */
}
