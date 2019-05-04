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
public class ContaPoupanca extends Contas{
    double taxa;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    public void reajustar(double taxa){
        this.setSaldo(this.getSaldo() + (this.getSaldo() * taxa / 100)); 
        JOptionPane.showMessageDialog(null,"Reajuste efetuado com sucesso!" ,"REAJUSTE",1);
    }
    public void Reajustar(){
        double reajuste = this.getSaldo() * 0.1;
        this.setSaldo(this.getSaldo()+reajuste);
        JOptionPane.showMessageDialog(null,"Reajuste efetuado com sucesso!" ,"REAJUSTE",1);
    }
    public void tipoConta(){
        JOptionPane.showMessageDialog(null,"Tipo de conta: poupança");
    }
}
