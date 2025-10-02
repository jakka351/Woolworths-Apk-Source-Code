package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.async.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Xb extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callback f17346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(Callback callback) {
        super(1);
        this.f17346a = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Callback callback = this.f17346a;
        if (callback != null) {
            callback.run(bool);
        }
        return Unit.f24250a;
    }
}
