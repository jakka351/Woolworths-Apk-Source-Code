package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {953}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {
    public Ref.FloatRef p;
    public AnimationState q;
    public int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ DefaultFlingBehavior t;
    public final /* synthetic */ ScrollScope u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation continuation) {
        super(2, continuation);
        this.s = f;
        this.t = defaultFlingBehavior;
        this.u = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultFlingBehavior$performFling$2(this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlingBehavior$performFling$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        Ref.FloatRef floatRef;
        AnimationState animationState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            f = this.s;
            if (Math.abs(f) > 1.0f) {
                floatRef = new Ref.FloatRef();
                floatRef.d = f;
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                AnimationState animationStateA = AnimationStateKt.a(BitmapDescriptorFactory.HUE_RED, f, 28);
                try {
                    DefaultFlingBehavior defaultFlingBehavior = this.t;
                    DecayAnimationSpec decayAnimationSpec = defaultFlingBehavior.f880a;
                    Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>(this.u, floatRef, defaultFlingBehavior) { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.1
                        public final /* synthetic */ ScrollScope i;
                        public final /* synthetic */ Ref.FloatRef j;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            AnimationScope animationScope = (AnimationScope) obj2;
                            float fFloatValue = ((Number) ((SnapshotMutableStateImpl) animationScope.e).getD()).floatValue();
                            Ref.FloatRef floatRef3 = this.h;
                            float f2 = fFloatValue - floatRef3.d;
                            float f3 = this.i.f(f2);
                            floatRef3.d = ((Number) ((SnapshotMutableStateImpl) animationScope.e).getD()).floatValue();
                            this.j.d = ((Number) animationScope.f()).floatValue();
                            if (Math.abs(f2 - f3) > 0.5f) {
                                animationScope.a();
                            }
                            return Unit.f24250a;
                        }
                    };
                    this.p = floatRef;
                    this.q = animationStateA;
                    this.r = 1;
                    if (SuspendAnimationKt.e(animationStateA, decayAnimationSpec, false, function1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (CancellationException unused) {
                    animationState = animationStateA;
                    floatRef.d = ((Number) animationState.b()).floatValue();
                    f = floatRef.d;
                    return new Float(f);
                }
                f = floatRef.d;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            animationState = this.q;
            floatRef = this.p;
            try {
                ResultKt.b(obj);
            } catch (CancellationException unused2) {
                floatRef.d = ((Number) animationState.b()).floatValue();
                f = floatRef.d;
                return new Float(f);
            }
            f = floatRef.d;
        }
        return new Float(f);
    }
}
