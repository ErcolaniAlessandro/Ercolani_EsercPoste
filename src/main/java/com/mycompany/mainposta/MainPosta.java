/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainposta;

/**
 *
 * @author Utente
 */
public class MainPosta {

    public static void main(String[] args) {
        ListaClienti listaClienti = new ListaClienti();
        Thread arriviThread = new Thread(new Arrivi(listaClienti));
        Thread sporttelloThread = new Thread(new Sportello(ListaClienti));
        arriviThread.start();
        sportelloThread.start();
    }
}
