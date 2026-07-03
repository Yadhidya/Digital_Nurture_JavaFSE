package org.yadhidya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingParameterizedExample {

    private static final Logger logger= LoggerFactory.getLogger(LoggingParameterizedExample.class);

    public static void main(String[] args) {
        String employee="Yadhi";
        int employeeId=101;
        double salary=6500.20;
        logger.info("Employee name:{}",employee);
        logger.info("Employee ID: {}",employeeId);
        logger.info("Employee Salary:{}",salary);
        logger.info("Emplyee {} with id {} earns {}",employee,employeeId,salary);
        logger.warn("Employee {} salary ",employee);
        logger.error("Unable to process {}",employeeId);

    }
}
