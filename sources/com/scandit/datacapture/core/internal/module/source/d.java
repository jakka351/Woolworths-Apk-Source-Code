package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeWrappedPromise f18579a;
    final /* synthetic */ m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, NativeWrappedPromise nativeWrappedPromise) {
        super(1);
        this.f18579a = nativeWrappedPromise;
        this.b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f18579a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new c(zBooleanValue, this.b, nativeWrappedPromise));
        return Unit.f24250a;
    }
}
