package com.scandit.datacapture.core.source;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameSource f18848a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FrameSource frameSource) {
        super(0);
        this.f18848a = frameSource;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18848a;
    }
}
