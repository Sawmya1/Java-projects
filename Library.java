import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Library extends JFrame implements ActionListener
{ 
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;

	public Library()
	{ 
		l1=new JLabel("User Name");
		l2=new JLabel("Password");
		l3=new JLabel("");
		t1=new JTextField(20);
		p1=new JPasswordField(20);
		b1=new JButton("Login");
		b2=new JButton("Exit");

		l1.setBounds(100,100,150,20);
		l2.setBounds(100,150,150,20);
		t1.setBounds(200,100,150,20);
		p1.setBounds(200,150,150,20);
		b1.setBounds(100,200,150,20);
		b2.setBounds(250,200,150,20);
		l3.setBounds(450,200,300,20);
		
		setLayout(null);

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(p1);
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
		p1.setEchoChar('#');
		
	}
	public void actionPerformed(ActionEvent ae)
	{ 
		if (ae.getSource()==b1)
		{ 
			String s1,s2;
			s1=t1.getText();
			s2=new String(p1.getText());
			

			if(s1.equals("bharati")==true)
			{ 
				if( s2.equals("bharati")==true)
				{                 
                                                                AJPproject ajp = new AJPproject();
                                                                ajp.setSize(800,800);
                                                                ajp.setVisible(true);
				}
			}
			else
			{ 
				System.out.println("Login Failed");
				l3.setText("Login Failed");
			}
			
		}
		
		if (ae.getSource()==b2)
		{ 
			System.exit(0);
		}
	}
   public static void main(String ar[])
     {
         Library p = new Library();
              p.setSize(800,800);
              p.setVisible(true);
    }
}
class Add extends JFrame
  {    
        public   JTextField t1,t2,t3;
       public  JLabel l1,l2,l3;
      public Add()
      {
           l1 = new JLabel("Enter book name"); 
           l2 = new JLabel("Enter book price");
           l3 = new JLabel("Enter book number");
           t1 = new JTextField(20);
           t2 = new JTextField(20);
           t3 = new JTextField(20);
            setLayout(null);
              l1.setBounds(100,100,400,50);
              l2.setBounds(100,200,200,50);
              l3.setBounds(100,300,200,50);
              t1.setBounds(500,100,200,50);
              t2.setBounds(500,200,200,50);
              t3.setBounds(500,300,200,50);
           add(l1);
           add(l2);
           add(l3);
           add(t1);
           add(t2);
           add(t3);

      }
  }
class Issue extends JFrame
{
    public static JTextField ta1,ta2,ta3,ta4;
    public static  JLabel la1,la2,la3,la4;
      public Issue()
      {
           la1 = new JLabel("Enter book name"); 
           la2 = new JLabel("Enter book id");
           la3 = new JLabel("Enter number of books");
           la4 = new JLabel("Enter issue date of book");
           ta1 = new JTextField(20);
           ta2 = new JTextField(20);
           ta3 = new JTextField(20);
           ta4 = new JTextField(20);
            setLayout(null);
              la1.setBounds(100,100,200,50);
              la2.setBounds(100,200,200,50);
              la3.setBounds(100,300,200,50);
              la4.setBounds(100,400,200,50);
              ta1.setBounds(500,100,200,50);
              ta2.setBounds(500,200,200,50);
              ta3.setBounds(500,300,200,50);
              ta4.setBounds(500,400,200,50);
           add(la1);
           add(la2);
           add(la3);
           add(la4);
           add(ta1);
           add(ta2);
           add(ta3);
           add(ta4);      
      }
}
class Return extends JFrame
{
    public static JLabel il1,il2;
     public static JTextField it1,it2;
      public Return()
      {
             JLabel  l  = new JLabel();
             il1 = new JLabel("Enter student name:");
             il2 = new JLabel("Enter book number:");
             it1 = new JTextField();
             it2 = new JTextField(20);
              setLayout(null);
             il1.setBounds(100,200,200,50);
             il2.setBounds(100,300,200,50);
             it1.setBounds(500,200,200,50);
             it2.setBounds(500,300,200,50);
             l.setBounds(700,200,200,50);
             add(il1);
             add(il2);
             add(it1);
             add(it2);
             add(l);
           if( Issue.ta2 == Return.it1 )
           {
                   l.setText(" Book id = "+ Return.it1.getText() + " Book name= "+ Issue.ta1.getText() + "Total number of book issued = " + Issue.ta3.getText() + "Book issue date"+ Issue.ta4.getText());
           }
           else
           {
                  l.setText("Entered wrong book Id");
           }
      }
}
 class Display extends JFrame
 {
     public Display()
     {
            JLabel  s  = new JLabel();
            s.setText(" Book id = "+ Return.it1.getText()+ " Book name= "+ Issue.ta1.getText() + "Total number of book issued = " + Issue.ta3.getText() + "Book issue date"+Issue.ta4.getText());
              setLayout(null);
             s.setBounds(200,200,200,50);
             add(s);
     }

 }
class AJPproject extends JFrame implements ActionListener
{    
    JLabel l1;
    JButton b1,b2,b3,b4,b5;
      public AJPproject()
      { 
             l1 = new JLabel();
             l1.setText("*****************Library Management System****************");  
                  
            b1 = new JButton("Add book");
            b2 = new JButton("Issue a book");
            b3 = new JButton("Return a book");
            b4 = new JButton("Display details of book");
            b5 = new JButton("Exit ");
                setLayout(null);
              l1.setBounds(100,100,400,50);
              b1.setBounds(100,200,200,50);
              b2.setBounds(100,300,200,50);
              b3.setBounds(100,400,200,50);
              b4.setBounds(100,500,200,50);
              b5.setBounds(100,600,200,50);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
                  add(l1);
                  add(b1);
                  add(b2);
                  add(b3);
                  add(b4);
                  add(b5);
           }
           public void actionPerformed(ActionEvent e)
           {
                String str = e.getActionCommand();   // to know which Java button user clicked
                   if(str.equals("Add book"))
                   {
                            Add a =  new Add();
                            a.setVisible(true);
                            a.setSize(600,600);
                   }                     
                   else if(str.equals("Issue a book"))
                   {
                      Issue i =  new Issue();
                            i.setVisible(true);
                            i.setSize(600,600);
                   }
                   else if(str.equals("Return a book"))
                  {
                      Return r =  new Return();
                            r.setVisible(true);
                            r.setSize(600,600);
                  }
                  else if(str.equals("Display details of book"))
                  {
                        Display d =  new Display();
                            d.setVisible(true);
                            d.setSize(600,600);
                  }
                  else if(str.equals("Exit"))
                  {
                      	System.exit(0);
                  }
     }
}
 