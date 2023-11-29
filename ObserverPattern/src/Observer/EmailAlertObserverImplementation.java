package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImplementation implements NotificationAlertObserver{
  String emailId;
  StocksObservable stocksObservable;

  public EmailAlertObserverImplementation(String emailId, StocksObservable stocksObservable) {
    this.emailId = emailId;
    this.stocksObservable = stocksObservable;
  }

  public void update(){
    sendEmail(emailId, "product is in stock hurry up" );
  }

  private void sendEmail(String emailId, String subject) {
    System.out.println("email sent to " + emailId);
    //code for sending the actual email
  }


}
