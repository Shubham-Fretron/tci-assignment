package com.shubhamcodes.tci.Utils;

import com.shubhamcodes.tci.models.Bonus;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class CommonUtils {

    public static Long toEpochTime(String date, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setTimeZone(TimeZone.getTimeZone("IST"));
            long time = sdf.parse(date).getTime();
            if (time > 0) {
                return time;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Unable to parse date $this pattern $pattern");
        }
        return null;
    }

    public static boolean isEmpEligibleForBonus(Bonus bonus) {
        long joiningDate = CommonUtils.toEpochTime(bonus.getJoiningDate(), "mm-dd-yyyy");
        long currentTime = System.currentTimeMillis();
        if (bonus.getExitDate() != null) {
            long exitDate = CommonUtils.toEpochTime(bonus.getExitDate(), "mm-dd-yyyy");
            return exitDate > currentTime && joiningDate < currentTime;
        } else {
            return joiningDate < currentTime;
        }
    }

}
