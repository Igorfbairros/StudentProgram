package thread;

import javax.swing.JOptionPane;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {

        new Thread(){
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
        }.start();/*Start the program to run in parallel */
        
        /*FIM DO CODIGO EM PARALELO*/

        System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
        JOptionPane.showMessageDialog(null, "Systema continiua executando para o usuario");

        
    }
    
}
