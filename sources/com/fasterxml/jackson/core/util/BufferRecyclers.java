package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.ThreadLocalBufferManager;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class BufferRecyclers {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocalBufferManager f14219a;
    public static final ThreadLocal b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        f14219a = zEquals ? ThreadLocalBufferManager.ThreadLocalBufferManagerHolder.f14223a : null;
        b = new ThreadLocal();
    }

    public static BufferRecycler a() {
        SoftReference softReference;
        ThreadLocal threadLocal = b;
        SoftReference softReference2 = (SoftReference) threadLocal.get();
        BufferRecycler bufferRecycler = softReference2 == null ? null : (BufferRecycler) softReference2.get();
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            ThreadLocalBufferManager threadLocalBufferManager = f14219a;
            if (threadLocalBufferManager != null) {
                ReferenceQueue referenceQueue = threadLocalBufferManager.b;
                softReference = new SoftReference(bufferRecycler, referenceQueue);
                ConcurrentHashMap concurrentHashMap = threadLocalBufferManager.f14222a;
                concurrentHashMap.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    concurrentHashMap.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(bufferRecycler);
            }
            threadLocal.set(softReference);
        }
        return bufferRecycler;
    }
}
