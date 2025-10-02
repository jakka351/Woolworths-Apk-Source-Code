package kotlinx.coroutines.rx2;

import com.google.android.gms.ads.RequestConfiguration;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class RxConvertKt$asFlow$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ObservableSource r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asFlow$1(ObservableSource observableSource, Continuation continuation) {
        super(2, continuation);
        this.r = observableSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(this.r, continuation);
        rxConvertKt$asFlow$1.q = obj;
        return rxConvertKt$asFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RxConvertKt$asFlow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.q;
            final AtomicReference atomicReference = new AtomicReference();
            this.r.a(new Observer<Object>() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1$observer$1
                @Override // io.reactivex.Observer
                public final void d(Disposable disposable) {
                    AtomicReference atomicReference2;
                    do {
                        atomicReference2 = atomicReference;
                        if (atomicReference2.compareAndSet(null, disposable)) {
                            return;
                        }
                    } while (atomicReference2.get() == null);
                    disposable.dispose();
                }

                @Override // io.reactivex.Observer
                public final void onComplete() {
                    producerScope.y(null);
                }

                @Override // io.reactivex.Observer
                public final void onError(Throwable th) {
                    producerScope.y(th);
                }

                @Override // io.reactivex.Observer
                public final void onNext(Object obj2) {
                    try {
                        ChannelsKt.b(producerScope, obj2);
                    } catch (InterruptedException unused) {
                    }
                }
            });
            d dVar = new d(atomicReference, 0);
            this.p = 1;
            if (ProduceKt.a(producerScope, dVar, this) == coroutineSingletons) {
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
