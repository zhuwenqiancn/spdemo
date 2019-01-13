package com.demo.tool.toolTest;

import com.demo.tool.IdWorker;

import java.util.HashSet;
import java.util.Set;


public class IdWorkerTest {


    static class IdWorkThread implements Runnable {

        private Set<Long> set;

        private IdWorker idWorker;


        public IdWorkThread(Set<Long> set, IdWorker idWorker) {

            this.set = set;

            this.idWorker = idWorker;

        }


        public void run() {

            while (true) {

                long id = idWorker.nextId();

                System.out.println("   real id:" + id);

                if (!set.add(id)) {

                    System.out.println("duplicate:" + id);

                }

            }

        }

    }


    public static void main(String[] args) {

        Set<Long> set = new HashSet<Long>();

        final IdWorker idWorker1 = new IdWorker(0, 0);

        final IdWorker idWorker2 = new IdWorker(1, 0);

        Thread t1 = new Thread(new IdWorkThread(set, idWorker1));
        Thread t2 = new Thread(new IdWorkThread(set, idWorker2));
        Thread t3 = new Thread(new IdWorkThread(set, idWorker2));
        Thread t4 = new Thread(new IdWorkThread(set, idWorker2));
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);

        t1.start();

        t2.start();
        t3.start();
        t4.start();


        try {

            Thread.sleep(300);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

    /*


    1079221790292578497
    1079221790812672078



     */

}