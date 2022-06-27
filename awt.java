import java.awt.*;    
  
class AWTExample2 {    
  Frame f;
Label l ;
     Button b ;
      TextField t;
   AWTExample2() {  
  
      f = new Frame();  
  
      l = new Label("Employee id:");   
  
     b = new Button("Submit");  
  
      t = new TextField();  
  
      l.setBounds(20, 80, 80, 30);  
      t.setBounds(20, 100, 80, 30);  
      b.setBounds(100, 100, 80, 30);  
      f.add(b);  
      f.add(l);  
      f.add(t);  
      f.setSize(400,300);  
      f.setTitle("Employee info");   
      f.setLayout(null);   
      f.setVisible(true);  
}    
 
public static void main(String args[]) {   
  
AWTExample2 awt_obj = new AWTExample2();    
  
}  
  
}