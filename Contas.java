package Trabalho1;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henri
 */
public class Contas{
    private String nome;
    private int numero;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor){
            this.setSaldo(this.getSaldo()+valor);
            JOptionPane.showMessageDialog(null,"Depósito efetuado com sucesso! Seu saldo é: "+this.saldo+" R$");
        }
    public void sacar(double valor){
        int aux1;
        aux1 = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja realizar essa operação ?");
        if(aux1==0){
            if(valor<=saldo){
            this.setSaldo(this.getSaldo()-valor);
            JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso \n Seu novo valor de saldo é " + saldo+" R$");
            }
            else{
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                }
              } 
            }
    public void transferir(double valor,int um, int dois){
            this.setSaldo(this.getSaldo() - valor );
        }
   public void tipoConta(){
        System.out.println("Tipo de conta: comum");
    }
}