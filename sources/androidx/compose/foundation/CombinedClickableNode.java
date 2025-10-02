package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "DoubleKeyClickState", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {
    public boolean K;
    public final MutableLongObjectMap L;
    public final MutableLongObjectMap M;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoubleKeyClickState {

        /* renamed from: a, reason: collision with root package name */
        public boolean f831a;
    }

    public CombinedClickableNode(IndicationNodeFactory indicationNodeFactory, MutableInteractionSource mutableInteractionSource, Function0 function0, boolean z, boolean z2) {
        super(mutableInteractionSource, indicationNodeFactory, z2, null, null, function0);
        this.K = z;
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f686a;
        this.L = new MutableLongObjectMap();
        this.M = new MutableLongObjectMap();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final boolean A2(KeyEvent keyEvent) {
        if (((DoubleKeyClickState) this.M.b(KeyEvent_androidKt.a(keyEvent))) == null) {
            return false;
        }
        throw null;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void B2(KeyEvent keyEvent) {
        long jA = KeyEvent_androidKt.a(keyEvent);
        MutableLongObjectMap mutableLongObjectMap = this.L;
        boolean z = false;
        if (mutableLongObjectMap.b(jA) != null) {
            Job job = (Job) mutableLongObjectMap.b(jA);
            if (job != null) {
                if (job.isActive()) {
                    job.cancel((CancellationException) null);
                } else {
                    z = true;
                }
            }
            mutableLongObjectMap.g(jA);
        }
        if (z) {
            return;
        }
        this.y.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D2() {
        /*
            Method dump skipped, instructions count: 182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode.D2():void");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void m2() {
        D2();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void v2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final Object w2(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objF = TapGestureDetectorKt.f(pointerInputScope, continuation, null, null, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j = ((Offset) obj).f1751a;
                CombinedClickableNode combinedClickableNode = this.h;
                if (combinedClickableNode.x) {
                    combinedClickableNode.y.invoke();
                }
                return Unit.f24250a;
            }
        }, new CombinedClickableNode$clickPointerInput$4(this, null));
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void z2() {
        D2();
    }
}
