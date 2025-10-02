package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.pb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0782pb extends AbstractC0800qb {
    private final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0782pb(String text) {
        super(0);
        Intrinsics.h(text, "text");
        this.c = text;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0782pb) && Intrinsics.c(this.c, ((C0782pb) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.b.r(new StringBuilder("ZoomedOut(text="), this.c, ')');
    }
}
