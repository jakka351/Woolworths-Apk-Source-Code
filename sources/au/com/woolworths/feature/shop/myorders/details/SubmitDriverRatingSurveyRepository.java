package au.com.woolworths.feature.shop.myorders.details;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/SubmitDriverRatingSurveyRepository;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SubmitDriverRatingSurveyRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7684a;

    public SubmitDriverRatingSurveyRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f7684a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.feature.shop.myorders.details.models.DriverRatingSurveyInput r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r12 instanceof au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyRepository$submitDriverRatingSurvey$1
            if (r0 == 0) goto L13
            r0 = r12
            au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyRepository$submitDriverRatingSurvey$1 r0 = (au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyRepository$submitDriverRatingSurvey$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyRepository$submitDriverRatingSurvey$1 r0 = new au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyRepository$submitDriverRatingSurvey$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            goto L72
        L27:
            r0 = move-exception
            r11 = r0
            goto L7b
        L2a:
            r0 = move-exception
            r11 = r0
            goto L80
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.b(r12)
            com.apollographql.apollo.ApolloClient r12 = r10.f7684a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.feature.shop.myorders.SubmitDriverRatingSurveyMutation r4 = new com.woolworths.feature.shop.myorders.SubmitDriverRatingSurveyMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.String r5 = r11.f7757a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            int r2 = r11.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.String r7 = r11.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.String r2 = r11.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.api.Optional$Present r8 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r8.<init>(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.util.Set r11 = r11.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r11 == 0) goto L58
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.util.List r11 = kotlin.collections.CollectionsKt.G0(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            goto L59
        L58:
            r11 = 0
        L59:
            com.apollographql.apollo.api.Optional$Present r9 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r9.<init>(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r12.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.ApolloCall r11 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r11.<init>(r12, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.Object r12 = r11.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r12 != r1) goto L72
            return r1
        L72:
            com.apollographql.apollo.api.ApolloResponse r12 = (com.apollographql.apollo.api.ApolloResponse) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.api.Operation$Data r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.feature.shop.myorders.SubmitDriverRatingSurveyMutation$Data r11 = (com.woolworths.feature.shop.myorders.SubmitDriverRatingSurveyMutation.Data) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            return r11
        L7b:
            au.com.woolworths.android.onesite.network.ServerErrorException r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r11)
            throw r11
        L80:
            java.lang.Exception r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyRepository.a(au.com.woolworths.feature.shop.myorders.details.models.DriverRatingSurveyInput, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
