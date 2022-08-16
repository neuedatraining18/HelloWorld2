package Insurance;

import java.math.BigDecimal;
import java.util.Objects;

public class MotorInsurancePolicy extends InsurancePolicy {
    private String carType;
    private String carColor;

    public MotorInsurancePolicy() {
        super();
        super.setPolicyType(PolicyType.MOTOR);
    }

    public MotorInsurancePolicy(int policyNumber, String title, String firstName, String surname, double sumInsured, BigDecimal price, boolean active, String carType, String carColor, int yearOfRegistration) {
        super(policyNumber, title, firstName, surname, sumInsured, price, active, PolicyType.MOTOR);
        this.carType = carType;
        this.carColor = carColor;
        this.yearOfRegistration = yearOfRegistration;
    }

    public MotorInsurancePolicy(int policyNumber, String title, String firstName, String surname, double sumInsured, BigDecimal price, boolean active) {
        super(policyNumber, title, firstName, surname, sumInsured, price, active,PolicyType.MOTOR);
    }
    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    private int yearOfRegistration;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String getMailingName() {
        return "Motor " + super.getMailingName();
    }

    @Override
    public String toString() {
        return "MotorInsurancePolicy{" +
                "carType='" + carType + '\'' +
                ", carColor='" + carColor + '\'' +
                ", yearOfRegistration=" + yearOfRegistration +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MotorInsurancePolicy that = (MotorInsurancePolicy) o;
        return yearOfRegistration == that.yearOfRegistration && Objects.equals(carType, that.carType) && Objects.equals(carColor, that.carColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carType, carColor, yearOfRegistration);
    }
}
