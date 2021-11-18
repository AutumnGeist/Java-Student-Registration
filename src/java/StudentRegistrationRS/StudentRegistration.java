/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistrationRS;

import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author marilyn
 */
@Path("StudReg")
public class StudentRegistration {
    
    private static ArrayList<Student> students = new ArrayList();
    private static ArrayList<Student> studentXML = new ArrayList();
    private static ArrayList<Student> studentJSON = new ArrayList();
    
    //greeting to test for successful deployment
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("greeting")
    public String getXml() {
        //TODO return proper representation object
        return "Greeting Test Successful!";
    }
    
    //Registers XML Student object
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("addStudXML")
    public String registerStudentXML(Student stud) {
        System.out.println(" Received Student = " + stud);
        studentXML.add(stud);
        if(studentXML.size() > 0)
            return "Success!";
        else
            return "Failure!";
    }
    
    @GET
    @Path("getStudXML")
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Student> getStudentXML() {
        System.out.println(" XML Student List Size = " + studentXML.size());
        return studentXML;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("addStudJSON")
    public String registerStudentJSON(Student stud) {
        System.out.println(" Received Student = " + stud);       
        studentJSON.add(stud);
        if(studentJSON.size() > 0)
            return "Success!";
        else
            return "Failure!";
    }
    
    @GET
    @Path("getStudJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public Students getStudentJSON() {
        System.out.println(" JSON Student List Size = " + studentJSON.size());
        return new Students(studentJSON);
    }
    
}
