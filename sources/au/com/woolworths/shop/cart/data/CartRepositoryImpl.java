package au.com.woolworths.shop.cart.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.shop.cart.ShopCartFeature;
import au.com.woolworths.shop.cart.domain.repository.CartRepository;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/CartRepositoryImpl;", "Lau/com/woolworths/shop/cart/domain/repository/CartRepository;", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CartRepositoryImpl implements CartRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10304a;
    public final FeatureToggleManager b;
    public final ShopAppFlavorInteractor c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/data/CartRepositoryImpl$Companion;", "", "", "KEY_CART_MORE_MENU_COACH_MARK_SHOWN", "Ljava/lang/String;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CartRepositoryImpl(ApolloClient apolloClient, FeatureToggleManager featureManager, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureManager, "featureManager");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.f10304a = apolloClient;
        this.b = featureManager;
        this.c = shopAppFlavorInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            r11 = this;
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r11.b
            boolean r1 = r12 instanceof au.com.woolworths.shop.cart.data.CartRepositoryImpl$clearCart$1
            if (r1 == 0) goto L15
            r1 = r12
            au.com.woolworths.shop.cart.data.CartRepositoryImpl$clearCart$1 r1 = (au.com.woolworths.shop.cart.data.CartRepositoryImpl$clearCart$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.shop.cart.data.CartRepositoryImpl$clearCart$1 r1 = new au.com.woolworths.shop.cart.data.CartRepositoryImpl$clearCart$1
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.ResultKt.b(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L6e
        L29:
            r0 = move-exception
            r12 = r0
            goto L83
        L2c:
            r0 = move-exception
            r12 = r0
            goto L88
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            kotlin.ResultKt.b(r12)
            com.apollographql.apollo.ApolloClient r12 = r11.f10304a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.cart.ClearCartMutation r5 = new com.woolworths.shop.cart.ClearCartMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.ShopCartFeature r3 = au.com.woolworths.shop.cart.ShopCartFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r6 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.base.shopapp.BaseShopAppFeature r3 = au.com.woolworths.base.shopapp.BaseShopAppFeature.p     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r7 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.ShopCartFeature r3 = au.com.woolworths.shop.cart.ShopCartFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r8 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r9 = r11.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.ShopCartFeature r3 = au.com.woolworths.shop.cart.ShopCartFeature.i     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r10 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r12.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r0.<init>(r12, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r12 = r0.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r12 != r2) goto L6e
            return r2
        L6e:
            com.apollographql.apollo.api.ApolloResponse r12 = (com.apollographql.apollo.api.ApolloResponse) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Operation$Data r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.cart.ClearCartMutation$Data r12 = (com.woolworths.shop.cart.ClearCartMutation.Data) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.cart.ClearCartMutation$ClearCart r12 = r12.getF21529a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.data.common.fragment.Cart r12 = r12.getB()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.foundation.shop.cart.data.model.Cart r12 = au.com.woolworths.foundation.shop.cart.data.mapper.CartExtKt.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            return r12
        L83:
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r12)
            throw r12
        L88:
            java.lang.Exception r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.CartRepositoryImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            r11 = this;
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r11.b
            boolean r1 = r12 instanceof au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCart$1
            if (r1 == 0) goto L15
            r1 = r12
            au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCart$1 r1 = (au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCart$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCart$1 r1 = new au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCart$1
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.ResultKt.b(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L6e
        L29:
            r0 = move-exception
            r12 = r0
            goto L83
        L2c:
            r0 = move-exception
            r12 = r0
            goto L88
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            kotlin.ResultKt.b(r12)
            com.apollographql.apollo.ApolloClient r12 = r11.f10304a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.data.CartQuery r5 = new au.com.woolworths.shop.cart.data.CartQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.ShopCartFeature r3 = au.com.woolworths.shop.cart.ShopCartFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r6 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.base.shopapp.BaseShopAppFeature r3 = au.com.woolworths.base.shopapp.BaseShopAppFeature.p     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r7 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.ShopCartFeature r3 = au.com.woolworths.shop.cart.ShopCartFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r8 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r9 = r11.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.ShopCartFeature r3 = au.com.woolworths.shop.cart.ShopCartFeature.i     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r10 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r12.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r0.<init>(r12, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r12 = r0.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r12 != r2) goto L6e
            return r2
        L6e:
            com.apollographql.apollo.api.ApolloResponse r12 = (com.apollographql.apollo.api.ApolloResponse) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Operation$Data r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.data.CartQuery$Data r12 = (au.com.woolworths.shop.cart.data.CartQuery.Data) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.data.CartQuery$Cart r12 = r12.getF10303a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.cart.data.common.fragment.Cart r12 = r12.getB()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.foundation.shop.cart.data.model.Cart r12 = au.com.woolworths.foundation.shop.cart.data.mapper.CartExtKt.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            return r12
        L83:
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r12)
            throw r12
        L88:
            java.lang.Exception r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.CartRepositoryImpl.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartFooter$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartFooter$1 r0 = (au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartFooter$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartFooter$1 r0 = new au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartFooter$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L52
        L27:
            r6 = move-exception
            goto L74
        L29:
            r6 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r5.f10304a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.CartFooterQuery r2 = new com.woolworths.shop.cart.CartFooterQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r4 = r5.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r4.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 != r1) goto L52
            return r1
        L52:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.CartFooterQuery$Data r0 = (com.woolworths.shop.cart.CartFooterQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.CartFooterQuery$Cart r0 = r0.getF21523a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.CartFooterQuery$Footer r0 = r0.getF21522a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r1 = r6.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r1 != 0) goto L6d
            au.com.woolworths.foundation.shop.cart.data.model.CartFooterData r6 = au.com.woolworths.shop.cart.data.mapper.CartFooterQueryFooterExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r6
        L6d:
            java.util.List r6 = r6.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.GraphQlException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L74:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L79:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.CartRepositoryImpl.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartInfo$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartInfo$1 r0 = (au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartInfo$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartInfo$1 r0 = new au.com.woolworths.shop.cart.data.CartRepositoryImpl$getCartInfo$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4e
        L27:
            r6 = move-exception
            goto L6c
        L29:
            r6 = move-exception
            goto L71
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r5.f10304a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.CartInfoQuery r2 = new com.woolworths.shop.cart.CartInfoQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r4.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.CartInfoQuery$Data r0 = (com.woolworths.shop.cart.CartInfoQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.CartInfoQuery$CartInfo r0 = r0.getF21526a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r0 == 0) goto L61
            au.com.woolworths.shop.cart.domain.model.CartInfo r0 = au.com.woolworths.shop.cart.data.mapper.CartInfoQueryCartInfoExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L62
        L61:
            r0 = 0
        L62:
            if (r0 == 0) goto L65
            return r0
        L65:
            java.util.List r6 = r6.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L6c:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L71:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.CartRepositoryImpl.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean e() {
        BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.c0;
        FeatureToggleManager featureToggleManager = this.b;
        return (featureToggleManager.c(baseShopAppFeature) || this.c.b(Region.j)) && featureToggleManager.c(ShopCartFeature.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(au.com.woolworths.shop.cart.domain.model.UpdateCartProductQuantityInput r15, boolean r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.CartRepositoryImpl.f(au.com.woolworths.shop.cart.domain.model.UpdateCartProductQuantityInput, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
