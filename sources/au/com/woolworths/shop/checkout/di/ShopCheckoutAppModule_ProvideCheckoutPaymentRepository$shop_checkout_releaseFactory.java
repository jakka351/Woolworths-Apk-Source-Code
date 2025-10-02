package au.com.woolworths.shop.checkout.di;

import au.com.woolworths.shop.checkout.data.mappers.PaymentResponseMapper;
import au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository;
import au.com.woolworths.shop.checkout.domain.CheckoutPaymentRepository;
import com.apollographql.apollo.ApolloClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopCheckoutAppModule_ProvideCheckoutPaymentRepository$shop_checkout_releaseFactory implements Factory<CheckoutPaymentRepository> {
    public static CheckoutPaymentDataRepository a(ShopCheckoutAppModule shopCheckoutAppModule, ApolloClient apolloClient, PaymentResponseMapper paymentResponseMapper) {
        shopCheckoutAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        return new CheckoutPaymentDataRepository(apolloClient, paymentResponseMapper);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
