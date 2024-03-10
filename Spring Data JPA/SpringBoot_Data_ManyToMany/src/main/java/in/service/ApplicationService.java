package in.service;

import in.model.Employees;
import in.model.Projects;
import in.repository.EmployeeRepository;
import in.repository.ProjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class ApplicationService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    ProjectRepository repository1;

    public void insertData() {

        //Creating Project objects
        Projects projects1 = new Projects();
        projects1.setProjectId(101);
        projects1.setProjectName("PR1MA");
        projects1.setProjectManager("Raju");

        Projects projects2 = new Projects();
        projects2.setProjectId(102);
        projects2.setProjectName("MINE-TREE");
        projects2.setProjectManager("Shrekant");

        //Creating Employee data
        List<Employees> employeesList = Arrays.asList(new Employees(203, "Anuj", 4000000, "Remote", List.of(projects2)),
                new Employees(204, "Abhinv", 5500000, "Full-Time", List.of(projects2,projects1)));

        //calling repository method to save all data
        this.repository.saveAll(employeesList);
        System.out.println("All data is save in data base.....");

    }
    @Transactional
    public void gettingAllData(){
        //List<Employees> employeesList = repository.findAll();
        List<Employees> allEmployees = repository.findAll();
        allEmployees.forEach(System.out::println);
        //System.out.println(allEmployees);
        /*List<Projects> all = repository1.findAll();
        System.out.println(all);*/

    }
    //delete data from database
    public void deleteData(){
        this.repository.deleteById(201);
        System.out.println("Data is Deleted.............");
    }

}
