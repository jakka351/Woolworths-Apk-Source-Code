package au.com.woolworths.feature.rewards.everydayextras.signup.summary;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/summary/EverydayExtrasSummaryRepository;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EverydayExtrasSummaryRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6219a;

    public EverydayExtrasSummaryRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f6219a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$getSummaryFeed$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$getSummaryFeed$1 r0 = (au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$getSummaryFeed$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$getSummaryFeed$1 r0 = new au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$getSummaryFeed$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L52
        L27:
            r5 = move-exception
            goto L6e
        L29:
            r5 = move-exception
            goto L73
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r7)
            com.apollographql.apollo.ApolloClient r7 = r4.f6219a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSummaryQuery r2 = new au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSummaryQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r6 = com.apollographql.apollo.api.Optional.Companion.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r6, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r7, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r7 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 != r1) goto L52
            return r1
        L52:
            com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSummaryQuery$Data r5 = (au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSummaryQuery.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSummaryQuery$EverydayExtraSummary r5 = r5.f5955a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r5 == 0) goto L63
            au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFeed r5 = au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryQueryEverydayExtraSummaryExtKt.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L64
        L63:
            r5 = 0
        L64:
            if (r5 == 0) goto L67
            return r5
        L67:
            java.util.List r5 = r7.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L6e:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L73:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionInput r5, au.com.woolworths.rewards.graphql.type.EverydayExtraSubscribeFeatureFlags r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribe$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribe$1 r0 = (au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribe$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribe$1 r0 = new au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribe$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4e
        L27:
            r5 = move-exception
            goto L66
        L29:
            r5 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r7)
            com.apollographql.apollo.ApolloClient r7 = r4.f6219a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeMutation r2 = new au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r7, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r7 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeMutation$Data r5 = (au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeMutation.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeMutation$EverydayExtraSignupSubscribe r5 = r5.f5852a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSignupSubscribeData r5 = au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSignupSubscribeDataKt.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r5 == 0) goto L5f
            return r5
        L5f:
            java.util.List r5 = r7.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L66:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L6b:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository.b(au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionInput, au.com.woolworths.rewards.graphql.type.EverydayExtraSubscribeFeatureFlags, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionNoPaymentInput r5, au.com.woolworths.rewards.graphql.type.EverydayExtraSubscribeFeatureFlags r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribeNoPayment$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribeNoPayment$1 r0 = (au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribeNoPayment$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribeNoPayment$1 r0 = new au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository$subscribeNoPayment$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4e
        L27:
            r5 = move-exception
            goto L66
        L29:
            r5 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r7)
            com.apollographql.apollo.ApolloClient r7 = r4.f6219a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeNoPaymentMutation r2 = new au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeNoPaymentMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r7, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r7 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeNoPaymentMutation$Data r5 = (au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeNoPaymentMutation.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeNoPaymentMutation$EverydayExtraSignupSubscribeNoPayment r5 = r5.f5859a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSignupSubscribeData r5 = au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSignupSubscribeDataKt.b(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r5 == 0) goto L5f
            return r5
        L5f:
            java.util.List r5 = r7.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L66:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L6b:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository.c(au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionNoPaymentInput, au.com.woolworths.rewards.graphql.type.EverydayExtraSubscribeFeatureFlags, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
