package androidx.compose.ui.node;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.EmptyMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashSet;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    public Modifier.Element r;
    public boolean s;
    public BackwardsCompatLocalMap t;
    public HashSet u;
    public LayoutCoordinates v;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object D(Density density, Object obj) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element).D(density, obj);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getG().d();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void E0() {
        this.s = true;
        DrawModifierNodeKt.a(this);
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void E1(FocusProperties focusProperties) {
        Modifier.Element element = this.r;
        if (!(element instanceof FocusOrderModifier)) {
            InlineClassHelperKt.b("applyFocusProperties called on wrong node");
        }
        ((FocusOrderModifier) element).d2();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
        Modifier.Element element = this.r;
        if (element instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element).G(j);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element;
        if (this.s && (element instanceof DrawCacheModifier)) {
            final Modifier.Element element2 = this.r;
            if (element2 instanceof DrawCacheModifier) {
                OwnerSnapshotObserver snapshotObserver = DelegatableNodeKt.h(this).getSnapshotObserver();
                BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 backwardsCompatNodeKt$DetachedModifierLocalReadScope$1 = BackwardsCompatNodeKt.f1903a;
                snapshotObserver.b(this, BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.h, new Function0<Unit>(this) { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ((DrawCacheModifier) this.h).k0();
                        return Unit.f24250a;
                    }
                });
            }
            this.s = false;
        }
        drawModifier.I(layoutNodeDrawScope);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void J(FocusStateImpl focusStateImpl) {
        Modifier.Element element = this.r;
        if (!(element instanceof FocusEventModifier)) {
            InlineClassHelperKt.b("onFocusEvent called on wrong node");
        }
        ((FocusEventModifier) element).J(focusStateImpl);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).M(lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).N(lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).O(lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void P() {
        if (this.r instanceof PointerInputModifier) {
            D0();
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void Q(NodeCoordinator nodeCoordinator) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element).Q(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final boolean Z1() {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).getG().a();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        int i;
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfigurationR = ((SemanticsModifier) element).R();
        Intrinsics.f(semanticsPropertyReceiver, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) semanticsPropertyReceiver;
        MutableScatterMap mutableScatterMap = semanticsConfiguration.d;
        if (semanticsConfigurationR.f) {
            semanticsConfiguration.f = true;
        }
        if (semanticsConfigurationR.g) {
            semanticsConfiguration.g = true;
        }
        MutableScatterMap mutableScatterMap2 = semanticsConfigurationR.d;
        Object[] objArr = mutableScatterMap2.b;
        Object[] objArr2 = mutableScatterMap2.c;
        long[] jArr = mutableScatterMap2.f698a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        if (!mutableScatterMap.b(semanticsPropertyKey)) {
                            mutableScatterMap.m(semanticsPropertyKey, obj2);
                        } else if (obj2 instanceof AccessibilityAction) {
                            Object objE = mutableScatterMap.e(semanticsPropertyKey);
                            Intrinsics.f(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            AccessibilityAction accessibilityAction = (AccessibilityAction) objE;
                            i = i3;
                            String str = accessibilityAction.f2009a;
                            if (str == null) {
                                str = ((AccessibilityAction) obj2).f2009a;
                            }
                            Function function = accessibilityAction.b;
                            if (function == null) {
                                function = ((AccessibilityAction) obj2).b;
                            }
                            mutableScatterMap.m(semanticsPropertyKey, new AccessibilityAction(str, function));
                        }
                        i = i3;
                    } else {
                        i = i3;
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void d0() {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getG().getClass();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap f0() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this.t;
        return backwardsCompatLocalMap != null ? backwardsCompatLocalMap : EmptyMap.f1898a;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).getG().e(pointerEvent, pointerEventPass);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return DelegatableNodeKt.g(this).D;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.g(this).E;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final long h() {
        return IntSizeKt.d(DelegatableNodeKt.e(this, 128).f);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        s2(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        t2();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).n(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Modifier.Element element = this.r;
        Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).o(lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void q(LayoutCoordinates layoutCoordinates) {
        this.v = layoutCoordinates;
        Modifier.Element element = this.r;
        if (element instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element).q(layoutCoordinates);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3] */
    public final void s2(boolean z) {
        if (!this.q) {
            InlineClassHelperKt.b("initializeModifier called on unattached node");
        }
        Modifier.Element element = this.r;
        if ((this.f & 32) != 0) {
            if (element instanceof ModifierLocalConsumer) {
                DelegatableNodeKt.h(this).B(new Function0<Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.h.u2();
                        return Unit.f24250a;
                    }
                });
            }
            if (element instanceof ModifierLocalProvider) {
                ModifierLocalProvider modifierLocalProvider = (ModifierLocalProvider) element;
                BackwardsCompatLocalMap backwardsCompatLocalMap = this.t;
                if (backwardsCompatLocalMap == null || !backwardsCompatLocalMap.a(modifierLocalProvider.getKey())) {
                    BackwardsCompatLocalMap backwardsCompatLocalMap2 = new BackwardsCompatLocalMap();
                    backwardsCompatLocalMap2.f1897a = modifierLocalProvider;
                    this.t = backwardsCompatLocalMap2;
                    if (BackwardsCompatNodeKt.a(this)) {
                        ModifierLocalManager modifierLocalManager = DelegatableNodeKt.h(this).getModifierLocalManager();
                        ProvidableModifierLocal key = modifierLocalProvider.getKey();
                        modifierLocalManager.b.c(this);
                        modifierLocalManager.c.c(key);
                        modifierLocalManager.a();
                    }
                } else {
                    backwardsCompatLocalMap.f1897a = modifierLocalProvider;
                    ModifierLocalManager modifierLocalManager2 = DelegatableNodeKt.h(this).getModifierLocalManager();
                    ProvidableModifierLocal key2 = modifierLocalProvider.getKey();
                    modifierLocalManager2.b.c(this);
                    modifierLocalManager2.c.c(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f & 4) != 0) {
            if (element instanceof DrawCacheModifier) {
                this.s = true;
            }
            if (!z) {
                DelegatableNodeKt.e(this, 2).z1();
            }
        }
        if ((this.f & 2) != 0) {
            if (BackwardsCompatNodeKt.a(this)) {
                NodeCoordinator nodeCoordinator = this.k;
                Intrinsics.e(nodeCoordinator);
                ((LayoutModifierNodeCoordinator) nodeCoordinator).h2(this);
                OwnedLayer ownedLayer = nodeCoordinator.L;
                if (ownedLayer != null) {
                    ownedLayer.invalidate();
                }
            }
            if (!z) {
                DelegatableNodeKt.e(this, 2).z1();
                DelegatableNodeKt.g(this).W();
            }
        }
        if (element instanceof RemeasurementModifier) {
            ((RemeasurementModifier) element).h0(DelegatableNodeKt.g(this));
        }
        if ((this.f & 128) != 0) {
            if ((element instanceof OnRemeasuredModifier) && BackwardsCompatNodeKt.a(this)) {
                DelegatableNodeKt.g(this).W();
            }
            if (element instanceof OnPlacedModifier) {
                this.v = null;
                if (BackwardsCompatNodeKt.a(this)) {
                    DelegatableNodeKt.h(this).f(new Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3
                        @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                        public final void l() {
                            BackwardsCompatNode backwardsCompatNode = this.d;
                            if (backwardsCompatNode.v == null) {
                                backwardsCompatNode.q(DelegatableNodeKt.e(backwardsCompatNode, 128));
                            }
                        }
                    });
                }
            }
        }
        if ((this.f & 256) != 0 && (element instanceof OnGloballyPositionedModifier) && BackwardsCompatNodeKt.a(this)) {
            DelegatableNodeKt.g(this).W();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).c0().getF1749a().c(this);
        }
        if ((this.f & 16) != 0 && (element instanceof PointerInputModifier)) {
            ((PointerInputModifier) element).getG().b(this.k);
        }
        if ((this.f & 8) != 0) {
            DelegatableNodeKt.h(this).C();
        }
    }

    public final void t2() {
        if (!this.q) {
            InlineClassHelperKt.b("unInitializeModifier called on unattached node");
        }
        Modifier.Element element = this.r;
        if ((this.f & 32) != 0) {
            if (element instanceof ModifierLocalProvider) {
                ModifierLocalManager modifierLocalManager = DelegatableNodeKt.h(this).getModifierLocalManager();
                ProvidableModifierLocal key = ((ModifierLocalProvider) element).getKey();
                modifierLocalManager.d.c(DelegatableNodeKt.g(this));
                modifierLocalManager.e.c(key);
                modifierLocalManager.a();
            }
            if (element instanceof ModifierLocalConsumer) {
                ((ModifierLocalConsumer) element).F1(BackwardsCompatNodeKt.f1903a);
            }
        }
        if ((this.f & 8) != 0) {
            DelegatableNodeKt.h(this).C();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).c0().getF1749a().k(this);
        }
    }

    public final String toString() {
        return this.r.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final Object u(ModifierLocal modifierLocal) {
        NodeChain nodeChain;
        this.u.add(modifierLocal);
        if (!this.d.q) {
            InlineClassHelperKt.b("visitAncestors called on an unattached node");
        }
        Modifier.Node node = this.d.h;
        LayoutNode layoutNodeG = DelegatableNodeKt.g(this);
        while (layoutNodeG != null) {
            if ((layoutNodeG.K.e.g & 32) != 0) {
                while (node != null) {
                    if ((node.f & 32) != 0) {
                        DelegatingNode delegatingNodeB = node;
                        ?? mutableVector = 0;
                        while (delegatingNodeB != 0) {
                            if (delegatingNodeB instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNodeB;
                                if (modifierLocalModifierNode.f0().a(modifierLocal)) {
                                    return modifierLocalModifierNode.f0().b(modifierLocal);
                                }
                            } else if ((delegatingNodeB.f & 32) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNodeB.s;
                                int i = 0;
                                delegatingNodeB = delegatingNodeB;
                                mutableVector = mutableVector;
                                while (node2 != null) {
                                    if ((node2.f & 32) != 0) {
                                        i++;
                                        mutableVector = mutableVector;
                                        if (i == 1) {
                                            delegatingNodeB = node2;
                                        } else {
                                            if (mutableVector == 0) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodeB != 0) {
                                                mutableVector.c(delegatingNodeB);
                                                delegatingNodeB = 0;
                                            }
                                            mutableVector.c(node2);
                                        }
                                    }
                                    node2 = node2.i;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                        }
                    }
                    node = node.h;
                }
            }
            layoutNodeG = layoutNodeG.K();
            node = (layoutNodeG == null || (nodeChain = layoutNodeG.K) == null) ? null : nodeChain.d;
        }
        return modifierLocal.f1899a.invoke();
    }

    public final void u2() {
        if (this.q) {
            this.u.clear();
            OwnerSnapshotObserver snapshotObserver = DelegatableNodeKt.h(this).getSnapshotObserver();
            BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 backwardsCompatNodeKt$DetachedModifierLocalReadScope$1 = BackwardsCompatNodeKt.f1903a;
            snapshotObserver.b(this, BackwardsCompatNodeKt$updateModifierLocalConsumer$1.h, new Function0<Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BackwardsCompatNode backwardsCompatNode = this.h;
                    Modifier.Element element = backwardsCompatNode.r;
                    Intrinsics.f(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((ModifierLocalConsumer) element).F1(backwardsCompatNode);
                    return Unit.f24250a;
                }
            });
        }
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean y0() {
        return this.q;
    }
}
