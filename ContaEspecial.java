/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author henri
 */
public class ContaEspecial extends Contas{
    private int limite;
    private double multa;

    public double getMulta() {
        return multa;
    }
    public void setMulta(double multa) {
        this.multa = multa;
    }
    public int getLimite() {
        return limite;
    }
    public void setLimite(int limite) {
        this.limite = limite;
    }
    public void descontar(double valor, double multa){
        if(valor>this.getSaldo()){
            if(limite+this.getSaldo()>=valor){
                double x=0;
                x = this.getSaldo() - valor;
                x = x + (x*multa/100);
                int aux1 = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja realizar essa operação ?");
                if(aux1==0){
                    this.setSaldo(x);
                    JOptionPane.showMessageDialog(null,"Saque efetuado usando o limite! \n Seu novo valor de saldo é:  " +this.getSaldo()+" R$");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Seu limite não cobre o valor!","ALERTA",0);
            }
        }
        else{
            this.sacar(valor);
        }}
    public void tipoConta(){
        JOptionPane.showMessageDialog(null,"Tipo de conta: especial");
    }}
