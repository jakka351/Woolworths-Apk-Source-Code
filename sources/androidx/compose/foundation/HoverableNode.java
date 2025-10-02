package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {
    public MutableInteractionSource r;
    public HoverInteraction.Enter s;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s2(androidx.compose.foundation.HoverableNode r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitEnter$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = (androidx.compose.foundation.HoverableNode$emitEnter$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = new androidx.compose.foundation.HoverableNode$emitEnter$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            androidx.compose.foundation.interaction.HoverInteraction$Enter r4 = r0.q
            java.lang.Object r0 = r0.p
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            kotlin.ResultKt.b(r5)
            r5 = r4
            r4 = r0
            goto L52
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.b(r5)
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = r4.s
            if (r5 != 0) goto L54
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r5.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r4.r
            r0.p = r4
            r0.q = r5
            r0.t = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r4.s = r5
        L54:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.s2(androidx.compose.foundation.HoverableNode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object t2(androidx.compose.foundation.HoverableNode r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitExit$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = (androidx.compose.foundation.HoverableNode$emitExit$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = new androidx.compose.foundation.HoverableNode$emitExit$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.p
            androidx.compose.foundation.HoverableNode r4 = (androidx.compose.foundation.HoverableNode) r4
            kotlin.ResultKt.b(r5)
            goto L4c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.b(r5)
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = r4.s
            if (r5 == 0) goto L4f
            androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r2.<init>(r5)
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r4.r
            r0.p = r4
            r0.s = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            r4.s = r5
        L4f:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.t2(androidx.compose.foundation.HoverableNode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        u2();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.e) {
            int i = pointerEvent.e;
            if (i == 4) {
                BuildersKt.c(g2(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3);
            } else if (i == 5) {
                BuildersKt.c(g2(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3);
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        u2();
    }

    public final void u2() {
        HoverInteraction.Enter enter = this.s;
        if (enter != null) {
            this.r.a(new HoverInteraction.Exit(enter));
            this.s = null;
        }
    }
}
