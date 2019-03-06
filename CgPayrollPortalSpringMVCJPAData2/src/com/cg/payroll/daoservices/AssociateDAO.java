package com.cg.payroll.daoservices;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.payroll.bean.Associate;

public interface AssociateDAO extends JpaRepository<Associate, Integer>
{
	
}
