package au.com.woolworths.android.onesite.network;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.DefaultInterceptorChain;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/FirebasePerfApolloInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebasePerfApolloInterceptor implements ApolloInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerfMonitor f4568a;

    public FirebasePerfApolloInterceptor(FirebasePerfMonitor firebasePerfMonitor) {
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        this.f4568a = firebasePerfMonitor;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final Flow a(ApolloRequest apolloRequest, DefaultInterceptorChain defaultInterceptorChain) {
        Operation operation = apolloRequest.d;
        String strName = operation.name();
        String strId = operation.id();
        String str = operation instanceof Query ? SearchIntents.EXTRA_QUERY : "mutation";
        String url = YU.a.i("http://graphql.", str, ".", strName);
        this.f4568a.getClass();
        Intrinsics.h(url, "url");
        AndroidLogger androidLogger = FirebasePerformance.h;
        Intrinsics.g((FirebasePerformance) FirebaseApp.d().b(FirebasePerformance.class), "getInstance(...)");
        HttpMetric httpMetric = new HttpMetric(url, "POST", TransportManager.v, new Timer());
        Timer timer = httpMetric.e;
        timer.c();
        long j = timer.d;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = httpMetric.d;
        networkRequestMetricBuilder.f(j);
        networkRequestMetricBuilder.e(operation.document().length());
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FirebasePerfApolloInterceptor$intercept$1(httpMetric, str, strName, strId, null), defaultInterceptorChain.a(apolloRequest)), new FirebasePerfApolloInterceptor$intercept$2(httpMetric, null));
    }
}
