package morcego;
import java.awt.*; //classes de desenho 2d
import javax.swing.*; // importa classe do Swign para GUI

// classe principal da animação
public class Bat extends JPanel {
    double angle = 0; //angulo usado para o movimento das asas
    int x = 200;
    int y = 200;

    int velocidadeX = 3;
    int velocidadeY = 2;

    //construtor
    public Bat(){
        setBackground(Color.DARK_GRAY);// define a cor do fundo da janela

        //criar um timer que dispara a cada 30ms
        Timer timer = new Timer(30,e -> {
            angle += 0.2; // atualiza o angulo para movimentar a asa
            x += velocidadeX;
            y += velocidadeY;

            if (x <= 20 || x >= getWidth() - 20) {
                velocidadeX *= -1;
            }

            if (y <= 20 || y >= getHeight() - 20) {
                velocidadeY *= -1;
            }

            repaint();// pede para a tela redesenhar;

        });
        timer.start(); //inicia o timer
    }
    // metodo chamado automaticamente para desenhar
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);// limpa o painel antes de desenhar

        Graphics2D g2 = (Graphics2D) g; //converte para graphics2d
        g2.setColor(Color.black);//cor do morcego

        g2.setStroke(new BasicStroke(2));

        // Desenha o corpo do morcego.
        g2.fillOval(x - 10, y - 10, 20, 20);

        int wingOffset = (int)(Math.sin(angle) * 20);

        int[] leftX = {x, x - 40, x - 20};
        int[] leftY = {y, y - wingOffset, y};

        g2.fillPolygon(leftX, leftY, 3);

        int[] rightX = {x, x + 40, x + 20};
        int[] rightY = {y, y - wingOffset, y};

        g2.fillPolygon(rightX, rightY, 3);

    }
}

