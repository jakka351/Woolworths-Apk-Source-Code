package com.google.firebase.concurrent;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
class CustomThreadFactory implements ThreadFactory {
    public static final ThreadFactory h = Executors.defaultThreadFactory();
    public final AtomicLong d = new AtomicLong();
    public final String e;
    public final int f;
    public final StrictMode.ThreadPolicy g;

    public CustomThreadFactory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.e = str;
        this.f = i;
        this.g = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = h.newThread(new a(this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.e + " Thread #" + this.d.getAndIncrement());
        return threadNewThread;
    }
}
