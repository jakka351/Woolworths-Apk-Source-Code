package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SliderDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SliderDraggableState implements DraggableState {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1323a;
    public final MutableState b = SnapshotStateKt.f(Boolean.FALSE);
    public final SliderDraggableState$dragScope$1 c = new DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public final void a(float f) {
            this.f1324a.f1323a.invoke(Float.valueOf(f));
        }
    };
    public final MutatorMutex d = new MutatorMutex();

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.material.SliderDraggableState$dragScope$1] */
    public SliderDraggableState(Function1 function1) {
        this.f1323a = function1;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new SliderDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
