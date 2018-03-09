/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package register;

import java.util.concurrent.CountDownLatch;

import lazy.Lazy1;

/**
 * @author eason.li
 *
 */
public class Test {
    public static void main(String[] args) {
        int count = 2000;
        
        final CountDownLatch latch = new CountDownLatch(count);
        final long start = System.currentTimeMillis();
        for(int i = 0; i < count; i++) {
            new Thread(new Runnable() {

                public void run() {
                    try {
                        latch.await();
                        
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                    //必然会调用，可能会有很多线程同时去访问getInstance()
                    Object obj = BeanFactory.getBean("register.BeanFactory");
                    System.out.println(System.currentTimeMillis() + ":" + obj);

                }
            }).start();
           latch.countDown();     
        }
        long end = System.currentTimeMillis();
        System.out.println("时长：" + (end - start));
    }
}
