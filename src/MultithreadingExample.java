

// ===> Multi threding
/**
 * Multithreding java that allows you to perform multiple tasks  simultaniouly.
 * In multithreded program diffrent threds are run concurently with in the same program
 * allowing you to perform more  complex task in more efficient and responsive manner.
 * Multithreding and multitasking both  are used to archive  multitasking
 *==>OS(1.process-1
 *      2.process-2
 *      3.Process-3)
 *
 *      Thread is  a small part of the process
 *
 *      Threds are shared memory area.
 *      Threds Faster context switching
 *      A Thred is lightweight where as a process is heavy weight
 *
 *      ==>Flow of control in java
 *
 *      1.Without threding;=
 *      MAIN ===> Function1() ===> Function2()==>END
 *
 *      2. With Threding:=
 *
 *      MAIN====||
 *function-1()=====>END
 *function-2()==||
 *
 *     Creating a Thread
 *     There are 2 ways to create a thread in java
 *     1.By  extending Thread Class
 *     By implement Runnable interface
 *
 *
 // *
 // *     */





public class MultithreadingExample {

        public static void main(String[] args) {
            int numberOfThreads = 5;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<numberOfThreads;i++){
                        System.out.println(i);
                        try{
                            Thread.sleep(1000);
                        }
                        catch(Exception e){}
                    }
                }
            });
            thread.run();
        }

}
