package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeTrackedBarcode f17805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NativeTrackedBarcode nativeTrackedBarcode) {
        super(0);
        this.f17805a = nativeTrackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TrackedBarcode(this.f17805a);
    }
}
