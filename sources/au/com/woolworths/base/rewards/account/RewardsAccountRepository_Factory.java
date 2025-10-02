package au.com.woolworths.base.rewards.account;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumSelector;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.base.rewards.account.network.RewardsAccountApi;
import com.apollographql.apollo.ApolloClient;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsAccountRepository_Factory implements Factory<RewardsAccountRepository> {
    private final Provider<RewardsAccountApi> apiProvider;
    private final Provider<ApolloClient> apolloClientProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<SharedPreferences> encryptedPrefsProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<SharedPreferences> prefsProvider;
    private final Provider<TealiumSelector> tealiumSelectorProvider;

    public static RewardsAccountRepository newInstance(Gson gson, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, RewardsAccountApi rewardsAccountApi, ApolloClient apolloClient, DispatcherProvider dispatcherProvider, TealiumSelector tealiumSelector) {
        return new RewardsAccountRepository(gson, sharedPreferences, sharedPreferences2, rewardsAccountApi, apolloClient, dispatcherProvider, tealiumSelector);
    }

    @Override // javax.inject.Provider
    public RewardsAccountRepository get() {
        return newInstance((Gson) this.gsonProvider.get(), (SharedPreferences) this.prefsProvider.get(), (SharedPreferences) this.encryptedPrefsProvider.get(), (RewardsAccountApi) this.apiProvider.get(), (ApolloClient) this.apolloClientProvider.get(), (DispatcherProvider) this.dispatcherProvider.get(), (TealiumSelector) this.tealiumSelectorProvider.get());
    }
}
