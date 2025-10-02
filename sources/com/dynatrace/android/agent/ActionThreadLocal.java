package com.dynatrace.android.agent;

import java.util.Collection;
import java.util.Vector;

/* loaded from: classes.dex */
public final class ActionThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14061a;
    public static final ThreadLocal b;

    /* renamed from: com.dynatrace.android.agent.ActionThreadLocal$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<Vector<DTXActionImpl>> {
        @Override // java.lang.ThreadLocal
        public final Vector<DTXActionImpl> initialValue() {
            return new Vector<>();
        }
    }

    static {
        boolean z = Global.f14077a;
        f14061a = "dtxActionThreadLocal";
        b = new AnonymousClass1();
    }

    public static final synchronized void a() {
        try {
            Vector vector = new Vector((Collection) b.get());
            for (int i = 0; i < vector.size(); i++) {
                try {
                    ThreadLocal threadLocal = b;
                    DTXActionImpl dTXActionImpl = (DTXActionImpl) ((Vector) threadLocal.get()).get(i);
                    if (dTXActionImpl != null && dTXActionImpl.e) {
                        ((Vector) threadLocal.get()).remove(dTXActionImpl);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            vector.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
