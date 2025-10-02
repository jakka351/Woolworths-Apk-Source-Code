package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class N6 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S6 f17248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6(S6 s6) {
        super(1);
        this.f17248a = s6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return this.f17248a.a(it);
    }
}
