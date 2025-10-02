package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    public Alignment A;
    public final Function1 B;
    public final Function1 C;
    public Transition r;
    public Transition.DeferredAnimation s;
    public Transition.DeferredAnimation t;
    public Transition.DeferredAnimation u;
    public EnterTransition v;
    public ExitTransition w;
    public GraphicsLayerBlockForEnterExit y;
    public Function0 x = EnterExitTransitionKt$createModifier$1.h;
    public long z = AnimationModifierKt.f716a;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnterExitState enterExitState = EnterExitState.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnterExitState enterExitState2 = EnterExitState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EnterExitTransitionModifierNode(Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.r = transition;
        this.s = deferredAnimation;
        this.t = deferredAnimation2;
        this.u = deferredAnimation3;
        this.v = enterTransition;
        this.w = exitTransition;
        this.y = graphicsLayerBlockForEnterExit;
        ConstraintsKt.b(0, 0, 15);
        this.B = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Transition.Segment segment = (Transition.Segment) obj;
                EnterExitState enterExitState = EnterExitState.d;
                EnterExitState enterExitState2 = EnterExitState.e;
                boolean zC = segment.c(enterExitState, enterExitState2);
                Object obj2 = null;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.h;
                if (zC) {
                    ChangeSize changeSize = enterExitTransitionModifierNode.v.getB().c;
                    if (changeSize != null) {
                        obj2 = changeSize.c;
                    }
                } else if (segment.c(enterExitState2, EnterExitState.f)) {
                    ChangeSize changeSize2 = enterExitTransitionModifierNode.w.getC().c;
                    if (changeSize2 != null) {
                        obj2 = changeSize2.c;
                    }
                } else {
                    obj2 = EnterExitTransitionKt.d;
                }
                return obj2 == null ? EnterExitTransitionKt.d : obj2;
            }
        };
        this.C = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Slide slide;
                Transition.Segment segment = (Transition.Segment) obj;
                EnterExitState enterExitState = EnterExitState.d;
                EnterExitState enterExitState2 = EnterExitState.e;
                boolean zC = segment.c(enterExitState, enterExitState2);
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.h;
                if (zC) {
                    Slide slide2 = enterExitTransitionModifierNode.v.getB().b;
                    return slide2 != null ? slide2.b : EnterExitTransitionKt.c;
                }
                if (segment.c(enterExitState2, EnterExitState.f) && (slide = enterExitTransitionModifierNode.w.getC().b) != null) {
                    return slide.b;
                }
                return EnterExitTransitionKt.c;
            }
        };
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        this.z = AnimationModifierKt.f716a;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        long j2;
        if (this.r.f776a.a() == ((SnapshotMutableStateImpl) this.r.d).getD()) {
            this.A = null;
        } else if (this.A == null) {
            Alignment alignmentS2 = s2();
            if (alignmentS2 == null) {
                alignmentS2 = Alignment.Companion.f1719a;
            }
            this.A = alignmentS2;
        }
        if (measureScope.l1()) {
            final Placeable placeableC0 = measurable.c0(j);
            long j3 = (placeableC0.d << 32) | (placeableC0.e & 4294967295L);
            this.z = j3;
            return measureScope.L0((int) (j3 >> 32), (int) (j3 & 4294967295L), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((Placeable.PlacementScope) obj).e(placeableC0, 0, 0, BitmapDescriptorFactory.HUE_RED);
                    return Unit.f24250a;
                }
            });
        }
        if (!Boolean.TRUE.booleanValue()) {
            final Placeable placeableC02 = measurable.c0(j);
            return measureScope.L0(placeableC02.d, placeableC02.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((Placeable.PlacementScope) obj).e(placeableC02, 0, 0, BitmapDescriptorFactory.HUE_RED);
                    return Unit.f24250a;
                }
            });
        }
        final Function1 function1Init = this.y.init();
        final Placeable placeableC03 = measurable.c0(j);
        long j4 = (placeableC03.d << 32) | (placeableC03.e & 4294967295L);
        final long j5 = AnimationModifierKt.c(this.z) ? this.z : j4;
        Transition.DeferredAnimation deferredAnimation = this.s;
        Transition.DeferredAnimation.DeferredAnimationData deferredAnimationDataA = deferredAnimation != null ? deferredAnimation.a(this.B, new Function1<EnterExitState, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iOrdinal = ((EnterExitState) obj).ordinal();
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.h;
                long j6 = j5;
                if (iOrdinal == 0) {
                    ChangeSize changeSize = enterExitTransitionModifierNode.v.getB().c;
                    if (changeSize != null) {
                        j6 = ((IntSize) changeSize.b.invoke(new IntSize(j6))).f2202a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChangeSize changeSize2 = enterExitTransitionModifierNode.w.getC().c;
                    if (changeSize2 != null) {
                        j6 = ((IntSize) changeSize2.b.invoke(new IntSize(j6))).f2202a;
                    }
                }
                return new IntSize(j6);
            }
        }) : null;
        if (deferredAnimationDataA != null) {
            j4 = ((IntSize) deferredAnimationDataA.getD()).f2202a;
        }
        long jD = ConstraintsKt.d(j, j4);
        Transition.DeferredAnimation deferredAnimation2 = this.t;
        long jA = 0;
        long j6 = deferredAnimation2 != null ? ((IntOffset) deferredAnimation2.a(EnterExitTransitionModifierNode$measure$offsetDelta$1.h, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    r10 = this;
                    androidx.compose.animation.EnterExitState r11 = (androidx.compose.animation.EnterExitState) r11
                    androidx.compose.animation.EnterExitTransitionModifierNode r0 = r10.h
                    androidx.compose.ui.Alignment r1 = r0.A
                    if (r1 != 0) goto L9
                    goto L65
                L9:
                    androidx.compose.ui.Alignment r1 = r0.s2()
                    if (r1 != 0) goto L10
                    goto L65
                L10:
                    androidx.compose.ui.Alignment r1 = r0.A
                    androidx.compose.ui.Alignment r2 = r0.s2()
                    boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r2)
                    if (r1 == 0) goto L1d
                    goto L65
                L1d:
                    int r11 = r11.ordinal()
                    if (r11 == 0) goto L65
                    r1 = 1
                    if (r11 == r1) goto L65
                    r1 = 2
                    if (r11 != r1) goto L5f
                    androidx.compose.animation.ExitTransition r11 = r0.w
                    androidx.compose.animation.TransitionData r11 = r11.getC()
                    androidx.compose.animation.ChangeSize r11 = r11.c
                    if (r11 == 0) goto L65
                    kotlin.jvm.functions.Function1 r11 = r11.b
                    androidx.compose.ui.unit.IntSize r1 = new androidx.compose.ui.unit.IntSize
                    long r3 = r2
                    r1.<init>(r3)
                    java.lang.Object r11 = r11.invoke(r1)
                    androidx.compose.ui.unit.IntSize r11 = (androidx.compose.ui.unit.IntSize) r11
                    long r5 = r11.f2202a
                    androidx.compose.ui.Alignment r2 = r0.s2()
                    kotlin.jvm.internal.Intrinsics.e(r2)
                    androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.ui.unit.LayoutDirection.d
                    long r8 = r2.a(r3, r5, r7)
                    androidx.compose.ui.Alignment r2 = r0.A
                    kotlin.jvm.internal.Intrinsics.e(r2)
                    long r0 = r2.a(r3, r5, r7)
                    long r0 = androidx.compose.ui.unit.IntOffset.c(r8, r0)
                    goto L67
                L5f:
                    kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                    r11.<init>()
                    throw r11
                L65:
                    r0 = 0
                L67:
                    androidx.compose.ui.unit.IntOffset r11 = new androidx.compose.ui.unit.IntOffset
                    r11.<init>(r0)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2.invoke(java.lang.Object):java.lang.Object");
            }
        }).getD()).f2200a : 0L;
        Transition.DeferredAnimation deferredAnimation3 = this.u;
        long j7 = deferredAnimation3 != null ? ((IntOffset) deferredAnimation3.a(this.C, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterExitState enterExitState = (EnterExitState) obj;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.h;
                Slide slide = enterExitTransitionModifierNode.v.getB().b;
                long j8 = j5;
                long j9 = 0;
                long j10 = slide != null ? ((IntOffset) slide.f735a.invoke(new IntSize(j8))).f2200a : 0L;
                Slide slide2 = enterExitTransitionModifierNode.w.getC().b;
                long j11 = slide2 != null ? ((IntOffset) slide2.f735a.invoke(new IntSize(j8))).f2200a : 0L;
                int iOrdinal = enterExitState.ordinal();
                if (iOrdinal == 0) {
                    j9 = j10;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j9 = j11;
                }
                return new IntOffset(j9);
            }
        }).getD()).f2200a : 0L;
        Alignment alignment = this.A;
        if (alignment != null) {
            long j8 = j5;
            j2 = j7;
            jA = alignment.a(j8, jD, LayoutDirection.d);
        } else {
            j2 = j7;
        }
        final long jD2 = IntOffset.d(jA, j2);
        final long j9 = j6;
        return measureScope.L0((int) (jD >> 32), (int) (jD & 4294967295L), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j10 = jD2;
                long j11 = j9;
                ((Placeable.PlacementScope) obj).l(placeableC03, ((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)), BitmapDescriptorFactory.HUE_RED, function1Init);
                return Unit.f24250a;
            }
        });
    }

    public final Alignment s2() {
        Alignment alignment;
        Alignment alignment2;
        if (this.r.f().c(EnterExitState.d, EnterExitState.e)) {
            ChangeSize changeSize = this.v.getB().c;
            if (changeSize != null && (alignment2 = changeSize.f718a) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.w.getC().c;
            if (changeSize2 != null) {
                return changeSize2.f718a;
            }
            return null;
        }
        ChangeSize changeSize3 = this.w.getC().c;
        if (changeSize3 != null && (alignment = changeSize3.f718a) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.v.getB().c;
        if (changeSize4 != null) {
            return changeSize4.f718a;
        }
        return null;
    }
}
