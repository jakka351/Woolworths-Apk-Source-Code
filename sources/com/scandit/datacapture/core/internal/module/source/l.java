package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeWrappedPromise f18587a;
    final /* synthetic */ m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, NativeWrappedPromise nativeWrappedPromise) {
        super(1);
        this.f18587a = nativeWrappedPromise;
        this.b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(this.f18587a, zBooleanValue);
        } else {
            m.a(this.b, this.f18587a);
        }
        return Unit.f24250a;
    }
}
