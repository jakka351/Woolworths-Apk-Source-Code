package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.foundation.shop.nhp.datasource.EdrOfferBooster;
import au.com.woolworths.foundation.shop.nhp.datasource.EdrOfferBoosterImpl;
import com.apollographql.apollo.ApolloClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class NhpModule_ProvideEdrOfferBoosterFactory implements Factory<EdrOfferBooster> {
    public static EdrOfferBoosterImpl a(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        return new EdrOfferBoosterImpl(apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
