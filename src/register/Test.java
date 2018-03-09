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
                    //��Ȼ����ã����ܻ��кܶ��߳�ͬʱȥ����getInstance()
                    Object obj = BeanFactory.getBean("register.BeanFactory");
                    System.out.println(System.currentTimeMillis() + ":" + obj);

                }
            }).start();
           latch.countDown();     
        }
        long end = System.currentTimeMillis();
        System.out.println("ʱ����" + (end - start));
    }
}
