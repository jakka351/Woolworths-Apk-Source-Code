package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, CompositionLocalConsumerModifierNode {
    public OverscrollEffect B;
    public FlingBehavior C;
    public final NestedScrollDispatcher D;
    public final ScrollableContainerNode E;
    public final DefaultFlingBehavior F;
    public final ScrollingLogic G;
    public final ScrollableNestedScrollConnection H;
    public final ContentInViewNode I;
    public Function2 J;
    public Function2 K;
    public MouseWheelScrollingLogic L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.foundation.gestures.FlingBehavior] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.foundation.gestures.ScrollableNode, androidx.compose.ui.node.DelegatingNode] */
    public ScrollableNode(OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSource mutableInteractionSource, boolean z, boolean z2) {
        super(ScrollableKt$CanDragCalculation$1.h, z, mutableInteractionSource, orientation);
        Function1 function1 = ScrollableKt.f898a;
        this.B = overscrollEffect;
        this.C = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.D = nestedScrollDispatcher;
        ScrollableContainerNode scrollableContainerNode = new ScrollableContainerNode();
        scrollableContainerNode.r = z;
        s2(scrollableContainerNode);
        this.E = scrollableContainerNode;
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(DecayAnimationSpecKt.c(new SplineBasedFloatDecayAnimationSpec(ScrollableKt.d)));
        this.F = defaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.B;
        ?? r1 = this.C;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState, overscrollEffect2, r1 == 0 ? defaultFlingBehavior : r1, orientation, z2, nestedScrollDispatcher, new ScrollableNode$scrollingLogic$1(this));
        this.G = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.H = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = new ContentInViewNode(orientation, scrollingLogic, z2, bringIntoViewSpec);
        s2(contentInViewNode);
        this.I = contentInViewNode;
        s2(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        s2(new FocusTargetNode(2, 4, null));
        s2(new BringIntoViewResponderNode(contentInViewNode));
        s2(new FocusedBoundsObserverNode(new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Rect rectT2;
                ContentInViewNode contentInViewNode2 = ScrollableNode.this.I;
                contentInViewNode2.w = (LayoutCoordinates) obj;
                if (contentInViewNode2.y && (rectT2 = contentInViewNode2.t2()) != null && !contentInViewNode2.u2(contentInViewNode2.z, rectT2)) {
                    contentInViewNode2.x = true;
                    contentInViewNode2.v2();
                }
                contentInViewNode2.y = false;
                return Unit.f24250a;
            }
        }));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void A2(long j) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void B2(long j) {
        BuildersKt.c(this.D.c(), null, null, new ScrollableNode$onDragStopped$1(this, j, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: C2 */
    public final boolean getD() {
        ScrollingLogic scrollingLogic = this.G;
        if (scrollingLogic.f900a.a()) {
            return true;
        }
        OverscrollEffect overscrollEffect = scrollingLogic.b;
        return overscrollEffect != null ? overscrollEffect.j() : false;
    }

    public final void E2(OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSource mutableInteractionSource, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.v != z) {
            this.H.e = z;
            this.E.r = z;
            z3 = true;
        } else {
            z3 = false;
        }
        FlingBehavior flingBehavior2 = flingBehavior == null ? this.F : flingBehavior;
        ScrollingLogic scrollingLogic = this.G;
        if (!Intrinsics.c(scrollingLogic.f900a, scrollableState)) {
            scrollingLogic.f900a = scrollableState;
            z5 = true;
        }
        scrollingLogic.b = overscrollEffect;
        if (scrollingLogic.d != orientation) {
            scrollingLogic.d = orientation;
            z5 = true;
        }
        if (scrollingLogic.e != z2) {
            scrollingLogic.e = z2;
        } else {
            z4 = z5;
        }
        scrollingLogic.c = flingBehavior2;
        scrollingLogic.f = this.D;
        ContentInViewNode contentInViewNode = this.I;
        contentInViewNode.r = orientation;
        contentInViewNode.t = z2;
        contentInViewNode.u = bringIntoViewSpec;
        this.B = overscrollEffect;
        this.C = flingBehavior;
        Function1 function1 = ScrollableKt.f898a;
        Orientation orientation2 = scrollingLogic.d;
        Orientation orientation3 = Orientation.d;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.e;
        }
        D2(ScrollableKt$CanDragCalculation$1.h, z, mutableInteractionSource, orientation3, z4);
        if (z3) {
            this.J = null;
            this.K = null;
            SemanticsModifierNodeKt.a(this);
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean G1(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.v) {
            return false;
        }
        long jA = KeyEvent_androidKt.a(keyEvent);
        int i = Key.p;
        if ((!Key.a(jA, Key.Companion.j()) && !Key.a(KeyEvent_androidKt.a(keyEvent), Key.Companion.k())) || !KeyEventType.a(KeyEvent_androidKt.b(keyEvent), 2) || KeyEvent_androidKt.c(keyEvent)) {
            return false;
        }
        Orientation orientation = this.G.d;
        Orientation orientation2 = Orientation.d;
        ContentInViewNode contentInViewNode = this.I;
        if (orientation == orientation2) {
            int i2 = (int) (contentInViewNode.z & 4294967295L);
            float f = Key.a(KeyEvent_androidKt.a(keyEvent), Key.Companion.k()) ? i2 : -i2;
            jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            int i3 = (int) (contentInViewNode.z >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(Key.a(KeyEvent_androidKt.a(keyEvent), Key.Companion.k()) ? i3 : -i3);
            iFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
        }
        BuildersKt.c(g2(), null, null, new ScrollableNode$onKeyEvent$1(this, (jFloatToRawIntBits << 32) | (iFloatToRawIntBits & 4294967295L), null), 3);
        return true;
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void P() {
        D0();
        if (this.q) {
            Density density = DelegatableNodeKt.g(this).D;
            DefaultFlingBehavior defaultFlingBehavior = this.F;
            defaultFlingBehavior.getClass();
            defaultFlingBehavior.f880a = DecayAnimationSpecKt.c(new SplineBasedFloatDecayAnimationSpec(density));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.L;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.h(DelegatableNodeKt.g(this).D);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.v && (this.J == null || this.K == null)) {
            this.J = new Function2<Float, Float, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {518}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ ScrollableNode q;
                    public final /* synthetic */ float r;
                    public final /* synthetic */ float s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ScrollableNode scrollableNode, float f, float f2, Continuation continuation) {
                        super(2, continuation);
                        this.q = scrollableNode;
                        this.r = f;
                        this.s = f2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.q, this.r, this.s, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i == 0) {
                            ResultKt.b(obj);
                            ScrollingLogic scrollingLogic = this.q.G;
                            long jFloatToRawIntBits = (Float.floatToRawIntBits(this.r) << 32) | (Float.floatToRawIntBits(this.s) & 4294967295L);
                            this.p = 1;
                            if (ScrollableKt.a(scrollingLogic, jFloatToRawIntBits, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                        }
                        return Unit.f24250a;
                    }
                }

                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Number) obj).floatValue();
                    float fFloatValue2 = ((Number) obj2).floatValue();
                    ScrollableNode scrollableNode = this.h;
                    BuildersKt.c(scrollableNode.g2(), null, null, new AnonymousClass1(scrollableNode, fFloatValue, fFloatValue2, null), 3);
                    return Boolean.TRUE;
                }
            };
            this.K = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        Function2 function2 = this.J;
        if (function2 != null) {
            KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
            semanticsPropertyReceiver.b(SemanticsActions.d, new AccessibilityAction(null, function2));
        }
        Function2 function22 = this.K;
        if (function22 != null) {
            KProperty[] kPropertyArr2 = SemanticsPropertiesKt.f2022a;
            semanticsPropertyReceiver.b(SemanticsActions.e, function22);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        ?? r0 = pointerEvent.f1851a;
        int size = ((Collection) r0).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) this.u.invoke((PointerInputChange) r0.get(i))).booleanValue()) {
                super.f1(pointerEvent, pointerEventPass, j);
                break;
            }
            i++;
        }
        if (this.v) {
            if (pointerEventPass == PointerEventPass.d && pointerEvent.e == 6) {
                if (this.L == null) {
                    this.L = new MouseWheelScrollingLogic(this.G, AndroidScrollable_androidKt.a(this), new ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(this), DelegatableNodeKt.g(this).D);
                }
                MouseWheelScrollingLogic mouseWheelScrollingLogic = this.L;
                if (mouseWheelScrollingLogic != null) {
                    mouseWheelScrollingLogic.e(g2());
                }
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic2 = this.L;
            if (mouseWheelScrollingLogic2 != null) {
                mouseWheelScrollingLogic2.d(pointerEvent, pointerEventPass, j);
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        if (this.q) {
            Density density = DelegatableNodeKt.g(this).D;
            DefaultFlingBehavior defaultFlingBehavior = this.F;
            defaultFlingBehavior.getClass();
            defaultFlingBehavior.f880a = DecayAnimationSpecKt.c(new SplineBasedFloatDecayAnimationSpec(density));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.L;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.h(DelegatableNodeKt.g(this).D);
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean v0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object z2(Function2 function2, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.e;
        ScrollingLogic scrollingLogic = this.G;
        Object objF = scrollingLogic.f(mutatePriority, new ScrollableNode$drag$2$1(scrollingLogic, null, function2), (ContinuationImpl) continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }
}
