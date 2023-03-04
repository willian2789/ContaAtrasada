
package atraso;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* @author Pichau*/
public class Atraso extends JFrame implements ActionListener{
JLabel lblvalor,lbltaxa,lblatraso,lblresult;
JTextField txtvalor,txttaxa,txtatraso,txtresult;
JButton btncalcular,btnlimpar;
    Atraso()
    {
        setTitle("Calcular o valor de uma prestação em atraso");
        setBounds(150,150,250,250);
        setResizable(true);
        getContentPane().setBackground(new Color(127,255,212));
        getContentPane().setLayout(new GridLayout(5,2));
        lblvalor = new JLabel("Digite o valor");
        lbltaxa = new JLabel("Digite a taxa");
        lblatraso = new JLabel("Digite o tempo em atraso");
        lblresult = new JLabel("prestação");
        
        txtvalor = new JTextField();
        txttaxa = new JTextField();
        txtatraso = new JTextField();
        txtresult = new JTextField();
        
        btncalcular = new JButton("Calcular"); btncalcular.addActionListener(this);
        btnlimpar = new JButton("Limpar"); btnlimpar.addActionListener(this);
        
        getContentPane().add(lblvalor); getContentPane().add(txtvalor);
        getContentPane().add(lbltaxa); getContentPane().add(txttaxa);
        getContentPane().add(lblatraso); getContentPane().add(txtatraso);
        getContentPane().add(lblresult); getContentPane().add(txtresult);
        getContentPane().add(btncalcular); getContentPane().add(btnlimpar);
    
    }  
    public void actionPerformed(ActionEvent e)
    {
    double valor=0, taxa=0, atraso=0, result=0;
    try
    {
        valor = Double.parseDouble(txtvalor.getText());
        taxa = Double.parseDouble(txttaxa.getText());
        atraso = Double.parseDouble(txtatraso.getText());
    }
    catch(NumberFormatException erro)
    {
        txtresult.setText("Digite só Números");
        return;
    }
    if (e.getSource()==btncalcular){
       result = valor + (valor* taxa/100) *atraso;
       txtresult.setText("" + result);
    }
    if(e.getSource()==btnlimpar){
        txtvalor.setText("");
        txttaxa.setText("");
        txtatraso.setText("");
        txtresult.setText("");
    }
    
    }
    public static void main(String[] args) {
     JFrame janela = new Atraso();
     janela.setUndecorated(true);
     janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
     janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janela.setVisible(true);
    }
    
}
