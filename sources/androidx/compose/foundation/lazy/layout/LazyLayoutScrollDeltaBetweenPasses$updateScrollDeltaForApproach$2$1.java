package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyLayoutScrollDeltaBetweenPasses q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(LazyLayoutScrollDeltaBetweenPasses lazyLayoutScrollDeltaBetweenPasses, Continuation continuation) {
        super(2, continuation);
        this.q = lazyLayoutScrollDeltaBetweenPasses;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnimationState animationState = this.q.f1053a;
            Float f = new Float(BitmapDescriptorFactory.HUE_RED);
            SpringSpec springSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new Float(0.5f), 1);
            this.p = 1;
            if (SuspendAnimationKt.g(animationState, f, springSpecD, true, null, this, 8) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
