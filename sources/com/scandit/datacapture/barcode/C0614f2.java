package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0614f2 {

    /* renamed from: a, reason: collision with root package name */
    private final TrackedBarcode f17635a;
    private final C0722le b;
    private final float c;

    public C0614f2(TrackedBarcode barcode, C0722le overlayInfo, float f) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(overlayInfo, "overlayInfo");
        this.f17635a = barcode;
        this.b = overlayInfo;
        this.c = f;
    }

    public final TrackedBarcode a() {
        return this.f17635a;
    }

    public final float b() {
        return this.c;
    }

    public final C0722le c() {
        return this.b;
    }
}
