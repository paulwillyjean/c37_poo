/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.qc.bdeb.c37.travailPratique2.controllers;

import ca.qc.bdeb.c37.travailPratique2.models.ModelVaisseau;
import ca.qc.bdeb.c37.travailPratique2.views.Cosmos;

/**
 *
 * @author paulwillyjean
 */
public class ControllerCosmos extends Controller {

    public static final String VAISSEAU_ICON = "IconeVaisseau";

    public ControllerCosmos() {
        init();
    }

    private synchronized void init() {
        this.addView(new Cosmos(this));
        this.addModel(new ModelVaisseau());
    }

    /**
     * Change la position du vaisseau selon les coordonées fournies
     * @param vaisseauPoint
     */
    public synchronized void changetVaisseauPosition(java.awt.Point vaisseauPoint) {

    }
}