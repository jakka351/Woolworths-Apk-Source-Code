package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;

/* loaded from: classes.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15836a;

    public InstanceFactory(Object obj) {
        this.f15836a = obj;
    }

    public static InstanceFactory a(Object obj) {
        if (obj != null) {
            return new InstanceFactory(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f15836a;
    }
}
