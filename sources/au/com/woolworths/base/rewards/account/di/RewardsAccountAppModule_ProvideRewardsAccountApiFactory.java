package au.com.woolworths.base.rewards.account.di;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.rewards.account.network.RewardsAccountApi;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RewardsAccountAppModule_ProvideRewardsAccountApiFactory implements Factory<RewardsAccountApi> {
    private final Provider<AppConfig> appConfigProvider;
    private final Provider<Gson> gsonProvider;
    private final RewardsAccountAppModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SchedulersProvider> schedulersProvider;

    public static RewardsAccountApi provideRewardsAccountApi(RewardsAccountAppModule rewardsAccountAppModule, OkHttpClient okHttpClient, AppConfig appConfig, SchedulersProvider schedulersProvider, Gson gson) throws NumberFormatException {
        RewardsAccountApi rewardsAccountApiProvideRewardsAccountApi = rewardsAccountAppModule.provideRewardsAccountApi(okHttpClient, appConfig, schedulersProvider, gson);
        Preconditions.d(rewardsAccountApiProvideRewardsAccountApi);
        return rewardsAccountApiProvideRewardsAccountApi;
    }

    @Override // javax.inject.Provider
    public RewardsAccountApi get() {
        return provideRewardsAccountApi(this.module, (OkHttpClient) this.okHttpClientProvider.get(), (AppConfig) this.appConfigProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (Gson) this.gsonProvider.get());
    }
}
