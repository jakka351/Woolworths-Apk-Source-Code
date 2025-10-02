package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0643h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f17691a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643h(B b) {
        super(1);
        this.f17691a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.h(it, "it");
        return B.f(this.f17691a);
    }
}
