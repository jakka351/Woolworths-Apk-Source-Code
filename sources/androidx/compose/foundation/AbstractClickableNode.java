package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode {
    public static final TraverseKey J = new TraverseKey();
    public SuspendingPointerInputModifierNode A;
    public DelegatableNode B;
    public PressInteraction.Press C;
    public HoverInteraction.Enter D;
    public final MutableLongObjectMap E;
    public long F;
    public MutableInteractionSource G;
    public boolean H;
    public final TraverseKey I;
    public MutableInteractionSource t;
    public IndicationNodeFactory u;
    public String v;
    public Role w;
    public boolean x;
    public Function0 y;
    public final FocusableNode z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TraverseKey {
    }

    public AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, String str, Role role, Function0 function0) {
        this.t = mutableInteractionSource;
        this.u = indicationNodeFactory;
        this.v = str;
        this.w = role;
        this.x = z;
        this.y = function0;
        boolean z2 = false;
        this.z = new FocusableNode(mutableInteractionSource, 0, new AbstractClickableNode$focusableNode$1(1, this, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0));
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f686a;
        this.E = new MutableLongObjectMap();
        this.F = 0L;
        MutableInteractionSource mutableInteractionSource2 = this.t;
        this.G = mutableInteractionSource2;
        if (mutableInteractionSource2 == null && this.u != null) {
            z2 = true;
        }
        this.H = z2;
        this.I = J;
    }

    public abstract boolean A2(KeyEvent keyEvent);

    public abstract void B2(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C2(androidx.compose.foundation.interaction.MutableInteractionSource r4, androidx.compose.foundation.IndicationNodeFactory r5, boolean r6, java.lang.String r7, androidx.compose.ui.semantics.Role r8, kotlin.jvm.functions.Function0 r9) {
        /*
            r3 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r3.G
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.x2()
            r3.G = r4
            r3.t = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            androidx.compose.foundation.IndicationNodeFactory r0 = r3.u
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r5)
            if (r0 != 0) goto L1f
            r3.u = r5
            r4 = r1
        L1f:
            boolean r5 = r3.x
            androidx.compose.foundation.FocusableNode r0 = r3.z
            if (r5 == r6) goto L36
            if (r6 == 0) goto L2b
            r3.s2(r0)
            goto L31
        L2b:
            r3.t2(r0)
            r3.x2()
        L31:
            androidx.compose.ui.node.SemanticsModifierNodeKt.a(r3)
            r3.x = r6
        L36:
            java.lang.String r5 = r3.v
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r7)
            if (r5 != 0) goto L43
            r3.v = r7
            androidx.compose.ui.node.SemanticsModifierNodeKt.a(r3)
        L43:
            androidx.compose.ui.semantics.Role r5 = r3.w
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r8)
            if (r5 != 0) goto L50
            r3.w = r8
            androidx.compose.ui.node.SemanticsModifierNodeKt.a(r3)
        L50:
            r3.y = r9
            boolean r5 = r3.H
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = r3.G
            if (r6 != 0) goto L5e
            androidx.compose.foundation.IndicationNodeFactory r7 = r3.u
            if (r7 == 0) goto L5e
            r7 = r1
            goto L5f
        L5e:
            r7 = r2
        L5f:
            if (r5 == r7) goto L71
            if (r6 != 0) goto L68
            androidx.compose.foundation.IndicationNodeFactory r5 = r3.u
            if (r5 == 0) goto L68
            r2 = r1
        L68:
            r3.H = r2
            if (r2 != 0) goto L71
            androidx.compose.ui.node.DelegatableNode r5 = r3.B
            if (r5 != 0) goto L71
            goto L72
        L71:
            r1 = r4
        L72:
            if (r1 == 0) goto L87
            androidx.compose.ui.node.DelegatableNode r4 = r3.B
            if (r4 != 0) goto L7c
            boolean r5 = r3.H
            if (r5 != 0) goto L87
        L7c:
            if (r4 == 0) goto L81
            r3.t2(r4)
        L81:
            r4 = 0
            r3.B = r4
            r3.y2()
        L87:
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r3.t
            r0.x2(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.C2(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function0):void");
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.t;
        if (mutableInteractionSource != null && (enter = this.D) != null) {
            mutableInteractionSource.a(new HoverInteraction.Exit(enter));
        }
        this.D = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.A;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.D0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G1(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.y2()
            long r0 = androidx.compose.ui.input.key.KeyEvent_androidKt.a(r11)
            boolean r2 = r10.x
            r3 = 3
            r4 = 0
            androidx.collection.MutableLongObjectMap r5 = r10.E
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4e
            int r2 = androidx.compose.ui.input.key.KeyEvent_androidKt.b(r11)
            r8 = 2
            boolean r2 = androidx.compose.ui.input.key.KeyEventType.a(r2, r8)
            if (r2 == 0) goto L4e
            boolean r2 = androidx.compose.foundation.ClickableKt.f(r11)
            if (r2 == 0) goto L4e
            boolean r2 = r5.a(r0)
            if (r2 != 0) goto L44
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = new androidx.compose.foundation.interaction.PressInteraction$Press
            long r8 = r10.F
            r2.<init>(r8)
            r5.h(r0, r2)
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r10.t
            if (r0 == 0) goto L42
            kotlinx.coroutines.CoroutineScope r0 = r10.g2()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1 r1 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1
            r1.<init>(r10, r2, r4)
            kotlinx.coroutines.BuildersKt.c(r0, r4, r4, r1, r3)
        L42:
            r0 = r6
            goto L45
        L44:
            r0 = r7
        L45:
            boolean r11 = r10.A2(r11)
            if (r11 != 0) goto L7f
            if (r0 == 0) goto L80
            goto L7f
        L4e:
            boolean r2 = r10.x
            if (r2 == 0) goto L80
            int r2 = androidx.compose.ui.input.key.KeyEvent_androidKt.b(r11)
            boolean r2 = androidx.compose.ui.input.key.KeyEventType.a(r2, r6)
            if (r2 == 0) goto L80
            boolean r2 = androidx.compose.foundation.ClickableKt.f(r11)
            if (r2 == 0) goto L80
            java.lang.Object r0 = r5.g(r0)
            androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
            if (r0 == 0) goto L7d
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r10.t
            if (r1 == 0) goto L7a
            kotlinx.coroutines.CoroutineScope r1 = r10.g2()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2 r2 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2
            r2.<init>(r10, r0, r4)
            kotlinx.coroutines.BuildersKt.c(r1, r4, r4, r2, r3)
        L7a:
            r10.B2(r11)
        L7d:
            if (r0 == 0) goto L80
        L7f:
            return r6
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.G1(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: P0 */
    public final boolean getR() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* renamed from: W0 */
    public final Object getT() {
        return this.I;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.w;
        if (role != null) {
            SemanticsPropertiesKt.r(semanticsPropertyReceiver, role.f2014a);
        }
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, this.v, new Function0<Boolean>() { // from class: androidx.compose.foundation.AbstractClickableNode$applySemantics$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.h.y.invoke();
                return Boolean.TRUE;
            }
        });
        if (this.x) {
            this.z.b2(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.c(semanticsPropertyReceiver);
        }
        v2(semanticsPropertyReceiver);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f1(androidx.compose.ui.input.pointer.PointerEvent r14, androidx.compose.ui.input.pointer.PointerEventPass r15, long r16) {
        /*
            r13 = this;
            java.lang.String r2 = "event"
            r3 = 2
            r4 = 0
            com.dynatrace.android.compose.SemanticsManager.b = r4     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.Intrinsics.h(r14, r2)     // Catch: java.lang.Throwable -> L2b
            int r0 = r14.e     // Catch: java.lang.Throwable -> L2b
            r5 = 1
            if (r0 != r3) goto L2e
            androidx.compose.ui.Modifier$Node r0 = r13.d     // Catch: java.lang.Throwable -> L2b
            androidx.compose.ui.node.NodeCoordinator r0 = r0.k     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2e
            androidx.compose.ui.node.LayoutNode r0 = r0.p     // Catch: java.lang.Throwable -> L2b
            androidx.compose.ui.node.NodeChain r6 = r0.K     // Catch: java.lang.Throwable -> L2b
            r7 = 8
            boolean r6 = r6.d(r7)     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L2e
            androidx.compose.ui.semantics.SemanticsNode r0 = androidx.compose.ui.semantics.SemanticsNodeKt.a(r0, r5)     // Catch: java.lang.Throwable -> L2b
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r0.i()     // Catch: java.lang.Throwable -> L2b
            com.dynatrace.android.compose.SemanticsManager.b = r0     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto Lac
        L2e:
            long r6 = androidx.compose.ui.unit.IntSizeKt.b(r16)     // Catch: java.lang.Throwable -> L2b
            r0 = 32
            long r8 = r6 >> r0
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L2b
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L2b
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L2b
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L2b
            int r7 = java.lang.Float.floatToRawIntBits(r8)     // Catch: java.lang.Throwable -> L2b
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L2b
            int r6 = java.lang.Float.floatToRawIntBits(r6)     // Catch: java.lang.Throwable -> L2b
            long r11 = (long) r6     // Catch: java.lang.Throwable -> L2b
            long r6 = r7 << r0
            long r8 = r11 & r9
            long r6 = r6 | r8
            r13.F = r6     // Catch: java.lang.Throwable -> L2b
            r13.y2()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r13.x     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L7e
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.e     // Catch: java.lang.Throwable -> L2b
            if (r15 != r0) goto L7e
            int r0 = r14.e     // Catch: java.lang.Throwable -> L2b
            r6 = 4
            r7 = 3
            if (r0 != r6) goto L6f
            kotlinx.coroutines.CoroutineScope r0 = r13.g2()     // Catch: java.lang.Throwable -> L2b
            androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1 r6 = new androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1     // Catch: java.lang.Throwable -> L2b
            r6.<init>(r13, r4)     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.BuildersKt.c(r0, r4, r4, r6, r7)     // Catch: java.lang.Throwable -> L2b
            goto L7e
        L6f:
            r6 = 5
            if (r0 != r6) goto L7e
            kotlinx.coroutines.CoroutineScope r0 = r13.g2()     // Catch: java.lang.Throwable -> L2b
            androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2 r6 = new androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2     // Catch: java.lang.Throwable -> L2b
            r6.<init>(r13, r4)     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.BuildersKt.c(r0, r4, r4, r6, r7)     // Catch: java.lang.Throwable -> L2b
        L7e:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode r0 = r13.A     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L90
            androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3 r0 = new androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r0 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.a(r0)     // Catch: java.lang.Throwable -> L2b
            r13.s2(r0)     // Catch: java.lang.Throwable -> L2b
            r13.A = r0     // Catch: java.lang.Throwable -> L2b
        L90:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode r0 = r13.A     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L99
            r6 = r16
            r0.f1(r14, r15, r6)     // Catch: java.lang.Throwable -> L2b
        L99:
            int r0 = r14.e     // Catch: java.lang.Throwable -> L2b
            if (r0 != r3) goto La6
            int r0 = r15.ordinal()     // Catch: java.lang.Throwable -> L2b
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.d     // Catch: java.lang.Throwable -> L2b
            if (r0 != r3) goto La6
            goto La7
        La6:
            r5 = 0
        La7:
            if (r5 == 0) goto Lab
            com.dynatrace.android.compose.SemanticsManager.b = r4     // Catch: java.lang.Throwable -> L2b
        Lab:
            return
        Lac:
            java.lang.String r5 = com.dynatrace.android.compose.SemanticsManager.f14149a
            kotlin.jvm.internal.Intrinsics.h(r14, r2)
            int r14 = r14.e
            if (r14 != r3) goto Lbf
            int r14 = r15.ordinal()
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.d
            if (r14 != r3) goto Lbf
            com.dynatrace.android.compose.SemanticsManager.b = r4
        Lbf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.f1(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        if (!this.H) {
            y2();
        }
        if (this.x) {
            s2(this.z);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        x2();
        if (this.G == null) {
            this.t = null;
        }
        DelegatableNode delegatableNode = this.B;
        if (delegatableNode != null) {
            t2(delegatableNode);
        }
        this.B = null;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean v0(KeyEvent keyEvent) {
        return false;
    }

    public void v2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public abstract Object w2(PointerInputScope pointerInputScope, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x2() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r0.t
            androidx.collection.MutableLongObjectMap r2 = r0.E
            if (r1 == 0) goto L6a
            androidx.compose.foundation.interaction.PressInteraction$Press r3 = r0.C
            if (r3 == 0) goto L14
            androidx.compose.foundation.interaction.PressInteraction$Cancel r4 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r4.<init>(r3)
            r1.a(r4)
        L14:
            androidx.compose.foundation.interaction.HoverInteraction$Enter r3 = r0.D
            if (r3 == 0) goto L20
            androidx.compose.foundation.interaction.HoverInteraction$Exit r4 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r4.<init>(r3)
            r1.a(r4)
        L20:
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.f685a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6a
            r6 = 0
            r7 = r6
        L2b:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L65
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L45:
            if (r12 >= r10) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            androidx.compose.foundation.interaction.PressInteraction$Press r13 = (androidx.compose.foundation.interaction.PressInteraction.Press) r13
            androidx.compose.foundation.interaction.PressInteraction$Cancel r14 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r14.<init>(r13)
            r1.a(r14)
        L5f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L45
        L63:
            if (r10 != r11) goto L6a
        L65:
            if (r7 == r5) goto L6a
            int r7 = r7 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.C = r1
            r0.D = r1
            r2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.x2():void");
    }

    public final void y2() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.B == null && (indicationNodeFactory = this.u) != null) {
            if (this.t == null) {
                this.t = InteractionSourceKt.a();
            }
            this.z.x2(this.t);
            MutableInteractionSource mutableInteractionSource = this.t;
            Intrinsics.e(mutableInteractionSource);
            DelegatableNode delegatableNodeA = indicationNodeFactory.a(mutableInteractionSource);
            s2(delegatableNodeA);
            this.B = delegatableNodeA;
        }
    }

    public void z2() {
    }
}
