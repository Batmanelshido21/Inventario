import java.awt.Color;
import java.awt.Container;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
	public class Calculadora extends JFrame implements ActionListener {
		
		   double memoria1=0.0,memoria2=0.0;
		   String signo="";
		 
		public Calculadora(){
			iniciarComponentes();
			setSize(650,400);
			setTitle("Ventana Alumnos");
			setLocationRelativeTo(null);
			setVisible(true);		
		}
		private void iniciarComponentes(){
			
			JPanel jpanel = (JPanel) this.getContentPane();
		    JTextField jtextfield = new JTextField();
		       jtextfield.setBounds(new Rectangle(100,15,500,50));
		       jtextfield.setText("");
		       jtextfield.setEditable(false); 
		       jpanel.add(jtextfield, null);
			   setLayout(null);
			JButton bCerrar=new JButton("cerrar");
		    bCerrar.setText("cerrar");
			bCerrar.setBounds(100,100, 100, 25);
			add(bCerrar);
			bCerrar.addActionListener(this);
			JButton button1 = new JButton("1");
			JButton button2 = new JButton("2");
			JButton button3 = new JButton("3");
			JButton button4 = new JButton("4");
			JButton button5 = new JButton("5");
			JButton button6 = new JButton("6");
			JButton button7 = new JButton("7");
			JButton button8 = new JButton("8");
			JButton button9 = new JButton("9");
			JButton button0 = new JButton("0");
			JButton button10 =new JButton(".");
			button1.setBounds(100,150,100,25);
			button2.setBounds(200,150,100,25);
			button3.setBounds(300,150,100,25);
			button4.setBounds(100,200,100,25);
			button5.setBounds(200,200,100,25);
			button6.setBounds(300,200,100,25);
			button7.setBounds(100,250,100,25);
			button8.setBounds(200,250,100,25);
			button9.setBounds(300,250,100,25);
			button0.setBounds(200,300,100,25);
			button10.setBounds(100,300,100,25);
			add(button1);
			add(button2);
			add(button3);
			add(button4);
			add(button5);
			add(button6);
			add(button7);
			add(button8);
			add(button9);
			add(button0);
			add(button10);
			JButton botonSumar=new JButton("+");
			JButton botonRestar=new JButton("-");
			JButton botonIgual=new JButton("=");
			JButton botonClear=new JButton("C");
			JButton botonClearAll=new JButton("CE");
			JButton botonMultiplicar=new JButton("x");
			JButton botonDividir=new JButton("/");
			botonClear.setBounds(400,150,100,25);
			botonIgual.setBounds(400,300,100,25);
			botonSumar.setBounds(400,200,100,25);
			botonRestar.setBounds(400,250,100,25);
			botonClearAll.setBounds(300,300,100,25);
			botonMultiplicar.setBounds(500,150,100,25);
			botonDividir.setBounds(500,200,100,25);
			add(botonClear);
			add(botonSumar);
			add(botonRestar);
			add(botonIgual);
			add(botonClearAll);
			add(botonMultiplicar);
			add(botonDividir);

		       botonDividir.addActionListener(new ActionListener(){
		    	   public void actionPerformed(ActionEvent e){
		    			String cadena=jtextfield.getText();
		    			int ultimo=cadena.length();
						if((cadena.charAt(ultimo-1)=='+')||(cadena.charAt(ultimo-1)=='-')||(cadena.charAt(ultimo-1)=='x')||(cadena.charAt(ultimo-1)=='/')){
							jtextfield.setText(cadena.substring(0,cadena.length()-1)+"/");
						}
						else{
							jtextfield.setText(jtextfield.getText()+"/");
						}
		    	   }
		       });
		       botonMultiplicar.addActionListener(new ActionListener(){
		    	   public void actionPerformed(ActionEvent e){
		    			String cadena=jtextfield.getText();
		    			int ultimo=cadena.length();
						if((cadena.charAt(ultimo-1)=='+')||(cadena.charAt(ultimo-1)=='-')||(cadena.charAt(ultimo-1)=='x')||(cadena.charAt(ultimo-1)=='/')){
							jtextfield.setText(cadena.substring(0,cadena.length()-1)+"x");
						}
						else{
							jtextfield.setText(jtextfield.getText()+"x");
						}
		    	   }
		       });
		       botonClear.addActionListener(new ActionListener(){
		    	   public void actionPerformed(ActionEvent e){
		    		   String cadena;
		    		      cadena=jtextfield.getText();
		    		      if(cadena.length()>0){
		    		          cadena=cadena.substring(0,cadena.length()-1);
		    		          jtextfield.setText(cadena);
		    		      }
		    	   }
		       });
		       botonClearAll.addActionListener(new ActionListener(){
		    	   public void actionPerformed(ActionEvent e){
		    		  jtextfield.setText("");
		    	   }
		       });
		    botonIgual.addActionListener(new ActionListener(){
		    	   public void actionPerformed(ActionEvent e){
		    		String numero[]=new String[50];
		    		String signos[]=new String[50];
		    		int cont1=0,cont2=0,cont3=0;
		    		   String cadena=jtextfield.getText();
		    		   String cadena1=jtextfield.getText();
		    		   for(int i=0;i<=cadena.length();i++){
		    			if(i<=1){
		    			 
		    			}
		    			else if((cadena.substring(i-1,i).equals("-"))||(cadena.substring(i-1,i).equals("+"))||(cadena.substring(i-1,i).equals("x"))||(cadena.substring(i-1,i).equals("/"))){ 
		    				  numero[cont1]=cadena.substring(cont2,i-1);
		    				  cont2=i;
		    				  signos[cont1]=cadena.substring(i-1,i);
		    				  cont1++;
		    			  }
		    			else if(i==cadena.length()){
		    				numero[cont1]=cadena.substring(cont2,cadena.length());
		    				  cont2=i;
		    				  cont1++;
		    			}
		    		   }
		    		   int conts=0;
		    		for(int i=0;i<cont1;i++){
		    			if(memoria1==0.0){
		    				memoria1=Double.parseDouble(numero[i]);
			    			memoria2=Double.parseDouble(numero[i+1]);
			    			switch(signos[conts]){
			    			case "+":
			    				memoria1=memoria1+memoria2;
			    				conts++;
			    				break;
			    			case "-":
			    				memoria1=memoria1-memoria2;
			    				conts++;
			    				break;
			    			case "x":
			    				memoria1=memoria1*memoria2;
			    				conts++;
			    				break;
			    			case "/":
			    				memoria1=memoria1/memoria2;
			    				conts++;
			    				break;
			    			}
			    			i++;
		    			}
		    			else{
		    				memoria2=Double.parseDouble(numero[i]);
		    				switch(signos[conts]){
			    			case "+":
			    				memoria1=memoria1+memoria2;
			    				conts++;
			    				break;
			    			case "-":
			    				memoria1=memoria1-memoria2;
			    				conts++;
			    				break;
			    			case "x":
			    				memoria1=memoria1*memoria2;
			    				conts++;
			    				break;
			    			case "/":
			    				memoria1=memoria1/memoria2;
			    				conts++;
			    				break;
			    			}
		    			}
		    		}
		    		
		    		   jtextfield.setText(""+memoria1);
		    		   signo="";
		    		   memoria1=0.0;
		    		   memoria2=0.0;
		    	   } 
		       });
			botonRestar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String cadena=jtextfield.getText();
					int ultimo=cadena.length();
					if((cadena.charAt(ultimo-1)=='+')||(cadena.charAt(ultimo-1)=='-')||(cadena.charAt(ultimo-1)=='x')||(cadena.charAt(ultimo-1)=='/')){
						jtextfield.setText(cadena.substring(0,cadena.length()-1)+"-");
					}
					else{
						jtextfield.setText(jtextfield.getText()+"-");
					}
				    }         
				});
			botonSumar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String cadena=jtextfield.getText();
					int ultimo=cadena.length();
					if((cadena.charAt(ultimo-1)=='+')||(cadena.charAt(ultimo-1)=='-')||(cadena.charAt(ultimo-1)=='x')||(cadena.charAt(ultimo-1)=='/')){
						jtextfield.setText(cadena.substring(0,cadena.length()-1)+"+");
					}
					else{
						jtextfield.setText(jtextfield.getText()+"+");
					}
				}
			});
			button1.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					 jtextfield.setText(jtextfield.getText()+"1");
				}		
			});
			button2.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					
					 jtextfield.setText(jtextfield.getText()+"2");
				}
			});
			button3.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					
					
					 jtextfield.setText(jtextfield.getText()+"3");
				}
			});
			button4.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					
					 
					 jtextfield.setText(jtextfield.getText()+"4");
				}
			});
			button5.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					
					
					 jtextfield.setText(jtextfield.getText()+"5");
				}
			});
			button6.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					
					
					 jtextfield.setText(jtextfield.getText()+"6");
				}
			});
			button7.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
				
					 jtextfield.setText(jtextfield.getText()+"7");
				}
			});
			button8.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
									
					 jtextfield.setText(jtextfield.getText()+"8");
				}
			});
			button9.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					
					 jtextfield.setText(jtextfield.getText()+"9");
				}
			});
			button0.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					 String cadena;
				       cadena=jtextfield.getText();
				       if(cadena.length()<=0){
				           jtextfield.setText("0.");
				       }
				       else{
				           if(!existePunto(jtextfield.getText())){
				               jtextfield.setText(jtextfield.getText()+"0");
				           }
				       }
				}
			});
			button10.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				String cadena=jtextfield.getText();
			    
				 if(cadena.equals("")){
			    	  jtextfield.setText(jtextfield.getText()+".");
			      }
			      else if(!existePunto(jtextfield.getText())){
					jtextfield.setText(jtextfield.getText()+".");
				}
				else{
					String cadena5=jtextfield.getText();
					if(!cadena5.substring(cadena5.length()-1,cadena5.length()).equals(".")){
						jtextfield.setText(jtextfield.getText()+".");
					}
					else{
						
					}
				}
			}
			});
		}
		public static boolean existePunto(String cadena){
		       boolean resultado=false;
		        for(int i=0;i<cadena.length();i++){
		            if(cadena.substring(i,i+1).equals(".")){
		                resultado=true;
		                break;
		            }
		        }
				return resultado;
		    }
		public static void main(String[]args){
			new Calculadora();
		}
		public void actionPerformed(ActionEvent e){
			System.out.println("Accion del boton cerrar");
			dispose();
		}	
}
