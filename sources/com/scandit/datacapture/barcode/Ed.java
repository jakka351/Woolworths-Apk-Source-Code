package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ed extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Gd f17153a;
    final /* synthetic */ boolean b = false;
    final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ed(Gd gd, Function0 function0) {
        super(1);
        this.f17153a = gd;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        C0892vd c0892vdB = this.f17153a.b();
        if (c0892vdB != null) {
            c0892vdB.a(this.b, false, true);
        }
        this.c.invoke();
        return Unit.f24250a;
    }
}
