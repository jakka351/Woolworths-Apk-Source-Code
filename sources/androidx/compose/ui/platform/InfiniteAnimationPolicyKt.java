package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InfiniteAnimationPolicyKt {
    public static final Object a(Function1 function1, Continuation continuation) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) continuation.getD().get(InfiniteAnimationPolicy.Key.d);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.a(continuation.getD()).e(function1, continuation);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, null);
        return infiniteAnimationPolicy.p();
    }
}
