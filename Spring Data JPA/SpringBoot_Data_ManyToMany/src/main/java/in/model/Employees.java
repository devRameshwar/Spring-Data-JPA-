package in.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_relationship")
public class Employees {

    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column
    private String employeeName;
    @Column
    private double salary;
    @Column
    private String employeeType;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    /*@JoinTable(name = "employee_project_join", joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))*/
    private List<Projects> projects;

}
