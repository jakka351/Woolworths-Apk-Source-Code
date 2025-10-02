package com.scandit.datacapture.core.internal.sdk.common.async;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f18679a;
    final /* synthetic */ NativeWrappedPromise b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeWrappedPromise nativeWrappedPromise, boolean z) {
        super(0);
        this.f18679a = z;
        this.b = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f18679a) {
            this.b.setDone();
        } else {
            this.b.setError();
        }
        return Unit.f24250a;
    }
}
