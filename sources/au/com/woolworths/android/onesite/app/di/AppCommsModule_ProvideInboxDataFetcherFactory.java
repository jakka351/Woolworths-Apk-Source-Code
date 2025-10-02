package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.foundation.appcomms.inbox.datasource.common.InboxDataFetcher;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher;
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
public final class AppCommsModule_ProvideInboxDataFetcherFactory implements Factory<InboxDataFetcher> {
    public static ShopInboxDataFetcher a(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        return new ShopInboxDataFetcher(apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
