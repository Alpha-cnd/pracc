
package com.mycompany.electronicsales;

public class Electronicsales {

    public static void main(String[] args) {
        
        


String [] electronic ={"PS5","XBOX","SWITCH"};

String [] place ={"Cape Town","Port Elizabeth","Pretoria"};

int [][] price_sales ={{1000,2000,1500},{2000,3000,1100},{3000,4000,1200}};

System.out.println("=====================");
System.out.println("GAMING CONSOLE REPORT");
System.out.println("====================="); 

        for(int y=0;y<electronic.length;y++) {
            System.out.print("\t" + electronic[y]+ "\t");
        }
System.out.println();

for(int outer=0;outer<place.length;outer++){
    System.out.print("" + place [outer] + "\t");
    
    for(int inner=0;inner<price_sales[outer].length;inner++){
        System.out.print("\t"+ price_sales[outer][inner] + "\t");
        
    }
    System.out.println();
    
}


System.out.println("================================");
System.out.println("Console sales total in each city");
System.out.println("================================"); 


for(int outer =0;outer<electronic.length;outer++){
    int total =0;
    System.out.print(""+ place [outer] + "\t");
    for(int inner=0; inner<price_sales[outer].length;inner++){
        total += price_sales[outer][inner];
    }
    System.out.println(total);
}
System.out.println();
    }
}
