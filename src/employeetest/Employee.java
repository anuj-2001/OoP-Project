/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;
import java.io.*;
/**
 *
 * @author anujp
 */
public class Employee implements Serializable{
    private String name;
    private String surname;
    private int staffNo;
    private Job job;

    public Employee(String name, String surname, int staffNo, Job job) {
        this.name = name;
        this.surname = surname;
        this.staffNo = staffNo;
        this.job = job;
    }

    Employee(String name, String surname, Job job, int staffNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
    
    
}
