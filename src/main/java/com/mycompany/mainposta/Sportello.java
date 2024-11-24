/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainposta;

/**
 *
 * @author Utente
 */
public class Sportello {
    private ListaClienti listaClienti;
    private final int minTempoServizio=6000;
    private final int maxTempoServizio=12000;
    private int numeroSportello;
    
    public Sportello(ListaClienti listaClienti, int numeroSportello){
        this.listaClienti=listaClienti;
        this.numeroSportello=numeroSportello;
    }
    public void run(){
        try{
            while(!Thread.interrupted()){
                Integer clienteServito = listaClienti.rimuoviCliente();
                System.out.println("Chiamato Cliente Numero \t" + clienteServito+"dallo sportello nuemro" + numeroSportello);
                int tempoServizio = (int) (Math.random() * (maxTempoServizio-minTempoServizio + 1) + minTempoServizio);
                Thread.sleep(tempoServizio);
                System.out.println("Servito Cliente Numero \t"+clienteServito+ clienteServito + "dallo sportello numero" + numeroSportello);
            }
        }catch(InterruptedException e){
             System.out.println("Tread interrotto durante lo sleep");
        }finally{
            System.out.print("Sportelo Chiuso");
        }
    }
}
