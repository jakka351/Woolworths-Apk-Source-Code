package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/OfferDetailsRepository;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6275a;
    public final FeatureToggleManager b;

    public OfferDetailsRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6275a = apolloClient;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.rewards.graphql.type.OfferDetailsPageInput r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$activateOfferInOfferDetails$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$activateOfferInOfferDetails$1 r0 = (au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$activateOfferInOfferDetails$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$activateOfferInOfferDetails$1 r0 = new au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$activateOfferInOfferDetails$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L56
        L27:
            r7 = move-exception
            goto L6f
        L29:
            r7 = move-exception
            goto L74
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r6.f6275a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.rewards.offers.details.ActivateOfferInOfferDetailsMutation r2 = new com.woolworths.rewards.offers.details.ActivateOfferInOfferDetailsMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r4 = r6.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature r5 = au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r4 = r4.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r7, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r7 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.<init>(r8, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r8 = r7.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 != r1) goto L56
            return r1
        L56:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.rewards.offers.details.ActivateOfferInOfferDetailsMutation$Data r7 = (com.woolworths.rewards.offers.details.ActivateOfferInOfferDetailsMutation.Data) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.rewards.offers.details.ActivateOfferInOfferDetailsMutation$ActivateOfferInOfferDetails r7 = r7.f20776a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.rewards.offers.details.ActivateOfferInOfferDetailsMutation$OnOfferDetailsMutationResult r7 = r7.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 == 0) goto L69
            au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsMutationResponse$OfferDetailsMutationResult r7 = au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsMutationResponseKt.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r7
        L69:
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = new au.com.woolworths.android.onesite.network.ServerErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L6f:
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r7)
            throw r7
        L74:
            java.lang.Exception r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository.a(au.com.woolworths.rewards.graphql.type.OfferDetailsPageInput, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$fetchOfferDetails$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$fetchOfferDetails$1 r0 = (au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$fetchOfferDetails$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$fetchOfferDetails$1 r0 = new au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository$fetchOfferDetails$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            goto L6e
        L27:
            r5 = move-exception
            goto L8c
        L29:
            r5 = move-exception
            goto L91
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            com.apollographql.apollo.api.Optional$Present r8 = new com.apollographql.apollo.api.Optional$Present
            r8.<init>(r7)
            if (r6 == 0) goto L47
            com.apollographql.apollo.api.Optional$Present r7 = new com.apollographql.apollo.api.Optional$Present
            r7.<init>(r6)
            goto L49
        L47:
            com.apollographql.apollo.api.Optional$Absent r7 = com.apollographql.apollo.api.Optional.Absent.f13523a
        L49:
            au.com.woolworths.rewards.graphql.type.OfferDetailsPageInput r6 = new au.com.woolworths.rewards.graphql.type.OfferDetailsPageInput
            r6.<init>(r5, r8, r7)
            com.apollographql.apollo.ApolloClient r5 = r4.f6275a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery r7 = new com.woolworths.rewards.offers.details.OfferDetailsPageQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r8 = r4.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature r2 = au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            boolean r8 = r8.c(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            r7.<init>(r6, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            r5.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            r6.<init>(r5, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            java.lang.Object r8 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            if (r8 != r1) goto L6e
            return r1
        L6e:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery$Data r5 = (com.woolworths.rewards.offers.details.OfferDetailsPageQuery.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery$OfferDetails r5 = r5.f20781a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse r5 = au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponseKt.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            if (r5 == 0) goto L7f
            return r5
        L7f:
            java.util.List r5 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.IllegalStateException -> L86
        L86:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = new au.com.woolworths.android.onesite.network.ServerErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L8c:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L91:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository.b(java.lang.String, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
