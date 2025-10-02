package androidx.datastore.core;

import androidx.datastore.core.Message;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DataStoreImpl$updateData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ DataStoreImpl r;
    public final /* synthetic */ SuspendLambda s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$updateData$2(DataStoreImpl dataStoreImpl, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.r = dataStoreImpl;
        this.s = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new DataStoreImpl$updateData$2(this.r, this.s, continuation);
        dataStoreImpl$updateData$2.q = obj;
        return dataStoreImpl$updateData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$updateData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.q;
        CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
        DataStoreImpl dataStoreImpl = this.r;
        Message.Update update = new Message.Update(this.s, completableDeferredA, dataStoreImpl.h.a(), coroutineScope.getE());
        SimpleActor simpleActor = dataStoreImpl.l;
        Object objK = simpleActor.c.k(update);
        if (objK instanceof ChannelResult.Closed) {
            Throwable thA = ChannelResult.a(objK);
            if (thA == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
            throw thA;
        }
        if (objK instanceof ChannelResult.Failed) {
            throw new IllegalStateException("Check failed.");
        }
        if (simpleActor.d.f2559a.getAndIncrement() == 0) {
            BuildersKt.c(simpleActor.f2571a, null, null, new SimpleActor$offer$2(simpleActor, null), 3);
        }
        this.p = 1;
        Object objAwait = completableDeferredA.await(this);
        return objAwait == coroutineSingletons ? coroutineSingletons : objAwait;
    }
}
