import Insurance.InvalidEntryException;
import Insurance.MotorInsurancePolicy;
import Insurance.HomeInsurancePolicy;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class InsurancePolicyUI {

    public static void main(String[] args) throws InvalidEntryException {
        Scanner scanner = new Scanner(System.in);
        String type = "";
//        while (!type.equals("M") || !type.equals("H")) {
//            System.out.println("What type of policy do you want? (M)otor or (H)ome?");
//            type = scanner.nextLine().toUpperCase();
//        }
//        System.out.println(type);

        do {
            System.out.println("What type of policy do you want? (M)otor or (H)ome?");
            type = scanner.nextLine().toUpperCase();
        } while (!type.equals("M") && !type.equals("H"));
        System.out.println(type);

        try {
            if (type.equals("M")) {
                MotorInsurancePolicy policy = new MotorInsurancePolicy();
                System.out.println("Enter the policy number:");
                policy.setPolicyNumber(Integer.parseInt(scanner.nextLine()));
                //continue setting values
                System.out.println("Enter the sum insured");
                policy.setSumInsured(Double.parseDouble(scanner.nextLine()));
                System.out.println("Enter the price");
                policy.setPrice(new BigDecimal(scanner.nextLine()));
                policy.setActive(true);
                System.out.println(policy.toString());
            } else {
                HomeInsurancePolicy policy = new HomeInsurancePolicy();
                System.out.println("Enter the policy number:");
                policy.setPolicyNumber(Integer.parseInt(scanner.nextLine()));
                //continue setting values
                System.out.println("Enter the sum insured");
                policy.setSumInsured(Double.parseDouble(scanner.nextLine()));
                System.out.println("Enter the price");
                policy.setPrice(new BigDecimal(scanner.nextLine()));
                policy.setActive(true);
                System.out.println(policy.toString());
            }

        } catch (Exception e) {
            throw new InvalidEntryException();
        }
    }
}
