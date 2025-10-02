package au.com.woolworths.shop.checkout.data.source;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/OrderConfirmationRepository;", "", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OrderConfirmationRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10546a;
    public final FeatureToggleManager b;
    public final SupportedLinksHelper c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/OrderConfirmationRepository$Companion;", "", "", "API_FEATURES", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public OrderConfirmationRepository(ApolloClient apolloClient, FeatureToggleManager featureManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureManager, "featureManager");
        this.f10546a = apolloClient;
        this.b = featureManager;
        this.c = supportedLinksHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r13, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Exception {
        /*
            r12 = this;
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r12.b
            boolean r1 = r15 instanceof au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository$fetchOrderConfirmation$1
            if (r1 == 0) goto L15
            r1 = r15
            au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository$fetchOrderConfirmation$1 r1 = (au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository$fetchOrderConfirmation$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository$fetchOrderConfirmation$1 r1 = new au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository$fetchOrderConfirmation$1
            r1.<init>(r12, r15)
        L1a:
            java.lang.Object r15 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 != r5) goto L32
            kotlin.ResultKt.b(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            goto L82
        L2a:
            r0 = move-exception
            r13 = r0
            goto La7
        L2e:
            r0 = move-exception
            r13 = r0
            goto Lac
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            kotlin.ResultKt.b(r15)
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r15 = r12.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r15 = r15.a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloClient r3 = r12.f10546a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.OrderConfirmationQuery r6 = new com.woolworths.shop.checkout.OrderConfirmationQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            if (r14 == 0) goto L4e
            au.com.woolworths.shop.graphql.type.ShoppingModeType r14 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            goto L4f
        L4e:
            r14 = r4
        L4f:
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r14 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.q     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r10 = r0.c(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.checkout.CheckoutFeature r14 = au.com.woolworths.shop.checkout.CheckoutFeature.o     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r11 = r0.c(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r3.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r13 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r13.<init>(r3, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.Feature[] r14 = new au.com.woolworths.android.onesite.featuretoggles.Feature[r5]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.checkout.CheckoutFeature r15 = au.com.woolworths.shop.checkout.CheckoutFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r3 = 0
            r14[r3] = r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.graphql.ApolloHeaderExtKt.a(r13, r0, r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            r1.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r15 = r13.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            if (r15 != r2) goto L82
            return r2
        L82:
            com.apollographql.apollo.api.ApolloResponse r15 = (com.apollographql.apollo.api.ApolloResponse) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r13 = r15.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.List r14 = r15.d
            if (r13 != 0) goto La2
            com.apollographql.apollo.api.Operation$Data r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.OrderConfirmationQuery$Data r13 = (com.woolworths.shop.checkout.OrderConfirmationQuery.Data) r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.shop.checkout.OrderConfirmationQuery$OrderConfirmation r13 = r13.f21848a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            if (r13 == 0) goto L9a
            au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmation r4 = au.com.woolworths.shop.checkout.data.mappers.OrderConfirmationQueryKt.a(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
        L9a:
            if (r4 == 0) goto L9d
            return r4
        L9d:
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            throw r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
        La2:
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
            throw r13     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2e
        La7:
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r13)
            throw r13
        Lac:
            java.lang.Exception r13 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository.a(java.lang.String, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
