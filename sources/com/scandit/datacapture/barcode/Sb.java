package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.async.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Sb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callback f17298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sb(Callback callback) {
        super(0);
        this.f17298a = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Callback callback = this.f17298a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        return Unit.f24250a;
    }
}
