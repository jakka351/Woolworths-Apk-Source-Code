package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class V9 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z9 f17327a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V9(Z9 z9, boolean z, Function0 function0) {
        super(1);
        this.f17327a = z9;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        C0903w9 c0903w9D = this.f17327a.d();
        if (c0903w9D != null) {
            c0903w9D.a(false);
        }
        if (this.f17327a.k) {
            C0903w9 c0903w9C = this.f17327a.c();
            if (c0903w9C != null) {
                c0903w9C.a(true);
            }
        } else {
            C0903w9 c0903w9C2 = this.f17327a.c();
            if (c0903w9C2 != null) {
                c0903w9C2.a(this.b);
            }
        }
        this.c.invoke();
        return Unit.f24250a;
    }
}
