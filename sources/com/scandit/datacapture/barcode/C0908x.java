package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0908x extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f18255a;
    final /* synthetic */ TrackedBarcode b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0908x(B b, TrackedBarcode trackedBarcode) {
        super(1);
        this.f18255a = b;
        this.b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(this.f18255a.c.containsKey(Integer.valueOf(this.b.getIdentifier())));
    }
}
