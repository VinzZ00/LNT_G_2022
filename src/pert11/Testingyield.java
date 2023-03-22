package pert11;

public class Testingyield extends Thread{

	public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");
       
    }  
    public static void main(String[]args)  
    {  
        Testingyield t1 = new Testingyield();
//        t1.setName("t1");
        Testingyield t2 = new Testingyield();
//        t2.setName("t2");
        
        // this will call run() method  
        t1.start();  
        t2.start();  
        for (int i=0; i<3; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");
            
        }  
    }  

}
