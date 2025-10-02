package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/internal/AnchoredDraggableState$draggableState$1", "Landroidx/compose/foundation/gestures/DraggableState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnchoredDraggableState$draggableState$1 implements DraggableState {

    /* renamed from: a, reason: collision with root package name */
    public final AnchoredDraggableState$draggableState$1$dragScope$1 f1547a;
    public final /* synthetic */ AnchoredDraggableState b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1] */
    public AnchoredDraggableState$draggableState$1(final AnchoredDraggableState anchoredDraggableState) {
        this.b = anchoredDraggableState;
        this.f1547a = new DragScope() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public final void a(float f) {
                AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableState;
                anchoredDraggableState2.o.a(anchoredDraggableState2.f(f), BitmapDescriptorFactory.HUE_RED);
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) throws Throwable {
        Object objA = this.b.a(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, function2, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
