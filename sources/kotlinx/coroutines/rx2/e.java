package kotlinx.coroutines.rx2;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;

/* loaded from: classes7.dex */
public final /* synthetic */ class e implements ObservableOnSubscribe, SingleOnSubscribe {
    public final /* synthetic */ CoroutineContext d;
    public final /* synthetic */ SuspendLambda e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e(CoroutineContext coroutineContext, Function2 function2, int i) {
        this.d = coroutineContext;
        this.e = (SuspendLambda) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public void a(ObservableEmitter observableEmitter) {
        RxObservableCoroutine rxObservableCoroutine = new RxObservableCoroutine(CoroutineContextKt.b(GlobalScope.d, this.d), observableEmitter);
        observableEmitter.a(new RxCancellable(rxObservableCoroutine));
        rxObservableCoroutine.p0(CoroutineStart.d, rxObservableCoroutine, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // io.reactivex.SingleOnSubscribe
    public void d(SingleEmitter singleEmitter) {
        RxSingleCoroutine rxSingleCoroutine = new RxSingleCoroutine(CoroutineContextKt.b(GlobalScope.d, this.d), singleEmitter);
        singleEmitter.a(new RxCancellable(rxSingleCoroutine));
        rxSingleCoroutine.p0(CoroutineStart.d, rxSingleCoroutine, this.e);
    }
}
