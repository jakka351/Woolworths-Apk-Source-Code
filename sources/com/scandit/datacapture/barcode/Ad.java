package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ad extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Gd f17097a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(Gd gd) {
        super(1);
        this.f17097a = gd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return Gd.a(this.f17097a, it);
    }
}
