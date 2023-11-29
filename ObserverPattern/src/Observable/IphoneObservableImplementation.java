package Observable;

import java.util.*;
import Observer.NotificationAlertObserver;

public class IphoneObservableImplementation implements StocksObservable {
  int stockCount;
  List<NotificationAlertObserver> notificationAlertObserverList;
  @Override
  public void add(NotificationAlertObserver notificationAlertObserver){
    notificationAlertObserverList.add(notificationAlertObserver);

  }

  @Override
  public void remove(NotificationAlertObserver notificationAlertObserver) {
    notificationAlertObserverList.remove(notificationAlertObserver);
  }


  @Override
  public void notifyAllSubscribers() {
    for(NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList)
      notificationAlertObserver.update();
  }

  @Override
  public int getStock() {
    return stockCount;
  }

  @Override
  public void setStock(int newStockAdded) {
    if(stockCount==0) notifyAllSubscribers();
    stockCount += newStockAdded;
  }
}
