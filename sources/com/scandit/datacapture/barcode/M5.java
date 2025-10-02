package com.scandit.datacapture.barcode;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class M5 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S5 f17237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M5(S5 s5) {
        super(1);
        this.f17237a = s5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f17237a.c.setTranslationY(Math.max(BitmapDescriptorFactory.HUE_RED, -((Number) obj).intValue()));
        return Unit.f24250a;
    }
}
