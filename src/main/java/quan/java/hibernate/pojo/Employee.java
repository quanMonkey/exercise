package quan.java.hibernate.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * Created by liuquan on 2017/11/4.
 */
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Degree> degrees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Degree> getDegrees() {
        return degrees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", degrees=" + degrees +
                '}';
    }

    public void setDegrees(List<Degree> degrees) {
        this.degrees = degrees;
    }
}
