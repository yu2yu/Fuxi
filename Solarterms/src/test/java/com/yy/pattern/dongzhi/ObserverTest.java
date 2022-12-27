package com.yy.pattern.dongzhi;

import com.yy.pattern.dongzhi.observer.ConcertObserver1;
import com.yy.pattern.dongzhi.observer.ConcertSubject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ObserverTest {
    @Test
    @DisplayName("观察者模式")
    public void testObserver(){
        ConcertSubject concertSubject = new ConcertSubject();
        ConcertObserver1 concertObserver1 = new ConcertObserver1("观察者1");
        concertSubject.register(concertObserver1);
        ConcertObserver1 concertObserver2 = new ConcertObserver1("观察者2");
        concertSubject.register(concertObserver2);

        concertSubject.setState(2);
    }
}
