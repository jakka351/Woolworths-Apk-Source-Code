package au.com.woolworths.base.rewards.account.di;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.di.EndpointConfig;
import au.com.woolworths.android.onesite.di.SharedPreferenceFile;
import au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsCardSource;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsAnalyticsData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsRegionData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsUnlinkSuccessData;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.android.onesite.network.ComponentTypeAdapter;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.rewards.account.ActivePaymentClearer;
import au.com.woolworths.base.rewards.account.RedemptionStateRepository;
import au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl;
import au.com.woolworths.base.rewards.account.RewardsAccountRepository;
import au.com.woolworths.base.rewards.account.RewardsActivityInteractor;
import au.com.woolworths.base.rewards.account.data.RewardsAccountProfileData;
import au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResult;
import au.com.woolworths.base.rewards.account.network.RewardsAccountApi;
import au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractor;
import au.com.woolworths.foundation.rewards.cart.update.CartUpdateManager;
import au.com.woolworths.foundation.wxid.WxidClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tealium.core.Tealium;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.multibindings.ElementsIntoSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@StabilityInferred
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J,\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u000eH\u0007J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u0007JP\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u00100\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u00102\u001a\u000203H\u0007J\b\u00104\u001a\u000205H\u0007R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lau/com/woolworths/base/rewards/account/di/RewardsAccountAppModule;", "", "<init>", "()V", "types", "", "", "Lkotlin/reflect/KClass;", "provideBaseRewardsAccountPersistentMetadataProviders", "", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "rewardsAccountInteractor", "Lau/com/woolworths/android/onesite/modules/rewards/RewardsAccountInteractor;", "provideGson", "Lcom/google/gson/Gson;", "provideRewardsAccountApi", "Lau/com/woolworths/base/rewards/account/network/RewardsAccountApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "appConfig", "Lau/com/woolworths/android/onesite/appdata/AppConfig;", "schedulersProvider", "Lau/com/woolworths/android/onesite/rxutils/SchedulersProvider;", "gson", "provideActivePaymentHandler", "Lau/com/woolworths/base/rewards/account/ActivePaymentClearer;", "dispatcherProvider", "Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;", "rewardsWalletPrefs", "Landroid/content/SharedPreferences;", "provideRewardsAccountInteractor", "appConfigurationInteractor", "Lau/com/woolworths/android/onesite/appdata/AppConfigurationInteractor;", "rewardsAccountRepository", "Lau/com/woolworths/base/rewards/account/RewardsAccountRepository;", "featureAccessListManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureAccessListManager;", "activePaymentClearer", "cartInfoInteractor", "Lau/com/woolworths/foundation/rewards/cart/info/data/CartInfoInteractor;", "cartUpdateManager", "Lau/com/woolworths/foundation/rewards/cart/update/CartUpdateManager;", "tealium", "Lcom/tealium/core/Tealium;", "wxidClient", "Lau/com/woolworths/foundation/wxid/WxidClient;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "provideRewardsCardSource", "Lau/com/woolworths/android/onesite/modules/rewards/RewardsCardSource;", "provideRedemptionSettingRepository", "Lau/com/woolworths/base/rewards/account/RedemptionStateRepository;", "provideRewardsActivityInteractor", "Lau/com/woolworths/base/rewards/account/RewardsActivityInteractor;", "Companion", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
@InstallIn
/* loaded from: classes.dex */
public final class RewardsAccountAppModule {

    @NotNull
    private final Map<String, KClass<?>> types;
    public static final int $stable = 8;

    public RewardsAccountAppModule() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.types = MapsKt.j(new Pair("RewardsLinkCallbackResult", reflectionFactory.b(RewardsLinkCallbackResultData.class)), new Pair("RewardsSignupCallbackResult", reflectionFactory.b(RewardsSignupCallbackResult.class)), new Pair("RewardsLinkSuccess", reflectionFactory.b(RewardsLinkSuccessData.class)), new Pair("RewardsUnlinkSuccess", reflectionFactory.b(RewardsUnlinkSuccessData.class)), new Pair("RewardsAccessTokenSuccess", reflectionFactory.b(RewardsTokenData.class)), new Pair("RewardsMemberProfile", reflectionFactory.b(RewardsAccountProfileData.class)), new Pair("PrimaryRewardsCard", reflectionFactory.b(RewardsCardData.class)), new Pair("RewardsLoginSuccess", reflectionFactory.b(RewardsLoginSuccessData.class)), new Pair("AnalyticsData", reflectionFactory.b(RewardsAnalyticsData.class)), new Pair("RewardsRegionConfig", reflectionFactory.b(RewardsRegionData.class)));
    }

    @Provides
    @NotNull
    public final ActivePaymentClearer provideActivePaymentHandler(@NotNull final DispatcherProvider dispatcherProvider, @SharedPreferenceFile @NotNull final SharedPreferences rewardsWalletPrefs) {
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(rewardsWalletPrefs, "rewardsWalletPrefs");
        return new ActivePaymentClearer() { // from class: au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule.provideActivePaymentHandler.1
            @Override // au.com.woolworths.base.rewards.account.ActivePaymentClearer
            public Object clearActivePaymentData(Continuation<? super Unit> continuation) throws Throwable {
                dispatcherProvider.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                Object objF = BuildersKt.f(DefaultIoScheduler.f, new RewardsAccountAppModule$provideActivePaymentHandler$1$clearActivePaymentData$2(rewardsWalletPrefs, null), continuation);
                return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
            }
        };
    }

    @Provides
    @ElementsIntoSet
    @NotNull
    public final Set<PersistentMetadataProvider> provideBaseRewardsAccountPersistentMetadataProviders(@NotNull RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        return SetsKt.i(rewardsAccountInteractor);
    }

    @Provides
    @Named
    @NotNull
    public final Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.b(new ComponentTypeAdapter(this.types), Component.class);
        return gsonBuilder.a();
    }

    @Provides
    @Singleton
    @NotNull
    public final RedemptionStateRepository provideRedemptionSettingRepository() {
        return new RedemptionStateRepository();
    }

    @Provides
    @NotNull
    public final RewardsAccountApi provideRewardsAccountApi(@EndpointConfig @NotNull OkHttpClient okHttpClient, @NotNull AppConfig appConfig, @NotNull SchedulersProvider schedulersProvider, @Named @NotNull Gson gson) throws NumberFormatException {
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(gson, "gson");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(appConfig.d());
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(gson));
        builder.a(RxJava2CallAdapterFactory.d(schedulersProvider.d()));
        Object objB = builder.c().b(RewardsAccountApi.class);
        Intrinsics.g(objB, "create(...)");
        return (RewardsAccountApi) objB;
    }

    @Provides
    @Singleton
    @NotNull
    public final RewardsAccountInteractor provideRewardsAccountInteractor(@NotNull AppConfigurationInteractor appConfigurationInteractor, @NotNull RewardsAccountRepository rewardsAccountRepository, @NotNull FeatureAccessListManager featureAccessListManager, @NotNull ActivePaymentClearer activePaymentClearer, @NotNull CartInfoInteractor cartInfoInteractor, @NotNull CartUpdateManager cartUpdateManager, @NotNull Tealium tealium, @NotNull WxidClient wxidClient, @NotNull FeatureToggleManager featureToggleManager) {
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(rewardsAccountRepository, "rewardsAccountRepository");
        Intrinsics.h(featureAccessListManager, "featureAccessListManager");
        Intrinsics.h(activePaymentClearer, "activePaymentClearer");
        Intrinsics.h(cartInfoInteractor, "cartInfoInteractor");
        Intrinsics.h(cartUpdateManager, "cartUpdateManager");
        Intrinsics.h(tealium, "tealium");
        Intrinsics.h(wxidClient, "wxidClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new RewardsAccountInteractorImpl(appConfigurationInteractor, rewardsAccountRepository, featureAccessListManager, activePaymentClearer, cartInfoInteractor, cartUpdateManager, tealium, wxidClient, featureToggleManager, null, 512, null);
    }

    @Provides
    @Singleton
    @NotNull
    public final RewardsActivityInteractor provideRewardsActivityInteractor() {
        return new RewardsActivityInteractor();
    }

    @Provides
    @Singleton
    @NotNull
    public final RewardsCardSource provideRewardsCardSource(@NotNull RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        return rewardsAccountInteractor;
    }
}
