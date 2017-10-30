package quan.java.hibernate.pojo;

/**
 * Created by liuquan on 2017/7/13.
 */
public class IdCard {

    private int idCardNo;
    private Person person;
    private String idName;

    public int getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(int idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Person getPerson() {return person; }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdCard idCard = (IdCard) o;

        if (idCardNo != idCard.idCardNo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idCardNo;
    }
}
