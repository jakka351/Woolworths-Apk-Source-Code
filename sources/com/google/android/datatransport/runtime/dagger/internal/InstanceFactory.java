package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* loaded from: classes.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14456a;

    public InstanceFactory(Object obj) {
        this.f14456a = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f14456a;
    }
}
