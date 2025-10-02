package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.e8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0604e8 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0652h8 f17628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0604e8(C0652h8 c0652h8) {
        super(1);
        this.f17628a = c0652h8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return C0652h8.a(this.f17628a, it);
    }
}
