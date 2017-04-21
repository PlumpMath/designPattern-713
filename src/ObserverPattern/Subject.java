package ObserverPattern;

/**
 * Created by kang on 17/4/21.
 */
public interface Subject {

   void registerObject(Observer observer);
   void removeObject(Observer observer);
   void notifyObject();

}
