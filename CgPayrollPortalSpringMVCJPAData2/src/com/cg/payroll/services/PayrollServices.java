package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.bean.Associate;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

public interface PayrollServices 
{
     Associate acceptAssociateDetails(Associate associate);
     
     int calculateNetSalary(int associateId)throws AssociateDetailNotFoundException;
     
     Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException;
     List<Associate> getAllAssociateDetails();
}
