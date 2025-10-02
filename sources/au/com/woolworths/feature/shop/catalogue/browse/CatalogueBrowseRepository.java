package au.com.woolworths.feature.shop.catalogue.browse;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseRepository;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueBrowseRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6796a;
    public final FeatureToggleManager b;
    public final SupportedLinksHelper c;

    public CatalogueBrowseRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6796a = apolloClient;
        this.b = featureToggleManager;
        this.c = supportedLinksHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r15, int r16, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r17, java.lang.String r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Exception {
        /*
            r14 = this;
            r0 = r20
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r1 = r14.b
            boolean r2 = r0 instanceof au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueBrowse$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueBrowse$1 r2 = (au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueBrowse$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueBrowse$1 r2 = new au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueBrowse$1
            r2.<init>(r14, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            goto L8a
        L2b:
            r0 = move-exception
            r15 = r0
            goto La6
        L2f:
            r0 = move-exception
            r15 = r0
            goto Lab
        L33:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3b:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.feature.shop.catalogue.CatalogueFeature r0 = au.com.woolworths.feature.shop.catalogue.CatalogueFeature.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r12 = r1.c(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r0 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r13 = r1.c(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloClient r0 = r14.f6796a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.catalogue.CatalogueBrowseQuery r6 = new com.woolworths.shop.catalogue.CatalogueBrowseQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional$Present r7 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r1 = r18
            r7.<init>(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.shop.graphql.type.ShoppingModeType r8 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r17)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional$Present r9 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Integer r1 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r1.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r9.<init>(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional$Present r10 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Integer r15 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r1 = r16
            r15.<init>(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r10.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional$Present r11 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r15 = r19
            r11.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloCall r15 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r15.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r0 = r15.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            if (r0 != r3) goto L8a
            return r3
        L8a:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Operation$Data r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.catalogue.CatalogueBrowseQuery$Data r15 = (com.woolworths.shop.catalogue.CatalogueBrowseQuery.Data) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.catalogue.CatalogueBrowseQuery$CatalogueBrowse r15 = r15.f21647a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            if (r15 == 0) goto L9b
            au.com.woolworths.feature.shop.catalogue.browse.model.CatalogueBrowse r15 = au.com.woolworths.feature.shop.catalogue.browse.model.CatalogueBrowseQueryCatalogueBrowseExtKt.a(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            goto L9c
        L9b:
            r15 = 0
        L9c:
            if (r15 == 0) goto L9f
            return r15
        L9f:
            java.util.List r15 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.network.ServerErrorException r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            throw r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
        La6:
            au.com.woolworths.android.onesite.network.ServerErrorException r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r15)
            throw r15
        Lab:
            java.lang.Exception r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r15)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository.a(int, int, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r8, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueContents$1
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueContents$1 r0 = (au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueContents$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueContents$1 r0 = new au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository$fetchCatalogueContents$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L6a
        L27:
            r8 = move-exception
            goto L86
        L29:
            r8 = move-exception
            goto L8b
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.b(r10)
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r10 = r7.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.List r10 = r10.a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r7.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.catalogue.CatalogueFeature r4 = au.com.woolworths.feature.shop.catalogue.CatalogueFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r2 = r2.c(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloClient r4 = r7.f6796a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.catalogue.CatalogueLandingQuery r5 = new com.woolworths.shop.catalogue.CatalogueLandingQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r6 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.ShoppingModeType r8 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r9 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.<init>(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r6, r8, r2, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.<init>(r4, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r10 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r10 != r1) goto L6a
            return r1
        L6a:
            com.apollographql.apollo.api.ApolloResponse r10 = (com.apollographql.apollo.api.ApolloResponse) r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.catalogue.CatalogueLandingQuery$Data r8 = (com.woolworths.shop.catalogue.CatalogueLandingQuery.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.catalogue.CatalogueLandingQuery$CatalogueLanding r8 = r8.f21666a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 == 0) goto L7b
            au.com.woolworths.feature.shop.catalogue.browse.contents.model.CatalogueContents r8 = au.com.woolworths.feature.shop.catalogue.browse.contents.model.CatalogueLandingQueryCatalogueLandingExtKt.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L7c
        L7b:
            r8 = 0
        L7c:
            if (r8 == 0) goto L7f
            return r8
        L7f:
            java.util.List r8 = r10.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L86:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        L8b:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository.b(java.lang.String, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
