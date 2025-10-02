package com.scandit.datacapture.core.framesave;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameSaveSession f18519a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FrameSaveSession frameSaveSession) {
        super(0);
        this.f18519a = frameSaveSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18519a;
    }
}
