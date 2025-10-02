package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0662i2 extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0662i2 f17703a = new C0662i2();

    public C0662i2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackedBarcode trackedBarcode = (TrackedBarcode) obj;
        TrackedBarcode trackedBarcode2 = (TrackedBarcode) obj2;
        Intrinsics.h((Point) obj3, "<anonymous parameter 2>");
        return Boolean.valueOf(Intrinsics.c(trackedBarcode != null ? Integer.valueOf(trackedBarcode.getIdentifier()) : null, trackedBarcode2 != null ? Integer.valueOf(trackedBarcode2.getIdentifier()) : null));
    }
}
