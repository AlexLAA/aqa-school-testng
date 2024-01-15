package lesson.listeners;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by Lolik on 14.01.2024
 */
public class CustomTestListener implements ITestListener {

  @Override
  public void onTestFailure(ITestResult result) {
    System.out.println("Test failed: " + result.getName());
    logBrowserConsole();
    logCurrentBrowserUrl();
    sendSlackNotification(result);
    pushResultToDB(result);
  }

  @Override
  public void onStart(ITestContext context) {
    System.out.println("Test context started: " + context.getName());
  }

  @Override
  public void onTestStart(ITestResult result) {
    System.out.println("Test started: " + result.getName());
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    pushResultToDB(result);
  }


  @Override
  public void onTestSkipped(ITestResult result) {
    System.out.println("Test skipped: " + result.getName());
  }

  private void logCurrentBrowserUrl(){
    if(WebDriverRunner.hasWebDriverStarted()){
        System.out.println("Current browser url: " + WebDriverRunner.url());
    }
  }

  private void logBrowserConsole(){
    if(WebDriverRunner.hasWebDriverStarted()) {
      System.out.println(
          "Browser console logs: " + WebDriverRunner.getWebDriver().manage().logs().get("browser").getAll());
    }
  }

  private void sendSlackNotification(ITestResult result){
    System.out.println("Sending slack notification");
  }

  private void pushResultToDB(ITestResult result){
    System.out.println("Pushing results to DB");
  }




}
