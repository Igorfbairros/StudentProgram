package thread;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());

    private JLabel descricaoHora = new JLabel("Nome");
    private JTextField mostraTempo = new JTextField();
    
    private JLabel descricaoHora2 = new JLabel("email");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("Add Lista");
    private JButton jButton2 = new JButton("Stop");

    private ImplementacaoDeFilaThread fila = new ImplementacaoDeFilaThread();



    



    public TelaTimeThread(){ /*Executes whatever you have at the time of opening or execution */
        setTitle("Minha Tela de Time com Thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);
        /*First part concluded*/

        GridBagConstraints gridBagConstraints =  new GridBagConstraints(); /* Control position*/ 
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2; // occupies two place before the buttons
        gridBagConstraints.insets = new Insets(5, 10, 5, 10);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++ ;
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++ ;
        
        jPanel.add(mostraTempo, gridBagConstraints);

        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);


        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        
        jPanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1; // occupies a place before the buttons

        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy ++ ;
        jPanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx ++ ;
        jPanel.add(jButton2, gridBagConstraints);


        jButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) { /*Executa clique do botão */

                if(fila == null){
                    fila = new ImplementacaoDeFilaThread();
                    fila.start();
                }

                for(int qtd = 0; qtd < 100; qtd ++){// simulation the send only time  hundred email 
                    
                    ObjectFileThread filaThread = new ObjectFileThread();
                    filaThread.setName(mostraTempo.getText());
                    filaThread.setEmail(mostraTempo2.getText()+ " - N°" + (qtd + 1));
    
                    fila.add(filaThread);
                }
            }
 });

        jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                fila.stop();
                fila = null;
                

                
            }
        });


        
        


        fila.start();
        add(jPanel, BorderLayout.WEST);
        setVisible(true);/** Always gonna be the final  */

    }
}

    

