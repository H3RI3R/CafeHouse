// package coffee1;


import java.util.*;
// import Type.Stud;
public class CoffeMain {
  // package coffee1;
public static class Coffee { 
   String name;
   double Money;
   String[] s = new String[]{"Espresso+Milk","Espresso+cream","Espresso+latte","Cappuccino+Milk","Cappuccino+cream","Cappucino+Latte","Latte+Milk","Latte+Cream","Latte+Latte"};
   int[] rate = new int[]{60,75,100,80,90,125,100,125,150};
   int[] qt = new int[9];
Coffee(String name2){
this.name = name2;
} 
  public  void menuData(){
   // System.out.println("");
       Scanner sc = new Scanner(System.in);
       System.out.println("Please select the coffee you want .\n");
       System.out.println("Enter the Selected option(1-3)");
       System.out.println("1. Espresso");
       System.out.println("2. Cappuccino");
       System.out.println("3. Latte");
       System.out.println("4. Exit");
       int option = sc.nextInt();
       if(option ==1){
               Espresso();

       }        
       else if(option ==2){
           Cappuccino();
       }
       else if(option ==3){
           Latte();
       }
       else if(option ==4){
           return ;
       }
       else{
           System.out.println("Wrong Choice !!!!!! Please select from the given options");
           menuData();
       }
  }
   public void Latte() {
       System.out.println("You have selected Latte.\n Now Please Select AddOns.");
       System.out.println("1 . Milk");
       System.out.println("2 . Cream");
       System.out.println("3 . Latte");
       Scanner we = new Scanner(System.in);
       int b = we.nextInt();
       if(b==1){
        Money +=100;

        System.out.println("You have Selected "+s[6]+" So you added "+rate[6]+" to your Bill.");
       //  System.out.println(Money);
       qt[6]++;
       contiNue();
       } 
       else if(b==2){
        Money += 125;
        System.out.println("You have Selected "+s[7]+" So you added "+rate[7]+" to your Bill.");
       //  System.out.println(Money);
       qt[7]++;
        contiNue();
       }
       else if (b ==3 ){
        Money +=150;
        System.out.println("You have Selected "+s[8]+" So you added "+rate[8]+ " to your Bill.");
       //  System.out.println(Money);
       qt[8]++;
        contiNue();
      
    }
    else{
        System.out.println("Wrong Selection!!!Please Select Again ");
        Latte();
    }
   }
   public double contiNue() {
       System.out.println("Do you want to Order More Coffee?(y/n)");
       Scanner sc  =  new Scanner(System.in);
       String  option3 = sc.nextLine();
       
       if(option3.equals("y")){
           
           menuData();
       }
       else{
           System.out.println("You Have Purchsed :");
           for(int i =0;i<9;i++){
               if(qt[i]>=1){
                   System.out.println(s[i]+"------------>"+rate[i]);
                   System.out.println("");
               }
           }
           System.out.print("So "+name+" your total Bill is Of -:");
           System.out.print(Money);
           // return Money;
       }return Money;
   }
   public void Cappuccino() {
       System.out.println("You have selected Cappuccino.\n Now Please Select AddOns.");
       System.out.println("1 . Milk");
       System.out.println("2 . Cream");
       System.out.println("3 . Latte");
       Scanner we = new Scanner(System.in);
       int b = we.nextInt();
       if(b==1){
        Money +=80;
        System.out.println("You have Selected "+s[3]+" So you added "+rate[3]+ " to your Bill.");
        System.out.println(Money);
        qt[3]++;
        contiNue();
       } 
       else if(b==2){
        Money += 90;
        System.out.println("You have Selected "+s[4]+" So you added "+rate[4]+ " to your Bill.");
        System.out.println(Money);
        qt[4]++;
        contiNue();
       }
       else if (b ==3 ){
        Money +=125;
        System.out.println("You have Selected "+s[5]+" So you added "+rate[5]+ " to your Bill.");
        System.out.println(Money);
        qt[5]++;
        contiNue();
      
    }
    else{
        System.out.println("Wrong Selection!!!Please Select Again");
        Cappuccino();
    }
   }
   public void Espresso() {
      System.out.println("You have selected Espresso.\n Now Please Select AddOns.");
      System.out.println("1 . Milk");
      System.out.println("2 . Cream");
      System.out.println("3 . Latte");
      Scanner we = new Scanner(System.in);
      int b = we.nextInt();
      if(b==1){
       Money +=60;
       System.out.println("You have Selected "+s[0]+" So you added "+rate[0]+ " to your Bill.");
       System.out.println(Money);
       qt[0]++;
       contiNue();
      } 
      else if(b==2){
       Money += 75;
       System.out.println("You have Selected "+s[1]+" So you added "+rate[1]+ " to your Bill.");
       System.out.println(Money);
       qt[1]++;
       contiNue();
      }
      else if (b ==3 ){
       Money +=100;
       System.out.println("You have Selected "+s[2]+" So you added "+rate[2]+ " to your Bill.");
       System.out.println(Money);
       qt[2]++;
       contiNue();
     
   }
   else{
       System.out.println("Wrong Selection!!!Please Select Again");
       Latte();
   }

}}
    public static  void main(String[] args) {  
		// new CoffeMain().jairamjiki();
   
    Scanner sc= new Scanner(System.in);
    System.out.println("****************************************************");
    System.out.println("------------------The COFFEE HOUSE----------------\n");
    System.out.println("****************************************************");
    System.out.println("\t\t\t\t\t\t-By Ritik Soni (20ESKCS204)");
    System.out.println("What is Your Name :-");
    String name = sc.nextLine();
    System.out.println("Hello "+name+" Welcome to COFFEE HOUSE.");
    
    Coffee s1 = new Coffee(name);
    s1.menuData();
    }
}
