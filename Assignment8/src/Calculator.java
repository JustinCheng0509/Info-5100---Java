import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends WindowAdapter implements ActionListener{
    Frame list;
    JTextField show;
    Button bc,c,ce,plus,minus,mul,div,equ,point,sqrt,ds,bfh,zf;
    Button b[]=new Button[10];
    double sum=0,getValue;
    int i=0,j=0,p=0,l,action;
    Dialog about;
    final int slength=30;
    public void disp(){
        list=new Frame("Calculator");
        list.setSize(250,200);
        list.setLocation(320,250);
        list.setBackground(Color.LIGHT_GRAY);
        list.setLayout(new FlowLayout(FlowLayout.CENTER));
        list.setResizable(false);
        show=new JTextField(20);
        show.setText("0");
        show.setHorizontalAlignment(SwingConstants.RIGHT);
        show.setEditable(false);
        list.add(show);

        Panel dispTop=new Panel();
        list.add(dispTop);
        dispTop.setLayout(new GridLayout(1,4,3,3));
        bc=new Button(" Back  ");
        bc.setForeground(Color.BLUE);
        dispTop.add(bc);
        ce=new Button(" CE ");
        ce.setForeground(Color.BLUE);
        dispTop.add(ce);
        c=new Button(" C ");
        c.setForeground(Color.BLUE);
        dispTop.add(c);


        Panel dispMain=new Panel();
        list.add(dispMain);
        dispMain.setLayout(new GridLayout(1,2,10,10));

        Panel dispLeft=new Panel();
        dispMain.add(dispLeft);
        dispLeft.setLayout(new GridLayout(4,3,3,3));

        Panel dispRight=new Panel();
        dispMain.add(dispRight);
        dispRight.setLayout(new GridLayout(4,2,3,3));
        for(l=9;l>=0;l--){
            b[l]=new Button(String.valueOf(l));
            dispLeft.add(b[l]);
            b[l].addActionListener(this);
        }
        plus=new Button("+");
        plus.setForeground(Color.RED);
        minus=new Button("-");
        minus.setForeground(Color.RED);
        mul=new Button("*");
        mul.setForeground(Color.RED);
        div=new Button("/");
        div.setForeground(Color.RED);
        equ=new Button("=");
        equ.setForeground(Color.RED);
        point=new Button(".");
        zf=new Button(" +/- ");
        sqrt=new Button("sqrt");
        bfh=new Button("%");
        ds=new Button("1/x");
        dispRight.add(div);
        dispRight.add(sqrt);
        dispRight.add(mul);
        dispRight.add(bfh);
        dispRight.add(minus);
        dispRight.add(ds);
        dispRight.add(plus);
        dispRight.add(equ);
        dispLeft.add(zf);
        dispLeft.add(point);
        bc.addActionListener(this);
        ce.addActionListener(this);
        c.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equ.addActionListener(this);
        point.addActionListener(this);
        zf.addActionListener(this);
        sqrt.addActionListener(this);
        bfh.addActionListener(this);
        ds.addActionListener(this);
        list.addWindowListener(this);
        list.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        getValue=Double.valueOf(show.getText()).doubleValue();
        if(e.getSource()==plus){
            if(j==0){
                sum=getValue;
            }
            else if(action==1){
                sum+=getValue;
            }
            setSum();
            j++;p=0;i=0;action=1;
        }
        else if(e.getSource()==minus){
            if(j==0){
                sum=getValue;
            }
            else if(action==2){
                sum-=getValue;
            }
            setSum();
            j++;p=0;i=0;action=2;
        }
        else if(e.getSource()==mul){
            if(j==0){
                sum=getValue;
            }
            else if(action==3){
                sum*=getValue;
            }
            setSum();
            j++;p=0;i=0;action=3;
        }
        else if(e.getSource()==div){
            if(j==0)
                sum=getValue;
            else if(action==4){
                sum/=getValue;
            }
            setSum();
            j++;p=0;i=0;action=4;
        }
        else if(e.getSource()==equ){
            switch(action){
                case 1:show.setText(String.valueOf(sum+=getValue));break;
                case 2:show.setText(String.valueOf(sum-=getValue));break;
                case 3:show.setText(String.valueOf(sum*=getValue));break;
                case 4:show.setText(String.valueOf(sum/=getValue));break;
            }
            setSum();
            i=0;j=0;action=0;
        }
        else if(e.getSource()==point){
            if(p==0)
                show.setText(show.getText()+e.getActionCommand());
            p=1;
        }
        else if(e.getSource()==c||e.getSource()==ce){
            i=0;j=0;p=0;sum=0;action=0;
            show.setText("0");
        }
        else if(e.getSource()==bc){
            String s=show.getText();
            if(s.length()>1){
                show.setText("");
                for (l=0;l<s.length()-1;l++){
                    char a=s.charAt(l);
                    show.setText(show.getText()+a);
                }
            }
            else
                show.setText("0");
        }
        else if(e.getSource()==sqrt){
            sum=Math.sqrt(getValue);
            setSum();
            j++;
        }
        else if(e.getSource()==ds){
            sum=1/getValue;
            setSum();
            j++;
        }
        else if(e.getSource()==bfh){
            sum=getValue/100;
            setSum();
            j++;
        }
        else if(e.getSource()==zf){
            String s=show.getText();
            char a=s.charAt(0);
            if(a=='-'){
                show.setText("");
                for(l=1;l<s.length();l++){
                    show.setText(show.getText()+s.charAt(l));
                }
            }
            else if(getValue!=0){
                show.setText("-"+s);
            }
        }
        for(l=0;l<10;l++){
            if(e.getSource()==b[l]){
                if(i==0)
                    show.setText("");
                String s = show.getText();
                if(s.length()<slength)
                    show.setText(show.getText()+e.getActionCommand());
                if(e.getSource()==b[0] && getValue==0 && p==0)
                    show.setText("0");
                if(e.getSource()!=b[0] && getValue==0 && p==0)
                    show.setText(e.getActionCommand());
                i++;
            }
        }
    }

    public void setSum(){
        show.setText(String.valueOf(sum));
        String s = show.getText();
        char a=s.charAt((s.length()-1));
        char b=s.charAt((s.length()-2));
        if (a=='0' && b=='.'){
            show.setText(String.valueOf(Math.round(sum)));
        }
    }

    public void windowClosing(WindowEvent e){
        if(e.getSource()==about)
            about.setVisible(false);
        else if(e.getSource()==list)
            System.exit(0);
    }

    public static void main(String args[]){
        (new Calculator()).disp();
    }
}

