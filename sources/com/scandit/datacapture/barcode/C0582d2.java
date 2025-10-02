package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.d2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0582d2 extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function3 f17592a;
    final /* synthetic */ TrackedBarcode b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0582d2(Function3 function3, TrackedBarcode trackedBarcode) {
        super(2);
        this.f17592a = function3;
        this.b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EnumC0813r9 scanStatus = (EnumC0813r9) obj;
        EnumC0668i8 listStatus = (EnumC0668i8) obj2;
        Intrinsics.h(scanStatus, "scanStatus");
        Intrinsics.h(listStatus, "listStatus");
        return (Brush) this.f17592a.invoke(this.b, scanStatus, listStatus);
    }
}
