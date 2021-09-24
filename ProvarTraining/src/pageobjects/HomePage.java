package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="HomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class HomePage {

	@LinkType()
	@FindBy(xpath = "//a[@title='Home']")
	public WebElement HomeTab;
	@TextType()
	@FindBy(xpath = "//a[@title='Home']")
	public WebElement TestTab;
	
	@ButtonType(file=true)
	@FindBy(xpath = "//input[@title='Home']")
	public WebElement UploadTab;
	
	public void test(){
	
	}

	@TextType()
	@FindBy(xpath = "//input[@name='field-keywords']")
	public WebElement SearchBar;
			
}
