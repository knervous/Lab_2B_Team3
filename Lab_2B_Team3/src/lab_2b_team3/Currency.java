
package lab_2b_team3;


public class Currency {
    
            
            public Currency()
            {
                
            }
            
            public String getBills(int withdrawalAmount)
            {
                int[] bills = new int [5];
                String output="";
                bills[0] = withdrawalAmount / 50;
                withdrawalAmount = withdrawalAmount % 50;
                bills[1] = withdrawalAmount / 20;
                withdrawalAmount = withdrawalAmount % 20;
                bills[2] = withdrawalAmount / 10;
                withdrawalAmount = withdrawalAmount % 10;
                bills[3] = withdrawalAmount / 5;
                withdrawalAmount = withdrawalAmount % 5;
                bills[4] = withdrawalAmount / 1;
                
                if(bills[0]>0)
                    output += bills[0]+" fifty dollar bills ";
                if(bills[1]>0)
                    output += bills[1]+" twenty dollar bills ";
                if(bills[2]>0)
                    output += bills[2]+" ten dollar bills ";
                if(bills[3]>0)
                    output += bills[3]+" five dollar bills ";
                if(bills[4]>0)
                    output += bills[4]+" one dollar bills ";
                
                
                
                return output;
            }
    
}
