package com.shubhamcodes.tci.services;

import com.shubhamcodes.tci.Utils.CommonUtils;
import com.shubhamcodes.tci.models.Bonus;
import com.shubhamcodes.tci.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BonusCalculatorServiceImpl implements BonusCalculatorService {

    @Autowired
    private EmployeeMapperService employeeMapperService;
    @Override
    public Map<String, List<Employee>> calculate(List<Bonus> bonusList) {
        List<Bonus> filteredBonus = bonusList.stream().
                filter(CommonUtils::isEmpEligibleForBonus).
                collect(Collectors.toList());
        return employeeMapperService.map(filteredBonus);
    }
}
