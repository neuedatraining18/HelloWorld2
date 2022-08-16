import Insurance.*;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class TestingInsurancePolicy {
    public static void main(String[] args) throws InvalidEntryException {
        HomeInsurancePolicy homePolicy1 = new HomeInsurancePolicy(1, "Mrs.", "Mary", "Lamb", 100, new BigDecimal("21.1"), true);
        //System.out.println(homePolicy1.getMailingName(true));
        InsurancePolicy[] policies = new InsurancePolicy[6];
        policies[0] = homePolicy1;
        policies[1] = new MotorInsurancePolicy(17,"Mr","Simon","Smith",0, BigDecimal.ONE,false, "Toyota", "Blue", 2015);
        policies[2] = new MotorInsurancePolicy(17,"Mr","Matt","Smith",0, new BigDecimal("17.28"),false);
        policies[3] = new HomeInsurancePolicy(17,"Mrs","Sarah","Mith",0, new BigDecimal("300.6"),false);
        policies[4] = new MotorInsurancePolicy(17,"Ms","Aria","Smith",0,new BigDecimal("55.4"),true);
        policies[5] = new HomeInsurancePolicy(17,"Mr","David","Smith",0,new BigDecimal("26.90"),true);




        System.out.println("Enter a Policy Type (Motor, Home):");
        Scanner scanner = new Scanner(System.in);
        PolicyType policyType = PolicyType.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        System.out.println(policyType);
        System.out.println("Enter Policy Number:");
        Integer policyNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter sum insured:");
        int sumInsured = 0;
        try {
            sumInsured = Integer.parseInt(scanner.nextLine());
        }
        catch(NumberFormatException e)
        {
            throw new InvalidEntryException();
        }
        System.out.println("Enter Policy Number:");
        String priceInput = scanner.nextLine();
        BigDecimal price = new BigDecimal(priceInput);
        System.out.println("Is this active(true, false):");
        Boolean active = Boolean.valueOf(scanner.nextLine());

        if(policyType.equals(PolicyType.HOME)){
            HomeInsurancePolicy policy = new HomeInsurancePolicy(policyNum, title, firstName, lastName, sumInsured, price, active);
            System.out.println(policy.toString());
        }
        else{
            MotorInsurancePolicy policy = new MotorInsurancePolicy(policyNum, title, firstName, lastName, sumInsured, price, active);
            System.out.println(policy.toString());
        }
    }
}
