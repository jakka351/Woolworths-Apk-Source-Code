package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    public static final InfiniteTransition.TransitionAnimationState a(InfiniteTransition infiniteTransition, float f, float f2, InfiniteRepeatableSpec infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return b(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), VectorConvertersKt.f788a, infiniteRepeatableSpec, str, composer, (i & 1022) | 32768 | ((i << 3) & 458752), 0);
    }

    public static final InfiniteTransition.TransitionAnimationState b(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        final InfiniteTransition infiniteTransition2;
        final Object obj3;
        final Object obj4;
        final InfiniteRepeatableSpec infiniteRepeatableSpec2;
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            infiniteTransition2 = infiniteTransition;
            obj3 = obj;
            obj4 = obj2;
            infiniteRepeatableSpec2 = infiniteRepeatableSpec;
            InfiniteTransition.TransitionAnimationState transitionAnimationState = infiniteTransition2.new TransitionAnimationState(obj3, obj4, twoWayConverter, infiniteRepeatableSpec2);
            composer.A(transitionAnimationState);
            objG = transitionAnimationState;
        } else {
            infiniteTransition2 = infiniteTransition;
            obj3 = obj;
            obj4 = obj2;
            infiniteRepeatableSpec2 = infiniteRepeatableSpec;
        }
        final InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) objG;
        boolean z = ((((i & 112) ^ 48) > 32 && composer.I(obj3)) || (i & 48) == 32) | ((((i & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composer.I(obj4)) || (i & KyberEngine.KyberPolyBytes) == 256) | ((((57344 & i) ^ 24576) > 16384 && composer.I(infiniteRepeatableSpec2)) || (i & 24576) == 16384);
        Object objG2 = composer.G();
        if (z || objG2 == composer$Companion$Empty$1) {
            objG2 = new Function0<Unit>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    InfiniteTransition.TransitionAnimationState transitionAnimationState3 = transitionAnimationState2;
                    Object obj5 = transitionAnimationState3.d;
                    Object obj6 = obj3;
                    boolean zEquals = obj6.equals(obj5);
                    Object obj7 = obj4;
                    if (!zEquals || !obj7.equals(transitionAnimationState3.e)) {
                        transitionAnimationState3.d = obj6;
                        transitionAnimationState3.e = obj7;
                        InfiniteRepeatableSpec infiniteRepeatableSpec3 = infiniteRepeatableSpec2;
                        transitionAnimationState3.h = infiniteRepeatableSpec3;
                        transitionAnimationState3.i = new TargetBasedAnimation(infiniteRepeatableSpec3, transitionAnimationState3.f, obj6, obj7, null);
                        ((SnapshotMutableStateImpl) InfiniteTransition.this.b).setValue(Boolean.TRUE);
                        transitionAnimationState3.j = false;
                        transitionAnimationState3.k = true;
                    }
                    return Unit.f24250a;
                }
            };
            composer.A(objG2);
        }
        composer.g((Function0) objG2);
        boolean zI = composer.I(infiniteTransition2);
        Object objG3 = composer.G();
        if (zI || objG3 == composer$Companion$Empty$1) {
            objG3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    final InfiniteTransition infiniteTransition3 = infiniteTransition2;
                    MutableVector mutableVector = infiniteTransition3.f761a;
                    final InfiniteTransition.TransitionAnimationState transitionAnimationState3 = transitionAnimationState2;
                    mutableVector.c(transitionAnimationState3);
                    ((SnapshotMutableStateImpl) infiniteTransition3.b).setValue(Boolean.TRUE);
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            infiniteTransition3.f761a.k(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.A(objG3);
        }
        EffectsKt.c(transitionAnimationState2, (Function1) objG3, composer);
        return transitionAnimationState2;
    }

    public static final InfiniteTransition c(String str, Composer composer, int i) {
        if ((i & 1) != 0) {
            str = "InfiniteTransition";
        }
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new InfiniteTransition(str);
            composer.A(objG);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) objG;
        infiniteTransition.a(composer, 0);
        return infiniteTransition;
    }
}
