package introducao;

import introducao.exercicio5.Agendamento;
import introducao.exercicio5.Medico;
import introducao.exercicio5.Paciente;
import java.util.Calendar;
import java.util.GregorianCalendar;
import introducao.exercicio5.Agenda;

public class App8 {
    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente();
        paciente1.setId(1);
        paciente1.setNome("Zezinho da silva");
        paciente1.setTelefone("5555-5555");

        Paciente paciente2 = new Paciente();
        paciente2.setId(2);
        paciente2.setNome("Huguinho da silva");
        paciente2.setTelefone("1234-5555");

        Paciente paciente3 = new Paciente();
        paciente3.setId(3);
        paciente3.setNome("Juninho da silva");
        paciente3.setTelefone("6699-5555");

        Paciente paciente4 = new Paciente();
        paciente4.setId(4);
        paciente4.setNome("Jefinho da silva");
        paciente4.setTelefone("5555-1234");

        Medico medico1 = new Medico();
        medico1.setCRM("555-55");
        medico1.setId(01);
        medico1.setNome("Dr. Dolirow ");

        Medico medico2 = new Medico();
        medico2.setCRM("777-55");
        medico1.setId(02);
        medico1.setNome("Dr. House");

        var agenda1 = new Agenda();
        agenda1.setId(1);
        agenda1.setMedico(medico1);

        var agenda2 = new Agenda();
        agenda2.setId(2);
        agenda2.setMedico(medico2);

        //new GregorianCalendar();  Calendar calendario =Calendar.getInstance(); dá certo também
        Calendar calendario =GregorianCalendar.getInstance();
        var agendamento1 = new Agendamento();
        agendamento1.setId(1);
        agendamento1.setMedico(medico1);
        agendamento1.setPaciente(paciente1);
        calendario.set(2022, 05, 19, 13, 00);
        agendamento1.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento1);

        var agendamento2 = new Agendamento();
        agendamento2.setId(2);
        agendamento2.setMedico(medico2);
        agendamento2.setPaciente(paciente1);
        calendario.set(2022, 05, 19, 13, 00);
        agendamento2.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento2);

        var agendamento3 = new Agendamento();
        agendamento3.setId(3);
        agendamento3.setMedico(medico1);
        agendamento3.setPaciente(paciente2);
        calendario.set(2022, 05, 15, 13, 45);
        agendamento3.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento3);

        var agendamento4 = new Agendamento();
        agendamento4.setId(4);
        agendamento4.setMedico(medico2);
        agendamento4.setPaciente(paciente2);
        calendario.set(2022, 05, 11, 8, 00);
        agendamento4.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento4);

        var agendamento5 = new Agendamento();
        agendamento5.setId(5);
        agendamento5.setMedico(medico1);
        agendamento5.setPaciente(paciente3);
        calendario.set(2022, 05, 9, 14, 40);
        agendamento5.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento5);

        var agendamento6 = new Agendamento();
        agendamento6.setId(6);
        agendamento6.setMedico(medico2);
        agendamento6.setPaciente(paciente3);
        calendario.set(2022, 05, 19, 18, 10);
        agendamento6.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento6);

        var agendamento7 = new Agendamento();
        agendamento7.setId(7);
        agendamento7.setMedico(medico1);
        agendamento7.setPaciente(paciente4);
        calendario.set(2022, 04, 19, 16, 00);
        agendamento7.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento7);

        var agendamento8 = new Agendamento();
        agendamento8.setId(8);
        agendamento8.setMedico(medico2);
        agendamento8.setPaciente(paciente4);
        calendario.set(2022, 05, 20, 15, 30);
        agendamento8.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento8);

        agenda1.imprimirAgenda();
        agenda2.imprimirAgenda();

    }
}
