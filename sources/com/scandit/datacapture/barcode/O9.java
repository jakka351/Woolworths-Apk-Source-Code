package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class O9 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z9 f17258a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O9(Z9 z9) {
        super(1);
        this.f17258a = z9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return this.f17258a.a(it);
    }
}
