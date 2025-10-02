package au.com.woolworths.android.onesite.network;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.google.firebase.perf.metrics.HttpMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "response", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.network.FirebasePerfApolloInterceptor$intercept$1", f = "FirebasePerfApolloInterceptor.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class FirebasePerfApolloInterceptor$intercept$1 extends SuspendLambda implements Function2<ApolloResponse<Operation.Data>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ HttpMetric q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePerfApolloInterceptor$intercept$1(HttpMetric httpMetric, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.q = httpMetric;
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FirebasePerfApolloInterceptor$intercept$1 firebasePerfApolloInterceptor$intercept$1 = new FirebasePerfApolloInterceptor$intercept$1(this.q, this.r, this.s, this.t, continuation);
        firebasePerfApolloInterceptor$intercept$1.p = obj;
        return firebasePerfApolloInterceptor$intercept$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FirebasePerfApolloInterceptor$intercept$1 firebasePerfApolloInterceptor$intercept$1 = (FirebasePerfApolloInterceptor$intercept$1) create((ApolloResponse) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        firebasePerfApolloInterceptor$intercept$1.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.firebase.perf.metrics.HttpMetric r0 = r9.q
            com.google.firebase.perf.metrics.NetworkRequestMetricBuilder r1 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.p
            com.apollographql.apollo.api.ApolloResponse r10 = (com.apollographql.apollo.api.ApolloResponse) r10
            com.apollographql.apollo.api.ExecutionContext r2 = r10.g
            com.apollographql.apollo.network.http.HttpInfo$Key r3 = com.apollographql.apollo.network.http.HttpInfo.c
            com.apollographql.apollo.api.ExecutionContext$Element r2 = r2.c(r3)
            com.apollographql.apollo.network.http.HttpInfo r2 = (com.apollographql.apollo.network.http.HttpInfo) r2
            if (r2 == 0) goto Ld5
            java.util.List r3 = r2.b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L21:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.apollographql.apollo.api.http.HttpHeader r6 = (com.apollographql.apollo.api.http.HttpHeader) r6
            java.lang.String r6 = r6.f13528a
            java.lang.String r7 = "content-type"
            r8 = 1
            boolean r6 = kotlin.text.StringsKt.y(r6, r7, r8)
            if (r6 == 0) goto L21
            goto L3c
        L3b:
            r4 = r5
        L3c:
            com.apollographql.apollo.api.http.HttpHeader r4 = (com.apollographql.apollo.api.http.HttpHeader) r4
            java.util.List r10 = r10.d
            if (r10 == 0) goto L49
            java.lang.Object r10 = kotlin.collections.CollectionsKt.F(r10)
            com.apollographql.apollo.api.Error r10 = (com.apollographql.apollo.api.Error) r10
            goto L4a
        L49:
            r10 = r5
        L4a:
            if (r10 == 0) goto Lb0
            java.util.Map r10 = r10.getD()
            if (r10 == 0) goto Lad
            java.lang.String r2 = "message"
            java.lang.Object r10 = r10.get(r2)
            if (r10 == 0) goto Lad
            java.lang.String r10 = r10.toString()
            if (r10 == 0) goto Lad
            java.lang.String r2 = " "
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r3 = 6
            java.util.List r10 = kotlin.text.StringsKt.T(r10, r2, r3)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L76:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r10.next()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            r7 = 3
            if (r6 != r7) goto L76
            r2.add(r3)
            goto L76
        L8e:
            java.util.Iterator r10 = r2.iterator()
        L92:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r2 = kotlin.text.StringsKt.i0(r2)
            if (r2 == 0) goto L92
            goto La6
        La5:
            r2 = r5
        La6:
            if (r2 == 0) goto Lad
            int r10 = r2.intValue()
            goto Lb2
        Lad:
            r10 = 520(0x208, float:7.29E-43)
            goto Lb2
        Lb0:
            int r10 = r2.f13628a
        Lb2:
            r1.d(r10)
            java.lang.String r10 = "graphql_type"
            java.lang.String r2 = r9.r
            r0.a(r10, r2)
            java.lang.String r10 = "graphql_name"
            java.lang.String r2 = r9.s
            r0.a(r10, r2)
            java.lang.String r10 = "graphql_id"
            java.lang.String r2 = r9.t
            r0.a(r10, r2)
            if (r4 == 0) goto Lce
            java.lang.String r5 = r4.b
        Lce:
            if (r5 != 0) goto Ld2
            java.lang.String r5 = ""
        Ld2:
            r1.g(r5)
        Ld5:
            r0.b()
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.network.FirebasePerfApolloInterceptor$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
