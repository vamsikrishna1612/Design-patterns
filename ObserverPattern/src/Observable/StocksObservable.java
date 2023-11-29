package Observable;
import Observer.NotificationAlertObserver;

public interface StocksObservable {

  void add(NotificationAlertObserver notificationAlertObserver);
  void remove(NotificationAlertObserver notificationAlertObserver);

  void notifyAllSubscribers();
  int getStock();
  void setStock( int newStockAdded);
}
