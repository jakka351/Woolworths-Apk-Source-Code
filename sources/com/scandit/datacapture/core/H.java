package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f18321a;
    final /* synthetic */ N b;
    final /* synthetic */ NativeWrappedPromise c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(boolean z, N n, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f18321a = z;
        this.b = n;
        this.c = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f18321a) {
            this.b.a(new G(this.c));
        } else {
            this.c.setError();
        }
        return Unit.f24250a;
    }
}
