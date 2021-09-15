package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesafioCadastroPage extends BasePage {

    public DesafioCadastroPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "elementosForm:nome")
    private WebElement nomeTextField;

    @FindBy(id = "elementosForm:sobrenome")
    private WebElement sobrenomeTextField;

    @FindBy(xpath = "//*[@id=\"elementosForm:sexo:1\"]")
    private WebElement sexoRadioButton;

    @FindBy(id = "elementosForm:comidaFavorita:0")
    private WebElement carne;

    @FindBy(id = "elementosForm:comidaFavorita:1")
    private WebElement frango;

    @FindBy(id = "elementosForm:comidaFavorita:2")
    private WebElement pizza;

    @FindBy(id = "elementosForm:comidaFavorita:3")
    private WebElement vegetariano;

    @FindBy(name = "elementosForm:sugestoes")
    private WebElement sugestaoText;

    @FindBy(id = "elementosForm:cadastrar")
    private WebElement cadastrarButton;

    @FindBy(id = "descNome")
    private WebElement LabelNome;

    @FindBy(id = "descSobrenome")
    private WebElement LabelSobrenome;

    @FindBy(id = "descSexo")
    private WebElement LabelSexo;

    @FindBy(id = "descComida")
    private WebElement LabelComida;

    @FindBy(id = "descEscolaridade")
    private WebElement LabelEscolaridade;

    @FindBy(id = "descEsportes")
    private WebElement LabelEsportes;

    @FindBy(id = "descSugestoes")
    private WebElement LabelSugestoes;


    public DesafioCadastroPage preencherNome(String nome) {
        nomeTextField.sendKeys(nome);
        return this;
    }

    public DesafioCadastroPage preencherSobrenome(String sobrenome) {
        sobrenomeTextField.sendKeys(sobrenome);
        return this;
    }

    public DesafioCadastroPage clicarCadastrar() {
        cadastrarButton.click();
        return this;
    }

    public DesafioCadastroPage clicarSexo() {
        sexoRadioButton.click();
        return this;
    };

    public DesafioCadastroPage clicarComidaCarne() {
        carne.click();
        return this;
    };

    public DesafioCadastroPage clicarComidaFrango() {
        frango.click();
        return this;
    };

    public DesafioCadastroPage clicarComidaPizza() {
        pizza.click();
        return this;
    };

    public DesafioCadastroPage ClicarComidaVegetariana() {
        vegetariano.click();
        return this;
    };

    public DesafioCadastroPage preencherSugestao(String sugestao) {
        sugestaoText.sendKeys(sugestao);
        return this;
    };

    public DesafioCadastroPage aceiteAlertVegano() {
        driver.switchTo().alert().accept();
        return this;
    };

    public String buscarLabelNome() {
        return LabelNome.getText();
    };

    public String buscarLabelSobrenome() {
        return LabelSobrenome.getText();
    };

    public String buscarLabelSexo() {
        return LabelSexo.getText();
    };

    public String buscarLabelComida() {
        return LabelComida.getText();
    };

    public String buscarLabelEscolaridade() {
        return LabelEscolaridade.getText();
    };

    public String buscarLabelEsportes() {
        return LabelEsportes.getText();
    };

    public String buscarLabelSugestoes() {
        return LabelSugestoes.getText();
    };
}
