package au.com.woolworths.shop.receipt.details.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsRepository;
import au.com.woolworths.shop.receipt.details.ShopReceiptDetailsRepository;
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
public final class ShopReceiptDetailsAppModule_ProvidesEReceiptDetailsRepository$receipts_releaseFactory implements Factory<EReceiptDetailsRepository> {
    public static ShopReceiptDetailsRepository a(ShopReceiptDetailsAppModule shopReceiptDetailsAppModule, ApolloClient apolloClient, DispatcherProvider dispatcher) {
        shopReceiptDetailsAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcher, "dispatcher");
        return new ShopReceiptDetailsRepository(dispatcher, apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
