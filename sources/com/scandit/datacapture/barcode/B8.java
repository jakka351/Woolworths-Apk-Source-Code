package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class B8 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8 f17106a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(C8 c8, boolean z, String str, Function0 function0) {
        super(1);
        this.f17106a = c8;
        this.b = z;
        this.c = str;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        C8.b(this.f17106a, this.b, this.c);
        this.d.invoke();
        return Unit.f24250a;
    }
}
