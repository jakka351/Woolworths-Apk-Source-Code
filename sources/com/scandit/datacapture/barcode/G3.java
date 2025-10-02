package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    private final K8 f17168a;
    private final AbstractC0930y6 b;

    public G3(K8 k8, C0551c7 drawData) {
        Intrinsics.h(drawData, "drawData");
        this.f17168a = k8;
        this.b = drawData;
    }

    public final AbstractC0930y6 a() {
        return this.b;
    }

    public final K8 b() {
        return this.f17168a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G3)) {
            return false;
        }
        G3 g3 = (G3) obj;
        return Intrinsics.c(this.f17168a, g3.f17168a) && Intrinsics.c(this.b, g3.b);
    }

    public final int hashCode() {
        K8 k8 = this.f17168a;
        return this.b.hashCode() + ((k8 == null ? 0 : k8.hashCode()) * 31);
    }

    public final String toString() {
        return "BarcodePickFilteredDrawData(paints=" + this.f17168a + ", drawData=" + this.b + ')';
    }
}
