package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultTransformableState;", "Landroidx/compose/foundation/gestures/TransformableState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultTransformableState implements TransformableState {

    /* renamed from: a, reason: collision with root package name */
    public final Function3 f883a;
    public final DefaultTransformableState$transformScope$1 b = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
        @Override // androidx.compose.foundation.gestures.TransformScope
        public final void a(long j, float f, float f2) {
            this.f884a.f883a.invoke(Float.valueOf(f), new Offset(j), Float.valueOf(f2));
        }
    };
    public final MutatorMutex c = new MutatorMutex();
    public final MutableState d = SnapshotStateKt.f(Boolean.FALSE);

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1] */
    public DefaultTransformableState(Function3 function3) {
        this.f883a = function3;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public final Object a(MutatePriority mutatePriority, Function2 function2, SuspendLambda suspendLambda) {
        Object objC = CoroutineScopeKt.c(new DefaultTransformableState$transform$2(this, mutatePriority, function2, null), suspendLambda);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
