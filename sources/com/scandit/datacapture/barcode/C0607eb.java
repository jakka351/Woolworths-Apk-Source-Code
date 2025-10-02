package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.eb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0607eb extends AbstractC0800qb {
    private final String c;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607eb(String text, int i) {
        super(0);
        Intrinsics.h(text, "text");
        this.c = text;
        this.d = i;
    }

    @Override // com.scandit.datacapture.barcode.AbstractC0800qb
    public final int a() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0607eb)) {
            return false;
        }
        C0607eb c0607eb = (C0607eb) obj;
        return Intrinsics.c(this.c, c0607eb.c) && this.d == c0607eb.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContinuousModeEnabled(text=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        return YU.a.l(sb, this.d, ')');
    }
}
