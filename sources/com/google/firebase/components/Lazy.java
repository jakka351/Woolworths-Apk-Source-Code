package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public class Lazy<T> implements Provider<T> {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f15232a = c;
    public volatile Provider b;

    public Lazy(Provider provider) {
        this.b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f15232a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f15232a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.f15232a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
