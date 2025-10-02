package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0938z extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0938z f18279a = new C0938z();

    public C0938z() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.h(it, "it");
        return Boolean.FALSE;
    }
}
