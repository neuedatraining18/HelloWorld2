package Insurance;

import java.math.BigDecimal;
import java.security.Policy;
import java.util.Objects;

public class HomeInsurancePolicy extends InsurancePolicy{
    private String address;
    private int roomNum;

    public HomeInsurancePolicy()
    {super();
    super.setPolicyType(PolicyType.HOME);
    }

    public HomeInsurancePolicy(int i, String s, String mary, String lamb, int i1, BigDecimal bigDecimal, boolean b) {
        super.setPolicyType(PolicyType.HOME);
    }

    public HomeInsurancePolicy(int policyNumber, String title, String firstName, String surname, double sumInsured, BigDecimal price, boolean active, String address, int roomNum) {
        super(policyNumber, title, firstName, surname, sumInsured, price, active, PolicyType.HOME);
        this.address = address;
        this.roomNum = roomNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    @Override
    public String toString() {
        return "HomeInsurancePolicy{" +
                "address='" + address + '\'' +
                ", roomNum=" + roomNum +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HomeInsurancePolicy that = (HomeInsurancePolicy) o;
        return roomNum == that.roomNum && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), address, roomNum);
    }
}
