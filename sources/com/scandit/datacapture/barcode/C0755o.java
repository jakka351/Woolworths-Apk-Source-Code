package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0755o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f17865a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0755o(B b) {
        super(1);
        this.f17865a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.h(it, "it");
        return this.f17865a.f17099a.brushForTrackedBarcodeNotInList(it);
    }
}
