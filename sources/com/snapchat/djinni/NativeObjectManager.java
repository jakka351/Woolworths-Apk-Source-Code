package com.snapchat.djinni;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class NativeObjectManager {

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f19026a = new ReferenceQueue();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* loaded from: classes6.dex */
    public static class Holder {

        /* renamed from: a, reason: collision with root package name */
        public static final NativeObjectManager f19027a = new NativeObjectManager();
    }

    /* loaded from: classes6.dex */
    public static class NativeObjectWrapper extends PhantomReference<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final long f19028a;
        public final Method b;

        public NativeObjectWrapper(Object obj, Class cls, long j, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f19028a = j;
            this.b = cls.getMethod("nativeDestroy", Long.TYPE);
        }
    }

    public NativeObjectManager() {
        Thread thread = new Thread() { // from class: com.snapchat.djinni.NativeObjectManager.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() throws IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
                NativeObjectManager nativeObjectManager = NativeObjectManager.this;
                while (true) {
                    try {
                        Reference referenceRemove = nativeObjectManager.f19026a.remove();
                        if (referenceRemove == null) {
                            return;
                        }
                        NativeObjectWrapper nativeObjectWrapper = (NativeObjectWrapper) referenceRemove;
                        if (((Boolean) nativeObjectManager.b.remove(nativeObjectWrapper)).booleanValue()) {
                            try {
                                nativeObjectWrapper.b.invoke(null, Long.valueOf(nativeObjectWrapper.f19028a));
                            } catch (Exception e) {
                                System.out.println("Exception in native cleanup: " + e.getCause());
                            }
                        }
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        };
        thread.setPriority(4);
        thread.start();
    }

    public static void a(long j, Object obj) {
        Object obj2;
        NativeObjectManager nativeObjectManager;
        Class<?> cls = obj.getClass();
        try {
            nativeObjectManager = Holder.f19027a;
            obj2 = obj;
        } catch (NoSuchMethodException unused) {
            obj2 = obj;
        }
        try {
            nativeObjectManager.b.put(new NativeObjectWrapper(obj2, cls, j, nativeObjectManager.f19026a), Boolean.TRUE);
        } catch (NoSuchMethodException unused2) {
            throw new RuntimeException("failed to register object of type " + obj2.getClass().getName() + " no static method nativeDestroy() found");
        }
    }

    private native void noMinify();
}
