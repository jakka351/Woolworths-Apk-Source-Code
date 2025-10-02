package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.r6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0810r6 {

    /* renamed from: a, reason: collision with root package name */
    private final Md f17990a;
    private final Nd b;

    public C0810r6(C0794q5 subscribable, Nd listener) {
        Intrinsics.h(subscribable, "subscribable");
        Intrinsics.h(listener, "listener");
        this.f17990a = subscribable;
        this.b = listener;
    }

    public final Nd a() {
        return this.b;
    }

    public final Md b() {
        return this.f17990a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0810r6)) {
            return false;
        }
        C0810r6 c0810r6 = (C0810r6) obj;
        return Intrinsics.c(this.f17990a, c0810r6.f17990a) && Intrinsics.c(this.b, c0810r6.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17990a.hashCode() * 31);
    }

    public final String toString() {
        return "DisposableDesc(subscribable=" + this.f17990a + ", listener=" + this.b + ')';
    }
}
