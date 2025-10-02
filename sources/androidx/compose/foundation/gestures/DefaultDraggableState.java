package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultDraggableState implements DraggableState {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f878a;
    public final DefaultDraggableState$dragScope$1 b = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
        @Override // androidx.compose.foundation.gestures.DragScope
        public final void a(float f) {
            this.f879a.f878a.invoke(Float.valueOf(f));
        }
    };
    public final MutatorMutex c = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1] */
    public DefaultDraggableState(Function1 function1) {
        this.f878a = (Lambda) function1;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new DefaultDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
