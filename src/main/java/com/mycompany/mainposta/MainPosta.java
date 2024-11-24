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
        ArrayList<Thread> sportelloThreadList = new ArrayList<Thread>();
        arriviThread.start();
        for (int i=0; i<NumeroSprotelli; i++){
           Thread sporttelloThread = new Thread(new Sportello(ListaClienti, i+1));
            sportelloThreadList.add(sportelloThread);
            sportelloThread.start();
        }
    }
}
