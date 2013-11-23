/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.qc.bdeb.c37.travailPratique2.models;
import ca.qc.bdeb.c37.travailPratique2.controllers.Controller;
import java.util.ArrayList;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author paulwillyjean
 */
abstract public class Model {
    private ArrayList<Controller> controllers;
    private PropertyChangeSupport pcs;

    protected Model() {
        this.pcs = new PropertyChangeSupport(this);
        this.controllers = new ArrayList<Controller>();
    }

    public void addController(Controller controller) {
        controllers.add(controller);
    }

    public void removeController(Controller controller) {
        controllers.remove(controller);
    }

    protected void firePropertyChange(String property,
            Object oldValue, Object newValue) {
        pcs.firePropertyChange(property, oldValue, newValue);
    }
}