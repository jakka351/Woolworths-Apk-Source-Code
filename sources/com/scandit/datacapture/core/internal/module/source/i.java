package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f18584a;
    final /* synthetic */ m b;
    final /* synthetic */ NativeCameraDelegateSettings c;
    final /* synthetic */ NativeWrappedPromise d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z, m mVar, NativeCameraDelegateSettings nativeCameraDelegateSettings, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f18584a = z;
        this.b = mVar;
        this.c = nativeCameraDelegateSettings;
        this.d = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f18584a) {
            this.b.j = new WeakReference(this.c);
            this.b.a(new h(this.d));
        } else {
            this.d.setError();
        }
        return Unit.f24250a;
    }
}
