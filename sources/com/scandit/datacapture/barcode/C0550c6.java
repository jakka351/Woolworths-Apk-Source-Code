package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0550c6 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0602e6 f17399a;
    final /* synthetic */ String b;
    final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0550c6(C0602e6 c0602e6, String str, Function0 function0) {
        super(1);
        this.f17399a = c0602e6;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        U5 u5A = this.f17399a.a();
        if (u5A != null) {
            u5A.a(this.b);
        }
        this.c.invoke();
        return Unit.f24250a;
    }
}
