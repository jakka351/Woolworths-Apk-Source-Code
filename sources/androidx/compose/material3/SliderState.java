package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SliderState;", "Landroidx/compose/foundation/gestures/DraggableState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SliderState implements DraggableState {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1501a;

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new SliderState$drag$2(this, mutatePriority, function2, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
