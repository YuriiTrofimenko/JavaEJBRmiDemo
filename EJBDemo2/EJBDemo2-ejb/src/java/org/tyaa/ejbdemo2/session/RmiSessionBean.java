/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.ejbdemo2.session;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.tyaa.ejbdemo2.entities.Student;

/**
 *
 * @author student
 */
@Stateless(name = "RemoteService")
public class RmiSessionBean implements RmiSessionBeanRemote {

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "firstName", "lastName", 25));
        students.add(new Student(2, "firstName2", "lastName2", 35));
        return students;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
