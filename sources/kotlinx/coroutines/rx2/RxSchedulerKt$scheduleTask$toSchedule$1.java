package kotlinx.coroutines.rx2;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class RxSchedulerKt$scheduleTask$toSchedule$1 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object>, SuspendFunction {
    public final /* synthetic */ Disposable d;
    public final /* synthetic */ CoroutineContext e;
    public final /* synthetic */ Runnable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxSchedulerKt$scheduleTask$toSchedule$1(Disposable disposable, CoroutineContext coroutineContext, Runnable runnable) {
        super(1, Intrinsics.Kotlin.class, "task", "scheduleTask$task(Lio/reactivex/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.d = disposable;
        this.e = coroutineContext;
        this.f = runnable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoroutineContext coroutineContext = this.e;
        Runnable runnable = this.f;
        return RxSchedulerKt.a(this.d, coroutineContext, runnable, (Continuation) obj);
    }
}
