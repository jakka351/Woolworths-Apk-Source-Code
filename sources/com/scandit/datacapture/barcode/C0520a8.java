package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.a8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0520a8 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0536b8 f17376a;
    final /* synthetic */ int b;
    final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0520a8(C0536b8 c0536b8, int i, Function0 function0) {
        super(1);
        this.f17376a = c0536b8;
        this.b = i;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        S7 s7A = this.f17376a.a();
        if (s7A != null) {
            s7A.a(this.b);
        }
        this.c.invoke();
        return Unit.f24250a;
    }
}
