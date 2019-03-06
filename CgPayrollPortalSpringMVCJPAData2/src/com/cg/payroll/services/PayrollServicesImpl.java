package com.cg.payroll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.payroll.bean.Associate;
import com.cg.payroll.bean.BankDetails;
import com.cg.payroll.bean.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

@Component("payrollServices")
public class PayrollServicesImpl implements PayrollServices
{
	@Autowired
     private AssociateDAO associateDAO;
    @Override
	public Associate acceptAssociateDetails(Associate associate) 
	{
    	associate = associateDAO.save(associate);
		return associate;
		
	}

	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailNotFoundException {
		Associate associate = getAssociateDetails(associateId);
		int netSalary;
		if(associate == null)
			throw new AssociateDetailNotFoundException("Associate Details Not Found for Id " + associateId);
		int basicSalary = associate.salary.getBasicSalary();
		int hra =((associate.salary.getBasicSalary()*30)/100); 
		int conveyenceSalary = (associate.salary.getBasicSalary()*30/100);
		int otherAllowance = (associate.salary.getBasicSalary()*25/100);
		int personalAllowance = (associate.salary.getBasicSalary()*20/100);
		int monthlyGrossSalary = basicSalary + hra + conveyenceSalary + otherAllowance + personalAllowance + associate.salary.getCompanyPf()
		+ associate.salary.getEpf();
		int annualGrossSalary = monthlyGrossSalary * 12;
		int investment = associate.getYearlyInvestmentUnder80C()+associate.salary.getCompanyPf()+associate.salary.getEpf();
		if(investment >= 1500000)
			investment = 1500000;
		if(annualGrossSalary < 250000)
			netSalary = annualGrossSalary - associate.salary.getEpf() - associate.salary.getCompanyPf();
		else if(annualGrossSalary >= 250000 && annualGrossSalary < 500000)
			netSalary = (int) (annualGrossSalary -((annualGrossSalary-investment)*0.1) - associate.salary.getEpf() - associate.salary.getCompanyPf());
		else if(annualGrossSalary >= 500000 && annualGrossSalary < 1000000)
		{
			int t2 = (int)((annualGrossSalary - 500000)*0.2);
			int t1 = (int)((250000 - investment) *0.1);
			netSalary = annualGrossSalary - t1 - t2 - associate.salary.getCompanyPf() - associate.salary.getEpf();
		}
		else 
		{
			int t3 = (int)((annualGrossSalary - 1000000) *0.3);
			int t2 = 1000000;
			int t1 = (int)((250000 - investment) *0.1);
			netSalary = annualGrossSalary - t1 - t2 -t3- associate.salary.getCompanyPf() - associate.salary.getEpf();
		}
		associate.salary.setGrossSalary(annualGrossSalary);
		associate.salary.setHra(hra);
		associate.salary.setConveyenceAllowance(conveyenceSalary);
		associate.salary.setOtherAllowance(otherAllowance);
		associate.salary.setPersonalAllowance(personalAllowance);
		associate.salary.setMonthlyTax(5000);
		associate.getSalary().setNetSalary(netSalary);
		associateDAO.save(associate);
		return associate.getSalary().setNetSalary(netSalary);
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException {
		return associateDAO.findById(associateId).orElseThrow(()-> new AssociateDetailNotFoundException("Associate Id Not Found!"));
	}

	@Override
	public List<Associate> getAllAssociateDetails() {
		return associateDAO.findAll();
	}
     
	
	public int updateDetails(int associateId,int basicSalary,int epf,int companyPf) throws AssociateDetailNotFoundException
	{
		int beforeNetSalary = calculateNetSalary(associateId);
		int afterNetSalary;
		Associate associate = getAssociateDetails(associateId);
		associate.salary.setBasicSalary(basicSalary);
		associate.salary.setCompanyPf(companyPf);
		associate.salary.setEpf(epf);
		int hra =((associate.salary.getBasicSalary()*30)/100); 
		int conveyenceSalary = (associate.salary.getBasicSalary()*30/100);
		int otherAllowance = (associate.salary.getBasicSalary()*25/100);
		int personalAllowance = (associate.salary.getBasicSalary()*20/100);
		int monthlyGrossSalary = basicSalary + hra + conveyenceSalary + otherAllowance + personalAllowance + associate.salary.getCompanyPf()
		+ associate.salary.getEpf();
		int annualGrossSalary = monthlyGrossSalary * 12;
		int investment = associate.getYearlyInvestmentUnder80C()+associate.salary.getCompanyPf()+associate.salary.getEpf();
		if(investment >= 1500000)
			investment = 1500000;
		if(annualGrossSalary < 250000)
			afterNetSalary = annualGrossSalary - associate.salary.getEpf() - associate.salary.getCompanyPf();
		else if(annualGrossSalary >= 250000 && annualGrossSalary < 500000)
			afterNetSalary = (int) (annualGrossSalary -((annualGrossSalary-investment)*0.1) - associate.salary.getEpf() - associate.salary.getCompanyPf());
		else if(annualGrossSalary >= 500000 && annualGrossSalary < 1000000)
		{
			int t2 = (int)((annualGrossSalary - 500000)*0.2);
			int t1 = (int)((250000 - investment) *0.1);
			afterNetSalary = annualGrossSalary - t1 - t2 - associate.salary.getCompanyPf() - associate.salary.getEpf();
		}
		else 
		{
			int t3 = (int)((annualGrossSalary - 1000000) *0.3);
			int t2 = 1000000;
			int t1 = (int)((250000 - investment) *0.1);
			afterNetSalary = annualGrossSalary - t1 - t2 -t3- associate.salary.getCompanyPf() - associate.salary.getEpf();
		}
		int updatedSalary = associate.salary.setNetSalary(afterNetSalary);
		associateDAO.save(associate);
		return updatedSalary;
	}
}
