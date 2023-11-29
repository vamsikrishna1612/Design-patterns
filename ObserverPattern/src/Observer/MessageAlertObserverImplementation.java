package Observer;

import Observable.StocksObservable;

public class MessageAlertObserverImplementation implements NotificationAlertObserver {
  String userName;
  StocksObservable stocksObservable ;

  public MessageAlertObserverImplementation(String userName, StocksObservable stocksObservable) {
    this.userName = userName;
    this.stocksObservable = stocksObservable;
  }

  @Override
  public void update() {
    sendMessage(userName, "product is in stock! hurry up");
  }

  private void sendMessage(String userName, String content) {
    System.out.println("message sent: " + userName);
    //actual code
  }


}
