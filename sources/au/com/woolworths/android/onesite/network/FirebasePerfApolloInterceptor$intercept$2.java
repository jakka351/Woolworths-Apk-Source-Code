package au.com.woolworths.android.onesite.network;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.google.firebase.perf.metrics.HttpMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", "exception", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.network.FirebasePerfApolloInterceptor$intercept$2", f = "FirebasePerfApolloInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FirebasePerfApolloInterceptor$intercept$2 extends SuspendLambda implements Function3<FlowCollector<? super ApolloResponse<Operation.Data>>, Throwable, Continuation<? super Unit>, Object> {
    public /* synthetic */ Throwable p;
    public final /* synthetic */ HttpMetric q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePerfApolloInterceptor$intercept$2(HttpMetric httpMetric, Continuation continuation) {
        super(3, continuation);
        this.q = httpMetric;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        FirebasePerfApolloInterceptor$intercept$2 firebasePerfApolloInterceptor$intercept$2 = new FirebasePerfApolloInterceptor$intercept$2(this.q, (Continuation) obj3);
        firebasePerfApolloInterceptor$intercept$2.p = (Throwable) obj2;
        firebasePerfApolloInterceptor$intercept$2.invokeSuspend(Unit.f24250a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Throwable th = this.p;
        HttpMetric httpMetric = this.q;
        httpMetric.b();
        ApolloHttpException apolloHttpException = th instanceof ApolloHttpException ? (ApolloHttpException) th : null;
        if (apolloHttpException != null) {
            httpMetric.d.d(apolloHttpException.d);
        }
        httpMetric.b();
        throw th;
    }
}
