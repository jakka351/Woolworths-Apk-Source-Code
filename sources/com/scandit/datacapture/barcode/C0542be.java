package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.be, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0542be extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0610ee f17392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0542be(C0610ee c0610ee) {
        super(1);
        this.f17392a = c0610ee;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return PointWithUnitUtilsKt.PointWithUnit(H.h() + this.f17392a.b.h(), H.h() + this.f17392a.b.f(), MeasureUnit.PIXEL);
        }
        return PointWithUnitUtilsKt.PointWithUnit(H.j() + H.f() + this.f17392a.b.h(), H.h() + this.f17392a.b.f(), MeasureUnit.PIXEL);
    }
}
