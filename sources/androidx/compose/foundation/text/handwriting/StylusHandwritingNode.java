package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    public Function0 t;
    public boolean u;
    public final SuspendingPointerInputModifierNode v;

    public StylusHandwritingNode(Function0 function0) {
        this.t = function0;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplA = SuspendingPointerInputFilterKt.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {105, 133, 171}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
            final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public PointerInputChange q;
                public PointerEventPass r;
                public int s;
                public /* synthetic */ Object t;
                public final /* synthetic */ StylusHandwritingNode u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, Continuation continuation) {
                    super(2, continuation);
                    this.u = stylusHandwritingNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.u, continuation);
                    anonymousClass1.t = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
                
                    if (r9 == r1) goto L71;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
                
                    if (r5 == r1) goto L71;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0153, code lost:
                
                    if (r4 != r1) goto L72;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Path cross not found for [B:29:0x00a1, B:24:0x0081], limit reached: 89 */
                /* JADX WARN: Path cross not found for [B:32:0x00a6, B:35:0x00ac], limit reached: 89 */
                /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bd -> B:40:0x00c1). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0153 -> B:72:0x0156). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                    /*
                        Method dump skipped, instructions count: 404
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objC = ForEachGestureKt.c(pointerInputScope, new AnonymousClass1(this.d, null), continuation);
                return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
            }
        });
        s2(suspendingPointerInputModifierNodeImplA);
        this.v = suspendingPointerInputModifierNodeImplA;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        this.v.D0();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void J(FocusStateImpl focusStateImpl) {
        this.u = focusStateImpl.a();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.v.f1(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final long w0() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = StylusHandwritingKt.f1147a;
        Density density = DelegatableNodeKt.g(this).D;
        dpTouchBoundsExpansion.getClass();
        int i = TouchBoundsExpansion.b;
        return TouchBoundsExpansion.Companion.c(density.r1(dpTouchBoundsExpansion.f1909a), density.r1(dpTouchBoundsExpansion.b), density.r1(dpTouchBoundsExpansion.c), density.r1(dpTouchBoundsExpansion.d));
    }
}
