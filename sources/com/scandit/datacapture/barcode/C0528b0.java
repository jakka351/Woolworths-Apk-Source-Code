package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0528b0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0544c0 f17382a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0528b0(C0544c0 c0544c0) {
        super(0);
        this.f17382a = c0544c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17382a.m.shutterButtonPressed();
        this.f17382a.v = false;
        return Unit.f24250a;
    }
}
