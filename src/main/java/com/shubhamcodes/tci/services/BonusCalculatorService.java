package com.shubhamcodes.tci.services;

import com.shubhamcodes.tci.models.Bonus;
import com.shubhamcodes.tci.models.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BonusCalculatorService{

    public abstract Map<String, List<Employee>> calculate(List<Bonus> bonusList);

}

