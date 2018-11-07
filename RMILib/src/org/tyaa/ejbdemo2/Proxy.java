/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.ejbdemo2;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.tyaa.ejbdemo2.session.RmiSessionBeanRemote;

/**
 *
 * @author student
 */
public class Proxy {
    
    public RmiSessionBeanRemote remoteServiceRemote;
    
    public Proxy() throws NamingException{
    
        InitialContext initialContext = new InitialContext();
        remoteServiceRemote
            = (RmiSessionBeanRemote) initialContext.lookup("remote_service");
    }
}
