/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Miguel
 */
@WebService(serviceName = "calc")
@Stateless()
public class calc {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sum")
    public int sum(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        return n1+n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "rest")
    public int rest(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        return n1-n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mult")
    public int mult(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        return n1*n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        if(n2!=0) return n1/n2;
        return -1;
    }

}
