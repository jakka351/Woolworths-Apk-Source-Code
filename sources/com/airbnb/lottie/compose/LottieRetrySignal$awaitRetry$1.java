package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieRetrySignal", f = "LottieRetrySignal.kt", l = {45}, m = "awaitRetry")
/* loaded from: classes4.dex */
final class LottieRetrySignal$awaitRetry$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.q |= Integer.MIN_VALUE;
        throw null;
    }
}
