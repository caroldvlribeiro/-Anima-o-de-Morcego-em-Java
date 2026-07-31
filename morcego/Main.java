package morcego; // Define que esta classe pertence ao pacote "morcego".

import javax.swing.*; // Importa as classes do Swing (JFrame, SwingUtilities, etc.).

// Classe principal do programa.
public class Main {

    // Método principal, onde a execução do programa começa.
    public static void main(String[] args) {

        // Executa a criação da interface gráfica na Event Dispatch Thread (EDT),
        // que é a thread recomendada para aplicações Swing.
        SwingUtilities.invokeLater(() -> {

            // Cria uma janela com o título "Morcego Java".
            JFrame frame = new JFrame("Morcego Java");

            // Cria um objeto da classe Bat (painel onde o morcego será desenhado).
            Bat panel = new Bat();

            // Adiciona o painel à janela.
            frame.add(panel);

            // Define o tamanho da janela (largura e altura).
            frame.setSize(400, 400);

            // Faz o programa encerrar quando a janela for fechada.
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Centraliza a janela na tela.
            frame.setLocationRelativeTo(null);

            // Torna a janela visível.
            frame.setVisible(true);

        }); // Fecha corretamente o invokeLater.

    }

} //