package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.EnumC0654ha;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScrollViewSwipeListenerParent f17779a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ScrollViewSwipeListenerParent scrollViewSwipeListenerParent) {
        super(1);
        this.f17779a = scrollViewSwipeListenerParent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC0654ha gesture = (EnumC0654ha) obj;
        Intrinsics.h(gesture, "gesture");
        int iOrdinal = gesture.ordinal();
        if (iOrdinal == 3 || iOrdinal == 5) {
            this.f17779a.getC().invoke(gesture);
        }
        return Unit.f24250a;
    }
}
