package androidx.compose.animation.core;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.MotionDurationScale;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SuspendAnimationKt {
    public static final Object a(float f, float f2, float f3, AnimationSpec animationSpec, final Function2 function2, SuspendLambda suspendLambda) {
        TwoWayConverter twoWayConverter = VectorConvertersKt.f788a;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        TwoWayConverterImpl twoWayConverterImpl = (TwoWayConverterImpl) twoWayConverter;
        AnimationVector animationVectorC = (AnimationVector) twoWayConverterImpl.a().invoke(new Float(f3));
        if (animationVectorC == null) {
            animationVectorC = ((AnimationVector) twoWayConverterImpl.a().invoke(f4)).c();
        }
        AnimationVector animationVector = animationVectorC;
        Object objB = b(new AnimationState(twoWayConverter, f4, animationVector, 56), new TargetBasedAnimation(animationSpec, twoWayConverter, f4, f5, animationVector), Long.MIN_VALUE, new Function1<AnimationScope<Object, AnimationVector>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            public final /* synthetic */ TwoWayConverter i = VectorConvertersKt.f788a;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AnimationScope animationScope = (AnimationScope) obj;
                function2.invoke(((SnapshotMutableStateImpl) animationScope.e).getD(), ((TwoWayConverterImpl) VectorConvertersKt.f788a).b().invoke(animationScope.f));
                return Unit.f24250a;
            }
        }, suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Unit unit = Unit.f24250a;
        if (objB != coroutineSingletons) {
            objB = unit;
        }
        return objB == coroutineSingletons ? objB : unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(final androidx.compose.animation.core.AnimationState r22, androidx.compose.animation.core.Animation r23, long r24, final kotlin.jvm.functions.Function1 r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.b(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static /* synthetic */ Object c(float f, float f2, AnimationSpec animationSpec, Function2 function2, SuspendLambda suspendLambda, int i) {
        if ((i & 8) != 0) {
            animationSpec = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7);
        }
        return a(f, f2, BitmapDescriptorFactory.HUE_RED, animationSpec, function2, suspendLambda);
    }

    public static final Object d(float f, float f2, FloatDecayAnimationSpec floatDecayAnimationSpec, final Function2 function2, Continuation continuation) {
        Object objB = b(AnimationStateKt.a(f, f2, 28), AnimationKt.a(floatDecayAnimationSpec, f, f2), Long.MIN_VALUE, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AnimationScope animationScope = (AnimationScope) obj;
                function2.invoke(((SnapshotMutableStateImpl) animationScope.e).getD(), Float.valueOf(((AnimationVector1D) animationScope.f).f745a));
                return Unit.f24250a;
            }
        }, (SuspendLambda) continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    public static final Object e(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        Object objB = b(animationState, new DecayAnimation(decayAnimationSpec, animationState.d, ((SnapshotMutableStateImpl) animationState.e).getD(), animationState.f), z ? animationState.g : Long.MIN_VALUE, function1, continuationImpl);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    public static final Object f(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        Object objB = b(animationState, new TargetBasedAnimation(animationSpec, animationState.d, ((SnapshotMutableStateImpl) animationState.e).getD(), obj, animationState.f), z ? animationState.g : Long.MIN_VALUE, function1, continuationImpl);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    public static /* synthetic */ Object g(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, Function1 function1, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = SuspendAnimationKt$animateTo$2.h;
        }
        return f(animationState, obj, animationSpec2, z2, function1, continuationImpl);
    }

    public static final void h(AnimationScope animationScope, long j, float f, Animation animation, AnimationState animationState, Function1 function1) {
        long jC = f == BitmapDescriptorFactory.HUE_RED ? animation.getH() : (long) ((j - animationScope.getC()) / f);
        animationScope.j(j);
        animationScope.l(animation.e(jC));
        animationScope.m(animation.g(jC));
        if (animation.b(jC)) {
            animationScope.i(animationScope.getG());
            animationScope.k();
        }
        j(animationScope, animationState);
        function1.invoke(animationScope);
    }

    public static final float i(CoroutineContext coroutineContext) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.Key.d);
        float fX = motionDurationScale != null ? motionDurationScale.x() : 1.0f;
        if (fX >= BitmapDescriptorFactory.HUE_RED) {
            return fX;
        }
        PreconditionsKt.b("negative scale factor");
        return fX;
    }

    public static final void j(AnimationScope animationScope, AnimationState animationState) {
        ((SnapshotMutableStateImpl) animationState.e).setValue(animationScope.e());
        AnimationVector animationVector = animationState.f;
        AnimationVector f = animationScope.getF();
        int iB = animationVector.b();
        for (int i = 0; i < iB; i++) {
            animationVector.e(f.a(i), i);
        }
        animationState.h = animationScope.getH();
        animationState.g = animationScope.getG();
        animationState.i = animationScope.h();
    }
}
