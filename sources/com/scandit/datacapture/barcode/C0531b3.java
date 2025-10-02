package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.b3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0531b3 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f17384a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0531b3(Function1 function1) {
        super(1);
        this.f17384a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        U2 drawData = (U2) obj;
        Intrinsics.h(drawData, "drawData");
        this.f17384a.invoke(drawData.d());
        return Unit.f24250a;
    }
}
