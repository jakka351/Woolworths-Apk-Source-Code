package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.f3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0615f3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17636a;
    private final BarcodePickState b;

    public C0615f3(String itemData, BarcodePickState state) {
        Intrinsics.h(itemData, "itemData");
        Intrinsics.h(state, "state");
        this.f17636a = itemData;
        this.b = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0615f3)) {
            return false;
        }
        C0615f3 c0615f3 = (C0615f3) obj;
        return Intrinsics.c(this.f17636a, c0615f3.f17636a) && this.b == c0615f3.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17636a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(itemData=" + this.f17636a + ", state=" + this.b + ')';
    }
}
