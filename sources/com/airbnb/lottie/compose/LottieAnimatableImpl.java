package com.airbnb.lottie.compose;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class LottieAnimatableImpl implements LottieAnimatable {
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final State k;
    public final MutableState l;
    public final MutableState m;
    public final MutableState n;
    public final MutableState o;
    public final State p;
    public final State q;
    public final MutatorMutex r;

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.d = SnapshotStateKt.f(bool);
        this.e = SnapshotStateKt.f(1);
        this.f = SnapshotStateKt.f(1);
        this.g = SnapshotStateKt.f(bool);
        this.h = SnapshotStateKt.f(null);
        this.i = SnapshotStateKt.f(Float.valueOf(1.0f));
        this.j = SnapshotStateKt.f(bool);
        this.k = SnapshotStateKt.d(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LottieAnimatableImpl lottieAnimatableImpl = this.h;
                return Float.valueOf((lottieAnimatableImpl.u() && lottieAnimatableImpl.w() % 2 == 0) ? -lottieAnimatableImpl.n() : lottieAnimatableImpl.n());
            }
        });
        this.l = SnapshotStateKt.f(null);
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.m = SnapshotStateKt.f(fValueOf);
        this.n = SnapshotStateKt.f(fValueOf);
        this.o = SnapshotStateKt.f(Long.MIN_VALUE);
        this.p = SnapshotStateKt.d(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LottieAnimatableImpl lottieAnimatableImpl = this.h;
                LottieComposition lottieCompositionR = lottieAnimatableImpl.r();
                float fA = BitmapDescriptorFactory.HUE_RED;
                if (lottieCompositionR != null) {
                    if (lottieAnimatableImpl.n() < BitmapDescriptorFactory.HUE_RED) {
                        LottieClipSpec lottieClipSpecY = lottieAnimatableImpl.y();
                        if (lottieClipSpecY != null) {
                            fA = lottieClipSpecY.b(lottieCompositionR);
                        }
                    } else {
                        LottieClipSpec lottieClipSpecY2 = lottieAnimatableImpl.y();
                        fA = lottieClipSpecY2 != null ? lottieClipSpecY2.a(lottieCompositionR) : 1.0f;
                    }
                }
                return Float.valueOf(fA);
            }
        });
        this.q = SnapshotStateKt.d(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$isAtEnd$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LottieAnimatableImpl lottieAnimatableImpl = this.h;
                return Boolean.valueOf(lottieAnimatableImpl.w() == ((Number) ((SnapshotMutableStateImpl) lottieAnimatableImpl.f).getD()).intValue() && lottieAnimatableImpl.q() == ((Number) lottieAnimatableImpl.p.getD()).floatValue());
            }
        });
        this.r = new MutatorMutex();
    }

    public static final boolean b(LottieAnimatableImpl lottieAnimatableImpl, int i, long j) {
        MutableState mutableState = lottieAnimatableImpl.m;
        State state = lottieAnimatableImpl.k;
        MutableState mutableState2 = lottieAnimatableImpl.o;
        LottieComposition lottieCompositionR = lottieAnimatableImpl.r();
        if (lottieCompositionR == null) {
            return true;
        }
        long jLongValue = ((Number) ((SnapshotMutableStateImpl) mutableState2).getD()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) ((SnapshotMutableStateImpl) mutableState2).getD()).longValue();
        ((SnapshotMutableStateImpl) mutableState2).setValue(Long.valueOf(j));
        LottieClipSpec lottieClipSpecY = lottieAnimatableImpl.y();
        float fB = lottieClipSpecY != null ? lottieClipSpecY.b(lottieCompositionR) : 0.0f;
        LottieClipSpec lottieClipSpecY2 = lottieAnimatableImpl.y();
        float fA = lottieClipSpecY2 != null ? lottieClipSpecY2.a(lottieCompositionR) : 1.0f;
        float fFloatValue = ((Number) state.getD()).floatValue() * ((jLongValue / 1000000) / lottieCompositionR.b());
        float fFloatValue2 = ((Number) state.getD()).floatValue() < BitmapDescriptorFactory.HUE_RED ? fB - (((Number) ((SnapshotMutableStateImpl) mutableState).getD()).floatValue() + fFloatValue) : (((Number) ((SnapshotMutableStateImpl) mutableState).getD()).floatValue() + fFloatValue) - fA;
        if (fFloatValue2 < BitmapDescriptorFactory.HUE_RED) {
            lottieAnimatableImpl.v(RangesKt.b(((Number) ((SnapshotMutableStateImpl) mutableState).getD()).floatValue(), fB, fA) + fFloatValue);
            return true;
        }
        float f = fA - fB;
        int i2 = (int) (fFloatValue2 / f);
        int i3 = i2 + 1;
        if (lottieAnimatableImpl.w() + i3 > i) {
            lottieAnimatableImpl.v(((Number) lottieAnimatableImpl.p.getD()).floatValue());
            lottieAnimatableImpl.t(i);
            return false;
        }
        lottieAnimatableImpl.t(lottieAnimatableImpl.w() + i3);
        float f2 = fFloatValue2 - (i2 * f);
        lottieAnimatableImpl.v(((Number) state.getD()).floatValue() < BitmapDescriptorFactory.HUE_RED ? fA - f2 : fB + f2);
        return true;
    }

    public static final void o(LottieAnimatableImpl lottieAnimatableImpl, boolean z) {
        ((SnapshotMutableStateImpl) lottieAnimatableImpl.d).setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        return Float.valueOf(q());
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public final Object h(LottieComposition lottieComposition, float f, boolean z, Continuation continuation) {
        Object objB = this.r.b(MutatePriority.d, new LottieAnimatableImpl$snapTo$2(this, lottieComposition, f, z, null), (SuspendLambda) continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public final float n() {
        return ((Number) ((SnapshotMutableStateImpl) this.i).getD()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public final float q() {
        return ((Number) ((SnapshotMutableStateImpl) this.n).getD()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public final LottieComposition r() {
        return (LottieComposition) ((SnapshotMutableStateImpl) this.l).getD();
    }

    public final void t(int i) {
        ((SnapshotMutableStateImpl) this.e).setValue(Integer.valueOf(i));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public final boolean u() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.g).getD()).booleanValue();
    }

    public final void v(float f) {
        LottieComposition lottieCompositionR;
        ((SnapshotMutableStateImpl) this.m).setValue(Float.valueOf(f));
        if (((Boolean) ((SnapshotMutableStateImpl) this.j).getD()).booleanValue() && (lottieCompositionR = r()) != null) {
            f -= f % (1 / lottieCompositionR.n);
        }
        ((SnapshotMutableStateImpl) this.n).setValue(Float.valueOf(f));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public final int w() {
        return ((Number) ((SnapshotMutableStateImpl) this.e).getD()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public final Object x(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, SuspendLambda suspendLambda) {
        Object objB = this.r.b(MutatePriority.d, new LottieAnimatableImpl$animate$2(this, i, i2, z, f, lottieClipSpec, lottieComposition, f2, z3, z2, lottieCancellationBehavior, null), suspendLambda);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public final LottieClipSpec y() {
        return (LottieClipSpec) ((SnapshotMutableStateImpl) this.h).getD();
    }
}
