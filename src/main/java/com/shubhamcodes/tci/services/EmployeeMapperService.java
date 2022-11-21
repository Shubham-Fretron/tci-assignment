package com.shubhamcodes.tci.services;

import com.shubhamcodes.tci.models.Bonus;
import com.shubhamcodes.tci.models.Employee;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeMapperService{

    public Map<String, List<Employee>> map(List<Bonus> bonusList) {
        Map<String, List<Bonus>> bonusListByCurrency = bonusList.stream().collect(Collectors.groupingBy(Bonus::getCurrency));
        Map<String, List<Employee>> empListByCurrency = new HashMap<String, List<Employee>>();

        bonusListByCurrency.forEach((key, value) -> empListByCurrency.put(key,
                value.stream().map(
                        bonus -> new Employee(bonus.getEmpName(), bonus.getAmount())
                ).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList())
        ));

        return empListByCurrency;
    }
}
