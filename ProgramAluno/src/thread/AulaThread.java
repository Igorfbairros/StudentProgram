package thread;

import javax.swing.JOptionPane;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {

        //\thread processamento para envio de um email    
        Thread  threadEmail = new Thread(thread1);
        threadEmail.start();
    
        //*****Div Threads */

        //Envio de Nota Fiscal 
        Thread threadENF = new Thread(thread2);
        threadENF.start();
            
        /*FIM DO CODIGO EM PARALELO*/

        System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
        JOptionPane.showMessageDialog(null, "Systema continiua executando para o usuario");

        
    
    };

    private static Runnable thread1 = new Runnable(){
        @Override
        public void run() {// Do what we want 
            //contained in the routine 
            for(int i = 0; i < 10; i++){

                /*I want to wait a few seconds before executing*/
                System.out.println("Executando algo rotina, por exemplo um email");
             
                try{
                    Thread.sleep(1000);
                    
                }catch(InterruptedException e){
                    e.printStackTrace();
                }//Give it a rest
            }
            // End of parallel code 
            
        };
    };/*Start the program to run in parallel */

    private static Runnable thread2 = new Runnable(){
        @Override
            public void run() {// Do what we want 
                //contained in the routine 
                for(int i = 0; i < 10; i++){

                    /*I want to wait a few seconds before executing*/
                    System.out.println("Executando algo rotina, Envio de Nota Fiscal");
                 
                    try{
                        Thread.sleep(2000);
                        
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }//Give it a rest
                }
                // End of parallel code 
                
            };
        };
    };
    
        
        

    

