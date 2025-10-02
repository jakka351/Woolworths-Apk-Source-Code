package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TargetedFlingBehavior extends FlingBehavior {
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    default Object a(ScrollScope scrollScope, float f, Continuation continuation) {
        Function1 function1 = TargetedFlingBehaviorKt.f904a;
        return b(scrollScope, f, TargetedFlingBehaviorKt$NoOnReport$1.h, (ContinuationImpl) continuation);
    }

    Object b(ScrollScope scrollScope, float f, Function1 function1, ContinuationImpl continuationImpl);
}
