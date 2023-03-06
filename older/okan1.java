import java.awt.*;
class okan1 extends Frame{
  TextArea ta;
  Button b1,b2;
  Checkbox c1,c2,c3,c4;
  TextField tf;
  GridBagConstraints gbc;
  GridBagLayout gb;
  public okan1(){
	 ta=new TextArea("sdasa",5,5);
	 b1=new Button("bir");  
	 b2=new Button("iki");
	CheckboxGroup cbg=new CheckboxGroup();
		c1=new Checkbox("",cbg,false);	   
	   c2=new Checkbox("",cbg,false);
	   c3=new Checkbox("",cbg,false);
	   c4=new Checkbox("",cbg,true);
	   
	   
	   
tf=new TextField("tf");
gb=new GridBagLayout();
this.setLayout(gb);
gbc=new GridBagConstraints();

	   gbc.insets=new Insets(3,3,3,3);

gbc.gridx=0;
gbc.gridy=0;
gbc.gridwidth=1;
gbc.gridheight=3;
gb.setConstraints(ta,gbc);add(ta);

gbc.gridx=1;
gbc.gridy=0;
gbc.gridwidth=1;
gbc.gridheight=1;
gb.setConstraints(b1,gbc);add(b1);

gbc.gridx=2;
gbc.gridy=0;
gbc.gridwidth=1;
gbc.gridheight=1;
gb.setConstraints(b2,gbc);add(b2);

gbc.gridx=1;
gbc.gridy=1;
gbc.gridwidth=1;
gbc.gridheight=1;
gb.setConstraints(c1,gbc);
add(c1);


gbc.gridx=2;
gbc.gridy=1;
gbc.gridwidth=1;
gbc.gridheight=1;
gb.setConstraints(c2,gbc);
add(c2);


gbc.gridx=1;
gbc.gridy=2;
gbc.gridwidth=1;
gbc.gridheight=1;
gb.setConstraints(c3,gbc);
add(c3);


gbc.gridx=2;
gbc.gridy=2;
gbc.gridwidth=1;
gbc.gridheight=1;
gb.setConstraints(c4,gbc);
add(c4);

	     
gbc.gridx=0;
gbc.gridy=3;

gbc.gridwidth=3;
gbc.gridheight=1;
gbc.fill=GridBagConstraints.BOTH;
gb.setConstraints(tf,gbc);

add(tf);	     	
	     	
	     	

	 }
	 public static void main(String args[]){
	 	okan1 ok=new okan1();
	 	ok.setSize(400,400);
	 	ok.setVisible(true);
	 	
	 	
	 	}
	 }
	
	
	
		
	
	