package com.scandit.datacapture.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.s7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1123s7 implements InterfaceC1132t7 {

    /* renamed from: a, reason: collision with root package name */
    private final C1140u6 f18830a;

    public C1123s7(C1140u6 error) {
        Intrinsics.h(error, "error");
        this.f18830a = error;
    }

    public final C1140u6 a() {
        return this.f18830a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1123s7) && Intrinsics.c(this.f18830a, ((C1123s7) obj).f18830a);
    }

    public final int hashCode() {
        return this.f18830a.hashCode();
    }

    public final String toString() {
        return "Block{error=" + this.f18830a.getMessage() + '}';
    }
}
