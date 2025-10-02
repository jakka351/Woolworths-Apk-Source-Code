package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17167a;
    private final BarcodePickState b;

    public G2(String itemData, BarcodePickState state) {
        Intrinsics.h(itemData, "itemData");
        Intrinsics.h(state, "state");
        this.f17167a = itemData;
        this.b = state;
    }

    public final BarcodePickState a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2)) {
            return false;
        }
        G2 g2 = (G2) obj;
        return Intrinsics.c(this.f17167a, g2.f17167a) && this.b == g2.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17167a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(itemData=" + this.f17167a + ", state=" + this.b + ')';
    }
}
