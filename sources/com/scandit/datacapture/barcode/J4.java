package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J4 {

    /* renamed from: a, reason: collision with root package name */
    private final Quadrilateral f17203a;
    private final BarcodePickState b;

    public J4(Quadrilateral referenceQuad, BarcodePickState pickState) {
        Intrinsics.h(referenceQuad, "referenceQuad");
        Intrinsics.h(pickState, "pickState");
        this.f17203a = referenceQuad;
        this.b = pickState;
    }

    public final BarcodePickState a() {
        return this.b;
    }

    public final Quadrilateral b() {
        return this.f17203a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J4)) {
            return false;
        }
        J4 j4 = (J4) obj;
        return Intrinsics.c(this.f17203a, j4.f17203a) && this.b == j4.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17203a.hashCode() * 31);
    }

    public final String toString() {
        return "BarcodePickStatusIconDrawData(referenceQuad=" + this.f17203a + ", pickState=" + this.b + ')';
    }
}
