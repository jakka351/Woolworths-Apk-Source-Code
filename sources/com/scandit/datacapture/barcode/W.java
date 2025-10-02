package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class W extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0544c0 f17330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C0544c0 c0544c0) {
        super(0);
        this.f17330a = c0544c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17330a.m.listButtonPressed();
        return Unit.f24250a;
    }
}
