package com.shubhamcodes.tci.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shubhamcodes.tci.models.Bonus;
import com.shubhamcodes.tci.models.Employee;
import com.shubhamcodes.tci.services.BonusCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tci")
public class TciResource {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private BonusCalculatorService bonusCalculatorService;

    @PostMapping("/bonus/eligibility")
    public Map<String, List<Employee>> getEligibleEmployeeForBonus(String request) throws IOException {
         List<Bonus> bonusList = Arrays.asList(mapper.readValue(request, Bonus[].class));
         //validate request
        return bonusCalculatorService.calculate(bonusList);
    }
}
