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
@Table(name = "employee_project")
public class Projects {

    @Id
    @Column(name = "project_id")
    private Integer projectId;
    @Column
    private String projectName;
    @Column
    private String projectManager;

    @ManyToMany(mappedBy = "projects")
    private List<Employees> employees;




}
