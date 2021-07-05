package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCursePage extends PageObject{
    public static final Target BUTTON_UC = Target.the("Seleciona la universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Dale click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SEARCH_COURSE = Target.the("Dale click para buscar el curso").located(By.xpath("//h4[contains(text(), 'Recursos Automatizacion Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(), 'Recursos Automatizacion Bancolombia')]"));
}
