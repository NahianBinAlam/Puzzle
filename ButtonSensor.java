import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.applet.*;
import java.applet.AudioClip;
import java.util.*;

public class ButtonSensor implements ActionListener{
	int counter=0, highscore, previousCounter, flag=0;
	Puzzle pz;
	public ButtonSensor(Puzzle p){
		pz=p;
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==pz.button1){
			Icon i=pz.button1.getIcon();
			
			if(pz.button2.getIcon()==pz.img7){
				pz.button2.setIcon(i);
				pz.button1.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button4.getIcon()==pz.img7){
				pz.button4.setIcon(i);
				pz.button1.setIcon(pz.img7);
				counter++;
			}
			pz.swapsField.setText(Integer.toString(counter));
		}
		if(ae.getSource()==pz.button2){
			Icon i=pz.button2.getIcon();
			if(pz.button1.getIcon()==pz.img7){
				pz.button1.setIcon(i);
				pz.button2.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button3.getIcon()==pz.img7){
				pz.button3.setIcon(i);
				pz.button2.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button5.getIcon()==pz.img7){
				pz.button5.setIcon(i);
				pz.button2.setIcon(pz.img7);
				counter++;
			}
			pz.swapsField.setText(Integer.toString(counter));
		}
		if(ae.getSource()==pz.button3){
			Icon i=pz.button3.getIcon();
			if(pz.button2.getIcon()==pz.img7){
				pz.button2.setIcon(i);
				pz.button3.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button6.getIcon()==pz.img7){
				pz.button6.setIcon(i);
				pz.button3.setIcon(pz.img7);
				counter++;
			}
			pz.swapsField.setText(Integer.toString(counter));
		}
		if(ae.getSource()==pz.button4){
			Icon i=pz.button4.getIcon();
			if(pz.button1.getIcon()==pz.img7){
				pz.button1.setIcon(i);
				pz.button4.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button5.getIcon()==pz.img7){
				pz.button5.setIcon(i);
				pz.button4.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button7.getIcon()==pz.img7){
				pz.button7.setIcon(i);
				pz.button4.setIcon(pz.img7);
				counter++;
			}
			pz.swapsField.setText(Integer.toString(counter));
		}
		if(ae.getSource()==pz.button5){
			Icon i=pz.button5.getIcon();
			if(pz.button2.getIcon()==pz.img7){
				pz.button2.setIcon(i);
				pz.button5.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button4.getIcon()==pz.img7){
				pz.button4.setIcon(i);
				pz.button5.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button6.getIcon()==pz.img7){
				pz.button6.setIcon(i);
				pz.button5.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button8.getIcon()==pz.img7){
				pz.button8.setIcon(i);
				pz.button5.setIcon(pz.img7);
				counter++;
			}
			pz.swapsField.setText(Integer.toString(counter));
		}
		if(ae.getSource()==pz.button6){
			Icon i=pz.button6.getIcon();
			if(pz.button3.getIcon()==pz.img7){
				pz.button3.setIcon(i);
				pz.button6.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button5.getIcon()==pz.img7){
				pz.button5.setIcon(i);
				pz.button6.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button9.getIcon()==pz.img7){
				pz.button9.setIcon(i);
				pz.button6.setIcon(pz.img7);
				counter++;
			}
			pz.swapsField.setText(Integer.toString(counter));
		}
		if(ae.getSource()==pz.button7){
			Icon i=pz.button7.getIcon();
			if(pz.button4.getIcon()==pz.img7){
				pz.button4.setIcon(i);
				pz.button7.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button8.getIcon()==pz.img7){
				pz.button8.setIcon(i);
				pz.button7.setIcon(pz.img7);
				counter++;
                        }
			pz.swapsField.setText(Integer.toString(counter));
		}
		if(ae.getSource()==pz.button8){
			Icon i=pz.button8.getIcon();
			if(pz.button5.getIcon()==pz.img7){
				pz.button5.setIcon(i);
				pz.button8.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button7.getIcon()==pz.img7){
				pz.button7.setIcon(i);
				pz.button8.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button9.getIcon()==pz.img7){
				pz.button9.setIcon(i);
				pz.button8.setIcon(pz.img7);
				counter++;
			}
			pz.swapsField.setText(Integer.toString(counter));
		}
		if(ae.getSource()==pz.button9){
			Icon i=pz.button9.getIcon();
			if(pz.button6.getIcon()==pz.img7){
				pz.button6.setIcon(i);
				pz.button9.setIcon(pz.img7);
				counter++;
			}
			else if(pz.button8.getIcon()==pz.img7){
				pz.button8.setIcon(i);
				pz.button9.setIcon(pz.img7);
				counter++;
			}
			pz.swapsField.setText(Integer.toString(counter));
		}
		pz.clickSound();
		pz.click.play();
		String d1=((ImageIcon)pz.button1.getIcon()).getDescription();
		String d2=((ImageIcon)pz.button2.getIcon()).getDescription();
		String d3=((ImageIcon)pz.button3.getIcon()).getDescription();
		String d4=((ImageIcon)pz.button4.getIcon()).getDescription();
		String d5=((ImageIcon)pz.button5.getIcon()).getDescription();
		String d6=((ImageIcon)pz.button6.getIcon()).getDescription();
		String d7=((ImageIcon)pz.button7.getIcon()).getDescription();
		String d8=((ImageIcon)pz.button8.getIcon()).getDescription();
		String d9=((ImageIcon)pz.button9.getIcon()).getDescription();
		
		if(d1.equals(pz.img1.getDescription()) && d2.equals(pz.img2.getDescription()) && d3.equals(pz.img3.getDescription()) 
                        && d4.equals(pz.img4.getDescription()) && d5.equals(pz.img5.getDescription()) && d6.equals(pz.img6.getDescription())
                        && d7.equals(pz.img7.getDescription()) && d8.equals(pz.img8.getDescription()) && d9.equals(pz.img9.getDescription())){
			pz.success.play();
			JOptionPane.showMessageDialog(pz, "Image matched in " +counter+ " swaps.");
			highscore=counter;
				
			if(flag==0){
				pz.highScoreField.setText(Integer.toString(highscore));
				previousCounter=counter;
			}
			else if(flag!=0 && previousCounter>counter){
				pz.highScoreField.setText(Integer.toString(counter));
				previousCounter=counter;
			}
			counter=0;
			pz.swapsField.setText(Integer.toString(counter));
			flag++;
		}
	}
}