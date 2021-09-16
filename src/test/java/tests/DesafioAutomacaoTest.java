package tests;


import entities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DesafioCadastroPage;

//@Listeners(TM4JTestNGListener.class)
public class DesafioAutomacaoTest extends BaseTest {

    String nome = "Giovannini";
    String sobrenome = "Barbosa";
    String sugestoes = "colocar o codigo no git";


    @Test
    public void deveCadastrarPessoaExemplo() {
        DesafioCadastroPage cp = new DesafioCadastroPage(getDriver());
        cp.preencherNome(nome)
                .preencherSobrenome(sobrenome)
                .preencherSugestao(sugestoes)
                .clicarSexo()
                .clicarComidaCarne()
                .clicarComidaFrango()
                .clicarComidaPizza()
                .ClicarComidaVegetariana()
                .clicarCadastrar()
                .aceiteAlertVegano()
                .ClicarComidaVegetariana()
                .clicarCadastrar();

        Assert.assertEquals(cp.buscarLabelNome(), "Nome: "+nome);
        Assert.assertEquals(cp.buscarLabelSobrenome(), "Sobrenome: "+sobrenome);
        Assert.assertEquals(cp.buscarLabelSexo(), "Sexo: "+"Feminino");
        Assert.assertEquals(cp.buscarLabelComida(), "Comida: "+"Carne Frango Pizza");
        Assert.assertEquals(cp.buscarLabelEscolaridade(), "Escolaridade: "+"1grauincomp");
        Assert.assertEquals(cp.buscarLabelSugestoes(), "Sugestoes: "+"colocar o codigo no git");
    }


}