package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0723m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f17844a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0723m(B b) {
        super(1);
        this.f17844a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.h(it, "it");
        return this.f17844a.f17099a.brushForTrackedBarcode(it);
    }
}
