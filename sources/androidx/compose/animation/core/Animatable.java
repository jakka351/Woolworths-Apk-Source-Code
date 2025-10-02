package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/Animatable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {

    /* renamed from: a, reason: collision with root package name */
    public final TwoWayConverter f740a;
    public final Object b;
    public final AnimationState c;
    public final MutableState d;
    public final MutableState e;
    public Object f;
    public Object g;
    public final MutatorMutex h;
    public final SpringSpec i;
    public final AnimationVector j;
    public final AnimationVector k;
    public AnimationVector l;
    public AnimationVector m;

    public Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str) {
        this.f740a = twoWayConverter;
        this.b = obj2;
        AnimationState animationState = new AnimationState(twoWayConverter, obj, null, 60);
        this.c = animationState;
        this.d = SnapshotStateKt.f(Boolean.FALSE);
        this.e = SnapshotStateKt.f(obj);
        this.h = new MutatorMutex();
        this.i = new SpringSpec(obj2, 3);
        AnimationVector animationVector = animationState.f;
        boolean z = animationVector instanceof AnimationVector1D;
        AnimationVector animationVector2 = z ? AnimatableKt.e : animationVector instanceof AnimationVector2D ? AnimatableKt.f : animationVector instanceof AnimationVector3D ? AnimatableKt.g : AnimatableKt.h;
        this.j = animationVector2;
        AnimationVector animationVector3 = z ? AnimatableKt.f741a : animationVector instanceof AnimationVector2D ? AnimatableKt.b : animationVector instanceof AnimationVector3D ? AnimatableKt.c : AnimatableKt.d;
        this.k = animationVector3;
        this.l = animationVector2;
        this.m = animationVector3;
    }

    public static final void a(Animatable animatable) {
        AnimationState animationState = animatable.c;
        animationState.f.d();
        animationState.g = Long.MIN_VALUE;
        ((SnapshotMutableStateImpl) animatable.d).setValue(Boolean.FALSE);
    }

    public static Object d(Animatable animatable, Object obj, AnimationSpec animationSpec, Float f, Function1 function1, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            animationSpec = animatable.i;
        }
        Object objInvoke = f;
        if ((i & 4) != 0) {
            objInvoke = animatable.f740a.b().invoke(animatable.c.f);
        }
        Object obj2 = objInvoke;
        if ((i & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return MutatorMutex.a(animatable.h, new Animatable$runAnimation$2(animatable, obj2, AnimationKt.b(animationSpec, animatable.f740a, animatable.f(), obj, obj2), animatable.c.g, function12, null), continuation);
    }

    public final Object b(Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, SuspendLambda suspendLambda) {
        Object objF = f();
        TwoWayConverter twoWayConverter = this.f740a;
        return MutatorMutex.a(this.h, new Animatable$runAnimation$2(this, obj, new DecayAnimation(decayAnimationSpec, twoWayConverter, objF, (AnimationVector) twoWayConverter.a().invoke(obj)), this.c.g, function1, null), suspendLambda);
    }

    public final Object c(Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation) {
        return MutatorMutex.a(this.h, new Animatable$runAnimation$2(this, obj2, AnimationKt.b(animationSpec, this.f740a, f(), obj, obj2), this.c.g, function1, null), continuation);
    }

    public final Object e(Object obj) {
        if (Intrinsics.c(this.l, this.j) && Intrinsics.c(this.m, this.k)) {
            return obj;
        }
        TwoWayConverter twoWayConverter = this.f740a;
        AnimationVector animationVector = (AnimationVector) twoWayConverter.a().invoke(obj);
        int iB = animationVector.b();
        boolean z = false;
        for (int i = 0; i < iB; i++) {
            if (animationVector.a(i) < this.l.a(i) || animationVector.a(i) > this.m.a(i)) {
                animationVector.e(RangesKt.b(animationVector.a(i), this.l.a(i), this.m.a(i)), i);
                z = true;
            }
        }
        return z ? twoWayConverter.b().invoke(animationVector) : obj;
    }

    public final Object f() {
        return ((SnapshotMutableStateImpl) this.c.e).getD();
    }

    public final boolean g() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.d).getD()).booleanValue();
    }

    public final Object h(Object obj, Continuation continuation) {
        Object objA = MutatorMutex.a(this.h, new Animatable$snapTo$2(this, obj, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final Object i(ContinuationImpl continuationImpl) {
        Object objA = MutatorMutex.a(this.h, new Animatable$stop$2(this, null), continuationImpl);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final void j(Float f, Float f2) {
        AnimationVector animationVector;
        AnimationVector animationVector2;
        TwoWayConverter twoWayConverter = this.f740a;
        if (f == null || (animationVector = (AnimationVector) twoWayConverter.a().invoke(f)) == null) {
            animationVector = this.j;
        }
        if (f2 == null || (animationVector2 = (AnimationVector) twoWayConverter.a().invoke(f2)) == null) {
            animationVector2 = this.k;
        }
        int iB = animationVector.b();
        for (int i = 0; i < iB; i++) {
            if (animationVector.a(i) > animationVector2.a(i)) {
                PreconditionsKt.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + animationVector + " is greater than upper bound " + animationVector2 + " on index " + i);
            }
        }
        this.l = animationVector;
        this.m = animationVector2;
        this.g = f2;
        this.f = f;
        if (g()) {
            return;
        }
        Object objE = e(f());
        if (Intrinsics.c(objE, f())) {
            return;
        }
        ((SnapshotMutableStateImpl) this.c.e).setValue(objE);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2, "Animatable");
    }
}
