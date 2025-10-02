package androidx.privacysandbox.ads.adservices.java.topics;

import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GetTopicsResponse>, Object> {
    public int p;
    public final /* synthetic */ TopicsManagerFutures.CommonApiJavaImpl q;
    public final /* synthetic */ GetTopicsRequest r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(TopicsManagerFutures.CommonApiJavaImpl commonApiJavaImpl, GetTopicsRequest getTopicsRequest, Continuation continuation) {
        super(2, continuation);
        this.q = commonApiJavaImpl;
        this.r = getTopicsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        TopicsManager topicsManager = this.q.f3630a;
        this.p = 1;
        Object objA = topicsManager.a(this.r, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
