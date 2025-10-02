package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0803r extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f17985a;
    final /* synthetic */ TrackedBarcode b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803r(B b, TrackedBarcode trackedBarcode) {
        super(1);
        this.f17985a = b;
        this.b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.h(it, "it");
        return (Brush) this.f17985a.b.get(Integer.valueOf(this.b.getIdentifier()));
    }
}
