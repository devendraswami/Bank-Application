import java.util.Scanner;

class Bank 
{
    // Intilized the    balance variable 
    private double balance;

    public void checkBalance()
    {
        System.out.println("Your bank Balance is-  $" + balance);
    }


    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Your Amount has been depoisted Successfully, Now your Balnace is- $" + balance );
    }


    public void Withdrow(double amount)
    {
        if(balance < amount)
        {
            System.out.println("You Do not have enough balance, Sorry you can't Withdraw ");
        }
        
        else if(balance==0)
        {
            System.out.println("Your Account Balance is Zero, Sorry you can to withdraw ");
        }
        
        else 
        {
            balance -= amount;
            System.out.println("Your Amount has been Withdrawl Successfully, Now your Balance is-  $" + balance );
        }
       
    }
     
    
}







class Main 
{
    public static void main(String[] args) 
    {
        Bank bank = new Bank();
        System.out.println("Hello, Welcome to our Bank App! ");
       
        
        Scanner scan = new Scanner(System.in);
      
        do 
        { 
            // Asking for What coustemer Wants 
            
            System.out.println("What would you like to do ? ");
            System.out.println("1) Check Balance  ");
            System.out.println("2)  Withdrow Cash ");
            System.out.println("3) Depoist ");
            System.out.println("4) Exit App ");

            int choice = scan.nextInt();
            if(choice == 1)
            {
               bank.checkBalance();
            }

            else if(choice == 2 )
            { 
                double amount = 0;
                System.out.println("Entre the amount you want to withdrow ");
                amount = scan.nextDouble();

                if(amount<=0) 
                {
                    System.out.println("You can't withdraw negative or Zero Amount ");
                }

                else 
                {
                   
                    bank.Withdrow(amount);

                }
              
            }

            else if(choice ==3)
            {
                double amount =0;
                System.out.println("Entre the amount you want to deposit ");
                amount = scan.nextDouble();

                if(amount <=0)
                {
                    System.out.println("YOu can't Deposit negative or Zero Amount ");
                }

                else{
                    bank.deposit(amount);
                }
                
            }

            else if(choice == 4)
            {
                System.out.println("ThankYOu for visiting our Bank Application ");
                System.exit(choice);
            }

            else
            {
                System.out.println("Entre the right index between 1-4 ");
            }
    
        }
            while(true);
       

    }
}