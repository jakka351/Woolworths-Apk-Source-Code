package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Vd extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Yd f17329a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vd(Yd yd) {
        super(1);
        this.f17329a = yd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        View viewC = Yd.a(this.f17329a, it).c();
        this.f17329a.g();
        return viewC;
    }
}
