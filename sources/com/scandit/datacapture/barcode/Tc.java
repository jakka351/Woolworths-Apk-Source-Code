package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Tc extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Vc f17309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tc(Vc vc) {
        super(1);
        this.f17309a = vc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        this.f17309a.b;
        if (it.equals("toolbarIconInactiveTintColor")) {
            this.f17309a.b();
        }
        return Unit.f24250a;
    }
}
