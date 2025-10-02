package com.scandit.datacapture.core.ui;

import com.scandit.datacapture.core.C1109r2;
import com.scandit.datacapture.core.internal.module.ui.GestureRecognizer;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ GestureRecognizer f18896a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GestureRecognizer gestureRecognizer) {
        super(0);
        this.f18896a = gestureRecognizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C1109r2(this.f18896a, ProxyCacheKt.getGlobalProxyCache());
    }
}
