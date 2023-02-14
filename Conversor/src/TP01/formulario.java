package TP01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;

public class formulario extends JFrame implements ActionListener{
			JLabel eti1,eti2,eti3,eti4,eti5;
			JTextField txtcantidad,txtcantidad2;
			JButton boton1;
			JPanel panel;
			JComboBox JComboBox1,JComboBox2;			
			
			formulario(){					
			eti1 = new JLabel("INGRESE CAMBIO ");
			
			eti1.setBounds(180, 30, 200, 20);			
			eti2 = new JLabel("MONEDA 1");
			eti2.setBounds(40, 80, 180, 20);			
			String[] monedas = { "EURO", "LIBRA", "YEN", "US DOLAR", "PESOS" };
			
			JComboBox1 = new JComboBox(monedas);			
			JComboBox1.setSelectedIndex(4);
			JComboBox1.addActionListener(this);
			JComboBox1.setBounds(100, 80, 80, 20);			
			
			eti3 = new JLabel("VALOR 1");
			eti3.setBounds(40, 120, 80, 20);			
			txtcantidad = new JTextField("");
			txtcantidad.setBounds(100, 120, 80, 20);	
							
			
			eti4 = new JLabel("MONEDA 2");
			eti4.setBounds(220, 80, 120, 20);			
			String[] monedas2 = { "EURO", "LIBRA", "YEN", "US DOLAR", "PESOS" };
			
			JComboBox2 = new JComboBox(monedas2);			
			JComboBox2.setSelectedIndex(4);
			JComboBox2.addActionListener(this);
			JComboBox2.setBounds(300, 80, 80, 20);			
			
			eti5 = new JLabel("VALOR 2");
			eti5.setBounds(220, 120, 80, 20);			
			txtcantidad2 = new JTextField("");
			txtcantidad2.setBounds(300, 120, 80, 20);	
			
								
			
			boton1 = new JButton("ACEPTAR");			
			boton1.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) { 		            	
			            String cantidad = txtcantidad.getText();	
			            
	                	if(txtcantidad.getText().isEmpty()) {
	                		JFrame frame = new JFrame();		                		
	                		JOptionPane.showMessageDialog(frame, "Ingrese Cantidad!");                		
	                	}	             	                	
	                       	
	                	
	                	
			            float number = Integer.parseInt(cantidad);			            
			            JFrame frame = new JFrame();	
			            
			        	if(JComboBox1.getSelectedItem() == "PESOS"){
			        		 //JFrame frame = new JFrame();	
			                	if(JComboBox2.getSelectedItem() == "US DOLAR"){	
			                		 JOptionPane.showMessageDialog(frame, "Calculando "+  String.format("%.0f", number) +" Pesos Son : "  + String.format("%.2f", number / 792)  +" US Dolar" );
			                		 txtcantidad2.setText(""+number / 792);
			                	}
			                	if(JComboBox2.getSelectedItem() == "EURO"){	
			                		 JOptionPane.showMessageDialog(frame, "Calculando "+  String.format("%.0f", number) +" Pesos Son : "  + String.format("%.2f", number / 851)  +" EUROS" );
			                		 txtcantidad2.setText(""+number / 851);
			                	}
			                	if(JComboBox2.getSelectedItem() == "LIBRA"){
			                		 JOptionPane.showMessageDialog(frame, "Calculando "+  String.format("%.0f", number) +" Pesos Son : "  + String.format("%.2f", number / 962)  +" LIBRA" );
			                		 txtcantidad2.setText(""+number / 962);
			                	}
			                	if(JComboBox2.getSelectedItem() == "YEN"){ 
			                		 JOptionPane.showMessageDialog(frame, "Calculando "+  String.format("%.0f", number) +" Pesos Son : "  + String.format("%.2f", number / 6 )  +" YEN" );
			                		 txtcantidad2.setText(""+number / 6);
			                	}
			        	}
			        	
					    if(JComboBox1.getSelectedItem() == "US DOLAR"){
					      	// JFrame frame = new JFrame();			             
					         if(JComboBox2.getSelectedItem() == "PESOS"){
					             JOptionPane.showMessageDialog(frame, "Calculando "+  String.format("%.0f", number) +" US DOLAR Son : "  + String.format("%.0f", number * 792)  +" Pesos" );
					             txtcantidad2.setText(""+number * 792);
					         }	
					    }			        	
				       	if(JComboBox1.getSelectedItem() == "LIBRA"){
				        	// JFrame frame = new JFrame();			             
				            if(JComboBox2.getSelectedItem() == "PESOS"){
				             JOptionPane.showMessageDialog(frame, "Calculando "+  String.format("%.0f", number) +" Libras Son : "  + String.format("%.0f", number * 962)  +" Pesos" );
				             txtcantidad2.setText(""+number * 962);
				            }	
				        }			       	
				       	if(JComboBox1.getSelectedItem() == "EURO"){
				        	// JFrame frame = new JFrame();			             
				            if(JComboBox2.getSelectedItem() == "PESOS"){
				             JOptionPane.showMessageDialog(frame, "Calculando "+  String.format("%.0f", number) +" Euros Son : "  + String.format("%.0f", number * 851)  +" Pesos" );
				             txtcantidad2.setText(""+number * 851);
				            }	
				        }			        
				       	if(JComboBox1.getSelectedItem() == "YEN"){
				        	// JFrame frame = new JFrame();			             
				            if(JComboBox2.getSelectedItem() == "PESOS"){
				             JOptionPane.showMessageDialog(frame, "Calculando "+  String.format("%.0f", number) +" Yen Son : "  + String.format("%.0f", number * 6)  +" Pesos" );
				             txtcantidad2.setText(""+number * 6);
				            }	
				        }
		            }
		        	
		        });				
			boton1.setBounds(150, 160, 180, 20);						
			panel = new JPanel();			
			setTitle("Conversor Moneda Alura");	
			panel.setLayout(null);			
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(JComboBox1);
			panel.add(txtcantidad);					
			panel.add(eti4);
			panel.add(eti5);
			panel.add(JComboBox2);
			panel.add(txtcantidad2);			
			panel.add(boton1);			
			add(panel);
			setSize(450,250);
			setVisible(true);			
			}
			
			
			
			
			

public static void main(String[] args) {
	formulario f = new formulario();

	
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


	

}
