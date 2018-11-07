/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.rmiconsoleclient;

import javax.naming.NamingException;
import org.tyaa.ejbdemo2.Proxy;
import org.tyaa.ejbdemo2.entities.Student;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        Proxy proxy = new Proxy();
        
        for (Student student : proxy.remoteServiceRemote.getAllStudents()) {
            System.out.println(student.getFirstName());
        }
    }
    
}
