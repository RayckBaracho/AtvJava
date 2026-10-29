package TelaConsulta;

import javax.swing.*;

import ControllerConsulta.ControllerSistema;

public class TelaInicial extends JFrame {

    private static final long serialVersionUID = 1L;

    JLabel lblTitulo, lblBoasVindas;
    JButton btnAgendarConsulta;

    public TelaInicial() {
        setTitle("Sistema de Consultas Médicas");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblTitulo = new JLabel("Sistema de Consultas Médicas");
        lblTitulo.setBounds(130, 40, 250, 30);
        add(lblTitulo);

        lblBoasVindas = new JLabel("Bem-vindo(a) à clínica!");
        lblBoasVindas.setBounds(160, 120, 200, 25);
        add(lblBoasVindas);

        btnAgendarConsulta = new JButton("Agendar consulta");
        btnAgendarConsulta.setBounds(150, 220, 180, 30);
        add(btnAgendarConsulta);

        ControllerSistema controller = new ControllerSistema(this);
        btnAgendarConsulta.addActionListener(
            controller.acaoAbrirAgendamento()
        );
    }

    public static void main(String[] args) {
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }
}