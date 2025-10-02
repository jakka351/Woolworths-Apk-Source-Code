package au.com.woolworths.shop.checkout.data.source;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/CheckoutSummaryRepository;", "", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutSummaryRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10545a;
    public final FeatureToggleManager b;
    public final ShopAppFlavorInteractor c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/CheckoutSummaryRepository$Companion;", "", "", "API_FEATURES", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CheckoutSummaryRepository(ApolloClient apolloClient, FeatureToggleManager featureManager, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureManager, "featureManager");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.f10545a = apolloClient;
        this.b = featureManager;
        this.c = shopAppFlavorInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$addPromotionCode$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$addPromotionCode$1 r2 = (au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$addPromotionCode$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$addPromotionCode$1 r2 = new au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$addPromotionCode$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L8a
        L2b:
            r0 = move-exception
            goto Lb4
        L2e:
            r0 = move-exception
            goto Lb9
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L39:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.f10545a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.AddPromotionCodeMutation r6 = new com.woolworths.shop.checkout.AddPromotionCodeMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r4 = r1.h()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r9 = r1.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r10 = r1.k()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r11 = r1.j()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r12 = r1.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r13 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r14 = r1.i()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r15 = r1.l()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r7 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r6 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r5]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.checkout.CheckoutFeature r7 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8 = 0
            r6[r8] = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r4, r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != r3) goto L8a
            return r3
        L8a:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r3 = r0.d
            if (r2 != 0) goto Lae
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.AddPromotionCodeMutation$Data r0 = (com.woolworths.shop.checkout.AddPromotionCodeMutation.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.AddPromotionCodeMutation$AddPromotionCode r0 = r0.f21801a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 == 0) goto La5
            com.woolworths.shop.checkout.fragment.CheckoutContentSummary r0 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.checkout.domain.model.Checkout r0 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentSummaryExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto La6
        La5:
            r0 = 0
        La6:
            if (r0 == 0) goto La9
            return r0
        La9:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Lae:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r0 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Lb4:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lb9:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutCredit$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutCredit$1 r2 = (au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutCredit$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutCredit$1 r2 = new au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutCredit$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            goto L80
        L2b:
            r0 = move-exception
            goto L9c
        L2d:
            r0 = move-exception
            goto La1
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.f10545a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r12 = r1.h()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r11 = r1.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r8 = r1.k()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r9 = r1.j()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r10 = r1.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r13 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r14 = r1.i()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r15 = r1.l()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.ApplyCheckoutCreditMutation r6 = new com.woolworths.shop.checkout.ApplyCheckoutCreditMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r7 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r6 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r5]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.CheckoutFeature r7 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r8 = 0
            r6[r8] = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r4, r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r0 != r3) goto L80
            return r3
        L80:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Operation$Data r2 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.ApplyCheckoutCreditMutation$Data r2 = (com.woolworths.shop.checkout.ApplyCheckoutCreditMutation.Data) r2     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.ApplyCheckoutCreditMutation$ApplyCheckoutCredit r2 = r2.f21805a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutCredit r2 = au.com.woolworths.shop.checkout.data.mappers.ApplyCheckoutCreditMutationApplyCheckoutCreditExtKt.a(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r3 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r3 != 0) goto L95
            return r2
        L95:
            java.util.List r0 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.network.GraphQlException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
        L9c:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        La1:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository.b(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Exception {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            boolean r2 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutPromoCode$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutPromoCode$1 r2 = (au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutPromoCode$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutPromoCode$1 r2 = new au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$applyCheckoutPromoCode$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            goto L82
        L2b:
            r0 = move-exception
            goto L9e
        L2d:
            r0 = move-exception
            goto La3
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.f10545a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r13 = r1.h()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r12 = r1.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r9 = r1.k()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r10 = r1.j()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r11 = r1.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r14 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r15 = r1.i()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r16 = r1.l()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.ApplyCheckoutPromoCodeMutation r6 = new com.woolworths.shop.checkout.ApplyCheckoutPromoCodeMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r8 = r18
            r7 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r6 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r5]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.CheckoutFeature r7 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r8 = 0
            r6[r8] = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r4, r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r0 != r3) goto L82
            return r3
        L82:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Operation$Data r2 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.ApplyCheckoutPromoCodeMutation$Data r2 = (com.woolworths.shop.checkout.ApplyCheckoutPromoCodeMutation.Data) r2     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.ApplyCheckoutPromoCodeMutation$ApplyCheckoutPromoCode r2 = r2.f21813a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCode r2 = au.com.woolworths.shop.checkout.data.mappers.ApplyCheckoutPromoCodeMutationApplyCheckoutPromoCodeExtKt.a(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r3 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r3 != 0) goto L97
            return r2
        L97:
            java.util.List r0 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.network.GraphQlException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
        L9e:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        La3:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository.c(boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean d() {
        return this.b.c(CheckoutFeature.k);
    }

    public final boolean e() {
        return k() || j() || d();
    }

    public final boolean f() {
        return this.b.c(CheckoutFeature.i) && e();
    }

    public final boolean g() {
        BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.c0;
        FeatureToggleManager featureToggleManager = this.b;
        return (featureToggleManager.c(baseShopAppFeature) || this.c.b(Region.j)) && featureToggleManager.c(CheckoutFeature.d);
    }

    public final boolean h() {
        return this.b.c(CheckoutFeature.n);
    }

    public final boolean i() {
        BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.c0;
        FeatureToggleManager featureToggleManager = this.b;
        return (featureToggleManager.c(baseShopAppFeature) || this.c.b(Region.j)) && featureToggleManager.c(BaseShopAppFeature.i);
    }

    public final boolean j() {
        return this.b.c(CheckoutFeature.h);
    }

    public final boolean k() {
        return this.b.c(CheckoutFeature.j);
    }

    public final boolean l() {
        return this.b.c(CheckoutFeature.m);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.Integer r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Exception {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$payWithRewardsDollar$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$payWithRewardsDollar$1 r2 = (au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$payWithRewardsDollar$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$payWithRewardsDollar$1 r2 = new au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$payWithRewardsDollar$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L90
        L2b:
            r0 = move-exception
            goto Lba
        L2e:
            r0 = move-exception
            goto Lbf
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L39:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.f10545a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.PayWithRewardsDollarMutation r6 = new com.woolworths.shop.checkout.PayWithRewardsDollarMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r18)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r4 = r1.h()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r9 = r1.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r10 = r1.k()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r11 = r1.j()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r12 = r1.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r13 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r14 = r1.i()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r15 = r1.g()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r16 = r1.l()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r6 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r5]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.checkout.CheckoutFeature r7 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r8 = 0
            r6[r8] = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r4, r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != r3) goto L90
            return r3
        L90:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r3 = r0.d
            if (r2 != 0) goto Lb4
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.PayWithRewardsDollarMutation$Data r0 = (com.woolworths.shop.checkout.PayWithRewardsDollarMutation.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.PayWithRewardsDollarMutation$PayWithRewardsDollar r0 = r0.f21873a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 == 0) goto Lab
            com.woolworths.shop.checkout.fragment.CheckoutContentSummary r0 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.checkout.domain.model.Checkout r0 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentSummaryExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto Lac
        Lab:
            r0 = 0
        Lac:
            if (r0 == 0) goto Laf
            return r0
        Laf:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Lb4:
            au.com.woolworths.shop.checkout.data.source.MutationErrorException r0 = new au.com.woolworths.shop.checkout.data.source.MutationErrorException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
        Lba:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lbf:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository.m(java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Exception {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r1.b
            boolean r3 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$queryCheckoutSummary$1
            if (r3 == 0) goto L19
            r3 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$queryCheckoutSummary$1 r3 = (au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$queryCheckoutSummary$1) r3
            int r4 = r3.r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.r = r4
            goto L1e
        L19:
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$queryCheckoutSummary$1 r3 = new au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$queryCheckoutSummary$1
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.r
            r6 = 1
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto L9a
        L2d:
            r0 = move-exception
            goto Lc3
        L30:
            r0 = move-exception
            goto Lc8
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.f10545a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.shop.checkout.CheckoutSummaryQuery r7 = new com.woolworths.shop.checkout.CheckoutSummaryQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r5 = r1.h()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r10 = r1.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r11 = r1.k()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r12 = r1.j()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r13 = r1.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r14 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r15 = r1.i()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r16 = r1.g()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r17 = r1.l()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.base.shopapp.BaseShopAppFeature r5 = au.com.woolworths.base.shopapp.BaseShopAppFeature.X     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r5 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r5.<init>(r0, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r0 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r6]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.checkout.CheckoutFeature r7 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r8 = 0
            r0[r8] = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r5, r2, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            r3.r = r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.lang.Object r0 = r5.b(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 != r4) goto L9a
            return r4
        L9a:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            boolean r2 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            java.util.List r3 = r0.d
            if (r2 != 0) goto Lbe
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.shop.checkout.CheckoutSummaryQuery$Data r0 = (com.woolworths.shop.checkout.CheckoutSummaryQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            com.woolworths.shop.checkout.CheckoutSummaryQuery$CheckoutSummary r0 = r0.f21827a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            if (r0 == 0) goto Lb5
            com.woolworths.shop.checkout.fragment.CheckoutContentSummary r0 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            au.com.woolworths.shop.checkout.domain.model.Checkout r0 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentSummaryExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            goto Lb6
        Lb5:
            r0 = 0
        Lb6:
            if (r0 == 0) goto Lb9
            return r0
        Lb9:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Lbe:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2d com.apollographql.apollo.exception.ApolloException -> L30
        Lc3:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lc8:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository.n(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.util.List r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutCredits$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutCredits$1 r2 = (au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutCredits$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutCredits$1 r2 = new au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutCredits$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            goto L80
        L2b:
            r0 = move-exception
            goto L9c
        L2d:
            r0 = move-exception
            goto La1
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.f10545a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r12 = r1.h()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r11 = r1.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r8 = r1.k()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r9 = r1.j()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r10 = r1.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r13 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r14 = r1.i()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r15 = r1.l()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.RemoveCheckoutCreditMutation r6 = new com.woolworths.shop.checkout.RemoveCheckoutCreditMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r7 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r6 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r5]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.CheckoutFeature r7 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r8 = 0
            r6[r8] = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r4, r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r0 != r3) goto L80
            return r3
        L80:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Operation$Data r2 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.RemoveCheckoutCreditMutation$Data r2 = (com.woolworths.shop.checkout.RemoveCheckoutCreditMutation.Data) r2     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.RemoveCheckoutCreditMutation$RemoveCheckoutCredit r2 = r2.f21877a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.domain.model.RemoveCheckoutCredit r2 = au.com.woolworths.shop.checkout.data.mappers.RemoveCheckoutCreditMutationRemoveCheckoutCreditExtKt.a(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r3 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r3 != 0) goto L95
            return r2
        L95:
            java.util.List r0 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.network.GraphQlException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            throw r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
        L9c:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        La1:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository.o(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.util.List r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutPromoCode$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutPromoCode$1 r2 = (au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutPromoCode$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutPromoCode$1 r2 = new au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removeCheckoutPromoCode$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            goto L80
        L2b:
            r0 = move-exception
            goto L8f
        L2d:
            r0 = move-exception
            goto L94
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.f10545a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r12 = r1.h()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r11 = r1.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r8 = r1.k()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r9 = r1.j()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r10 = r1.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r13 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r14 = r1.i()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r15 = r1.l()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.RemoveCheckoutPromoCodeMutation r6 = new com.woolworths.shop.checkout.RemoveCheckoutPromoCodeMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r7 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r4.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r1.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r6 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r5]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.CheckoutFeature r7 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r8 = 0
            r6[r8] = r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r4, r0, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Object r0 = r4.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r0 != r3) goto L80
            return r3
        L80:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.RemoveCheckoutPromoCodeMutation$Data r0 = (com.woolworths.shop.checkout.RemoveCheckoutPromoCodeMutation.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            com.woolworths.shop.checkout.RemoveCheckoutPromoCodeMutation$RemoveCheckoutPromoCode r0 = r0.f21881a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            au.com.woolworths.shop.checkout.domain.model.RemoveCheckoutPromoCode r0 = au.com.woolworths.shop.checkout.data.mappers.RemoveCheckoutPromoCodeMutationRemoveCheckoutPromoCodeExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            return r0
        L8f:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        L94:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository.p(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Exception {
        /*
            r13 = this;
            boolean r0 = r14 instanceof au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removePromotionCode$1
            if (r0 == 0) goto L13
            r0 = r14
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removePromotionCode$1 r0 = (au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removePromotionCode$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removePromotionCode$1 r0 = new au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository$removePromotionCode$1
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.b(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L86
        L27:
            r0 = move-exception
            r14 = r0
            goto La4
        L2b:
            r0 = move-exception
            r14 = r0
            goto La9
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L37:
            kotlin.ResultKt.b(r14)
            com.apollographql.apollo.ApolloClient r14 = r13.f10545a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.RemovePromotionCodeMutation r4 = new com.woolworths.shop.checkout.RemovePromotionCodeMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r2 = r13.h()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional r5 = com.apollographql.apollo.api.Optional.Companion.a(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r6 = r13.e()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r7 = r13.k()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r8 = r13.j()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r9 = r13.d()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r10 = r13.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r11 = r13.i()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            boolean r12 = r13.l()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r14.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r2 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r2.<init>(r14, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r14 = r13.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r4 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r3]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.shop.checkout.CheckoutFeature r5 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r6 = 0
            r4[r6] = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r2, r14, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r14 = r2.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r14 != r1) goto L86
            return r1
        L86:
            com.apollographql.apollo.api.ApolloResponse r14 = (com.apollographql.apollo.api.ApolloResponse) r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.RemovePromotionCodeMutation$Data r0 = (com.woolworths.shop.checkout.RemovePromotionCodeMutation.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.checkout.RemovePromotionCodeMutation$RemovePromotionCode r0 = r0.f21890a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r0 == 0) goto L99
            com.woolworths.shop.checkout.fragment.CheckoutContentSummary r0 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.shop.checkout.domain.model.Checkout r0 = au.com.woolworths.shop.checkout.data.mappers.CheckoutContentSummaryExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L9a
        L99:
            r0 = 0
        L9a:
            if (r0 == 0) goto L9d
            return r0
        L9d:
            java.util.List r14 = r14.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.android.onesite.network.ServerErrorException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
        La4:
            au.com.woolworths.android.onesite.network.ServerErrorException r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r14)
            throw r14
        La9:
            java.lang.Exception r14 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r14)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository.q(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
