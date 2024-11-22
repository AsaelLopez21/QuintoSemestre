/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.blackjack;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnos
 */
public class tablero extends javax.swing.JFrame {
   private Barajas barajas;
    private Jugador jugadorUno;
    private Jugador jugadorDos;
    private Crupier crupier;
    private String turno;
    
    public tablero() {
        initComponents();
        turno = "J1";
        //dos jugadores
        jugadorUno = new Jugador("Luis");
        //segundo jugador
        jugadorDos = new Jugador("Asael");
        //creamos el crupier
        crupier = new Crupier();
        //barajas
        barajas = new Barajas();
        barajas.barajar();
        //repartir las primeras cartas a todos los jugadores
        jugadorUno.recibirCarta(barajas.sacarCarta());
        jugadorDos.recibirCarta(barajas.sacarCarta());
        crupier.recibirCarta(barajas.sacarCarta());
        
        jugadorUno.recibirCarta(barajas.sacarCarta());
        jugadorDos.recibirCarta(barajas.sacarCarta());
        Carta ultimaCarta = barajas.sacarCarta();
        crupier.recibirCarta(ultimaCarta);
        
        //mostramos los valores de cada jugador
        jugadorUnoNombre.setText("Nombre: " + jugadorUno.getNombre());
        contadorJ1.setText("Contador: " + String.valueOf(jugadorUno.calcularPunuacion()));
        cartasJ1.setText("Numero de cartas: " + String.valueOf(jugadorUno.getCartasEnMano()));
        
        //jugador dos
        jugadorDosNombre.setText("Nombre: " + jugadorDos.getNombre());
        contadorJ2.setText("Contador: " + String.valueOf(jugadorDos.calcularPunuacion()));
        cartasJ2.setText("Numero de cartas: " + String.valueOf(jugadorDos.getCartasEnMano()));
        
        //CRUPIER
        CrupierNombre.setText("Nombre: " + crupier.getNombre());
        crupierContador.setText("Contador: " + String.valueOf(crupier.calcularPunuacion()));
        crupierCartas.setText("Numero de cartas: " + String.valueOf(crupier.getCartasEnMano()));
        
        valorCarta.setText(ultimaCarta.numero + " " + ultimaCarta.palo);
        labelTurno.setText("Turno de: " + turno);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carta = new javax.swing.JPanel();
        valorCarta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CrupierNombre = new javax.swing.JLabel();
        crupierContador = new javax.swing.JLabel();
        crupierCartas = new javax.swing.JLabel();
        contJ1 = new javax.swing.JPanel();
        btnPedirJ1 = new javax.swing.JButton();
        btnMantenerJ1 = new javax.swing.JButton();
        jugadorUnoNombre = new javax.swing.JLabel();
        contadorJ1 = new javax.swing.JLabel();
        cartasJ1 = new javax.swing.JLabel();
        contJ2 = new javax.swing.JPanel();
        btnPedirJ2 = new javax.swing.JButton();
        btnMantenerJ2 = new javax.swing.JButton();
        jugadorDosNombre = new javax.swing.JLabel();
        contadorJ2 = new javax.swing.JLabel();
        cartasJ2 = new javax.swing.JLabel();
        labelTurno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        carta.setBackground(new java.awt.Color(255, 255, 255));
        carta.setForeground(new java.awt.Color(0, 0, 0));

        valorCarta.setForeground(new java.awt.Color(0, 0, 0));
        valorCarta.setText("2 corazones");

        javax.swing.GroupLayout cartaLayout = new javax.swing.GroupLayout(carta);
        carta.setLayout(cartaLayout);
        cartaLayout.setHorizontalGroup(
            cartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(valorCarta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartaLayout.setVerticalGroup(
            cartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(valorCarta)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        CrupierNombre.setText("Crupier");

        crupierContador.setText("Contador: 15");

        crupierCartas.setText("Cartas: 2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CrupierNombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crupierCartas)
                            .addComponent(crupierContador))
                        .addGap(0, 157, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CrupierNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crupierContador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crupierCartas)
                .addGap(45, 45, 45))
        );

        contJ1.setBackground(new java.awt.Color(0, 102, 0));
        contJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btnPedirJ1.setBackground(new java.awt.Color(204, 102, 0));
        btnPedirJ1.setText("pedir (A)");
        btnPedirJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirJ1ActionPerformed(evt);
            }
        });

        btnMantenerJ1.setBackground(new java.awt.Color(153, 0, 0));
        btnMantenerJ1.setText("mantener (S)");
        btnMantenerJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenerJ1ActionPerformed(evt);
            }
        });

        jugadorUnoNombre.setText("JUGADOR 1");

        contadorJ1.setText("Contador: 15");

        cartasJ1.setText("Cartas: 2");

        javax.swing.GroupLayout contJ1Layout = new javax.swing.GroupLayout(contJ1);
        contJ1.setLayout(contJ1Layout);
        contJ1Layout.setHorizontalGroup(
            contJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contJ1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contJ1Layout.createSequentialGroup()
                        .addComponent(btnPedirJ1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMantenerJ1)
                        .addGap(23, 23, 23))
                    .addGroup(contJ1Layout.createSequentialGroup()
                        .addComponent(jugadorUnoNombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contJ1Layout.createSequentialGroup()
                        .addGroup(contJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartasJ1)
                            .addComponent(contadorJ1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        contJ1Layout.setVerticalGroup(
            contJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contJ1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jugadorUnoNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorJ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cartasJ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPedirJ1)
                    .addComponent(btnMantenerJ1))
                .addContainerGap())
        );

        contJ2.setBackground(new java.awt.Color(0, 102, 0));
        contJ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btnPedirJ2.setBackground(new java.awt.Color(204, 102, 0));
        btnPedirJ2.setText("pedir (O)");
        btnPedirJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirJ2ActionPerformed(evt);
            }
        });

        btnMantenerJ2.setBackground(new java.awt.Color(153, 0, 0));
        btnMantenerJ2.setText("mantener (P)");
        btnMantenerJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenerJ2ActionPerformed(evt);
            }
        });

        jugadorDosNombre.setText("JUGADOR 1");

        contadorJ2.setText("Contador: 15");

        cartasJ2.setText("Cartas: 2");

        javax.swing.GroupLayout contJ2Layout = new javax.swing.GroupLayout(contJ2);
        contJ2.setLayout(contJ2Layout);
        contJ2Layout.setHorizontalGroup(
            contJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contJ2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contJ2Layout.createSequentialGroup()
                        .addComponent(btnPedirJ2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMantenerJ2)
                        .addGap(23, 23, 23))
                    .addGroup(contJ2Layout.createSequentialGroup()
                        .addComponent(jugadorDosNombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contJ2Layout.createSequentialGroup()
                        .addGroup(contJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartasJ2)
                            .addComponent(contadorJ2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        contJ2Layout.setVerticalGroup(
            contJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contJ2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jugadorDosNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorJ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cartasJ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPedirJ2)
                    .addComponent(btnMantenerJ2))
                .addContainerGap())
        );

        labelTurno.setText("Turno de: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(contJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(169, 169, 169)
                .addComponent(contJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTurno)
                            .addComponent(carta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)))
                .addGap(207, 207, 207))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(labelTurno)
                .addGap(18, 18, 18)
                .addComponent(carta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TurnoCrupier(){
       //programmos el turno del crupier
    }
    private void FinalizarJuego(){
        //validar quien gano
        /*
        El cupier es quie reparte las cartas
        existen dos casos para finalizar el juego
        si el crupier se paso de 21
            entonces hay que ver si los dos jugadores no se pasaron de 21, en este caso ambos ganan
            si un jugador de paso de 21, entonces pierde ese jugador
            o si los dos se pasaron de 21, entonces todos pierden
        si el crupier no se paso de 21
            entonces hay que ver que jugador tiene mas puntuacion qeu crupier pero sin pasarse de 21
            o si existe algun empate
            o si gano el crupier
        */
    }
    private void btnPedirJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirJ1ActionPerformed
        
        if(turno.equals("J1") || jugadorDos.getEstado().equals("no jugando")){
            Carta carta = barajas.sacarCarta();
            
            //tomamos una carta nueva
            valorCarta.setText(carta.getNumero()+""+carta.getPalo());
            jugadorUno.recibirCarta(carta);
            //mostramos los valores en el tablero
            int puntuacion = jugadorUno.calcularPunuacion();
            contadorJ1.setText("Contador: "+String.valueOf(puntuacion));
            cartasJ1.setText("Numero de cartas: "+String.valueOf(jugadorUno.getCartasEnMano()));
            //indicamos que es el turno del jugador dos
            
            
            
            //validar que aun no haya perdido
            if(puntuacion > 21){
                cartasJ1.setText("USTED PERDIO PASO EL LIMITE DE 21");
                contJ1.setBackground(Color.red);
                contJ1.setForeground(Color.white);
                jugadorUnoNombre.setForeground(Color.white);
                btnPedirJ1.setVisible(false);
                btnMantenerJ1.setVisible(false);
                turno = "J2";
                jugadorUno.setEstado();
            }    
            
            //verificamos que el segundo jugador aun este jugando
            if(jugadorDos.getEstado().equals("Jugando")){
                turno = "J2";
            }else{
                turno = "J1";
            }
            labelTurno.setText("turno del "+turno);
        }else{
            //sacar ventana emerjente
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Aun no es tu turno");
        }   
    }//GEN-LAST:event_btnPedirJ1ActionPerformed

    private void btnPedirJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirJ2ActionPerformed
        if(turno.equals("J2") || jugadorUno.getEstado().equals("no jugando")){
            Carta carta = barajas.sacarCarta();
            valorCarta.setText(carta.getNumero()+""+carta.getPalo());
            jugadorDos.recibirCarta(carta);
            
            //mostrar valores en la mesa
            int puntuacion = jugadorDos.calcularPunuacion();
            contadorJ2.setText("Contador: "+String.valueOf(puntuacion));
            cartasJ2.setText("Numero de cartas: "+String.valueOf(jugadorDos.getCartasEnMano()));
            //cambiamos de turno
            if(puntuacion > 21){
                cartasJ2.setText("USTED PERDIO PASO EL LIMITE DE 21");
                contJ2.setBackground(Color.red);
                contJ2.setForeground(Color.white);
                jugadorDosNombre.setForeground(Color.white);
                btnPedirJ2.setVisible(false);
                btnMantenerJ2.setVisible(false);
                turno = "J1";
                jugadorDos.setEstado();
            } 
            if(jugadorUno.getEstado().equals("Jugando")){
                turno = "J1";
            }else{
                turno = "J2";
            }
            labelTurno.setText(turno);
        }else{
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Aun no es tu turno");
        }
    }//GEN-LAST:event_btnPedirJ2ActionPerformed

    private void btnMantenerJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenerJ1ActionPerformed
        
        if(turno.equals("J1")){
            btnPedirJ1.setVisible(false);
            btnMantenerJ1.setVisible(false);
            jugadorUno.setEstado();
        }else{
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Aun no es tu turno");
        }
    }//GEN-LAST:event_btnMantenerJ1ActionPerformed

    private void btnMantenerJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenerJ2ActionPerformed
        // TODO add your handling code here:
        if(turno.equals("J2")){
            btnMantenerJ2.setVisible(false);
            btnPedirJ2.setVisible(false);
            jugadorDos.setEstado();
        }else{
             JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Aun no es tu turno");
        }
    }//GEN-LAST:event_btnMantenerJ2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CrupierNombre;
    private javax.swing.JButton btnMantenerJ1;
    private javax.swing.JButton btnMantenerJ2;
    private javax.swing.JButton btnPedirJ1;
    private javax.swing.JButton btnPedirJ2;
    private javax.swing.JPanel carta;
    private javax.swing.JLabel cartasJ1;
    private javax.swing.JLabel cartasJ2;
    private javax.swing.JPanel contJ1;
    private javax.swing.JPanel contJ2;
    private javax.swing.JLabel contadorJ1;
    private javax.swing.JLabel contadorJ2;
    private javax.swing.JLabel crupierCartas;
    private javax.swing.JLabel crupierContador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jugadorDosNombre;
    private javax.swing.JLabel jugadorUnoNombre;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JLabel valorCarta;
    // End of variables declaration//GEN-END:variables
}
