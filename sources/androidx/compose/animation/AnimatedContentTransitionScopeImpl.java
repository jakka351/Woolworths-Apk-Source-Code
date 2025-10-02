package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0003\u0004\u0005¨\u0006\b²\u0006\u0014\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "ChildData", "SizeModifierElement", "SizeModifierNode", "", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {

    /* renamed from: a, reason: collision with root package name */
    public final Transition f713a;
    public Alignment b;
    public LayoutDirection c;
    public final MutableState d = SnapshotStateKt.f(new IntSize(0));
    public final MutableScatterMap e;
    public Transition.DeferredAnimation.DeferredAnimationData f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ChildData implements ParentDataModifier {
        public final MutableState d;

        public ChildData(boolean z) {
            this.d = SnapshotStateKt.f(Boolean.valueOf(z));
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object D(Density density, Object obj) {
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;", "S", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {
        public final Transition.DeferredAnimation d;
        public final MutableState e;
        public final AnimatedContentTransitionScopeImpl f;

        public SizeModifierElement(Transition.DeferredAnimation deferredAnimation, MutableState mutableState, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.d = deferredAnimation;
            this.e = mutableState;
            this.f = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node a() {
            SizeModifierNode sizeModifierNode = new SizeModifierNode();
            sizeModifierNode.r = this.d;
            sizeModifierNode.s = this.e;
            sizeModifierNode.t = this.f;
            sizeModifierNode.u = AnimatedContentKt.f709a;
            return sizeModifierNode;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void b(Modifier.Node node) {
            SizeModifierNode sizeModifierNode = (SizeModifierNode) node;
            sizeModifierNode.r = this.d;
            sizeModifierNode.s = this.e;
            sizeModifierNode.t = this.f;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return Intrinsics.c(sizeModifierElement.d, this.d) && sizeModifierElement.e.equals(this.e);
        }

        public final int hashCode() {
            int iHashCode = this.f.hashCode() * 31;
            Transition.DeferredAnimation deferredAnimation = this.d;
            return this.e.hashCode() + ((iHashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "S", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {
        public Transition.DeferredAnimation r;
        public MutableState s;
        public AnimatedContentTransitionScopeImpl t;
        public long u;

        @Override // androidx.compose.ui.Modifier.Node
        public final void m2() {
            this.u = AnimatedContentKt.f709a;
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
            final long j2;
            final Placeable placeableC0 = measurable.c0(j);
            if (measureScope.l1()) {
                j2 = (placeableC0.d << 32) | (placeableC0.e & 4294967295L);
            } else {
                Transition.DeferredAnimation deferredAnimation = this.r;
                if (deferredAnimation == null) {
                    j2 = (placeableC0.d << 32) | (placeableC0.e & 4294967295L);
                    this.u = j2;
                } else {
                    final long j3 = (placeableC0.e & 4294967295L) | (placeableC0.d << 32);
                    Transition.DeferredAnimation.DeferredAnimationData deferredAnimationDataA = deferredAnimation.a(new Function1<Transition.Segment<Object>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            long j4;
                            FiniteAnimationSpec finiteAnimationSpecB;
                            Transition.Segment segment = (Transition.Segment) obj;
                            Object f778a = segment.getF778a();
                            AnimatedContentTransitionScopeImpl.SizeModifierNode sizeModifierNode = this.h;
                            if (Intrinsics.c(f778a, sizeModifierNode.t.getF778a())) {
                                j4 = IntSize.b(sizeModifierNode.u, AnimatedContentKt.f709a) ? j3 : sizeModifierNode.u;
                            } else {
                                State state = (State) sizeModifierNode.t.e.e(segment.getF778a());
                                j4 = state != null ? ((IntSize) state.getD()).f2202a : 0L;
                            }
                            State state2 = (State) sizeModifierNode.t.e.e(segment.getB());
                            long j5 = state2 != null ? ((IntSize) state2.getD()).f2202a : 0L;
                            SizeTransform sizeTransform = (SizeTransform) sizeModifierNode.s.getD();
                            return (sizeTransform == null || (finiteAnimationSpecB = sizeTransform.b(j4, j5)) == null) ? AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5) : finiteAnimationSpecB;
                        }
                    }, new Function1<Object, IntSize>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            long j4;
                            AnimatedContentTransitionScopeImpl.SizeModifierNode sizeModifierNode = this.h;
                            if (Intrinsics.c(obj, sizeModifierNode.t.getF778a())) {
                                j4 = IntSize.b(sizeModifierNode.u, AnimatedContentKt.f709a) ? j3 : sizeModifierNode.u;
                            } else {
                                State state = (State) sizeModifierNode.t.e.e(obj);
                                j4 = state != null ? ((IntSize) state.getD()).f2202a : 0L;
                            }
                            return new IntSize(j4);
                        }
                    });
                    this.t.f = deferredAnimationDataA;
                    j2 = ((IntSize) deferredAnimationDataA.getD()).f2202a;
                    this.u = ((IntSize) deferredAnimationDataA.getD()).f2202a;
                }
            }
            return measureScope.L0((int) (j2 >> 32), (int) (4294967295L & j2), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Alignment alignment = this.h.t.b;
                    Placeable.PlacementScope.g((Placeable.PlacementScope) obj, placeableC0, alignment.a((r0.e & 4294967295L) | (r0.d << 32), j2, LayoutDirection.d));
                    return Unit.f24250a;
                }
            });
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.f713a = transition;
        this.b = alignment;
        this.c = layoutDirection;
        long[] jArr = ScatterMapKt.f699a;
        this.e = new MutableScatterMap();
    }

    public static final long i(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, long j, long j2) {
        return animatedContentTransitionScopeImpl.b.a(j, j2, LayoutDirection.d);
    }

    public static final long j(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData = animatedContentTransitionScopeImpl.f;
        return deferredAnimationData != null ? ((IntSize) deferredAnimationData.getD()).f2202a : ((IntSize) ((SnapshotMutableStateImpl) animatedContentTransitionScopeImpl.d).getD()).f2202a;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public final EnterTransition a(int i, SpringSpec springSpec) {
        return (i == 0 || (i == 4 && this.c == LayoutDirection.d) || (i == 5 && this.c == LayoutDirection.e)) ? EnterExitTransitionKt.m(springSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
            public final /* synthetic */ Function1 h = AnimatedContentTransitionScope$slideIntoContainer$1.h;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.i;
                long j = iIntValue;
                return (Integer) this.h.invoke(Integer.valueOf(((int) (AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl) >> 32)) - ((int) (AnimatedContentTransitionScopeImpl.i(animatedContentTransitionScopeImpl, (j & 4294967295L) | (j << 32), AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl)) >> 32))));
            }
        }) : (i == 1 || (i == 4 && this.c == LayoutDirection.e) || (i == 5 && this.c == LayoutDirection.d)) ? EnterExitTransitionKt.m(springSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
            public final /* synthetic */ Function1 h = AnimatedContentTransitionScope$slideIntoContainer$1.h;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                long j = iIntValue;
                long j2 = (j & 4294967295L) | (j << 32);
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.i;
                return (Integer) this.h.invoke(Integer.valueOf((-((int) (AnimatedContentTransitionScopeImpl.i(animatedContentTransitionScopeImpl, j2, AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl)) >> 32))) - iIntValue));
            }
        }) : i == 2 ? EnterExitTransitionKt.n(springSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
            public final /* synthetic */ Function1 h = AnimatedContentTransitionScope$slideIntoContainer$1.h;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.i;
                long j = iIntValue;
                return (Integer) this.h.invoke(Integer.valueOf(((int) (AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl) & 4294967295L)) - ((int) (AnimatedContentTransitionScopeImpl.i(animatedContentTransitionScopeImpl, (j & 4294967295L) | (j << 32), AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl)) & 4294967295L))));
            }
        }) : i == 3 ? EnterExitTransitionKt.n(springSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            public final /* synthetic */ Function1 h = AnimatedContentTransitionScope$slideIntoContainer$1.h;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                long j = iIntValue;
                long j2 = (j & 4294967295L) | (j << 32);
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.i;
                return (Integer) this.h.invoke(Integer.valueOf((-((int) (AnimatedContentTransitionScopeImpl.i(animatedContentTransitionScopeImpl, j2, AnimatedContentTransitionScopeImpl.j(animatedContentTransitionScopeImpl)) & 4294967295L))) - iIntValue));
            }
        }) : EnterTransition.f722a;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public final ExitTransition d(int i, SpringSpec springSpec) {
        return (i == 0 || (i == 4 && this.c == LayoutDirection.d) || (i == 5 && this.c == LayoutDirection.e)) ? EnterExitTransitionKt.p(springSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
            public final /* synthetic */ Function1 i = AnimatedContentTransitionScope$slideOutOfContainer$1.h;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.h;
                State state = (State) animatedContentTransitionScopeImpl.e.e(((SnapshotMutableStateImpl) animatedContentTransitionScopeImpl.f713a.d).getD());
                long j = state != null ? ((IntSize) state.getD()).f2202a : 0L;
                long j2 = iIntValue;
                return (Integer) AnimatedContentTransitionScope$slideOutOfContainer$1.h.invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.b.a((j2 << 32) | (j2 & 4294967295L), j, LayoutDirection.d) >> 32))) - iIntValue));
            }
        }) : (i == 1 || (i == 4 && this.c == LayoutDirection.e) || (i == 5 && this.c == LayoutDirection.d)) ? EnterExitTransitionKt.p(springSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
            public final /* synthetic */ Function1 i = AnimatedContentTransitionScope$slideOutOfContainer$1.h;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.h;
                State state = (State) animatedContentTransitionScopeImpl.e.e(((SnapshotMutableStateImpl) animatedContentTransitionScopeImpl.f713a.d).getD());
                long j = state != null ? ((IntSize) state.getD()).f2202a : 0L;
                long j2 = iIntValue;
                return (Integer) AnimatedContentTransitionScope$slideOutOfContainer$1.h.invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.b.a((j2 << 32) | (j2 & 4294967295L), j, LayoutDirection.d) >> 32))) + ((int) (j >> 32))));
            }
        }) : i == 2 ? EnterExitTransitionKt.q(springSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
            public final /* synthetic */ Function1 i = AnimatedContentTransitionScope$slideOutOfContainer$1.h;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.h;
                State state = (State) animatedContentTransitionScopeImpl.e.e(((SnapshotMutableStateImpl) animatedContentTransitionScopeImpl.f713a.d).getD());
                long j = state != null ? ((IntSize) state.getD()).f2202a : 0L;
                long j2 = iIntValue;
                return (Integer) AnimatedContentTransitionScope$slideOutOfContainer$1.h.invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.b.a((j2 << 32) | (j2 & 4294967295L), j, LayoutDirection.d) & 4294967295L))) - iIntValue));
            }
        }) : i == 3 ? EnterExitTransitionKt.q(springSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            public final /* synthetic */ Function1 i = AnimatedContentTransitionScope$slideOutOfContainer$1.h;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.h;
                State state = (State) animatedContentTransitionScopeImpl.e.e(((SnapshotMutableStateImpl) animatedContentTransitionScopeImpl.f713a.d).getD());
                long j = state != null ? ((IntSize) state.getD()).f2202a : 0L;
                long j2 = iIntValue;
                return (Integer) AnimatedContentTransitionScope$slideOutOfContainer$1.h.invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.b.a((j2 << 32) | (j2 & 4294967295L), j, LayoutDirection.d) & 4294967295L))) + ((int) (j & 4294967295L))));
            }
        }) : ExitTransition.f723a;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    /* renamed from: f */
    public final Object getB() {
        return this.f713a.f().getB();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public final ContentTransform g(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.d = sizeTransform;
        return contentTransform;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    /* renamed from: h */
    public final Object getF778a() {
        return this.f713a.f().getF778a();
    }
}
