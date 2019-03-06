package com.cg.payroll.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.bean.Associate;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.services.PayrollServices;

@Controller
public class PayrollServicesController 
{
    @Autowired 
	PayrollServices payrollServices;
    
    @RequestMapping("/registerAssociate")
    public ModelAndView registerAssociate(@ModelAttribute Associate associate)
    {
    	associate = payrollServices.acceptAssociateDetails(associate);
    	return new ModelAndView("registrationSuccessPage","associate",associate);
    }
    @RequestMapping("/associateDetails")
    public ModelAndView getAssociateDetails(@RequestParam int associateId)throws AssociateDetailNotFoundException
    {
    	Associate associate=payrollServices.getAssociateDetails(associateId);
    	return new ModelAndView("findAssociateDetails","associate",associate);
    }
}
