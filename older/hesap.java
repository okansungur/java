import java.awt.*;
import java.awt.event.*;
class hesap extends Frame implements ActionListener{
	TextArea ta;
	Panel panelim;
	Label etiket=new Label("");
	Button b[];
	Button topla,cikar,bol,carp,reset,nokta,esit;
		int sayi1,sayi2,sonuc;
		
	public hesap(){
		this.setLayout(new FlowLayout());
		ta=new TextArea("",1,16,TextArea.SCROLLBARS_NONE);
			
		panelim=new Panel();
		b=new Button[9];
		for (int i = 0; i<9; i++) {
			b[i]=new Button(""+i);
			b[i].addActionListener(this);
			panelim.add(b[i]);
			}
	add(etiket);
	etiket.setVisible(false);
	
	topla=new  Button("+"); 
	cikar=new  Button("-");
	bol=new  Button("/");	
	carp=new  Button("*");	
	reset=new  Button("C");
	nokta=new  Button(".");	
	topla.addActionListener(this);
	cikar.addActionListener(this);
	bol.addActionListener(this);
	carp.addActionListener(this);
	reset.addActionListener(this);
	nokta.addActionListener(this);
	add(topla);  add(cikar); add(bol); 
	add(carp);	add(reset);	add(nokta);
	esit=new  Button("=");	
	esit.addActionListener(this);
	add(esit);
	
	panelim.setLayout(new GridLayout(3,3));
	add(panelim,BorderLayout.CENTER);
	add(ta,BorderLayout.NORTH);
	
	
	
		}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getActionCommand()!="="){
		if(ae.getActionCommand()!="+"){
			if(ae.getActionCommand()!="-"){
				if(ae.getActionCommand()!="*"){
					if(ae.getActionCommand()!="/"){
						if(ae.getActionCommand()!="C"){
							if(ae.getActionCommand()!="."){
		 ta.append(ae.getActionCommand());
		 }}}}}}}
		 
		 
		 
		if(ae.getActionCommand()=="+"){ 
		sayi1=Integer.parseInt(ta.getText());
		etiket.setText("+");	
		ta.setText("");
		}
		if(ae.getActionCommand()=="-"){ 
		sayi1=Integer.parseInt(ta.getText());
		etiket.setText("-");
		ta.setText("");
		}
			if(ae.getActionCommand()=="*"){ 
		sayi1=Integer.parseInt(ta.getText());
		etiket.setText("*");
		ta.setText("");
		}
		
			if(ae.getActionCommand()=="/"){ 
		sayi1=Integer.parseInt(ta.getText());
		etiket.setText("/");
		ta.setText("");
		}
		
			if(ae.getActionCommand()=="C"){sonuc=0;ta.setText("");etiket.setText("");  }
		 
		 	if(ae.getActionCommand()=="="){ 
		sayi2=Integer.parseInt(ta.getText());
		ta.setText("");
		if(etiket.getText()=="+")sonuc=sayi1+sayi2;
		if(etiket.getText()=="-")sonuc=sayi1-sayi2;
		if(etiket.getText()=="*")sonuc=sayi1*sayi2;
		if(etiket.getText()=="/")sonuc=sayi1/sayi2;
		
		ta.setText(sonuc+"");
		
		}	
		 	
		 
		
		}
	public static void main(String args[]){
		hesap ornek=new hesap();
		ornek.setSize(400,400);
		ornek.setVisible(true);
		
		
		}
	
	}