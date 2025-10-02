package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Z5 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0602e6 f17366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z5(C0602e6 c0602e6) {
        super(1);
        this.f17366a = c0602e6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return this.f17366a.a(it);
    }
}
