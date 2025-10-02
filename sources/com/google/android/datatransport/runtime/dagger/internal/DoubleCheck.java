package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Factory f14455a;
    public volatile Object b;

    public static Provider a(Factory factory) {
        if (factory instanceof DoubleCheck) {
            return factory;
        }
        DoubleCheck doubleCheck = new DoubleCheck();
        doubleCheck.b = c;
        doubleCheck.f14455a = factory;
        return doubleCheck;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.f14455a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.f14455a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
