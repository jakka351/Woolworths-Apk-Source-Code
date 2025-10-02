package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    @Override // androidx.compose.foundation.AbstractClickableNode
    public final boolean A2(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void B2(KeyEvent keyEvent) {
        this.y.invoke();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final Object w2(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objE = TapGestureDetectorKt.e(pointerInputScope, new ClickableNode$clickPointerInput$2(this, null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.ClickableNode$clickPointerInput$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j = ((Offset) obj).f1751a;
                ClickableNode clickableNode = this.h;
                if (clickableNode.x) {
                    clickableNode.y.invoke();
                }
                return Unit.f24250a;
            }
        }, continuation);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }
}
