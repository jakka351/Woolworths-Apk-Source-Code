package au.com.woolworths.feature.product.list.legacy;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.shop.graphql.type.ProductFilterOption;
import com.apollographql.apollo.ApolloClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductsListRepository;", "", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsListRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5342a;
    public final SharedPreferences b;
    public final ApolloClient c;
    public final FeatureToggleManager d;
    public final SupportedLinksHelper e;
    public final ShopAppRegionInteractor f;
    public final ShopAppFlavorInteractor g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductsListRepository$Companion;", "", "", "IS_SWAP_COACH_MARK_SEEN_PREF_KEY", "Ljava/lang/String;", "BEST_VALUE_COACH_MARK_SEEN_PREF_KEY", "FOR_YOU_COACH_MARK_SEEN_PREF_KEY", "PRODUCT_LIST_PERSISTED_CHIP_IDS", "PRODUCT_LIST_DISPLAY_MODE", "HAS_FILTER_DOT_INTERACTION", "FILTER_CARD_COUNT", "", "MAX_FILTER_CARD_IMPRESSIONS", "I", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ProductsListRepository(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper, ShopAppRegionInteractor shopAppRegionInteractor, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.f5342a = sharedPreferences;
        this.b = sharedPreferences2;
        this.c = apolloClient;
        this.d = featureToggleManager;
        this.e = supportedLinksHelper;
        this.f = shopAppRegionInteractor;
        this.g = shopAppFlavorInteractor;
    }

    public static ArrayList m(Map map) {
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new ProductFilterOption((String) entry.getKey(), (List) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r27, java.lang.String r28, java.lang.Integer r29, java.lang.Boolean r30, java.lang.String r31, java.util.List r32, java.lang.String r33, java.lang.String r34, java.util.Map r35, au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs r36, java.lang.String r37, boolean r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.a(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.Map, au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r24, java.lang.String r25, java.util.List r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.b(java.lang.String, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r30, java.lang.String r31, java.lang.Integer r32, java.lang.String r33, java.util.Map r34, java.lang.Boolean r35, java.lang.String r36, au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs r37, kotlin.coroutines.jvm.internal.ContinuationImpl r38) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.c(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.Map, java.lang.Boolean, java.lang.String, au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.Map r26, java.lang.Integer r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) throws java.lang.Exception {
        /*
            r19 = this;
            r1 = r19
            r0 = r28
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r1.d
            boolean r3 = r0 instanceof au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByFacet$1
            if (r3 == 0) goto L19
            r3 = r0
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByFacet$1 r3 = (au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByFacet$1) r3
            int r4 = r3.r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.r = r4
            goto L1e
        L19:
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByFacet$1 r3 = new au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByFacet$1
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.r
            r6 = 1
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto L86
        L2d:
            r0 = move-exception
            goto Lb1
        L30:
            r0 = move-exception
            goto Lb6
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            kotlin.ResultKt.b(r0)
            java.util.ArrayList r0 = m(r26)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloClient r5 = r1.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.legacy.graphql.ProductsByFacetQuery r7 = new au.com.woolworths.shop.legacy.graphql.ProductsByFacetQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.graphql.type.ProductListChannelType r8 = au.com.woolworths.shop.graphql.type.ProductListChannelType.valueOf(r22)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.graphql.type.ProductListFacetType r9 = au.com.woolworths.shop.graphql.type.ProductListFacetType.valueOf(r23)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional$Absent r10 = com.apollographql.apollo.api.Optional.Absent.f13523a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r11 = com.apollographql.apollo.api.Optional.Companion.a(r27)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r12 = com.apollographql.apollo.api.Optional.Companion.a(r20)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r14 = com.apollographql.apollo.api.Optional.Companion.a(r24)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r15 = com.apollographql.apollo.api.Optional.Companion.a(r25)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r16 = com.apollographql.apollo.api.Optional.Companion.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.base.shopapp.BaseShopAppFeature r0 = au.com.woolworths.base.shopapp.BaseShopAppFeature.e0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r17 = r2.c(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r0 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r18 = r2.c(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r13 = r21
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r5.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r0.<init>(r5, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r3.r = r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Object r0 = r0.b(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 != r4) goto L86
            return r4
        L86:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.util.List r3 = r0.d
            if (r2 != 0) goto Lac
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.legacy.graphql.ProductsByFacetQuery$Data r0 = (au.com.woolworths.shop.legacy.graphql.ProductsByFacetQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.legacy.graphql.ProductsByFacetQuery$ProductsByFacet r0 = r0.f12146a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 == 0) goto La3
            au.com.woolworths.feature.product.list.legacy.data.ProductListByFacetApiData r0 = au.com.woolworths.feature.product.list.legacy.data.ProductsByFacetQueryProductsByFacetExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = au.com.woolworths.feature.product.list.legacy.data.ProductListByFacetApiDataKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto La4
        La3:
            r0 = 0
        La4:
            if (r0 == 0) goto La7
            return r0
        La7:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Lac:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Lb1:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lb6:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r24) throws java.lang.Exception {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r1.d
            boolean r3 = r0 instanceof au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByHaveYouForgotten$1
            if (r3 == 0) goto L19
            r3 = r0
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByHaveYouForgotten$1 r3 = (au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByHaveYouForgotten$1) r3
            int r4 = r3.r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.r = r4
            goto L1e
        L19:
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByHaveYouForgotten$1 r3 = new au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByHaveYouForgotten$1
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.r
            r6 = 1
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto L6a
        L2d:
            r0 = move-exception
            goto Lbd
        L30:
            r0 = move-exception
            goto Lc2
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.legacy.graphql.ProductsByHaveYouForgottenQuery r5 = new au.com.woolworths.shop.legacy.graphql.ProductsByHaveYouForgottenQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.base.shopapp.BaseShopAppFeature r7 = au.com.woolworths.base.shopapp.BaseShopAppFeature.y     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r7 = r2.c(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r8 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r2 = r2.c(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r5.<init>(r7, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloCall r2 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r2.<init>(r0, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r3.r = r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Object r0 = r2.b(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 != r4) goto L6a
            return r4
        L6a:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.util.List r3 = r0.d
            if (r2 != 0) goto Lb8
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.legacy.graphql.ProductsByHaveYouForgottenQuery$Data r0 = (au.com.woolworths.shop.legacy.graphql.ProductsByHaveYouForgottenQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.legacy.graphql.ProductsByHaveYouForgottenQuery$ProductsByHaveYouForgotten r0 = r0.f12160a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 == 0) goto Laf
            au.com.woolworths.feature.product.list.legacy.data.ProductListByHaveYouForgottenApiData r0 = au.com.woolworths.feature.product.list.legacy.data.ProductsByHaveYouForgottenQueryProductsByHaveYouForgottenExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.util.ArrayList r6 = r0.f5358a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Integer r0 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 == 0) goto L90
            int r0 = r0.intValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        L8e:
            r8 = r0
            goto L92
        L90:
            r0 = 0
            goto L8e
        L92:
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r4 = new au.com.woolworths.feature.product.list.legacy.data.ProductListData     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r21 = 0
            r22 = 130944(0x1ff80, float:1.83492E-40)
            r5 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r10 = r7
            r11 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto Lb0
        Laf:
            r4 = 0
        Lb0:
            if (r4 == 0) goto Lb3
            return r4
        Lb3:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Lb8:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Lbd:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lc2:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r22, java.lang.String r23, java.lang.Integer r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = r25
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r1.d
            boolean r3 = r0 instanceof au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPastShop$1
            if (r3 == 0) goto L19
            r3 = r0
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPastShop$1 r3 = (au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPastShop$1) r3
            int r4 = r3.r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.r = r4
            goto L1e
        L19:
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPastShop$1 r3 = new au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPastShop$1
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.r
            r6 = 1
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto L80
        L2d:
            r0 = move-exception
            goto Lad
        L30:
            r0 = move-exception
            goto Lb2
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r22)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r23)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r24)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional$Absent r11 = com.apollographql.apollo.api.Optional.Absent.f13523a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.base.shopapp.BaseShopAppFeature r5 = au.com.woolworths.base.shopapp.BaseShopAppFeature.n0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r12 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.base.shopapp.BaseShopAppFeature r5 = au.com.woolworths.base.shopapp.BaseShopAppFeature.e0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r15 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r5 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r18 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.product.list.legacy.ProductsByPastShopQuery r7 = new com.woolworths.product.list.legacy.ProductsByPastShopQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r19 = 768(0x300, float:1.076E-42)
            r20 = 0
            r13 = 1
            r14 = 0
            r16 = 0
            r17 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloCall r2 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r2.<init>(r0, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r3.r = r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Object r0 = r2.b(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 != r4) goto L80
            return r4
        L80:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.util.List r3 = r0.d
            if (r2 != 0) goto La8
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.product.list.legacy.ProductsByPastShopQuery$Data r0 = (com.woolworths.product.list.legacy.ProductsByPastShopQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.product.list.legacy.ProductsByPastShopQuery$PurchaseHistory r0 = r0.getPurchaseHistory()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 == 0) goto L9f
            au.com.woolworths.feature.product.list.legacy.data.ProductListByPastShopApiData r0 = au.com.woolworths.feature.product.list.legacy.data.ProductsByPastShopQueryPurchaseHistoryExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = au.com.woolworths.feature.product.list.legacy.data.ProductListByPastShopApiDataKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto La0
        L9f:
            r0 = 0
        La0:
            if (r0 == 0) goto La3
            return r0
        La3:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        La8:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Lad:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lb2:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.f(java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r24, java.lang.String r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.lang.Exception {
        /*
            r23 = this;
            r1 = r23
            r0 = r26
            boolean r2 = r0 instanceof au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPriceFamily$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPriceFamily$1 r2 = (au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPriceFamily$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPriceFamily$1 r2 = new au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByPriceFamily$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L69
        L2b:
            r0 = move-exception
            goto Lbe
        L2e:
            r0 = move-exception
            goto Lc3
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L39:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r1.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r4 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r13 = r0.c(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloClient r0 = r1.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.product.list.legacy.ProductsByPriceFamilyQuery r6 = new com.woolworths.product.list.legacy.ProductsByPriceFamilyQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r25)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r14 = 48
            r15 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r7 = r24
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != r3) goto L69
            return r3
        L69:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r3 = r0.d
            if (r2 != 0) goto Lb9
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.product.list.legacy.ProductsByPriceFamilyQuery$Data r0 = (com.woolworths.product.list.legacy.ProductsByPriceFamilyQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.product.list.legacy.ProductsByPriceFamilyQuery$ProductsByPriceFamily r0 = r0.getProductsByPriceFamily()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 == 0) goto Lb0
            au.com.woolworths.feature.product.list.legacy.data.ProductListByPriceFamilyApiData r0 = au.com.woolworths.feature.product.list.legacy.data.ProductsByPriceFamilyQueryProductsByPriceFamilyExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.ArrayList r6 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Integer r0 = r0.f5360a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 == 0) goto L8f
            int r0 = r0.intValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        L8d:
            r8 = r0
            goto L91
        L8f:
            r0 = 0
            goto L8d
        L91:
            kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r4 = new au.com.woolworths.feature.product.list.legacy.data.ProductListData     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r21 = 0
            r22 = 130944(0x1ff80, float:1.83492E-40)
            r5 = 0
            r7 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r11 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto Lb1
        Lb0:
            r4 = 0
        Lb1:
            if (r4 == 0) goto Lb4
            return r4
        Lb4:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Lb9:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Lbe:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lc3:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.g(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r14, java.lang.String r15, java.lang.Integer r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            r13 = this;
            r0 = r17
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r1 = r13.d
            boolean r2 = r0 instanceof au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByRecipe$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByRecipe$1 r2 = (au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByRecipe$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByRecipe$1 r2 = new au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListByRecipe$1
            r2.<init>(r13, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            goto L79
        L2b:
            r0 = move-exception
            r14 = r0
            goto La4
        L2f:
            r0 = move-exception
            r14 = r0
            goto La9
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r13.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.shop.legacy.graphql.ProductsByRecipeQuery r6 = new au.com.woolworths.shop.legacy.graphql.ProductsByRecipeQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r16)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.base.shopapp.BaseShopAppFeature r15 = au.com.woolworths.base.shopapp.BaseShopAppFeature.m0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r10 = r1.c(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.base.shopapp.BaseShopAppFeature r15 = au.com.woolworths.base.shopapp.BaseShopAppFeature.y     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r15 = r1.c(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r11 = com.apollographql.apollo.api.Optional.Companion.a(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r15 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r12 = r1.c(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloCall r14 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r14.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r0 = r14.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            if (r0 != r3) goto L79
            return r3
        L79:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r14 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.List r15 = r0.d
            if (r14 != 0) goto L9f
            com.apollographql.apollo.api.Operation$Data r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.shop.legacy.graphql.ProductsByRecipeQuery$Data r14 = (au.com.woolworths.shop.legacy.graphql.ProductsByRecipeQuery.Data) r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.shop.legacy.graphql.ProductsByRecipeQuery$ProductsByRecipe r14 = r14.f12168a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            if (r14 == 0) goto L96
            au.com.woolworths.feature.product.list.legacy.data.ProductListByRecipeApiData r14 = au.com.woolworths.feature.product.list.legacy.data.ProductsByRecipeQueryProductsByRecipeExtKt.a(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r14 = au.com.woolworths.feature.product.list.legacy.data.ProductListByRecipeApiDataKt.a(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            goto L97
        L96:
            r14 = 0
        L97:
            if (r14 == 0) goto L9a
            return r14
        L9a:
            au.com.woolworths.android.onesite.network.ServerErrorException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            throw r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
        L9f:
            au.com.woolworths.android.onesite.network.ServerErrorException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            throw r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
        La4:
            au.com.woolworths.android.onesite.network.ServerErrorException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r14)
            throw r14
        La9:
            java.lang.Exception r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r14)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.h(java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r29, java.lang.String r30, java.lang.Integer r31, java.lang.String r32, java.util.Map r33, java.lang.Boolean r34, java.lang.String r35, au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs r36, kotlin.coroutines.jvm.internal.ContinuationImpl r37) {
        /*
            r28 = this;
            r1 = r28
            r0 = r37
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r1.d
            boolean r3 = r0 instanceof au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListOnSpecialsByCategory$1
            if (r3 == 0) goto L19
            r3 = r0
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListOnSpecialsByCategory$1 r3 = (au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListOnSpecialsByCategory$1) r3
            int r4 = r3.r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.r = r4
            goto L1e
        L19:
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListOnSpecialsByCategory$1 r3 = new au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchProductListOnSpecialsByCategory$1
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.r
            r6 = 1
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto La3
        L2d:
            r0 = move-exception
            goto Ld0
        L30:
            r0 = move-exception
            goto Ld5
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            kotlin.ResultKt.b(r0)
            java.util.ArrayList r0 = m(r33)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r5 = r1.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.util.List r5 = r5.a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloClient r7 = r1.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r30)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional$Absent r11 = com.apollographql.apollo.api.Optional.Absent.f13523a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r12 = com.apollographql.apollo.api.Optional.Companion.a(r31)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r14 = com.apollographql.apollo.api.Optional.Companion.a(r32)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r15 = com.apollographql.apollo.api.Optional.Companion.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r13 = com.apollographql.apollo.api.Optional.Companion.a(r34)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r16 = com.apollographql.apollo.api.Optional.Companion.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r17 = com.apollographql.apollo.api.Optional.Companion.a(r35)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r21 = com.apollographql.apollo.api.Optional.Companion.a(r36)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.base.shopapp.BaseShopAppFeature r0 = au.com.woolworths.base.shopapp.BaseShopAppFeature.e0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r22 = r2.c(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r0 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.q     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r23 = r2.c(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r0 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r25 = r2.c(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.product.list.legacy.ProductsOnSpecialByCategoryQuery r8 = new com.woolworths.product.list.legacy.ProductsOnSpecialByCategoryQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r26 = 34816(0x8800, float:4.8788E-41)
            r27 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            r24 = 0
            r9 = r29
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r0.<init>(r7, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r3.r = r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Object r0 = r0.b(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 != r4) goto La3
            return r4
        La3:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.util.List r3 = r0.d
            if (r2 != 0) goto Lcb
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.product.list.legacy.ProductsOnSpecialByCategoryQuery$Data r0 = (com.woolworths.product.list.legacy.ProductsOnSpecialByCategoryQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.product.list.legacy.ProductsOnSpecialByCategoryQuery$ProductsOnSpecialByCategory r0 = r0.getProductsOnSpecialByCategory()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 == 0) goto Lc2
            au.com.woolworths.feature.product.list.legacy.data.ProductListOnSpecialByCategoryApiData r0 = au.com.woolworths.feature.product.list.legacy.data.ProductsOnSpecialByCategoryQueryProductsOnSpecialByCategoryExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = au.com.woolworths.feature.product.list.legacy.data.ProductListOnSpecialByCategoryApiDataKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto Lc3
        Lc2:
            r0 = 0
        Lc3:
            if (r0 == 0) goto Lc6
            return r0
        Lc6:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Lcb:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Ld0:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Ld5:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.i(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.Map, java.lang.Boolean, java.lang.String, au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r24, int r25, java.lang.Integer r26, java.lang.Integer r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) throws java.lang.Exception {
        /*
            r23 = this;
            r1 = r23
            r0 = r28
            boolean r2 = r0 instanceof au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchSuggestedProductList$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchSuggestedProductList$1 r2 = (au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchSuggestedProductList$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchSuggestedProductList$1 r2 = new au.com.woolworths.feature.product.list.legacy.ProductsListRepository$fetchSuggestedProductList$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L73
        L2b:
            r0 = move-exception
            goto Lc1
        L2e:
            r0 = move-exception
            goto Lc6
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L39:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r24)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r27)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r26)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r4 = r1.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r6 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r16 = r4.c(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery r6 = new au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r17 = 384(0x180, float:5.38E-43)
            r18 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r8 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != r3) goto L73
            return r3
        L73:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r3 = r0.d
            if (r2 != 0) goto Lbc
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery$Data r0 = (au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery$SuggestedListItems r0 = r0.getSuggestedListItems()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 == 0) goto Lb3
            au.com.woolworths.feature.product.list.legacy.data.ProductListBySuggestedListApiData r0 = au.com.woolworths.feature.product.list.legacy.data.SuggestedProductListQuerySuggestedListItemsExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            int r8 = r0.getD()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Integer r9 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.ArrayList r5 = r0.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.feature.product.list.legacy.data.ProductListData r4 = new au.com.woolworths.feature.product.list.legacy.data.ProductListData     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r21 = 0
            r22 = 130944(0x1ff80, float:1.83492E-40)
            r6 = 0
            r7 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r11 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto Lb4
        Lb3:
            r4 = 0
        Lb4:
            if (r4 == 0) goto Lb7
            return r4
        Lb7:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Lbc:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Lc1:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lc6:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductsListRepository.j(java.lang.String, int, java.lang.Integer, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean k() {
        int iOrdinal = this.f.b().ordinal();
        FeatureToggleManager featureToggleManager = this.d;
        if (iOrdinal == 0) {
            return featureToggleManager.c(BaseShopAppFeature.K);
        }
        if (iOrdinal == 1) {
            return featureToggleManager.c(BaseShopAppFeature.L);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List l() {
        Set<String> stringSet = this.f5342a.getStringSet("product_list_persisted_chip_ids", EmptySet.d);
        if (stringSet != null) {
            return CollectionsKt.G0(stringSet);
        }
        return null;
    }
}
