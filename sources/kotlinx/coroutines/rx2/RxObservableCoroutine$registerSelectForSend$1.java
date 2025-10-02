package kotlinx.coroutines.rx2;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.rx2.RxObservableCoroutine$registerSelectForSend$1", f = "RxObservable.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class RxObservableCoroutine$registerSelectForSend$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RxObservableCoroutine q;
    public final /* synthetic */ SelectInstance r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxObservableCoroutine$registerSelectForSend$1(RxObservableCoroutine rxObservableCoroutine, SelectInstance selectInstance, Continuation continuation) {
        super(2, continuation);
        this.q = rxObservableCoroutine;
        this.r = selectInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RxObservableCoroutine$registerSelectForSend$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RxObservableCoroutine$registerSelectForSend$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        RxObservableCoroutine rxObservableCoroutine = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = rxObservableCoroutine.h;
            this.p = 1;
            if (mutexImpl.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        SelectInstance selectInstance = this.r;
        Unit unit = Unit.f24250a;
        if (!selectInstance.e(rxObservableCoroutine, unit)) {
            rxObservableCoroutine.h.c(null);
        }
        return unit;
    }
}
