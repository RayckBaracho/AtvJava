package ControllerConsulta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import TelaConsulta.TelaInicial;
import TelaConsulta.TelaAgendamento;

public class ControllerSistema {

    private TelaInicial telaInicial;
    private TelaAgendamento telaAgendamento;

    private JTextField txtNomePaciente;
    private JTextField txtEspecialidade;

    public ControllerSistema(TelaInicial telaInicial) {
        this.telaInicial = telaInicial;
    }

    public ControllerSistema(
        JTextField txtNomePaciente,
        JTextField txtEspecialidade,
        TelaAgendamento telaAgendamento
    ) {
        this.txtNomePaciente = txtNomePaciente;
        this.txtEspecialidade = txtEspecialidade;
        this.telaAgendamento = telaAgendamento;
    }

    public ActionListener acaoAbrirAgendamento() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                TelaAgendamento tela = new TelaAgendamento();
                tela.setVisible(true);

                telaInicial.dispose();
            }
        };
    }

    public ActionListener acaoConfirmarAgendamento() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nome = txtNomePaciente.getText().trim();
                String especialidade =
                    txtEspecialidade.getText().trim();

                if (nome.equals("") ||
                    especialidade.equals("")) {

                    JOptionPane.showMessageDialog(
                        telaAgendamento,
                        "Preencha todos os campos!",
                        "Atenção",
                        JOptionPane.WARNING_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                        telaAgendamento,
                        "Agendamento confirmado!\n\n"
                        + "Paciente: " + nome + "\n"
                        + "Especialidade: " + especialidade,
                        "Confirmação",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        };
    }

    public ActionListener acaoLimpar() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                txtNomePaciente.setText("");
                txtEspecialidade.setText("");
                txtNomePaciente.requestFocusInWindow();
            }
        };
    }

    public ActionListener acaoVoltar() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                TelaInicial tela = new TelaInicial();
                tela.setVisible(true);
                telaAgendamento.dispose();
            }
        };
    }
}