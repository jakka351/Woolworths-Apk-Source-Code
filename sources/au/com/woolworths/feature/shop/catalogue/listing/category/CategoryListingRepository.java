package au.com.woolworths.feature.shop.catalogue.listing.category;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingRepository;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CategoryListingRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6871a;
    public final FeatureToggleManager b;

    public CategoryListingRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6871a = apolloClient;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r13, int r14, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r15, java.lang.String r16, java.lang.String r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingRepository$fetchCategoryListing$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingRepository$fetchCategoryListing$1 r1 = (au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingRepository$fetchCategoryListing$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingRepository$fetchCategoryListing$1 r1 = new au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingRepository$fetchCategoryListing$1
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L7d
        L29:
            r0 = move-exception
            r13 = r0
            goto L99
        L2c:
            r0 = move-exception
            r13 = r0
            goto L9e
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r12.b
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r3 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g
            boolean r11 = r0.c(r3)
            com.apollographql.apollo.ApolloClient r0 = r12.f6871a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.catalogue.CatalogueListingQuery r5 = new com.woolworths.shop.catalogue.CatalogueListingQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional$Present r6 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r3 = r16
            r6.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.graphql.type.ShoppingModeType r7 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.util.List r8 = kotlin.collections.CollectionsKt.Q(r17)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional$Present r9 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Integer r3 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r3.<init>(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r9.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional$Present r10 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Integer r13 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r13.<init>(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r10.<init>(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloCall r13 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r13.<init>(r0, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r0 = r13.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r0 != r2) goto L7d
            return r2
        L7d:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Operation$Data r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.catalogue.CatalogueListingQuery$Data r13 = (com.woolworths.shop.catalogue.CatalogueListingQuery.Data) r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.catalogue.CatalogueListingQuery$CatalogueListing r13 = r13.f21673a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r13 == 0) goto L8e
            au.com.woolworths.feature.shop.catalogue.listing.category.model.CategoryListing r13 = au.com.woolworths.feature.shop.catalogue.listing.category.model.CatalogueListingQueryCatalogueListingExtKt.a(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L8f
        L8e:
            r13 = 0
        L8f:
            if (r13 == 0) goto L92
            return r13
        L92:
            java.util.List r13 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            throw r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
        L99:
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r13)
            throw r13
        L9e:
            java.lang.Exception r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingRepository.a(int, int, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
