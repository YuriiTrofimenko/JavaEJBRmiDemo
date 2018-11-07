/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.ejbdemo2.session;

import java.util.List;
import javax.ejb.Remote;
import org.tyaa.ejbdemo2.entities.Student;

/**
 *
 * @author student
 */
@Remote
public interface RmiSessionBeanRemote {

    List<Student> getAllStudents();
}
