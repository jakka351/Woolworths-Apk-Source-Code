package com.scandit.datacapture.core.internal.sdk.battery;

import com.scandit.datacapture.core.source.BatterySavingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BatterySavingHandlerImpl f18663a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BatterySavingHandlerImpl batterySavingHandlerImpl) {
        super(1);
        this.f18663a = batterySavingHandlerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        if (this.f18663a.b == BatterySavingMode.AUTO && (function1 = this.f18663a.c) != null) {
            function1.invoke(bool);
        }
        return Unit.f24250a;
    }
}
