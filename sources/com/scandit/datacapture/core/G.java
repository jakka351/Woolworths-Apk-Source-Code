package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class G extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeWrappedPromise f18317a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(NativeWrappedPromise nativeWrappedPromise) {
        super(1);
        this.f18317a = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(this.f18317a, ((Boolean) obj).booleanValue());
        return Unit.f24250a;
    }
}
