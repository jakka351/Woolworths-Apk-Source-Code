package com.google.zxing;

/* loaded from: classes6.dex */
public abstract class ReaderException extends Exception {
    public static final boolean d;
    public static final StackTraceElement[] e;

    static {
        d = System.getProperty("surefire.test.class.path") != null;
        e = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
