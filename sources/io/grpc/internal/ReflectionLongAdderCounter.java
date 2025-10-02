package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class ReflectionLongAdderCounter implements LongCounter {
    public static final Logger b = Logger.getLogger(ReflectionLongAdderCounter.class.getName());
    public static final Constructor c;
    public static final Method d;
    public static final RuntimeException e;
    public static final Object[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f24077a;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    static {
        /*
            java.lang.Class<io.grpc.internal.ReflectionLongAdderCounter> r0 = io.grpc.internal.ReflectionLongAdderCounter.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            io.grpc.internal.ReflectionLongAdderCounter.b = r0
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "add"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L3e
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "sum"
            r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()     // Catch: java.lang.Throwable -> L39
            int r3 = r1.length     // Catch: java.lang.Throwable -> L39
            r4 = 0
        L2a:
            if (r4 >= r3) goto L3b
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L39
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L39
            int r6 = r6.length     // Catch: java.lang.Throwable -> L39
            if (r6 != 0) goto L36
            goto L3c
        L36:
            int r4 = r4 + 1
            goto L2a
        L39:
            r1 = move-exception
            goto L40
        L3b:
            r5 = r0
        L3c:
            r1 = r0
            goto L4a
        L3e:
            r1 = move-exception
            r2 = r0
        L40:
            java.util.logging.Logger r3 = io.grpc.internal.ReflectionLongAdderCounter.b
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            java.lang.String r5 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r3.log(r4, r5, r1)
            r5 = r0
        L4a:
            if (r1 != 0) goto L55
            if (r5 == 0) goto L55
            io.grpc.internal.ReflectionLongAdderCounter.c = r5
            io.grpc.internal.ReflectionLongAdderCounter.d = r2
            io.grpc.internal.ReflectionLongAdderCounter.e = r0
            goto L60
        L55:
            io.grpc.internal.ReflectionLongAdderCounter.c = r0
            io.grpc.internal.ReflectionLongAdderCounter.d = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            io.grpc.internal.ReflectionLongAdderCounter.e = r0
        L60:
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            io.grpc.internal.ReflectionLongAdderCounter.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ReflectionLongAdderCounter.<clinit>():void");
    }

    public ReflectionLongAdderCounter() {
        RuntimeException runtimeException = e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f24077a = c.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // io.grpc.internal.LongCounter
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            d.invoke(this.f24077a, f);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
