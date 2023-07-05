package com.parseofsingularity.drakalh.library.library_javafx_serialisable;

public class Thread extends java.lang.Thread implements java.io.Serializable
{

    public Thread(java.lang.Runnable runnable) {
        super(runnable);
    }

    public Thread() {
        super();
    }

    public void run() {
        super.run();
    }

    public static void sleep(long millis) throws java.lang.InterruptedException {
        java.lang.Thread.sleep(millis);
    }

    public static boolean interrupted() {
        return java.lang.Thread.interrupted();
    }

    public void start() {
        super.start();
    }

    public void interrupt() {
        super.interrupt();
    }

    public final void setContextClassLoader(java.lang.ClassLoader cl) {
        super.setContextClassLoader(cl);
    }

    public final java.lang.ClassLoader getContextClassLoader() {
        return super.getContextClassLoader();
    }

}
