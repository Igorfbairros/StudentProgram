package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoDeFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjectFileThread> pilha_filha = new ConcurrentLinkedQueue<>();

    public static void add(ObjectFileThread objectFileThread){
        pilha_filha.add(objectFileThread);
        
    }
    
        @Override
        public void run(){
            Iterator iterador = pilha_filha.iterator();
            while(iterador.hasNext()){ /*As long as there is data in the list it will interact  */

                ObjectFileThread processar = (ObjectFileThread) iterador.next();

                /**Processar 10 mil notas fiscais */
                /**Gerar uma lista enorme em PDF */
                /**Gerar um envio em massa de email */

                iterador.remove();

                try{
                    Thread.sleep(100); /*Dar um tempo para descarca da memoria*/
                }catch(InterruptedException e){
                    e.printStackTrace();

                }
        }
        try{
            Thread.sleep(100); /*Processa toda a lista e da um tempo pra limpesa de memoria*/
        }catch(InterruptedException e){
            e.printStackTrace();

        }
    }
    
}
