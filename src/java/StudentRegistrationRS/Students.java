/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistrationRS;

import java.util.ArrayList;

/**
 *
 * @author marilyn
 */
public class Students {
    private ArrayList<Student> students = new ArrayList();

    public Students() {
    }

    public Students(ArrayList<Student> students) {
        this.students = students;
    }
    public ArrayList<Student> getCustomers() {
        return students;
    }

    public void setCustomers(ArrayList<Student> students) {
        this.students = students;
    }
}
