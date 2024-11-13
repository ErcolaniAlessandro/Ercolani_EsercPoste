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
    private final int minTempoServizio=2000;
    private final int maxTempoServizio=8000;
    public Sportello(ListaClienti listaClienti){
        this.listaClienti=listaClienti;
    }
    public void run(){
        try{
            while(!Thread.interrupted()){
                Integer clienteServito = listaClienti.rimuoviCliente();
                System.out.println("Chiamato Cliente Numero \t" + clienteServito);
                int tempoServizio = (int) (Math.random() * (maxTempoServizio-minTempoServizio + 1) + minTempoServizio);
                Thread.sleep(tempoServizio);
                System.out.println("Servito Cliente Numero \t"+clienteServito);
            }
        }catch(InterruptedException e){
             System.out.println("Tread interrotto durante lo sleep");
        }finally{
            System.out.print("Sportelo Chiuso");
        }
    }
}
