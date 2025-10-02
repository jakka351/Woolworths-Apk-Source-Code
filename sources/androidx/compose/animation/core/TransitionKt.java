package androidx.compose.animation.core;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TransitionKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f779a = null;
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.e, TransitionKt$SeekableStateObserver$2.h);

    public static final void a(final Transition transition, final Transition.TransitionAnimationState transitionAnimationState, final Object obj, final Object obj2, final FiniteAnimationSpec finiteAnimationSpec, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(867041821);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(transitionAnimationState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(obj) : composerImplV.I(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerImplV.n(obj2) : composerImplV.I(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerImplV.n(finiteAnimationSpec) : composerImplV.I(finiteAnimationSpec) ? 16384 : 8192;
        }
        if (!composerImplV.z(i2 & 1, (i2 & 9363) != 9362)) {
            composerImplV.j();
        } else if (transition.i()) {
            transitionAnimationState.B(obj, obj2, finiteAnimationSpec);
        } else {
            transitionAnimationState.C(obj2, finiteAnimationSpec);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$UpdateInitialAndTargetValues$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    TransitionKt.a(transition, transitionAnimationState, obj, obj2, finiteAnimationSpec, (Composer) obj3, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final Transition b(final Transition transition, EnterExitState enterExitState, EnterExitState enterExitState2, Composer composer, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && composer.n(transition)) || (i & 6) == 4;
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (z2 || objG == obj) {
            objG = new Transition(new MutableTransitionState(enterExitState), transition, YU.a.o(new StringBuilder(), transition.c, " > EnterExitTransition"));
            composer.A(objG);
        }
        final Transition transition2 = (Transition) objG;
        if ((i2 <= 4 || !composer.n(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean zN = composer.n(transition2) | z;
        Object objG2 = composer.G();
        if (zN || objG2 == obj) {
            objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    final Transition transition3 = transition;
                    SnapshotStateList snapshotStateList = transition3.j;
                    final Transition transition4 = transition2;
                    snapshotStateList.add(transition4);
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            transition3.j.remove(transition4);
                        }
                    };
                }
            };
            composer.A(objG2);
        }
        EffectsKt.c(transition2, (Function1) objG2, composer);
        if (transition.i()) {
            transition2.m(enterExitState, enterExitState2);
            return transition2;
        }
        transition2.r(enterExitState2);
        ((SnapshotMutableStateImpl) transition2.k).setValue(Boolean.FALSE);
        return transition2;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final Transition.DeferredAnimation c(final Transition transition, TwoWayConverter twoWayConverter, String str, Composer composer, int i, int i2) {
        Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && composer.n(transition)) || (i & 6) == 4;
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (z2 || objG == obj) {
            objG = new Transition.DeferredAnimation(twoWayConverter, str);
            composer.A(objG);
        }
        final Transition.DeferredAnimation deferredAnimation = (Transition.DeferredAnimation) objG;
        if ((i3 <= 4 || !composer.n(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean zI = composer.I(deferredAnimation) | z;
        Object objG2 = composer.G();
        if (zI || objG2 == obj) {
            objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    final Transition transition2 = transition;
                    final Transition.DeferredAnimation deferredAnimation2 = deferredAnimation;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            Transition transition3 = transition2;
                            transition3.getClass();
                            Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData2 = (Transition.DeferredAnimation.DeferredAnimationData) ((SnapshotMutableStateImpl) deferredAnimation2.b).getD();
                            if (deferredAnimationData2 != null) {
                                transition3.i.remove(deferredAnimationData2.d);
                            }
                        }
                    };
                }
            };
            composer.A(objG2);
        }
        EffectsKt.c(deferredAnimation, (Function1) objG2, composer);
        if (transition.i() && (deferredAnimationData = (Transition.DeferredAnimation.DeferredAnimationData) ((SnapshotMutableStateImpl) deferredAnimation.b).getD()) != null) {
            Transition transition2 = Transition.this;
            deferredAnimationData.d.B(deferredAnimationData.f.invoke(transition2.f().getF778a()), deferredAnimationData.f.invoke(transition2.f().getB()), (FiniteAnimationSpec) deferredAnimationData.e.invoke(transition2.f()));
        }
        return deferredAnimation;
    }

    public static final Transition.TransitionAnimationState d(final Transition transition, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, TwoWayConverter twoWayConverter, Composer composer, int i) {
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && composer.n(transition)) || (i & 6) == 4;
        Object objG = composer.G();
        Object obj3 = Composer.Companion.f1624a;
        if (z2 || objG == obj3) {
            AnimationVector animationVector = (AnimationVector) twoWayConverter.a().invoke(obj2);
            animationVector.d();
            objG = new Transition.TransitionAnimationState(obj, animationVector, twoWayConverter);
            composer.A(objG);
        }
        final Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) objG;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        a(transition, transitionAnimationState, obj, obj2, finiteAnimationSpec, composer, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        if ((i3 <= 4 || !composer.n(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean zN = composer.n(transitionAnimationState) | z;
        Object objG2 = composer.G();
        if (zN || objG2 == obj3) {
            objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    final Transition transition2 = transition;
                    SnapshotStateList snapshotStateList = transition2.i;
                    final Transition.TransitionAnimationState transitionAnimationState2 = transitionAnimationState;
                    snapshotStateList.add(transitionAnimationState2);
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            transition2.i.remove(transitionAnimationState2);
                        }
                    };
                }
            };
            composer.A(objG2);
        }
        EffectsKt.c(transitionAnimationState, (Function1) objG2, composer);
        return transitionAnimationState;
    }

    public static final Transition e(TransitionState transitionState, String str, Composer composer, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && composer.n(transitionState)) || (i & 6) == 4;
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (z2 || objG == obj) {
            objG = new Transition(transitionState, null, str);
            composer.A(objG);
        }
        final Transition transition = (Transition) objG;
        if (transitionState instanceof SeekableTransitionState) {
            composer.o(1030829284);
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) transitionState;
            Object d = ((SnapshotMutableStateImpl) seekableTransitionState.c).getD();
            Object d2 = ((SnapshotMutableStateImpl) seekableTransitionState.b).getD();
            if ((i2 <= 4 || !composer.n(transitionState)) && (i & 6) != 4) {
                z = false;
            }
            Object objG2 = composer.G();
            if (z || objG2 == obj) {
                objG2 = new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.A(objG2);
            }
            EffectsKt.f(d, d2, (Function2) objG2, composer);
            composer.l();
        } else {
            composer.o(1031290843);
            transition.a(0, composer, transitionState.b());
            composer.l();
        }
        boolean zN = composer.n(transition);
        Object objG3 = composer.G();
        if (zN || objG3 == obj) {
            objG3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    final Transition transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            Transition transition3 = transition2;
                            transition3.k();
                            transition3.f776a.e();
                        }
                    };
                }
            };
            composer.A(objG3);
        }
        EffectsKt.c(transition, (Function1) objG3, composer);
        return transition;
    }

    public static final Transition f(Object obj, String str, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new Transition(new MutableTransitionState(obj), null, str);
            composer.A(objG);
        }
        final Transition transition = (Transition) objG;
        transition.a((i & 8) | 48 | (i & 14), composer, obj);
        Object objG2 = composer.G();
        if (objG2 == composer$Companion$Empty$1) {
            objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    final Transition transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            Transition transition3 = transition2;
                            transition3.k();
                            transition3.f776a.e();
                        }
                    };
                }
            };
            composer.A(objG2);
        }
        EffectsKt.c(transition, (Function1) objG2, composer);
        return transition;
    }
}
