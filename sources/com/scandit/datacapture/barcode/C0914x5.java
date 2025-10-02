package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0914x5 {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeFindItem f18260a;
    private final boolean b;

    public C0914x5(BarcodeFindItem item, boolean z) {
        Intrinsics.h(item, "item");
        this.f18260a = item;
        this.b = z;
    }

    public final BarcodeFindItem a() {
        return this.f18260a;
    }

    public final boolean b() {
        return this.b;
    }

    public final BarcodeFindItem c() {
        return this.f18260a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0914x5)) {
            return false;
        }
        C0914x5 c0914x5 = (C0914x5) obj;
        return Intrinsics.c(this.f18260a, c0914x5.f18260a) && this.b == c0914x5.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f18260a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardData(item=");
        sb.append(this.f18260a);
        sb.append(", found=");
        return androidx.camera.core.impl.b.s(sb, this.b, ')');
    }

    public static C0914x5 a(C0914x5 c0914x5, boolean z) {
        BarcodeFindItem item = c0914x5.f18260a;
        Intrinsics.h(item, "item");
        return new C0914x5(item, z);
    }
}
