/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author barua
 */
public class WorkQueue {
   
    ArrayList<WorkRequest> workqueue;

    public WorkQueue() {
        workqueue = new ArrayList<>();
    }

        
    public ArrayList<WorkRequest> getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(ArrayList<WorkRequest> workqueue) {
        this.workqueue = workqueue;
    }
    
}
