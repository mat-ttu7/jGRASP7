import javax.swing.JOptionPane;

public class TesteAtribuicao {
   public static void main (String [] args) {
      String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do professor");
      int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor"));
      Professor professor = new Professor(nomeProfessor, idadeProfessor);
      
      String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
      String sePratica = JOptionPane.showInputDialog("A disciplina é prática?");
      boolean pratica = sePratica.equals("sim") ? true : false;
      Disciplina disciplina = new Disciplina(nomeDisciplina, pratica);
      
      Atribuicao atribuicao = new Atribuicao(professor, disciplina);
      JOptionPane.showMessageDialog(null, atribuicao.getDados());
   }
}