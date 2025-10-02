package com.github.piasy.biv.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Keep
/* loaded from: classes4.dex */
public final class ThreadedCallbacks implements InvocationHandler {
    private final Handler mHandler;
    private final Object mTarget;
    private static final Object NON_SENSE = new Object();
    private static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());

    private ThreadedCallbacks(Handler handler, Object obj) {
        this.mHandler = handler;
        this.mTarget = obj;
    }

    public static <T> T create(Class<T> cls, T t) {
        return (T) create(MAIN_HANDLER, cls, t);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
        if (!method.getReturnType().equals(Void.TYPE)) {
            throw new RuntimeException("Method should return void: " + method);
        }
        if (Looper.myLooper() == this.mHandler.getLooper()) {
            method.invoke(this.mTarget, objArr);
        } else {
            this.mHandler.post(new Runnable() { // from class: com.github.piasy.biv.utils.ThreadedCallbacks.1
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    try {
                        method.invoke(ThreadedCallbacks.this.mTarget, objArr);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return NON_SENSE;
    }

    public static <T> T create(Handler handler, Class<T> cls, T t) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ThreadedCallbacks(handler, t));
    }
}
