package quan.java.hibernate.pojo;

import javax.persistence.*;

/**
 * Created by liuquan on 2017/11/4.
 */
@Entity
@Table(name="degree")
public class Degree {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id = 2;

    @Column(name="degreeName")
    private String degreeName;

    @Column(name="passingYear")
    private int passingYear;

    public Degree() {
    }

    public Degree(String degreeName, int passingYear) {
        this.degreeName = degreeName;
        this.passingYear = passingYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(int passingYear) {
        this.passingYear = passingYear;
    }

    @Override
    public String toString() {
        return "Degree{" +
                "id=" + id +
                ", degreeName='" + degreeName + '\'' +
                ", passingYear=" + passingYear +
                '}';
    }
}
