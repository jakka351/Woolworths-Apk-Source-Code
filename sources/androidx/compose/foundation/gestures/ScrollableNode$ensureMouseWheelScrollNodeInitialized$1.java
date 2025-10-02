package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 extends AdaptedFunctionReference implements Function2<Velocity, Continuation<? super Unit>, Object>, SuspendFunction {
    public ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(ScrollableNode scrollableNode) {
        super(2, scrollableNode, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Velocity) obj).f2206a;
        ScrollableNode scrollableNode = (ScrollableNode) this.d;
        BuildersKt.c(scrollableNode.D.c(), null, null, new ScrollableNode$onWheelScrollStopped$1(scrollableNode, j, null), 3);
        return Unit.f24250a;
    }
}
