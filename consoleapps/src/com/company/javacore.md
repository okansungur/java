#


public void paint(Graphics g){
	try {
	i=i+1;
if(i==10){i=0;}
	t1.sleep(100);
	repaint();
	}
	catch (Exception ex) {}
tf.setText(String.valueOf(i));
}
