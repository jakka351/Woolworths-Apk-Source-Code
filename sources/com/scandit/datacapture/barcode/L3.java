package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class L3 {

    /* renamed from: a, reason: collision with root package name */
    private final Size2 f17223a;
    private final BarcodeFilterHighlightSettings b;

    public L3(Size2 minSize, BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        Intrinsics.h(minSize, "minSize");
        this.f17223a = minSize;
        this.b = barcodeFilterHighlightSettings;
    }

    public final BarcodeFilterHighlightSettings a() {
        return this.b;
    }

    public final Size2 b() {
        return this.f17223a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L3)) {
            return false;
        }
        L3 l3 = (L3) obj;
        return Intrinsics.c(this.f17223a, l3.f17223a) && Intrinsics.c(this.b, l3.b);
    }

    public final int hashCode() {
        int iHashCode = this.f17223a.hashCode() * 31;
        BarcodeFilterHighlightSettings barcodeFilterHighlightSettings = this.b;
        return iHashCode + (barcodeFilterHighlightSettings == null ? 0 : barcodeFilterHighlightSettings.hashCode());
    }

    public final String toString() {
        return "BarcodePickFilteredDrawerSettings(minSize=" + this.f17223a + ", filterHighlightSettings=" + this.b + ')';
    }
}
