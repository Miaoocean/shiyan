
    
import java.util.Random;


public class suanfa {
    int a,b,c,d;
    int an[]=new int [5];
    String bn[]=new String [5];
    Random cn =new Random();
    suanfa(){
        int i=0;
        do{    
        a=cn.nextInt(100);
        b=cn.nextInt(100);
        d=cn.nextInt(100)%4+1;
        switch(d){
            case 1:
                an[i]=a+b;
                bn[i]=String.valueOf(a)+"+"+String.valueOf(b)+"=";
                i++;
                break;
            case 2: 
                an[i]=a-b;
                bn[i]=String.valueOf(a)+"-"+String.valueOf(b)+"=";
                i++;break;
            case 3:an[i]=a*b;
            bn[i]=String.valueOf(a)+"*"+String.valueOf(b)+"=";
            i++;
                break;
            case 4:an[i]=a/b;
            bn[i]=String.valueOf(a)+"/"+String.valueOf(b)+"=";
            i++;break;
        }
        }while(i<5);
        for(int j=0;j<bn.length;j++)
            {System.out.println(bn[j]);System.out.println(an[j]);
            }
        new yunsuan(an,bn);
    }
    
}