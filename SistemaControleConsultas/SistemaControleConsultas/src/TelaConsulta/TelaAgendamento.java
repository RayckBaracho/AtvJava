package TelaConsulta;

import javax.swing.*;
import ControllerConsulta.ControllerSistema;

public class TelaAgendamento extends JFrame {

    private static final long serialVersionUID = 1L;

    JLabel lblTitulo, lblNomePaciente, lblEspecialidade;
    JTextField txtNomePaciente, txtEspecialidade;
    JButton btnConfirmar, btnLimpar, btnVoltar;

    public TelaAgendamento() {
        setTitle("Agendamento de Consulta");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblTitulo = new JLabel("Agendamento de Consulta");
        lblTitulo.setBounds(150, 30, 250, 30);
        add(lblTitulo);

        lblNomePaciente = new JLabel("Nome do paciente:");
        lblNomePaciente.setBounds(55, 90, 130, 25);
        add(lblNomePaciente);

        txtNomePaciente = new JTextField();
        txtNomePaciente.setBounds(190, 90, 240, 25);
        add(txtNomePaciente);

        lblEspecialidade = new JLabel("Especialidade médica:");
        lblEspecialidade.setBounds(55, 140, 130, 25);
        add(lblEspecialidade);

        txtEspecialidade = new JTextField();
        txtEspecialidade.setBounds(190, 140, 240, 25);
        add(txtEspecialidade);

        btnConfirmar = new JButton("Confirmar agendamento");
        btnConfirmar.setBounds(20, 290, 200, 30);
        add(btnConfirmar);

        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(230, 290, 100, 30);
        add(btnLimpar);

        btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(340, 290, 120, 30);
        add(btnVoltar);

        ControllerSistema controller = new ControllerSistema(
            txtNomePaciente, txtEspecialidade, this
        );

        btnConfirmar.addActionListener(
            controller.acaoConfirmarAgendamento()
        );

        btnLimpar.addActionListener(controller.acaoLimpar());

        btnVoltar.addActionListener(controller.acaoVoltar());
    }
}