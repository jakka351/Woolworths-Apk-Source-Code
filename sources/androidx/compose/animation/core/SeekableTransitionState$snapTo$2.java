package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "S"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {457}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SeekableTransitionState q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Transition s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(SeekableTransitionState seekableTransitionState, Transition transition, Object obj, Continuation continuation) {
        super(1, continuation);
        this.q = seekableTransitionState;
        this.r = obj;
        this.s = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        Object obj = this.r;
        return new SeekableTransitionState$snapTo$2(this.q, this.s, obj, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SeekableTransitionState$snapTo$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SeekableTransitionState seekableTransitionState = this.q;
        MutableState mutableState = seekableTransitionState.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Transition transition = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            seekableTransitionState.m();
            seekableTransitionState.l = Long.MIN_VALUE;
            seekableTransitionState.p(BitmapDescriptorFactory.HUE_RED);
            Object d = ((SnapshotMutableStateImpl) seekableTransitionState.c).getD();
            Object obj2 = this.r;
            float f = obj2.equals(d) ? -4.0f : obj2.equals(((SnapshotMutableStateImpl) mutableState).getD()) ? -5.0f : -3.0f;
            transition.r(obj2);
            transition.p(0L);
            ((SnapshotMutableStateImpl) mutableState).setValue(obj2);
            seekableTransitionState.p(BitmapDescriptorFactory.HUE_RED);
            seekableTransitionState.c(obj2);
            transition.l(f);
            if (f == -3.0f) {
                this.p = 1;
                if (SeekableTransitionState.j(seekableTransitionState, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        transition.k();
        return Unit.f24250a;
    }
}
