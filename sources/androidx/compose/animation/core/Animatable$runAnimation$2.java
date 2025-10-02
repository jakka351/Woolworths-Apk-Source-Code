package androidx.compose.animation.core;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Animatable$runAnimation$2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Object, AnimationVector>>, Object> {
    public AnimationState p;
    public Ref.BooleanRef q;
    public int r;
    public final /* synthetic */ Animatable s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Animation u;
    public final /* synthetic */ long v;
    public final /* synthetic */ Function1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable animatable, Object obj, Animation animation, long j, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.s = animatable;
        this.t = obj;
        this.u = animation;
        this.v = j;
        this.w = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$runAnimation$2(this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        Ref.BooleanRef booleanRef;
        Animation animation = this.u;
        final Animatable animatable = this.s;
        AnimationState animationState2 = animatable.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                animationState2.f = (AnimationVector) animatable.f740a.a().invoke(this.t);
                ((SnapshotMutableStateImpl) animatable.e).setValue(animation.getG());
                ((SnapshotMutableStateImpl) animatable.d).setValue(Boolean.TRUE);
                final AnimationState animationState3 = new AnimationState(animationState2.d, ((SnapshotMutableStateImpl) animationState2.e).getD(), AnimationVectorsKt.a(animationState2.f), animationState2.g, Long.MIN_VALUE, animationState2.i);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                long j = this.v;
                final Function1 function1 = this.w;
                Function1<AnimationScope<Object, AnimationVector>, Unit> function12 = new Function1<AnimationScope<Object, AnimationVector>, Unit>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        AnimationScope animationScope = (AnimationScope) obj2;
                        Animatable animatable2 = animatable;
                        AnimationState animationState4 = animatable2.c;
                        SuspendAnimationKt.j(animationScope, animationState4);
                        SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) animationScope.e;
                        Object objE = animatable2.e(snapshotMutableStateImpl.getD());
                        boolean zC = Intrinsics.c(objE, snapshotMutableStateImpl.getD());
                        Function1 function13 = function1;
                        if (!zC) {
                            ((SnapshotMutableStateImpl) animationState4.e).setValue(objE);
                            ((SnapshotMutableStateImpl) animationState3.e).setValue(objE);
                            if (function13 != null) {
                                function13.invoke(animatable2);
                            }
                            animationScope.a();
                            booleanRef2.d = true;
                        } else if (function13 != null) {
                            function13.invoke(animatable2);
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = animationState3;
                this.q = booleanRef2;
                this.r = 1;
                if (SuspendAnimationKt.b(animationState3, animation, j, function12, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                animationState = animationState3;
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = this.q;
                animationState = this.p;
                ResultKt.b(obj);
            }
            AnimationEndReason animationEndReason = booleanRef.d ? AnimationEndReason.d : AnimationEndReason.e;
            Animatable.a(animatable);
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e) {
            Animatable.a(animatable);
            throw e;
        }
    }
}
