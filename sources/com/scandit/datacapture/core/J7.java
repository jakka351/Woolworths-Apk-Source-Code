package com.scandit.datacapture.core;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J7 implements L7 {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f18333a;

    public J7(C6 error) {
        Intrinsics.h(error, "error");
        this.f18333a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J7) && Intrinsics.c(this.f18333a, ((J7) obj).f18333a);
    }

    public final int hashCode() {
        return this.f18333a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f18333a + ')';
    }
}
