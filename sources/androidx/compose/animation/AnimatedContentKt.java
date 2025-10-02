package androidx.compose.animation;

import androidx.camera.core.impl.b;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimatedContentKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f709a;

    static {
        long j = Integer.MIN_VALUE;
        f709a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(final Transition transition, final Modifier modifier, final Function1 function1, final Alignment alignment, final Function1 function12, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImpl;
        Function1 function13;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        SnapshotStateList snapshotStateList;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2;
        Transition.DeferredAnimation deferredAnimationC;
        boolean z;
        final Transition transition2 = transition;
        final Function1 function14 = function1;
        ComposerImpl composerImplV = composer.v(-114689412);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(transition2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function14) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(alignment) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function12) ? 16384 : 8192;
        }
        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl2) ? 131072 : 65536;
        }
        if (composerImplV.z(i2 & 1, (74899 & i2) != 74898)) {
            LayoutDirection layoutDirection = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (z2 || objG == obj) {
                objG = new AnimatedContentTransitionScopeImpl(transition2, alignment, layoutDirection);
                composerImplV.A(objG);
            }
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) objG;
            boolean z3 = i3 == 4;
            Object objG2 = composerImplV.G();
            Object obj2 = objG2;
            if (z3 || objG2 == obj) {
                Object[] objArr = {transition2.f776a.a()};
                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                snapshotStateList2.addAll(ArraysKt.l0(objArr));
                composerImplV.A(snapshotStateList2);
                obj2 = snapshotStateList2;
            }
            final SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj2;
            boolean z4 = i3 == 4;
            Object objG3 = composerImplV.G();
            if (z4 || objG3 == obj) {
                long[] jArr = ScatterMapKt.f699a;
                objG3 = new MutableScatterMap();
                composerImplV.A(objG3);
            }
            MutableScatterMap mutableScatterMap = (MutableScatterMap) objG3;
            TransitionState transitionState = transition2.f776a;
            MutableState mutableState = transition2.d;
            if (!snapshotStateList3.contains(transitionState.a())) {
                snapshotStateList3.clear();
                snapshotStateList3.add(transitionState.a());
            }
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
            if (Intrinsics.c(transitionState.a(), snapshotMutableStateImpl.getD())) {
                if (snapshotStateList3.size() != 1 || !Intrinsics.c(snapshotStateList3.get(0), transitionState.a())) {
                    snapshotStateList3.clear();
                    snapshotStateList3.add(transitionState.a());
                }
                if (mutableScatterMap.e != 1 || mutableScatterMap.c(transitionState.a())) {
                    mutableScatterMap.g();
                }
                animatedContentTransitionScopeImpl3.b = alignment;
                animatedContentTransitionScopeImpl3.c = layoutDirection;
            }
            if (!Intrinsics.c(transitionState.a(), snapshotMutableStateImpl.getD()) && !snapshotStateList3.contains(snapshotMutableStateImpl.getD())) {
                ListIterator listIterator = snapshotStateList3.listIterator();
                int i4 = 0;
                while (true) {
                    ListIterator listIterator2 = listIterator;
                    if (!listIterator.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (Intrinsics.c(function12.invoke(listIterator2.next()), function12.invoke(snapshotMutableStateImpl.getD()))) {
                            break;
                        }
                        i4++;
                        listIterator = listIterator2;
                    }
                }
                if (i4 == -1) {
                    snapshotStateList3.add(snapshotMutableStateImpl.getD());
                } else {
                    snapshotStateList3.set(i4, snapshotMutableStateImpl.getD());
                }
            }
            if (mutableScatterMap.c(snapshotMutableStateImpl.getD()) && mutableScatterMap.c(transitionState.a())) {
                composerImplV.o(919489879);
                composerImplV.V(false);
                function13 = function14;
                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
            } else {
                composerImplV.o(916905750);
                mutableScatterMap.g();
                int size = snapshotStateList3.size();
                int i5 = 0;
                while (i5 < size) {
                    final Object obj3 = snapshotStateList3.get(i5);
                    int i6 = i5;
                    final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                    mutableScatterMap.m(obj3, ComposableLambdaKt.c(885640742, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            Composer composer2 = (Composer) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Object objG4 = composer2.G();
                                Function1 function15 = function14;
                                final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl4;
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (objG4 == composer$Companion$Empty$1) {
                                    objG4 = (ContentTransform) function15.invoke(animatedContentTransitionScopeImpl5);
                                    composer2.A(objG4);
                                }
                                final ContentTransform contentTransform = (ContentTransform) objG4;
                                Transition transition3 = transition2;
                                Transition.Segment segmentF = transition3.f();
                                MutableState mutableState2 = transition3.d;
                                Object b = segmentF.getB();
                                final Object obj6 = obj3;
                                boolean zP = composer2.p(Intrinsics.c(b, obj6));
                                Object objG5 = composer2.G();
                                if (zP || objG5 == composer$Companion$Empty$1) {
                                    objG5 = Intrinsics.c(transition3.f().getB(), obj6) ? ExitTransition.f723a : ((ContentTransform) function15.invoke(animatedContentTransitionScopeImpl5)).b;
                                    composer2.A(objG5);
                                }
                                final ExitTransition exitTransition = (ExitTransition) objG5;
                                Object objG6 = composer2.G();
                                if (objG6 == composer$Companion$Empty$1) {
                                    objG6 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.c(obj6, ((SnapshotMutableStateImpl) mutableState2).getD()));
                                    composer2.A(objG6);
                                }
                                AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) objG6;
                                EnterTransition enterTransition = contentTransform.f720a;
                                boolean zI = composer2.I(contentTransform);
                                Object objG7 = composer2.G();
                                if (zI || objG7 == composer$Companion$Empty$1) {
                                    objG7 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            final Placeable placeableC0 = ((Measurable) obj8).c0(((Constraints) obj9).f2197a);
                                            int i7 = placeableC0.d;
                                            int i8 = placeableC0.e;
                                            final ContentTransform contentTransform2 = contentTransform;
                                            return ((MeasureScope) obj7).L0(i7, i8, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj10) {
                                                    ((Placeable.PlacementScope) obj10).e(placeableC0, 0, 0, ((SnapshotMutableFloatStateImpl) contentTransform2.c).a());
                                                    return Unit.f24250a;
                                                }
                                            });
                                        }
                                    };
                                    composer2.A(objG7);
                                }
                                Modifier modifierA = LayoutModifierKt.a(Modifier.Companion.d, (Function3) objG7);
                                ((SnapshotMutableStateImpl) childData.d).setValue(Boolean.valueOf(Intrinsics.c(obj6, ((SnapshotMutableStateImpl) mutableState2).getD())));
                                Modifier modifierX0 = modifierA.x0(childData);
                                boolean zI2 = composer2.I(obj6);
                                Object objG8 = composer2.G();
                                if (zI2 || objG8 == composer$Companion$Empty$1) {
                                    objG8 = new Function1<Object, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            return Boolean.valueOf(Intrinsics.c(obj7, obj6));
                                        }
                                    };
                                    composer2.A(objG8);
                                }
                                Function1 function16 = (Function1) objG8;
                                boolean zN = composer2.n(exitTransition);
                                Object objG9 = composer2.G();
                                if (zN || objG9 == composer$Companion$Empty$1) {
                                    objG9 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj7, Object obj8) {
                                            EnterExitState enterExitState = (EnterExitState) obj7;
                                            EnterExitState enterExitState2 = (EnterExitState) obj8;
                                            EnterExitState enterExitState3 = EnterExitState.f;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !exitTransition.getC().e);
                                        }
                                    };
                                    composer2.A(objG9);
                                }
                                final SnapshotStateList snapshotStateList4 = snapshotStateList3;
                                final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                AnimatedVisibilityKt.a(transition2, function16, modifierX0, enterTransition, exitTransition, (Function2) objG9, ComposableLambdaKt.c(-616195562, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                        AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) obj7;
                                        Composer composer3 = (Composer) obj8;
                                        int iIntValue2 = ((Number) obj9).intValue();
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= (iIntValue2 & 8) == 0 ? composer3.n(animatedVisibilityScope) : composer3.I(animatedVisibilityScope) ? 4 : 2;
                                        }
                                        if (composer3.z(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                            final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                            boolean zN2 = composer3.n(snapshotStateList5);
                                            final Object obj10 = obj6;
                                            boolean zI3 = zN2 | composer3.I(obj10);
                                            final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl5;
                                            boolean zI4 = zI3 | composer3.I(animatedContentTransitionScopeImpl6);
                                            Object objG10 = composer3.G();
                                            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                            if (zI4 || objG10 == composer$Companion$Empty$12) {
                                                objG10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj11) {
                                                        final SnapshotStateList snapshotStateList6 = snapshotStateList5;
                                                        final Object obj12 = obj10;
                                                        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl7 = animatedContentTransitionScopeImpl6;
                                                        return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
                                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                                            public final void dispose() {
                                                                SnapshotStateList snapshotStateList7 = snapshotStateList6;
                                                                Object obj13 = obj12;
                                                                snapshotStateList7.remove(obj13);
                                                                animatedContentTransitionScopeImpl7.e.k(obj13);
                                                            }
                                                        };
                                                    }
                                                };
                                                composer3.A(objG10);
                                            }
                                            EffectsKt.c(animatedVisibilityScope, (Function1) objG10, composer3);
                                            MutableScatterMap mutableScatterMap2 = animatedContentTransitionScopeImpl6.e;
                                            Intrinsics.f(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            mutableScatterMap2.m(obj10, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).f715a);
                                            Object objG11 = composer3.G();
                                            if (objG11 == composer$Companion$Empty$12) {
                                                objG11 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                                composer3.A(objG11);
                                            }
                                            composableLambdaImpl3.invoke((AnimatedContentScopeImpl) objG11, obj10, composer3, 0);
                                        } else {
                                            composer3.j();
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), composer2, 12582912);
                            } else {
                                composer2.j();
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV));
                    composableLambdaImpl2 = composableLambdaImpl;
                    function14 = function14;
                    animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl4;
                    i5 = i6 + 1;
                    transition2 = transition;
                }
                function13 = function14;
                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
                composerImplV.V(false);
            }
            boolean zN = composerImplV.n(transition.f()) | composerImplV.n(animatedContentTransitionScopeImpl);
            Object objG4 = composerImplV.G();
            if (zN || objG4 == obj) {
                objG4 = (ContentTransform) function13.invoke(animatedContentTransitionScopeImpl);
                composerImplV.A(objG4);
            }
            ContentTransform contentTransform = (ContentTransform) objG4;
            Transition transition3 = animatedContentTransitionScopeImpl.f713a;
            boolean zN2 = composerImplV.n(animatedContentTransitionScopeImpl);
            Object objG5 = composerImplV.G();
            if (zN2 || objG5 == obj) {
                objG5 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG5);
            }
            MutableState mutableState2 = (MutableState) objG5;
            MutableState mutableStateL = SnapshotStateKt.l(contentTransform.d, composerImplV);
            if (Intrinsics.c(transition3.f776a.a(), ((SnapshotMutableStateImpl) transition3.d).getD())) {
                mutableState2.setValue(Boolean.FALSE);
            } else if (mutableStateL.getD() != null) {
                mutableState2.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) mutableState2.getD()).booleanValue();
            Modifier modifierB = Modifier.Companion.d;
            if (zBooleanValue) {
                composerImplV.o(249676467);
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl;
                snapshotStateList = snapshotStateList3;
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl5;
                composerImpl = composerImplV;
                deferredAnimationC = androidx.compose.animation.core.TransitionKt.c(animatedContentTransitionScopeImpl5.f713a, VectorConvertersKt.h, null, composerImpl, 0, 2);
                boolean zN3 = composerImpl.n(deferredAnimationC);
                Object objG6 = composerImpl.G();
                if (zN3 || objG6 == obj) {
                    SizeTransform sizeTransform = (SizeTransform) mutableStateL.getD();
                    if (sizeTransform == null || sizeTransform.a()) {
                        modifierB = ClipKt.b(modifierB);
                    }
                    composerImpl.A(modifierB);
                    objG6 = modifierB;
                }
                modifierB = (Modifier) objG6;
                composerImpl.V(false);
            } else {
                snapshotStateList = snapshotStateList3;
                composerImpl = composerImplV;
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                composerImpl.o(249942509);
                composerImpl.V(false);
                deferredAnimationC = null;
                animatedContentTransitionScopeImpl2.f = null;
            }
            Modifier modifierX0 = modifier.x0(modifierB.x0(new AnimatedContentTransitionScopeImpl.SizeModifierElement(deferredAnimationC, mutableStateL, animatedContentTransitionScopeImpl2)));
            Object objG7 = composerImpl.G();
            if (objG7 == obj) {
                objG7 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                composerImpl.A(objG7);
            }
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) objG7;
            int i7 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImpl.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImpl, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function0);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, animatedContentMeasurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImpl, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImpl, i7, function2);
            }
            Updater.b(composerImpl, modifierD, ComposeUiNode.Companion.d);
            composerImpl.o(-1490874326);
            int size2 = snapshotStateList.size();
            int i8 = 0;
            while (i8 < size2) {
                SnapshotStateList snapshotStateList4 = snapshotStateList;
                Object obj4 = snapshotStateList4.get(i8);
                composerImpl.J(1908442329, function12.invoke(obj4));
                Function2 function22 = (Function2) mutableScatterMap.e(obj4);
                if (function22 == null) {
                    composerImpl.o(-967793488);
                    z = false;
                } else {
                    z = false;
                    composerImpl.o(1908443505);
                    function22.invoke(composerImpl, 0);
                }
                composerImpl.V(z);
                composerImpl.V(z);
                i8++;
                snapshotStateList = snapshotStateList4;
            }
            composerImpl.V(false);
            composerImpl.V(true);
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Number) obj6).intValue();
                    AnimatedContentKt.a(transition, modifier, function1, alignment, function12, composableLambdaImpl, (Composer) obj5, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.Object r18, androidx.compose.ui.Modifier r19, kotlin.jvm.functions.Function1 r20, androidx.compose.ui.Alignment r21, java.lang.String r22, kotlin.jvm.functions.Function1 r23, final androidx.compose.runtime.internal.ComposableLambdaImpl r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.b(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SizeTransform c(Function2 function2) {
        return new SizeTransformImpl(function2);
    }

    public static final ContentTransform d(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, BitmapDescriptorFactory.HUE_RED, new SizeTransformImpl(AnimatedContentKt$SizeTransform$1.h));
    }
}
