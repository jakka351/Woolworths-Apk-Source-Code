package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class I extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeWrappedPromise f18326a;
    final /* synthetic */ N b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(NativeWrappedPromise nativeWrappedPromise, N n) {
        super(1);
        this.f18326a = nativeWrappedPromise;
        this.b = n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f18326a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new H(zBooleanValue, this.b, nativeWrappedPromise));
        return Unit.f24250a;
    }
}
