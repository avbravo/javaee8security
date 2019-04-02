/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.javaee8security.controller;

import java.io.Serializable;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author avbravo
 */
@Named
@RequestScoped
@DeclareRoles({ "USER","ADMIN"})
public class UserController implements Serializable{
    @RolesAllowed("ADMIN")
    public String saludo(){
        System.out.println("Hola mundo");
        return "";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
