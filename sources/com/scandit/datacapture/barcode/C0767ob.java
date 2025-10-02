package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.ob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0767ob extends AbstractC0800qb {
    private final String c;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767ob(String text, int i) {
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
        if (!(obj instanceof C0767ob)) {
            return false;
        }
        C0767ob c0767ob = (C0767ob) obj;
        return Intrinsics.c(this.c, c0767ob.c) && this.d == c0767ob.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoomedIn(text=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        return YU.a.l(sb, this.d, ')');
    }
}
