package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class ye extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ De f18278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(De de) {
        super(1);
        this.f18278a = de;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return De.a(this.f18278a, it);
    }
}
