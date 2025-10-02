package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.c5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0549c5 implements InterfaceC0585d5 {

    /* renamed from: a, reason: collision with root package name */
    private final View f17398a;
    private final BarcodePickStatusIconStyle b;

    public C0549c5(View view, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this.f17398a = view;
        this.b = barcodePickStatusIconStyle;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0585d5
    public final BarcodePickStatusIconStyle a() {
        return this.b;
    }

    public final View b() {
        return this.f17398a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0549c5)) {
            return false;
        }
        C0549c5 c0549c5 = (C0549c5) obj;
        return Intrinsics.c(this.f17398a, c0549c5.f17398a) && Intrinsics.c(this.b, c0549c5.b);
    }

    public final int hashCode() {
        View view = this.f17398a;
        int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
        BarcodePickStatusIconStyle barcodePickStatusIconStyle = this.b;
        return iHashCode + (barcodePickStatusIconStyle != null ? barcodePickStatusIconStyle.hashCode() : 0);
    }

    public final String toString() {
        return "CustomView(view=" + this.f17398a + ", statusIconStyle=" + this.b + ')';
    }
}
