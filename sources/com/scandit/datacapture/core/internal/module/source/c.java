package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f18578a;
    final /* synthetic */ m b;
    final /* synthetic */ NativeWrappedPromise c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, m mVar, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f18578a = z;
        this.b = mVar;
        this.c = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f18578a) {
            m.a(this.b, new b(this.c));
        } else {
            this.c.setError();
        }
        return Unit.f24250a;
    }
}
