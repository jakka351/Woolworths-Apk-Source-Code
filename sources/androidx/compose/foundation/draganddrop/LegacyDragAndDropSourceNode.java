package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@StabilityInferred
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LegacyDragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public final Function1 t;
    public Function2 u;

    public LegacyDragAndDropSourceNode(Function1 function1, Function2 function2) {
        this.t = function1;
        this.u = function2;
        final DragAndDropNode dragAndDropNode = new DragAndDropNode(null, null, 2);
        s2(dragAndDropNode);
        s2(SuspendingPointerInputFilterKt.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.1

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode$1$1", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00121 implements DragAndDropSourceScope, PointerInputScope {
                public final /* synthetic */ PointerInputScope d;
                public final /* synthetic */ DragAndDropModifierNode e;

                public C00121(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode) {
                    this.e = dragAndDropModifierNode;
                    this.d = pointerInputScope;
                }

                @Override // androidx.compose.ui.unit.Density
                public final float B(int i) {
                    return this.d.B(i);
                }

                @Override // androidx.compose.ui.unit.Density
                public final float C(float f) {
                    return this.d.C(f);
                }

                @Override // androidx.compose.ui.unit.Density
                public final long F(long j) {
                    return this.d.F(j);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                public final long H(float f) {
                    return this.d.H(f);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                /* renamed from: Q1 */
                public final float getE() {
                    return this.d.getE();
                }

                @Override // androidx.compose.ui.unit.Density
                public final float T1(float f) {
                    return this.d.T1(f);
                }

                @Override // androidx.compose.ui.unit.Density
                public final int W1(long j) {
                    return this.d.W1(j);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                /* renamed from: a */
                public final long getC() {
                    return this.d.getC();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public final Object c1(Function2 function2, Continuation continuation) {
                    return this.d.c1(function2, continuation);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public final void d1() {
                    this.d.d1();
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: getDensity */
                public final float getD() {
                    return this.d.getD();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public final ViewConfiguration getViewConfiguration() {
                    return this.d.getViewConfiguration();
                }

                @Override // androidx.compose.ui.unit.Density
                public final long p(long j) {
                    return this.d.p(j);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                public final float r(long j) {
                    return this.d.r(j);
                }

                @Override // androidx.compose.ui.unit.Density
                public final int r1(float f) {
                    return this.d.r1(f);
                }

                @Override // androidx.compose.ui.unit.Density
                public final long t(int i) {
                    return this.d.t(i);
                }

                @Override // androidx.compose.ui.unit.Density
                public final float t1(long j) {
                    return this.d.t1(j);
                }

                @Override // androidx.compose.ui.unit.Density
                public final long v(float f) {
                    return this.d.v(f);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objInvoke = LegacyDragAndDropSourceNode.this.u.invoke(new C00121(pointerInputScope, dragAndDropNode), continuation);
                return objInvoke == CoroutineSingletons.d ? objInvoke : Unit.f24250a;
            }
        }));
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
    }
}
