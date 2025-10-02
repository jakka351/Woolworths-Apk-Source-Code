package com.airbnb.lottie.compose;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LottieAnimatableImpl$snapTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public final /* synthetic */ LottieAnimatableImpl p;
    public final /* synthetic */ LottieComposition q;
    public final /* synthetic */ float r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$snapTo$2(LottieAnimatableImpl lottieAnimatableImpl, LottieComposition lottieComposition, float f, boolean z, Continuation continuation) {
        super(1, continuation);
        this.p = lottieAnimatableImpl;
        this.q = lottieComposition;
        this.r = f;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LottieAnimatableImpl$snapTo$2(this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LottieAnimatableImpl$snapTo$2 lottieAnimatableImpl$snapTo$2 = (LottieAnimatableImpl$snapTo$2) create((Continuation) obj);
        Unit unit = Unit.f24250a;
        lottieAnimatableImpl$snapTo$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        LottieAnimatableImpl lottieAnimatableImpl = this.p;
        ((SnapshotMutableStateImpl) lottieAnimatableImpl.l).setValue(this.q);
        lottieAnimatableImpl.v(this.r);
        lottieAnimatableImpl.t(1);
        LottieAnimatableImpl.o(lottieAnimatableImpl, false);
        if (this.s) {
            ((SnapshotMutableStateImpl) lottieAnimatableImpl.o).setValue(Long.MIN_VALUE);
        }
        return Unit.f24250a;
    }
}
