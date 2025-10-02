package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.gb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0639gb extends AbstractC0800qb {
    private final String c;
    private final int d;
    private final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0639gb(int i, int i2, String text) {
        super(0);
        Intrinsics.h(text, "text");
        this.c = text;
        this.d = i;
        this.e = i2;
    }

    @Override // com.scandit.datacapture.barcode.AbstractC0800qb
    public final int a() {
        return this.d;
    }

    @Override // com.scandit.datacapture.barcode.AbstractC0800qb
    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0639gb)) {
            return false;
        }
        C0639gb c0639gb = (C0639gb) obj;
        return Intrinsics.c(this.c, c0639gb.c) && this.d == c0639gb.d && this.e == c0639gb.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + androidx.camera.core.impl.b.a(this.d, this.c.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(text=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", textColor=");
        return YU.a.l(sb, this.e, ')');
    }
}
