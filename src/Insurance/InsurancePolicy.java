package Insurance;

import java.math.BigDecimal;
import java.security.Policy;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class InsurancePolicy {
    private int policyNumber;
    private String title;
    private String firstName;
    private String surname;
    private double sumInsured;
    private BigDecimal price;
    private boolean active;
    private LocalDateTime startDate = LocalDateTime.now();
    private PolicyType policyType;

    public InsurancePolicy() {
    }

    public InsurancePolicy(int policyNumber, String title, String firstName, String surname, double sumInsured, BigDecimal price, boolean active) {
        this.policyNumber = policyNumber;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.sumInsured = sumInsured;
        this.price = price;
        this.active = active;
        this.policyType = policyType;
    }

    public InsurancePolicy(int policyNumber, String title, String firstName, String surname, double sumInsured, BigDecimal price, boolean active, PolicyType home) {
    }

    public PolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(double sumInsured) {
        this.sumInsured = sumInsured;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMailingName() {
        return title + " " + firstName + " " + surname;
    }

    public String getMailingName(boolean firstInitialOnly){
        if(firstInitialOnly)
            return title + " " + firstName.substring(0,1) + ". " + surname;
        else
            return getMailingName();
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyNumber=" + policyNumber +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", sumInsured=" + sumInsured +
                ", price=" + price +
                ", active=" + active +
                ", startDate=" + startDate +
                ", policyType=" + policyType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsurancePolicy that = (InsurancePolicy) o;
        return policyNumber == that.policyNumber && Double.compare(that.sumInsured, sumInsured) == 0 && active == that.active && Objects.equals(title, that.title) && Objects.equals(firstName, that.firstName) && Objects.equals(surname, that.surname) && Objects.equals(price, that.price) && Objects.equals(startDate, that.startDate) && policyType == that.policyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber, title, firstName, surname, sumInsured, price, active, startDate, policyType);
    }
}


