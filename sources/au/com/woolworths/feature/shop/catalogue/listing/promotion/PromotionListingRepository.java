package au.com.woolworths.feature.shop.catalogue.listing.promotion;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingRepository;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PromotionListingRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6885a;
    public final FeatureToggleManager b;

    public PromotionListingRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6885a = apolloClient;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r15, int r16, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r17, java.lang.String r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Exception {
        /*
            r14 = this;
            r0 = r20
            boolean r1 = r0 instanceof au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository$fetchPromotionListing$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository$fetchPromotionListing$1 r1 = (au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository$fetchPromotionListing$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository$fetchPromotionListing$1 r1 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository$fetchPromotionListing$1
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 != r5) goto L32
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            goto L8a
        L2a:
            r0 = move-exception
            r15 = r0
            goto La4
        L2e:
            r0 = move-exception
            r15 = r0
            goto La9
        L32:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3a:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r14.b
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r3 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g
            boolean r13 = r0.c(r3)
            com.apollographql.apollo.ApolloClient r0 = r14.f6885a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.catalogue.CataloguePromotionListingQuery r6 = new com.woolworths.shop.catalogue.CataloguePromotionListingQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r7 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r3 = r18
            r7.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.graphql.type.ShoppingModeType r8 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r17)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r9 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Integer r3 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r3.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r9.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r10 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Integer r15 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r3 = r16
            r15.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r10.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r11 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r11.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional$Present r12 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r15 = r19
            r12.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r15 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r15.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r1.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r0 = r15.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != r2) goto L8a
            return r2
        L8a:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Operation$Data r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.catalogue.CataloguePromotionListingQuery$Data r15 = (com.woolworths.shop.catalogue.CataloguePromotionListingQuery.Data) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.catalogue.CataloguePromotionListingQuery$CataloguePromotionListing r15 = r15.f21689a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            if (r15 == 0) goto L9a
            au.com.woolworths.feature.shop.catalogue.listing.promotion.model.PromotionListing r4 = au.com.woolworths.feature.shop.catalogue.listing.promotion.model.CataloguePromotionListingQueryCataloguePromotionListingExtKt.a(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
        L9a:
            if (r4 == 0) goto L9d
            return r4
        L9d:
            java.util.List r15 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.network.ServerErrorException r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            throw r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
        La4:
            au.com.woolworths.android.onesite.network.ServerErrorException r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r15)
            throw r15
        La9:
            java.lang.Exception r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r15)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository.a(int, int, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
