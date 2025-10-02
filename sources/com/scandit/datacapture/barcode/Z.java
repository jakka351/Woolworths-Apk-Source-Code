package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0544c0 f17361a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0544c0 c0544c0) {
        super(0);
        this.f17361a = c0544c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        O oJ = this.f17361a.j();
        if (oJ != null) {
            oJ.a();
        }
        return Unit.f24250a;
    }
}
