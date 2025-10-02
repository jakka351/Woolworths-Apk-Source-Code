package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/WrappedOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WrappedOverscrollEffect implements OverscrollEffect {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WrappedOverscrollEffect);
    }

    public final int hashCode() {
        Boolean.hashCode(false);
        Boolean.hashCode(false);
        throw null;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final DelegatableNode i() {
        return null;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean j() {
        throw null;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final long k(long j, int i, Function1 function1) {
        return ((Offset) function1.invoke(new Offset(j))).f1751a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final Object l(long j, Function2 function2, Continuation continuation) {
        Object objInvoke = function2.invoke(new Velocity(j), continuation);
        return objInvoke == CoroutineSingletons.d ? objInvoke : Unit.f24250a;
    }
}
