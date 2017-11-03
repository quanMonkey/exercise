package quan.java.hibernate.pojo;

/**
 * Created by liuquan on 2017/7/13.
 */
public class Person {

    private int personId;
    private String personName;
    private IdCard idCard;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (personId != person.personId) return false;
        if (personName != null ? !personName.equals(person.personName) : person.personName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        return result;
    }
}
