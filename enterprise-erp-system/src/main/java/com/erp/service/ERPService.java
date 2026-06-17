package com.erp.service;

import com.erp.entity.*;
import com.erp.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ERPService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final AttendanceRepository attendanceRepository;
    private final PayrollRepository payrollRepository;
    private final ProjectRepository projectRepository;

    public ERPService(DepartmentRepository departmentRepository,
                      EmployeeRepository employeeRepository,
                      AttendanceRepository attendanceRepository,
                      PayrollRepository payrollRepository,
                      ProjectRepository projectRepository) {

        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.attendanceRepository = attendanceRepository;
        this.payrollRepository = payrollRepository;
        this.projectRepository = projectRepository;
    }

    public Department addDepartment(Department d){
        return departmentRepository.save(d);
    }

    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }

    public Employee addEmployee(Employee e){
        return employeeRepository.save(e);
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Attendance addAttendance(Attendance a){
        return attendanceRepository.save(a);
    }

    public List<Attendance> getAttendance(){
        return attendanceRepository.findAll();
    }

    public Payroll addPayroll(Payroll p){
        return payrollRepository.save(p);
    }

    public List<Payroll> getPayroll(){
        return payrollRepository.findAll();
    }

    public Project addProject(Project p){
        return projectRepository.save(p);
    }

    public List<Project> getProjects(){
        return projectRepository.findAll();
    }

}