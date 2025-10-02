package au.com.woolworths.shop.checkout.data.source;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutMarketProducts;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProducts;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerGroup;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/CheckoutContentRepository;", "", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutContentRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10543a;
    public final FeatureToggleManager b;
    public final ShopAppRegionInteractor c;
    public final ShopAppFlavorInteractor d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/CheckoutContentRepository$Companion;", "", "", "API_FEATURES", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CheckoutContentRepository(ApolloClient apolloClient, FeatureToggleManager featureManager, ShopAppRegionInteractor shopAppRegionInteractor, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureManager, "featureManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.f10543a = apolloClient;
        this.b = featureManager;
        this.c = shopAppRegionInteractor;
        this.d = shopAppFlavorInteractor;
    }

    public static void k(Checkout checkout) throws NoProductsException {
        List list = checkout.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if ((obj instanceof CheckoutProducts) && !((CheckoutProducts) obj).e.isEmpty()) {
                    return;
                }
                if (obj instanceof CheckoutMarketProducts) {
                    ArrayList arrayList = ((CheckoutMarketProducts) obj).c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        CollectionsKt.h(((MarketSellerGroup) it.next()).c, arrayList2);
                    }
                    if (!arrayList2.isEmpty()) {
                        return;
                    }
                }
            }
        }
        throw new NoProductsException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$addPromoCode$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$addPromoCode$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$addPromoCode$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$addPromoCode$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$addPromoCode$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r8 = r0.q
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r0 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L71
        L2b:
            r8 = move-exception
            goto La4
        L2e:
            r8 = move-exception
            goto La9
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.AddPromoCodeOldMutation r2 = new com.woolworths.shop.checkout.AddPromoCodeOldMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r4 = r7.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r5 = r7.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r6 = r7.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.<init>(r8, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r7.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.p = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.q = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.t = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r8 = r7
            r0 = r8
        L71:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r0 = r9.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r1 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != 0) goto L9e
            com.apollographql.apollo.api.Operation$Data r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.AddPromoCodeOldMutation$Data r9 = (com.woolworths.shop.checkout.AddPromoCodeOldMutation.Data) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.AddPromoCodeOldMutation$AddPromoCode r9 = r9.f21798a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r9 == 0) goto L8b
            com.woolworths.shop.checkout.fragment.CheckoutContent r9 = r9.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L8c
        L8b:
            r9 = 0
        L8c:
            if (r9 == 0) goto L99
            au.com.woolworths.shop.checkout.domain.model.Checkout r9 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            return r9
        L99:
            au.com.woolworths.android.onesite.network.GraphQlException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        L9e:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r8 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.<init>(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        La4:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        La9:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(ApolloCall apolloCall) {
        ApolloHeaderExtKt.a(apolloCall, this.b, CheckoutFeature.e, CheckoutFeature.n);
    }

    public final boolean c() {
        BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.c0;
        FeatureToggleManager featureToggleManager = this.b;
        return (featureToggleManager.c(baseShopAppFeature) || this.d.b(Region.j)) && featureToggleManager.c(CheckoutFeature.d);
    }

    public final boolean d() {
        return this.b.c(CheckoutFeature.n);
    }

    public final boolean e() {
        BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.c0;
        FeatureToggleManager featureToggleManager = this.b;
        return (featureToggleManager.c(baseShopAppFeature) || this.d.b(Region.j)) && featureToggleManager.c(BaseShopAppFeature.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Exception {
        /*
            r12 = this;
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r12.b
            boolean r1 = r13 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutDetails$1
            if (r1 == 0) goto L15
            r1 = r13
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutDetails$1 r1 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutDetails$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutDetails$1 r1 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutDetails$1
            r1.<init>(r12, r13)
        L1a:
            java.lang.Object r13 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            kotlin.ResultKt.b(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            goto L91
        L29:
            r0 = move-exception
            r13 = r0
            goto Lba
        L2d:
            r0 = move-exception
            r13 = r0
            goto Lbf
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L39:
            kotlin.ResultKt.b(r13)
            com.apollographql.apollo.ApolloClient r13 = r12.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.CheckoutDetailsQuery r5 = new com.woolworths.shop.checkout.CheckoutDetailsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r3 = r12.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Optional r6 = com.apollographql.apollo.api.Optional.Companion.a(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r7 = r12.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r8 = r12.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.base.shopapp.BaseShopAppFeature r3 = au.com.woolworths.base.shopapp.BaseShopAppFeature.j     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r9 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r3 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r3 == 0) goto L6a
            au.com.woolworths.shop.checkout.CheckoutFeature r3 = au.com.woolworths.shop.checkout.CheckoutFeature.l     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r3 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r3 == 0) goto L6a
            r10 = r4
            goto L6c
        L6a:
            r3 = 0
            r10 = r3
        L6c:
            au.com.woolworths.base.shopapp.BaseShopAppFeature r3 = au.com.woolworths.base.shopapp.BaseShopAppFeature.X     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r0 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Optional r11 = com.apollographql.apollo.api.Optional.Companion.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r13.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r0.<init>(r13, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r12.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Object r13 = r0.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r13 != r2) goto L91
            return r2
        L91:
            com.apollographql.apollo.api.ApolloResponse r13 = (com.apollographql.apollo.api.ApolloResponse) r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r0 = r13.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.util.List r1 = r13.d
            if (r0 != 0) goto Lb5
            com.apollographql.apollo.api.Operation$Data r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.CheckoutDetailsQuery$Data r13 = (com.woolworths.shop.checkout.CheckoutDetailsQuery.Data) r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.CheckoutDetailsQuery$Checkout r13 = r13.f21821a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r13 == 0) goto Lac
            com.woolworths.shop.checkout.fragment.CheckoutContent r13 = r13.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.domain.model.Checkout r13 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            goto Lad
        Lac:
            r13 = 0
        Lad:
            if (r13 == 0) goto Lb0
            return r13
        Lb0:
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            throw r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
        Lb5:
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            throw r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
        Lba:
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r13)
            throw r13
        Lbf:
            java.lang.Exception r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r10 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutProducts$1
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutProducts$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutProducts$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutProducts$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryCheckoutProducts$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            goto L77
        L27:
            r10 = move-exception
            goto La3
        L2a:
            r10 = move-exception
            goto La8
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            kotlin.ResultKt.b(r10)
            com.apollographql.apollo.ApolloClient r10 = r9.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.shop.checkout.CheckoutProductsQuery r2 = new com.woolworths.shop.checkout.CheckoutProductsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            boolean r4 = r9.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            boolean r5 = r9.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            boolean r6 = r9.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r7 = r9.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            au.com.woolworths.base.shopapp.BaseShopAppFeature r8 = au.com.woolworths.base.shopapp.BaseShopAppFeature.X     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            boolean r7 = r7.c(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r2.<init>(r4, r5, r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r10.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r4.<init>(r10, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r9.b(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.lang.Object r10 = r4.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r10 != r1) goto L77
            return r1
        L77:
            com.apollographql.apollo.api.ApolloResponse r10 = (com.apollographql.apollo.api.ApolloResponse) r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            boolean r0 = r10.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            java.util.List r1 = r10.d
            if (r0 != 0) goto L9e
            com.apollographql.apollo.api.Operation$Data r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.shop.checkout.CheckoutProductsQuery$Data r10 = (com.woolworths.shop.checkout.CheckoutProductsQuery.Data) r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            com.woolworths.shop.checkout.CheckoutProductsQuery$CheckoutProducts r10 = r10.f21824a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            if (r10 == 0) goto L92
            com.woolworths.shop.checkout.fragment.CheckoutContent r10 = r10.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            au.com.woolworths.shop.checkout.domain.model.Checkout r10 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            goto L93
        L92:
            r10 = 0
        L93:
            if (r10 == 0) goto L99
            k(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            return r10
        L99:
            au.com.woolworths.android.onesite.network.ServerErrorException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            throw r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
        L9e:
            au.com.woolworths.android.onesite.network.ServerErrorException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
            throw r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2a
        La3:
            au.com.woolworths.android.onesite.network.ServerErrorException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r10)
            throw r10
        La8:
            java.lang.Exception r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.g(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryFulfilmentWindows$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryFulfilmentWindows$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryFulfilmentWindows$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryFulfilmentWindows$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$queryFulfilmentWindows$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L67
        L27:
            r7 = move-exception
            goto L90
        L29:
            r7 = move-exception
            goto L95
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.ResultKt.b(r7)
            com.apollographql.apollo.ApolloClient r7 = r6.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.FulfilmentWindowsQuery r2 = new com.woolworths.shop.checkout.FulfilmentWindowsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor r4 = r6.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.modules.common.Region r4 = r4.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.modules.common.Region r5 = au.com.woolworths.android.onesite.modules.common.Region.j     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r4 != r5) goto L46
            r4 = r3
            goto L47
        L46:
            r4 = 0
        L47:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r5 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r7, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.b(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r7 = r4.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 != r1) goto L67
            return r1
        L67:
            com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r0 = r7.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.List r1 = r7.d
            if (r0 != 0) goto L8b
            com.apollographql.apollo.api.Operation$Data r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.FulfilmentWindowsQuery$Data r7 = (com.woolworths.shop.checkout.FulfilmentWindowsQuery.Data) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.FulfilmentWindowsQuery$FulfilmentWindows r7 = r7.f21837a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 == 0) goto L82
            com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows r7 = r7.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows r7 = au.com.woolworths.shop.checkout.data.mappers.CheckoutFulfilmentWindowsExtKt.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L83
        L82:
            r7 = 0
        L83:
            if (r7 == 0) goto L86
            return r7
        L86:
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L8b:
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L90:
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r7)
            throw r7
        L95:
            java.lang.Exception r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removeProduct$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removeProduct$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removeProduct$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removeProduct$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removeProduct$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r8 = r0.q
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r0 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L71
        L2b:
            r8 = move-exception
            goto La4
        L2e:
            r8 = move-exception
            goto La9
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.RemoveProductMutation r2 = new com.woolworths.shop.checkout.RemoveProductMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r4 = r7.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r5 = r7.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r6 = r7.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.<init>(r8, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r7.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.p = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.q = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.t = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r8 = r7
            r0 = r8
        L71:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r0 = r9.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r1 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != 0) goto L9e
            com.apollographql.apollo.api.Operation$Data r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.RemoveProductMutation$Data r9 = (com.woolworths.shop.checkout.RemoveProductMutation.Data) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.RemoveProductMutation$RemoveProduct r9 = r9.f21884a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r9 == 0) goto L8b
            com.woolworths.shop.checkout.fragment.CheckoutContent r9 = r9.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L8c
        L8b:
            r9 = 0
        L8c:
            if (r9 == 0) goto L99
            au.com.woolworths.shop.checkout.domain.model.Checkout r9 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            return r9
        L99:
            au.com.woolworths.android.onesite.network.GraphQlException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        L9e:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r8 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.<init>(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        La4:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        La9:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.i(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removePromoCode$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removePromoCode$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removePromoCode$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removePromoCode$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$removePromoCode$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r1 = r0.q
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r0 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L71
        L2b:
            r8 = move-exception
            goto La4
        L2e:
            r8 = move-exception
            goto La9
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.ResultKt.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r7.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.RemovePromoCodeOldMutation r2 = new com.woolworths.shop.checkout.RemovePromoCodeOldMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r4 = r7.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r5 = r7.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r6 = r7.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.<init>(r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r4.<init>(r8, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r7.b(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.p = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.q = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.t = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r8 = r4.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r0 = r7
            r1 = r0
        L71:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r0 = r8.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r2 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != 0) goto L9e
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.RemovePromoCodeOldMutation$Data r8 = (com.woolworths.shop.checkout.RemovePromoCodeOldMutation.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.RemovePromoCodeOldMutation$RemovePromoCode r8 = r8.f21887a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r8 == 0) goto L8b
            com.woolworths.shop.checkout.fragment.CheckoutContent r8 = r8.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L8c
        L8b:
            r8 = 0
        L8c:
            if (r8 == 0) goto L99
            au.com.woolworths.shop.checkout.domain.model.Checkout r8 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r1.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            return r8
        L99:
            au.com.woolworths.android.onesite.network.GraphQlException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        L9e:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r8 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.<init>(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        La4:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        La9:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.j(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(int r5, java.lang.String r6, au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$setFulfilmentWindow$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$setFulfilmentWindow$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$setFulfilmentWindow$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$setFulfilmentWindow$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$setFulfilmentWindow$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r5 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L62
        L29:
            r5 = move-exception
            goto L90
        L2b:
            r5 = move-exception
            goto L95
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r8)
            com.woolworths.shop.checkout.SetFulfilmentWindowMutation r8 = new com.woolworths.shop.checkout.SetFulfilmentWindowMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r7 == 0) goto L41
            au.com.woolworths.shop.graphql.type.FulfilmentWindowSlotSelectionOptionId r7 = au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionIdKt.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L42
        L41:
            r7 = 0
        L42:
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r5, r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloClient r5 = r4.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r6.<init>(r5, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r4.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.p = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.s = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r8 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 != r1) goto L61
            return r1
        L61:
            r5 = r4
        L62:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r5 = r8.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.util.List r6 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r5 != 0) goto L8a
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.SetFulfilmentWindowMutation$Data r5 = (com.woolworths.shop.checkout.SetFulfilmentWindowMutation.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.SetFulfilmentWindowMutation$SetFulfilmentWindow r5 = r5.f21893a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r5 == 0) goto L85
            au.com.woolworths.shop.checkout.domain.model.UpfrontFulfilmentWindowResult r6 = new au.com.woolworths.shop.checkout.domain.model.UpfrontFulfilmentWindowResult     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.shop.graphql.type.CollectionModeId r5 = r5.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId r5 = au.com.woolworths.shop.checkout.data.mappers.CollectionModeIdExtKt.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r6.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            return r6
        L85:
            au.com.woolworths.android.onesite.network.GraphQlException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L8a:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r5 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.<init>(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L90:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L95:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.l(int, java.lang.String, au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(int r11, boolean r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r13 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCampaignOptIn$1
            if (r0 == 0) goto L13
            r0 = r13
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCampaignOptIn$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCampaignOptIn$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCampaignOptIn$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCampaignOptIn$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r11 = r0.q
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r12 = r0.p
            kotlin.ResultKt.b(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            goto L75
        L2b:
            r0 = move-exception
            r11 = r0
            goto La8
        L2f:
            r0 = move-exception
            r11 = r0
            goto Lad
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            kotlin.ResultKt.b(r13)
            com.apollographql.apollo.ApolloClient r13 = r10.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.checkout.UpdateCampaignOptInMutation r4 = new com.woolworths.shop.checkout.UpdateCampaignOptInMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r2 = r10.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r8 = r10.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r9 = r10.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r5 = r11
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r13.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloCall r11 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r11.<init>(r13, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r10.b(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r0.p = r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r0.q = r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r0.t = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r13 = r11.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            if (r13 != r1) goto L73
            return r1
        L73:
            r11 = r10
            r12 = r11
        L75:
            com.apollographql.apollo.api.ApolloResponse r13 = (com.apollographql.apollo.api.ApolloResponse) r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r12.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            boolean r12 = r13.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            java.util.List r0 = r13.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            if (r12 != 0) goto La2
            com.apollographql.apollo.api.Operation$Data r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.checkout.UpdateCampaignOptInMutation$Data r12 = (com.woolworths.shop.checkout.UpdateCampaignOptInMutation.Data) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.shop.checkout.UpdateCampaignOptInMutation$UpdateCampaignOptIn r12 = r12.f21910a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            if (r12 == 0) goto L8f
            com.woolworths.shop.checkout.fragment.CheckoutContent r12 = r12.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            goto L90
        L8f:
            r12 = 0
        L90:
            if (r12 == 0) goto L9d
            au.com.woolworths.shop.checkout.domain.model.Checkout r12 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r11.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            k(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            return r12
        L9d:
            au.com.woolworths.android.onesite.network.GraphQlException r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            throw r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
        La2:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r11 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            r11.<init>(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
            throw r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2f
        La8:
            au.com.woolworths.android.onesite.network.ServerErrorException r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r11)
            throw r11
        Lad:
            java.lang.Exception r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.m(int, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId r11, int r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r13 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCollectionMode$1
            if (r0 == 0) goto L13
            r0 = r13
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCollectionMode$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCollectionMode$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCollectionMode$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateCollectionMode$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r11 = r0.p
            kotlin.ResultKt.b(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            goto L75
        L29:
            r0 = move-exception
            r11 = r0
            goto La2
        L2d:
            r0 = move-exception
            r11 = r0
            goto La7
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            kotlin.ResultKt.b(r13)
            com.woolworths.shop.checkout.UpdateCollectionModeMutation r4 = new com.woolworths.shop.checkout.UpdateCollectionModeMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.String r11 = r11.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.graphql.type.CollectionModeId r5 = au.com.woolworths.shop.graphql.type.CollectionModeId.valueOf(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r11 = r10.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r8 = r10.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r9 = r10.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.ApolloClient r11 = r10.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r11.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.ApolloCall r12 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r12.<init>(r11, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r10.b(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r0.p = r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r0.s = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Object r13 = r12.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r13 != r1) goto L74
            return r1
        L74:
            r11 = r10
        L75:
            com.apollographql.apollo.api.ApolloResponse r13 = (com.apollographql.apollo.api.ApolloResponse) r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r11.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r11 = r13.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.util.List r12 = r13.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r11 != 0) goto L9c
            com.apollographql.apollo.api.Operation$Data r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.UpdateCollectionModeMutation$Data r11 = (com.woolworths.shop.checkout.UpdateCollectionModeMutation.Data) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.UpdateCollectionModeMutation$UpdateCollectionMode r11 = r11.f21913a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r11 == 0) goto L8f
            com.woolworths.shop.checkout.fragment.CheckoutContent r11 = r11.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            goto L90
        L8f:
            r11 = 0
        L90:
            if (r11 == 0) goto L97
            au.com.woolworths.shop.checkout.domain.model.Checkout r11 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            return r11
        L97:
            au.com.woolworths.android.onesite.network.GraphQlException r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            throw r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
        L9c:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r11 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r11.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            throw r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
        La2:
            au.com.woolworths.android.onesite.network.ServerErrorException r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r11)
            throw r11
        La7:
            java.lang.Exception r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.n(au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(int r14, java.lang.String r15, au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateFulfilmentWindow$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateFulfilmentWindow$1 r1 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateFulfilmentWindow$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s = r2
            goto L1a
        L15:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateFulfilmentWindow$1 r1 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateFulfilmentWindow$1
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.s
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r14 = r1.p
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            goto L7f
        L2c:
            r0 = move-exception
            r14 = r0
            goto Laa
        L30:
            r0 = move-exception
            r14 = r0
            goto Laf
        L34:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3c:
            kotlin.ResultKt.b(r0)
            com.woolworths.shop.checkout.UpdateFulfilmentWindowMutation r6 = new com.woolworths.shop.checkout.UpdateFulfilmentWindowMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            if (r16 == 0) goto L48
            au.com.woolworths.shop.graphql.type.FulfilmentWindowSlotSelectionOptionId r0 = au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionIdKt.a(r16)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            goto L49
        L48:
            r0 = r5
        L49:
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            boolean r0 = r13.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            boolean r11 = r13.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            boolean r12 = r13.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            r7 = r14
            r8 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloClient r14 = r13.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            r14.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloCall r15 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            r15.<init>(r14, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            r13.b(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            r1.p = r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            r1.s = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Object r0 = r15.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 != r2) goto L7e
            return r2
        L7e:
            r14 = r13
        L7f:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            r14.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            boolean r14 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            java.util.List r15 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            if (r14 != 0) goto La4
            com.apollographql.apollo.api.Operation$Data r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.shop.checkout.UpdateFulfilmentWindowMutation$Data r14 = (com.woolworths.shop.checkout.UpdateFulfilmentWindowMutation.Data) r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.shop.checkout.UpdateFulfilmentWindowMutation$UpdateFulfilmentWindow r14 = r14.f21916a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            if (r14 == 0) goto L98
            com.woolworths.shop.checkout.fragment.CheckoutContent r5 = r14.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
        L98:
            if (r5 == 0) goto L9f
            au.com.woolworths.shop.checkout.domain.model.Checkout r14 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            return r14
        L9f:
            au.com.woolworths.android.onesite.network.GraphQlException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            throw r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
        La4:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r14 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            r14.<init>(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
            throw r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L30
        Laa:
            au.com.woolworths.android.onesite.network.ServerErrorException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r14)
            throw r14
        Laf:
            java.lang.Exception r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r14)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.o(int, java.lang.String, au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateNominatedRecipient$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateNominatedRecipient$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateNominatedRecipient$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateNominatedRecipient$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateNominatedRecipient$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r8 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L6a
        L29:
            r8 = move-exception
            goto L97
        L2b:
            r8 = move-exception
            goto L9c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdateNominatedRecipientMutation r2 = new com.woolworths.shop.checkout.UpdateNominatedRecipientMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r4 = r7.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r5 = r7.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r6 = r7.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r2.<init>(r8, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r7.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.p = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.s = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r9 != r1) goto L69
            return r1
        L69:
            r8 = r7
        L6a:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r8 = r9.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.util.List r0 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 != 0) goto L91
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdateNominatedRecipientMutation$Data r8 = (com.woolworths.shop.checkout.UpdateNominatedRecipientMutation.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdateNominatedRecipientMutation$UpdateNominatedRecipient r8 = r8.f21919a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 == 0) goto L84
            com.woolworths.shop.checkout.fragment.CheckoutContent r8 = r8.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L85
        L84:
            r8 = 0
        L85:
            if (r8 == 0) goto L8c
            au.com.woolworths.shop.checkout.domain.model.Checkout r8 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            return r8
        L8c:
            au.com.woolworths.android.onesite.network.GraphQlException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L91:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r8 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L97:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        L9c:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.p(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePackagingPreferences$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePackagingPreferences$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePackagingPreferences$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePackagingPreferences$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePackagingPreferences$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r8 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L6a
        L29:
            r8 = move-exception
            goto L97
        L2b:
            r8 = move-exception
            goto L9c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePackagingPreferencesMutation r2 = new com.woolworths.shop.checkout.UpdatePackagingPreferencesMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r4 = r7.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r5 = r7.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r6 = r7.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r2.<init>(r8, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r7.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.p = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.s = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r9 != r1) goto L69
            return r1
        L69:
            r8 = r7
        L6a:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r8 = r9.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.util.List r0 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 != 0) goto L91
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePackagingPreferencesMutation$Data r8 = (com.woolworths.shop.checkout.UpdatePackagingPreferencesMutation.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePackagingPreferencesMutation$UpdatePackagingPreferences r8 = r8.f21922a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 == 0) goto L84
            com.woolworths.shop.checkout.fragment.CheckoutContent r8 = r8.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L85
        L84:
            r8 = 0
        L85:
            if (r8 == 0) goto L8c
            au.com.woolworths.shop.checkout.domain.model.Checkout r8 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            return r8
        L8c:
            au.com.woolworths.android.onesite.network.GraphQlException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L91:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r8 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L97:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        L9c:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.q(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(au.com.woolworths.shop.checkout.domain.model.PreferenceId r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r13 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceInstruction$1
            if (r0 == 0) goto L13
            r0 = r13
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceInstruction$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceInstruction$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceInstruction$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceInstruction$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r11 = r0.p
            kotlin.ResultKt.b(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            goto L78
        L29:
            r0 = move-exception
            r11 = r0
            goto La5
        L2d:
            r0 = move-exception
            r11 = r0
            goto Laa
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            kotlin.ResultKt.b(r13)
            com.apollographql.apollo.ApolloClient r13 = r10.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.UpdatePreferenceInstructionMutation r4 = new com.woolworths.shop.checkout.UpdatePreferenceInstructionMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.graphql.type.CheckoutDeliveryPreferenceId r11 = au.com.woolworths.shop.checkout.domain.model.PreferenceIdKt.a(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Optional$Present r5 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r5.<init>(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r11 = r10.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r8 = r10.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r9 = r10.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r13.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.ApolloCall r11 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r11.<init>(r13, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r10.b(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r0.p = r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r0.s = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Object r13 = r11.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r13 != r1) goto L77
            return r1
        L77:
            r11 = r10
        L78:
            com.apollographql.apollo.api.ApolloResponse r13 = (com.apollographql.apollo.api.ApolloResponse) r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r11.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r11 = r13.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            java.util.List r12 = r13.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r11 != 0) goto L9f
            com.apollographql.apollo.api.Operation$Data r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.UpdatePreferenceInstructionMutation$Data r11 = (com.woolworths.shop.checkout.UpdatePreferenceInstructionMutation.Data) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.UpdatePreferenceInstructionMutation$UpdatePreferenceInstruction r11 = r11.f21925a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            if (r11 == 0) goto L92
            com.woolworths.shop.checkout.fragment.CheckoutContent r11 = r11.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            goto L93
        L92:
            r11 = 0
        L93:
            if (r11 == 0) goto L9a
            au.com.woolworths.shop.checkout.domain.model.Checkout r11 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            return r11
        L9a:
            au.com.woolworths.android.onesite.network.GraphQlException r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            throw r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
        L9f:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r11 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            r11.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
            throw r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2d
        La5:
            au.com.woolworths.android.onesite.network.ServerErrorException r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r11)
            throw r11
        Laa:
            java.lang.Exception r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.r(au.com.woolworths.shop.checkout.domain.model.PreferenceId, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(boolean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceLeaveUnattended$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceLeaveUnattended$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceLeaveUnattended$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceLeaveUnattended$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceLeaveUnattended$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r8 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L6a
        L29:
            r8 = move-exception
            goto L97
        L2b:
            r8 = move-exception
            goto L9c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePreferenceLeaveUnattendedMutation r2 = new com.woolworths.shop.checkout.UpdatePreferenceLeaveUnattendedMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r4 = r7.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r5 = r7.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r6 = r7.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r2.<init>(r8, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r7.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.p = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.s = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r9 != r1) goto L69
            return r1
        L69:
            r8 = r7
        L6a:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r8 = r9.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.util.List r0 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 != 0) goto L91
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePreferenceLeaveUnattendedMutation$Data r8 = (com.woolworths.shop.checkout.UpdatePreferenceLeaveUnattendedMutation.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePreferenceLeaveUnattendedMutation$UpdatePreferenceLeaveUnattended r8 = r8.f21928a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 == 0) goto L84
            com.woolworths.shop.checkout.fragment.CheckoutContent r8 = r8.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L85
        L84:
            r8 = 0
        L85:
            if (r8 == 0) goto L8c
            au.com.woolworths.shop.checkout.domain.model.Checkout r8 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            return r8
        L8c:
            au.com.woolworths.android.onesite.network.GraphQlException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L91:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r8 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L97:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        L9c:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.s(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(boolean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceSelfIsolation$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceSelfIsolation$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceSelfIsolation$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceSelfIsolation$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updatePreferenceSelfIsolation$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r8 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L6a
        L29:
            r8 = move-exception
            goto L97
        L2b:
            r8 = move-exception
            goto L9c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePreferenceSelfIsolationMutation r2 = new com.woolworths.shop.checkout.UpdatePreferenceSelfIsolationMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r4 = r7.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r5 = r7.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r6 = r7.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r2.<init>(r8, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r7.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.p = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.s = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r9 != r1) goto L69
            return r1
        L69:
            r8 = r7
        L6a:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r8 = r9.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            java.util.List r0 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 != 0) goto L91
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePreferenceSelfIsolationMutation$Data r8 = (com.woolworths.shop.checkout.UpdatePreferenceSelfIsolationMutation.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.UpdatePreferenceSelfIsolationMutation$UpdatePreferenceSelfIsolation r8 = r8.f21931a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r8 == 0) goto L84
            com.woolworths.shop.checkout.fragment.CheckoutContent r8 = r8.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L85
        L84:
            r8 = 0
        L85:
            if (r8 == 0) goto L8c
            au.com.woolworths.shop.checkout.domain.model.Checkout r8 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            return r8
        L8c:
            au.com.woolworths.android.onesite.network.GraphQlException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L91:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r8 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            r8.<init>(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2b
        L97:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        L9c:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.t(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(java.lang.String r14, double r15, java.lang.String r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateProductInstruction$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateProductInstruction$1 r1 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateProductInstruction$1) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.t = r2
            goto L1a
        L15:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateProductInstruction$1 r1 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateProductInstruction$1
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.t
            r4 = 1
            if (r3 == 0) goto L3d
            if (r3 != r4) goto L35
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r14 = r1.q
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r1 = r1.p
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            goto L79
        L2d:
            r0 = move-exception
            r14 = r0
            goto Lac
        L31:
            r0 = move-exception
            r14 = r0
            goto Lb1
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3d:
            kotlin.ResultKt.b(r0)
            com.woolworths.shop.checkout.UpdateProductInstructionMutation r5 = new com.woolworths.shop.checkout.UpdateProductInstructionMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            boolean r0 = r13.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            boolean r11 = r13.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            boolean r12 = r13.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r6 = r14
            r7 = r15
            r9 = r17
            r5.<init>(r6, r7, r9, r10, r11, r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            com.apollographql.apollo.ApolloClient r14 = r13.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r14.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r0.<init>(r14, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r13.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r1.p = r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r1.q = r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r1.t = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            java.lang.Object r0 = r0.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            if (r0 != r2) goto L77
            return r2
        L77:
            r14 = r13
            r1 = r14
        L79:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r1.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            boolean r1 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            java.util.List r2 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            if (r1 != 0) goto La6
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            com.woolworths.shop.checkout.UpdateProductInstructionMutation$Data r0 = (com.woolworths.shop.checkout.UpdateProductInstructionMutation.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            com.woolworths.shop.checkout.UpdateProductInstructionMutation$UpdateProductInstruction r0 = r0.f21934a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            if (r0 == 0) goto L93
            com.woolworths.shop.checkout.fragment.CheckoutContent r0 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            goto L94
        L93:
            r0 = 0
        L94:
            if (r0 == 0) goto La1
            au.com.woolworths.shop.checkout.domain.model.Checkout r0 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r14.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            return r0
        La1:
            au.com.woolworths.android.onesite.network.GraphQlException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            throw r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
        La6:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r14 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            r14.<init>(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
            throw r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L31
        Lac:
            au.com.woolworths.android.onesite.network.ServerErrorException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r14)
            throw r14
        Lb1:
            java.lang.Exception r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r14)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.u(java.lang.String, double, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(java.util.ArrayList r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateSubstitutions$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateSubstitutions$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateSubstitutions$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateSubstitutions$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository$updateSubstitutions$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r8 = r0.q
            au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository r0 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L71
        L2b:
            r8 = move-exception
            goto La4
        L2e:
            r8 = move-exception
            goto La9
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f10543a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.UpdateSubstitutionsMutation r2 = new com.woolworths.shop.checkout.UpdateSubstitutionsMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r4 = r7.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r4 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r5 = r7.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r6 = r7.c()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.<init>(r8, r4, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r7.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.p = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.q = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.t = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r8 = r7
            r0 = r8
        L71:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r0 = r9.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r1 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != 0) goto L9e
            com.apollographql.apollo.api.Operation$Data r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.UpdateSubstitutionsMutation$Data r9 = (com.woolworths.shop.checkout.UpdateSubstitutionsMutation.Data) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.UpdateSubstitutionsMutation$UpdateSubstitutions r9 = r9.f21941a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r9 == 0) goto L8b
            com.woolworths.shop.checkout.fragment.CheckoutContent r9 = r9.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L8c
        L8b:
            r9 = 0
        L8c:
            if (r9 == 0) goto L99
            au.com.woolworths.shop.checkout.domain.model.Checkout r9 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentExtKt.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            return r9
        L99:
            au.com.woolworths.android.onesite.network.GraphQlException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        L9e:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r8 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8.<init>(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        La4:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        La9:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository.v(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
