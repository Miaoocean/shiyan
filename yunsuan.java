

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class yunsuan extends JFrame{
    JLabel l1 = new JLabel("答对题数:");

    private JFrame frame = new JFrame("四则运算");    
    private Container c = frame.getContentPane();    
    private JButton KO = new JButton("确定");
    private JTextField A = new JTextField(6);
    private JTextField AA = new JTextField(4);
    private JTextField AAA = new JTextField(4);
    private JTextField B = new JTextField(6);
    private JTextField BB = new JTextField(4);
    private JTextField BBB = new JTextField(4);
    private JTextField C = new JTextField(6);
    private JTextField CC = new JTextField(4);
    private JTextField CCC = new JTextField(4);
    private JTextField D = new JTextField(6);
    private JTextField DD = new JTextField(4);
    private JTextField DDD = new JTextField(4);
    private JTextField E = new JTextField(6);
    private JTextField EE = new JTextField(4);
    private JTextField EEE = new JTextField(4);
    private JPasswordField password = new JPasswordField();    
    private JButton ok = new JButton("确定");
    private JTextField QQ = new JTextField(6);
    
    
int num=0;
    int an[]=new int [5];
    String bn[]=new String [5];
    String cn[]=new String [5];
     yunsuan(int a[],String b[]) 
    {    
         an=a;
         bn=b;
     
        JPanel fieldPanel = new JPanel();
    
        fieldPanel.add(A);A.setBounds(30, 10, 100, 20);
        A.setVisible(true);
        fieldPanel.add(AA);AA.setBounds(40, 10, 100, 20);
        fieldPanel.add(AAA);AAA.setBounds(50, 10, 100, 20);
        fieldPanel.add(B);B.setBounds(30, 15, 50, 20);
        fieldPanel.add(BB);BB.setBounds(40, 15, 100, 20);
        fieldPanel.add(BBB);BBB.setBounds(50, 10, 100, 20);
        fieldPanel.add(C);C.setBounds(30, 20, 50, 20);
        fieldPanel.add(CC);CC.setBounds(40, 20, 100, 20);
        fieldPanel.add(CCC);CCC.setBounds(50, 10, 100, 20);
        fieldPanel.add(D);D.setBounds(30, 25, 50, 20);
        fieldPanel.add(DD);DD.setBounds(40, 25, 100, 20);
        fieldPanel.add(DDD);DDD.setBounds(50, 10, 100, 20);
        fieldPanel.add(E);E.setBounds(30, 30, 50, 20);
        fieldPanel.add(EE);EE.setBounds(40, 30, 100, 20);
        fieldPanel.add(EEE);EEE.setBounds(50, 10, 100, 20);
        fieldPanel.add(KO);KO.setBounds(30, 50, 20, 20);
        fieldPanel.add(l1);l1.setBounds(20, 60, 100, 20);
        fieldPanel.add(QQ);QQ.setBounds(40, 70, 100, 20);
    
        KO.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                cn[0]=AA.getText();
                cn[1]=BB.getText();
                cn[2]=CC.getText();
                cn[3]=DD.getText();
                cn[4]=EE.getText();
                AAA.setText(String.valueOf(an[0]));
            BBB.setText(String.valueOf(an[1]));        
            CCC.setText(String.valueOf(an[2]));                
            DDD.setText(String.valueOf(an[3]));
            EEE.setText(String.valueOf(an[4]));
                for(int i=0;i<an.length;i++)
                if(String.valueOf(an[i]).equals(cn[i]))num++;
                QQ.setText(String.valueOf(num));
                }
        });
        fieldPanel.setVerifyInputWhenFocusTarget(true);
        
        
        A.setText(bn[0]);
        B.setText(bn[1]);
        C.setText(bn[2]);
        D.setText(bn[3]);
        E.setText(bn[4]);
        
        
        
        
this.add(fieldPanel);
this.setBounds(400, 400, 250, 270);
this.setVisible(true);





    }
     }

    
