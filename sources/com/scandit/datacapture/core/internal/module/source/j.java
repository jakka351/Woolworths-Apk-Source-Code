package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeWrappedPromise f18585a;
    final /* synthetic */ m b;
    final /* synthetic */ NativeCameraDelegateSettings c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(NativeWrappedPromise nativeWrappedPromise, m mVar, NativeCameraDelegateSettings nativeCameraDelegateSettings) {
        super(1);
        this.f18585a = nativeWrappedPromise;
        this.b = mVar;
        this.c = nativeCameraDelegateSettings;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f18585a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new i(zBooleanValue, this.b, this.c, nativeWrappedPromise));
        return Unit.f24250a;
    }
}
