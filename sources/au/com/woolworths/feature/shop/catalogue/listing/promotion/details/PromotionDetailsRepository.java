package au.com.woolworths.feature.shop.catalogue.listing.promotion.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsRepository;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PromotionDetailsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6897a;
    public final FeatureToggleManager b;

    public PromotionDetailsRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6897a = apolloClient;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r10, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            r9 = this;
            r0 = r17
            boolean r1 = r0 instanceof au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsRepository$fetchPromotionDetails$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsRepository$fetchPromotionDetails$1 r1 = (au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsRepository$fetchPromotionDetails$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsRepository$fetchPromotionDetails$1 r1 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsRepository$fetchPromotionDetails$1
            r1.<init>(r9, r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            goto La2
        L2a:
            r0 = move-exception
            r10 = r0
            goto Lbe
        L2e:
            r0 = move-exception
            r10 = r0
            goto Lc3
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$InStore r0 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore.d
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r11, r0)
            if (r0 == 0) goto L4b
            com.apollographql.apollo.api.Optional$Present r0 = new com.apollographql.apollo.api.Optional$Present
            r0.<init>(r10)
            goto L4d
        L4b:
            com.apollographql.apollo.api.Optional$Absent r0 = com.apollographql.apollo.api.Optional.Absent.f13523a
        L4d:
            au.com.woolworths.shop.graphql.type.ShoppingModeType r10 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r11)
            com.apollographql.apollo.api.Optional r11 = com.apollographql.apollo.api.Optional.Companion.a(r12)
            com.apollographql.apollo.api.Optional r12 = com.apollographql.apollo.api.Optional.Companion.a(r13)
            com.apollographql.apollo.api.Optional r3 = com.apollographql.apollo.api.Optional.Companion.a(r14)
            com.apollographql.apollo.api.Optional$Present r5 = new com.apollographql.apollo.api.Optional$Present
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r15)
            r5.<init>(r6)
            com.apollographql.apollo.api.Optional$Present r6 = new com.apollographql.apollo.api.Optional$Present
            java.lang.Integer r7 = new java.lang.Integer
            r8 = r16
            r7.<init>(r8)
            r6.<init>(r7)
            au.com.woolworths.shop.graphql.type.CataloguePromotionDetailsInput r7 = new au.com.woolworths.shop.graphql.type.CataloguePromotionDetailsInput
            r13 = r11
            r14 = r12
            r11 = r0
            r17 = r3
            r16 = r5
            r15 = r6
            r12 = r10
            r10 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r11 = r9.b
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r12 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g
            boolean r11 = r11.c(r12)
            com.apollographql.apollo.ApolloClient r12 = r9.f6897a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.catalogue.CataloguePromotionDetailsQuery r0 = new com.woolworths.shop.catalogue.CataloguePromotionDetailsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r0.<init>(r10, r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r12.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r10 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r10.<init>(r12, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r0 = r10.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != r2) goto La2
            return r2
        La2:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Operation$Data r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.catalogue.CataloguePromotionDetailsQuery$Data r10 = (com.woolworths.shop.catalogue.CataloguePromotionDetailsQuery.Data) r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.catalogue.CataloguePromotionDetailsQuery$CataloguePromotionDetails r10 = r10.f21679a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            if (r10 == 0) goto Lb3
            au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model.PromotionDetails r10 = au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model.CataloguePromotionDetailsQueryCataloguePromotionDetailsExtKt.a(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            goto Lb4
        Lb3:
            r10 = 0
        Lb4:
            if (r10 == 0) goto Lb7
            return r10
        Lb7:
            java.util.List r10 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.network.ServerErrorException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            throw r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
        Lbe:
            au.com.woolworths.android.onesite.network.ServerErrorException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r10)
            throw r10
        Lc3:
            java.lang.Exception r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsRepository.a(java.lang.String, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
