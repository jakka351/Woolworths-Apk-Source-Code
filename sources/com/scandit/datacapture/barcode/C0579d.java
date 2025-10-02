package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0579d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0543c f17589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579d(C0543c c0543c) {
        super(1);
        this.f17589a = c0543c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.f17589a.a(((Number) obj).floatValue());
    }
}
