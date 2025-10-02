package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    public static final Object a(Function1 function1, ContinuationImpl continuationImpl) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) continuationImpl.getH().get(InfiniteAnimationPolicy.Key.d);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.a(continuationImpl.getH()).e(function1, continuationImpl);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, null);
        return infiniteAnimationPolicy.p();
    }
}
