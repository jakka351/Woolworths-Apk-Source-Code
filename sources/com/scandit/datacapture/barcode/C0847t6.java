package com.scandit.datacapture.barcode;

import android.graphics.PointF;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.t6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0847t6 {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f18139a;
    private final BarcodeFindItem b;
    private final String c;

    public C0847t6(PointF position, BarcodeFindItem barcodeFindItem, String barcodeData) {
        Intrinsics.h(position, "position");
        Intrinsics.h(barcodeData, "barcodeData");
        this.f18139a = position;
        this.b = barcodeFindItem;
        this.c = barcodeData;
    }

    public static C0847t6 a(C0847t6 c0847t6, BarcodeFindItem barcodeFindItem) {
        PointF position = c0847t6.f18139a;
        String barcodeData = c0847t6.c;
        Intrinsics.h(position, "position");
        Intrinsics.h(barcodeData, "barcodeData");
        return new C0847t6(position, barcodeFindItem, barcodeData);
    }

    public final BarcodeFindItem b() {
        return this.b;
    }

    public final PointF c() {
        return this.f18139a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0847t6)) {
            return false;
        }
        C0847t6 c0847t6 = (C0847t6) obj;
        return Intrinsics.c(this.f18139a, c0847t6.f18139a) && Intrinsics.c(this.b, c0847t6.b) && Intrinsics.c(this.c, c0847t6.c);
    }

    public final int hashCode() {
        int iHashCode = this.f18139a.hashCode() * 31;
        BarcodeFindItem barcodeFindItem = this.b;
        return this.c.hashCode() + ((iHashCode + (barcodeFindItem == null ? 0 : barcodeFindItem.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DotInfo(position=");
        sb.append(this.f18139a);
        sb.append(", barcodeFindItem=");
        sb.append(this.b);
        sb.append(", barcodeData=");
        return androidx.camera.core.impl.b.r(sb, this.c, ')');
    }

    public final String a() {
        return this.c;
    }
}
