package com.scandit.datacapture.barcode;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0548c4 {
    public static final BarcodePickIcon a(Bitmap bitmap, BarcodePickIcon barcodePickIcon) {
        Intrinsics.h(C0532b4.f17385a, "<this>");
        Intrinsics.h(barcodePickIcon, "default");
        return bitmap == null ? barcodePickIcon : new C0809r5(bitmap);
    }

    public static final BarcodePickIcon a(int i, BarcodePickIcon barcodePickIcon) {
        Intrinsics.h(C0532b4.f17385a, "<this>");
        Intrinsics.h(barcodePickIcon, "default");
        return i == 0 ? barcodePickIcon : new C0798q9(i);
    }
}
