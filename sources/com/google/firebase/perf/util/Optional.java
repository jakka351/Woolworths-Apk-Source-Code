package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class Optional<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15721a;

    public Optional() {
        this.f15721a = null;
    }

    public final Object a() {
        Object obj = this.f15721a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.f15721a != null;
    }

    public Optional(Object obj) {
        if (obj != null) {
            this.f15721a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
