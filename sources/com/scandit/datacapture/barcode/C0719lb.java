package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.lb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0719lb extends AbstractC0800qb {
    private final String c;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719lb(String text, int i) {
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
        if (!(obj instanceof C0719lb)) {
            return false;
        }
        C0719lb c0719lb = (C0719lb) obj;
        return Intrinsics.c(this.c, c0719lb.c) && this.d == c0719lb.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TorchOn(text=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        return YU.a.l(sb, this.d, ')');
    }
}
