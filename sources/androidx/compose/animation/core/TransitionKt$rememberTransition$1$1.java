package androidx.compose.animation.core;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2147}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MutexImpl p;
    public TransitionState q;
    public int r;
    public final /* synthetic */ TransitionState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState transitionState, Continuation continuation) {
        super(2, continuation);
        this.s = transitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransitionKt$rememberTransition$1$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TransitionKt$rememberTransition$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutexImpl mutexImpl;
        TransitionState transitionState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            TransitionState transitionState2 = this.s;
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) transitionState2;
            seekableTransitionState.getClass();
            ((SnapshotStateObserver) TransitionKt.b.getD()).e(seekableTransitionState, TransitionKt$SeekableTransitionStateTotalDurationChanged$1.h, seekableTransitionState.g);
            mutexImpl = seekableTransitionState.j;
            this.p = mutexImpl;
            this.q = transitionState2;
            this.r = 1;
            if (mutexImpl.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            transitionState = transitionState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = this.q;
            mutexImpl = this.p;
            ResultKt.b(obj);
        }
        try {
            ((SeekableTransitionState) transitionState).d = transitionState.b();
            CancellableContinuationImpl cancellableContinuationImpl = ((SeekableTransitionState) transitionState).i;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.resumeWith(transitionState.b());
            }
            ((SeekableTransitionState) transitionState).i = null;
            mutexImpl.c(null);
            return Unit.f24250a;
        } catch (Throwable th) {
            mutexImpl.c(null);
            throw th;
        }
    }
}
