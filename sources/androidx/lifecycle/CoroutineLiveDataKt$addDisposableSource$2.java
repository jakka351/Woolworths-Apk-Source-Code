package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/lifecycle/EmittedSource;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EmittedSource>, Object> {
    public final /* synthetic */ MediatorLiveData p;
    public final /* synthetic */ LiveData q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData mediatorLiveData, LiveData liveData, Continuation continuation) {
        super(2, continuation);
        this.p = mediatorLiveData;
        this.q = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MediatorLiveData mediatorLiveData = this.p;
        CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0 coroutineLiveDataKt$sam$androidx_lifecycle_Observer$0 = new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new b(mediatorLiveData, 0));
        LiveData liveData = this.q;
        mediatorLiveData.n(liveData, coroutineLiveDataKt$sam$androidx_lifecycle_Observer$0);
        return new EmittedSource(liveData, mediatorLiveData);
    }
}
