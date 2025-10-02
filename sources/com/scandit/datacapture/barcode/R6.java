package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class R6 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S6 f17287a;
    final /* synthetic */ String b;
    final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(S6 s6, String str, Function0 function0) {
        super(1);
        this.f17287a = s6;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        J6 j6A = this.f17287a.a();
        if (j6A != null) {
            j6A.a(this.b);
        }
        this.c.invoke();
        return Unit.f24250a;
    }
}
