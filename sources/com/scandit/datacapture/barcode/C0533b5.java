package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.b5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0533b5 implements InterfaceC0585d5 {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickIcon f17386a;
    private final BarcodePickBrush b;
    private final BarcodePickStatusIconStyle c;

    public C0533b5(BarcodePickIcon icon, BarcodePickBrush brush, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        Intrinsics.h(icon, "icon");
        Intrinsics.h(brush, "brush");
        this.f17386a = icon;
        this.b = brush;
        this.c = barcodePickStatusIconStyle;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0585d5
    public final BarcodePickStatusIconStyle a() {
        return this.c;
    }

    public final BarcodePickBrush b() {
        return this.b;
    }

    public final BarcodePickIcon c() {
        return this.f17386a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0533b5)) {
            return false;
        }
        C0533b5 c0533b5 = (C0533b5) obj;
        return Intrinsics.c(this.f17386a, c0533b5.f17386a) && Intrinsics.c(this.b, c0533b5.b) && Intrinsics.c(this.c, c0533b5.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f17386a.hashCode() * 31)) * 31;
        BarcodePickStatusIconStyle barcodePickStatusIconStyle = this.c;
        return iHashCode + (barcodePickStatusIconStyle == null ? 0 : barcodePickStatusIconStyle.hashCode());
    }

    public final String toString() {
        return "Brush(icon=" + this.f17386a + ", brush=" + this.b + ", statusIconStyle=" + this.c + ')';
    }
}
