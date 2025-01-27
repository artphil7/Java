package Interface;

import java.awt.*;

import javax.swing.*;

import Pessoas.Cliente;
import Pessoas.Tecnico;
import Servicos.ListaSolicitacao;
import Sistema.Gerenciador;

public class JanelaQuadSolicitTecnico extends JFrame
{
	public JPanel 	portatexto;
	public JLabel 	texto;
	public JPanel 	conteudo,
					botoes;
	public JTextField 	nome,
						email,
						formac;
	public JList	solicitacao;
	public int 		tecnicoid;
	public JButton 	confirma,
					nova,
					volta;
	public JComboBox<String> listaFormacao;
	public ListaSolicitacao solicitacoes;
	
	public JanelaQuadSolicitTecnico (Tecnico tecnico)
	{
		/*Texto da barra superior*/
		setTitle("Fazconcertos Solu��es em Servi�os");
		
		/*Texto de informa��o*/
		portatexto = new JPanel ();
		texto = new JLabel ("TECNICO");
		portatexto.add(texto);
		add(portatexto, BorderLayout.PAGE_START);

		/*Conteudo*/
		conteudo =  new JPanel ();
		conteudo.setLayout(new BoxLayout(conteudo, BoxLayout.Y_AXIS));
						
		JPanel portanom = new JPanel();
		portanom.setLayout(new GridLayout(3, 1));
		
		portanom.add( new JLabel("Tecnico ID: #" + tecnico.getId()));
		
		portanom.add( new JLabel("Cliente"));
		
		nome = new JTextField(tecnico.getNome(), 41);
		nome.setEditable(false);
		JPanel portaTexto1 = new JPanel();
		portaTexto1.add(nome);
		portanom.add(portaTexto1);
		
		conteudo.add(portanom);

		JPanel portacont = new JPanel();
		portacont.setLayout(new GridLayout(0, 2));
		
		portacont.add(new JLabel("Email"));
		portacont.add(new JLabel("Forma��o"));
				
		email = new JTextField(tecnico.getEmail(), 20);
		email.setEditable(false);
		JPanel portaTexto2 = new JPanel();
		portaTexto2.add(email);
		portacont.add(portaTexto2);
		
		formac = new JTextField(Tecnico.formacoes[tecnico.getFormacao()], 20);
		formac.setEditable(false);
		JPanel portaTexto3 = new JPanel();
		portaTexto3.add(formac);
		portacont.add(portaTexto3);
		
		portacont.add(new JLabel("Solicita��o"));
		conteudo.add(portacont);
		
		solicitacoes = Gerenciador.listaSolicitacao.BuscaTodos(tecnico.getFormacao(), 'a');
		
		System.out.println(solicitacoes);
		
		solicitacao = new JList<String>(solicitacoes.toArray());
		JScrollPane portaTexto5 = new JScrollPane(solicitacao);
		conteudo.add(portaTexto5);
		
		add(conteudo, BorderLayout.CENTER);
		
		/*Bot�es de a��o*/
		botoes = new JPanel ();
		
		confirma = new JButton ("Seleciona");
		confirma.addActionListener(new BotaoSolicitacaoSel(this, tecnico, 2));
		botoes.add(confirma);
		
		volta = new JButton ("Volta");
		volta.addActionListener(new BotaoVolta());
		botoes.add(volta);
		
		add(botoes, BorderLayout.PAGE_END);
		

		/*Configura��es da Janela*/
		setSize(470, 600);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
