package au.com.woolworths.android.onesite.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.datastore.core.DataStore;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import androidx.work.Configuration;
import au.com.woolworths.android.onesite.LegacyShopAppFeature;
import au.com.woolworths.android.onesite.ShopAppFeature;
import au.com.woolworths.android.onesite.analytics.AnalyticsAggregator;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker;
import au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTrackerImpl;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsManagerImpl;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.analytics.LegacyShopAnalyticsManagerImpl;
import au.com.woolworths.android.onesite.analytics.NoOpAnalyticsManager;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.UserAttributionManager;
import au.com.woolworths.android.onesite.analytics.UserAttributionManagerImpl;
import au.com.woolworths.android.onesite.analytics.a11y.AccessibilityAnalytics;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsRepository;
import au.com.woolworths.android.onesite.analytics.swrve.ShopAppSwrveTrackingManager;
import au.com.woolworths.android.onesite.analytics.tealium.NoOpTealiumEventLogRecorder;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumAnalyticsManagerImpl;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumConfigData;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumConfigDataKt;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumEventLogRecorder;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumNewZealandConfig;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumSelector;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumSelectorImpl;
import au.com.woolworths.android.onesite.app.ShopApplication_HiltComponents;
import au.com.woolworths.android.onesite.app.deeplink.ShopAppBranchDeepLinkActivity;
import au.com.woolworths.android.onesite.app.deeplink.ShopAppBranchDeepLinkActivity_MembersInjector;
import au.com.woolworths.android.onesite.app.di.ActivityModule;
import au.com.woolworths.android.onesite.app.di.ActivityModule_ProvideDigitalPayForOrderPresenterFactory;
import au.com.woolworths.android.onesite.app.di.AppCommsConfigsModule_ProvideInboxChatbotSessionIdSourceFactory;
import au.com.woolworths.android.onesite.app.di.AppCommsConfigsModule_ProvideInboxUserIdSourceFactory;
import au.com.woolworths.android.onesite.app.di.AppCommsModule_ProvideInboxClientFactory;
import au.com.woolworths.android.onesite.app.di.AppCommsModule_ProvideInboxDataFetcherFactory;
import au.com.woolworths.android.onesite.app.di.AppConfigModule;
import au.com.woolworths.android.onesite.app.di.AppConfigModule$provideBuildConfigInteractor$1;
import au.com.woolworths.android.onesite.app.di.AppConfigModule_ProvideAppConfigFactory;
import au.com.woolworths.android.onesite.app.di.AppConfigModule_ProvideAuthConfigFactory;
import au.com.woolworths.android.onesite.app.di.AppConfigModule_ProvideScanAndGoConfigFactory;
import au.com.woolworths.android.onesite.app.di.AppConfigModule_ProvideShopAppFlavorInteractorFactory;
import au.com.woolworths.android.onesite.app.di.AppConfigModule_ProvideSnGFirebaseConfigFactory;
import au.com.woolworths.android.onesite.app.di.AppModule;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideAppIdentifierFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideFeatureToggleManagerFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideFirebaseAppFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideInstoreWifiAnalyticsInteractorFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideLaunchManagerFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideOnAppCloseHandlerFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidePaymentServicesInteractorFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideRewardsAppTokenAuthenticatorFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideScanAndGoFeatureConfigFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideSnGOtherFirebaseAppFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideStoreLocatorInteractorFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideStoreLocatorInteractorLegacyFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideSwrveEventTrackerFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideTealiumEventBundleManagerFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvideWoolworthsGsonFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidesAuth0AuthManagerFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidesGoogleAdLoadingTimeoutConfigFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidesGooglePayManagerFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidesKeycloakAuthManagerFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidesNewBadgeInteractorFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidesNewBadgeRepositoryFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidesShippingCalculatorDataStoreFactory;
import au.com.woolworths.android.onesite.app.di.AppModule_ProvidesTrafficDriversInteractorFactory;
import au.com.woolworths.android.onesite.app.di.LegacyDigipayModule;
import au.com.woolworths.android.onesite.app.di.LegacyDigipayModule_ProvideDigitalPaySdkHelper$ShopApp_releaseFactory;
import au.com.woolworths.android.onesite.app.di.NavigationModule;
import au.com.woolworths.android.onesite.app.di.NetworkModule;
import au.com.woolworths.android.onesite.app.di.NetworkModule_CurlLoggingInterceptorFactory;
import au.com.woolworths.android.onesite.app.di.NetworkModule_ProvideApigeeXOkHttpClientFactory;
import au.com.woolworths.android.onesite.app.di.NetworkModule_ProvidesApigeeXHttpInterceptorFactory;
import au.com.woolworths.android.onesite.app.di.NhpModule_ProvideEdrOfferBoosterFactory;
import au.com.woolworths.android.onesite.app.di.NotificationModule;
import au.com.woolworths.android.onesite.app.di.NotificationModule_ProvideNotificationManagerFactory;
import au.com.woolworths.android.onesite.app.di.SduiModule;
import au.com.woolworths.android.onesite.app.di.ShopAppNavigatorModule;
import au.com.woolworths.android.onesite.app.di.ShopAppRegionModule;
import au.com.woolworths.android.onesite.app.di.ShopAppRegionModule_ProvideShopAppRegionInteractorFactory;
import au.com.woolworths.android.onesite.app.flavor.ShopAppAuFlavorInteractor;
import au.com.woolworths.android.onesite.app.notification.WOWFirebaseMessagingService;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractorImpl;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.appdata.FirebaseConfigBuilder;
import au.com.woolworths.android.onesite.branch.BranchAnalyticsInteractor;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.config.BuildConfigInteractor;
import au.com.woolworths.android.onesite.config.ShopAppBuildConfigManager;
import au.com.woolworths.android.onesite.coroutineutils.AndroidDispatcherProvider;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.database.WoolworthsSupermarketDatabase;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.di.AppBuildConfigModule;
import au.com.woolworths.android.onesite.di.BaseDataModule;
import au.com.woolworths.android.onesite.di.BaseDataModule_ProvideBannerDismissPrefs$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseDataModule_ProvidesBuyAgainSharedPrefsFactory;
import au.com.woolworths.android.onesite.di.BaseDataModule_ProvidesCatalogueSharedPrefsFactory;
import au.com.woolworths.android.onesite.di.BaseDataModule_ProvidesInstorePresencePrefs$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseDataModule_ProvidesNewBadgePrefs$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseDataModule_ProvidesOrderDetailsPrefs$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseDataModule_ProvidesPerfectOrderSharedPrefs$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseDataModule_ProvidesRewardsAccountChatbotPrefs$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideAdobeAnalyticsInteractor$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideAdobeAnalyticsRepository$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideAnalyticsLoggerFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideAppEnvironmentFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideDyntraceLoggerFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideFeatureToggleManagerImpl$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideFirebaseAppRepository$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideFirebaseCrashlyticsFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideJwtApiFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideNetworkExceptions$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideNotificationManager$base_impl_releaseFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvidePreferencesManagerFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvideRewardsPointsBalanceRepositoryFactory;
import au.com.woolworths.android.onesite.di.BaseModule_ProvidesTealiumFactory;
import au.com.woolworths.android.onesite.di.BaseNetworkModule;
import au.com.woolworths.android.onesite.di.BaseNetworkModule$provideApolloHeadersInterceptor$1;
import au.com.woolworths.android.onesite.di.BaseNetworkModule_ProvideAemContentApolloClientFactory;
import au.com.woolworths.android.onesite.di.BaseNetworkModule_ProvideCacheFactory;
import au.com.woolworths.android.onesite.di.BaseNetworkModule_ProvideConnectionManagerFactory;
import au.com.woolworths.android.onesite.di.BaseNetworkModule_ProvidePaymentApolloClientFactory;
import au.com.woolworths.android.onesite.di.ReleaseModule;
import au.com.woolworths.android.onesite.di.ReleaseModule_ProvideAemContentOkHttpClientFactory;
import au.com.woolworths.android.onesite.di.ReleaseModule_ProvideJwtRepositoryFactory;
import au.com.woolworths.android.onesite.di.ReleaseModule_ProvideOkHttpClientFactory;
import au.com.woolworths.android.onesite.di.ReleaseModule_ProvidesSettingsInteractorFactory;
import au.com.woolworths.android.onesite.di.ReleaseModule_ProvidesSquadWebViewInteractorFactory;
import au.com.woolworths.android.onesite.di.modules.HttpInterceptorModule;
import au.com.woolworths.android.onesite.di.modules.HttpInterceptorModule_ProvideShopAppHttpInterceptorFactory;
import au.com.woolworths.android.onesite.di.modules.LegacyActivityModule;
import au.com.woolworths.android.onesite.di.modules.LegacyAppModule;
import au.com.woolworths.android.onesite.di.modules.LegacyAppModule_ProvideFulfilmentExceptions$shop_legacy_releaseFactory;
import au.com.woolworths.android.onesite.di.modules.LegacyAppModule_ProvidesLegacyAnalyticsManager$shop_legacy_releaseFactory;
import au.com.woolworths.android.onesite.di.modules.LegacyDataModule;
import au.com.woolworths.android.onesite.di.modules.LegacyDataModule_ProvideWoolworthsSupermarketDatabaseFactory;
import au.com.woolworths.android.onesite.di.modules.NetworkModule_ProvideApiServiceFactory;
import au.com.woolworths.android.onesite.di.modules.NetworkModule_ProvideCollectionApiFactory;
import au.com.woolworths.android.onesite.di.modules.NetworkModule_ProvideRefreshTokenInterceptorFactory;
import au.com.woolworths.android.onesite.di.modules.NetworkModule_ProvideSharedHeadersFactory;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.Feature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManagerImpl;
import au.com.woolworths.android.onesite.featuretoggles.FirebaseRepository;
import au.com.woolworths.android.onesite.jwt.JwtApi;
import au.com.woolworths.android.onesite.logging.LoggingConverterFactory;
import au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger;
import au.com.woolworths.android.onesite.logging.dynatrace.TimberDynatraceLogger;
import au.com.woolworths.android.onesite.modules.BaseShopAppActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.checkout.ConfirmDialogFragment;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor;
import au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelper;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor;
import au.com.woolworths.android.onesite.modules.checkout.di.CheckoutAppModule;
import au.com.woolworths.android.onesite.modules.checkout.di.CheckoutAppModule_ProvideCheckOutInteractor$app_common_releaseFactory;
import au.com.woolworths.android.onesite.modules.checkout.di.CheckoutAppModule_ProvidesCheckoutApiFactory;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.CollectDeviceData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment;
import au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorViewModel;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel;
import au.com.woolworths.android.onesite.modules.collectionmode.InStoreModeInteractor;
import au.com.woolworths.android.onesite.modules.customviews.WebViewActivity;
import au.com.woolworths.android.onesite.modules.customviews.WebViewActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesActivity;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesPresenter;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import au.com.woolworths.android.onesite.modules.main.MainActivity;
import au.com.woolworths.android.onesite.modules.main.MainActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupViewModel;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupFragment;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupViewModel;
import au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperPresenter;
import au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperView;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalanceRepository;
import au.com.woolworths.android.onesite.modules.rewards.RewardsSetupMoreActivity;
import au.com.woolworths.android.onesite.modules.search.searchscreen.ScreenOptions;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchInteractor;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchViewModel;
import au.com.woolworths.android.onesite.modules.shortcuts.ShortcutsTrampolineActivity;
import au.com.woolworths.android.onesite.modules.shortcuts.ShortcutsTrampolineActivity_MembersInjector;
import au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity;
import au.com.woolworths.android.onesite.modules.splash.SplashViewModel;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.network.ApiInterface;
import au.com.woolworths.android.onesite.network.ApiService;
import au.com.woolworths.android.onesite.network.FirebasePerfApolloInterceptor;
import au.com.woolworths.android.onesite.network.GraphQlBaseUrlInterceptor;
import au.com.woolworths.android.onesite.network.GraphQlPerformanceTrackingInterceptor;
import au.com.woolworths.android.onesite.network.GraphQlPreprocessorInterceptor;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.network.PreemptiveTokenRefreshInterceptor;
import au.com.woolworths.android.onesite.network.RestApiBaseUrlInterceptor;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.notification.SwrveConfigData;
import au.com.woolworths.android.onesite.notification.WowNotificationManager;
import au.com.woolworths.android.onesite.repository.ConfigManagerImpl;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl;
import au.com.woolworths.android.onesite.repository.TrolleyResultMapper;
import au.com.woolworths.android.onesite.rxutils.AndroidSchedulersProvider;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.android.onesite.utils.FulfilmentExceptions;
import au.com.woolworths.android.onesite.utils.NotificationManager;
import au.com.woolworths.android.onesite.utils.preload.PreLoaderService;
import au.com.woolworths.auth.api.AuthConfig;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator;
import au.com.woolworths.base.rewards.account.RedemptionStateInteractor;
import au.com.woolworths.base.rewards.account.RedemptionStateRepository;
import au.com.woolworths.base.rewards.account.RewardsAccountRepository;
import au.com.woolworths.base.rewards.account.RewardsActivityInteractor;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule_ProvideActivePaymentHandlerFactory;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule_ProvideBaseRewardsAccountPersistentMetadataProvidersFactory;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule_ProvideGsonFactory;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule_ProvideRedemptionSettingRepositoryFactory;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule_ProvideRewardsAccountApiFactory;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule_ProvideRewardsAccountInteractorFactory;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule_ProvideRewardsActivityInteractorFactory;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.base.shopapp.di.BaseShopAppModule;
import au.com.woolworths.base.shopapp.di.BaseShopAppModule$provideFeatureAccessListManager$1;
import au.com.woolworths.base.shopapp.di.BaseShopAppModule$providesGoogleAdCustomTargetingScalarAdapter$1;
import au.com.woolworths.base.shopapp.di.BaseShopAppModule$providesTealiumAnalyticsScalarAdapter$1;
import au.com.woolworths.base.shopapp.di.BaseShopAppModule_ProvidesInStoreModeInteractor$base_shop_app_releaseFactory;
import au.com.woolworths.base.shopapp.modules.collectionmode.AddressApi;
import au.com.woolworths.base.shopapp.modules.collectionmode.AddressApiImpl;
import au.com.woolworths.base.shopapp.modules.collectionmode.AddressInteractor;
import au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository;
import au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeTypeAdapter;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.base.shopapp.modules.collectionmode.ShoppingModeApi;
import au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor;
import au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionDataRepository;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.base.shopapp.network.ApigeeXHttpInterceptor;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment;
import au.com.woolworths.base.wallet.digipay.DigipayUtils;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity_MembersInjector;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrViewModel;
import au.com.woolworths.checkout.network.CheckoutApiInterface;
import au.com.woolworths.devicefingerprint.BotmanagerApolloInterceptor;
import au.com.woolworths.devicefingerprint.BotmanagerInteractor;
import au.com.woolworths.devicefingerprint.BotmanagerOkHttpInterceptor;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import au.com.woolworths.devicefingerprint.di.DeviceFingerprintAppModule;
import au.com.woolworths.devicefingerprint.di.DeviceFingerprintAppModule_ProvideDeviceFingerprintInteractorFactory;
import au.com.woolworths.dynamic.page.di.DynamicPageModule;
import au.com.woolworths.dynamic.page.di.DynamicPageModule_ProvideDynamicPageInteractor$dynamic_page_releaseFactory;
import au.com.woolworths.dynamic.page.interactor.DynamicPageInteractorImpl;
import au.com.woolworths.dynamic.page.interactor.DynamicPageRepository;
import au.com.woolworths.dynamic.page.ui.DynamicPageActivity;
import au.com.woolworths.dynamic.page.ui.DynamicPageActivity_MembersInjector;
import au.com.woolworths.dynamic.page.ui.DynamicPageViewModel;
import au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.product.list.ProductListOptionsFilterFragment;
import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.ProductListPaginationAdapter;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.feature.product.list.compose.AlternativeProductsFragment;
import au.com.woolworths.feature.product.list.di.ProductListAppModule;
import au.com.woolworths.feature.product.list.di.ProductListAppModule_ProvidesProductListFiltersSharedPrefsFactory;
import au.com.woolworths.feature.product.list.di.ProductListAppModule_ProvidesProductsRepositoryFactory;
import au.com.woolworths.feature.product.list.di.ProductListAppModule_ProvidesProductsSharedPrefsFactory;
import au.com.woolworths.feature.product.list.di.ProductListModule;
import au.com.woolworths.feature.product.list.di.ProductListModule_ProvideProductListInteractorFactory;
import au.com.woolworths.feature.product.list.di.ProductListModule_ProvidesGoogleAdManagerInteractorFactory;
import au.com.woolworths.feature.product.list.di.ProductListModule_ProvidesGoogleAdManagerRepositoryFactory;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity_MembersInjector;
import au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity;
import au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity_MembersInjector;
import au.com.woolworths.feature.product.list.legacy.ProductListInteractor;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment;
import au.com.woolworths.feature.product.list.legacy.nutrition.NutritionBottomSheetViewModel;
import au.com.woolworths.feature.product.list.v2.ProductListActivity;
import au.com.woolworths.feature.product.list.v2.ProductListActivity_MembersInjector;
import au.com.woolworths.feature.product.list.v2.ProductListInteractorImpl;
import au.com.woolworths.feature.product.list.v2.ProductListViewModel;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew_MembersInjector;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity_MembersInjector;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModel;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountInteractor;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountRepository;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountViewModel;
import au.com.woolworths.feature.rewards.account.di.RewardsPreferencesAppModule;
import au.com.woolworths.feature.rewards.account.di.RewardsPreferencesAppModule_ProvideAccountSettingsInteractorFactory;
import au.com.woolworths.feature.rewards.account.di.RewardsPreferencesAppModule_ProvideGsonFactory;
import au.com.woolworths.feature.rewards.account.di.RewardsPreferencesAppModule_ProvideRewardsPreferenceDetailsRepositoryFactory;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsRepository;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy;
import au.com.woolworths.feature.rewards.account.preferences.notification.RewardsPushPreferenceDetailsViewModelLegacy;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsActivityOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsActivityOld_MembersInjector;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsInteractorOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsRepositoryOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld;
import au.com.woolworths.feature.rewards.account.settings.ShowAdPreferencesFeature;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity_MembersInjector;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsInteractor;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsRepository;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel;
import au.com.woolworths.feature.rewards.account.sso.MandyJsInterface;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity_MembersInjector;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkInteractor;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkRepository;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkViewModel;
import au.com.woolworths.feature.rewards.card.RewardsCardFeature;
import au.com.woolworths.feature.rewards.card.RewardsCardInteractor;
import au.com.woolworths.feature.rewards.card.RewardsCardRepository;
import au.com.woolworths.feature.rewards.card.di.RewardsCardAppModule;
import au.com.woolworths.feature.rewards.card.di.RewardsCardAppModule_ProvideUnlockChristmasFundsInteractorFactory;
import au.com.woolworths.feature.rewards.card.di.RewardsCardAppModule_ProvideUnlockChristmasFundsRepositoryFactory;
import au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableViewModel;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity_MembersInjector;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsInteractor;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModel;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModelV2;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity_MembersInjector;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.SignUpQueryParamsManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanInteractorImpl;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanRepository;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.finalglance.EverydayExtrasFinalGlanceInteractorImpl;
import au.com.woolworths.feature.rewards.everydayextras.signup.finalglance.EverydayExtrasFinalGlanceRepository;
import au.com.woolworths.feature.rewards.everydayextras.signup.landing.EverydayExtrasLandingInteractorImpl;
import au.com.woolworths.feature.rewards.everydayextras.signup.landing.EverydayExtrasLandingRepository;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryInteractorImpl;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayManagerImpl;
import au.com.woolworths.feature.rewards.offers.BranchInteractor;
import au.com.woolworths.feature.rewards.offers.BranchRepository;
import au.com.woolworths.feature.rewards.offers.RewardsHomeBridgeViewModel;
import au.com.woolworths.feature.rewards.offers.RewardsHomeOfferRepository;
import au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsOfferRepository;
import au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy;
import au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.banner.RewardsBannerRepository;
import au.com.woolworths.feature.rewards.offers.data.OfferDetailsParams;
import au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsParamsLegacy;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailInteractorLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailScreenInteractorLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.di.RewardsOffersAppModule;
import au.com.woolworths.feature.rewards.offers.di.RewardsOffersAppModule_ProvideOffersEventRouterFactory;
import au.com.woolworths.feature.rewards.offers.di.RewardsOffersAppModule_ProvideRewardsHomeOfferRepositoryFactory;
import au.com.woolworths.feature.rewards.offers.di.RewardsOffersAppModule_ProvideRewardsOfferActivationInteractorFactory;
import au.com.woolworths.feature.rewards.offers.di.RewardsOffersAppModule_ProvideRewardsOfferRepositoryFactory;
import au.com.woolworths.feature.rewards.offers.domain.OfferDetailsInteractorImpl;
import au.com.woolworths.feature.rewards.offers.home.RewardsHomeOfferFeedInteractor;
import au.com.woolworths.feature.rewards.offers.home.RewardsHomeOffersFeatureKt;
import au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity_MembersInjector;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageInteractor;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameInteractor;
import au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameRepository;
import au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameViewModel;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewOffersModule;
import au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor;
import au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionModule;
import au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionModule_ProvidePushNotificationPermissionInteractorFactory;
import au.com.woolworths.feature.rewards.permissions.ui.AskForPushNotificationPermissionViewModel;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity_MembersInjector;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetFragment;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsInteractor;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel;
import au.com.woolworths.feature.rewards.redemptionsettings.di.RewardsRedemptionSettingsModule;
import au.com.woolworths.feature.rewards.redemptionsettings.di.RewardsRedemptionSettingsModule_ProvideRewardsRedemptionSettingsInteractorFactory;
import au.com.woolworths.feature.rewards.redemptionsettings.di.RewardsRedemptionSettingsModule_ProvideRewardsRedemptionSettingsRepositoryFactory;
import au.com.woolworths.feature.rewards.redemptionsettings.di.RewardsRedemptionSettingsModule_ProvideSecureDollarsInteractorFactory;
import au.com.woolworths.feature.rewards.redemptionsettings.di.RewardsRedemptionSettingsModule_ProvideSecureDollarsRepositoryFactory;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsViewModel;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesInteractor;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesRepository;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesViewModel;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity;
import au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity_MembersInjector;
import au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel;
import au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity;
import au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity_MembersInjector;
import au.com.woolworths.feature.shared.feedback.ui.FeedbackFormViewModel;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity_MembersInjector;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionViewModel;
import au.com.woolworths.feature.shared.instore.wifi.InStoreWifiFeature;
import au.com.woolworths.feature.shared.instore.wifi.di.InStoreWifiAppModule;
import au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper;
import au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationReceiver;
import au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationReceiver_MembersInjector;
import au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity_MembersInjector;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiViewModel;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity_MembersInjector;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel;
import au.com.woolworths.feature.shared.notification.optin.NotificationOptInActivity;
import au.com.woolworths.feature.shared.notification.optin.NotificationOptInActivity_MembersInjector;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity_MembersInjector;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsInteractor;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsViewModel;
import au.com.woolworths.feature.shared.receipt.details.di.SharedEReceiptDetailsModule;
import au.com.woolworths.feature.shared.receipt.details.di.SharedEReceiptDetailsModule_ProvideFileDownloaderFactory;
import au.com.woolworths.feature.shared.web.file.uploader.WebChromeFileUploadHelper;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity_MembersInjector;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionViewModel;
import au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl;
import au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountRepository;
import au.com.woolworths.feature.shop.account.domain.details.AccountDetailsInteractor;
import au.com.woolworths.feature.shop.account.domain.details.AccountDetailsRepository;
import au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity;
import au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity_MembersInjector;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel;
import au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel;
import au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures;
import au.com.woolworths.feature.shop.ask.olive.di.ShopAskOliveAppModule;
import au.com.woolworths.feature.shop.ask.olive.di.ShopAskOliveAppModule_ProvideVersionNameFactory;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity_MembersInjector;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel_Factory;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel_MembersInjector;
import au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor;
import au.com.woolworths.feature.shop.ask.olive.ui.jsbridge.AskOliveJsInterface;
import au.com.woolworths.feature.shop.ask.olive.ui.link.OliveLinkDelegate;
import au.com.woolworths.feature.shop.ask.olive.ui.repository.AskOliveRepository;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity_MembersInjector;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerInteractor;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity_MembersInjector;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerViewModel;
import au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity;
import au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity_MembersInjector;
import au.com.woolworths.feature.shop.brandedshop.BrandedShopInteractor;
import au.com.woolworths.feature.shop.brandedshop.BrandedShopRepository;
import au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel;
import au.com.woolworths.feature.shop.bundles.BundlesActivity;
import au.com.woolworths.feature.shop.bundles.BundlesActivity_MembersInjector;
import au.com.woolworths.feature.shop.bundles.BundlesInteractor;
import au.com.woolworths.feature.shop.bundles.BundlesInteractorImpl;
import au.com.woolworths.feature.shop.bundles.BundlesRepository;
import au.com.woolworths.feature.shop.bundles.BundlesViewModel;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface;
import au.com.woolworths.feature.shop.catalogue.CatalogueConfigInteractorImpl;
import au.com.woolworths.feature.shop.catalogue.CatalogueFeature;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity_MembersInjector;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseInteractor;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseViewModel;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsInteractor;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsViewModel;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueAppModule;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueAppModule_ProvideCatalogueGson$catalogue_releaseFactory;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueAppModule_ProvideSupplementaryCatalogueInterceptorsFactory;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueAppModule_ProvidesCatalogueRepositoryFactory;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueModule;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueModule_ProvideCatalogueApiInterfaceFactory;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueModule_ProvideCatalogueConfigInteractorFactory;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueModule_ProvideCatalogueOkHttpClientFactory;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueModule_ProvideProductsForStoreInteractor$catalogue_releaseFactory;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueModule_ProvideSaleFinderProductListRepository$catalogue_releaseFactory;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity_MembersInjector;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeInteractor;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeRepository;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity_MembersInjector;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroViewModel;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity_MembersInjector;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingRepository;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingRepository;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingViewModel;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity_MembersInjector;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsInteractor;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsRepository;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity_MembersInjector;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.interactor.ConsolidatedProductListInteractor;
import au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity_MembersInjector;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorInteractor;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel;
import au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsViewModel;
import au.com.woolworths.feature.shop.contentpage.ContentPageFragment;
import au.com.woolworths.feature.shop.contentpage.ContentPageInteractor;
import au.com.woolworths.feature.shop.contentpage.ContentPageRepository;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity_MembersInjector;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel;
import au.com.woolworths.feature.shop.delivery.address.DeliveryAddressFeature;
import au.com.woolworths.feature.shop.delivery.address.DeliveryAddressInteractor;
import au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel;
import au.com.woolworths.feature.shop.delivery.address.di.DeliveryAddressAppModule;
import au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorViewModel;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewViewModel;
import au.com.woolworths.feature.shop.editorder.review.domain.ChangeMyOrderInteractor;
import au.com.woolworths.feature.shop.editorder.review.domain.ChangeMyOrderRepository;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersViewModelLegacy;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity_MembersInjector;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsInteractor;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOptionManager;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsViewModel;
import au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity;
import au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity_MembersInjector;
import au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenViewModel;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity_MembersInjector;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerInteractor;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerRepository;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerViewModel;
import au.com.woolworths.feature.shop.homepage.HomeFeature;
import au.com.woolworths.feature.shop.homepage.data.HomeRepository;
import au.com.woolworths.feature.shop.homepage.di.HomepageAppModule;
import au.com.woolworths.feature.shop.homepage.domain.HeroBannerInteractor;
import au.com.woolworths.feature.shop.homepage.domain.HomeInteractor;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel;
import au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryActivity;
import au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryActivity_MembersInjector;
import au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryViewModel;
import au.com.woolworths.feature.shop.inbox.InboxActivity;
import au.com.woolworths.feature.shop.inbox.InboxActivity_MembersInjector;
import au.com.woolworths.feature.shop.inbox.InboxFeature;
import au.com.woolworths.feature.shop.inbox.InboxViewModel;
import au.com.woolworths.feature.shop.inbox.di.InboxConfigModule_InboxTimeSource$inbox_releaseFactory;
import au.com.woolworths.feature.shop.inbox.di.InboxModule_ProvideInboxAnalyticsFactoryFactory;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity_MembersInjector;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartViewModel;
import au.com.woolworths.feature.shop.instore.cart.di.InstoreCartAppModule;
import au.com.woolworths.feature.shop.instore.cart.di.InstoreCartAppModule_ProvideInstoreCartRepositoryFactory;
import au.com.woolworths.feature.shop.instore.cart.domain.InstoreCartRepository;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule_ProvideBuildingInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule_ProvideCredentialsInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule_ProvideInstoreNavigationInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule_ProvideMapFeatureHighlightStatusInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule_ProvideTrackingInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule_ProvidesProductFinderRepositoryFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule_ProvidesSharedPreferencesFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationModule;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationModule_ProvideMapFocusInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationModule_ProvidePositionAnimatorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationModule_ProvideProximityInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationModule_ProvideRoutingInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.ProductFinderModule;
import au.com.woolworths.feature.shop.instore.navigation.di.ProductFinderModule_ProvidesProductFinderOnboardingInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.di.ReleaseModule_ProvidePositioningInteractorFactory;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.MapFocusInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientTrackingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.ProximityInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity_MembersInjector;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.MapEventTracker;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.PositionAnimator;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity_MembersInjector;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel;
import au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository;
import au.com.woolworths.feature.shop.instore.presence.di.InstorePresenceAppModule;
import au.com.woolworths.feature.shop.instore.presence.di.InstorePresenceAppModule_ProvideInstoreLocationRepositoryFactory;
import au.com.woolworths.feature.shop.instore.presence.di.InstorePresenceAppModule_ProvideInstorePresenceInteractorFactory;
import au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceAnalyticsProvider;
import au.com.woolworths.feature.shop.login.LogOutInteractorImpl;
import au.com.woolworths.feature.shop.login.LoginActivity;
import au.com.woolworths.feature.shop.login.LoginInteractor;
import au.com.woolworths.feature.shop.login.LoginViewModel;
import au.com.woolworths.feature.shop.login.di.ShopLoginAppModule;
import au.com.woolworths.feature.shop.login.di.ShopLoginAppModule_ProvideLogoutInteractorFactory;
import au.com.woolworths.feature.shop.login.di.ShopLoginModule;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.login.guest.GuestLoginRepository;
import au.com.woolworths.feature.shop.login.guest.network.GuestLoginApi;
import au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginViewModel;
import au.com.woolworths.feature.shop.marketplace.MarketplaceFeature;
import au.com.woolworths.feature.shop.marketplace.data.source.MarketplaceRepositoryImpl;
import au.com.woolworths.feature.shop.marketplace.di.ShopMarketplaceAppModule;
import au.com.woolworths.feature.shop.marketplace.di.ShopMarketplaceModule;
import au.com.woolworths.feature.shop.marketplace.di.ShopMarketplaceModule_ProvideMarketplaceInteractorFactory;
import au.com.woolworths.feature.shop.marketplace.ui.brands.MarketplaceBrandsFragment;
import au.com.woolworths.feature.shop.marketplace.ui.brands.MarketplaceBrandsViewModel;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesViewModel;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActivity;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActivity_MembersInjector;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedViewModel;
import au.com.woolworths.feature.shop.marketplace.ui.sellers.MarketplaceSellersFragment;
import au.com.woolworths.feature.shop.marketplace.ui.sellers.MarketplaceSellersViewModel;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor;
import au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository;
import au.com.woolworths.feature.shop.more.MoreFeature;
import au.com.woolworths.feature.shop.more.MoreFragment;
import au.com.woolworths.feature.shop.more.MoreInteractor;
import au.com.woolworths.feature.shop.more.MoreRepository;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.di.MoreFeatureAppModule;
import au.com.woolworths.feature.shop.more.newbadge.NewBadgeInteractor;
import au.com.woolworths.feature.shop.myorders.MyOrdersFeature;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity_MembersInjector;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsInteractor;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel;
import au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationInteractor;
import au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationRepository;
import au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageInteractor;
import au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository;
import au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyInteractor;
import au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyRepository;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorViewModel;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationInteractor;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity_MembersInjector;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpViewModel;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ApplicableDeliveryMethodViewModel;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoUpliftViewModel;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoViewModel;
import au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader;
import au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceRepository;
import au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService;
import au.com.woolworths.feature.shop.myorders.details.perfectorder.PerfectOrderDataSource;
import au.com.woolworths.feature.shop.myorders.details.perfectorder.PerfectOrderInteractor;
import au.com.woolworths.feature.shop.myorders.details.perfectorder.PerfectOrderRepository;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorViewModel;
import au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryViewModel;
import au.com.woolworths.feature.shop.myorders.details.substitutionrating.SubstitutionRatingRepository;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity_MembersInjector;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesInteractor;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesRepository;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity_MembersInjector;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryViewModel;
import au.com.woolworths.feature.shop.myorders.di.ShopMyOrdersAppModule;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity_MembersInjector;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsInteractor;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsRepository;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity_MembersInjector;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsViewModel;
import au.com.woolworths.feature.shop.myorders.guest.MyOrdersGuestFragment;
import au.com.woolworths.feature.shop.myorders.orders.OrderCheckInInteractor;
import au.com.woolworths.feature.shop.myorders.orders.OrdersActivity;
import au.com.woolworths.feature.shop.myorders.orders.OrdersActivity_MembersInjector;
import au.com.woolworths.feature.shop.myorders.orders.OrdersInteractor;
import au.com.woolworths.feature.shop.myorders.orders.OrdersRepository;
import au.com.woolworths.feature.shop.myorders.orders.OrdersViewModel;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel;
import au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository;
import au.com.woolworths.feature.shop.myorders.pickup.manager.PickupNotificationHandler;
import au.com.woolworths.feature.shop.myorders.pickup.manager.PickupNotificationManagerImpl;
import au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity;
import au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity_MembersInjector;
import au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesViewModel;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsViewModel;
import au.com.woolworths.feature.shop.notification.preferences.di.ShopNotificationPreferencesModule;
import au.com.woolworths.feature.shop.notification.preferences.di.ShopNotificationPreferencesModule_ProvidePreferencesCommInteractorFactory;
import au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestFragment;
import au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestViewModel;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesCommInteractor;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor;
import au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository;
import au.com.woolworths.feature.shop.onboarding.OnboardingActivity;
import au.com.woolworths.feature.shop.onboarding.OnboardingActivity_MembersInjector;
import au.com.woolworths.feature.shop.onboarding.OnboardingViewModel;
import au.com.woolworths.feature.shop.onboarding.sdui.DefaultOnboardingContentPageDataProviderImpl;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiActivity;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiViewModel;
import au.com.woolworths.feature.shop.onboarding.sdui.di.OnboardingSduiAppModule;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityInteractor;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityRepository;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityViewModel;
import au.com.woolworths.feature.shop.product.availability.di.ProductAvailabilityModule;
import au.com.woolworths.feature.shop.product.availability.di.ProductAvailabilityModule_ProvideProductAvailabilityInteractorFactory;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity_MembersInjector;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel;
import au.com.woolworths.feature.shop.recipes.details.di.RecipeDetailsAppModule;
import au.com.woolworths.feature.shop.recipes.details.di.RecipeDetailsAppModule_ProvideRecipeDetailsInteractorFactory;
import au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineRepositoryImpl;
import au.com.woolworths.feature.shop.recipes.freshmag.content.data.SaleFinderConfigInteractor;
import au.com.woolworths.feature.shop.recipes.freshmag.content.data.SaleFinderInterceptor;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.MagazineInteractor;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity_MembersInjector;
import au.com.woolworths.feature.shop.recipes.freshmag.di.FreshMagModule_Companion_ProvideCatalogueOkHttpClientFactory;
import au.com.woolworths.feature.shop.recipes.freshmag.di.FreshMagModule_Companion_ProvideMagazineServiceFactory;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeRepositoryImpl;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeInteractor;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity_MembersInjector;
import au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor;
import au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository;
import au.com.woolworths.feature.shop.recipes.recipes.di.RecipesAppModule;
import au.com.woolworths.feature.shop.recipes.recipes.di.RecipesAppModule_ProvideRecipesFeatureFactory;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity_MembersInjector;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesViewModel;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity_MembersInjector;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListViewModel;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchInteractor;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchRepository;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorInteractor;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorViewModel;
import au.com.woolworths.feature.shop.shippingcalculator.di.ShippingCalculatorAppModule;
import au.com.woolworths.feature.shop.shippingcalculator.di.ShippingCalculatorAppModule_ProvidesShippingCalculatorInteractorFactory;
import au.com.woolworths.feature.shop.signup.SignUpActivity;
import au.com.woolworths.feature.shop.signup.SignUpViewModel;
import au.com.woolworths.feature.shop.signup.api.SignUpConfig;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsViewModel;
import au.com.woolworths.feature.shop.storelocator.di.ShopStoreLocatorAppModule;
import au.com.woolworths.feature.shop.storelocator.di.ShopStoreLocatorAppModule_ProvideStoreLocatorRepositoryFactory;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorActivity;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorActivity_MembersInjector;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity_MembersInjector;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorInteractor;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsActivity;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsActivity_MembersInjector;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultActivity;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultActivity_MembersInjector;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultViewModel;
import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor;
import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversRepository;
import au.com.woolworths.feature.shop.video.FullPageVideoPlayerViewModel;
import au.com.woolworths.feature.shop.voc.VocFeature;
import au.com.woolworths.feature.shop.voc.VocRepository;
import au.com.woolworths.feature.shop.voc.di.VocAppModule;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextInteractor;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextViewModel;
import au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor;
import au.com.woolworths.feature.shop.voc.score.VocInteractor;
import au.com.woolworths.feature.shop.voc.score.VocViewModel;
import au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewViewModel;
import au.com.woolworths.feature.shop.weblink.WebLinkActivity;
import au.com.woolworths.feature.shop.weblink.WebLinkInteractor;
import au.com.woolworths.feature.shop.weblink.WebLinkRepository;
import au.com.woolworths.feature.shop.weblink.WebLinkViewModel;
import au.com.woolworths.feature.shop.wpay.WPayFeature;
import au.com.woolworths.feature.shop.wpay.data.json.parser.CreditCardFormEventParser;
import au.com.woolworths.feature.shop.wpay.data.json.parser.GooglePayDataParser;
import au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository;
import au.com.woolworths.feature.shop.wpay.data.source.CreditCardDataRepository;
import au.com.woolworths.feature.shop.wpay.data.source.FraudPreventionDataRepository;
import au.com.woolworths.feature.shop.wpay.data.source.GiftCardDataRepository;
import au.com.woolworths.feature.shop.wpay.data.source.PayPalDataRepository;
import au.com.woolworths.feature.shop.wpay.data.source.PaymentIdentityDataRepository;
import au.com.woolworths.feature.shop.wpay.di.ShopWPayAppModule;
import au.com.woolworths.feature.shop.wpay.di.ShopWPayAppModule_ProvidesMagnesSDKFactory;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddGiftCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetPaymentInstrumentsInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.LinkCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkGiftCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkPayPalInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardAnalyticsTracker;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardAnalyticsTracker;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardViewModel;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CurrencyFormatter;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayAnalyticsTracker;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel;
import au.com.woolworths.foundation.advertising.data.di.AdvertisingAppModule;
import au.com.woolworths.foundation.advertising.data.di.AdvertisingAppModule_ProvidesGoogleAdManagerInteractorFactory;
import au.com.woolworths.foundation.advertising.data.di.AdvertisingAppModule_ProvidesGoogleAdManagerRepositoryFactory;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdLoadingTimeoutConfig;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxChatbotSessionIdSource;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxClient;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxUserIdSource;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.bark.engine.reporting.ErrorReporter;
import au.com.woolworths.foundation.bark.engine.tracing.Tracer;
import au.com.woolworths.foundation.bark.release.ReleaseBarker;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl;
import au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl;
import au.com.woolworths.foundation.force.upgrade.impl.datastore.AppConfigDataStoreKt;
import au.com.woolworths.foundation.force.upgrade.impl.datastore.SoftUpgradeAlertBannerStoreKt;
import au.com.woolworths.foundation.force.upgrade.impl.datastore.UpgradeConfigDataStoreKt;
import au.com.woolworths.foundation.force.upgrade.impl.di.ForceUpgradeAppModule;
import au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher;
import au.com.woolworths.foundation.google.pay.GooglePayManager;
import au.com.woolworths.foundation.navigation.LinkNavigator;
import au.com.woolworths.foundation.navigation.RealLinkNavigator;
import au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractor;
import au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissRepository;
import au.com.woolworths.foundation.rewards.banner.dismiss.di.RemoteDismissibleBannerModule;
import au.com.woolworths.foundation.rewards.banner.dismiss.di.RemoteDismissibleBannerModule_ProvideBannerRemoteDismissInteractorFactory;
import au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractor;
import au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractorImpl;
import au.com.woolworths.foundation.rewards.cart.info.data.CartInfoRepositoryImpl;
import au.com.woolworths.foundation.rewards.cart.info.di.CartInfoModule;
import au.com.woolworths.foundation.rewards.cart.update.CartUpdateManager;
import au.com.woolworths.foundation.rewards.cart.update.CartUpdateManagerImpl;
import au.com.woolworths.foundation.rewards.cart.update.data.CartQuantitiesInteractorImpl;
import au.com.woolworths.foundation.rewards.cart.update.data.CartQuantitiesRepository;
import au.com.woolworths.foundation.rewards.cart.update.di.CartUpdateModule;
import au.com.woolworths.foundation.rewards.offers.event.routing.RewardsOffersEventRouter;
import au.com.woolworths.foundation.rewards.offers.model.analytics.BranchAnalyticsManager;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager;
import au.com.woolworths.foundation.rewards.onboarding.di.RewardsOnboardingAppModule;
import au.com.woolworths.foundation.rewards.onboarding.di.RewardsOnboardingAppModule_ProvideOnboardingManagerFactory;
import au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarksViewModel;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl;
import au.com.woolworths.foundation.rewards.servicemessages.di.RewardsServiceMessageModule;
import au.com.woolworths.foundation.rewards.servicemessages.di.RewardsServiceMessageModule_ProvideRewardsServiceMessageInteractorFactory;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shared.instore.wifi.WiFiStoreDetailsAnalyticsProvider;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.collectionmode.di.CollectionModeModule;
import au.com.woolworths.foundation.shop.collectionmode.di.CollectionModeModule_ProvideLegacyShoppingModeRepositoryFactory;
import au.com.woolworths.foundation.shop.collectionmode.di.CollectionModeModule_ProvideRepositoryManagerFactory;
import au.com.woolworths.foundation.shop.collectionmode.di.CollectionModeModule_ProvidesCollectionModeInteractorImplFactory;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkHandlerViewModel;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkInteractor;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkRepository;
import au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity;
import au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity_MembersInjector;
import au.com.woolworths.foundation.shop.editorder.EditOrderFeature;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl;
import au.com.woolworths.foundation.shop.editorder.EditOrderRepository;
import au.com.woolworths.foundation.shop.editorder.di.EditOrderModule;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerViewModel;
import au.com.woolworths.foundation.shop.instore.navigation.InstoreNavigationFeature;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.shop.instore.presence.InstorePresenceFeature;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetRepository;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetViewModel;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceFeature;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceInteractorImpl;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceSpeechRecogniserImpl;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.di.OliveVoiceAppModule;
import au.com.woolworths.foundation.shop.olive.voice.di.OliveVoiceModule;
import au.com.woolworths.foundation.shop.olive.voice.di.OliveVoiceModule_ProvidesOliveVoiceInteractorFactory;
import au.com.woolworths.foundation.shop.olive.voice.di.OliveVoiceModule_ProvidesOliveVoiceRepositoryFactory;
import au.com.woolworths.foundation.shop.olive.voice.di.OliveVoiceModule_ProvidesOliveVoiceSpeechRecogniserFactory;
import au.com.woolworths.foundation.shop.olive.voice.di.OliveVoiceModule_ProvidesSharedPreferencesFactory;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingInteractorImpl;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingRepository;
import au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import au.com.woolworths.foundation.swrve.embedded.campaign.EmbeddedCampaignProcessor;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignActivity;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignActivity_MembersInjector;
import au.com.woolworths.foundation.wxid.impl.WxidClientImpl;
import au.com.woolworths.foundation.wxid.impl.WxidSessionImpl;
import au.com.woolworths.foundation.wxid.impl.data.WxidDataStoreKt;
import au.com.woolworths.foundation.wxid.impl.di.WxidAppModule;
import au.com.woolworths.foundation.wxid.shop.ShopWxidFetcher;
import au.com.woolworths.foundation.wxid.shop.di.ShopWxidAppModule;
import au.com.woolworths.geolocation.di.FusedLocationModule;
import au.com.woolworths.geolocation.di.GeolocationAppModule;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationRepository;
import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport;
import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage;
import au.com.woolworths.marketing.SwrveInteractor;
import au.com.woolworths.marketing.di.MarketingAppModule;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import au.com.woolworths.product.ProductFeature;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.addtocart.AddToCartViewModel;
import au.com.woolworths.product.cartpreauth.CartPreAuthViewModel;
import au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetViewModel;
import au.com.woolworths.product.details.HealthierBottomSheetViewModel;
import au.com.woolworths.product.details.LegacyProductDetailsActivity;
import au.com.woolworths.product.details.LegacyProductDetailsActivity_MembersInjector;
import au.com.woolworths.product.details.ProductDetailsFeature;
import au.com.woolworths.product.details.ProductDetailsInteractor;
import au.com.woolworths.product.details.ProductDetailsRepository;
import au.com.woolworths.product.details.di.ProductDetailsAppModule;
import au.com.woolworths.product.di.ProductAppModule;
import au.com.woolworths.product.infoview.ProductInfoView;
import au.com.woolworths.product.interactor.ProductsInteractor;
import au.com.woolworths.product.interactor.ProductsRepository;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.offers.ProductBoostRepository;
import au.com.woolworths.product.offers.ProductBoostResultViewModel;
import au.com.woolworths.product.offers.ProductsBoostView;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetViewModel;
import au.com.woolworths.promotion.banner.PromotionBannerFeature;
import au.com.woolworths.promotion.banner.di.PromotionBannerAppModule;
import au.com.woolworths.promotion.banner.ui.PromotionViewModel;
import au.com.woolworths.rewards.base.DeepLinkInteractor;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import au.com.woolworths.rewards.base.ShopAppInstallationInteractor;
import au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor;
import au.com.woolworths.rewards.base.di.BaseRewardsAppModule;
import au.com.woolworths.rewards.base.di.BaseRewardsAppModule_ProvideAccountNotificationBadgeInteractorFactory;
import au.com.woolworths.rewards.base.di.BaseRewardsAppModule_ProvideDeepLinkInteractorFactory;
import au.com.woolworths.rewards.base.di.BaseRewardsAppModule_ProvideHomeRefreshInteractorFactory;
import au.com.woolworths.rewards.base.di.BaseRewardsAppModule_ProvideRefreshNotifierFactory;
import au.com.woolworths.rewards.base.di.BaseRewardsAppModule_ProvideRewardsBannerInteractorFactory;
import au.com.woolworths.rewards.base.di.BaseRewardsAppModule_ProvideRewardsPageScrollInteractorFactory;
import au.com.woolworths.rewards.base.featuretoggles.RewardsRemoteConfig;
import au.com.woolworths.rewards.base.homepage.AccountNotificationBadgeInteractor;
import au.com.woolworths.rewards.base.homepage.HomeRefreshInteractor;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import au.com.woolworths.rewards.base.optimizedrefresh.RefreshNotifier;
import au.com.woolworths.rewards.base.points.RewardsPointsBalanceInteractor;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule_ProvideGsonFactory;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule_ProvideLocalStorageFactory;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule_ProvideOnCredentialsExpiredFactory;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule_ProvideScanAndGoApiFactory;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule_ProvideScanAndGoInteractorFactory;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule_ProvideScanAndGoRepositoryFactory;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule_ProvidesSharedPreferencesFactory;
import au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalInteractor;
import au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalViewModel;
import au.com.woolworths.sdui.rewards.broadcastbanner.RemoteDismissibleBannerViewModel;
import au.com.woolworths.sdui.shop.broadcastbanner.data.BannerDismissDataStoreKt;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel;
import au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel;
import au.com.woolworths.shop.auth.AccountRepository;
import au.com.woolworths.shop.auth.AuthInteractor;
import au.com.woolworths.shop.auth.AuthRepository;
import au.com.woolworths.shop.auth.KeycloakTokenAuthenticator;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import au.com.woolworths.shop.auth.ShopAuthManager;
import au.com.woolworths.shop.auth.ShopAuthenticator;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule_ProvideAccountRepositoryFactory;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule_ProvideAuthInteractorFactory;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule_ProvideAuthRepositoryFactory;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule_ProvideAuthTokenApiFactory;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule_ProvideKeycloakTokenAuthenticatorFactory;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule_ProvideShopAccountInteractorFactory;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule_ProvideShopAppTokenAuthenticatorFactory;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule_ProvideShopTokenAuthenticatorFactory;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager;
import au.com.woolworths.shop.auth.keycloak.data.KeycloakAuthFeature;
import au.com.woolworths.shop.buyagain.ShopBuyAgainFeature;
import au.com.woolworths.shop.buyagain.data.BuyAgainRepositoryImpl;
import au.com.woolworths.shop.buyagain.di.BuyAgainAppModule;
import au.com.woolworths.shop.buyagain.di.BuyAgainAppModule_ProvideBuyAgainEntryPointInteractorFactory;
import au.com.woolworths.shop.buyagain.domain.BuyAgainEntryPointInteractor;
import au.com.woolworths.shop.buyagain.domain.BuyAgainInteractor;
import au.com.woolworths.shop.buyagain.ui.BuyAgainActivity;
import au.com.woolworths.shop.buyagain.ui.BuyAgainActivity_MembersInjector;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy;
import au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorViewModel;
import au.com.woolworths.shop.cart.ShopCartFeature;
import au.com.woolworths.shop.cart.data.CartRepositoryImpl;
import au.com.woolworths.shop.cart.data.ProductReviewAlternativeDataRepository;
import au.com.woolworths.shop.cart.data.ProductReviewDataRepository;
import au.com.woolworths.shop.cart.data.QuickAddOfferDataRepository;
import au.com.woolworths.shop.cart.di.ShopCartAppModule_ProvideReplaceProductResultRouterFactory;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.domain.interactor.ProductReviewAlternativeFetchPage;
import au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage;
import au.com.woolworths.shop.cart.domain.interactor.ProductReviewUpdateQuantityProduct;
import au.com.woolworths.shop.cart.domain.interactor.QuickAddOfferInteractor;
import au.com.woolworths.shop.cart.ui.CartActivity;
import au.com.woolworths.shop.cart.ui.CartActivity_MembersInjector;
import au.com.woolworths.shop.cart.ui.CartBadgeActionViewModel;
import au.com.woolworths.shop.cart.ui.cart.CartFragment;
import au.com.woolworths.shop.cart.ui.cart.CartViewModel;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeAnalytics;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewAnalytics;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel;
import au.com.woolworths.shop.cart.ui.productreview.ReplaceProductResultRouter;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import au.com.woolworths.shop.checkout.data.mappers.PaymentResponseMapper;
import au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository;
import au.com.woolworths.shop.checkout.data.source.CheckoutSummaryRepository;
import au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository;
import au.com.woolworths.shop.checkout.data.source.SubstitutionRepository;
import au.com.woolworths.shop.checkout.di.ShopCheckoutAppModule;
import au.com.woolworths.shop.checkout.di.ShopCheckoutAppModule_ProvideCheckoutPaymentRepository$shop_checkout_releaseFactory;
import au.com.woolworths.shop.checkout.di.ShopCheckoutAppModule_ProvideCheckoutTimeSelectorRepository$shop_checkout_releaseFactory;
import au.com.woolworths.shop.checkout.domain.interactor.MakePayment;
import au.com.woolworths.shop.checkout.domain.interactor.MakeZeroPayment;
import au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor;
import au.com.woolworths.shop.checkout.domain.interactor.timeselector.GetTimeSelectorDataInteractor;
import au.com.woolworths.shop.checkout.domain.interactor.timeselector.ReserveTimeSlotInteractor;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContentViewModel;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
import au.com.woolworths.shop.checkout.ui.content.bottomsheet.MarketplacePickupBottomSheetViewModel;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupFragment;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity_MembersInjector;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationInteractor;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationRepository;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductFragment;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryInteractor;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel;
import au.com.woolworths.shop.checkout.ui.summary.refund.RefundViewModel;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpRepository;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity_MembersInjector;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld;
import au.com.woolworths.shop.deliveryunlimited.signup.data.source.PaymentDataRepository;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity_MembersInjector;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity_MembersInjector;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanViewModel;
import au.com.woolworths.shop.digipay.DigipayInteractor;
import au.com.woolworths.shop.digipay.creditcard.CreditCardFragment;
import au.com.woolworths.shop.digipay.creditcard.CreditCardViewModel;
import au.com.woolworths.shop.digipay.di.DigipaySdkAppModule;
import au.com.woolworths.shop.digipay.di.DigipaySdkAppModule_ProvideDigitalPayClientFactory;
import au.com.woolworths.shop.digipay.di.DigipaySdkAppModule_ProvideDigitalPayConfigurationFactory;
import au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting;
import au.com.woolworths.shop.graphql.type.TealiumAnalytics;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.lists.data.PastShopInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import au.com.woolworths.shop.lists.data.SimilarProductsInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.data.database.CategoryDao;
import au.com.woolworths.shop.lists.data.database.ProductDao;
import au.com.woolworths.shop.lists.data.database.ProductListItemDao;
import au.com.woolworths.shop.lists.data.database.ShoppingListDao;
import au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase;
import au.com.woolworths.shop.lists.data.database.TextListItemDao;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule_ProvidePastShopInteractorFactory;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule_ProvidePurchaseHistoryRepositoryFactory;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule_ProvideShoppingListInteractorFactory;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule_ProvideShoppingListItemInteractorFactory;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule_ProvideSimilarProductsInteractorFactory;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule_ProvideSimilarProductsRepositoryFactory;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule_ProvideSuggestedListsRepositoryFactory;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule_ProvideWatchlistInteractorFactory;
import au.com.woolworths.shop.lists.data.di.ShopListsDataModule;
import au.com.woolworths.shop.lists.data.di.ShopListsDataModule_ProvideSuggestedListsInteractorFactory;
import au.com.woolworths.shop.lists.data.di.ShoppingListDbMigration;
import au.com.woolworths.shop.lists.data.di.ShoppingListsSyncWorkerFactory;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository;
import au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository;
import au.com.woolworths.shop.lists.data.repository.SuggestedListsRepository;
import au.com.woolworths.shop.lists.data.sync.ShoppingListSyncRepository;
import au.com.woolworths.shop.lists.data.sync.scheduler.SyncScheduler;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.di.ShopListsAppModule;
import au.com.woolworths.shop.lists.di.ShopListsAppModule_ProvideApigeeXApiFactory;
import au.com.woolworths.shop.lists.di.ShopListsAppModule_ProvideApigeeXGsonFactory;
import au.com.woolworths.shop.lists.di.ShopListsAppModule_ProvideImageToTextRepositoryFactory;
import au.com.woolworths.shop.lists.di.ShopListsAppModule_ProvideListDetailsInteractor$shop_lists_releaseFactory;
import au.com.woolworths.shop.lists.di.ShopListsAppModule_ProvideMagicMatchInteractor$shop_lists_releaseFactory;
import au.com.woolworths.shop.lists.di.ShopListsAppModule_ProvideMagicMatchRepository$shop_lists_releaseFactory;
import au.com.woolworths.shop.lists.di.ShopListsAppModule_ProvideProductItemStateFactory;
import au.com.woolworths.shop.lists.di.ShopListsAppModule_ProvidesListsDataStoreFactory;
import au.com.woolworths.shop.lists.network.ApigeeXApi;
import au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractor;
import au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsRepository;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewModel;
import au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingActivity;
import au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingActivity_MembersInjector;
import au.com.woolworths.shop.lists.ui.lists.ListsViewModel;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel;
import au.com.woolworths.shop.lists.ui.lists.sng.SngListsViewModel;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel;
import au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchInteractor;
import au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity_MembersInjector;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsViewModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostExt;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ProductItemState;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity_MembersInjector;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetViewModel;
import au.com.woolworths.shop.lists.ui.snapalist.main.CameraCaptureManager;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity_MembersInjector;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorViewModel;
import au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity_MembersInjector;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetViewModel;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel;
import au.com.woolworths.shop.product.details.ProductDetailsActivity;
import au.com.woolworths.shop.product.details.ProductDetailsActivity_MembersInjector;
import au.com.woolworths.shop.product.details.ProductDetailsPageInteractor;
import au.com.woolworths.shop.product.details.ProductDetailsPageRepository;
import au.com.woolworths.shop.product.details.ProductDetailsViewModel;
import au.com.woolworths.shop.product.details.di.ProductDetailsAppModule_ProvidesProductDetailsInteractorFactory;
import au.com.woolworths.shop.product.navigation.di.ShopProductNavigationModule;
import au.com.woolworths.shop.product.navigation.di.ShopProductNavigationModule_ProvideProductCategoryRepositoryFactory;
import au.com.woolworths.shop.product.navigation.di.ShopProductNavigationModule_ProvideProductNavigationInteractorFactory;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryViewModel;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity_MembersInjector;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity_MembersInjector;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsInteractor;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsRepository;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity_MembersInjector;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewInteractor;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewRepository;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel;
import au.com.woolworths.shop.receipt.details.ShopReceiptDetailsRepository;
import au.com.woolworths.shop.receipt.details.di.ShopReceiptDetailsAppModule;
import au.com.woolworths.shop.receipt.details.di.ShopReceiptDetailsAppModule_ProvidesEReceiptDetailsRepository$receipts_releaseFactory;
import au.com.woolworths.shop.receipt.details.di.ShopReceiptDetailsAppModule_ProvidesStoreLocationProvider$receipts_releaseFactory;
import au.com.woolworths.shop.receipts.GetReceiptListInteractor;
import au.com.woolworths.shop.receipts.ReceiptListRepository;
import au.com.woolworths.shop.receipts.ShopReceiptListViewModel;
import au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter;
import au.com.woolworths.shop.rewards.RewardsActivityLegacy;
import au.com.woolworths.shop.rewards.RewardsActivityLegacy_MembersInjector;
import au.com.woolworths.shop.rewards.RewardsViewModelLegacy;
import au.com.woolworths.shop.rewards.ShopRewardsActivity;
import au.com.woolworths.shop.rewards.ShopRewardsActivity_MembersInjector;
import au.com.woolworths.shop.rewards.ShopRewardsViewModel;
import au.com.woolworths.shop.rewards.priming.GetScreenDataInteractor;
import au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel;
import au.com.woolworths.shop.rewards.priming.repository.PrimingScreenRepositoryImpl;
import au.com.woolworths.shop.rewards.promo.PromoAppViewModel;
import au.com.woolworths.shop.rewards.promo.domain.PromoRewardsAppInteractor;
import au.com.woolworths.shop.rewards.promo.repository.RewardsAppModalRepository;
import au.com.woolworths.shop.securedpreference.preference.SecuredSharedPreference;
import au.com.woolworths.shop.specials.SpecialsHomeFeature;
import au.com.woolworths.shop.specials.SpecialsHomeFragment;
import au.com.woolworths.shop.specials.SpecialsHomeInteractor;
import au.com.woolworths.shop.specials.SpecialsHomeRepository;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.DefaultInterceptorChain;
import com.apollographql.apollo.network.OkHttpExtensionsKt;
import com.apollographql.apollo.network.http.DefaultHttpEngine;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.tealium.core.Environment;
import com.tealium.core.Tealium;
import com.tealium.core.TealiumConfig;
import com.tealium.tagmanagementdispatcher.TagManagementDispatcher;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.base.coroutine.CoroutineContextProvider;
import com.woolworths.scanlibrary.base.mvvm.SnGViewModelFactory;
import com.woolworths.scanlibrary.configuration.AppConfigurations;
import com.woolworths.scanlibrary.configuration.OnSngAppCloseHandler;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.configuration.ScanAndGoRemoteConfig;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.authentication.TokenAuthenticator;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.data.cart.SngShoppingSession;
import com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl;
import com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepositoryImpl;
import com.woolworths.scanlibrary.data.payment.PaymentDetail;
import com.woolworths.scanlibrary.data.payment.PaymentDetailImpl;
import com.woolworths.scanlibrary.data.source.remote.TokenRefreshService;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindAvailableStoreListActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindAvailableStotresActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindContactUsActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindMessageActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindOnBoardingActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindParkingVoucherActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindPaymentSetupActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindSetupCompleteActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindSngEntryActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindSngRewardsSetupActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindSplashActivity;
import com.woolworths.scanlibrary.di.module.ActivityBuilderModule_BindTermsConditions;
import com.woolworths.scanlibrary.di.module.BffScanNGoModule;
import com.woolworths.scanlibrary.di.module.BffScanNGoModule_ProvideBffScanAndGoRepositoryFactory;
import com.woolworths.scanlibrary.di.module.BffScanNGoModule_ProvideGsonFactory;
import com.woolworths.scanlibrary.di.module.BffScanNGoModule_ProvideLocalStorageFactory;
import com.woolworths.scanlibrary.di.module.BffScanNGoModule_ProvideScanAndGoBffApiFactory;
import com.woolworths.scanlibrary.di.module.BffScanNGoModule_ProvideScanAndGoInteractorFactory;
import com.woolworths.scanlibrary.di.module.ScanAndGoConfig;
import com.woolworths.scanlibrary.di.module.ScanNGoModule;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_CreateBaseHttpClientFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_CreateHttpPartnerPreAuthClientFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_CreateHttpRefreshClientFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_CreateSngHttpClientFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetApigeeServicesFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetAuthenticatedUserInfoFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetCollectionUrlFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetFaqUsUrlFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetHostUrlFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetLocalTokenProviderFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetMerchantProfilesFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetPrivacyUrlFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetRefreshTokenServiceFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetRemoteSourceFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetRewardPreAuthAPIKeyInterceptorFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetRewardPreAuthServiceFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetSchedulerFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetSecuredSharedPreferenceFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetSharedPreferenceFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetSngAPIKeyInterceptorFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetSngAuthorizationHeaderInterceptorFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetSngDisableInAppPaymentToggleInterceptorFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetTnCUrlFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetTokenAuthenticatorFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_GetTokenProviderFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideAggregatedAnalyticsFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideContextFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideDeviceInfoProviderFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideDigitalPayClientFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideDigitalPayConfigurationProviderFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideGsonFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideResourceResolverFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideSngShoppingSessionFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideSurveyManagerFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvideUserManagerFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvidesDeviceRegistrationUCFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvidesGetAvailableStoresUCFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvidesRewardSignInInitUseCaseFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvidesSignInUseCaseFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoModule_ProvidesUserConfigurationFactory;
import com.woolworths.scanlibrary.di.module.ScanNGoNotificationModule;
import com.woolworths.scanlibrary.di.module.ViewModelModule;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvideAddPaymentSetupViewModelFactory;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvideAvailableStoreViewModelFactory;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvideExitScanCodeViewModelFactory;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvideScannerViewModelFactory;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvideSearchViewModelFactory;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvideSetupUpCompleteViewModelFactory;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvideSngEntryViewModelFactory;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvideSngRewardSetupViewModel$scanGoLibrary_releaseFactory;
import com.woolworths.scanlibrary.di.module.ViewModelModule_ProvidesViewModelFactoryFactory;
import com.woolworths.scanlibrary.di.session.CartSessionComponent;
import com.woolworths.scanlibrary.di.session.CartSessionModule;
import com.woolworths.scanlibrary.di.session.SessionActivityBuilderModule_BindAddItemActivity;
import com.woolworths.scanlibrary.di.session.SessionActivityBuilderModule_BindCheckOutActivity;
import com.woolworths.scanlibrary.di.session.SessionActivityBuilderModule_BindHomeActivity;
import com.woolworths.scanlibrary.di.session.SessionActivityBuilderModule_BindProductInfoActivity;
import com.woolworths.scanlibrary.di.session.SessionActivityBuilderModule_BindScannerActivity;
import com.woolworths.scanlibrary.di.session.SessionActivityBuilderModule_BindScannerActivityOld;
import com.woolworths.scanlibrary.di.session.SessionActivityBuilderModule_BindShoppingCartActivity;
import com.woolworths.scanlibrary.di.session.SessionActivityBuilderModule_BindWeightedArticleSelectionActivity;
import com.woolworths.scanlibrary.di.user.UserActivityBuilderModule_BindAddPaymentActivity;
import com.woolworths.scanlibrary.di.user.UserActivityBuilderModule_BindExitScanCodeActivity;
import com.woolworths.scanlibrary.di.user.UserActivityBuilderModule_BindMyAccountActivity;
import com.woolworths.scanlibrary.di.user.UserActivityBuilderModule_BindReceiptActivity;
import com.woolworths.scanlibrary.di.user.UserActivityBuilderModule_BindSearchActivity;
import com.woolworths.scanlibrary.di.user.UserActivityBuilderModule_BindTapOnActivity;
import com.woolworths.scanlibrary.di.user.UserActivityBuilderModule_BindTransactionListActivity;
import com.woolworths.scanlibrary.di.user.UserActivityBuilderModule_BindUpdateCreditCardActivity;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.di.user.UserModule;
import com.woolworths.scanlibrary.domain.cart.AddToCartUseCase;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.cart.CheckoutCartUseCase;
import com.woolworths.scanlibrary.domain.cart.ClearCartUseCase;
import com.woolworths.scanlibrary.domain.cart.GetCartUseCase;
import com.woolworths.scanlibrary.domain.cart.PendingPromotionUseCase;
import com.woolworths.scanlibrary.domain.cart.RemoveItemUseCase;
import com.woolworths.scanlibrary.domain.cart.UpdateProductUseCase;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.domain.exit.GetFireStoreAccessUC;
import com.woolworths.scanlibrary.domain.launch.FetchScanAndGoInteractor;
import com.woolworths.scanlibrary.domain.locator.GetStoreDetailsUseCase;
import com.woolworths.scanlibrary.domain.locator.GetTapOnStoreDetailsUseCase;
import com.woolworths.scanlibrary.domain.login.GetProfileUC;
import com.woolworths.scanlibrary.domain.login.LogoutManager;
import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.domain.login.SignoutUC;
import com.woolworths.scanlibrary.domain.login.TermsNConditionUC;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.domain.payment.GetInstrumentsUC;
import com.woolworths.scanlibrary.domain.payment.MakePaymentUC;
import com.woolworths.scanlibrary.domain.payment.MakeZeroAmountPaymentUC;
import com.woolworths.scanlibrary.domain.payment.RemoveInstrumentUC;
import com.woolworths.scanlibrary.domain.productsearch.AutoCompleteUC;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.domain.receipt.GetEmailReceiptUC;
import com.woolworths.scanlibrary.domain.receipt.GetParkingReceiptUC;
import com.woolworths.scanlibrary.domain.receipt.GetReceiptWithCartIdUC;
import com.woolworths.scanlibrary.domain.servicemessage.GetServiceMessageUC;
import com.woolworths.scanlibrary.domain.survey.SurveyManager;
import com.woolworths.scanlibrary.domain.transaction.GetTransactionListUseCase;
import com.woolworths.scanlibrary.domain.transfertopos.RecallConfirmAtPosUC;
import com.woolworths.scanlibrary.domain.transfertopos.TransferToPosUC;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.models.user.User;
import com.woolworths.scanlibrary.services.SNGFirebaseMessagingHandler;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartActivity;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartActivityPresenter;
import com.woolworths.scanlibrary.ui.cart.di.ShoppingCartActivityModule;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.CartPresenter;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.ShoppingCartFragment;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.di.CartFragmentModule;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.di.FragmentProviderModule_ProvideFragmentFactory;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.ui.checkout.CheckOutPresenter;
import com.woolworths.scanlibrary.ui.checkout.di.CheckOutActivityModule;
import com.woolworths.scanlibrary.ui.checkout.di.CheckOutFragmentModule;
import com.woolworths.scanlibrary.ui.checkout.di.CheckOutFragmentProviderModule_ProvideFragmentFactory;
import com.woolworths.scanlibrary.ui.checkout.di.CheckOutFragmentProviderModule_ProvideInstrumentListFragmentFactory;
import com.woolworths.scanlibrary.ui.checkout.di.CheckOutFragmentProviderModule_ProvideStepUpDialogFragmentFactory;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.ui.checkout.pay.PayPresenter;
import com.woolworths.scanlibrary.ui.checkout.stepup.StepUpDialogFragment;
import com.woolworths.scanlibrary.ui.entry.SngEntryActivity;
import com.woolworths.scanlibrary.ui.entry.SngEntryViewModel;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentProvider;
import com.woolworths.scanlibrary.ui.entry.launcher.SngLauncherImpl;
import com.woolworths.scanlibrary.ui.entry.launcher.navadapter.ScanAndGoNavAdapterImpl;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel;
import com.woolworths.scanlibrary.ui.home.HomeActivity;
import com.woolworths.scanlibrary.ui.home.HomeActivityPresenter;
import com.woolworths.scanlibrary.ui.home.di.HomeActivityFragmentProviderModule_ProvideFragmentFactory;
import com.woolworths.scanlibrary.ui.home.di.HomeActivityFragmentProviderModule_ProvideItemViewFragmentFactory;
import com.woolworths.scanlibrary.ui.home.di.HomeActivityModule;
import com.woolworths.scanlibrary.ui.home.di.HomeFragmentModule;
import com.woolworths.scanlibrary.ui.home.di.ItemViewFragmentModule;
import com.woolworths.scanlibrary.ui.home.homeview.HomeFragment;
import com.woolworths.scanlibrary.ui.home.homeview.HomePresenter;
import com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment;
import com.woolworths.scanlibrary.ui.home.itemview.ItemViewPresenter;
import com.woolworths.scanlibrary.ui.menu.contactus.ContactUsActivity;
import com.woolworths.scanlibrary.ui.menu.contactus.ContactUsPresenter;
import com.woolworths.scanlibrary.ui.menu.contactus.di.ContactUsActivityModule;
import com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountActivity;
import com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountsPresenter;
import com.woolworths.scanlibrary.ui.menu.myaccount.di.InstrumentProviderModule_ProvideInstrumentListFragmentFactory;
import com.woolworths.scanlibrary.ui.menu.myaccount.di.MyAccountActivityModule;
import com.woolworths.scanlibrary.ui.message.MessageActivity;
import com.woolworths.scanlibrary.ui.message.MessageActivityPresenter;
import com.woolworths.scanlibrary.ui.message.di.MessageActivityModule;
import com.woolworths.scanlibrary.ui.message.singleAction.MessagePresenter;
import com.woolworths.scanlibrary.ui.message.singleAction.MessageSingleActionFragment;
import com.woolworths.scanlibrary.ui.message.singleAction.di.MessageFragmentModule;
import com.woolworths.scanlibrary.ui.message.singleAction.di.MessageFragmentProviderModule_ProvideFragmentFactory;
import com.woolworths.scanlibrary.ui.navigation.ScreenNavigator;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPresenter;
import com.woolworths.scanlibrary.ui.onboarding.di.OnBoardingActivityModule;
import com.woolworths.scanlibrary.ui.parking.ParkingVoucherActivity;
import com.woolworths.scanlibrary.ui.parking.ParkingVoucherPresenter;
import com.woolworths.scanlibrary.ui.parking.di.ParkingVoucherActivityModule;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentPresenter;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.di.AddPaymentActivityModule;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListPresenter;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.di.InstrumentListFragmentModule;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.di.InstrumentListFragmentModule_GetInstrumentUseCaseFactory;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupActivity;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupViewModel;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardPresenter;
import com.woolworths.scanlibrary.ui.payment.updatecard.di.UpdateCreditCardActivityModule;
import com.woolworths.scanlibrary.ui.productInfo.ProductInfoActivity;
import com.woolworths.scanlibrary.ui.productInfo.ProductInfoActivityPresenter;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInformationPresenter;
import com.woolworths.scanlibrary.ui.productInfo.di.ProductInfoActivityModule;
import com.woolworths.scanlibrary.ui.productInfo.di.ProductInfoFragmentModule;
import com.woolworths.scanlibrary.ui.productInfo.di.ProductInfoFragmentProviderModule_ProvideFragmentFactory;
import com.woolworths.scanlibrary.ui.receipt.ReceiptActivity;
import com.woolworths.scanlibrary.ui.receipt.ReceiptPresenter;
import com.woolworths.scanlibrary.ui.receipt.di.ReceiptActivityModule;
import com.woolworths.scanlibrary.ui.reward.SngRewardSetupViewModel;
import com.woolworths.scanlibrary.ui.reward.SngRewardsSetupActivity;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivity;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;
import com.woolworths.scanlibrary.ui.scanner.ScannerPresenter;
import com.woolworths.scanlibrary.ui.scanner.ScannerViewModel;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemPresenter;
import com.woolworths.scanlibrary.ui.scanner.additem.di.AddItemActivityModule;
import com.woolworths.scanlibrary.ui.scanner.di.ScannerActivityModule;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupCompleteActivity;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupUpCompleteViewModel;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import com.woolworths.scanlibrary.ui.splash.SplashPresenter;
import com.woolworths.scanlibrary.ui.splash.di.SplashActivityModule;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreViewModel;
import com.woolworths.scanlibrary.ui.stores.AvailableStoresActivity;
import com.woolworths.scanlibrary.ui.tandc.TermsConditionsActivity;
import com.woolworths.scanlibrary.ui.tandc.TermsConditionsPresenter;
import com.woolworths.scanlibrary.ui.tandc.di.TermsConditionsActivityModule;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.ui.tap.TapPresenter;
import com.woolworths.scanlibrary.ui.tap.di.TapActivityModule;
import com.woolworths.scanlibrary.ui.tap.di.TapFragmentProviderModule_ProvideFragmentFactory;
import com.woolworths.scanlibrary.ui.tap.di.TapOnModule;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnPresenter;
import com.woolworths.scanlibrary.ui.transaction.TransactionListActivity;
import com.woolworths.scanlibrary.ui.transaction.TransactionListPresenter;
import com.woolworths.scanlibrary.ui.transaction.di.TransactionListActivityModule;
import com.woolworths.scanlibrary.ui.weighted.WeightedArticleSelectionActivity;
import com.woolworths.scanlibrary.ui.weighted.WeightedListPresenter;
import com.woolworths.scanlibrary.ui.weighted.di.WeightListActivityModule;
import com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import dagger.Lazy;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.time.Clock;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.sse.EventSources;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@DaggerGenerated
/* loaded from: classes.dex */
public final class DaggerShopApplication_HiltComponents_SingletonC {

    public static final class ActivityCBuilder implements ShopApplication_HiltComponents.ActivityC.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4079a;
        public final ActivityRetainedCImpl b;
        public Activity c;

        public ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.f4079a = singletonCImpl;
            this.b = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public final ActivityComponentBuilder a(Activity activity) {
            activity.getClass();
            this.c = activity;
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public final ActivityComponent build() {
            Preconditions.a(Activity.class, this.c);
            return new ActivityCImpl(this.f4079a, this.b, new LegacyActivityModule(), new ShopAppNavigatorModule(), this.c);
        }
    }

    public static final class ActivityCImpl extends ShopApplication_HiltComponents.ActivityC {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f4080a;
        public final LegacyActivityModule b;
        public final SingletonCImpl c;
        public final ActivityRetainedCImpl d;
        public final ActivityCImpl e = this;
        public final Provider f;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4081a;
            public final ActivityCImpl b;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ActivityCImpl activityCImpl) {
                this.f4081a = singletonCImpl;
                this.b = activityCImpl;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return new SearchViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ActivityCImpl.SwitchingProvider.1
                    @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.SearchViewModel.Factory
                    public final SearchViewModel a(ScreenOptions screenOptions) {
                        SwitchingProvider switchingProvider = SwitchingProvider.this;
                        SingletonCImpl singletonCImpl = switchingProvider.f4081a;
                        CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) singletonCImpl.q1.get();
                        SchedulersProvider schedulersProvider = (SchedulersProvider) singletonCImpl.o1.get();
                        AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
                        SingletonCImpl singletonCImpl2 = switchingProvider.b.c;
                        return new SearchViewModel(screenOptions, collectionModeInteractor, schedulersProvider, analyticsManager, new SearchInteractor((AppBuildConfig) singletonCImpl2.f2.get(), (ApiInterface) singletonCImpl2.H1.get(), (SchedulersProvider) singletonCImpl2.o1.get()), (LegacyShopAnalyticsManager) singletonCImpl.r1.get(), (NetworkExceptions) singletonCImpl.m1.get(), (TrafficDriversInteractor) singletonCImpl.u3.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get(), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), SingletonCImpl.S0(singletonCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), (WoolworthsSupermarketDatabase) singletonCImpl.O3.get());
                    }
                };
            }
        }

        public ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, LegacyActivityModule legacyActivityModule, ShopAppNavigatorModule shopAppNavigatorModule, Activity activity) {
            this.c = singletonCImpl;
            this.d = activityRetainedCImpl;
            this.f4080a = activity;
            this.b = legacyActivityModule;
            this.f = SingleCheck.a(new SwitchingProvider(singletonCImpl, this));
        }

        @Override // au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity_GeneratedInjector
        public final void A(RewardsCardOverlayActivity rewardsCardOverlayActivity) {
            RewardsCardOverlayActivity_MembersInjector.a(rewardsCardOverlayActivity, (AppIdentifier) this.c.Q3.get());
        }

        @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity_GeneratedInjector
        public final void A0(FoodTrackerActivity foodTrackerActivity) {
            FoodTrackerActivity_MembersInjector.a(foodTrackerActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity_GeneratedInjector
        public final void B(CameraPermissionActivity cameraPermissionActivity) {
            CameraPermissionActivity_MembersInjector.a(cameraPermissionActivity, (AppIdentifier) this.c.Q3.get());
        }

        @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsSetupMoreActivity_GeneratedInjector
        public final void B0(RewardsSetupMoreActivity rewardsSetupMoreActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(rewardsSetupMoreActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(rewardsSetupMoreActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
        }

        @Override // au.com.woolworths.feature.shared.notification.optin.NotificationOptInActivity_GeneratedInjector
        public final void C(NotificationOptInActivity notificationOptInActivity) {
            NotificationOptInActivity_MembersInjector.a(notificationOptInActivity, (NotificationManager) this.c.M3.get());
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity_GeneratedInjector
        public final void C0(RecipeListActivity recipeListActivity) {
            RecipeListActivity_MembersInjector.a(recipeListActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsActivity_GeneratedInjector
        public final void D(StoreDetailsActivity storeDetailsActivity) {
            StoreDetailsActivity_MembersInjector.a(storeDetailsActivity, (LaunchManager) this.c.P3.get());
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity_GeneratedInjector
        public final void D0(OrderDetailsActivity orderDetailsActivity) {
            SingletonCImpl singletonCImpl = this.c;
            OrderDetailsActivity_MembersInjector.a(orderDetailsActivity, (AnalyticsManager) singletonCImpl.r2.get());
            OrderDetailsActivity_MembersInjector.b(orderDetailsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            OrderDetailsActivity_MembersInjector.c(orderDetailsActivity, new PermissionFlagInteractorImpl(singletonCImpl.y1()));
            OrderDetailsActivity_MembersInjector.d(orderDetailsActivity, d1());
        }

        @Override // au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity_GeneratedInjector
        public final void E(CountrySelectorActivity countrySelectorActivity) {
            CountrySelectorActivity_MembersInjector.a(countrySelectorActivity, (ShopAuthManager) this.c.R3.get());
        }

        @Override // au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity_GeneratedInjector
        public final void E0(JoinWifiActivity joinWifiActivity) {
            SingletonCImpl singletonCImpl = this.c;
            JoinWifiActivity_MembersInjector.a(joinWifiActivity, (AppConfig) singletonCImpl.W0.get());
            JoinWifiActivity_MembersInjector.b(joinWifiActivity, (AppIdentifier) singletonCImpl.Q3.get());
            JoinWifiActivity_MembersInjector.c(joinWifiActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity_GeneratedInjector
        public final void F(DeliveryAddressSearchActivity deliveryAddressSearchActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(deliveryAddressSearchActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(deliveryAddressSearchActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            DeliveryAddressSearchActivity_MembersInjector.a(deliveryAddressSearchActivity, (ShopAccountInteractor) singletonCImpl.Y0.get());
            DeliveryAddressSearchActivity_MembersInjector.c(deliveryAddressSearchActivity, (SchedulersProvider) singletonCImpl.o1.get());
            DeliveryAddressSearchActivity_MembersInjector.b(deliveryAddressSearchActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity_GeneratedInjector
        public final void F0(YourGroceriesActivity yourGroceriesActivity) {
            SingletonCImpl singletonCImpl = this.c;
            YourGroceriesActivity_MembersInjector.a(yourGroceriesActivity, (AnalyticsManager) singletonCImpl.r2.get());
            YourGroceriesActivity_MembersInjector.b(yourGroceriesActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            YourGroceriesActivity_MembersInjector.c(yourGroceriesActivity, d1());
        }

        @Override // au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity_GeneratedInjector
        public final void G(CatalogueStoreSelectorActivity catalogueStoreSelectorActivity) {
            CatalogueStoreSelectorActivity_MembersInjector.a(catalogueStoreSelectorActivity, (AnalyticsManager) this.c.r2.get());
        }

        @Override // au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity_GeneratedInjector
        public final void G0(LegacyProductListActivity legacyProductListActivity) {
            LegacyProductListActivity_MembersInjector.a(legacyProductListActivity, (AnalyticsManager) this.c.r2.get());
            LegacyProductListActivity_MembersInjector.b(legacyProductListActivity, d1());
        }

        @Override // au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity_GeneratedInjector
        public final void H(AskOliveActivity askOliveActivity) {
            AskOliveActivity_MembersInjector.d(askOliveActivity, new AskOliveJsInterface());
            SingletonCImpl singletonCImpl = this.c;
            AskOliveActivity_MembersInjector.a(askOliveActivity, (AnalyticsManager) singletonCImpl.r2.get());
            AskOliveActivity_MembersInjector.b(askOliveActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            AskOliveActivity_MembersInjector.c(askOliveActivity, new WebChromeFileUploadHelper());
        }

        @Override // au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity_GeneratedInjector
        public final void H0(EverydayExtrasSignUpActivity everydayExtrasSignUpActivity) {
            EverydayExtrasSignUpActivity_MembersInjector.a(everydayExtrasSignUpActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesActivity_GeneratedInjector
        public final void I(ManageFullDeliveryAddressesActivity manageFullDeliveryAddressesActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(manageFullDeliveryAddressesActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(manageFullDeliveryAddressesActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            ManageFullDeliveryAddressesActivity_MembersInjector.a(manageFullDeliveryAddressesActivity, (ManageFullDeliveryAddressesContract.Presenter) this.d.r.get());
            ManageFullDeliveryAddressesActivity_MembersInjector.b(manageFullDeliveryAddressesActivity, (ShopAccountInteractor) singletonCImpl.Y0.get());
        }

        @Override // au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity_GeneratedInjector
        public final void I0(RewardsAuthenticationActivity rewardsAuthenticationActivity) {
            SingletonCImpl singletonCImpl = this.c;
            RewardsAuthenticationActivity_MembersInjector.a(rewardsAuthenticationActivity, (AnalyticsManager) singletonCImpl.r2.get());
            RewardsAuthenticationActivity_MembersInjector.c(rewardsAuthenticationActivity, SingletonCImpl.R0(singletonCImpl));
            RewardsAuthenticationActivity_MembersInjector.b(rewardsAuthenticationActivity, (AppIdentifier) singletonCImpl.Q3.get());
            RewardsAuthenticationActivity_MembersInjector.d(rewardsAuthenticationActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c);
            RewardsAuthenticationActivity_MembersInjector.e(rewardsAuthenticationActivity, (RewardsAccountInteractor) singletonCImpl.Y1.get());
        }

        @Override // au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorActivity_GeneratedInjector
        public final void J(StoreLocatorActivity storeLocatorActivity) {
            SingletonCImpl singletonCImpl = this.c;
            StoreLocatorActivity_MembersInjector.d(storeLocatorActivity, (LocationInteractor) singletonCImpl.D3.get());
            StoreLocatorActivity_MembersInjector.c(storeLocatorActivity, (LaunchManager) singletonCImpl.P3.get());
            StoreLocatorActivity_MembersInjector.a(storeLocatorActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            StoreLocatorActivity_MembersInjector.e(storeLocatorActivity, new PermissionFlagInteractorImpl(singletonCImpl.y1()));
            StoreLocatorActivity_MembersInjector.b(storeLocatorActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActivity_GeneratedInjector
        public final void J0(MarketplaceActivity marketplaceActivity) {
            SingletonCImpl singletonCImpl = this.c;
            MarketplaceActivity_MembersInjector.b(marketplaceActivity, (CartUpdateInteractor) singletonCImpl.D2.get());
            MarketplaceActivity_MembersInjector.a(marketplaceActivity, (AnalyticsManager) singletonCImpl.r2.get());
            MarketplaceActivity_MembersInjector.c(marketplaceActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity_GeneratedInjector
        public final void K(RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity) {
            SingletonCImpl singletonCImpl = this.c;
            RewardsRedemptionSettingsBottomSheetActivity_MembersInjector.a(rewardsRedemptionSettingsBottomSheetActivity, (AnalyticsManager) singletonCImpl.r2.get());
            RewardsRedemptionSettingsBottomSheetActivity_MembersInjector.b(rewardsRedemptionSettingsBottomSheetActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity_GeneratedInjector
        public final void K0(SelectPlanActivity selectPlanActivity) {
            SelectPlanActivity_MembersInjector.a(selectPlanActivity, (AnalyticsManager) this.c.r2.get());
        }

        @Override // au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity_GeneratedInjector
        public final void L(FreshMagHomeActivity freshMagHomeActivity) {
            FreshMagHomeActivity_MembersInjector.a(freshMagHomeActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.dynamic.page.ui.DynamicPageActivity_GeneratedInjector
        public final void L0(DynamicPageActivity dynamicPageActivity) {
            DynamicPageActivity_MembersInjector.a(dynamicPageActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity_GeneratedInjector
        public final void M(HaveYouForgottenActivity haveYouForgottenActivity) {
            HaveYouForgottenActivity_MembersInjector.b(haveYouForgottenActivity, d1());
            HaveYouForgottenActivity_MembersInjector.a(haveYouForgottenActivity, (AnalyticsManager) this.c.r2.get());
        }

        @Override // au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity_GeneratedInjector
        public final void M0(InstoreCartActivity instoreCartActivity) {
            InstoreCartActivity_MembersInjector.a(instoreCartActivity, (AnalyticsManager) this.c.r2.get());
            InstoreCartActivity_MembersInjector.b(instoreCartActivity, d1());
        }

        @Override // au.com.woolworths.android.onesite.modules.customviews.WebViewActivity_GeneratedInjector
        public final void N(WebViewActivity webViewActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(webViewActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(webViewActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            WebViewActivity_MembersInjector.a(webViewActivity, (SharedHeaders) singletonCImpl.c1.get());
            WebViewActivity_MembersInjector.b(webViewActivity, ReleaseModule_ProvidesSquadWebViewInteractorFactory.a(singletonCImpl.c));
        }

        @Override // au.com.woolworths.shop.cart.ui.CartActivity_GeneratedInjector
        public final void N0(CartActivity cartActivity) {
            SingletonCImpl singletonCImpl = this.c;
            CartActivity_MembersInjector.a(cartActivity, (CollectionModeInteractor) singletonCImpl.q1.get());
            CartActivity_MembersInjector.b(cartActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.android.onesite.app.deeplink.ShopAppBranchDeepLinkActivity_GeneratedInjector
        public final void O(ShopAppBranchDeepLinkActivity shopAppBranchDeepLinkActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ShopAppBranchDeepLinkActivity_MembersInjector.a(shopAppBranchDeepLinkActivity, SingletonCImpl.R0(singletonCImpl));
            ShopAppBranchDeepLinkActivity_MembersInjector.b(shopAppBranchDeepLinkActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.product.details.LegacyProductDetailsActivity_GeneratedInjector
        public final void O0(LegacyProductDetailsActivity legacyProductDetailsActivity) {
            SingletonCImpl singletonCImpl = this.c;
            LegacyProductDetailsActivity_MembersInjector.a(legacyProductDetailsActivity, (AnalyticsManager) singletonCImpl.r2.get());
            LegacyProductDetailsActivity_MembersInjector.b(legacyProductDetailsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            LegacyProductDetailsActivity_MembersInjector.c(legacyProductDetailsActivity, (ListsInMemoryRepository) singletonCImpl.E2.get());
            LegacyProductDetailsActivity_MembersInjector.d(legacyProductDetailsActivity, d1());
        }

        @Override // au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity_GeneratedInjector
        public final void P(CheckoutActivity checkoutActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(checkoutActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(checkoutActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            CheckoutActivity_MembersInjector.a(checkoutActivity, (ShopAccountInteractor) singletonCImpl.Y0.get());
            CheckoutActivity_MembersInjector.b(checkoutActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity_GeneratedInjector
        public final void P0(ConfirmSubscriptionActivity confirmSubscriptionActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ConfirmSubscriptionActivity_MembersInjector.b(confirmSubscriptionActivity, (DigipayInteractor) singletonCImpl.T3.get());
            ConfirmSubscriptionActivity_MembersInjector.a(confirmSubscriptionActivity, (AnalyticsManager) singletonCImpl.r2.get());
        }

        @Override // au.com.woolworths.feature.shop.inbox.InboxActivity_GeneratedInjector
        public final void Q(InboxActivity inboxActivity) {
            InboxActivity_MembersInjector.a(inboxActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity_GeneratedInjector
        public final void Q0(YourGroceriesPaymentSummaryActivity yourGroceriesPaymentSummaryActivity) {
            YourGroceriesPaymentSummaryActivity_MembersInjector.a(yourGroceriesPaymentSummaryActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity_GeneratedInjector
        public final void R(ProcessorActivity processorActivity) {
            Context context = this.c.e.f23776a;
            Preconditions.d(context);
            ProcessorActivity_MembersInjector.a(processorActivity, new CameraCaptureManager(context));
        }

        @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity_GeneratedInjector
        public final void R0(ProductFinderActivity productFinderActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ProductFinderActivity_MembersInjector.a(productFinderActivity, (LocationInteractor) singletonCImpl.D3.get());
            ProductFinderActivity_MembersInjector.b(productFinderActivity, new PermissionFlagInteractorImpl(singletonCImpl.y1()));
        }

        @Override // au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity_GeneratedInjector
        public final void S(DeleteAccountActivity deleteAccountActivity) {
            SingletonCImpl singletonCImpl = this.c;
            DeleteAccountActivity_MembersInjector.b(deleteAccountActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            DeleteAccountActivity_MembersInjector.a(deleteAccountActivity, (ShopAuthManager) singletonCImpl.R3.get());
        }

        @Override // au.com.woolworths.feature.shop.login.LoginActivity_GeneratedInjector
        public final void S0(LoginActivity loginActivity) {
            loginActivity.w = (ShopAuthManager) this.c.R3.get();
        }

        @Override // au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity_GeneratedInjector
        public final void T(FeedbackFormActivity feedbackFormActivity) {
            FeedbackFormActivity_MembersInjector.a(feedbackFormActivity, (AppConfig) this.c.W0.get());
        }

        @Override // au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity_GeneratedInjector
        public final void T0(EditDriverInstructionActivity editDriverInstructionActivity) {
            EditDriverInstructionActivity_MembersInjector.a(editDriverInstructionActivity, (AnalyticsManager) this.c.r2.get());
        }

        @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
        public final FragmentComponentBuilder U() {
            return new FragmentCBuilder(this.c, this.d, this.e);
        }

        @Override // au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity_GeneratedInjector
        public final void U0(AccountSettingsActivity accountSettingsActivity) {
            AccountSettingsActivity_MembersInjector.a(accountSettingsActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity_GeneratedInjector
        public final void V(RewardsMagicLinkActivity rewardsMagicLinkActivity) {
            RewardsMagicLinkActivity_MembersInjector.a(rewardsMagicLinkActivity, (FeatureToggleManager) this.c.P0.get());
            RewardsMagicLinkActivity_MembersInjector.b(rewardsMagicLinkActivity, new WebChromeFileUploadHelper());
            RewardsMagicLinkActivity_MembersInjector.c(rewardsMagicLinkActivity, new MandyJsInterface());
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity_GeneratedInjector
        public final void V0(ConfigActionActivity configActionActivity) {
            ConfigActionActivity_MembersInjector.a(configActionActivity, (ApplicationType) this.c.B1.get());
        }

        @Override // au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity_GeneratedInjector
        public final void W(RewardsSettingsActivity rewardsSettingsActivity) {
            SingletonCImpl singletonCImpl = this.c;
            RewardsSettingsActivity_MembersInjector.a(rewardsSettingsActivity, (AnalyticsManager) singletonCImpl.r2.get());
            RewardsSettingsActivity_MembersInjector.b(rewardsSettingsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity_GeneratedInjector
        public final void W0(EReceiptDetailsActivity eReceiptDetailsActivity) {
            SingletonCImpl singletonCImpl = this.c;
            EReceiptDetailsActivity_MembersInjector.b(eReceiptDetailsActivity, ShopReceiptDetailsAppModule_ProvidesStoreLocationProvider$receipts_releaseFactory.a(singletonCImpl.l0));
            EReceiptDetailsActivity_MembersInjector.c(eReceiptDetailsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            EReceiptDetailsActivity_MembersInjector.a(eReceiptDetailsActivity, (AppIdentifier) singletonCImpl.Q3.get());
        }

        @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity_GeneratedInjector
        public final void X(SubmitReviewActivity submitReviewActivity) {
            SubmitReviewActivity_MembersInjector.a(submitReviewActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity_GeneratedInjector
        public final void X0(InstoreMapActivity instoreMapActivity) {
            SingletonCImpl singletonCImpl = this.c;
            InstoreMapActivity_MembersInjector.a(instoreMapActivity, (LocationInteractor) singletonCImpl.D3.get());
            InstoreMapActivity_MembersInjector.b(instoreMapActivity, new PermissionFlagInteractorImpl(singletonCImpl.y1()));
        }

        @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity_GeneratedInjector
        public final void Y(CatalogueProductListActivity catalogueProductListActivity) {
            SingletonCImpl singletonCImpl = this.c;
            CatalogueProductListActivity_MembersInjector.a(catalogueProductListActivity, (AnalyticsManager) singletonCImpl.r2.get());
            CatalogueProductListActivity_MembersInjector.b(catalogueProductListActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            CatalogueProductListActivity_MembersInjector.c(catalogueProductListActivity, d1());
        }

        @Override // au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity_GeneratedInjector
        public final void Y0(OfferListPageActivity offerListPageActivity) {
            SingletonCImpl singletonCImpl = this.c;
            OfferListPageActivity_MembersInjector.a(offerListPageActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            OfferListPageActivity_MembersInjector.b(offerListPageActivity, (RewardsAccountInteractor) singletonCImpl.Y1.get());
        }

        @Override // au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity_GeneratedInjector
        public final void Z(InstoreWifiActivity instoreWifiActivity) {
            SingletonCImpl singletonCImpl = this.c;
            InstoreWifiActivity_MembersInjector.a(instoreWifiActivity, (AppConfig) singletonCImpl.W0.get());
            InstoreWifiActivity_MembersInjector.c(instoreWifiActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            InstoreWifiActivity_MembersInjector.b(instoreWifiActivity, (AppIdentifier) singletonCImpl.Q3.get());
        }

        @Override // au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity_GeneratedInjector
        public final void Z0(au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity storeLocatorActivity) {
            SingletonCImpl singletonCImpl = this.c;
            au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity_MembersInjector.d(storeLocatorActivity, (LocationInteractor) singletonCImpl.D3.get());
            au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity_MembersInjector.c(storeLocatorActivity, (LaunchManager) singletonCImpl.P3.get());
            au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity_MembersInjector.a(storeLocatorActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity_MembersInjector.e(storeLocatorActivity, new PermissionFlagInteractorImpl(singletonCImpl.y1()));
            au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity_MembersInjector.b(storeLocatorActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public final DefaultViewModelFactories.InternalFactoryFactory a() {
            return new DefaultViewModelFactories.InternalFactoryFactory(g0(), new ViewModelCBuilder(this.c, this.d));
        }

        @Override // au.com.woolworths.feature.product.list.v2.ProductListActivity_GeneratedInjector
        public final void a0(ProductListActivity productListActivity) {
            ProductListActivity_MembersInjector.a(productListActivity, d1());
        }

        @Override // au.com.woolworths.feature.shop.weblink.WebLinkActivity_GeneratedInjector
        public final void a1(WebLinkActivity webLinkActivity) {
        }

        @Override // au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity_GeneratedInjector
        public final void b(PastShopsActivity pastShopsActivity) {
            SingletonCImpl singletonCImpl = this.c;
            PastShopsActivity_MembersInjector.a(pastShopsActivity, (CartUpdateInteractor) singletonCImpl.D2.get());
            PastShopsActivity_MembersInjector.b(pastShopsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity_GeneratedInjector
        public final void b0(ShopNotificationPreferencesActivity shopNotificationPreferencesActivity) {
            ShopNotificationPreferencesActivity_MembersInjector.a(shopNotificationPreferencesActivity, (PreferencesCommInteractor) this.d.s.get());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public final ViewModelComponentBuilder b1() {
            return new ViewModelCBuilder(this.c, this.d);
        }

        @Override // au.com.woolworths.feature.shop.onboarding.OnboardingActivity_GeneratedInjector
        public final void c(OnboardingActivity onboardingActivity) {
            SingletonCImpl singletonCImpl = this.c;
            OnboardingActivity_MembersInjector.a(onboardingActivity, (AnalyticsManager) singletonCImpl.r2.get());
            OnboardingActivity_MembersInjector.c(onboardingActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            OnboardingActivity_MembersInjector.d(onboardingActivity, d1());
            OnboardingActivity_MembersInjector.b(onboardingActivity, SingletonCImpl.R0(singletonCImpl));
            OnboardingActivity_MembersInjector.e(onboardingActivity, (ShopAppFlavorInteractor) singletonCImpl.N0.get());
        }

        @Override // au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity_GeneratedInjector
        public final void c0(BarcodeScannerActivity barcodeScannerActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BarcodeScannerActivity_MembersInjector.a(barcodeScannerActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BarcodeScannerActivity_MembersInjector.b(barcodeScannerActivity, (AppConfig) singletonCImpl.W0.get());
            BarcodeScannerActivity_MembersInjector.d(barcodeScannerActivity, d1());
            BarcodeScannerActivity_MembersInjector.c(barcodeScannerActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity_GeneratedInjector
        public final void c1(au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity storeDetailsActivity) {
            au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity_MembersInjector.a(storeDetailsActivity, (LaunchManager) this.c.P3.get());
        }

        @Override // au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity_GeneratedInjector
        public final void d(ComposeProductListActivity composeProductListActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ComposeProductListActivity_MembersInjector.a(composeProductListActivity, (AnalyticsManager) singletonCImpl.r2.get());
            ComposeProductListActivity_MembersInjector.c(composeProductListActivity, d1());
            ComposeProductListActivity_MembersInjector.b(composeProductListActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity_GeneratedInjector
        public final void d0(BarcodeScannerLegacyActivity barcodeScannerLegacyActivity) {
            BarcodeScannerLegacyActivity_MembersInjector.a(barcodeScannerLegacyActivity, (AnalyticsManager) this.c.r2.get());
            BarcodeScannerLegacyActivity_MembersInjector.b(barcodeScannerLegacyActivity, d1());
        }

        public final ShopAppNavigator d1() {
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) this.c.P0.get();
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Activity activity = this.f4080a;
            Intrinsics.h(activity, "activity");
            return new ShopAppNavigator(featureToggleManager, activity);
        }

        @Override // au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity_GeneratedInjector
        public final void e(VocFreeTextActivity vocFreeTextActivity) {
            SingletonCImpl singletonCImpl = this.c;
            new VocDeviceInfoInteractor((Context) singletonCImpl.k1.get(), (LocationInteractor) singletonCImpl.D3.get());
            new VocRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.C1.get());
        }

        @Override // au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingActivity_GeneratedInjector
        public final void e0(ShopListGuestOnboardingActivity shopListGuestOnboardingActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ShopListGuestOnboardingActivity_MembersInjector.b(shopListGuestOnboardingActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            ShopListGuestOnboardingActivity_MembersInjector.a(shopListGuestOnboardingActivity, (AnalyticsManager) singletonCImpl.r2.get());
        }

        @Override // au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity_GeneratedInjector
        public final void f(CatalogueIntroActivity catalogueIntroActivity) {
            SingletonCImpl singletonCImpl = this.c;
            CatalogueIntroActivity_MembersInjector.a(catalogueIntroActivity, (AnalyticsManager) singletonCImpl.r2.get());
            CatalogueIntroActivity_MembersInjector.b(catalogueIntroActivity, (SchedulersProvider) singletonCImpl.o1.get());
        }

        @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity_GeneratedInjector
        public final void f0(RatingsAndReviewsActivity ratingsAndReviewsActivity) {
            RatingsAndReviewsActivity_MembersInjector.a(ratingsAndReviewsActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultActivity_GeneratedInjector
        public final void g(PickUpLocationResultActivity pickUpLocationResultActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(pickUpLocationResultActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(pickUpLocationResultActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            PickUpLocationResultActivity_MembersInjector.b(pickUpLocationResultActivity, (SchedulersProvider) singletonCImpl.o1.get());
            PickUpLocationResultActivity_MembersInjector.a(pickUpLocationResultActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public final LazyClassKeyMap g0() {
            ImmutableMap.Builder builderB = ImmutableMap.b(Primes.SMALL_FACTOR_LIMIT);
            Boolean bool = Boolean.TRUE;
            builderB.c("au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel", bool);
            builderB.c("au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardViewModel", bool);
            builderB.c("au.com.woolworths.product.addtocart.AddToCartViewModel", bool);
            builderB.c("au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.infomodal.ApplicableDeliveryMethodViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.permissions.ui.AskForPushNotificationPermissionViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.bundles.BundlesViewModel", bool);
            builderB.c("au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorViewModel", bool);
            builderB.c("au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy", bool);
            builderB.c("au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel", bool);
            builderB.c("au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionViewModel", bool);
            builderB.c("au.com.woolworths.shop.cart.ui.CartBadgeActionViewModel", bool);
            builderB.c("au.com.woolworths.product.cartpreauth.CartPreAuthViewModel", bool);
            builderB.c("au.com.woolworths.shop.cart.ui.cart.CartViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel", bool);
            builderB.c("au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.editorder.review.CmoReviewViewModel", bool);
            builderB.c("au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityViewModel", bool);
            builderB.c("au.com.woolworths.feature.shared.force.upgrade.ConfigActionViewModel", bool);
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel", bool);
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContentViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.contentpage.ContentPageViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel", bool);
            builderB.c("au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel", bool);
            builderB.c("au.com.woolworths.shop.digipay.creditcard.CreditCardViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel", bool);
            builderB.c("au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel", bool);
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingViewModel", bool);
            builderB.c("au.com.woolworths.dynamic.page.ui.DynamicPageViewModel", bool);
            builderB.c("au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel", bool);
            builderB.c("au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorViewModel", bool);
            builderB.c("au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpViewModel", bool);
            builderB.c("au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel", bool);
            builderB.c("au.com.woolworths.feature.shared.feedback.ui.FeedbackFormViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.video.FullPageVideoPlayerViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenViewModel", bool);
            builderB.c("au.com.woolworths.product.details.HealthierBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.inbox.InboxViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.instore.cart.InstoreCartViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel", bool);
            builderB.c("au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiViewModel", bool);
            builderB.c("au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.ListsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.login.LoginViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel", bool);
            builderB.c("au.com.woolworths.android.onesite.modules.main.MainViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.brands.MarketplaceBrandsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.content.bottomsheet.MarketplacePickupBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.sellers.MarketplaceSellersViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.more.MoreViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.legacy.nutrition.NutritionBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.nutrition.NutritionBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel", bool);
            builderB.c("au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel", bool);
            builderB.c("au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarksViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.onboarding.OnboardingViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.orders.OrdersViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.pastshops.PastShopsViewModel", bool);
            builderB.c("au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorViewModel", bool);
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.product.availability.ProductAvailabilityViewModel", bool);
            builderB.c("au.com.woolworths.product.offers.ProductBoostResultViewModel", bool);
            builderB.c("au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryViewModel", bool);
            builderB.c("au.com.woolworths.product.details.ProductDetailsViewModel", bool);
            builderB.c("au.com.woolworths.shop.product.details.ProductDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.ProductListOptionsViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.ProductListViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.legacy.ProductListViewModel", bool);
            builderB.c("au.com.woolworths.feature.product.list.v2.ProductListViewModel", bool);
            builderB.c("au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoUpliftViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoViewModel", bool);
            builderB.c("au.com.woolworths.shop.rewards.promo.PromoAppViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingViewModel", bool);
            builderB.c("au.com.woolworths.promotion.banner.ui.PromotionViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryViewModel", bool);
            builderB.c("au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.summary.refund.RefundViewModel", bool);
            builderB.c("au.com.woolworths.sdui.rewards.broadcastbanner.RemoteDismissibleBannerViewModel", bool);
            builderB.c("au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel", bool);
            builderB.c("au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.foryou.RewardsBoostersViewModelLegacy", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.offers.RewardsHomeBridgeViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy", bool);
            builderB.c("au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.account.preferences.notification.RewardsPushPreferenceDetailsViewModelLegacy", bool);
            builderB.c("au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsViewModel", bool);
            builderB.c("au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel", bool);
            builderB.c("au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupViewModel", bool);
            builderB.c("au.com.woolworths.shop.rewards.RewardsViewModelLegacy", bool);
            builderB.c("au.com.woolworths.base.wallet.ocr.RewardsWalletOcrViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesViewModel", bool);
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorViewModel", bool);
            builderB.c("au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkHandlerViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesViewModel", bool);
            builderB.c("au.com.woolworths.shop.receipts.ShopReceiptListViewModel", bool);
            builderB.c("au.com.woolworths.shop.rewards.ShopRewardsViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.signup.SignUpViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.sng.SngListsViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel", bool);
            builderB.c("au.com.woolworths.shop.specials.SpecialsHomeViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameViewModel", bool);
            builderB.c("au.com.woolworths.android.onesite.modules.splash.SplashViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.storelocator.details.StoreDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel", bool);
            builderB.c("au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel", bool);
            builderB.c("au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsViewModel", bool);
            builderB.c("au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel", bool);
            builderB.c("au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModelV2", bool);
            builderB.c("au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.voc.freetext.VocFreeTextViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.voc.score.VocViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetViewModel", bool);
            builderB.c("au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.weblink.WebLinkViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryViewModel", bool);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel", bool);
            return new LazyClassKeyMap(builderB.a(true));
        }

        @Override // au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity_GeneratedInjector
        public final void h(Feedback2FormActivity feedback2FormActivity) {
            Feedback2FormActivity_MembersInjector.a(feedback2FormActivity, (AppConfig) this.c.W0.get());
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity_GeneratedInjector
        public final void h0(OrderCancellationPromptActivity orderCancellationPromptActivity) {
            SingletonCImpl singletonCImpl = this.c;
            OrderCancellationPromptActivity_MembersInjector.a(orderCancellationPromptActivity, (AnalyticsManager) singletonCImpl.r2.get());
            OrderCancellationPromptActivity_MembersInjector.b(orderCancellationPromptActivity, (AppConfig) singletonCImpl.W0.get());
        }

        @Override // au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity_GeneratedInjector
        public final void i(ViewSimilarProductsActivity viewSimilarProductsActivity) {
            ViewSimilarProductsActivity_MembersInjector.b(viewSimilarProductsActivity, d1());
            ViewSimilarProductsActivity_MembersInjector.a(viewSimilarProductsActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignActivity_GeneratedInjector
        public final void i0(StandardCampaignActivity standardCampaignActivity) {
            SingletonCImpl singletonCImpl = this.c;
            StandardCampaignActivity_MembersInjector.a(standardCampaignActivity, (AppIdentifier) singletonCImpl.Q3.get());
            StandardCampaignActivity_MembersInjector.b(standardCampaignActivity, AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b));
        }

        @Override // au.com.woolworths.feature.shop.myorders.orders.OrdersActivity_GeneratedInjector
        public final void j(OrdersActivity ordersActivity) {
            SingletonCImpl singletonCImpl = this.c;
            OrdersActivity_MembersInjector.a(ordersActivity, (AnalyticsManager) singletonCImpl.r2.get());
            OrdersActivity_MembersInjector.b(ordersActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity_GeneratedInjector
        public final void j0(ShoppingListDetailsActivity shoppingListDetailsActivity) {
            ShoppingListDetailsActivity_MembersInjector.g(shoppingListDetailsActivity, d1());
            SingletonCImpl singletonCImpl = this.c;
            ShoppingListDetailsActivity_MembersInjector.b(shoppingListDetailsActivity, (CartUpdateInteractor) singletonCImpl.D2.get());
            ShoppingListDetailsActivity_MembersInjector.a(shoppingListDetailsActivity, (AnalyticsManager) singletonCImpl.r2.get());
            ShoppingListDetailsActivity_MembersInjector.e(shoppingListDetailsActivity, (ListsInMemoryRepository) singletonCImpl.E2.get());
            ShoppingListDetailsActivity_MembersInjector.c(shoppingListDetailsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            ShoppingListDetailsActivity_MembersInjector.f(shoppingListDetailsActivity, (ListsUtils) singletonCImpl.N3.get());
            ShoppingListDetailsActivity_MembersInjector.d(shoppingListDetailsActivity, (InstoreNavigationInteractor) singletonCImpl.E3.get());
        }

        @Override // au.com.woolworths.feature.product.list.ComposeProductListActivity_GeneratedInjector
        public final void k(au.com.woolworths.feature.product.list.ComposeProductListActivity composeProductListActivity) {
            SingletonCImpl singletonCImpl = this.c;
            au.com.woolworths.feature.product.list.ComposeProductListActivity_MembersInjector.a(composeProductListActivity, (AnalyticsManager) singletonCImpl.r2.get());
            au.com.woolworths.feature.product.list.ComposeProductListActivity_MembersInjector.c(composeProductListActivity, d1());
            au.com.woolworths.feature.product.list.ComposeProductListActivity_MembersInjector.b(composeProductListActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity_GeneratedInjector
        public final void k0(EditOrderConditionsActivity editOrderConditionsActivity) {
            EditOrderConditionsActivity_MembersInjector.a(editOrderConditionsActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity_GeneratedInjector
        public final void l(ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ShopAppDeepLinkHandlerActivity_MembersInjector.d(shopAppDeepLinkHandlerActivity, (RewardsAccountInteractor) singletonCImpl.Y1.get());
            ShopAppDeepLinkHandlerActivity_MembersInjector.a(shopAppDeepLinkHandlerActivity, (AnalyticsManager) singletonCImpl.r2.get());
            AppModule appModule = singletonCImpl.b;
            BaseDataModule baseDataModule = singletonCImpl.I;
            Application applicationA = Contexts.a(singletonCImpl.e.f23776a);
            baseDataModule.getClass();
            SharedPreferences sharedPreferencesB = androidx.constraintlayout.core.state.a.b(applicationA.getPackageName(), ".shop.onboarding", applicationA, 0, "getSharedPreferences(...)");
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            appModule.getClass();
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            ShopAppDeepLinkHandlerActivity_MembersInjector.c(shopAppDeepLinkHandlerActivity, new OnboardingInteractorImpl(new OnboardingRepository(sharedPreferencesB, featureToggleManager)));
            ShopAppDeepLinkHandlerActivity_MembersInjector.b(shopAppDeepLinkHandlerActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            ShopAppDeepLinkHandlerActivity_MembersInjector.e(shopAppDeepLinkHandlerActivity, (ShopAccountInteractor) singletonCImpl.Y0.get());
            ShopAppDeepLinkHandlerActivity_MembersInjector.f(shopAppDeepLinkHandlerActivity, (ShopAppRegionInteractor) singletonCImpl.O0.get());
        }

        @Override // au.com.woolworths.shop.buyagain.ui.BuyAgainActivity_GeneratedInjector
        public final void l0(BuyAgainActivity buyAgainActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BuyAgainActivity_MembersInjector.b(buyAgainActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            BuyAgainActivity_MembersInjector.a(buyAgainActivity, (CollectionModeInteractor) singletonCImpl.q1.get());
            BuyAgainActivity_MembersInjector.c(buyAgainActivity, d1());
        }

        @Override // au.com.woolworths.feature.shop.bundles.BundlesActivity_GeneratedInjector
        public final void m(BundlesActivity bundlesActivity) {
            BundlesActivity_MembersInjector.a(bundlesActivity, d1());
        }

        @Override // au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity_GeneratedInjector
        public final void m0(CatalogueHomeActivity catalogueHomeActivity) {
            CatalogueHomeActivity_MembersInjector.a(catalogueHomeActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsActivityOld_GeneratedInjector
        public final void n(AccountSettingsActivityOld accountSettingsActivityOld) {
            AccountSettingsActivityOld_MembersInjector.a(accountSettingsActivityOld, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity_GeneratedInjector
        public final void n0(RecipeDetailsActivity recipeDetailsActivity) {
            SingletonCImpl singletonCImpl = this.c;
            RecipeDetailsActivity_MembersInjector.b(recipeDetailsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            RecipeDetailsActivity_MembersInjector.a(recipeDetailsActivity, (AnalyticsManager) singletonCImpl.r2.get());
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
        public final ViewComponentBuilder o() {
            return new ViewCBuilder(this.c, this.d, this.e);
        }

        @Override // au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryActivity_GeneratedInjector
        public final void o0(ProductImageGalleryActivity productImageGalleryActivity) {
            ProductImageGalleryActivity_MembersInjector.a(productImageGalleryActivity, (LegacyShopAnalyticsManager) this.c.r1.get());
        }

        @Override // au.com.woolworths.shop.rewards.RewardsActivityLegacy_GeneratedInjector
        public final void p(RewardsActivityLegacy rewardsActivityLegacy) {
            RewardsActivityLegacy_MembersInjector.a(rewardsActivityLegacy, (RewardsAccountInteractor) this.c.Y1.get());
        }

        @Override // au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity_GeneratedInjector
        public final void p0(SavedRecipesActivity savedRecipesActivity) {
            SavedRecipesActivity_MembersInjector.a(savedRecipesActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity_GeneratedInjector
        public final void q(PickUpLocatorActivity pickUpLocatorActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(pickUpLocatorActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(pickUpLocatorActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            PickUpLocatorActivity_MembersInjector.d(pickUpLocatorActivity, (SchedulersProvider) singletonCImpl.o1.get());
            PickUpLocatorActivity_MembersInjector.b(pickUpLocatorActivity, (LocationInteractor) singletonCImpl.D3.get());
            PickUpLocatorActivity_MembersInjector.c(pickUpLocatorActivity, new PermissionFlagInteractorImpl(singletonCImpl.y1()));
            PickUpLocatorActivity_MembersInjector.a(pickUpLocatorActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiActivity_GeneratedInjector
        public final void q0(OnboardingSduiActivity onboardingSduiActivity) {
            SingletonCImpl singletonCImpl = this.c;
            onboardingSduiActivity.w = (AnalyticsManager) singletonCImpl.r2.get();
            onboardingSduiActivity.x = SingletonCImpl.R0(singletonCImpl);
            d1();
        }

        @Override // au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity_GeneratedInjector
        public final void r(PromotionDetailsActivity promotionDetailsActivity) {
            PromotionDetailsActivity_MembersInjector.a(promotionDetailsActivity, d1());
        }

        @Override // au.com.woolworths.shop.product.details.ProductDetailsActivity_GeneratedInjector
        public final void r0(ProductDetailsActivity productDetailsActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ProductDetailsActivity_MembersInjector.b(productDetailsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            ProductDetailsActivity_MembersInjector.a(productDetailsActivity, (CollectionModeInteractor) singletonCImpl.q1.get());
            ProductDetailsActivity_MembersInjector.c(productDetailsActivity, d1());
        }

        @Override // au.com.woolworths.shop.rewards.ShopRewardsActivity_GeneratedInjector
        public final void s(ShopRewardsActivity shopRewardsActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ShopRewardsActivity_MembersInjector.a(shopRewardsActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            ShopRewardsActivity_MembersInjector.b(shopRewardsActivity, (RewardsAccountInteractor) singletonCImpl.Y1.get());
        }

        @Override // au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity_GeneratedInjector
        public final void s0(CollectionModeSetupActivity collectionModeSetupActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(collectionModeSetupActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(collectionModeSetupActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            CollectionModeSetupActivity_MembersInjector.b(collectionModeSetupActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            CollectionModeSetupActivity_MembersInjector.c(collectionModeSetupActivity, (SchedulersProvider) singletonCImpl.o1.get());
            CollectionModeSetupActivity_MembersInjector.d(collectionModeSetupActivity, d1());
            CollectionModeSetupActivity_MembersInjector.a(collectionModeSetupActivity, SingletonCImpl.R0(singletonCImpl));
        }

        @Override // au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity_GeneratedInjector
        public final void t(CatalogueBrowseActivity catalogueBrowseActivity) {
            SingletonCImpl singletonCImpl = this.c;
            CatalogueBrowseActivity_MembersInjector.a(catalogueBrowseActivity, (AnalyticsManager) singletonCImpl.r2.get());
            CatalogueBrowseActivity_MembersInjector.b(catalogueBrowseActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            CatalogueBrowseActivity_MembersInjector.c(catalogueBrowseActivity, d1());
        }

        @Override // au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity_GeneratedInjector
        public final void t0(CategoryListingActivity categoryListingActivity) {
            CategoryListingActivity_MembersInjector.a(categoryListingActivity, d1());
        }

        @Override // au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity_GeneratedInjector
        public final void u(RewardsWalletOcrActivity rewardsWalletOcrActivity) {
            RewardsWalletOcrActivity_MembersInjector.a(rewardsWalletOcrActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew_GeneratedInjector
        public final void u0(RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew) {
            SingletonCImpl singletonCImpl = this.c;
            RewardsAuthenticationActivityNew_MembersInjector.a(rewardsAuthenticationActivityNew, (Auth0AuthManager) singletonCImpl.l1.get());
            RewardsAuthenticationActivityNew_MembersInjector.b(rewardsAuthenticationActivityNew, SingletonCImpl.R0(singletonCImpl));
            RewardsAuthenticationActivityNew_MembersInjector.d(rewardsAuthenticationActivityNew, (RewardsAccountInteractor) singletonCImpl.Y1.get());
            RewardsAuthenticationActivityNew_MembersInjector.e(rewardsAuthenticationActivityNew, ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c));
            RewardsAuthenticationActivityNew_MembersInjector.c(rewardsAuthenticationActivityNew, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity_GeneratedInjector
        public final void v(SearchActivity searchActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(searchActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(searchActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            SearchActivity_MembersInjector.b(searchActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            SearchActivity_MembersInjector.a(searchActivity, (ShopAccountInteractor) singletonCImpl.Y0.get());
            SearchActivity_MembersInjector.d(searchActivity, (TrafficDriversInteractor) singletonCImpl.u3.get());
            SearchActivity_MembersInjector.c(searchActivity, d1());
            SearchActivity_MembersInjector.e(searchActivity, (SearchViewModel.Factory) this.f.get());
        }

        @Override // au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity_GeneratedInjector
        public final void v0(SubCategoryActivity subCategoryActivity) {
            SingletonCImpl singletonCImpl = this.c;
            SubCategoryActivity_MembersInjector.a(subCategoryActivity, (CartUpdateInteractor) singletonCImpl.D2.get());
            SubCategoryActivity_MembersInjector.b(subCategoryActivity, (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.android.onesite.modules.main.MainActivity_GeneratedInjector
        public final void w(MainActivity mainActivity) {
            SingletonCImpl singletonCImpl = this.c;
            BaseShopAppActivity_MembersInjector.a(mainActivity, (AnalyticsManager) singletonCImpl.r2.get());
            BaseShopAppActivity_MembersInjector.b(mainActivity, (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
            MainActivity_MembersInjector.b(mainActivity, (CollectionModeInteractor) singletonCImpl.q1.get());
            MainActivity_MembersInjector.g(mainActivity, (TrolleyInteractor) singletonCImpl.h2.get());
            MainActivity_MembersInjector.a(mainActivity, (ShopAccountInteractor) singletonCImpl.Y0.get());
            MainActivity_MembersInjector.f(mainActivity, d1());
            MainActivity_MembersInjector.c(mainActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            MainActivity_MembersInjector.d(mainActivity, (ListsUtils) singletonCImpl.N3.get());
            MainActivity_MembersInjector.e(mainActivity, (OkHttpClient) singletonCImpl.f1.get());
        }

        @Override // au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity_GeneratedInjector
        public final void w0(FreshMagContentActivity freshMagContentActivity) {
            FreshMagContentActivity_MembersInjector.a(freshMagContentActivity, (FeatureToggleManager) this.c.P0.get());
        }

        @Override // au.com.woolworths.feature.shop.signup.SignUpActivity_GeneratedInjector
        public final void x(SignUpActivity signUpActivity) {
            SingletonCImpl singletonCImpl = this.c;
            signUpActivity.w = (SignUpConfig) singletonCImpl.S3.get();
            signUpActivity.x = (ShopAppRegionInteractor) singletonCImpl.O0.get();
        }

        @Override // au.com.woolworths.android.onesite.modules.shortcuts.ShortcutsTrampolineActivity_GeneratedInjector
        public final void x0(ShortcutsTrampolineActivity shortcutsTrampolineActivity) {
            SingletonCImpl singletonCImpl = this.c;
            ShortcutsTrampolineActivity_MembersInjector.c(shortcutsTrampolineActivity, (LaunchManager) singletonCImpl.P3.get());
            ShortcutsTrampolineActivity_MembersInjector.d(shortcutsTrampolineActivity, (RewardsAccountInteractor) singletonCImpl.Y1.get());
            ShortcutsTrampolineActivity_MembersInjector.b(shortcutsTrampolineActivity, (FeatureToggleManager) singletonCImpl.P0.get());
            ShortcutsTrampolineActivity_MembersInjector.a(shortcutsTrampolineActivity, (AnalyticsManager) singletonCImpl.r2.get());
        }

        @Override // au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity_GeneratedInjector
        public final void y(DeliveryUnlimitedSignUpLandingActivity deliveryUnlimitedSignUpLandingActivity) {
            DeliveryUnlimitedSignUpLandingActivity_MembersInjector.a(deliveryUnlimitedSignUpLandingActivity, (AnalyticsManager) this.c.r2.get());
        }

        @Override // au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity_GeneratedInjector
        public final void y0(IdVerificationActivity idVerificationActivity) {
            IdVerificationActivity_MembersInjector.a(idVerificationActivity, (AnalyticsManager) this.c.r2.get());
        }

        @Override // au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity_GeneratedInjector
        public final void z(BrandedShopActivity brandedShopActivity) {
            BrandedShopActivity_MembersInjector.a(brandedShopActivity, d1());
        }

        @Override // au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity_GeneratedInjector
        public final void z0(SplashScreenActivity splashScreenActivity) {
            SingletonCImpl singletonCImpl = this.c;
            splashScreenActivity.y = (FirebasePerfMonitor) singletonCImpl.Z0.get();
            splashScreenActivity.z = (FeatureToggleManager) singletonCImpl.P0.get();
        }
    }

    public static final class ActivityRetainedCBuilder implements ShopApplication_HiltComponents.ActivityRetainedC.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4083a;
        public SavedStateHandleHolder b;

        public ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.f4083a = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public final ActivityRetainedComponentBuilder a(SavedStateHandleHolder savedStateHandleHolder) {
            this.b = savedStateHandleHolder;
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public final ActivityRetainedComponent build() {
            Preconditions.a(SavedStateHandleHolder.class, this.b);
            return new ActivityRetainedCImpl(this.f4083a, new ActivityModule(), new CatalogueModule(), new DynamicPageModule(), new OliveVoiceModule(), new ProductListModule(), new au.com.woolworths.feature.product.list.legacy.di.ProductListModule(), new RewardsRedemptionSettingsModule(), new SharedEReceiptDetailsModule(), new ShopListsDataModule(), new ShopLoginModule(), new ShopMarketplaceModule(), new ShopNotificationPreferencesModule(), new ShopProductNavigationModule());
        }
    }

    public static final class ActivityRetainedCImpl extends ShopApplication_HiltComponents.ActivityRetainedC {

        /* renamed from: a, reason: collision with root package name */
        public final ShopNotificationPreferencesModule f4084a;
        public final ActivityModule b;
        public final ProductListModule c;
        public final au.com.woolworths.feature.product.list.legacy.di.ProductListModule d;
        public final CatalogueModule e;
        public final SharedEReceiptDetailsModule f;
        public final ShopLoginModule g;
        public final ShopMarketplaceModule h;
        public final OliveVoiceModule i;
        public final RewardsRedemptionSettingsModule j;
        public final ShopProductNavigationModule k;
        public final ShopListsDataModule l;
        public final DynamicPageModule m;
        public final SingletonCImpl n;
        public final ActivityRetainedCImpl o = this;
        public final Provider p;
        public final Provider q;
        public final Provider r;
        public final Provider s;
        public final Provider t;
        public final Provider u;
        public final Provider v;
        public final Provider w;
        public final Provider x;
        public final Provider y;
        public final Provider z;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4085a;
            public final ActivityRetainedCImpl b;
            public final int c;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int i) {
                this.f4085a = singletonCImpl;
                this.b = activityRetainedCImpl;
                this.c = i;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ActivityRetainedCImpl activityRetainedCImpl = this.b;
                SingletonCImpl singletonCImpl = this.f4085a;
                int i = this.c;
                switch (i) {
                    case 0:
                        return new RetainedLifecycleImpl();
                    case 1:
                        return new ManageFullDeliveryAddressesPresenter((RepositoryManager) singletonCImpl.t1.get(), (LegacyShoppingModeRepository) singletonCImpl.E1.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (SchedulersProvider) singletonCImpl.o1.get(), (LegacyShopAnalyticsManager) singletonCImpl.r1.get(), (NetworkExceptions) singletonCImpl.m1.get(), (FulfilmentExceptions) singletonCImpl.K3.get());
                    case 2:
                        return ShopNotificationPreferencesModule_ProvidePreferencesCommInteractorFactory.a(activityRetainedCImpl.f4084a);
                    case 3:
                        return ActivityModule_ProvideDigitalPayForOrderPresenterFactory.a(activityRetainedCImpl.b, (ApiService) singletonCImpl.V3.get(), (CheckoutInteractor) singletonCImpl.W3.get(), (Gson) singletonCImpl.G0.get(), (PaymentServicesInteractor) singletonCImpl.e2.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (DeviceFingerprintInteractor) singletonCImpl.b3.get(), (SchedulersProvider) singletonCImpl.o1.get(), (ShopAppTokenAuthenticator) singletonCImpl.I0.get(), (NetworkExceptions) singletonCImpl.m1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (PayClient) singletonCImpl.c2.get(), new CollectDeviceData(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 4:
                        ProductListModule productListModule = activityRetainedCImpl.c;
                        ProductListAppModule productListAppModule = singletonCImpl.m0;
                        ApplicationContextModule applicationContextModule = singletonCImpl.e;
                        return ProductListModule_ProvideProductListInteractorFactory.a(productListModule, ProductListAppModule_ProvidesProductsRepositoryFactory.a(productListAppModule, ProductListAppModule_ProvidesProductsSharedPrefsFactory.a(productListAppModule, Contexts.a(applicationContextModule.f23776a)), ProductListAppModule_ProvidesProductListFiltersSharedPrefsFactory.a(singletonCImpl.m0, Contexts.a(applicationContextModule.f23776a)), (ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1(), (ShopAppFlavorInteractor) singletonCImpl.N0.get()), SingletonCImpl.Z0(singletonCImpl), (RepositoryManager) singletonCImpl.t1.get(), (GoogleAdManagerInteractor) activityRetainedCImpl.v.get(), (TrolleyInteractor) singletonCImpl.h2.get(), new EducationBottomSheetRepository(activityRetainedCImpl.n.y1()), (FirebasePerfMonitor) singletonCImpl.Z0.get());
                    case 5:
                        return ProductListModule_ProvidesGoogleAdManagerInteractorFactory.a(activityRetainedCImpl.c, (GoogleAdManagerRepository) activityRetainedCImpl.u.get(), (DispatcherProvider) singletonCImpl.n1.get(), (GoogleAdLoadingTimeoutConfig) singletonCImpl.X3.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get());
                    case 6:
                        return ProductListModule_ProvidesGoogleAdManagerRepositoryFactory.a(activityRetainedCImpl.c, Contexts.a(singletonCImpl.e.f23776a), (Gson) singletonCImpl.g1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 7:
                        au.com.woolworths.feature.product.list.legacy.di.ProductListModule productListModule2 = activityRetainedCImpl.d;
                        au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule productListAppModule2 = singletonCImpl.n0;
                        ApplicationContextModule applicationContextModule2 = singletonCImpl.e;
                        return au.com.woolworths.feature.product.list.legacy.di.ProductListModule_ProvideProductListInteractorFactory.a(productListModule2, au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule_ProvidesProductsRepositoryFactory.a(productListAppModule2, au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule_ProvidesProductsSharedPrefsFactory.a(productListAppModule2, Contexts.a(applicationContextModule2.f23776a)), au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule_ProvidesProductListFiltersSharedPrefsFactory.a(singletonCImpl.n0, Contexts.a(applicationContextModule2.f23776a)), (ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1(), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (ShopAppFlavorInteractor) singletonCImpl.N0.get()), SingletonCImpl.Z0(singletonCImpl), (RepositoryManager) singletonCImpl.t1.get(), (GoogleAdManagerInteractor) activityRetainedCImpl.y.get(), (TrolleyInteractor) singletonCImpl.h2.get(), new EducationBottomSheetRepository(activityRetainedCImpl.n.y1()), (FirebasePerfMonitor) singletonCImpl.Z0.get());
                    case 8:
                        return au.com.woolworths.feature.product.list.legacy.di.ProductListModule_ProvidesGoogleAdManagerInteractorFactory.a(activityRetainedCImpl.d, (GoogleAdManagerRepository) activityRetainedCImpl.x.get(), (DispatcherProvider) singletonCImpl.n1.get(), (GoogleAdLoadingTimeoutConfig) singletonCImpl.X3.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get());
                    case 9:
                        return au.com.woolworths.feature.product.list.legacy.di.ProductListModule_ProvidesGoogleAdManagerRepositoryFactory.a(activityRetainedCImpl.d, Contexts.a(singletonCImpl.e.f23776a), (Gson) singletonCImpl.g1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    default:
                        throw new AssertionError(i);
                }
            }
        }

        public ActivityRetainedCImpl(SingletonCImpl singletonCImpl, ActivityModule activityModule, CatalogueModule catalogueModule, DynamicPageModule dynamicPageModule, OliveVoiceModule oliveVoiceModule, ProductListModule productListModule, au.com.woolworths.feature.product.list.legacy.di.ProductListModule productListModule2, RewardsRedemptionSettingsModule rewardsRedemptionSettingsModule, SharedEReceiptDetailsModule sharedEReceiptDetailsModule, ShopListsDataModule shopListsDataModule, ShopLoginModule shopLoginModule, ShopMarketplaceModule shopMarketplaceModule, ShopNotificationPreferencesModule shopNotificationPreferencesModule, ShopProductNavigationModule shopProductNavigationModule) {
            this.n = singletonCImpl;
            this.f4084a = shopNotificationPreferencesModule;
            this.b = activityModule;
            this.c = productListModule;
            this.d = productListModule2;
            this.e = catalogueModule;
            this.f = sharedEReceiptDetailsModule;
            this.g = shopLoginModule;
            this.h = shopMarketplaceModule;
            this.i = oliveVoiceModule;
            this.j = rewardsRedemptionSettingsModule;
            this.k = shopProductNavigationModule;
            this.l = shopListsDataModule;
            this.m = dynamicPageModule;
            this.p = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(singletonCImpl, this, 1);
            this.q = switchingProvider;
            this.r = DoubleCheck.b(switchingProvider);
            this.s = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 2));
            this.t = new SwitchingProvider(singletonCImpl, this, 3);
            this.u = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 6));
            this.v = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 5));
            this.w = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 4));
            this.x = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 9));
            this.y = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 8));
            this.z = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 7));
        }

        public static CheckoutWPayDataRepository d(ActivityRetainedCImpl activityRetainedCImpl) {
            SingletonCImpl singletonCImpl = activityRetainedCImpl.n;
            return new CheckoutWPayDataRepository((ApolloClient) singletonCImpl.C1.get(), (ApolloClient) singletonCImpl.U3.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        public static DeleteAccountInteractorImpl e(ActivityRetainedCImpl activityRetainedCImpl) {
            SingletonCImpl singletonCImpl = activityRetainedCImpl.n;
            return new DeleteAccountInteractorImpl(new DeleteAccountRepository((ApolloClient) singletonCImpl.C1.get()), singletonCImpl.L(), SingletonCImpl.X0(singletonCImpl), (InStoreWifiInteractor) singletonCImpl.M2.get(), (ShoppingListSyncInteractor) singletonCImpl.L2.get(), (OkHttpClient) singletonCImpl.f1.get());
        }

        public static EverydayExtrasFinalGlanceInteractorImpl f(ActivityRetainedCImpl activityRetainedCImpl) {
            return new EverydayExtrasFinalGlanceInteractorImpl(new EverydayExtrasFinalGlanceRepository((ApolloClient) activityRetainedCImpl.n.Q1.get()), new EverydayExtrasSummaryRepository((ApolloClient) activityRetainedCImpl.n.Q1.get()));
        }

        public static EverydayExtrasLandingInteractorImpl g(ActivityRetainedCImpl activityRetainedCImpl) {
            SingletonCImpl singletonCImpl = activityRetainedCImpl.n;
            return new EverydayExtrasLandingInteractorImpl(new EverydayExtrasLandingRepository((ApolloClient) singletonCImpl.Q1.get()), (SignUpQueryParamsManager) singletonCImpl.p4.get());
        }

        public static EverydayExtrasSummaryInteractorImpl h(ActivityRetainedCImpl activityRetainedCImpl) {
            return new EverydayExtrasSummaryInteractorImpl(new EverydayExtrasSummaryRepository((ApolloClient) activityRetainedCImpl.n.Q1.get()), (SignUpQueryParamsManager) activityRetainedCImpl.n.p4.get());
        }

        public static MarketplaceInteractor i(ActivityRetainedCImpl activityRetainedCImpl) {
            ShopMarketplaceModule shopMarketplaceModule = activityRetainedCImpl.h;
            SingletonCImpl singletonCImpl = activityRetainedCImpl.n;
            return ShopMarketplaceModule_ProvideMarketplaceInteractorFactory.a(shopMarketplaceModule, new MarketplaceRepositoryImpl((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get()));
        }

        public static ProductListInteractorImpl j(ActivityRetainedCImpl activityRetainedCImpl) {
            SingletonCImpl singletonCImpl = activityRetainedCImpl.n;
            return new ProductListInteractorImpl(au.com.woolworths.feature.product.list.v2.di.ProductListAppModule_ProvidesProductsRepositoryFactory.a(singletonCImpl.D0, au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule_ProvidesProductsSharedPrefsFactory.a(singletonCImpl.n0, Contexts.a(singletonCImpl.e.f23776a)), (ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1(), (ShopAppFlavorInteractor) singletonCImpl.N0.get()));
        }

        public static RewardsRedemptionSettingsInteractor k(ActivityRetainedCImpl activityRetainedCImpl) {
            RewardsRedemptionSettingsModule rewardsRedemptionSettingsModule = activityRetainedCImpl.j;
            SingletonCImpl singletonCImpl = activityRetainedCImpl.n;
            return RewardsRedemptionSettingsModule_ProvideRewardsRedemptionSettingsInteractorFactory.a(rewardsRedemptionSettingsModule, RewardsRedemptionSettingsModule_ProvideRewardsRedemptionSettingsRepositoryFactory.a(rewardsRedemptionSettingsModule, (ApolloClient) singletonCImpl.Q1.get()), (RedemptionStateRepository) singletonCImpl.X4.get());
        }

        public static WPayManagerImpl l(ActivityRetainedCImpl activityRetainedCImpl) {
            SingletonCImpl singletonCImpl = activityRetainedCImpl.n;
            return new WPayManagerImpl(ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), new DigipayUtils((SharedHeaders) singletonCImpl.c1.get(), (RewardsAppTokenAuthenticator) singletonCImpl.q4.get(), ReleaseModule_ProvideJwtRepositoryFactory.a(singletonCImpl.c, (JwtApi) singletonCImpl.r4.get()), (Gson) singletonCImpl.g1.get()), (AppConfig) singletonCImpl.W0.get());
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public final ActivityComponentBuilder a() {
            return new ActivityCBuilder(this.n, this.o);
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public final ActivityRetainedLifecycle b() {
            return (ActivityRetainedLifecycle) this.p.get();
        }

        public final CatalogueApiInterface m() {
            CatalogueModule catalogueModule = this.e;
            CatalogueConfigInteractorImpl catalogueConfigInteractorImplA = CatalogueModule_ProvideCatalogueConfigInteractorFactory.a(catalogueModule);
            SingletonCImpl singletonCImpl = this.n;
            ConnectionManager connectionManager = (ConnectionManager) singletonCImpl.L0.get();
            CatalogueAppModule catalogueAppModule = singletonCImpl.i;
            CatalogueAppModule_ProvideSupplementaryCatalogueInterceptorsFactory.a(catalogueAppModule);
            return CatalogueModule_ProvideCatalogueApiInterfaceFactory.a(catalogueModule, CatalogueModule_ProvideCatalogueOkHttpClientFactory.a(catalogueModule, catalogueConfigInteractorImplA, connectionManager, ImmutableSet.q(EmptySet.d)), CatalogueModule_ProvideCatalogueConfigInteractorFactory.a(catalogueModule), CatalogueAppModule_ProvideCatalogueGson$catalogue_releaseFactory.a(catalogueAppModule));
        }
    }

    /* loaded from: classes3.dex */
    public static final class AddItemActivitySubcomponentFactory implements SessionActivityBuilderModule_BindAddItemActivity.AddItemActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4086a;
        public final CartSessionComponentImpl b;

        public AddItemActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl) {
            this.f4086a = singletonCImpl;
            this.b = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            AddItemActivityModule addItemActivityModule = new AddItemActivityModule();
            return new AddItemActivitySubcomponentImpl(this.f4086a, this.b, addItemActivityModule, (AddItemActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class AddItemActivitySubcomponentImpl implements SessionActivityBuilderModule_BindAddItemActivity.AddItemActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final AddItemActivity f4087a;
        public final SingletonCImpl b;
        public final CartSessionComponentImpl c;

        public AddItemActivitySubcomponentImpl(SingletonCImpl singletonCImpl, CartSessionComponentImpl cartSessionComponentImpl, AddItemActivityModule addItemActivityModule, AddItemActivity addItemActivity) {
            this.b = singletonCImpl;
            this.c = cartSessionComponentImpl;
            this.f4087a = addItemActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            AddItemActivity addItemActivity = (AddItemActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            CartSessionComponentImpl cartSessionComponentImpl = this.c;
            Cart shoppingCart = (Cart) cartSessionComponentImpl.l.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart, "shoppingCart");
            AddToCartUseCase addToCartUseCase = new AddToCartUseCase(scanNGoRepositoryX1, shoppingCart, schedulerA);
            ScanNGoRepository scanNGoRepositoryX12 = singletonCImpl.x1();
            Cart shoppingCart2 = (Cart) cartSessionComponentImpl.l.get();
            Scheduler schedulerA2 = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart2, "shoppingCart");
            UpdateProductUseCase updateProductUseCase = new UpdateProductUseCase(scanNGoRepositoryX12, shoppingCart2, schedulerA2);
            UserManager userManager = (UserManager) singletonCImpl.X2.get();
            Cart cart = (Cart) cartSessionComponentImpl.l.get();
            Store currentStore = (Store) cartSessionComponentImpl.m.get();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(userManager, "userManager");
            Intrinsics.h(cart, "cart");
            Intrinsics.h(currentStore, "currentStore");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            addItemActivity.t = new AddItemPresenter(this.f4087a, addToCartUseCase, updateProductUseCase, cart, currentStore, userManager, analyticsAggregator);
            addItemActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            addItemActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            addItemActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            addItemActivity.z = (PayClient) singletonCImpl.Q2.get();
            addItemActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            addItemActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class AddPaymentActivitySubcomponentFactory implements UserActivityBuilderModule_BindAddPaymentActivity.AddPaymentActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4088a;

        public AddPaymentActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4088a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            AddPaymentActivityModule addPaymentActivityModule = new AddPaymentActivityModule();
            return new AddPaymentActivitySubcomponentImpl(this.f4088a, addPaymentActivityModule, (AddPaymentActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class AddPaymentActivitySubcomponentImpl implements UserActivityBuilderModule_BindAddPaymentActivity.AddPaymentActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final AddPaymentActivity f4089a;
        public final SingletonCImpl b;

        public AddPaymentActivitySubcomponentImpl(SingletonCImpl singletonCImpl, AddPaymentActivityModule addPaymentActivityModule, AddPaymentActivity addPaymentActivity) {
            this.b = singletonCImpl;
            this.f4089a = addPaymentActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) throws NumberFormatException {
            AddPaymentActivity addPaymentActivity = (AddPaymentActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            DefaultTokenProvider defaultTokenProviderB1 = singletonCImpl.B1();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlyticsKt.a();
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(analyticsManager, "analyticsManager");
            addPaymentActivity.t = new AddPaymentPresenter(this.f4089a, defaultTokenProviderB1, featureToggleManager, analyticsManager, firebaseCrashlyticsA);
            addPaymentActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            addPaymentActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            addPaymentActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            addPaymentActivity.z = (PayClient) singletonCImpl.Q2.get();
            addPaymentActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            addPaymentActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            addPaymentActivity.K = (GooglePayManager) singletonCImpl.J3.get();
        }
    }

    public static final class AddPaymentSetupActivitySubcomponentFactory implements ActivityBuilderModule_BindPaymentSetupActivity.AddPaymentSetupActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4090a;

        public AddPaymentSetupActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4090a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new AddPaymentSetupActivitySubcomponentImpl(this.f4090a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class AddPaymentSetupActivitySubcomponentImpl implements ActivityBuilderModule_BindPaymentSetupActivity.AddPaymentSetupActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4091a;

        public AddPaymentSetupActivitySubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4091a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            AddPaymentSetupActivity addPaymentSetupActivity = (AddPaymentSetupActivity) obj;
            SingletonCImpl singletonCImpl = this.f4091a;
            addPaymentSetupActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            addPaymentSetupActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            addPaymentSetupActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            addPaymentSetupActivity.z = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    public static final class AvailableStoreListActivitySubcomponentFactory implements ActivityBuilderModule_BindAvailableStoreListActivity.AvailableStoreListActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4092a;

        public AvailableStoreListActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4092a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new AvailableStoreListActivitySubcomponentImpl(this.f4092a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class AvailableStoreListActivitySubcomponentImpl implements ActivityBuilderModule_BindAvailableStoreListActivity.AvailableStoreListActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4093a;

        public AvailableStoreListActivitySubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4093a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            AvailableStoreListActivity availableStoreListActivity = (AvailableStoreListActivity) obj;
            SingletonCImpl singletonCImpl = this.f4093a;
            availableStoreListActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            availableStoreListActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            availableStoreListActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            availableStoreListActivity.z = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    public static final class AvailableStoresActivitySubcomponentFactory implements ActivityBuilderModule_BindAvailableStotresActivity.AvailableStoresActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4094a;

        public AvailableStoresActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4094a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new AvailableStoresActivitySubcomponentImpl(this.f4094a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class AvailableStoresActivitySubcomponentImpl implements ActivityBuilderModule_BindAvailableStotresActivity.AvailableStoresActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4095a;

        public AvailableStoresActivitySubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4095a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            AvailableStoresActivity availableStoresActivity = (AvailableStoresActivity) obj;
            SingletonCImpl singletonCImpl = this.f4095a;
            availableStoresActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            availableStoresActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            availableStoresActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            availableStoresActivity.z = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    public static final class Builder {
        public InstoreNavigationAppModule A;
        public ShopWPayAppModule A0;
        public InstorePresenceAppModule B;
        public ShopWxidAppModule B0;
        public LegacyAppModule C;
        public TigerNewOffersModule C0;
        public LegacyDataModule D;
        public VocAppModule D0;
        public LegacyDigipayModule E;
        public WxidAppModule E0;
        public MarketingAppModule F;
        public MoreFeatureAppModule G;
        public NavigationModule H;
        public NetworkModule I;
        public au.com.woolworths.android.onesite.di.modules.NetworkModule J;
        public NotificationModule K;
        public OliveVoiceAppModule L;
        public OnboardingSduiAppModule M;
        public ProductAppModule N;
        public ProductAvailabilityModule O;
        public ProductDetailsAppModule P;
        public au.com.woolworths.shop.product.details.di.ProductDetailsAppModule Q;
        public ProductListAppModule R;
        public au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule S;
        public au.com.woolworths.feature.product.list.v2.di.ProductListAppModule T;
        public PromotionBannerAppModule U;
        public PushNotificationPermissionModule V;
        public RecipeDetailsAppModule W;
        public RecipesAppModule X;
        public ReleaseModule Y;
        public au.com.woolworths.feature.shop.instore.navigation.di.ReleaseModule Z;

        /* renamed from: a, reason: collision with root package name */
        public AdvertisingAppModule f4096a;
        public RemoteDismissibleBannerModule a0;
        public AppBuildConfigModule b;
        public RewardsAccountAppModule b0;
        public AppConfigModule c;
        public RewardsCardAppModule c0;
        public AppModule d;
        public RewardsOffersAppModule d0;
        public BaseShopAppModule e;
        public RewardsOnboardingAppModule e0;
        public ApplicationContextModule f;
        public RewardsPreferencesAppModule f0;
        public BaseDataModule g;
        public RewardsServiceMessageModule g0;
        public BaseNetworkModule h;
        public ScanNGoModule h0;
        public BaseRewardsAppModule i;
        public ViewModelModule i0;
        public BuyAgainAppModule j;
        public BffScanNGoModule j0;
        public CartInfoModule k;
        public ScanNGoNotificationModule k0;
        public CartUpdateModule l;
        public SduiModule l0;
        public CatalogueAppModule m;
        public ShippingCalculatorAppModule m0;
        public CheckoutAppModule n;
        public ShopAppRegionModule n0;
        public CollectionModeModule o;
        public ShopAskOliveAppModule o0;
        public DeliveryAddressAppModule p;
        public ShopAuthAppModule p0;
        public DeviceFingerprintAppModule q;
        public ShopCheckoutAppModule q0;
        public DigipaySdkAppModule r;
        public ShopListsAppModule r0;
        public EditOrderModule s;
        public ShopListsDataAppModule s0;
        public ForceUpgradeAppModule t;
        public ShopLoginAppModule t0;
        public FusedLocationModule u;
        public ShopMarketplaceAppModule u0;
        public GeolocationAppModule v;
        public ShopMyOrdersAppModule v0;
        public HomepageAppModule w;
        public ShopReceiptDetailsAppModule w0;
        public HttpInterceptorModule x;
        public ShopScanAndGoAppModule x0;
        public InStoreWifiAppModule y;
        public ShopStoreLocatorAppModule y0;
        public InstoreCartAppModule z;
        public au.com.woolworths.feature.shop.storelocator.legacy.di.ShopStoreLocatorAppModule z0;
    }

    /* loaded from: classes3.dex */
    public static final class COFPM_PILFF_InstrumentListFragmentSubcomponentFactory implements CheckOutFragmentProviderModule_ProvideInstrumentListFragmentFactory.InstrumentListFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4097a;

        public COFPM_PILFF_InstrumentListFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, CheckOutActivitySubcomponentImpl checkOutActivitySubcomponentImpl) {
            this.f4097a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            InstrumentListFragmentModule instrumentListFragmentModule = new InstrumentListFragmentModule();
            return new COFPM_PILFF_InstrumentListFragmentSubcomponentImpl(this.f4097a, instrumentListFragmentModule, (InstrumentListFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class COFPM_PILFF_InstrumentListFragmentSubcomponentImpl implements CheckOutFragmentProviderModule_ProvideInstrumentListFragmentFactory.InstrumentListFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final InstrumentListFragmentModule f4098a;
        public final InstrumentListFragment b;
        public final SingletonCImpl c;

        public COFPM_PILFF_InstrumentListFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, InstrumentListFragmentModule instrumentListFragmentModule, InstrumentListFragment instrumentListFragment) {
            this.c = singletonCImpl;
            this.f4098a = instrumentListFragmentModule;
            this.b = instrumentListFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) throws NumberFormatException {
            InstrumentListFragment instrumentListFragment = (InstrumentListFragment) obj;
            SingletonCImpl singletonCImpl = this.c;
            PayClient payClient = (PayClient) singletonCImpl.Q2.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            GetInstrumentsUC getInstrumentsUCA = InstrumentListFragmentModule_GetInstrumentUseCaseFactory.a(this.f4098a, payClient, ScanNGoModule_GetMerchantProfilesFactory.a(scanNGoModule, (PayClient) singletonCImpl.Q2.get(), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule), singletonCImpl.B1()), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule), singletonCImpl.B1());
            PayClient payClient2 = (PayClient) singletonCImpl.Q2.get();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            DefaultTokenProvider defaultTokenProviderB1 = singletonCImpl.B1();
            Intrinsics.h(payClient2, "payClient");
            instrumentListFragment.d = new InstrumentListPresenter(this.b, getInstrumentsUCA, new RemoveInstrumentUC(payClient2, schedulerA, defaultTokenProviderB1), SingletonCImpl.a1(singletonCImpl));
            instrumentListFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            instrumentListFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            instrumentListFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            instrumentListFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            instrumentListFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class CartSessionComponentBuilder implements CartSessionComponent.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4099a;
        public final UserComponentImpl b;
        public CartSessionModule c;

        public CartSessionComponentBuilder(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4099a = singletonCImpl;
            this.b = userComponentImpl;
        }

        @Override // com.woolworths.scanlibrary.di.session.CartSessionComponent.Builder
        public final CartSessionComponent.Builder a(CartSessionModule cartSessionModule) {
            this.c = cartSessionModule;
            return this;
        }

        @Override // com.woolworths.scanlibrary.di.session.CartSessionComponent.Builder
        public final CartSessionComponent build() {
            Preconditions.a(CartSessionModule.class, this.c);
            return new CartSessionComponentImpl(this.f4099a, this.b, this.c);
        }
    }

    /* loaded from: classes3.dex */
    public static final class CartSessionComponentImpl implements CartSessionComponent {

        /* renamed from: a, reason: collision with root package name */
        public final CartSessionModule f4100a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final Provider d;
        public final Provider e;
        public final Provider f;
        public final Provider g;
        public final Provider h;
        public final Provider i;
        public final Provider j;
        public final Provider k;
        public final Provider l;
        public final Provider m;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4101a;
            public final UserComponentImpl b;
            public final CartSessionComponentImpl c;
            public final int d;

            public SwitchingProvider(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, int i) {
                this.f4101a = singletonCImpl;
                this.b = userComponentImpl;
                this.c = cartSessionComponentImpl;
                this.d = i;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                UserComponentImpl userComponentImpl = this.b;
                SingletonCImpl singletonCImpl = this.f4101a;
                CartSessionComponentImpl cartSessionComponentImpl = this.c;
                int i = this.d;
                switch (i) {
                    case 0:
                        return new HomeActivitySubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl);
                    case 1:
                        return new ShoppingCartActivitySubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl);
                    case 2:
                        return new ScannerActivityOldSubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl);
                    case 3:
                        return new ScannerActivitySubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl);
                    case 4:
                        return new AddItemActivitySubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl);
                    case 5:
                        return new WeightedArticleSelectionActivitySubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl);
                    case 6:
                        return new CheckOutActivitySubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl);
                    case 7:
                        return new ProductInfoActivitySubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl);
                    case 8:
                        return cartSessionComponentImpl.f4100a.b;
                    case 9:
                        Store store = cartSessionComponentImpl.f4100a.f21167a;
                        Preconditions.d(store);
                        return store;
                    default:
                        throw new AssertionError(i);
                }
            }
        }

        public CartSessionComponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionModule cartSessionModule) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.f4100a = cartSessionModule;
            this.d = new SwitchingProvider(singletonCImpl, userComponentImpl, this, 0);
            this.e = new SwitchingProvider(singletonCImpl, userComponentImpl, this, 1);
            this.f = new SwitchingProvider(singletonCImpl, userComponentImpl, this, 2);
            this.g = new SwitchingProvider(singletonCImpl, userComponentImpl, this, 3);
            this.h = new SwitchingProvider(singletonCImpl, userComponentImpl, this, 4);
            this.i = new SwitchingProvider(singletonCImpl, userComponentImpl, this, 5);
            this.j = new SwitchingProvider(singletonCImpl, userComponentImpl, this, 6);
            this.k = new SwitchingProvider(singletonCImpl, userComponentImpl, this, 7);
            this.l = DoubleCheck.b(new SwitchingProvider(singletonCImpl, userComponentImpl, this, 8));
            this.m = DoubleCheck.b(new SwitchingProvider(singletonCImpl, userComponentImpl, this, 9));
        }

        @Override // com.woolworths.scanlibrary.di.session.CartSessionComponent
        public final void a(CartSessionManager cartSessionManager) {
            ImmutableMap.Builder builderB = ImmutableMap.b(28);
            SingletonCImpl singletonCImpl = this.b;
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            UserComponentImpl userComponentImpl = this.c;
            builderB.c(TapActivity.class, userComponentImpl.c);
            builderB.c(AddPaymentActivity.class, userComponentImpl.d);
            builderB.c(UpdateCreditCardActivity.class, userComponentImpl.e);
            builderB.c(MyAccountActivity.class, userComponentImpl.f);
            builderB.c(TransactionListActivity.class, userComponentImpl.g);
            builderB.c(ReceiptActivity.class, userComponentImpl.h);
            builderB.c(ExitScanCodeActivity.class, userComponentImpl.i);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchActivity.class, userComponentImpl.j);
            builderB.c(HomeActivity.class, this.d);
            builderB.c(ShoppingCartActivity.class, this.e);
            builderB.c(ScannerActivityOld.class, this.f);
            builderB.c(ScannerActivity.class, this.g);
            builderB.c(AddItemActivity.class, this.h);
            builderB.c(WeightedArticleSelectionActivity.class, this.i);
            builderB.c(CheckOutActivity.class, this.j);
            builderB.c(ProductInfoActivity.class, this.k);
            cartSessionManager.d = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CheckOutActivitySubcomponentFactory implements SessionActivityBuilderModule_BindCheckOutActivity.CheckOutActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4102a;
        public final UserComponentImpl b;
        public final CartSessionComponentImpl c;

        public CheckOutActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl) {
            this.f4102a = singletonCImpl;
            this.b = userComponentImpl;
            this.c = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            CheckOutActivityModule checkOutActivityModule = new CheckOutActivityModule();
            return new CheckOutActivitySubcomponentImpl(this.f4102a, this.b, this.c, checkOutActivityModule, (CheckOutActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class CheckOutActivitySubcomponentImpl implements SessionActivityBuilderModule_BindCheckOutActivity.CheckOutActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final CheckOutActivity f4103a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final CartSessionComponentImpl d;
        public final Provider e;
        public final Provider f;
        public final Provider g;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4104a;
            public final UserComponentImpl b;
            public final CartSessionComponentImpl c;
            public final CheckOutActivitySubcomponentImpl d;
            public final int e;

            public SwitchingProvider(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, CheckOutActivitySubcomponentImpl checkOutActivitySubcomponentImpl, int i) {
                this.f4104a = singletonCImpl;
                this.b = userComponentImpl;
                this.c = cartSessionComponentImpl;
                this.d = checkOutActivitySubcomponentImpl;
                this.e = i;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CheckOutActivitySubcomponentImpl checkOutActivitySubcomponentImpl = this.d;
                CartSessionComponentImpl cartSessionComponentImpl = this.c;
                UserComponentImpl userComponentImpl = this.b;
                SingletonCImpl singletonCImpl = this.f4104a;
                int i = this.e;
                if (i == 0) {
                    return new PayFragmentSubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl, checkOutActivitySubcomponentImpl);
                }
                if (i == 1) {
                    return new COFPM_PILFF_InstrumentListFragmentSubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl, checkOutActivitySubcomponentImpl);
                }
                if (i == 2) {
                    return new StepUpDialogFragmentSubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl, checkOutActivitySubcomponentImpl);
                }
                throw new AssertionError(i);
            }
        }

        public CheckOutActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, CheckOutActivityModule checkOutActivityModule, CheckOutActivity checkOutActivity) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.d = cartSessionComponentImpl;
            this.f4103a = checkOutActivity;
            this.e = new SwitchingProvider(singletonCImpl, userComponentImpl, cartSessionComponentImpl, this, 0);
            this.f = new SwitchingProvider(singletonCImpl, userComponentImpl, cartSessionComponentImpl, this, 1);
            this.g = new SwitchingProvider(singletonCImpl, userComponentImpl, cartSessionComponentImpl, this, 2);
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            CheckOutActivity checkOutActivity = (CheckOutActivity) obj;
            CheckOutActivity checkOutActivity2 = this.f4103a;
            CheckOutPresenter checkOutPresenter = new CheckOutPresenter(checkOutActivity2);
            checkOutActivity2.k1(checkOutPresenter);
            checkOutActivity.t = checkOutPresenter;
            SingletonCImpl singletonCImpl = this.b;
            checkOutActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            checkOutActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            checkOutActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            checkOutActivity.z = (PayClient) singletonCImpl.Q2.get();
            checkOutActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            checkOutActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            ImmutableMap.Builder builderB = ImmutableMap.b(31);
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            UserComponentImpl userComponentImpl = this.c;
            builderB.c(TapActivity.class, userComponentImpl.c);
            builderB.c(AddPaymentActivity.class, userComponentImpl.d);
            builderB.c(UpdateCreditCardActivity.class, userComponentImpl.e);
            builderB.c(MyAccountActivity.class, userComponentImpl.f);
            builderB.c(TransactionListActivity.class, userComponentImpl.g);
            builderB.c(ReceiptActivity.class, userComponentImpl.h);
            builderB.c(ExitScanCodeActivity.class, userComponentImpl.i);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchActivity.class, userComponentImpl.j);
            CartSessionComponentImpl cartSessionComponentImpl = this.d;
            builderB.c(HomeActivity.class, cartSessionComponentImpl.d);
            builderB.c(ShoppingCartActivity.class, cartSessionComponentImpl.e);
            builderB.c(ScannerActivityOld.class, cartSessionComponentImpl.f);
            builderB.c(ScannerActivity.class, cartSessionComponentImpl.g);
            builderB.c(AddItemActivity.class, cartSessionComponentImpl.h);
            builderB.c(WeightedArticleSelectionActivity.class, cartSessionComponentImpl.i);
            builderB.c(CheckOutActivity.class, cartSessionComponentImpl.j);
            builderB.c(ProductInfoActivity.class, cartSessionComponentImpl.k);
            builderB.c(PayFragment.class, this.e);
            builderB.c(InstrumentListFragment.class, this.f);
            builderB.c(StepUpDialogFragment.class, this.g);
            checkOutActivity.G = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
            checkOutActivity.I = (Cart) cartSessionComponentImpl.l.get();
        }
    }

    public static final class ContactUsActivitySubcomponentFactory implements ActivityBuilderModule_BindContactUsActivity.ContactUsActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4105a;

        public ContactUsActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4105a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            ContactUsActivityModule contactUsActivityModule = new ContactUsActivityModule();
            return new ContactUsActivitySubcomponentImpl(this.f4105a, contactUsActivityModule, (ContactUsActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ContactUsActivitySubcomponentImpl implements ActivityBuilderModule_BindContactUsActivity.ContactUsActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ContactUsActivity f4106a;
        public final SingletonCImpl b;

        public ContactUsActivitySubcomponentImpl(SingletonCImpl singletonCImpl, ContactUsActivityModule contactUsActivityModule, ContactUsActivity contactUsActivity) {
            this.b = singletonCImpl;
            this.f4106a = contactUsActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ContactUsActivity contactUsActivity = (ContactUsActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            contactUsActivity.t = new ContactUsPresenter(this.f4106a, analyticsAggregator);
            contactUsActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            contactUsActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            contactUsActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            contactUsActivity.z = (PayClient) singletonCImpl.Q2.get();
            contactUsActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            contactUsActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            String strW1 = singletonCImpl.w1();
            scanNGoModule.getClass();
            contactUsActivity.K = String.format("%s/scan/go/contactus", Arrays.copyOf(new Object[]{strW1}, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static final class ExitScanCodeActivitySubcomponentFactory implements UserActivityBuilderModule_BindExitScanCodeActivity.ExitScanCodeActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4107a;
        public final UserComponentImpl b;

        public ExitScanCodeActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4107a = singletonCImpl;
            this.b = userComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new ExitScanCodeActivitySubcomponentImpl(this.f4107a, this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ExitScanCodeActivitySubcomponentImpl implements UserActivityBuilderModule_BindExitScanCodeActivity.ExitScanCodeActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4108a;
        public final UserComponentImpl b;

        public ExitScanCodeActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4108a = singletonCImpl;
            this.b = userComponentImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ExitScanCodeActivity exitScanCodeActivity = (ExitScanCodeActivity) obj;
            SingletonCImpl singletonCImpl = this.f4108a;
            exitScanCodeActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            exitScanCodeActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            exitScanCodeActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            exitScanCodeActivity.z = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            exitScanCodeActivity.E = (LogoutManager) this.b.n.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class FragmentCBuilder implements ShopApplication_HiltComponents.FragmentC.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4109a;
        public final ActivityRetainedCImpl b;
        public final ActivityCImpl c;
        public Fragment d;

        public FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.f4109a = singletonCImpl;
            this.b = activityRetainedCImpl;
            this.c = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public final FragmentComponentBuilder a(Fragment fragment2) {
            fragment2.getClass();
            this.d = fragment2;
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public final FragmentComponent build() {
            Preconditions.a(Fragment.class, this.d);
            return new FragmentCImpl(this.f4109a, this.b, this.c);
        }
    }

    /* loaded from: classes3.dex */
    public static final class FragmentCImpl extends ShopApplication_HiltComponents.FragmentC {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4110a;
        public final ActivityRetainedCImpl b;
        public final ActivityCImpl c;
        public final Provider d;
        public final Provider e;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4111a;
            public final FragmentCImpl b;
            public final int c;

            public SwitchingProvider(SingletonCImpl singletonCImpl, FragmentCImpl fragmentCImpl, int i) {
                this.f4111a = singletonCImpl;
                this.b = fragmentCImpl;
                this.c = i;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i = this.c;
                if (i == 0) {
                    return new ProductReviewAlternativeViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.FragmentCImpl.SwitchingProvider.1
                        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel.Factory
                        public final ProductReviewAlternativeViewModel a(String str) {
                            SwitchingProvider switchingProvider = SwitchingProvider.this;
                            FragmentCImpl fragmentCImpl = switchingProvider.b;
                            return new ProductReviewAlternativeViewModel(str, new ProductReviewAlternativeFetchPage(new ProductReviewAlternativeDataRepository((ApolloClient) fragmentCImpl.b.n.C1.get()), (FeatureToggleManager) fragmentCImpl.f4110a.P0.get()), (ReplaceProductResultRouter) switchingProvider.f4111a.Z3.get(), new ProductReviewAlternativeAnalytics((AnalyticsManager) fragmentCImpl.f4110a.r2.get()));
                        }
                    };
                }
                if (i == 1) {
                    return new ProductReviewViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.FragmentCImpl.SwitchingProvider.2
                        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel.Factory
                        public final ProductReviewViewModel a(Activities.ProductsReviewActivity.Source source) {
                            SwitchingProvider switchingProvider = SwitchingProvider.this;
                            FragmentCImpl fragmentCImpl = switchingProvider.b;
                            ProductReviewFetchPage productReviewFetchPage = new ProductReviewFetchPage(new ProductReviewDataRepository((ApolloClient) fragmentCImpl.b.n.C1.get()));
                            ProductReviewUpdateQuantityProduct productReviewUpdateQuantityProduct = new ProductReviewUpdateQuantityProduct(new ProductReviewDataRepository((ApolloClient) fragmentCImpl.b.n.C1.get()));
                            SingletonCImpl singletonCImpl = switchingProvider.f4111a;
                            return new ProductReviewViewModel(source, productReviewFetchPage, productReviewUpdateQuantityProduct, (CollectionModeInteractor) singletonCImpl.q1.get(), new ProductReviewAnalytics((AnalyticsManager) fragmentCImpl.f4110a.r2.get()), (ReplaceProductResultRouter) singletonCImpl.Z3.get());
                        }
                    };
                }
                throw new AssertionError(i);
            }
        }

        public FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.f4110a = singletonCImpl;
            this.b = activityRetainedCImpl;
            this.c = activityCImpl;
            this.d = SingleCheck.a(new SwitchingProvider(singletonCImpl, this, 0));
            this.e = SingleCheck.a(new SwitchingProvider(singletonCImpl, this, 1));
        }

        @Override // au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment_GeneratedInjector
        public final void A(MarketplacePersonalisedFragment marketplacePersonalisedFragment) {
            marketplacePersonalisedFragment.i = (FeatureToggleManager) this.f4110a.P0.get();
            marketplacePersonalisedFragment.j = this.c.d1();
        }

        @Override // au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment_GeneratedInjector
        public final void B(ProductListOptionsFragment productListOptionsFragment) {
            productListOptionsFragment.i = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment_GeneratedInjector
        public final void C(ProductCategoryFragment productCategoryFragment) {
            productCategoryFragment.m = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.feature.shop.more.MoreFragment_GeneratedInjector
        public final void D(MoreFragment moreFragment) {
            moreFragment.i = this.c.d1();
            SingletonCImpl singletonCImpl = this.f4110a;
            moreFragment.j = (FeatureToggleManager) singletonCImpl.P0.get();
            moreFragment.k = (OkHttpClient) singletonCImpl.f1.get();
            moreFragment.l = (ShopAuthManager) singletonCImpl.R3.get();
            moreFragment.m = (ShopAppFlavorInteractor) singletonCImpl.N0.get();
        }

        @Override // au.com.woolworths.feature.product.list.compose.AlternativeProductsFragment_GeneratedInjector
        public final void E(AlternativeProductsFragment alternativeProductsFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            alternativeProductsFragment.i = (CollectionModeInteractor) singletonCImpl.q1.get();
            alternativeProductsFragment.j = (FeatureToggleManager) singletonCImpl.P0.get();
            alternativeProductsFragment.k = (AnalyticsManager) singletonCImpl.r2.get();
        }

        @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupFragment_GeneratedInjector
        public final void F(FulfilmentWindowsGroupFragment fulfilmentWindowsGroupFragment) {
            fulfilmentWindowsGroupFragment.i = (AnalyticsManager) this.f4110a.r2.get();
        }

        @Override // au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment_GeneratedInjector
        public final void G(OrdersListFragment ordersListFragment) {
            ordersListFragment.i = (AnalyticsManager) this.f4110a.r2.get();
        }

        @Override // au.com.woolworths.feature.product.list.ProductListOptionsFragment_GeneratedInjector
        public final void H(au.com.woolworths.feature.product.list.ProductListOptionsFragment productListOptionsFragment) {
            productListOptionsFragment.i = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment_GeneratedInjector
        public final void I(FulfilmentWindowsFragment fulfilmentWindowsFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            fulfilmentWindowsFragment.i = (AnalyticsManager) singletonCImpl.r2.get();
            fulfilmentWindowsFragment.j = (FeatureToggleManager) singletonCImpl.P0.get();
        }

        @Override // au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetFragment_GeneratedInjector
        public final void J(RewardsRedemptionSettingsBottomSheetFragment rewardsRedemptionSettingsBottomSheetFragment) {
            rewardsRedemptionSettingsBottomSheetFragment.i = (AnalyticsManager) this.f4110a.r2.get();
        }

        @Override // au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestFragment_GeneratedInjector
        public final void K(ShopNotificationPreferencesGuestFragment shopNotificationPreferencesGuestFragment) {
            shopNotificationPreferencesGuestFragment.d = (FeatureToggleManager) this.f4110a.P0.get();
            shopNotificationPreferencesGuestFragment.p = (PreferencesCommInteractor) this.b.s.get();
        }

        @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment_GeneratedInjector
        public final void L(AddToCartBottomSheetFragment addToCartBottomSheetFragment) {
            addToCartBottomSheetFragment.m = this.c.d1();
        }

        @Override // au.com.woolworths.feature.product.list.ProductListFragment_GeneratedInjector
        public final void M(ProductListFragment productListFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            productListFragment.j = (AnalyticsManager) singletonCImpl.r2.get();
            productListFragment.k = (FeatureToggleManager) singletonCImpl.P0.get();
            productListFragment.l = (CollectionModeInteractor) singletonCImpl.q1.get();
            productListFragment.m = this.c.d1();
            productListFragment.n = (CartUpdateInteractor) singletonCImpl.D2.get();
        }

        @Override // au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment_GeneratedInjector
        public final void N(HomePageFragment homePageFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            homePageFragment.m = (AnalyticsManager) singletonCImpl.r2.get();
            homePageFragment.n = (FeatureToggleManager) singletonCImpl.P0.get();
            homePageFragment.o = (CollectionModeInteractor) singletonCImpl.q1.get();
            homePageFragment.p = this.c.d1();
            homePageFragment.q = (FirebasePerfMonitor) singletonCImpl.Z0.get();
            homePageFragment.r = (EditOrderInteractor) singletonCImpl.L1.get();
            homePageFragment.s = new HeroBannerInteractor((SharedPreferences) singletonCImpl.s1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld_GeneratedInjector
        public final void O(AccountSettingsFragmentOld accountSettingsFragmentOld) {
            SingletonCImpl singletonCImpl = this.f4110a;
            accountSettingsFragmentOld.i = (AnalyticsManager) singletonCImpl.r2.get();
            accountSettingsFragmentOld.j = (FeatureToggleManager) singletonCImpl.P0.get();
            accountSettingsFragmentOld.k = (RewardsBannerInteractor) singletonCImpl.Y3.get();
            accountSettingsFragmentOld.l = (Auth0AuthManager) singletonCImpl.l1.get();
        }

        @Override // au.com.woolworths.feature.product.list.legacy.ProductListFragment_GeneratedInjector
        public final void P(au.com.woolworths.feature.product.list.legacy.ProductListFragment productListFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            productListFragment.j = (AnalyticsManager) singletonCImpl.r2.get();
            productListFragment.k = (FeatureToggleManager) singletonCImpl.P0.get();
            productListFragment.l = (CollectionModeInteractor) singletonCImpl.q1.get();
            productListFragment.m = this.c.d1();
            productListFragment.n = (ProductListInteractor) this.b.z.get();
            productListFragment.o = (CartUpdateInteractor) singletonCImpl.D2.get();
        }

        @Override // au.com.woolworths.shop.cart.ui.cart.CartFragment_GeneratedInjector
        public final void Q(CartFragment cartFragment) {
            cartFragment.i = this.c.d1();
            cartFragment.j = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment_GeneratedInjector
        public final void R(CheckoutDetailsFragment checkoutDetailsFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            checkoutDetailsFragment.d = (AnalyticsManager) singletonCImpl.r2.get();
            checkoutDetailsFragment.r = (FeatureToggleManager) singletonCImpl.P0.get();
        }

        @Override // au.com.woolworths.feature.shop.myorders.guest.MyOrdersGuestFragment_GeneratedInjector
        public final void S(MyOrdersGuestFragment myOrdersGuestFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            myOrdersGuestFragment.d = (FeatureToggleManager) singletonCImpl.P0.get();
            myOrdersGuestFragment.p = (AnalyticsManager) singletonCImpl.r2.get();
        }

        @Override // au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment_GeneratedInjector
        public final void T(CheckoutSummaryFragment checkoutSummaryFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            checkoutSummaryFragment.d = (AnalyticsManager) singletonCImpl.r2.get();
            checkoutSummaryFragment.r = (FeatureToggleManager) singletonCImpl.P0.get();
        }

        @Override // au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy_GeneratedInjector
        public final void U(BuyAgainFragmentLegacy buyAgainFragmentLegacy) {
            SingletonCImpl singletonCImpl = this.f4110a;
            buyAgainFragmentLegacy.j = (FeatureToggleManager) singletonCImpl.P0.get();
            buyAgainFragmentLegacy.k = (InstoreNavigationInteractor) singletonCImpl.E3.get();
            buyAgainFragmentLegacy.l = this.c.d1();
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
        public final DefaultViewModelFactories.InternalFactoryFactory a() {
            return this.c.a();
        }

        @Override // au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsFragment_GeneratedInjector
        public final void b(au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsFragment alternativeProductsFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            alternativeProductsFragment.i = (CollectionModeInteractor) singletonCImpl.q1.get();
            alternativeProductsFragment.j = (FeatureToggleManager) singletonCImpl.P0.get();
            alternativeProductsFragment.k = (AnalyticsManager) singletonCImpl.r2.get();
        }

        @Override // au.com.woolworths.android.onesite.modules.checkout.ConfirmDialogFragment_GeneratedInjector
        public final void c(ConfirmDialogFragment confirmDialogFragment) {
            confirmDialogFragment.i = (AnalyticsManager) this.f4110a.r2.get();
        }

        @Override // au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment_GeneratedInjector
        public final void d(MyListsFragment myListsFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            myListsFragment.i = (FeatureToggleManager) singletonCImpl.P0.get();
            myListsFragment.j = (AnalyticsManager) singletonCImpl.r2.get();
            myListsFragment.k = (ListsInMemoryRepository) singletonCImpl.E2.get();
            myListsFragment.l = (ListsUtils) singletonCImpl.N3.get();
        }

        @Override // au.com.woolworths.feature.shop.marketplace.ui.brands.MarketplaceBrandsFragment_GeneratedInjector
        public final void e(MarketplaceBrandsFragment marketplaceBrandsFragment) {
            marketplaceBrandsFragment.d = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.feature.product.list.ProductListOptionsFilterFragment_GeneratedInjector
        public final void f(ProductListOptionsFilterFragment productListOptionsFilterFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            productListOptionsFilterFragment.k = (FeatureToggleManager) singletonCImpl.P0.get();
            productListOptionsFilterFragment.l = (AnalyticsManager) singletonCImpl.r2.get();
        }

        @Override // au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupFragment_GeneratedInjector
        public final void g(RewardsSetupFragment rewardsSetupFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            rewardsSetupFragment.k = (SchedulersProvider) singletonCImpl.o1.get();
            rewardsSetupFragment.l = (FeatureToggleManager) singletonCImpl.P0.get();
            rewardsSetupFragment.m = (AppConfig) singletonCImpl.W0.get();
        }

        @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardFragment_GeneratedInjector
        public final void h(CreditCardFragment creditCardFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            creditCardFragment.i = (PayClient) singletonCImpl.c2.get();
            creditCardFragment.j = (DigipayInteractor) singletonCImpl.T3.get();
        }

        @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductFragment_GeneratedInjector
        public final void i(CheckoutProductFragment checkoutProductFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            checkoutProductFragment.d = (AnalyticsManager) singletonCImpl.r2.get();
            checkoutProductFragment.r = (FeatureToggleManager) singletonCImpl.P0.get();
            checkoutProductFragment.s = new BannerDismissInteractor(BaseDataModule_ProvideBannerDismissPrefs$base_impl_releaseFactory.a(singletonCImpl.I, Contexts.a(singletonCImpl.e.f23776a)), (ShopAccountInteractor) singletonCImpl.Y0.get());
        }

        @Override // au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment_GeneratedInjector
        public final void j(RewardsRedemptionSettingsFragment rewardsRedemptionSettingsFragment) {
            rewardsRedemptionSettingsFragment.i = (AnalyticsManager) this.f4110a.r2.get();
        }

        @Override // au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment_GeneratedInjector
        public final void k(SnapAListBottomSheetFragment snapAListBottomSheetFragment) {
            snapAListBottomSheetFragment.k = (AnalyticsManager) this.f4110a.r2.get();
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment_GeneratedInjector
        public final void l(ProductReviewFragment productReviewFragment) {
            productReviewFragment.i = (ProductReviewViewModel.Factory) this.e.get();
            productReviewFragment.j = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment_GeneratedInjector
        public final void m(ProductReviewAlternativeFragment productReviewAlternativeFragment) {
            productReviewAlternativeFragment.i = (ProductReviewAlternativeViewModel.Factory) this.d.get();
            productReviewAlternativeFragment.l = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment_GeneratedInjector
        public final void n(SuggestedListsFragment suggestedListsFragment) {
            suggestedListsFragment.i = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy_GeneratedInjector
        public final void o(RewardsOffersFragmentLegacy rewardsOffersFragmentLegacy) {
            SingletonCImpl singletonCImpl = this.f4110a;
            rewardsOffersFragmentLegacy.i = (AnalyticsManager) singletonCImpl.r2.get();
            rewardsOffersFragmentLegacy.j = (FeatureToggleManager) singletonCImpl.P0.get();
            rewardsOffersFragmentLegacy.k = (RewardsAccountInteractor) singletonCImpl.Y1.get();
        }

        @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.StepUpDialogFragment_GeneratedInjector
        public final void p(au.com.woolworths.android.onesite.modules.checkout.digitalpay.StepUpDialogFragment stepUpDialogFragment) {
            stepUpDialogFragment.m = DoubleCheck.a(this.b.t);
            stepUpDialogFragment.n = (PayClient) this.f4110a.c2.get();
        }

        @Override // au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld_GeneratedInjector
        public final void q(ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld confirmSubscriptionTermsAndConditionBottomSheetFragmentOld) {
            confirmSubscriptionTermsAndConditionBottomSheetFragmentOld.i = (AnalyticsManager) this.f4110a.r2.get();
        }

        @Override // au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment_GeneratedInjector
        public final void r(MarketplaceCategoriesFragment marketplaceCategoriesFragment) {
            marketplaceCategoriesFragment.i = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment_GeneratedInjector
        public final void s(InfoSectionFragment infoSectionFragment) {
            infoSectionFragment.i = (AnalyticsManager) this.f4110a.r2.get();
        }

        @Override // au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment_GeneratedInjector
        public final void t(ProductMessageBottomSheetFragment productMessageBottomSheetFragment) {
            productMessageBottomSheetFragment.i = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.shop.specials.SpecialsHomeFragment_GeneratedInjector
        public final void u(SpecialsHomeFragment specialsHomeFragment) {
            specialsHomeFragment.j = (FeatureToggleManager) this.f4110a.P0.get();
            specialsHomeFragment.k = this.c.d1();
        }

        @Override // au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment_GeneratedInjector
        public final void v(MarketplaceFragment marketplaceFragment) {
            marketplaceFragment.i = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment_GeneratedInjector
        public final void w(au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment productListOptionsFilterFragment) {
            SingletonCImpl singletonCImpl = this.f4110a;
            productListOptionsFilterFragment.k = (FeatureToggleManager) singletonCImpl.P0.get();
            productListOptionsFilterFragment.l = (AnalyticsManager) singletonCImpl.r2.get();
        }

        @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment_GeneratedInjector
        public final void x(DigitalPayForOrderFragment digitalPayForOrderFragment) {
            digitalPayForOrderFragment.x = DoubleCheck.a(this.b.t);
            SingletonCImpl singletonCImpl = this.f4110a;
            digitalPayForOrderFragment.y = (SchedulersProvider) singletonCImpl.o1.get();
            digitalPayForOrderFragment.z = (AnalyticsManager) singletonCImpl.r2.get();
            digitalPayForOrderFragment.A = (PayClient) singletonCImpl.c2.get();
            digitalPayForOrderFragment.B = (FeatureToggleManager) singletonCImpl.P0.get();
        }

        @Override // au.com.woolworths.feature.shop.marketplace.ui.sellers.MarketplaceSellersFragment_GeneratedInjector
        public final void y(MarketplaceSellersFragment marketplaceSellersFragment) {
            marketplaceSellersFragment.d = (FeatureToggleManager) this.f4110a.P0.get();
        }

        @Override // au.com.woolworths.feature.shop.contentpage.ContentPageFragment_GeneratedInjector
        public final void z(ContentPageFragment contentPageFragment) {
            contentPageFragment.i = (FeatureToggleManager) this.f4110a.P0.get();
            contentPageFragment.j = this.c.d1();
        }
    }

    /* loaded from: classes3.dex */
    public static final class HomeActivitySubcomponentFactory implements SessionActivityBuilderModule_BindHomeActivity.HomeActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4114a;
        public final UserComponentImpl b;
        public final CartSessionComponentImpl c;

        public HomeActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl) {
            this.f4114a = singletonCImpl;
            this.b = userComponentImpl;
            this.c = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            HomeActivityModule homeActivityModule = new HomeActivityModule();
            return new HomeActivitySubcomponentImpl(this.f4114a, this.b, this.c, homeActivityModule, (HomeActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HomeActivitySubcomponentImpl implements SessionActivityBuilderModule_BindHomeActivity.HomeActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final HomeActivity f4115a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final CartSessionComponentImpl d;
        public final Provider e;
        public final Provider f;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4116a;
            public final UserComponentImpl b;
            public final CartSessionComponentImpl c;
            public final HomeActivitySubcomponentImpl d;
            public final int e;

            public SwitchingProvider(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, HomeActivitySubcomponentImpl homeActivitySubcomponentImpl, int i) {
                this.f4116a = singletonCImpl;
                this.b = userComponentImpl;
                this.c = cartSessionComponentImpl;
                this.d = homeActivitySubcomponentImpl;
                this.e = i;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                HomeActivitySubcomponentImpl homeActivitySubcomponentImpl = this.d;
                CartSessionComponentImpl cartSessionComponentImpl = this.c;
                UserComponentImpl userComponentImpl = this.b;
                SingletonCImpl singletonCImpl = this.f4116a;
                int i = this.e;
                if (i == 0) {
                    return new HomeFragmentSubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl, homeActivitySubcomponentImpl);
                }
                if (i == 1) {
                    return new ItemViewFragmentSubcomponentFactory(singletonCImpl, userComponentImpl, cartSessionComponentImpl, homeActivitySubcomponentImpl);
                }
                throw new AssertionError(i);
            }
        }

        public HomeActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, HomeActivityModule homeActivityModule, HomeActivity homeActivity) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.d = cartSessionComponentImpl;
            this.f4115a = homeActivity;
            this.e = new SwitchingProvider(singletonCImpl, userComponentImpl, cartSessionComponentImpl, this, 0);
            this.f = new SwitchingProvider(singletonCImpl, userComponentImpl, cartSessionComponentImpl, this, 1);
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            HomeActivity homeActivity = (HomeActivity) obj;
            CartSessionComponentImpl cartSessionComponentImpl = this.d;
            Cart cart = (Cart) cartSessionComponentImpl.l.get();
            Store currentStore = (Store) cartSessionComponentImpl.m.get();
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Cart shoppingCart = (Cart) cartSessionComponentImpl.l.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart, "shoppingCart");
            ClearCartUseCase clearCartUseCase = new ClearCartUseCase(scanNGoRepositoryX1, shoppingCart, schedulerA);
            UserComponentImpl userComponentImpl = this.c;
            CartSessionManager cartSessionManager = (CartSessionManager) userComponentImpl.l.get();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            User authenticatedUser = (User) userComponentImpl.m.get();
            MedalliaInteractor medalliaInteractor = (MedalliaInteractor) singletonCImpl.t2.get();
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            SurveyManager surveyManager = (SurveyManager) singletonCImpl.W2.get();
            Intrinsics.h(cart, "cart");
            Intrinsics.h(currentStore, "currentStore");
            Intrinsics.h(cartSessionManager, "cartSessionManager");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            Intrinsics.h(authenticatedUser, "authenticatedUser");
            Intrinsics.h(medalliaInteractor, "medalliaInteractor");
            Intrinsics.h(analyticsManager, "analyticsManager");
            Intrinsics.h(surveyManager, "surveyManager");
            homeActivity.t = new HomeActivityPresenter(this.f4115a, cart, currentStore, clearCartUseCase, analyticsAggregator, authenticatedUser, analyticsManager, medalliaInteractor, surveyManager);
            homeActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            homeActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            homeActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            homeActivity.z = (PayClient) singletonCImpl.Q2.get();
            homeActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            homeActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            ImmutableMap.Builder builderB = ImmutableMap.b(30);
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            builderB.c(TapActivity.class, userComponentImpl.c);
            builderB.c(AddPaymentActivity.class, userComponentImpl.d);
            builderB.c(UpdateCreditCardActivity.class, userComponentImpl.e);
            builderB.c(MyAccountActivity.class, userComponentImpl.f);
            builderB.c(TransactionListActivity.class, userComponentImpl.g);
            builderB.c(ReceiptActivity.class, userComponentImpl.h);
            builderB.c(ExitScanCodeActivity.class, userComponentImpl.i);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchActivity.class, userComponentImpl.j);
            builderB.c(HomeActivity.class, cartSessionComponentImpl.d);
            builderB.c(ShoppingCartActivity.class, cartSessionComponentImpl.e);
            builderB.c(ScannerActivityOld.class, cartSessionComponentImpl.f);
            builderB.c(ScannerActivity.class, cartSessionComponentImpl.g);
            builderB.c(AddItemActivity.class, cartSessionComponentImpl.h);
            builderB.c(WeightedArticleSelectionActivity.class, cartSessionComponentImpl.i);
            builderB.c(CheckOutActivity.class, cartSessionComponentImpl.j);
            builderB.c(ProductInfoActivity.class, cartSessionComponentImpl.k);
            builderB.c(HomeFragment.class, this.e);
            builderB.c(ItemViewFragment.class, this.f);
            homeActivity.G = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
            homeActivity.I = singletonCImpl.s1();
            homeActivity.J = (LogoutManager) userComponentImpl.n.get();
            homeActivity.K = ScanNGoModule_GetFaqUsUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            homeActivity.L = ScanNGoModule_GetTnCUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            homeActivity.M = ScanNGoModule_GetPrivacyUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            homeActivity.N = ScanNGoModule_GetCollectionUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            homeActivity.O = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            homeActivity.U = new SnGShoppingListUtils(singletonCImpl.x1(), (UserConfigurations) singletonCImpl.V2.get(), (ListsInMemoryRepository) singletonCImpl.E2.get(), (ShoppingListLocalRepository) singletonCImpl.A2.get());
            homeActivity.V = new ScreenNavigator((FeatureToggleManager) singletonCImpl.P0.get());
        }
    }

    /* loaded from: classes3.dex */
    public static final class HomeFragmentSubcomponentFactory implements HomeActivityFragmentProviderModule_ProvideFragmentFactory.HomeFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4117a;
        public final CartSessionComponentImpl b;

        public HomeFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, HomeActivitySubcomponentImpl homeActivitySubcomponentImpl) {
            this.f4117a = singletonCImpl;
            this.b = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            HomeFragmentModule homeFragmentModule = new HomeFragmentModule();
            return new HomeFragmentSubcomponentImpl(this.f4117a, this.b, homeFragmentModule, (HomeFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HomeFragmentSubcomponentImpl implements HomeActivityFragmentProviderModule_ProvideFragmentFactory.HomeFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final HomeFragment f4118a;
        public final SingletonCImpl b;
        public final CartSessionComponentImpl c;

        public HomeFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, CartSessionComponentImpl cartSessionComponentImpl, HomeFragmentModule homeFragmentModule, HomeFragment homeFragment) {
            this.b = singletonCImpl;
            this.c = cartSessionComponentImpl;
            this.f4118a = homeFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            HomeFragment homeFragment = (HomeFragment) obj;
            SingletonCImpl singletonCImpl = this.b;
            AuthenticatedUser authenticatedUserS1 = singletonCImpl.s1();
            Store currentStore = (Store) this.c.m.get();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            SharedPreferences preferences = (SharedPreferences) singletonCImpl.s1.get();
            scanNGoModule.getClass();
            Intrinsics.h(preferences, "preferences");
            AppConfigurations appConfigurations = new AppConfigurations(preferences);
            Intrinsics.h(currentStore, "currentStore");
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            homeFragment.d = new HomePresenter(this.f4118a, authenticatedUserS1, currentStore, featureToggleManager, appConfigurations);
            homeFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            homeFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            homeFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            homeFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            homeFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            homeFragment.p = new PermissionFlagInteractorImpl(singletonCImpl.y1());
        }
    }

    /* loaded from: classes3.dex */
    public static final class IPM_PILFF_InstrumentListFragmentSubcomponentFactory implements InstrumentProviderModule_ProvideInstrumentListFragmentFactory.InstrumentListFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4119a;

        public IPM_PILFF_InstrumentListFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, MyAccountActivitySubcomponentImpl myAccountActivitySubcomponentImpl) {
            this.f4119a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            InstrumentListFragmentModule instrumentListFragmentModule = new InstrumentListFragmentModule();
            return new IPM_PILFF_InstrumentListFragmentSubcomponentImpl(this.f4119a, instrumentListFragmentModule, (InstrumentListFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class IPM_PILFF_InstrumentListFragmentSubcomponentImpl implements InstrumentProviderModule_ProvideInstrumentListFragmentFactory.InstrumentListFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final InstrumentListFragmentModule f4120a;
        public final InstrumentListFragment b;
        public final SingletonCImpl c;

        public IPM_PILFF_InstrumentListFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, InstrumentListFragmentModule instrumentListFragmentModule, InstrumentListFragment instrumentListFragment) {
            this.c = singletonCImpl;
            this.f4120a = instrumentListFragmentModule;
            this.b = instrumentListFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) throws NumberFormatException {
            InstrumentListFragment instrumentListFragment = (InstrumentListFragment) obj;
            SingletonCImpl singletonCImpl = this.c;
            PayClient payClient = (PayClient) singletonCImpl.Q2.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            GetInstrumentsUC getInstrumentsUCA = InstrumentListFragmentModule_GetInstrumentUseCaseFactory.a(this.f4120a, payClient, ScanNGoModule_GetMerchantProfilesFactory.a(scanNGoModule, (PayClient) singletonCImpl.Q2.get(), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule), singletonCImpl.B1()), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule), singletonCImpl.B1());
            PayClient payClient2 = (PayClient) singletonCImpl.Q2.get();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            DefaultTokenProvider defaultTokenProviderB1 = singletonCImpl.B1();
            Intrinsics.h(payClient2, "payClient");
            instrumentListFragment.d = new InstrumentListPresenter(this.b, getInstrumentsUCA, new RemoveInstrumentUC(payClient2, schedulerA, defaultTokenProviderB1), SingletonCImpl.a1(singletonCImpl));
            instrumentListFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            instrumentListFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            instrumentListFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            instrumentListFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            instrumentListFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ItemViewFragmentSubcomponentFactory implements HomeActivityFragmentProviderModule_ProvideItemViewFragmentFactory.ItemViewFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4121a;
        public final UserComponentImpl b;
        public final CartSessionComponentImpl c;

        public ItemViewFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, HomeActivitySubcomponentImpl homeActivitySubcomponentImpl) {
            this.f4121a = singletonCImpl;
            this.b = userComponentImpl;
            this.c = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            ItemViewFragmentModule itemViewFragmentModule = new ItemViewFragmentModule();
            return new ItemViewFragmentSubcomponentImpl(this.f4121a, this.b, this.c, itemViewFragmentModule, (ItemViewFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ItemViewFragmentSubcomponentImpl implements HomeActivityFragmentProviderModule_ProvideItemViewFragmentFactory.ItemViewFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ItemViewFragment f4122a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final CartSessionComponentImpl d;

        public ItemViewFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ItemViewFragmentModule itemViewFragmentModule, ItemViewFragment itemViewFragment) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.d = cartSessionComponentImpl;
            this.f4122a = itemViewFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ItemViewFragment itemViewFragment = (ItemViewFragment) obj;
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            CartSessionComponentImpl cartSessionComponentImpl = this.d;
            Cart cart = (Cart) cartSessionComponentImpl.l.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(cart, "cart");
            UpdateProductUseCase updateProductUseCase = new UpdateProductUseCase(scanNGoRepositoryX1, cart, schedulerA);
            Cart cart2 = (Cart) cartSessionComponentImpl.l.get();
            Store currentStore = (Store) cartSessionComponentImpl.m.get();
            SessionInfo sessionInfo = (SessionInfo) this.c.k.get();
            ScanNGoRepository scanNGoRepositoryX12 = singletonCImpl.x1();
            Cart cart3 = (Cart) cartSessionComponentImpl.l.get();
            Scheduler schedulerA2 = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(cart3, "cart");
            RemoveItemUseCase removeItemUseCase = new RemoveItemUseCase(scanNGoRepositoryX12, cart3, schedulerA2);
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            UserConfigurations userConfigurations = (UserConfigurations) singletonCImpl.V2.get();
            Intrinsics.h(cart2, "cart");
            Intrinsics.h(currentStore, "currentStore");
            Intrinsics.h(sessionInfo, "sessionInfo");
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(userConfigurations, "userConfigurations");
            itemViewFragment.d = new ItemViewPresenter(this.f4122a, updateProductUseCase, removeItemUseCase, sessionInfo, cart2, currentStore, featureToggleManager, userConfigurations);
            itemViewFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            itemViewFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            itemViewFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            itemViewFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            itemViewFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    public static final class MessageActivitySubcomponentFactory implements ActivityBuilderModule_BindMessageActivity.MessageActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4123a;

        public MessageActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4123a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            MessageActivityModule messageActivityModule = new MessageActivityModule();
            return new MessageActivitySubcomponentImpl(this.f4123a, messageActivityModule, (MessageActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessageActivitySubcomponentImpl implements ActivityBuilderModule_BindMessageActivity.MessageActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final MessageActivity f4124a;
        public final SingletonCImpl b;
        public final Provider c;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4125a;
            public final MessageActivitySubcomponentImpl b;

            public SwitchingProvider(SingletonCImpl singletonCImpl, MessageActivitySubcomponentImpl messageActivitySubcomponentImpl) {
                this.f4125a = singletonCImpl;
                this.b = messageActivitySubcomponentImpl;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return new MessageSingleActionFragmentSubcomponentFactory(this.f4125a, this.b);
            }
        }

        public MessageActivitySubcomponentImpl(SingletonCImpl singletonCImpl, MessageActivityModule messageActivityModule, MessageActivity messageActivity) {
            this.b = singletonCImpl;
            this.f4124a = messageActivity;
            this.c = new SwitchingProvider(singletonCImpl, this);
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            MessageActivity messageActivity = (MessageActivity) obj;
            MessageActivity messageActivity2 = this.f4124a;
            MessageActivityPresenter messageActivityPresenter = new MessageActivityPresenter(messageActivity2);
            messageActivity2.k1(messageActivityPresenter);
            messageActivity.t = messageActivityPresenter;
            SingletonCImpl singletonCImpl = this.b;
            messageActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            messageActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            messageActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            messageActivity.z = (PayClient) singletonCImpl.Q2.get();
            messageActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            messageActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            ImmutableMap.Builder builderB = ImmutableMap.b(13);
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            builderB.c(MessageSingleActionFragment.class, this.c);
            messageActivity.G = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessageSingleActionFragmentSubcomponentFactory implements MessageFragmentProviderModule_ProvideFragmentFactory.MessageSingleActionFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4126a;

        public MessageSingleActionFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, MessageActivitySubcomponentImpl messageActivitySubcomponentImpl) {
            this.f4126a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            MessageFragmentModule messageFragmentModule = new MessageFragmentModule();
            return new MessageSingleActionFragmentSubcomponentImpl(this.f4126a, messageFragmentModule, (MessageSingleActionFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessageSingleActionFragmentSubcomponentImpl implements MessageFragmentProviderModule_ProvideFragmentFactory.MessageSingleActionFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final MessageSingleActionFragment f4127a;
        public final SingletonCImpl b;

        public MessageSingleActionFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, MessageFragmentModule messageFragmentModule, MessageSingleActionFragment messageSingleActionFragment) {
            this.b = singletonCImpl;
            this.f4127a = messageSingleActionFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            MessageSingleActionFragment messageSingleActionFragment = (MessageSingleActionFragment) obj;
            MessageSingleActionFragment messageSingleActionFragment2 = this.f4127a;
            MessagePresenter messagePresenter = new MessagePresenter(messageSingleActionFragment2);
            messageSingleActionFragment2.k1(messagePresenter);
            messageSingleActionFragment.d = messagePresenter;
            SingletonCImpl singletonCImpl = this.b;
            messageSingleActionFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            messageSingleActionFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            messageSingleActionFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            messageSingleActionFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            messageSingleActionFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class MyAccountActivitySubcomponentFactory implements UserActivityBuilderModule_BindMyAccountActivity.MyAccountActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4128a;
        public final UserComponentImpl b;

        public MyAccountActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4128a = singletonCImpl;
            this.b = userComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            MyAccountActivityModule myAccountActivityModule = new MyAccountActivityModule();
            return new MyAccountActivitySubcomponentImpl(this.f4128a, this.b, myAccountActivityModule, (MyAccountActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class MyAccountActivitySubcomponentImpl implements UserActivityBuilderModule_BindMyAccountActivity.MyAccountActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final MyAccountActivity f4129a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final Provider d;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4130a;
            public final UserComponentImpl b;
            public final MyAccountActivitySubcomponentImpl c;

            public SwitchingProvider(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, MyAccountActivitySubcomponentImpl myAccountActivitySubcomponentImpl) {
                this.f4130a = singletonCImpl;
                this.b = userComponentImpl;
                this.c = myAccountActivitySubcomponentImpl;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return new IPM_PILFF_InstrumentListFragmentSubcomponentFactory(this.f4130a, this.b, this.c);
            }
        }

        public MyAccountActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, MyAccountActivityModule myAccountActivityModule, MyAccountActivity myAccountActivity) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.f4129a = myAccountActivity;
            this.d = new SwitchingProvider(singletonCImpl, userComponentImpl, this);
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            MyAccountActivity myAccountActivity = (MyAccountActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            AuthenticatedUser authenticatedUserS1 = singletonCImpl.s1();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            myAccountActivity.t = new MyAccountsPresenter(this.f4129a, featureToggleManager, authenticatedUserS1, analyticsAggregator);
            myAccountActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            myAccountActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            myAccountActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            myAccountActivity.z = (PayClient) singletonCImpl.Q2.get();
            myAccountActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            myAccountActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            ImmutableMap.Builder builderB = ImmutableMap.b(21);
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            UserComponentImpl userComponentImpl = this.c;
            builderB.c(TapActivity.class, userComponentImpl.c);
            builderB.c(AddPaymentActivity.class, userComponentImpl.d);
            builderB.c(UpdateCreditCardActivity.class, userComponentImpl.e);
            builderB.c(MyAccountActivity.class, userComponentImpl.f);
            builderB.c(TransactionListActivity.class, userComponentImpl.g);
            builderB.c(ReceiptActivity.class, userComponentImpl.h);
            builderB.c(ExitScanCodeActivity.class, userComponentImpl.i);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchActivity.class, userComponentImpl.j);
            builderB.c(InstrumentListFragment.class, this.d);
            myAccountActivity.G = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
        }
    }

    public static final class OnBoardingActivitySubcomponentFactory implements ActivityBuilderModule_BindOnBoardingActivity.OnBoardingActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4131a;

        public OnBoardingActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4131a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            OnBoardingActivityModule onBoardingActivityModule = new OnBoardingActivityModule();
            return new OnBoardingActivitySubcomponentImpl(this.f4131a, onBoardingActivityModule, (OnBoardingActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class OnBoardingActivitySubcomponentImpl implements ActivityBuilderModule_BindOnBoardingActivity.OnBoardingActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final OnBoardingActivity f4132a;
        public final SingletonCImpl b;

        public OnBoardingActivitySubcomponentImpl(SingletonCImpl singletonCImpl, OnBoardingActivityModule onBoardingActivityModule, OnBoardingActivity onBoardingActivity) {
            this.b = singletonCImpl;
            this.f4132a = onBoardingActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            OnBoardingActivity onBoardingActivity = (OnBoardingActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            UserConfigurations userConfigurations = (UserConfigurations) singletonCImpl.V2.get();
            DeviceInfoProvider deviceInfoProvider = (DeviceInfoProvider) singletonCImpl.T2.get();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            Intrinsics.h(userConfigurations, "userConfigurations");
            Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(analyticsManager, "analyticsManager");
            onBoardingActivity.t = new OnBoardingPresenter(this.f4132a, userConfigurations, deviceInfoProvider, featureToggleManager, analyticsManager);
            onBoardingActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            onBoardingActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            onBoardingActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            onBoardingActivity.z = (PayClient) singletonCImpl.Q2.get();
            onBoardingActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            onBoardingActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
        }
    }

    public static final class ParkingVoucherActivitySubcomponentFactory implements ActivityBuilderModule_BindParkingVoucherActivity.ParkingVoucherActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4133a;

        public ParkingVoucherActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4133a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            ParkingVoucherActivityModule parkingVoucherActivityModule = new ParkingVoucherActivityModule();
            return new ParkingVoucherActivitySubcomponentImpl(this.f4133a, parkingVoucherActivityModule, (ParkingVoucherActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ParkingVoucherActivitySubcomponentImpl implements ActivityBuilderModule_BindParkingVoucherActivity.ParkingVoucherActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ParkingVoucherActivity f4134a;
        public final SingletonCImpl b;

        public ParkingVoucherActivitySubcomponentImpl(SingletonCImpl singletonCImpl, ParkingVoucherActivityModule parkingVoucherActivityModule, ParkingVoucherActivity parkingVoucherActivity) {
            this.b = singletonCImpl;
            this.f4134a = parkingVoucherActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ParkingVoucherActivity parkingVoucherActivity = (ParkingVoucherActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            parkingVoucherActivity.t = new ParkingVoucherPresenter(this.f4134a, analyticsAggregator);
            parkingVoucherActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            parkingVoucherActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            parkingVoucherActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            parkingVoucherActivity.z = (PayClient) singletonCImpl.Q2.get();
            parkingVoucherActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            parkingVoucherActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class PayFragmentSubcomponentFactory implements CheckOutFragmentProviderModule_ProvideFragmentFactory.PayFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4135a;
        public final UserComponentImpl b;
        public final CartSessionComponentImpl c;

        public PayFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, CheckOutActivitySubcomponentImpl checkOutActivitySubcomponentImpl) {
            this.f4135a = singletonCImpl;
            this.b = userComponentImpl;
            this.c = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            CheckOutFragmentModule checkOutFragmentModule = new CheckOutFragmentModule();
            return new PayFragmentSubcomponentImpl(this.f4135a, this.b, this.c, checkOutFragmentModule, (PayFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class PayFragmentSubcomponentImpl implements CheckOutFragmentProviderModule_ProvideFragmentFactory.PayFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final PayFragment f4136a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final CartSessionComponentImpl d;

        public PayFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, CheckOutFragmentModule checkOutFragmentModule, PayFragment payFragment) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.d = cartSessionComponentImpl;
            this.f4136a = payFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            PayFragment payFragment = (PayFragment) obj;
            SingletonCImpl singletonCImpl = this.b;
            AuthenticatedUser authenticatedUserS1 = singletonCImpl.s1();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            Cart cart = (Cart) this.d.l.get();
            UserComponentImpl userComponentImpl = this.c;
            PaymentDetail paymentDetail = (PaymentDetail) userComponentImpl.o.get();
            UserModule userModule = userComponentImpl.f4181a;
            SingletonCImpl singletonCImpl2 = userComponentImpl.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl2.x1();
            ScanNGoModule scanNGoModule = singletonCImpl2.O;
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            userModule.getClass();
            MakePaymentUC makePaymentUC = new MakePaymentUC(scanNGoRepositoryX1, schedulerA);
            MakeZeroAmountPaymentUC makeZeroAmountPaymentUC = new MakeZeroAmountPaymentUC(singletonCImpl2.x1(), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule));
            TransferToPosUC transferToPosUC = new TransferToPosUC(singletonCImpl2.x1(), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule));
            ResourceResolverImpl resourceResolverImplA1 = SingletonCImpl.a1(singletonCImpl);
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(cart, "cart");
            Intrinsics.h(paymentDetail, "paymentDetail");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            payFragment.d = new PayPresenter(this.f4136a, authenticatedUserS1, featureToggleManager, cart, paymentDetail, makePaymentUC, makeZeroAmountPaymentUC, transferToPosUC, resourceResolverImplA1, analyticsAggregator);
            payFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            payFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            payFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            payFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            payFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ProductInfoActivitySubcomponentFactory implements SessionActivityBuilderModule_BindProductInfoActivity.ProductInfoActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4137a;
        public final UserComponentImpl b;
        public final CartSessionComponentImpl c;

        public ProductInfoActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl) {
            this.f4137a = singletonCImpl;
            this.b = userComponentImpl;
            this.c = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            ProductInfoActivityModule productInfoActivityModule = new ProductInfoActivityModule();
            return new ProductInfoActivitySubcomponentImpl(this.f4137a, this.b, this.c, productInfoActivityModule, (ProductInfoActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ProductInfoActivitySubcomponentImpl implements SessionActivityBuilderModule_BindProductInfoActivity.ProductInfoActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ProductInfoActivity f4138a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final CartSessionComponentImpl d;
        public final Provider e;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4139a;
            public final UserComponentImpl b;
            public final CartSessionComponentImpl c;
            public final ProductInfoActivitySubcomponentImpl d;

            public SwitchingProvider(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ProductInfoActivitySubcomponentImpl productInfoActivitySubcomponentImpl) {
                this.f4139a = singletonCImpl;
                this.b = userComponentImpl;
                this.c = cartSessionComponentImpl;
                this.d = productInfoActivitySubcomponentImpl;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return new ProductInfoFragmentSubcomponentFactory(this.f4139a, this.b, this.c, this.d);
            }
        }

        public ProductInfoActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ProductInfoActivityModule productInfoActivityModule, ProductInfoActivity productInfoActivity) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.d = cartSessionComponentImpl;
            this.f4138a = productInfoActivity;
            this.e = new SwitchingProvider(singletonCImpl, userComponentImpl, cartSessionComponentImpl, this);
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ProductInfoActivity productInfoActivity = (ProductInfoActivity) obj;
            productInfoActivity.t = new ProductInfoActivityPresenter(this.f4138a);
            SingletonCImpl singletonCImpl = this.b;
            productInfoActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            productInfoActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            productInfoActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            productInfoActivity.z = (PayClient) singletonCImpl.Q2.get();
            productInfoActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            productInfoActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            ImmutableMap.Builder builderB = ImmutableMap.b(29);
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            UserComponentImpl userComponentImpl = this.c;
            builderB.c(TapActivity.class, userComponentImpl.c);
            builderB.c(AddPaymentActivity.class, userComponentImpl.d);
            builderB.c(UpdateCreditCardActivity.class, userComponentImpl.e);
            builderB.c(MyAccountActivity.class, userComponentImpl.f);
            builderB.c(TransactionListActivity.class, userComponentImpl.g);
            builderB.c(ReceiptActivity.class, userComponentImpl.h);
            builderB.c(ExitScanCodeActivity.class, userComponentImpl.i);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchActivity.class, userComponentImpl.j);
            CartSessionComponentImpl cartSessionComponentImpl = this.d;
            builderB.c(HomeActivity.class, cartSessionComponentImpl.d);
            builderB.c(ShoppingCartActivity.class, cartSessionComponentImpl.e);
            builderB.c(ScannerActivityOld.class, cartSessionComponentImpl.f);
            builderB.c(ScannerActivity.class, cartSessionComponentImpl.g);
            builderB.c(AddItemActivity.class, cartSessionComponentImpl.h);
            builderB.c(WeightedArticleSelectionActivity.class, cartSessionComponentImpl.i);
            builderB.c(CheckOutActivity.class, cartSessionComponentImpl.j);
            builderB.c(ProductInfoActivity.class, cartSessionComponentImpl.k);
            builderB.c(ProductInfoFragment.class, this.e);
            productInfoActivity.G = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
            productInfoActivity.I = new ScreenNavigator((FeatureToggleManager) singletonCImpl.P0.get());
        }
    }

    /* loaded from: classes3.dex */
    public static final class ProductInfoFragmentSubcomponentFactory implements ProductInfoFragmentProviderModule_ProvideFragmentFactory.ProductInfoFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4140a;
        public final UserComponentImpl b;
        public final CartSessionComponentImpl c;

        public ProductInfoFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ProductInfoActivitySubcomponentImpl productInfoActivitySubcomponentImpl) {
            this.f4140a = singletonCImpl;
            this.b = userComponentImpl;
            this.c = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            ProductInfoFragmentModule productInfoFragmentModule = new ProductInfoFragmentModule();
            return new ProductInfoFragmentSubcomponentImpl(this.f4140a, this.b, this.c, productInfoFragmentModule, (ProductInfoFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ProductInfoFragmentSubcomponentImpl implements ProductInfoFragmentProviderModule_ProvideFragmentFactory.ProductInfoFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ProductInfoFragment f4141a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final CartSessionComponentImpl d;

        public ProductInfoFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ProductInfoFragmentModule productInfoFragmentModule, ProductInfoFragment productInfoFragment) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.d = cartSessionComponentImpl;
            this.f4141a = productInfoFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ProductInfoFragment productInfoFragment = (ProductInfoFragment) obj;
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            CartSessionComponentImpl cartSessionComponentImpl = this.d;
            Cart shoppingCart = (Cart) cartSessionComponentImpl.l.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart, "shoppingCart");
            UpdateProductUseCase updateProductUseCase = new UpdateProductUseCase(scanNGoRepositoryX1, shoppingCart, schedulerA);
            ScanNGoRepository scanNGoRepositoryX12 = singletonCImpl.x1();
            Cart shoppingCart2 = (Cart) cartSessionComponentImpl.l.get();
            Scheduler schedulerA2 = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart2, "shoppingCart");
            RemoveItemUseCase removeItemUseCase = new RemoveItemUseCase(scanNGoRepositoryX12, shoppingCart2, schedulerA2);
            Cart shoppingCart3 = (Cart) cartSessionComponentImpl.l.get();
            SessionInfo sessionInfo = (SessionInfo) this.c.k.get();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            AuthenticatedUser authenticatedUserS1 = singletonCImpl.s1();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(shoppingCart3, "shoppingCart");
            Intrinsics.h(sessionInfo, "sessionInfo");
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            productInfoFragment.d = new ProductInformationPresenter(this.f4141a, sessionInfo, updateProductUseCase, removeItemUseCase, shoppingCart3, authenticatedUserS1, featureToggleManager, analyticsAggregator);
            productInfoFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            productInfoFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            productInfoFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            productInfoFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            productInfoFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ReceiptActivitySubcomponentFactory implements UserActivityBuilderModule_BindReceiptActivity.ReceiptActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4142a;
        public final UserComponentImpl b;

        public ReceiptActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4142a = singletonCImpl;
            this.b = userComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            ReceiptActivityModule receiptActivityModule = new ReceiptActivityModule();
            return new ReceiptActivitySubcomponentImpl(this.f4142a, this.b, receiptActivityModule, (ReceiptActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ReceiptActivitySubcomponentImpl implements UserActivityBuilderModule_BindReceiptActivity.ReceiptActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ReceiptActivity f4143a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;

        public ReceiptActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, ReceiptActivityModule receiptActivityModule, ReceiptActivity receiptActivity) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.f4143a = receiptActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ReceiptActivity receiptActivity = (ReceiptActivity) obj;
            UserComponentImpl userComponentImpl = this.c;
            UserModule userModule = userComponentImpl.f4181a;
            SingletonCImpl singletonCImpl = userComponentImpl.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O);
            userModule.getClass();
            GetEmailReceiptUC getEmailReceiptUC = new GetEmailReceiptUC(scanNGoRepositoryX1, schedulerA);
            SingletonCImpl singletonCImpl2 = this.b;
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl2.u2.get();
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            receiptActivity.t = new ReceiptPresenter(this.f4143a, getEmailReceiptUC, analyticsAggregator);
            receiptActivity.w = (FeatureToggleManager) singletonCImpl2.P0.get();
            receiptActivity.x = (AnalyticsProvider) singletonCImpl2.u2.get();
            receiptActivity.y = (AnalyticsManager) singletonCImpl2.r2.get();
            receiptActivity.z = (PayClient) singletonCImpl2.Q2.get();
            receiptActivity.A = (ScanAndGoFeatureConfig) singletonCImpl2.S2.get();
            receiptActivity.B = (OnSngAppCloseHandler) singletonCImpl2.I3.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ScannerActivityOldSubcomponentFactory implements SessionActivityBuilderModule_BindScannerActivityOld.ScannerActivityOldSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4144a;
        public final CartSessionComponentImpl b;

        public ScannerActivityOldSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl) {
            this.f4144a = singletonCImpl;
            this.b = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            ScannerActivityModule scannerActivityModule = new ScannerActivityModule();
            return new ScannerActivityOldSubcomponentImpl(this.f4144a, this.b, scannerActivityModule, (ScannerActivityOld) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ScannerActivityOldSubcomponentImpl implements SessionActivityBuilderModule_BindScannerActivityOld.ScannerActivityOldSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ScannerActivityOld f4145a;
        public final SingletonCImpl b;
        public final CartSessionComponentImpl c;

        public ScannerActivityOldSubcomponentImpl(SingletonCImpl singletonCImpl, CartSessionComponentImpl cartSessionComponentImpl, ScannerActivityModule scannerActivityModule, ScannerActivityOld scannerActivityOld) {
            this.b = singletonCImpl;
            this.c = cartSessionComponentImpl;
            this.f4145a = scannerActivityOld;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ScannerActivityOld scannerActivityOld = (ScannerActivityOld) obj;
            SingletonCImpl singletonCImpl = this.b;
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            UserConfigurations userConfigurations = (UserConfigurations) singletonCImpl.V2.get();
            UserManager userManager = (UserManager) singletonCImpl.X2.get();
            Cart cart = (Cart) this.c.l.get();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(userConfigurations, "userConfigurations");
            Intrinsics.h(userManager, "userManager");
            Intrinsics.h(cart, "cart");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            scannerActivityOld.t = new ScannerPresenter(this.f4145a, cart, featureToggleManager, userConfigurations, userManager, analyticsAggregator);
            scannerActivityOld.w = (FeatureToggleManager) singletonCImpl.P0.get();
            scannerActivityOld.x = (AnalyticsProvider) singletonCImpl.u2.get();
            scannerActivityOld.y = (AnalyticsManager) singletonCImpl.r2.get();
            scannerActivityOld.z = (PayClient) singletonCImpl.Q2.get();
            scannerActivityOld.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            scannerActivityOld.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            scannerActivityOld.H = new PermissionFlagInteractorImpl(singletonCImpl.y1());
            BaseShopAppModule baseShopAppModule = singletonCImpl.f;
            AppConfig config = (AppConfig) singletonCImpl.W0.get();
            baseShopAppModule.getClass();
            Intrinsics.h(config, "config");
            String t = config.getT();
            Preconditions.d(t);
            scannerActivityOld.L = t;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ScannerActivitySubcomponentFactory implements SessionActivityBuilderModule_BindScannerActivity.ScannerActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4146a;

        public ScannerActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl) {
            this.f4146a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new ScannerActivitySubcomponentImpl(this.f4146a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ScannerActivitySubcomponentImpl implements SessionActivityBuilderModule_BindScannerActivity.ScannerActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4147a;

        public ScannerActivitySubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4147a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ((ScannerActivity) obj).w = (FeatureToggleManager) this.f4147a.P0.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class SearchActivitySubcomponentFactory implements UserActivityBuilderModule_BindSearchActivity.SearchActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4148a;

        public SearchActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4148a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new SearchActivitySubcomponentImpl(this.f4148a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class SearchActivitySubcomponentImpl implements UserActivityBuilderModule_BindSearchActivity.SearchActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4149a;

        public SearchActivitySubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4149a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            com.woolworths.scanlibrary.ui.productsearch.SearchActivity searchActivity = (com.woolworths.scanlibrary.ui.productsearch.SearchActivity) obj;
            SingletonCImpl singletonCImpl = this.f4149a;
            searchActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            searchActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            searchActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            searchActivity.z = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ServiceCBuilder implements ShopApplication_HiltComponents.ServiceC.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4150a;
        public Service b;

        public ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.f4150a = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public final ServiceComponentBuilder a(Service service) {
            this.b = service;
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public final ServiceComponent build() {
            Preconditions.a(Service.class, this.b);
            return new ServiceCImpl(this.f4150a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ServiceCImpl extends ShopApplication_HiltComponents.ServiceC {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4151a;

        public ServiceCImpl(SingletonCImpl singletonCImpl) {
            this.f4151a = singletonCImpl;
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService_GeneratedInjector
        public final void a(PickupOrderLocationTrackingService pickupOrderLocationTrackingService) {
            SingletonCImpl singletonCImpl = this.f4151a;
            pickupOrderLocationTrackingService.h = (LocationInteractor) singletonCImpl.D3.get();
            pickupOrderLocationTrackingService.i = new PickupOrderLocationInteractor(new PickupOrderLocationRepository((ApolloClient) singletonCImpl.C1.get()));
            pickupOrderLocationTrackingService.j = (DispatcherProvider) singletonCImpl.n1.get();
            pickupOrderLocationTrackingService.k = (FeatureToggleManager) singletonCImpl.P0.get();
            pickupOrderLocationTrackingService.l = (AnalyticsManager) singletonCImpl.r2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.notification.WOWFirebaseMessagingService_GeneratedInjector
        public final void b(WOWFirebaseMessagingService wOWFirebaseMessagingService) {
            SingletonCImpl singletonCImpl = this.f4151a;
            ShopMyOrdersAppModule shopMyOrdersAppModule = singletonCImpl.D;
            Application applicationA = Contexts.a(singletonCImpl.e.f23776a);
            shopMyOrdersAppModule.getClass();
            wOWFirebaseMessagingService.h = new PickupNotificationHandler(new PickupNotificationManagerImpl(applicationA), (AnalyticsManager) singletonCImpl.r2.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (Gson) singletonCImpl.G0.get());
            ScanNGoNotificationModule scanNGoNotificationModule = singletonCImpl.E0;
            Context context = (Context) singletonCImpl.k1.get();
            UserManager userManager = (UserManager) singletonCImpl.X2.get();
            SharedPreferences prefs = (SharedPreferences) singletonCImpl.s1.get();
            DeviceRegistrationUC deviceRegistrationUCT1 = singletonCImpl.t1();
            scanNGoNotificationModule.getClass();
            Intrinsics.h(context, "context");
            Intrinsics.h(userManager, "userManager");
            Intrinsics.h(prefs, "prefs");
            wOWFirebaseMessagingService.i = new SNGFirebaseMessagingHandler(context, userManager, prefs, deviceRegistrationUCT1);
            wOWFirebaseMessagingService.j = (SwrveInteractor) singletonCImpl.j2.get();
        }
    }

    public static final class SetupCompleteActivitySubcomponentFactory implements ActivityBuilderModule_BindSetupCompleteActivity.SetupCompleteActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4152a;

        public SetupCompleteActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4152a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new SetupCompleteActivitySubcomponentImpl(this.f4152a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetupCompleteActivitySubcomponentImpl implements ActivityBuilderModule_BindSetupCompleteActivity.SetupCompleteActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4153a;

        public SetupCompleteActivitySubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4153a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            SetupCompleteActivity setupCompleteActivity = (SetupCompleteActivity) obj;
            SingletonCImpl singletonCImpl = this.f4153a;
            setupCompleteActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            setupCompleteActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            setupCompleteActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            setupCompleteActivity.z = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShoppingCartActivitySubcomponentFactory implements SessionActivityBuilderModule_BindShoppingCartActivity.ShoppingCartActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4154a;
        public final UserComponentImpl b;
        public final CartSessionComponentImpl c;

        public ShoppingCartActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl) {
            this.f4154a = singletonCImpl;
            this.b = userComponentImpl;
            this.c = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            ShoppingCartActivityModule shoppingCartActivityModule = new ShoppingCartActivityModule();
            CartFragmentModule cartFragmentModule = new CartFragmentModule();
            return new ShoppingCartActivitySubcomponentImpl(this.f4154a, this.b, this.c, shoppingCartActivityModule, cartFragmentModule, (ShoppingCartActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShoppingCartActivitySubcomponentImpl implements SessionActivityBuilderModule_BindShoppingCartActivity.ShoppingCartActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingCartActivity f4155a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final CartSessionComponentImpl d;
        public final Provider e;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4156a;
            public final UserComponentImpl b;
            public final CartSessionComponentImpl c;
            public final ShoppingCartActivitySubcomponentImpl d;

            public SwitchingProvider(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ShoppingCartActivitySubcomponentImpl shoppingCartActivitySubcomponentImpl) {
                this.f4156a = singletonCImpl;
                this.b = userComponentImpl;
                this.c = cartSessionComponentImpl;
                this.d = shoppingCartActivitySubcomponentImpl;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return new ShoppingCartFragmentSubcomponentFactory(this.f4156a, this.b, this.c, this.d);
            }
        }

        public ShoppingCartActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ShoppingCartActivityModule shoppingCartActivityModule, CartFragmentModule cartFragmentModule, ShoppingCartActivity shoppingCartActivity) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.d = cartSessionComponentImpl;
            this.f4155a = shoppingCartActivity;
            this.e = new SwitchingProvider(singletonCImpl, userComponentImpl, cartSessionComponentImpl, this);
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ShoppingCartActivity shoppingCartActivity = (ShoppingCartActivity) obj;
            CartSessionComponentImpl cartSessionComponentImpl = this.d;
            Store currentStore = (Store) cartSessionComponentImpl.m.get();
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Cart shoppingCart = (Cart) cartSessionComponentImpl.l.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart, "shoppingCart");
            ClearCartUseCase clearCartUseCase = new ClearCartUseCase(scanNGoRepositoryX1, shoppingCart, schedulerA);
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            MedalliaInteractor medalliaInteractor = (MedalliaInteractor) singletonCImpl.t2.get();
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            SurveyManager surveyManager = (SurveyManager) singletonCImpl.W2.get();
            Intrinsics.h(currentStore, "currentStore");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            Intrinsics.h(medalliaInteractor, "medalliaInteractor");
            Intrinsics.h(analyticsManager, "analyticsManager");
            Intrinsics.h(surveyManager, "surveyManager");
            shoppingCartActivity.t = new ShoppingCartActivityPresenter(this.f4155a, currentStore, clearCartUseCase, analyticsAggregator, analyticsManager, medalliaInteractor, surveyManager);
            shoppingCartActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            shoppingCartActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            shoppingCartActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            shoppingCartActivity.z = (PayClient) singletonCImpl.Q2.get();
            shoppingCartActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            shoppingCartActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            ImmutableMap.Builder builderB = ImmutableMap.b(29);
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            UserComponentImpl userComponentImpl = this.c;
            builderB.c(TapActivity.class, userComponentImpl.c);
            builderB.c(AddPaymentActivity.class, userComponentImpl.d);
            builderB.c(UpdateCreditCardActivity.class, userComponentImpl.e);
            builderB.c(MyAccountActivity.class, userComponentImpl.f);
            builderB.c(TransactionListActivity.class, userComponentImpl.g);
            builderB.c(ReceiptActivity.class, userComponentImpl.h);
            builderB.c(ExitScanCodeActivity.class, userComponentImpl.i);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchActivity.class, userComponentImpl.j);
            builderB.c(HomeActivity.class, cartSessionComponentImpl.d);
            builderB.c(ShoppingCartActivity.class, cartSessionComponentImpl.e);
            builderB.c(ScannerActivityOld.class, cartSessionComponentImpl.f);
            builderB.c(ScannerActivity.class, cartSessionComponentImpl.g);
            builderB.c(AddItemActivity.class, cartSessionComponentImpl.h);
            builderB.c(WeightedArticleSelectionActivity.class, cartSessionComponentImpl.i);
            builderB.c(CheckOutActivity.class, cartSessionComponentImpl.j);
            builderB.c(ProductInfoActivity.class, cartSessionComponentImpl.k);
            builderB.c(ShoppingCartFragment.class, this.e);
            shoppingCartActivity.G = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
            shoppingCartActivity.I = singletonCImpl.s1();
            shoppingCartActivity.J = (LogoutManager) userComponentImpl.n.get();
            shoppingCartActivity.K = ScanNGoModule_GetFaqUsUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            shoppingCartActivity.L = ScanNGoModule_GetTnCUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            shoppingCartActivity.M = ScanNGoModule_GetPrivacyUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            shoppingCartActivity.N = ScanNGoModule_GetCollectionUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            shoppingCartActivity.O = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShoppingCartFragmentSubcomponentFactory implements FragmentProviderModule_ProvideFragmentFactory.ShoppingCartFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4157a;
        public final UserComponentImpl b;
        public final CartSessionComponentImpl c;
        public final ShoppingCartActivitySubcomponentImpl d;

        public ShoppingCartFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ShoppingCartActivitySubcomponentImpl shoppingCartActivitySubcomponentImpl) {
            this.f4157a = singletonCImpl;
            this.b = userComponentImpl;
            this.c = cartSessionComponentImpl;
            this.d = shoppingCartActivitySubcomponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            CartSessionComponentImpl cartSessionComponentImpl = this.c;
            ShoppingCartActivitySubcomponentImpl shoppingCartActivitySubcomponentImpl = this.d;
            return new ShoppingCartFragmentSubcomponentImpl(this.f4157a, this.b, cartSessionComponentImpl, shoppingCartActivitySubcomponentImpl, (ShoppingCartFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShoppingCartFragmentSubcomponentImpl implements FragmentProviderModule_ProvideFragmentFactory.ShoppingCartFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingCartFragment f4158a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final CartSessionComponentImpl d;

        public ShoppingCartFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, ShoppingCartActivitySubcomponentImpl shoppingCartActivitySubcomponentImpl, ShoppingCartFragment shoppingCartFragment) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.d = cartSessionComponentImpl;
            this.f4158a = shoppingCartFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ShoppingCartFragment shoppingCartFragment = (ShoppingCartFragment) obj;
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            CartSessionComponentImpl cartSessionComponentImpl = this.d;
            Cart shoppingCart = (Cart) cartSessionComponentImpl.l.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart, "shoppingCart");
            GetCartUseCase getCartUseCase = new GetCartUseCase(scanNGoRepositoryX1, shoppingCart, schedulerA);
            CartSessionManager cartSessionManager = (CartSessionManager) this.c.l.get();
            ScanNGoRepository scanNGoRepositoryX12 = singletonCImpl.x1();
            Cart shoppingCart2 = (Cart) cartSessionComponentImpl.l.get();
            Scheduler schedulerA2 = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart2, "shoppingCart");
            ClearCartUseCase clearCartUseCase = new ClearCartUseCase(scanNGoRepositoryX12, shoppingCart2, schedulerA2);
            ScanNGoRepository scanNGoRepositoryX13 = singletonCImpl.x1();
            Cart shoppingCart3 = (Cart) cartSessionComponentImpl.l.get();
            Scheduler schedulerA3 = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart3, "shoppingCart");
            PendingPromotionUseCase pendingPromotionUseCase = new PendingPromotionUseCase(scanNGoRepositoryX13, shoppingCart3, schedulerA3);
            ScanNGoRepository scanNGoRepositoryX14 = singletonCImpl.x1();
            Cart shoppingCart4 = (Cart) cartSessionComponentImpl.l.get();
            Scheduler schedulerA4 = ScanNGoModule_GetSchedulerFactory.a(scanNGoModule);
            Intrinsics.h(shoppingCart4, "shoppingCart");
            CheckoutCartUseCase checkoutCartUseCase = new CheckoutCartUseCase(scanNGoRepositoryX14, shoppingCart4, schedulerA4);
            Store currentStore = (Store) cartSessionComponentImpl.m.get();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            Cart shoppingCart5 = (Cart) cartSessionComponentImpl.l.get();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            Intrinsics.h(cartSessionManager, "cartSessionManager");
            Intrinsics.h(currentStore, "currentStore");
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(shoppingCart5, "shoppingCart");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            Intrinsics.h(analyticsManager, "analyticsManager");
            shoppingCartFragment.d = new CartPresenter(this.f4158a, getCartUseCase, clearCartUseCase, checkoutCartUseCase, pendingPromotionUseCase, currentStore, shoppingCart5, cartSessionManager, featureToggleManager, analyticsAggregator, analyticsManager);
            shoppingCartFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            shoppingCartFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            shoppingCartFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            shoppingCartFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            shoppingCartFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            shoppingCartFragment.l = new SnGShoppingListUtils(singletonCImpl.x1(), (UserConfigurations) singletonCImpl.V2.get(), (ListsInMemoryRepository) singletonCImpl.E2.get(), (ShoppingListLocalRepository) singletonCImpl.A2.get());
            shoppingCartFragment.m = new ScreenNavigator((FeatureToggleManager) singletonCImpl.P0.get());
        }
    }

    public static final class SingletonCImpl extends ShopApplication_HiltComponents.SingletonC {
        public final ShopCheckoutAppModule A;
        public final RemoteDismissibleBannerModule A0;
        public final Provider A1;
        public final Provider A2;
        public final Provider A3;
        public final Provider A4;
        public final ShopListsAppModule B;
        public final ShippingCalculatorAppModule B0;
        public final Provider B1;
        public final Provider B2;
        public final Provider B3;
        public final Provider B4;
        public final ShopMarketplaceAppModule C;
        public final ShopStoreLocatorAppModule C0;
        public final Provider C1;
        public final Provider C2;
        public final Provider C3;
        public final Provider C4;
        public final ShopMyOrdersAppModule D;
        public final au.com.woolworths.feature.product.list.v2.di.ProductListAppModule D0;
        public final Provider D1;
        public final Provider D2;
        public final Provider D3;
        public final Provider D4;
        public final ShopScanAndGoAppModule E;
        public final ScanNGoNotificationModule E0;
        public final Provider E1;
        public final Provider E2;
        public final Provider E3;
        public final Provider E4;
        public final ShopWPayAppModule F;
        public final Provider F1;
        public final Provider F2;
        public final Provider F3;
        public final Provider F4;
        public final TigerNewOffersModule G;
        public final Provider G1;
        public final Provider G2;
        public final Provider G3;
        public final Provider G4;
        public final VocAppModule H;
        public final Provider H1;
        public final Provider H2;
        public final Provider H3;
        public final Provider H4;
        public final BaseDataModule I;
        public final Provider I1;
        public final Provider I2;
        public final Provider I3;
        public final Provider I4;
        public final ShopAppRegionModule J;
        public final Provider J1;
        public final Provider J2;
        public final Provider J3;
        public final Provider J4;
        public final AppConfigModule K;
        public final Provider K1;
        public final Provider K2;
        public final Provider K3;
        public final Provider K4;
        public final DeviceFingerprintAppModule L;
        public final Provider L1;
        public final Provider L2;
        public final Provider L3;
        public final Provider L4;
        public final HttpInterceptorModule M;
        public final Provider M1;
        public final Provider M2;
        public final Provider M3;
        public final Provider M4;
        public final au.com.woolworths.android.onesite.di.modules.NetworkModule N;
        public final Provider N1;
        public final Provider N2;
        public final Provider N3;
        public final Provider N4;
        public final ScanNGoModule O;
        public final Provider O1;
        public final Provider O2;
        public final Provider O3;
        public final Provider O4;
        public final CollectionModeModule P;
        public final Provider P1;
        public final Provider P2;
        public final Provider P3;
        public final Provider P4;
        public final au.com.woolworths.feature.shop.storelocator.legacy.di.ShopStoreLocatorAppModule Q;
        public final Provider Q1;
        public final Provider Q2;
        public final Provider Q3;
        public final Provider Q4;
        public final WxidAppModule R;
        public final Provider R1;
        public final Provider R2;
        public final Provider R3;
        public final Provider R4;
        public final RewardsAccountAppModule S;
        public final Provider S1;
        public final Provider S2;
        public final Provider S3;
        public final Provider S4;
        public final CartInfoModule T;
        public final Provider T1;
        public final Provider T2;
        public final Provider T3;
        public final Provider T4;
        public final CartUpdateModule U;
        public final Provider U1;
        public final Provider U2;
        public final Provider U3;
        public final Provider U4;
        public final CheckoutAppModule V;
        public final Provider V1;
        public final Provider V2;
        public final Provider V3;
        public final Provider V4;
        public final LegacyDigipayModule W;
        public final Provider W1;
        public final Provider W2;
        public final Provider W3;
        public final Provider W4;
        public final DigipaySdkAppModule X;
        public final Provider X1;
        public final Provider X2;
        public final Provider X3;
        public final Provider X4;
        public final ShopLoginAppModule Y;
        public final Provider Y1;
        public final Provider Y2;
        public final Provider Y3;
        public final Provider Y4;
        public final AppBuildConfigModule Z;
        public final Provider Z1;
        public final Provider Z2;
        public final Provider Z3;
        public final Provider Z4;

        /* renamed from: a, reason: collision with root package name */
        public final ShopAuthAppModule f4159a;
        public final MarketingAppModule a0;
        public final Provider a2;
        public final Provider a3;
        public final Provider a4;
        public final Provider a5;
        public final AppModule b;
        public final NavigationModule b0;
        public final Provider b2;
        public final Provider b3;
        public final Provider b4;
        public final Provider b5;
        public final ReleaseModule c;
        public final ShopListsDataAppModule c0;
        public final Provider c2;
        public final Provider c3;
        public final Provider c4;
        public final Provider c5;
        public final BaseNetworkModule d;
        public final ViewModelModule d0;
        public final Provider d2;
        public final Provider d3;
        public final Provider d4;
        public final Provider d5;
        public final ApplicationContextModule e;
        public final BffScanNGoModule e0;
        public final Provider e2;
        public final Provider e3;
        public final Provider e4;
        public final Provider e5;
        public final BaseShopAppModule f;
        public final ShopWxidAppModule f0;
        public final Provider f2;
        public final Provider f3;
        public final Provider f4;
        public final Provider f5;
        public final BaseRewardsAppModule g;
        public final au.com.woolworths.feature.shop.instore.navigation.di.ReleaseModule g0;
        public final Provider g2;
        public final Provider g3;
        public final Provider g4;
        public final Provider g5;
        public final BuyAgainAppModule h;
        public final GeolocationAppModule h0;
        public final Provider h2;
        public final Provider h3;
        public final Provider h4;
        public final CatalogueAppModule i;
        public final FusedLocationModule i0;
        public final Provider i2;
        public final Provider i3;
        public final Provider i4;
        public final DeliveryAddressAppModule j;
        public final SduiModule j0;
        public final Provider j2;
        public final Provider j3;
        public final Provider j4;
        public final EditOrderModule k;
        public final LegacyDataModule k0;
        public final Provider k2;
        public final Provider k3;
        public final Provider k4;
        public final HomepageAppModule l;
        public final ShopReceiptDetailsAppModule l0;
        public final Provider l2;
        public final Provider l3;
        public final Provider l4;
        public final InStoreWifiAppModule m;
        public final ProductListAppModule m0;
        public final Provider m2;
        public final Provider m3;
        public final Provider m4;
        public final InstoreNavigationAppModule n;
        public final au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule n0;
        public final Provider n2;
        public final Provider n3;
        public final Provider n4;
        public final InstorePresenceAppModule o;
        public final ForceUpgradeAppModule o0;
        public final Provider o1;
        public final Provider o2;
        public final Provider o3;
        public final Provider o4;
        public final LegacyAppModule p;
        public final PushNotificationPermissionModule p0;
        public final Provider p1;
        public final Provider p2;
        public final Provider p3;
        public final Provider p4;
        public final MoreFeatureAppModule q;
        public final au.com.woolworths.shop.product.details.di.ProductDetailsAppModule q0;
        public final DelegateFactory q1;
        public final Provider q2;
        public final Provider q3;
        public final Provider q4;
        public final OliveVoiceAppModule r;
        public final AdvertisingAppModule r0;
        public final DelegateFactory r1;
        public final Provider r2;
        public final Provider r3;
        public final Provider r4;
        public final ProductAppModule s;
        public final RewardsServiceMessageModule s0;
        public final Provider s1;
        public final Provider s2;
        public final Provider s3;
        public final Provider s4;
        public final ProductDetailsAppModule t;
        public final InstoreCartAppModule t0;
        public final Provider t1;
        public final Provider t2;
        public final Provider t3;
        public final Provider t4;
        public final PromotionBannerAppModule u;
        public final NotificationModule u0;
        public final Provider u1;
        public final Provider u2;
        public final Provider u3;
        public final Provider u4;
        public final RecipesAppModule v;
        public final RewardsOnboardingAppModule v0;
        public final Provider v1;
        public final Provider v2;
        public final Provider v3;
        public final Provider v4;
        public final RewardsCardAppModule w;
        public final OnboardingSduiAppModule w0;
        public final Provider w1;
        public final Provider w2;
        public final Provider w3;
        public final Provider w4;
        public final RewardsOffersAppModule x;
        public final NetworkModule x0;
        public final Provider x1;
        public final Provider x2;
        public final Provider x3;
        public final Provider x4;
        public final RewardsPreferencesAppModule y;
        public final ProductAvailabilityModule y0;
        public final Provider y1;
        public final Provider y2;
        public final Provider y3;
        public final Provider y4;
        public final ShopAskOliveAppModule z;
        public final RecipeDetailsAppModule z0;
        public final Provider z1;
        public final Provider z2;
        public final Provider z3;
        public final Provider z4;
        public final SingletonCImpl F0 = this;
        public final Provider G0 = DoubleCheck.b(new SwitchingProvider(this, 1));
        public final Provider H0 = DoubleCheck.b(new SwitchingProvider(this, 3));
        public final DelegateFactory I0 = new DelegateFactory();
        public final Provider J0 = DoubleCheck.b(new SwitchingProvider(this, 9));
        public final Provider K0 = DoubleCheck.b(new SwitchingProvider(this, 10));
        public final Provider L0 = DoubleCheck.b(new SwitchingProvider(this, 11));
        public final Provider M0 = DoubleCheck.b(new SwitchingProvider(this, 8));
        public final Provider N0 = DoubleCheck.b(new SwitchingProvider(this, 13));
        public final Provider O0 = DoubleCheck.b(new SwitchingProvider(this, 12));
        public final Provider P0 = DoubleCheck.b(new SwitchingProvider(this, 7));
        public final Provider Q0 = DoubleCheck.b(new SwitchingProvider(this, 6));
        public final Provider R0 = DoubleCheck.b(new SwitchingProvider(this, 5));
        public final Provider S0 = DoubleCheck.b(new SwitchingProvider(this, 4));
        public final Provider T0 = DoubleCheck.b(new SwitchingProvider(this, 17));
        public final Provider U0 = DoubleCheck.b(new SwitchingProvider(this, 18));
        public final Provider V0 = DoubleCheck.b(new SwitchingProvider(this, 19));
        public final Provider W0 = DoubleCheck.b(new SwitchingProvider(this, 21));
        public final Provider X0 = DoubleCheck.b(new SwitchingProvider(this, 20));
        public final Provider Y0 = DoubleCheck.b(new SwitchingProvider(this, 16));
        public final Provider Z0 = DoubleCheck.b(new SwitchingProvider(this, 23));
        public final Provider a1 = DoubleCheck.b(new SwitchingProvider(this, 22));
        public final Provider b1 = DoubleCheck.b(new SwitchingProvider(this, 24));
        public final Provider c1 = DoubleCheck.b(new SwitchingProvider(this, 15));
        public final Provider d1 = DoubleCheck.b(new SwitchingProvider(this, 14));
        public final Provider e1 = DoubleCheck.b(new SwitchingProvider(this, 25));
        public final Provider f1 = DoubleCheck.b(new SwitchingProvider(this, 2));
        public final Provider g1 = DoubleCheck.b(new SwitchingProvider(this, 28));
        public final Provider h1 = DoubleCheck.b(new SwitchingProvider(this, 27));
        public final Provider i1 = DoubleCheck.b(new SwitchingProvider(this, 26));
        public final Provider j1 = DoubleCheck.b(new SwitchingProvider(this, 30));
        public final Provider k1 = DoubleCheck.b(new SwitchingProvider(this, 31));
        public final Provider l1 = DoubleCheck.b(new SwitchingProvider(this, 29));
        public final Provider m1 = DoubleCheck.b(new SwitchingProvider(this, 32));
        public final Provider n1 = DoubleCheck.b(new SwitchingProvider(this, 33));

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4160a;
            public final int b;

            public SwitchingProvider(SingletonCImpl singletonCImpl, int i) {
                this.f4160a = singletonCImpl;
                this.b = i;
            }

            public final Object a() throws GeneralSecurityException, IOException, NumberFormatException {
                EncryptedSharedPreferences encryptedSharedPreferencesA;
                SingletonCImpl singletonCImpl = this.f4160a;
                int i = this.b;
                switch (i) {
                    case 0:
                        return ShopAuthAppModule_ProvideShopAppTokenAuthenticatorFactory.a(singletonCImpl.f4159a, (Gson) singletonCImpl.G0.get(), DoubleCheck.a(singletonCImpl.f1), (AppConfig) singletonCImpl.W0.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), DoubleCheck.a(singletonCImpl.i1), (Auth0AuthManager) singletonCImpl.l1.get(), (NetworkExceptions) singletonCImpl.m1.get(), (DispatcherProvider) singletonCImpl.n1.get());
                    case 1:
                        return AppModule_ProvideWoolworthsGsonFactory.a(singletonCImpl.b);
                    case 2:
                        ReleaseModule releaseModule = singletonCImpl.c;
                        Cache cache = (Cache) singletonCImpl.H0.get();
                        AppModule appModule = singletonCImpl.b;
                        ShopAuthenticator authenticator = (ShopAuthenticator) singletonCImpl.S0.get();
                        appModule.getClass();
                        Intrinsics.h(authenticator, "authenticator");
                        return ReleaseModule_ProvideOkHttpClientFactory.a(releaseModule, cache, authenticator, SingletonCImpl.g1(singletonCImpl), SingletonCImpl.e1(singletonCImpl), (PreemptiveTokenRefreshInterceptor) singletonCImpl.e1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 3:
                        return BaseNetworkModule_ProvideCacheFactory.a(singletonCImpl.d, ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e));
                    case 4:
                        return ShopAuthAppModule_ProvideShopTokenAuthenticatorFactory.a(singletonCImpl.f4159a, (ShopAppTokenAuthenticator) singletonCImpl.I0.get(), (KeycloakTokenAuthenticator) singletonCImpl.R0.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get());
                    case 5:
                        return ShopAuthAppModule_ProvideKeycloakTokenAuthenticatorFactory.a(singletonCImpl.f4159a, (KeycloakAuthManager) singletonCImpl.Q0.get());
                    case 6:
                        return AppModule_ProvidesKeycloakAuthManagerFactory.a(singletonCImpl.b, ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 7:
                        return AppModule_ProvideFeatureToggleManagerFactory.a(singletonCImpl.b, (FeatureToggleManagerImpl) singletonCImpl.M0.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get());
                    case 8:
                        return BaseModule_ProvideFeatureToggleManagerImpl$base_impl_releaseFactory.a(ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), SingletonCImpl.f1(singletonCImpl), SingletonCImpl.j1(singletonCImpl), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), (FirebaseRepository) singletonCImpl.K0.get(), (ConnectionManager) singletonCImpl.L0.get());
                    case 9:
                        singletonCImpl.x.getClass();
                        return RewardsHomeOffersFeatureKt.f6341a;
                    case 10:
                        return BaseModule_ProvideFirebaseAppRepository$base_impl_releaseFactory.a(SingletonCImpl.k1(singletonCImpl));
                    case 11:
                        return BaseNetworkModule_ProvideConnectionManagerFactory.a(singletonCImpl.d, ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e));
                    case 12:
                        return ShopAppRegionModule_ProvideShopAppRegionInteractorFactory.a(singletonCImpl.J, SingletonCImpl.o1(singletonCImpl));
                    case 13:
                        AppConfigModule appConfigModule = singletonCImpl.K;
                        ShopAppAuFlavorInteractor shopAppAuFlavorInteractor = new ShopAppAuFlavorInteractor();
                        AppConfigModule_ProvideShopAppFlavorInteractorFactory.a(appConfigModule, shopAppAuFlavorInteractor);
                        return shopAppAuFlavorInteractor;
                    case 14:
                        return HttpInterceptorModule_ProvideShopAppHttpInterceptorFactory.a(singletonCImpl.M, (SharedHeaders) singletonCImpl.c1.get(), (ConnectionManager) singletonCImpl.L0.get());
                    case 15:
                        return NetworkModule_ProvideSharedHeadersFactory.a(singletonCImpl.N, ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), (ShopAccountInteractor) singletonCImpl.Y0.get(), (AdobeAnalyticsInteractor) singletonCImpl.a1.get(), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), (Tealium) singletonCImpl.X0.get(), (AppEnvironment) singletonCImpl.b1.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 16:
                        ShopAuthAppModule shopAuthAppModule = singletonCImpl.f4159a;
                        AdobeAnalyticsRepository adobeAnalyticsRepository = (AdobeAnalyticsRepository) singletonCImpl.T0.get();
                        AccountRepository accountRepository = (AccountRepository) singletonCImpl.U0.get();
                        FirebaseAnalyticsLogger firebaseAnalyticsLogger = (FirebaseAnalyticsLogger) singletonCImpl.V0.get();
                        TimberDynatraceLogger timberDynatraceLoggerA = BaseModule_ProvideDyntraceLoggerFactory.a();
                        Gson gson = (Gson) singletonCImpl.G0.get();
                        Tealium tealium = (Tealium) singletonCImpl.X0.get();
                        Context context = singletonCImpl.e.f23776a;
                        Preconditions.d(context);
                        return ShopAuthAppModule_ProvideShopAccountInteractorFactory.a(shopAuthAppModule, adobeAnalyticsRepository, accountRepository, firebaseAnalyticsLogger, timberDynatraceLoggerA, gson, tealium, context);
                    case 17:
                        return BaseModule_ProvideAdobeAnalyticsRepository$base_impl_releaseFactory.a(SingletonCImpl.l1(singletonCImpl));
                    case 18:
                        return ShopAuthAppModule_ProvideAccountRepositoryFactory.a(singletonCImpl.f4159a, SingletonCImpl.m1(singletonCImpl), singletonCImpl.y1(), (Gson) singletonCImpl.G0.get());
                    case 19:
                        return BaseModule_ProvideAnalyticsLoggerFactory.a(BaseModule_ProvideFirebaseCrashlyticsFactory.a());
                    case 20:
                        return BaseModule_ProvidesTealiumFactory.a(ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), (AppConfig) singletonCImpl.W0.get(), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 21:
                        return AppConfigModule_ProvideAppConfigFactory.a(singletonCImpl.K, ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 22:
                        return BaseModule_ProvideAdobeAnalyticsInteractor$base_impl_releaseFactory.a((AppConfig) singletonCImpl.W0.get(), Contexts.a(singletonCImpl.e.f23776a), (AdobeAnalyticsRepository) singletonCImpl.T0.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get());
                    case 23:
                        return new FirebasePerfMonitor();
                    case 24:
                        return BaseModule_ProvideAppEnvironmentFactory.a(ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c));
                    case 25:
                        return NetworkModule_ProvideRefreshTokenInterceptorFactory.a(singletonCImpl.N, (ShopAccountInteractor) singletonCImpl.Y0.get());
                    case 26:
                        return ShopAuthAppModule_ProvideAuthInteractorFactory.a(singletonCImpl.f4159a, (AuthRepository) singletonCImpl.h1.get());
                    case 27:
                        ShopAuthAppModule shopAuthAppModule2 = singletonCImpl.f4159a;
                        return ShopAuthAppModule_ProvideAuthRepositoryFactory.a(shopAuthAppModule2, ShopAuthAppModule_ProvideAuthTokenApiFactory.a(shopAuthAppModule2, (OkHttpClient) singletonCImpl.f1.get(), (AppConfig) singletonCImpl.W0.get(), (Gson) singletonCImpl.g1.get()));
                    case 28:
                        singletonCImpl.b.getClass();
                        return new GsonBuilder().a();
                    case 29:
                        return AppModule_ProvidesAuth0AuthManagerFactory.a(singletonCImpl.b, (AuthConfig) singletonCImpl.j1.get(), (AdobeAnalyticsInteractor) singletonCImpl.a1.get(), (Context) singletonCImpl.k1.get());
                    case 30:
                        return AppConfigModule_ProvideAuthConfigFactory.a(singletonCImpl.K, ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c));
                    case 31:
                        ScanNGoModule scanNGoModule = singletonCImpl.O;
                        Application applicationA = Contexts.a(singletonCImpl.e.f23776a);
                        ScanNGoModule_ProvideContextFactory.a(scanNGoModule, applicationA);
                        return applicationA;
                    case 32:
                        return BaseModule_ProvideNetworkExceptions$base_impl_releaseFactory.a((Gson) singletonCImpl.G0.get());
                    case 33:
                        return new AndroidDispatcherProvider();
                    case 34:
                        return new AndroidSchedulersProvider();
                    case 35:
                        LegacyAppModule legacyAppModule = singletonCImpl.p;
                        LegacyShopAnalyticsManagerImpl legacyShopAnalyticsManagerImpl = (LegacyShopAnalyticsManagerImpl) singletonCImpl.a2.get();
                        LegacyAppModule_ProvidesLegacyAnalyticsManager$shop_legacy_releaseFactory.a(legacyAppModule, legacyShopAnalyticsManagerImpl);
                        return legacyShopAnalyticsManagerImpl;
                    case 36:
                        return new LegacyShopAnalyticsManagerImpl((Tealium) singletonCImpl.X0.get(), SingletonCImpl.i1(singletonCImpl), (ShopAccountInteractor) singletonCImpl.Y0.get(), (AppConfigurationInteractor) singletonCImpl.P1.get(), (PreferencesManager) singletonCImpl.p1.get(), (DeviceAccessibilityTracker) singletonCImpl.Z1.get());
                    case 37:
                        CollectionModeModule collectionModeModule = singletonCImpl.P;
                        CollectionModeInteractorImpl collectionModeInteractorImpl = (CollectionModeInteractorImpl) singletonCImpl.J1.get();
                        collectionModeModule.getClass();
                        Intrinsics.h(collectionModeInteractorImpl, "collectionModeInteractorImpl");
                        return collectionModeInteractorImpl;
                    case 38:
                        return CollectionModeModule_ProvidesCollectionModeInteractorImplFactory.a(singletonCImpl.P, DoubleCheck.a(singletonCImpl.t1), DoubleCheck.a(singletonCImpl.E1), (CollectionModeRepository) singletonCImpl.F1.get(), (PickUpLocatorRepository) singletonCImpl.I1.get(), (AccountInteractor) singletonCImpl.v1.get());
                    case 39:
                        return CollectionModeModule_ProvideRepositoryManagerFactory.a(singletonCImpl.P, (PreferencesManager) singletonCImpl.p1.get(), singletonCImpl.z1(), (CollectionModeInteractor) singletonCImpl.q1.get(), (LegacyShopAnalyticsManager) singletonCImpl.r1.get(), (FirebaseAnalyticsLogger) singletonCImpl.V0.get(), (DispatcherProvider) singletonCImpl.n1.get(), (SchedulersProvider) singletonCImpl.o1.get(), (SharedPreferences) singletonCImpl.s1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 40:
                        return BaseModule_ProvidePreferencesManagerFactory.a(Contexts.a(singletonCImpl.e.f23776a), (Gson) singletonCImpl.G0.get(), (FirebaseAnalyticsLogger) singletonCImpl.V0.get());
                    case 41:
                        return ScanNGoModule_GetSharedPreferenceFactory.a(singletonCImpl.O, (Context) singletonCImpl.k1.get());
                    case 42:
                        return CollectionModeModule_ProvideLegacyShoppingModeRepositoryFactory.a(singletonCImpl.P, singletonCImpl.y1(), (Gson) singletonCImpl.G0.get(), (ShoppingModeApi) singletonCImpl.u1.get(), (AccountInteractor) singletonCImpl.v1.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (SchedulersProvider) singletonCImpl.o1.get(), new AddressInteractor((AddressApi) singletonCImpl.D1.get()), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 43:
                        return NetworkModule_ProvideCollectionApiFactory.a(singletonCImpl.N, (AppConfig) singletonCImpl.W0.get(), (OkHttpClient) singletonCImpl.f1.get(), (SchedulersProvider) singletonCImpl.o1.get(), (Gson) singletonCImpl.G0.get());
                    case 44:
                        ShopAuthAppModule shopAuthAppModule3 = singletonCImpl.f4159a;
                        ShopAccountInteractor shopAccountInteractor = (ShopAccountInteractor) singletonCImpl.Y0.get();
                        shopAuthAppModule3.getClass();
                        Intrinsics.h(shopAccountInteractor, "shopAccountInteractor");
                        return shopAccountInteractor;
                    case 45:
                        LegacyAppModule legacyAppModule2 = singletonCImpl.p;
                        ApolloClient apolloClient = (ApolloClient) singletonCImpl.C1.get();
                        DispatcherProvider dispatcherProvider = (DispatcherProvider) singletonCImpl.n1.get();
                        legacyAppModule2.getClass();
                        Intrinsics.h(apolloClient, "apolloClient");
                        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
                        return new AddressApiImpl(dispatcherProvider, apolloClient);
                    case 46:
                        BaseNetworkModule baseNetworkModule = singletonCImpl.d;
                        OkHttpClient okHttpClient = (OkHttpClient) singletonCImpl.f1.get();
                        SseNetworkTransport networkTransport = (SseNetworkTransport) singletonCImpl.y1.get();
                        ImmutableSet<Pair> customerScalarAdapters = SingletonCImpl.h1(singletonCImpl);
                        ImmutableSet apolloInterceptors = SingletonCImpl.d1(singletonCImpl);
                        AppConfig appConfig = (AppConfig) singletonCImpl.W0.get();
                        FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
                        baseNetworkModule.getClass();
                        Intrinsics.h(okHttpClient, "okHttpClient");
                        Intrinsics.h(networkTransport, "networkTransport");
                        Intrinsics.h(customerScalarAdapters, "customerScalarAdapters");
                        Intrinsics.h(apolloInterceptors, "apolloInterceptors");
                        Intrinsics.h(appConfig, "appConfig");
                        Intrinsics.h(featureToggleManager, "featureToggleManager");
                        OkHttpClient.Builder builderC = okHttpClient.c();
                        builderC.a(new GraphQlBaseUrlInterceptor(appConfig, "graphql", new au.com.woolworths.android.onesite.analytics.a11y.a(4)));
                        OkHttpClient okHttpClient2 = new OkHttpClient(builderC);
                        if (!featureToggleManager.c(BaseFeature.f)) {
                            ApolloClient.Builder builder = new ApolloClient.Builder();
                            OkHttpExtensionsKt.a(builder, okHttpClient2);
                            builder.c(CollectionsKt.G0(apolloInterceptors));
                            builder.d(appConfig.d() + "graphql");
                            for (Pair pair : customerScalarAdapters) {
                                builder.a((CustomScalarType) pair.d, (Adapter) pair.e);
                            }
                            builder.o = Boolean.TRUE;
                            return builder.b();
                        }
                        ApolloClient.Builder builder2 = new ApolloClient.Builder();
                        builder2.n = DefaultHttpEngine.a(okHttpClient2);
                        builder2.l = networkTransport;
                        builder2.c(CollectionsKt.G0(apolloInterceptors));
                        builder2.d(appConfig.d() + "graphql");
                        for (Pair pair2 : customerScalarAdapters) {
                            builder2.a((CustomScalarType) pair2.d, (Adapter) pair2.e);
                        }
                        builder2.o = Boolean.TRUE;
                        return builder2.b();
                    case 47:
                        BaseNetworkModule baseNetworkModule2 = singletonCImpl.d;
                        ConnectionHandler connectionHandler = (ConnectionHandler) singletonCImpl.x1.get();
                        BaseNetworkModule baseNetworkModule3 = singletonCImpl.d;
                        TimberDynatraceLogger timberDynatraceLogger = new TimberDynatraceLogger();
                        baseNetworkModule3.getClass();
                        ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger = new ApolloSseTransportDynatraceLogger(timberDynatraceLogger);
                        baseNetworkModule2.getClass();
                        Intrinsics.h(connectionHandler, "connectionHandler");
                        return new SseNetworkTransport(connectionHandler, apolloSseTransportDynatraceLogger);
                    case 48:
                        BaseNetworkModule baseNetworkModule4 = singletonCImpl.d;
                        BaseNetworkModule baseNetworkModule5 = singletonCImpl.d;
                        OkHttpClient okHttpClient3 = (OkHttpClient) singletonCImpl.w1.get();
                        OkHttpClient okHttpClient4 = (OkHttpClient) singletonCImpl.w1.get();
                        baseNetworkModule4.getClass();
                        Intrinsics.h(okHttpClient4, "okHttpClient");
                        int i2 = EventSources.f26777a;
                        androidx.compose.runtime.snapshots.a aVar = new androidx.compose.runtime.snapshots.a(okHttpClient4, 14);
                        Gson gson2 = (Gson) singletonCImpl.g1.get();
                        Intrinsics.h(okHttpClient3, "okHttpClient");
                        Intrinsics.h(gson2, "gson");
                        ChannelFactory channelFactory = new ChannelFactory(okHttpClient3, gson2, aVar);
                        baseNetworkModule5.getClass();
                        SseTransportMessage.MessageType messageType = new SseTransportMessage.MessageType();
                        AppConfig appConfig2 = (AppConfig) singletonCImpl.W0.get();
                        TimberDynatraceLogger timberDynatraceLogger2 = new TimberDynatraceLogger();
                        baseNetworkModule5.getClass();
                        ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger2 = new ApolloSseTransportDynatraceLogger(timberDynatraceLogger2);
                        Gson gson3 = (Gson) singletonCImpl.g1.get();
                        baseNetworkModule4.getClass();
                        Intrinsics.h(appConfig2, "appConfig");
                        Intrinsics.h(gson3, "gson");
                        return new ConnectionHandler(channelFactory, YU.a.g(appConfig2.d(), "subscription"), messageType, apolloSseTransportDynatraceLogger2, gson3);
                    case 49:
                        ReleaseModule releaseModule2 = singletonCImpl.c;
                        AppModule appModule2 = singletonCImpl.b;
                        ShopAuthenticator authenticator2 = (ShopAuthenticator) singletonCImpl.S0.get();
                        appModule2.getClass();
                        Intrinsics.h(authenticator2, "authenticator");
                        ImmutableSet interceptors = SingletonCImpl.g1(singletonCImpl);
                        PreemptiveTokenRefreshInterceptor preemptiveTokenRefreshInterceptor = (PreemptiveTokenRefreshInterceptor) singletonCImpl.e1.get();
                        releaseModule2.getClass();
                        Intrinsics.h(interceptors, "interceptors");
                        Intrinsics.h(preemptiveTokenRefreshInterceptor, "preemptiveTokenRefreshInterceptor");
                        OkHttpClient.Builder builder3 = new OkHttpClient.Builder();
                        builder3.h = authenticator2;
                        Duration durationOfSeconds = Duration.ofSeconds(60L);
                        Intrinsics.g(durationOfSeconds, "ofSeconds(...)");
                        builder3.b(durationOfSeconds);
                        Duration durationOfSeconds2 = Duration.ofSeconds(60L);
                        Intrinsics.g(durationOfSeconds2, "ofSeconds(...)");
                        long millis = durationOfSeconds2.toMillis();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        builder3.d(millis, timeUnit);
                        Duration durationOfSeconds3 = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds3, "ofSeconds(...)");
                        builder3.c(durationOfSeconds3.toMillis(), timeUnit);
                        Duration durationOfSeconds4 = Duration.ofSeconds(60L);
                        Intrinsics.g(durationOfSeconds4, "ofSeconds(...)");
                        builder3.e(durationOfSeconds4.toMillis(), timeUnit);
                        builder3.a(preemptiveTokenRefreshInterceptor);
                        Iterator<E> it = interceptors.iterator();
                        while (it.hasNext()) {
                            builder3.a((Interceptor) it.next());
                        }
                        return new OkHttpClient(builder3);
                    case 50:
                        singletonCImpl.f.getClass();
                        return new Pair(GoogleAdCustomTargeting.f11436a, new BaseShopAppModule$providesGoogleAdCustomTargetingScalarAdapter$1());
                    case 51:
                        singletonCImpl.f.getClass();
                        return new Pair(TealiumAnalytics.f11963a, new BaseShopAppModule$providesTealiumAnalyticsScalarAdapter$1());
                    case 52:
                        singletonCImpl.b.getClass();
                        return ApplicationType.e;
                    case 53:
                        BaseShopAppModule baseShopAppModule = singletonCImpl.f;
                        Application applicationA2 = Contexts.a(singletonCImpl.e.f23776a);
                        baseShopAppModule.getClass();
                        SharedPreferences sharedPreferences = applicationA2.getSharedPreferences("au.com.woolworths.base.shopapp", 0);
                        Intrinsics.g(sharedPreferences, "getSharedPreferences(...)");
                        ApolloClient apolloClient2 = (ApolloClient) singletonCImpl.C1.get();
                        singletonCImpl.f.getClass();
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gsonBuilder.e.add(new TypeAdapterFactory() { // from class: au.com.woolworths.base.shopapp.di.BaseShopAppModule$provideGson$1
                            @Override // com.google.gson.TypeAdapterFactory
                            public final TypeAdapter a(Gson gson4, TypeToken type) {
                                Intrinsics.h(type, "type");
                                return new CollectionModeTypeAdapter();
                            }
                        });
                        Gson gsonA = gsonBuilder.a();
                        FirebaseAnalyticsLogger firebaseAnalyticsLogger2 = (FirebaseAnalyticsLogger) singletonCImpl.V0.get();
                        FeatureToggleManager featureToggleManager2 = (FeatureToggleManager) singletonCImpl.P0.get();
                        Intrinsics.h(apolloClient2, "apolloClient");
                        Intrinsics.h(firebaseAnalyticsLogger2, "firebaseAnalyticsLogger");
                        Intrinsics.h(featureToggleManager2, "featureToggleManager");
                        return new CollectionModeRepository(sharedPreferences, apolloClient2, gsonA, firebaseAnalyticsLogger2, featureToggleManager2);
                    case 54:
                        Gson gson4 = (Gson) singletonCImpl.G0.get();
                        AppModule appModule3 = singletonCImpl.b;
                        Application applicationA3 = Contexts.a(singletonCImpl.e.f23776a);
                        BuildConfigInteractor buildConfigInteractor = (BuildConfigInteractor) singletonCImpl.G1.get();
                        appModule3.getClass();
                        Intrinsics.h(buildConfigInteractor, "buildConfigInteractor");
                        SharedPreferences sharedPreferences2 = applicationA3.getSharedPreferences("com.woolworths.pick_up_store_locator", 0);
                        Intrinsics.g(sharedPreferences2, "getSharedPreferences(...)");
                        return new PickUpLocatorRepository(gson4, sharedPreferences2, (ApiInterface) singletonCImpl.H1.get(), singletonCImpl.z1());
                    case 55:
                        singletonCImpl.K.getClass();
                        return new AppConfigModule$provideBuildConfigInteractor$1();
                    case 56:
                        au.com.woolworths.android.onesite.di.modules.NetworkModule networkModule = singletonCImpl.N;
                        AppConfig appConfig3 = (AppConfig) singletonCImpl.W0.get();
                        OkHttpClient okHttpClient5 = (OkHttpClient) singletonCImpl.f1.get();
                        SchedulersProvider schedulersProvider = (SchedulersProvider) singletonCImpl.o1.get();
                        Gson gson5 = (Gson) singletonCImpl.G0.get();
                        networkModule.getClass();
                        Intrinsics.h(appConfig3, "appConfig");
                        Intrinsics.h(okHttpClient5, "okHttpClient");
                        Intrinsics.h(schedulersProvider, "schedulersProvider");
                        Intrinsics.h(gson5, "gson");
                        Retrofit.Builder builder4 = new Retrofit.Builder();
                        builder4.b(appConfig3.getL());
                        builder4.f27005a = okHttpClient5;
                        builder4.c.add(new LoggingConverterFactory(GsonConverterFactory.c(gson5)));
                        builder4.a(RxJava2CallAdapterFactory.d(schedulersProvider.d()));
                        Object objB = builder4.c().b(ApiInterface.class);
                        Intrinsics.g(objB, "create(...)");
                        return (ApiInterface) objB;
                    case 57:
                        EditOrderModule editOrderModule = singletonCImpl.k;
                        DispatcherProvider dispatcherProvider2 = (DispatcherProvider) singletonCImpl.n1.get();
                        EditOrderRepository repository = (EditOrderRepository) singletonCImpl.K1.get();
                        LegacyShoppingModeRepository shoppingModeRepository = (LegacyShoppingModeRepository) singletonCImpl.E1.get();
                        CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) singletonCImpl.q1.get();
                        PickUpLocatorRepository pickUpLocatorRepository = (PickUpLocatorRepository) singletonCImpl.I1.get();
                        AccountInteractor accountInteractor = (AccountInteractor) singletonCImpl.v1.get();
                        editOrderModule.getClass();
                        Intrinsics.h(dispatcherProvider2, "dispatcherProvider");
                        Intrinsics.h(repository, "repository");
                        Intrinsics.h(shoppingModeRepository, "shoppingModeRepository");
                        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
                        Intrinsics.h(pickUpLocatorRepository, "pickUpLocatorRepository");
                        Intrinsics.h(accountInteractor, "accountInteractor");
                        return new EditOrderInteractorImpl(dispatcherProvider2, repository, shoppingModeRepository, collectionModeInteractor, pickUpLocatorRepository, accountInteractor);
                    case 58:
                        BaseDataModule baseDataModule = singletonCImpl.I;
                        Application applicationA4 = Contexts.a(singletonCImpl.e.f23776a);
                        baseDataModule.getClass();
                        return new EditOrderRepository(androidx.constraintlayout.core.state.a.b(applicationA4.getPackageName(), ".cmo", applicationA4, 0, "getSharedPreferences(...)"), (ApolloClient) singletonCImpl.C1.get());
                    case 59:
                        BaseShopAppModule baseShopAppModule2 = singletonCImpl.f;
                        BaseDataModule baseDataModule2 = singletonCImpl.I;
                        Application applicationA5 = Contexts.a(singletonCImpl.e.f23776a);
                        baseDataModule2.getClass();
                        SharedPreferences sharedPreferencesB = androidx.constraintlayout.core.state.a.b(applicationA5.getPackageName(), ".subscriptions.analyticsData", applicationA5, 0, "getSharedPreferences(...)");
                        Gson gson6 = (Gson) singletonCImpl.G0.get();
                        BaseShopAppModule baseShopAppModule3 = singletonCImpl.f;
                        ApolloClient apolloClient3 = (ApolloClient) singletonCImpl.C1.get();
                        baseShopAppModule3.getClass();
                        Intrinsics.h(apolloClient3, "apolloClient");
                        SubscriptionDataRepository subscriptionDataRepository = new SubscriptionDataRepository(apolloClient3);
                        baseShopAppModule2.getClass();
                        Intrinsics.h(gson6, "gson");
                        return new SubscriptionAnalyticsDataInteractor(subscriptionDataRepository, sharedPreferencesB, gson6);
                    case 60:
                        singletonCImpl.m.getClass();
                        return new WiFiStoreDetailsAnalyticsProvider();
                    case 61:
                        return new InstorePresenceAnalyticsProvider((WiFiStoreDetailsAnalyticsProvider) singletonCImpl.N1.get());
                    case 62:
                        RewardsAccountAppModule rewardsAccountAppModule = singletonCImpl.S;
                        RewardsAccountAppModule rewardsAccountAppModule2 = singletonCImpl.S;
                        ApplicationContextModule applicationContextModule = singletonCImpl.e;
                        BaseDataModule baseDataModule3 = singletonCImpl.I;
                        AppConfigurationInteractor appConfigurationInteractor = (AppConfigurationInteractor) singletonCImpl.P1.get();
                        Gson gsonProvideGson = RewardsAccountAppModule_ProvideGsonFactory.provideGson(rewardsAccountAppModule2);
                        Application applicationA6 = Contexts.a(applicationContextModule.f23776a);
                        baseDataModule3.getClass();
                        SharedPreferences sharedPreferencesB2 = androidx.constraintlayout.core.state.a.b(applicationA6.getPackageName(), ".rewards.account", applicationA6, 0, "getSharedPreferences(...)");
                        Application applicationA7 = Contexts.a(applicationContextModule.f23776a);
                        baseDataModule3.getClass();
                        String fileName = YU.a.g(applicationA7.getPackageName(), ".rewards.account.encrypted");
                        String strA = MasterKeys.a(MasterKeys.f3760a);
                        Intrinsics.g(strA, "getOrCreate(...)");
                        EncryptedSharedPreferences.PrefKeyEncryptionScheme prefKeyEncryptionScheme = EncryptedSharedPreferences.PrefKeyEncryptionScheme.e;
                        EncryptedSharedPreferences.PrefValueEncryptionScheme prefValueEncryptionScheme = EncryptedSharedPreferences.PrefValueEncryptionScheme.e;
                        Intrinsics.h(fileName, "fileName");
                        Intrinsics.h(prefKeyEncryptionScheme, "prefKeyEncryptionScheme");
                        Intrinsics.h(prefValueEncryptionScheme, "prefValueEncryptionScheme");
                        try {
                            KeyStore.getInstance(KeyStore.getDefaultType()).load(null);
                        } catch (KeyStoreException e) {
                            Bark.Companion companion = Bark.f8483a;
                            Bark.Barker.c(ReportOwner.Squad.d.a(), e, "SharedPreferences - KeyStore while loading", 8);
                        }
                        try {
                            encryptedSharedPreferencesA = EncryptedSharedPreferences.a(fileName, strA, applicationA7, prefKeyEncryptionScheme, prefValueEncryptionScheme);
                        } catch (IOException e2) {
                            Bark.Companion companion2 = Bark.f8483a;
                            Bark.Barker.c(ReportOwner.Squad.d.a(), e2, "SharedPreferences - IO while creating", 8);
                            SharedPreferences sharedPreferences3 = applicationA7.getSharedPreferences(fileName, 0);
                            Intrinsics.e(sharedPreferences3);
                            SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                            editorEdit.clear();
                            editorEdit.apply();
                            encryptedSharedPreferencesA = EncryptedSharedPreferences.a(fileName, strA, applicationA7, prefKeyEncryptionScheme, prefValueEncryptionScheme);
                            RewardsAccountRepository rewardsAccountRepository = new RewardsAccountRepository(gsonProvideGson, sharedPreferencesB2, encryptedSharedPreferencesA, RewardsAccountAppModule_ProvideRewardsAccountApiFactory.provideRewardsAccountApi(rewardsAccountAppModule2, (OkHttpClient) singletonCImpl.f1.get(), (AppConfig) singletonCImpl.W0.get(), (SchedulersProvider) singletonCImpl.o1.get(), RewardsAccountAppModule_ProvideGsonFactory.provideGson(rewardsAccountAppModule2)), (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (TealiumSelector) singletonCImpl.U1.get());
                            FeatureAccessListManager featureAccessListManager = (FeatureAccessListManager) singletonCImpl.V1.get();
                            DispatcherProvider dispatcherProvider3 = (DispatcherProvider) singletonCImpl.n1.get();
                            Application applicationA8 = Contexts.a(applicationContextModule.f23776a);
                            baseDataModule3.getClass();
                            return RewardsAccountAppModule_ProvideRewardsAccountInteractorFactory.provideRewardsAccountInteractor(rewardsAccountAppModule, appConfigurationInteractor, rewardsAccountRepository, featureAccessListManager, RewardsAccountAppModule_ProvideActivePaymentHandlerFactory.provideActivePaymentHandler(rewardsAccountAppModule2, dispatcherProvider3, androidx.constraintlayout.core.state.a.b(applicationA8.getPackageName(), ".rewards.wallet", applicationA8, 0, "getSharedPreferences(...)")), (CartInfoInteractor) singletonCImpl.W1.get(), (CartUpdateManager) singletonCImpl.X1.get(), (Tealium) singletonCImpl.X0.get(), singletonCImpl.e(), (FeatureToggleManager) singletonCImpl.P0.get());
                        } catch (KeyStoreException e3) {
                            Bark.Companion companion3 = Bark.f8483a;
                            Bark.Barker.c(ReportOwner.Squad.d.a(), e3, "SharedPreferences - KeyStore while creating", 8);
                            SharedPreferences sharedPreferences32 = applicationA7.getSharedPreferences(fileName, 0);
                            Intrinsics.e(sharedPreferences32);
                            SharedPreferences.Editor editorEdit2 = sharedPreferences32.edit();
                            editorEdit2.clear();
                            editorEdit2.apply();
                            encryptedSharedPreferencesA = EncryptedSharedPreferences.a(fileName, strA, applicationA7, prefKeyEncryptionScheme, prefValueEncryptionScheme);
                            RewardsAccountRepository rewardsAccountRepository2 = new RewardsAccountRepository(gsonProvideGson, sharedPreferencesB2, encryptedSharedPreferencesA, RewardsAccountAppModule_ProvideRewardsAccountApiFactory.provideRewardsAccountApi(rewardsAccountAppModule2, (OkHttpClient) singletonCImpl.f1.get(), (AppConfig) singletonCImpl.W0.get(), (SchedulersProvider) singletonCImpl.o1.get(), RewardsAccountAppModule_ProvideGsonFactory.provideGson(rewardsAccountAppModule2)), (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (TealiumSelector) singletonCImpl.U1.get());
                            FeatureAccessListManager featureAccessListManager2 = (FeatureAccessListManager) singletonCImpl.V1.get();
                            DispatcherProvider dispatcherProvider32 = (DispatcherProvider) singletonCImpl.n1.get();
                            Application applicationA82 = Contexts.a(applicationContextModule.f23776a);
                            baseDataModule3.getClass();
                            return RewardsAccountAppModule_ProvideRewardsAccountInteractorFactory.provideRewardsAccountInteractor(rewardsAccountAppModule, appConfigurationInteractor, rewardsAccountRepository2, featureAccessListManager2, RewardsAccountAppModule_ProvideActivePaymentHandlerFactory.provideActivePaymentHandler(rewardsAccountAppModule2, dispatcherProvider32, androidx.constraintlayout.core.state.a.b(applicationA82.getPackageName(), ".rewards.wallet", applicationA82, 0, "getSharedPreferences(...)")), (CartInfoInteractor) singletonCImpl.W1.get(), (CartUpdateManager) singletonCImpl.X1.get(), (Tealium) singletonCImpl.X0.get(), singletonCImpl.e(), (FeatureToggleManager) singletonCImpl.P0.get());
                        }
                        RewardsAccountRepository rewardsAccountRepository22 = new RewardsAccountRepository(gsonProvideGson, sharedPreferencesB2, encryptedSharedPreferencesA, RewardsAccountAppModule_ProvideRewardsAccountApiFactory.provideRewardsAccountApi(rewardsAccountAppModule2, (OkHttpClient) singletonCImpl.f1.get(), (AppConfig) singletonCImpl.W0.get(), (SchedulersProvider) singletonCImpl.o1.get(), RewardsAccountAppModule_ProvideGsonFactory.provideGson(rewardsAccountAppModule2)), (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (TealiumSelector) singletonCImpl.U1.get());
                        FeatureAccessListManager featureAccessListManager22 = (FeatureAccessListManager) singletonCImpl.V1.get();
                        DispatcherProvider dispatcherProvider322 = (DispatcherProvider) singletonCImpl.n1.get();
                        Application applicationA822 = Contexts.a(applicationContextModule.f23776a);
                        baseDataModule3.getClass();
                        return RewardsAccountAppModule_ProvideRewardsAccountInteractorFactory.provideRewardsAccountInteractor(rewardsAccountAppModule, appConfigurationInteractor, rewardsAccountRepository22, featureAccessListManager22, RewardsAccountAppModule_ProvideActivePaymentHandlerFactory.provideActivePaymentHandler(rewardsAccountAppModule2, dispatcherProvider322, androidx.constraintlayout.core.state.a.b(applicationA822.getPackageName(), ".rewards.wallet", applicationA822, 0, "getSharedPreferences(...)")), (CartInfoInteractor) singletonCImpl.W1.get(), (CartUpdateManager) singletonCImpl.X1.get(), (Tealium) singletonCImpl.X0.get(), singletonCImpl.e(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 63:
                        return new AppConfigurationInteractorImpl(singletonCImpl.y1());
                    case 64:
                        BaseNetworkModule baseNetworkModule6 = singletonCImpl.d;
                        OkHttpClient okHttpClient6 = (OkHttpClient) singletonCImpl.f1.get();
                        SseNetworkTransport networkTransport2 = (SseNetworkTransport) singletonCImpl.y1.get();
                        ImmutableSet apolloInterceptors2 = SingletonCImpl.d1(singletonCImpl);
                        AppConfig appConfig4 = (AppConfig) singletonCImpl.W0.get();
                        FeatureToggleManager featureToggleManager3 = (FeatureToggleManager) singletonCImpl.P0.get();
                        baseNetworkModule6.getClass();
                        Intrinsics.h(okHttpClient6, "okHttpClient");
                        Intrinsics.h(networkTransport2, "networkTransport");
                        Intrinsics.h(apolloInterceptors2, "apolloInterceptors");
                        Intrinsics.h(appConfig4, "appConfig");
                        Intrinsics.h(featureToggleManager3, "featureToggleManager");
                        OkHttpClient.Builder builderC2 = okHttpClient6.c();
                        builderC2.a(new GraphQlBaseUrlInterceptor(appConfig4, "rewards/graphql", new au.com.woolworths.android.onesite.analytics.a11y.a(4)));
                        OkHttpClient okHttpClient7 = new OkHttpClient(builderC2);
                        if (!featureToggleManager3.c(BaseFeature.f)) {
                            ApolloClient.Builder builder5 = new ApolloClient.Builder();
                            OkHttpExtensionsKt.a(builder5, okHttpClient7);
                            builder5.c(CollectionsKt.G0(apolloInterceptors2));
                            builder5.d(appConfig4.d() + "rewards/graphql");
                            return builder5.b();
                        }
                        ApolloClient.Builder builder6 = new ApolloClient.Builder();
                        builder6.n = DefaultHttpEngine.a(okHttpClient7);
                        builder6.l = networkTransport2;
                        builder6.c(CollectionsKt.G0(apolloInterceptors2));
                        builder6.d(appConfig4.d() + "rewards/graphql");
                        return builder6.b();
                    case 65:
                        Tealium tealiumDefault = (Tealium) singletonCImpl.X0.get();
                        ImmutableMap immutableMapM = ImmutableMap.m((Tealium) singletonCImpl.R1.get(), (Tealium) singletonCImpl.S1.get(), (Tealium) singletonCImpl.T1.get());
                        Intrinsics.h(tealiumDefault, "tealiumDefault");
                        return new TealiumSelectorImpl(tealiumDefault, immutableMapM);
                    case 66:
                        Tealium tealium2 = (Tealium) singletonCImpl.X0.get();
                        Intrinsics.h(tealium2, "tealium");
                        return tealium2;
                    case 67:
                        Tealium tealium3 = (Tealium) singletonCImpl.X0.get();
                        Intrinsics.h(tealium3, "tealium");
                        return tealium3;
                    case 68:
                        Application applicationA9 = Contexts.a(singletonCImpl.e.f23776a);
                        TealiumConfigData tealiumConfigData = TealiumNewZealandConfig.f4075a;
                        TealiumConfig tealiumConfig = new TealiumConfig(applicationA9, tealiumConfigData.b, tealiumConfigData.c, Environment.PROD, SetsKt.f(TagManagementDispatcher.i), null, 176);
                        tealiumConfig.e = tealiumConfigData.d;
                        tealiumConfig.o = tealiumConfigData.e;
                        LinkedHashMap linkedHashMap = Tealium.A;
                        String name = tealiumConfigData.f4074a;
                        au.com.woolworths.android.onesite.analytics.a11y.a aVar2 = new au.com.woolworths.android.onesite.analytics.a11y.a(2);
                        Intrinsics.h(name, "name");
                        Tealium tealium4 = new Tealium(tealiumConfig, aVar2);
                        Tealium.A.put(name, tealium4);
                        return tealium4;
                    case 69:
                        singletonCImpl.f.getClass();
                        return new BaseShopAppModule$provideFeatureAccessListManager$1();
                    case 70:
                        CartInfoModule cartInfoModule = singletonCImpl.T;
                        ApolloClient apolloClient4 = (ApolloClient) singletonCImpl.Q1.get();
                        cartInfoModule.getClass();
                        Intrinsics.h(apolloClient4, "apolloClient");
                        CartInfoRepositoryImpl cartInfoRepositoryImpl = new CartInfoRepositoryImpl(apolloClient4);
                        DispatcherProvider dispatcherProvider4 = (DispatcherProvider) singletonCImpl.n1.get();
                        Intrinsics.h(dispatcherProvider4, "dispatcherProvider");
                        return new CartInfoInteractorImpl(cartInfoRepositoryImpl, dispatcherProvider4);
                    case 71:
                        CartUpdateModule cartUpdateModule = singletonCImpl.U;
                        CartInfoInteractor cartInfoInteractor = (CartInfoInteractor) singletonCImpl.W1.get();
                        CartUpdateModule cartUpdateModule2 = singletonCImpl.U;
                        new CartQuantitiesRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.Q1.get());
                        Gson gson7 = (Gson) singletonCImpl.g1.get();
                        cartUpdateModule2.getClass();
                        Intrinsics.h(gson7, "gson");
                        Intrinsics.h(gson7, "gson");
                        CartUpdateManagerImpl cartUpdateManagerImpl = new CartUpdateManagerImpl(cartInfoInteractor, new CartQuantitiesInteractorImpl());
                        cartUpdateModule.getClass();
                        return cartUpdateManagerImpl;
                    case 72:
                        return new DeviceAccessibilityTrackerImpl(Contexts.a(singletonCImpl.e.f23776a));
                    case 73:
                        return AppModule_ProvidePaymentServicesInteractorFactory.a(singletonCImpl.b, SingletonCImpl.U0(singletonCImpl), (ShopAccountInteractor) singletonCImpl.Y0.get(), (SchedulersProvider) singletonCImpl.o1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (NetworkExceptions) singletonCImpl.m1.get(), (DigitalPaySdkHelper) singletonCImpl.d2.get());
                    case 74:
                        return LegacyDigipayModule_ProvideDigitalPaySdkHelper$ShopApp_releaseFactory.a(singletonCImpl.W, (SchedulersProvider) singletonCImpl.o1.get(), (ShopAppTokenAuthenticator) singletonCImpl.I0.get(), (PayClient) singletonCImpl.c2.get());
                    case 75:
                        return DigipaySdkAppModule_ProvideDigitalPayClientFactory.a(singletonCImpl.X, (Configuration) singletonCImpl.b2.get());
                    case 76:
                        return DigipaySdkAppModule_ProvideDigitalPayConfigurationFactory.a(singletonCImpl.X, ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c));
                    case 77:
                        AppModule appModule4 = singletonCImpl.b;
                        TrolleyInteractorImpl trolleyInteractor = (TrolleyInteractorImpl) singletonCImpl.g2.get();
                        appModule4.getClass();
                        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
                        return trolleyInteractor;
                    case 78:
                        return new TrolleyInteractorImpl((ApiInterface) singletonCImpl.H1.get(), (RewardsAccountInteractor) singletonCImpl.Y1.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (SchedulersProvider) singletonCImpl.o1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (AppBuildConfig) singletonCImpl.f2.get(), SingletonCImpl.T0(singletonCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), new TrolleyResultMapper(), (CollectionModeInteractor) singletonCImpl.q1.get());
                    case 79:
                        AppBuildConfigModule appBuildConfigModule = singletonCImpl.Z;
                        ReleaseSettingsInteractorImpl releaseSettingsInteractorImplA = ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c);
                        ShopAppRegionInteractor shopRegionInteractor = (ShopAppRegionInteractor) singletonCImpl.O0.get();
                        appBuildConfigModule.getClass();
                        Intrinsics.h(shopRegionInteractor, "shopRegionInteractor");
                        return new ShopAppBuildConfigManager(releaseSettingsInteractorImplA, shopRegionInteractor);
                    case 80:
                        ImmutableSet analyticsManagers = ImmutableSet.x((AnalyticsManager) singletonCImpl.k2.get(), (AnalyticsManager) singletonCImpl.m2.get(), (AnalyticsManager) singletonCImpl.q2.get());
                        Intrinsics.h(analyticsManagers, "analyticsManagers");
                        return new AnalyticsAggregator(analyticsManagers);
                    case 81:
                        AppModule appModule5 = singletonCImpl.b;
                        SwrveInteractor swrveInteractor = (SwrveInteractor) singletonCImpl.j2.get();
                        appModule5.getClass();
                        Intrinsics.h(swrveInteractor, "swrveInteractor");
                        return new ShopAppSwrveTrackingManager(swrveInteractor);
                    case 82:
                        MarketingAppModule marketingAppModule = singletonCImpl.a0;
                        Application applicationA10 = Contexts.a(singletonCImpl.e.f23776a);
                        AppConfig appConfig5 = (AppConfig) singletonCImpl.W0.get();
                        EmbeddedCampaignProcessor swrveEmbeddedCampaignProcessor = (EmbeddedCampaignProcessor) singletonCImpl.i2.get();
                        marketingAppModule.getClass();
                        Intrinsics.h(appConfig5, "appConfig");
                        Intrinsics.h(swrveEmbeddedCampaignProcessor, "swrveEmbeddedCampaignProcessor");
                        SwrveConfigData p = appConfig5.getP();
                        if (p != null) {
                            return new SwrveInteractor(p, applicationA10, swrveEmbeddedCampaignProcessor);
                        }
                        throw new IllegalArgumentException("SwrveConfigData is required for SwrveInteractor but null is provided");
                    case 83:
                        AppModule appModule6 = singletonCImpl.b;
                        Application applicationA11 = Contexts.a(singletonCImpl.e.f23776a);
                        appModule6.getClass();
                        return new EmbeddedCampaignProcessor(applicationA11);
                    case 84:
                        FirebaseAnalyticsManagerImpl firebaseAnalyticsManagerImpl = (FirebaseAnalyticsManagerImpl) singletonCImpl.l2.get();
                        Intrinsics.h(firebaseAnalyticsManagerImpl, "firebaseAnalyticsManagerImpl");
                        return firebaseAnalyticsManagerImpl;
                    case 85:
                        ImmutableSet persistentMetadataProviders = SingletonCImpl.i1(singletonCImpl);
                        FeatureToggleManager featureToggleManager4 = (FeatureToggleManager) singletonCImpl.P0.get();
                        ApplicationType appType = (ApplicationType) singletonCImpl.B1.get();
                        FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlyticsKt.a();
                        Intrinsics.h(persistentMetadataProviders, "persistentMetadataProviders");
                        Intrinsics.h(featureToggleManager4, "featureToggleManager");
                        Intrinsics.h(appType, "appType");
                        return new FirebaseAnalyticsManagerImpl(AnalyticsKt.a(), persistentMetadataProviders, featureToggleManager4, appType, firebaseCrashlyticsA);
                    case 86:
                        Lazy tealiumSelector = DoubleCheck.a(singletonCImpl.U1);
                        ImmutableSet persistentMetadataProviders2 = SingletonCImpl.i1(singletonCImpl);
                        DeviceAccessibilityTracker deviceAccessibilityTracker = (DeviceAccessibilityTracker) singletonCImpl.Z1.get();
                        TealiumEventLogRecorder tealiumEventLogRecorder = (TealiumEventLogRecorder) singletonCImpl.n2.get();
                        UserAttributionManager userAttributionManager = (UserAttributionManager) singletonCImpl.o2.get();
                        TealiumEventBundleManager tealiumEventBundleManager = (TealiumEventBundleManager) singletonCImpl.p2.get();
                        FeatureToggleManager featureToggleManager5 = (FeatureToggleManager) singletonCImpl.P0.get();
                        AppConfig appConfig6 = (AppConfig) singletonCImpl.W0.get();
                        Intrinsics.h(tealiumSelector, "tealiumSelector");
                        Intrinsics.h(persistentMetadataProviders2, "persistentMetadataProviders");
                        Intrinsics.h(deviceAccessibilityTracker, "deviceAccessibilityTracker");
                        Intrinsics.h(tealiumEventLogRecorder, "tealiumEventLogRecorder");
                        Intrinsics.h(userAttributionManager, "userAttributionManager");
                        Intrinsics.h(tealiumEventBundleManager, "tealiumEventBundleManager");
                        Intrinsics.h(featureToggleManager5, "featureToggleManager");
                        Intrinsics.h(appConfig6, "appConfig");
                        if (!TealiumConfigDataKt.a(appConfig6.c())) {
                            return new NoOpAnalyticsManager();
                        }
                        Object obj = tealiumSelector.get();
                        Intrinsics.g(obj, "get(...)");
                        return new TealiumAnalyticsManagerImpl((TealiumSelector) obj, persistentMetadataProviders2, deviceAccessibilityTracker, tealiumEventLogRecorder, userAttributionManager, tealiumEventBundleManager, featureToggleManager5);
                    case 87:
                        return NoOpTealiumEventLogRecorder.f4072a;
                    case 88:
                        return new UserAttributionManagerImpl();
                    case 89:
                        return AppModule_ProvideTealiumEventBundleManagerFactory.a(singletonCImpl.b);
                    case 90:
                        NavigationModule navigationModule = singletonCImpl.b0;
                        Application applicationA12 = Contexts.a(singletonCImpl.e.f23776a);
                        navigationModule.getClass();
                        return new RealLinkNavigator(applicationA12);
                    case 91:
                        AppConfig appConfig7 = (AppConfig) singletonCImpl.W0.get();
                        Application applicationA13 = Contexts.a(singletonCImpl.e.f23776a);
                        Intrinsics.h(appConfig7, "appConfig");
                        return new MedalliaInteractor(appConfig7, applicationA13);
                    case 92:
                        ScanNGoModule scanNGoModule2 = singletonCImpl.O;
                        Context context2 = (Context) singletonCImpl.k1.get();
                        singletonCImpl.O.getClass();
                        return ScanNGoModule_ProvideAggregatedAnalyticsFactory.a(scanNGoModule2, context2);
                    case 93:
                        AppModule appModule7 = singletonCImpl.b;
                        DeviceAccessibilityTracker deviceA11yTracker = (DeviceAccessibilityTracker) singletonCImpl.Z1.get();
                        AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
                        appModule7.getClass();
                        Intrinsics.h(deviceA11yTracker, "deviceA11yTracker");
                        Intrinsics.h(analyticsManager, "analyticsManager");
                        return new AccessibilityAnalytics(deviceA11yTracker, analyticsManager);
                    case 94:
                        ShopListsDataAppModule shopListsDataAppModule = singletonCImpl.c0;
                        ShoppingListsSyncWorkerFactory appWorkerFactory = (ShoppingListsSyncWorkerFactory) singletonCImpl.H2.get();
                        shopListsDataAppModule.getClass();
                        Intrinsics.h(appWorkerFactory, "appWorkerFactory");
                        Configuration.Builder builder7 = new Configuration.Builder();
                        builder7.f3892a = appWorkerFactory;
                        return new androidx.work.Configuration(builder7);
                    case 95:
                        ShopListsDataAppModule shopListsDataAppModule2 = singletonCImpl.c0;
                        ShoppingListLocalRepository listLocalRepository = (ShoppingListLocalRepository) singletonCImpl.A2.get();
                        ShoppingListItemsLocalRepository listItemsLocalRepository = (ShoppingListItemsLocalRepository) singletonCImpl.z2.get();
                        ShoppingListRemoteRepository listRemoteRepository = (ShoppingListRemoteRepository) singletonCImpl.F2.get();
                        ShoppingListsRepository listsRepository = (ShoppingListsRepository) singletonCImpl.B2.get();
                        ShoppingListItemsSyncInteractor listItemsSyncInteractor = (ShoppingListItemsSyncInteractor) singletonCImpl.G2.get();
                        FeatureToggleManager featureToggleManager6 = (FeatureToggleManager) singletonCImpl.P0.get();
                        shopListsDataAppModule2.getClass();
                        Intrinsics.h(listLocalRepository, "listLocalRepository");
                        Intrinsics.h(listItemsLocalRepository, "listItemsLocalRepository");
                        Intrinsics.h(listRemoteRepository, "listRemoteRepository");
                        Intrinsics.h(listsRepository, "listsRepository");
                        Intrinsics.h(listItemsSyncInteractor, "listItemsSyncInteractor");
                        Intrinsics.h(featureToggleManager6, "featureToggleManager");
                        return new ShoppingListsSyncWorkerFactory(listLocalRepository, listItemsLocalRepository, listRemoteRepository, listsRepository, listItemsSyncInteractor, featureToggleManager6);
                    case 96:
                        ShopListsDataAppModule shopListsDataAppModule3 = singletonCImpl.c0;
                        ShoppingListRoomDatabase database = (ShoppingListRoomDatabase) singletonCImpl.w2.get();
                        ShoppingListItemsLocalRepository listItemsLocalRepository2 = (ShoppingListItemsLocalRepository) singletonCImpl.z2.get();
                        DispatcherProvider dispatcherProvider5 = (DispatcherProvider) singletonCImpl.n1.get();
                        shopListsDataAppModule3.getClass();
                        Intrinsics.h(database, "database");
                        Intrinsics.h(listItemsLocalRepository2, "listItemsLocalRepository");
                        Intrinsics.h(dispatcherProvider5, "dispatcherProvider");
                        return new ShoppingListLocalRepository(database, database.w(), listItemsLocalRepository2, dispatcherProvider5);
                    case 97:
                        ShopListsDataAppModule shopListsDataAppModule4 = singletonCImpl.c0;
                        Application applicationA14 = Contexts.a(singletonCImpl.e.f23776a);
                        shopListsDataAppModule4.getClass();
                        List listO = Reflection.f24268a.b(ShoppingListDbMigration.class).o();
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(listO, 10));
                        Iterator<T> it2 = listO.iterator();
                        while (it2.hasNext()) {
                            Object objY = ((KClass) it2.next()).y();
                            Intrinsics.f(objY, "null cannot be cast to non-null type au.com.woolworths.shop.lists.data.di.ShoppingListDbMigration");
                            arrayList.add((ShoppingListDbMigration) objY);
                        }
                        ShoppingListDbMigration[] shoppingListDbMigrationArr = (ShoppingListDbMigration[]) arrayList.toArray(new ShoppingListDbMigration[0]);
                        Context applicationContext = applicationA14.getApplicationContext();
                        Intrinsics.g(applicationContext, "getApplicationContext(...)");
                        RoomDatabase.Builder builderA = Room.a(applicationContext, ShoppingListRoomDatabase.class, "shopping_list.db");
                        builderA.l = false;
                        builderA.m = true;
                        builderA.a((Migration[]) Arrays.copyOf(shoppingListDbMigrationArr, shoppingListDbMigrationArr.length));
                        return (ShoppingListRoomDatabase) builderA.b();
                    case 98:
                        ShopListsDataAppModule shopListsDataAppModule5 = singletonCImpl.c0;
                        ShoppingListItemsLocalRepositoryWithSoftDeletion decoratorRepo = (ShoppingListItemsLocalRepositoryWithSoftDeletion) singletonCImpl.y2.get();
                        shopListsDataAppModule5.getClass();
                        Intrinsics.h(decoratorRepo, "decoratorRepo");
                        return decoratorRepo;
                    case 99:
                        ShopListsDataAppModule shopListsDataAppModule6 = singletonCImpl.c0;
                        ShoppingListItemsLocalRepositoryImpl wrappedRepo = (ShoppingListItemsLocalRepositoryImpl) singletonCImpl.x2.get();
                        shopListsDataAppModule6.getClass();
                        Intrinsics.h(wrappedRepo, "wrappedRepo");
                        return new ShoppingListItemsLocalRepositoryWithSoftDeletion(wrappedRepo);
                    default:
                        throw new AssertionError(i);
                }
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i = this.b;
                int i2 = i / 100;
                if (i2 == 0) {
                    return a();
                }
                SingletonCImpl singletonCImpl = this.f4160a;
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new AssertionError(i);
                    }
                    switch (i) {
                        case 200:
                            return InstoreCartAppModule_ProvideInstoreCartRepositoryFactory.a(singletonCImpl.t0, (ApolloClient) singletonCImpl.C1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                        case 201:
                            return InstoreNavigationAppModule_ProvideTrackingInteractorFactory.a(singletonCImpl.n);
                        case DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER /* 202 */:
                            return ShopListsAppModule_ProvideListDetailsInteractor$shop_lists_releaseFactory.a(singletonCImpl.B, new ListDetailsRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get()));
                        case DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER /* 203 */:
                            return ShopListsAppModule_ProvideProductItemStateFactory.a(singletonCImpl.B, (TrolleyInteractor) singletonCImpl.h2.get(), (ListsInMemoryRepository) singletonCImpl.E2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                        case 204:
                            return new ShoppingModeInteractor((CollectionModeInteractor) singletonCImpl.q1.get(), SingletonCImpl.p1(singletonCImpl), (LocationInteractor) singletonCImpl.D3.get(), (ShopAccountInteractor) singletonCImpl.Y0.get());
                        case 205:
                            return NotificationModule_ProvideNotificationManagerFactory.a(singletonCImpl.u0, (ApiService) singletonCImpl.V3.get());
                        case 206:
                            return RewardsOnboardingAppModule_ProvideOnboardingManagerFactory.a(singletonCImpl.v0, Contexts.a(singletonCImpl.e.f23776a), (DispatcherProvider) singletonCImpl.n1.get());
                        case 207:
                            return ShopListsDataAppModule_ProvidePastShopInteractorFactory.a(singletonCImpl.c0, (PurchaseHistoryRepository) singletonCImpl.F4.get());
                        case 208:
                            return ShopListsDataAppModule_ProvidePurchaseHistoryRepositoryFactory.a(singletonCImpl.c0, (ApolloClient) singletonCImpl.C1.get());
                        case 209:
                            return ShopListsAppModule_ProvideApigeeXApiFactory.a(singletonCImpl.B, (AppConfig) singletonCImpl.W0.get(), (OkHttpClient) singletonCImpl.I4.get(), (Gson) singletonCImpl.J4.get());
                        case 210:
                            NetworkModule networkModule = singletonCImpl.x0;
                            Cache cache = (Cache) singletonCImpl.H0.get();
                            AppModule appModule = singletonCImpl.b;
                            ShopAuthenticator authenticator = (ShopAuthenticator) singletonCImpl.S0.get();
                            appModule.getClass();
                            Intrinsics.h(authenticator, "authenticator");
                            return NetworkModule_ProvideApigeeXOkHttpClientFactory.a(networkModule, cache, authenticator, (ApigeeXHttpInterceptor) singletonCImpl.H4.get(), NetworkModule_CurlLoggingInterceptorFactory.a(singletonCImpl.x0));
                        case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                            return NetworkModule_ProvidesApigeeXHttpInterceptorFactory.a(singletonCImpl.x0, Contexts.a(singletonCImpl.e.f23776a), (ConnectionManager) singletonCImpl.L0.get(), (Auth0AuthManager) singletonCImpl.l1.get(), (ShopAccountInteractor) singletonCImpl.Y0.get());
                        case 212:
                            return ShopListsAppModule_ProvideApigeeXGsonFactory.a(singletonCImpl.B);
                        case 213:
                            return ProductAvailabilityModule_ProvideProductAvailabilityInteractorFactory.a(singletonCImpl.y0, new ProductAvailabilityRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.C1.get()));
                        case 214:
                            return RewardsOffersAppModule_ProvideRewardsOfferRepositoryFactory.a(singletonCImpl.x, (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), new ShopAppInstallationInteractor(Contexts.a(singletonCImpl.e.f23776a)), (RewardsOffersEventRouter) singletonCImpl.M4.get(), (AppIdentifier) singletonCImpl.Q3.get(), (RewardsAccountInteractor) singletonCImpl.Y1.get());
                        case 215:
                            return RewardsOffersAppModule_ProvideOffersEventRouterFactory.a(singletonCImpl.x);
                        case 216:
                            return BaseRewardsAppModule_ProvideRefreshNotifierFactory.a(singletonCImpl.g, (DispatcherProvider) singletonCImpl.n1.get());
                        case 217:
                            return RecipeDetailsAppModule_ProvideRecipeDetailsInteractorFactory.a(singletonCImpl.z0, new RecipeDetailsRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1()), (CollectionModeInteractor) singletonCImpl.q1.get(), (GoogleAdManagerInteractor) singletonCImpl.m4.get());
                        case 218:
                            return RemoteDismissibleBannerModule_ProvideBannerRemoteDismissInteractorFactory.a(singletonCImpl.A0, new BannerRemoteDismissRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.Q1.get()));
                        case 219:
                            return RewardsOffersAppModule_ProvideRewardsHomeOfferRepositoryFactory.a(singletonCImpl.x, (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), new ShopAppInstallationInteractor(Contexts.a(singletonCImpl.e.f23776a)), (AppIdentifier) singletonCImpl.Q3.get(), (RewardsAccountInteractor) singletonCImpl.Y1.get());
                        case 220:
                            return BaseRewardsAppModule_ProvideDeepLinkInteractorFactory.a(singletonCImpl.g);
                        case 221:
                            return BaseRewardsAppModule_ProvideHomeRefreshInteractorFactory.a(singletonCImpl.g, (DispatcherProvider) singletonCImpl.n1.get());
                        case 222:
                            return BaseRewardsAppModule_ProvideRewardsPageScrollInteractorFactory.a(singletonCImpl.g);
                        case 223:
                            return RewardsPreferencesAppModule_ProvideRewardsPreferenceDetailsRepositoryFactory.a(singletonCImpl.y, (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get());
                        case BERTags.FLAGS /* 224 */:
                            return RewardsAccountAppModule_ProvideRewardsActivityInteractorFactory.provideRewardsActivityInteractor(singletonCImpl.S);
                        case 225:
                            return RewardsAccountAppModule_ProvideRedemptionSettingRepositoryFactory.provideRedemptionSettingRepository(singletonCImpl.S);
                        case 226:
                            return ShippingCalculatorAppModule_ProvidesShippingCalculatorInteractorFactory.a(singletonCImpl.B0, new ShippingCalculatorRepository((ApolloClient) singletonCImpl.C1.get()));
                        case 227:
                            AppModule appModule2 = singletonCImpl.b;
                            TrolleyInteractorImpl trolleyInteractor = (TrolleyInteractorImpl) singletonCImpl.g2.get();
                            appModule2.getClass();
                            Intrinsics.h(trolleyInteractor, "trolleyInteractor");
                            CollectionModeInteractorImpl collectionModeInteractorImpl = (CollectionModeInteractorImpl) singletonCImpl.J1.get();
                            Intrinsics.h(collectionModeInteractorImpl, "collectionModeInteractorImpl");
                            ShoppingModeInteractor shoppingModeInteractor = (ShoppingModeInteractor) singletonCImpl.C4.get();
                            Intrinsics.h(shoppingModeInteractor, "shoppingModeInteractor");
                            ImmutableSet services = ImmutableSet.x(trolleyInteractor, collectionModeInteractorImpl, shoppingModeInteractor);
                            DispatcherProvider dispatcherProvider = (DispatcherProvider) singletonCImpl.n1.get();
                            Intrinsics.h(services, "services");
                            Intrinsics.h(dispatcherProvider, "dispatcherProvider");
                            return new PreLoaderService(services, dispatcherProvider);
                        case 228:
                            return ShopListsDataAppModule_ProvideSuggestedListsRepositoryFactory.a(singletonCImpl.c0, (ApolloClient) singletonCImpl.C1.get());
                        case 229:
                            RewardsCardAppModule rewardsCardAppModule = singletonCImpl.w;
                            return RewardsCardAppModule_ProvideUnlockChristmasFundsInteractorFactory.a(rewardsCardAppModule, RewardsCardAppModule_ProvideUnlockChristmasFundsRepositoryFactory.a(rewardsCardAppModule, (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get()));
                        case 230:
                            return ShopListsDataAppModule_ProvideSimilarProductsInteractorFactory.a(singletonCImpl.c0, (CollectionModeInteractor) singletonCImpl.q1.get(), (SimilarProductsRepository) singletonCImpl.c5.get());
                        case 231:
                            return ShopListsDataAppModule_ProvideSimilarProductsRepositoryFactory.a(singletonCImpl.c0, (ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                        case 232:
                            return new BundlesInteractorImpl(new BundlesRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get()));
                        case 233:
                            return ShopListsAppModule_ProvideMagicMatchInteractor$shop_lists_releaseFactory.a(singletonCImpl.B, (MagicMatchRepository) singletonCImpl.f5.get());
                        case 234:
                            return ShopListsAppModule_ProvideMagicMatchRepository$shop_lists_releaseFactory.a(singletonCImpl.B, (ApolloClient) singletonCImpl.C1.get(), (RepositoryManager) singletonCImpl.t1.get(), (CollectionModeInteractor) singletonCImpl.q1.get());
                        default:
                            throw new AssertionError(i);
                    }
                }
                switch (i) {
                    case 100:
                        ShopListsDataAppModule shopListsDataAppModule = singletonCImpl.c0;
                        ShoppingListRoomDatabase database = (ShoppingListRoomDatabase) singletonCImpl.w2.get();
                        DispatcherProvider dispatcherProvider2 = (DispatcherProvider) singletonCImpl.n1.get();
                        shopListsDataAppModule.getClass();
                        Intrinsics.h(database, "database");
                        Intrinsics.h(dispatcherProvider2, "dispatcherProvider");
                        return new ShoppingListItemsLocalRepositoryImpl(database, database.v(), database.x(), database.u(), database.t(), dispatcherProvider2);
                    case 101:
                        ShopListsDataAppModule shopListsDataAppModule2 = singletonCImpl.c0;
                        ApolloClient apolloClient = (ApolloClient) singletonCImpl.C1.get();
                        ProductsInteractor productsInteractorZ0 = SingletonCImpl.Z0(singletonCImpl);
                        ListsInMemoryRepository listsInMemoryRepository = (ListsInMemoryRepository) singletonCImpl.E2.get();
                        FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
                        shopListsDataAppModule2.getClass();
                        Intrinsics.h(apolloClient, "apolloClient");
                        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
                        Intrinsics.h(featureToggleManager, "featureToggleManager");
                        return new ShoppingListRemoteRepository(apolloClient, productsInteractorZ0, listsInMemoryRepository, featureToggleManager);
                    case 102:
                        ShopListsDataAppModule shopListsDataAppModule3 = singletonCImpl.c0;
                        CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) singletonCImpl.q1.get();
                        RepositoryManager repositoryManager = (RepositoryManager) singletonCImpl.t1.get();
                        ShoppingListsRepository shoppingListsRepository = (ShoppingListsRepository) singletonCImpl.B2.get();
                        CartUpdateInteractor cartUpdateInteractor = (CartUpdateInteractor) singletonCImpl.D2.get();
                        shopListsDataAppModule3.getClass();
                        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
                        Intrinsics.h(repositoryManager, "repositoryManager");
                        Intrinsics.h(shoppingListsRepository, "shoppingListsRepository");
                        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
                        return new ListsInMemoryRepository(collectionModeInteractor, repositoryManager, shoppingListsRepository, cartUpdateInteractor);
                    case 103:
                        ShopListsDataAppModule shopListsDataAppModule4 = singletonCImpl.c0;
                        BaseDataModule baseDataModule = singletonCImpl.I;
                        Application applicationA = Contexts.a(singletonCImpl.e.f23776a);
                        baseDataModule.getClass();
                        SharedPreferences sharedPreferencesB = androidx.constraintlayout.core.state.a.b(applicationA.getPackageName(), ".lists", applicationA, 0, "getSharedPreferences(...)");
                        shopListsDataAppModule4.getClass();
                        return new ShoppingListsRepository(sharedPreferencesB);
                    case 104:
                        return new CartUpdateInteractor((DispatcherProvider) singletonCImpl.n1.get(), (TrolleyInteractor) singletonCImpl.h2.get(), (ProductBoostInteractor) singletonCImpl.C2.get(), SingletonCImpl.T0(singletonCImpl), (ShopAccountInteractor) singletonCImpl.Y0.get());
                    case 105:
                        ProductAppModule productAppModule = singletonCImpl.s;
                        ProductBoostRepository productBoostRepository = new ProductBoostRepository((ApolloClient) singletonCImpl.C1.get());
                        DispatcherProvider dispatchers = (DispatcherProvider) singletonCImpl.n1.get();
                        productAppModule.getClass();
                        Intrinsics.h(dispatchers, "dispatchers");
                        return new ProductBoostInteractor(productBoostRepository, dispatchers);
                    case 106:
                        ShopListsDataAppModule shopListsDataAppModule5 = singletonCImpl.c0;
                        ShoppingListLocalRepository listLocalRepository = (ShoppingListLocalRepository) singletonCImpl.A2.get();
                        ShoppingListItemsLocalRepository listItemsLocalRepository = (ShoppingListItemsLocalRepository) singletonCImpl.z2.get();
                        ShoppingListRemoteRepository listRemoteRepository = (ShoppingListRemoteRepository) singletonCImpl.F2.get();
                        shopListsDataAppModule5.getClass();
                        Intrinsics.h(listLocalRepository, "listLocalRepository");
                        Intrinsics.h(listItemsLocalRepository, "listItemsLocalRepository");
                        Intrinsics.h(listRemoteRepository, "listRemoteRepository");
                        return new ShoppingListItemsSyncInteractor(listLocalRepository, listItemsLocalRepository, listRemoteRepository);
                    case 107:
                        ShopListsDataAppModule shopListsDataAppModule6 = singletonCImpl.c0;
                        SyncScheduler syncScheduler = (SyncScheduler) singletonCImpl.K2.get();
                        ShoppingListLocalRepository listLocalRepository2 = (ShoppingListLocalRepository) singletonCImpl.A2.get();
                        ShoppingListItemsSyncInteractor listItemsSyncInteractor = (ShoppingListItemsSyncInteractor) singletonCImpl.G2.get();
                        ShoppingListRoomDatabase database2 = (ShoppingListRoomDatabase) singletonCImpl.w2.get();
                        CollectionModeInteractor collectionModeInteractor2 = (CollectionModeInteractor) singletonCImpl.q1.get();
                        ShopAccountInteractor accountInteractor = (ShopAccountInteractor) singletonCImpl.Y0.get();
                        DispatcherProvider dispatcherProvider3 = (DispatcherProvider) singletonCImpl.n1.get();
                        Application applicationA2 = Contexts.a(singletonCImpl.e.f23776a);
                        ConnectionManager connectionManager = (ConnectionManager) singletonCImpl.L0.get();
                        ShopAppRegionInteractor shopAppRegionInteractor = (ShopAppRegionInteractor) singletonCImpl.O0.get();
                        shopListsDataAppModule6.getClass();
                        Intrinsics.h(syncScheduler, "syncScheduler");
                        Intrinsics.h(listLocalRepository2, "listLocalRepository");
                        Intrinsics.h(listItemsSyncInteractor, "listItemsSyncInteractor");
                        Intrinsics.h(database2, "database");
                        Intrinsics.h(collectionModeInteractor2, "collectionModeInteractor");
                        Intrinsics.h(accountInteractor, "accountInteractor");
                        Intrinsics.h(dispatcherProvider3, "dispatcherProvider");
                        Intrinsics.h(connectionManager, "connectionManager");
                        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
                        ShoppingListDao shoppingListDaoW = database2.w();
                        ProductListItemDao productListItemDaoV = database2.v();
                        TextListItemDao textListItemDaoX = database2.x();
                        ProductDao productDaoU = database2.u();
                        CategoryDao categoryDaoT = database2.t();
                        String string = applicationA2.getString(com.woolworths.R.string.list_default_name);
                        Intrinsics.g(string, "getString(...)");
                        return new ShoppingListSyncInteractor(syncScheduler, listLocalRepository2, listItemsSyncInteractor, database2, shoppingListDaoW, productListItemDaoV, textListItemDaoX, productDaoU, categoryDaoT, collectionModeInteractor2, accountInteractor, dispatcherProvider3, string, connectionManager, shopAppRegionInteractor);
                    case 108:
                        ShopListsDataAppModule shopListsDataAppModule7 = singletonCImpl.c0;
                        Context context = (Context) singletonCImpl.k1.get();
                        ShoppingListSyncRepository syncRepository = (ShoppingListSyncRepository) singletonCImpl.J2.get();
                        ShoppingListsRepository listsRepository = (ShoppingListsRepository) singletonCImpl.B2.get();
                        ConnectionManager connectionManager2 = (ConnectionManager) singletonCImpl.L0.get();
                        shopListsDataAppModule7.getClass();
                        Intrinsics.h(context, "context");
                        Intrinsics.h(syncRepository, "syncRepository");
                        Intrinsics.h(listsRepository, "listsRepository");
                        Intrinsics.h(connectionManager2, "connectionManager");
                        return new SyncScheduler(context, syncRepository, listsRepository, connectionManager2);
                    case 109:
                        ShopListsDataAppModule shopListsDataAppModule8 = singletonCImpl.c0;
                        Context context2 = (Context) singletonCImpl.k1.get();
                        shopListsDataAppModule8.getClass();
                        Intrinsics.h(context2, "context");
                        return new ShoppingListSyncRepository(context2);
                    case 110:
                        AppModule appModule3 = singletonCImpl.b;
                        Application applicationA3 = Contexts.a(singletonCImpl.e.f23776a);
                        ShopAccountInteractor accountInteractor2 = (ShopAccountInteractor) singletonCImpl.Y0.get();
                        DispatcherProvider dispatcherProvider4 = (DispatcherProvider) singletonCImpl.n1.get();
                        AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
                        singletonCImpl.b.getClass();
                        singletonCImpl.c.getClass();
                        appModule3.getClass();
                        Intrinsics.h(accountInteractor2, "accountInteractor");
                        Intrinsics.h(dispatcherProvider4, "dispatcherProvider");
                        Intrinsics.h(analyticsManager, "analyticsManager");
                        Context applicationContext = applicationA3.getApplicationContext();
                        Intrinsics.g(applicationContext, "getApplicationContext(...)");
                        return new InStoreWifiInteractorImpl(applicationContext, accountInteractor2, dispatcherProvider4, analyticsManager);
                    case 111:
                        InStoreWifiAppModule inStoreWifiAppModule = singletonCImpl.m;
                        WiFiStoreDetailsAnalyticsProvider analyticsProvider = (WiFiStoreDetailsAnalyticsProvider) singletonCImpl.N1.get();
                        DispatcherProvider dispatcherProvider5 = (DispatcherProvider) singletonCImpl.n1.get();
                        FeatureToggleManager featureToggleManager2 = (FeatureToggleManager) singletonCImpl.P0.get();
                        InStoreWifiInteractor interactor = (InStoreWifiInteractor) singletonCImpl.M2.get();
                        inStoreWifiAppModule.getClass();
                        Intrinsics.h(analyticsProvider, "analyticsProvider");
                        Intrinsics.h(dispatcherProvider5, "dispatcherProvider");
                        Intrinsics.h(featureToggleManager2, "featureToggleManager");
                        Intrinsics.h(interactor, "interactor");
                        return new InStoreWiFiNotificationHelper(interactor, analyticsProvider, featureToggleManager2, dispatcherProvider5);
                    case 112:
                        ScanNGoModule scanNGoModule = singletonCImpl.O;
                        ScanNGoModule scanNGoModule2 = singletonCImpl.O;
                        DefaultLocalTokenProvider defaultLocalTokenProviderU1 = singletonCImpl.u1();
                        SignInUC signInUCA = ScanNGoModule_ProvidesSignInUseCaseFactory.a(singletonCImpl.O, (FirebaseApp) singletonCImpl.O2.get(), singletonCImpl.x1(), singletonCImpl.u1(), singletonCImpl.s1(), singletonCImpl.t1(), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule2), (DeviceInfoProvider) singletonCImpl.T2.get(), (UserConfigurations) singletonCImpl.V2.get(), (SurveyManager) singletonCImpl.W2.get());
                        DefaultLocalTokenProvider defaultLocalTokenProviderU12 = singletonCImpl.u1();
                        DeviceInfoProvider deviceInfoProvider = (DeviceInfoProvider) singletonCImpl.T2.get();
                        String strW1 = singletonCImpl.w1();
                        scanNGoModule2.getClass();
                        return ScanNGoModule_ProvideUserManagerFactory.a(scanNGoModule, defaultLocalTokenProviderU1, signInUCA, ScanNGoModule_ProvidesRewardSignInInitUseCaseFactory.a(scanNGoModule2, defaultLocalTokenProviderU12, deviceInfoProvider, ScanNGoModule_GetRewardPreAuthServiceFactory.a(scanNGoModule2, strW1, ScanNGoModule_CreateHttpPartnerPreAuthClientFactory.a(scanNGoModule2, ScanNGoModule_CreateBaseHttpClientFactory.a(scanNGoModule2), ScanNGoModule_GetRewardPreAuthAPIKeyInterceptorFactory.a(scanNGoModule2, (ScanAndGoConfig) singletonCImpl.P2.get()))), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule2)), singletonCImpl.s1(), new UserComponentBuilder(singletonCImpl), (DigitalPayProvider) singletonCImpl.R2.get(), FirebaseCrashlyticsKt.a());
                    case 113:
                        return AppModule_ProvideFirebaseAppFactory.a(singletonCImpl.b);
                    case 114:
                        return AppConfigModule_ProvideScanAndGoConfigFactory.a(singletonCImpl.K, ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c));
                    case 115:
                        return ScanNGoModule_GetTokenAuthenticatorFactory.a(singletonCImpl.O, singletonCImpl.B1());
                    case 116:
                        return ScanNGoModule_ProvideDigitalPayConfigurationProviderFactory.a(singletonCImpl.O, (PayClient) singletonCImpl.Q2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 117:
                        ScanNGoModule scanNGoModule3 = singletonCImpl.O;
                        scanNGoModule3.getClass();
                        return ScanNGoModule_ProvideDigitalPayClientFactory.a(scanNGoModule3, (ScanAndGoConfig) singletonCImpl.P2.get());
                    case 118:
                        return ScanNGoModule_ProvideDeviceInfoProviderFactory.a(singletonCImpl.O, (Context) singletonCImpl.k1.get(), (SharedPreferences) singletonCImpl.s1.get(), (ScanAndGoFeatureConfig) singletonCImpl.S2.get());
                    case 119:
                        return AppModule_ProvideScanAndGoFeatureConfigFactory.a(singletonCImpl.b);
                    case 120:
                        return ScanNGoModule_ProvidesUserConfigurationFactory.a(singletonCImpl.O, (SharedPreferences) singletonCImpl.s1.get());
                    case 121:
                        return ScanNGoModule_ProvideSurveyManagerFactory.a(singletonCImpl.O);
                    case 122:
                        return ViewModelModule_ProvideExitScanCodeViewModelFactory.a(singletonCImpl.d0, (UserManager) singletonCImpl.X2.get(), (AnalyticsManager) singletonCImpl.r2.get(), SingletonCImpl.a1(singletonCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), FirebaseCrashlyticsKt.a());
                    case 123:
                        return ViewModelModule_ProvideSearchViewModelFactory.a(singletonCImpl.d0, (UserManager) singletonCImpl.X2.get(), (AnalyticsProvider) singletonCImpl.u2.get(), SingletonCImpl.a1(singletonCImpl));
                    case 124:
                        ViewModelModule viewModelModule = singletonCImpl.d0;
                        ScanNGoModule scanNGoModule4 = singletonCImpl.O;
                        return ViewModelModule_ProvideAvailableStoreViewModelFactory.a(viewModelModule, ScanNGoModule_ProvidesGetAvailableStoresUCFactory.a(scanNGoModule4, singletonCImpl.x1(), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule4)), (AnalyticsManager) singletonCImpl.r2.get(), SingletonCImpl.a1(singletonCImpl), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 125:
                        return ViewModelModule_ProvideSngEntryViewModelFactory.a(singletonCImpl.d0, (RewardsAccountInteractor) singletonCImpl.Y1.get(), (UserConfigurations) singletonCImpl.V2.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (DeviceFingerprintInteractor) singletonCImpl.b3.get());
                    case 126:
                        return DeviceFingerprintAppModule_ProvideDeviceFingerprintInteractorFactory.a(singletonCImpl.L, Contexts.a(singletonCImpl.e.f23776a), (AppConfig) singletonCImpl.W0.get());
                    case 127:
                        return ViewModelModule_ProvideSngRewardSetupViewModel$scanGoLibrary_releaseFactory.a(singletonCImpl.d0, (RewardsAccountInteractor) singletonCImpl.Y1.get(), singletonCImpl.r1(), (SchedulersProvider) singletonCImpl.o1.get(), (NetworkExceptions) singletonCImpl.m1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 128:
                        return ViewModelModule_ProvideSetupUpCompleteViewModelFactory.a(singletonCImpl.d0, (FeatureToggleManager) singletonCImpl.P0.get(), (UserConfigurations) singletonCImpl.V2.get(), (DeviceInfoProvider) singletonCImpl.T2.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 129:
                        return ViewModelModule_ProvideAddPaymentSetupViewModelFactory.a(singletonCImpl.d0, (AnalyticsManager) singletonCImpl.r2.get());
                    case 130:
                        ViewModelModule viewModelModule2 = singletonCImpl.d0;
                        ScannerViewModel scannerViewModel = new ScannerViewModel((UserManager) singletonCImpl.X2.get(), (UserConfigurations) singletonCImpl.V2.get(), (SngShoppingSession) singletonCImpl.g3.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                        ViewModelModule_ProvideScannerViewModelFactory.a(viewModelModule2, scannerViewModel);
                        return scannerViewModel;
                    case 131:
                        return ScanNGoModule_ProvideSngShoppingSessionFactory.a(singletonCImpl.O);
                    case 132:
                        return new SngInitializerActivitySubcomponentFactory(singletonCImpl);
                    case 133:
                        return new TermsConditionsActivitySubcomponentFactory(singletonCImpl);
                    case 134:
                        return new MessageActivitySubcomponentFactory(singletonCImpl);
                    case 135:
                        return new ContactUsActivitySubcomponentFactory(singletonCImpl);
                    case 136:
                        return new ParkingVoucherActivitySubcomponentFactory(singletonCImpl);
                    case 137:
                        return new OnBoardingActivitySubcomponentFactory(singletonCImpl);
                    case 138:
                        return new AvailableStoresActivitySubcomponentFactory(singletonCImpl);
                    case 139:
                        return new AvailableStoreListActivitySubcomponentFactory(singletonCImpl);
                    case 140:
                        return new SngEntryActivitySubcomponentFactory(singletonCImpl);
                    case 141:
                        return new SngRewardsSetupActivitySubcomponentFactory(singletonCImpl);
                    case 142:
                        return new SetupCompleteActivitySubcomponentFactory(singletonCImpl);
                    case 143:
                        return new AddPaymentSetupActivitySubcomponentFactory(singletonCImpl);
                    case 144:
                        return AppModule_ProvidesTrafficDriversInteractorFactory.a(singletonCImpl.b, new TrafficDriversRepository((ApolloClient) singletonCImpl.C1.get()));
                    case 145:
                        ErrorReporter errorReporter = (ErrorReporter) singletonCImpl.v3.get();
                        Tracer tracer = (Tracer) singletonCImpl.w3.get();
                        Intrinsics.h(errorReporter, "errorReporter");
                        Intrinsics.h(tracer, "tracer");
                        return new ReleaseBarker(errorReporter, tracer);
                    case 146:
                        return new ErrorReporter();
                    case 147:
                        FirebasePerfMonitor firebasePerfMonitor = (FirebasePerfMonitor) singletonCImpl.Z0.get();
                        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
                        return new Tracer();
                    case 148:
                        return InstoreNavigationAppModule_ProvideInstoreNavigationInteractorFactory.a(singletonCImpl.n, (CollectionModeInteractor) singletonCImpl.q1.get(), (PositioningInteractor) singletonCImpl.y3.get(), (CredentialsInteractor) singletonCImpl.z3.get(), (BuildingInteractor) singletonCImpl.A3.get(), SingletonCImpl.W0(singletonCImpl), BaseDataModule_ProvidesInstorePresencePrefs$base_impl_releaseFactory.a(singletonCImpl.I, Contexts.a(singletonCImpl.e.f23776a)), (FeatureToggleManager) singletonCImpl.P0.get(), (DispatcherProvider) singletonCImpl.n1.get());
                    case 149:
                        return ReleaseModule_ProvidePositioningInteractorFactory.a(singletonCImpl.g0, (Context) singletonCImpl.k1.get(), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c));
                    case 150:
                        return InstoreNavigationAppModule_ProvideCredentialsInteractorFactory.a(singletonCImpl.n, (AppConfig) singletonCImpl.W0.get());
                    case 151:
                        return InstoreNavigationAppModule_ProvideBuildingInteractorFactory.a(singletonCImpl.n);
                    case 152:
                        GeolocationAppModule geolocationAppModule = singletonCImpl.h0;
                        Context context3 = singletonCImpl.e.f23776a;
                        Preconditions.d(context3);
                        LocationRepository locationRepository = (LocationRepository) singletonCImpl.B3.get();
                        FusedLocationProviderClient fusedLocationProviderClient = (FusedLocationProviderClient) singletonCImpl.C3.get();
                        geolocationAppModule.getClass();
                        Intrinsics.h(locationRepository, "locationRepository");
                        Intrinsics.h(fusedLocationProviderClient, "fusedLocationProviderClient");
                        return new LocationInteractor(context3, locationRepository, fusedLocationProviderClient);
                    case 153:
                        GeolocationAppModule geolocationAppModule2 = singletonCImpl.h0;
                        SharedPreferences sharedPreferencesY1 = singletonCImpl.y1();
                        PermissionFlagInteractorImpl permissionFlagInteractorImpl = new PermissionFlagInteractorImpl(singletonCImpl.y1());
                        geolocationAppModule2.getClass();
                        return new LocationRepository(sharedPreferencesY1, permissionFlagInteractorImpl);
                    case 154:
                        FusedLocationModule fusedLocationModule = singletonCImpl.i0;
                        Application applicationA4 = Contexts.a(singletonCImpl.e.f23776a);
                        fusedLocationModule.getClass();
                        FusedLocationProviderClient fusedLocationProviderClient2 = LocationServices.getFusedLocationProviderClient(applicationA4);
                        Intrinsics.g(fusedLocationProviderClient2, "getFusedLocationProviderClient(...)");
                        return fusedLocationProviderClient2;
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                        SduiModule sduiModule = singletonCImpl.j0;
                        Context context4 = (Context) singletonCImpl.k1.get();
                        ShopAccountInteractor accountInteractor3 = (ShopAccountInteractor) singletonCImpl.Y0.get();
                        sduiModule.getClass();
                        Intrinsics.h(context4, "context");
                        Intrinsics.h(accountInteractor3, "accountInteractor");
                        return new au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor((DataStore) BannerDismissDataStoreKt.b.getValue(context4, BannerDismissDataStoreKt.f10028a[0]), new androidx.lifecycle.d(accountInteractor3, 4));
                    case 156:
                        return AppModule_ProvideSnGOtherFirebaseAppFactory.a(singletonCImpl.b, (Context) singletonCImpl.k1.get(), (FirebaseConfigBuilder) singletonCImpl.G3.get());
                    case 157:
                        return AppConfigModule_ProvideSnGFirebaseConfigFactory.a(singletonCImpl.K, ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c));
                    case 158:
                        return AppModule_ProvideOnAppCloseHandlerFactory.a(singletonCImpl.b, (ListsInMemoryRepository) singletonCImpl.E2.get());
                    case 159:
                        return AppModule_ProvidesGooglePayManagerFactory.a(singletonCImpl.b, (Context) singletonCImpl.k1.get(), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c));
                    case 160:
                        return LegacyAppModule_ProvideFulfilmentExceptions$shop_legacy_releaseFactory.a(singletonCImpl.p, (AnalyticsManager) singletonCImpl.r2.get(), (NetworkExceptions) singletonCImpl.m1.get());
                    case 161:
                        return new ListsUtils((ListsInMemoryRepository) singletonCImpl.E2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (ShoppingListsRepository) singletonCImpl.B2.get(), (PreferencesDetailsInteractor) singletonCImpl.L3.get(), (NotificationManager) singletonCImpl.M3.get());
                    case 162:
                        return new PreferencesDetailsInteractor(new PreferencesRepository((ApolloClient) singletonCImpl.C1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FeatureToggleManager) singletonCImpl.P0.get()));
                    case 163:
                        return BaseModule_ProvideNotificationManager$base_impl_releaseFactory.a(Contexts.a(singletonCImpl.e.f23776a));
                    case 164:
                        return LegacyDataModule_ProvideWoolworthsSupermarketDatabaseFactory.a(singletonCImpl.k0, Contexts.a(singletonCImpl.e.f23776a));
                    case 165:
                        return AppModule_ProvideLaunchManagerFactory.a(singletonCImpl.b, DoubleCheck.a(singletonCImpl.Y1), DoubleCheck.a(singletonCImpl.q1), DoubleCheck.a(singletonCImpl.t1), DoubleCheck.a(singletonCImpl.E1), DoubleCheck.a(singletonCImpl.Y0), (FeatureToggleManager) singletonCImpl.P0.get(), (PreferencesManager) singletonCImpl.p1.get(), (PickUpLocatorRepository) singletonCImpl.I1.get());
                    case 166:
                        AppModule_ProvideAppIdentifierFactory.a(singletonCImpl.b);
                        return AppIdentifier.d;
                    case 167:
                        ShopAuthAppModule shopAuthAppModule = singletonCImpl.f4159a;
                        Auth0AuthManager auth0AuthManager = (Auth0AuthManager) singletonCImpl.l1.get();
                        KeycloakAuthManager keycloakAuthManager = (KeycloakAuthManager) singletonCImpl.Q0.get();
                        ShopAppRegionInteractor shopAppRegionInteractor2 = (ShopAppRegionInteractor) singletonCImpl.O0.get();
                        DispatcherProvider dispatcherProvider6 = (DispatcherProvider) singletonCImpl.n1.get();
                        shopAuthAppModule.getClass();
                        Intrinsics.h(auth0AuthManager, "auth0AuthManager");
                        Intrinsics.h(keycloakAuthManager, "keycloakAuthManager");
                        Intrinsics.h(shopAppRegionInteractor2, "shopAppRegionInteractor");
                        Intrinsics.h(dispatcherProvider6, "dispatcherProvider");
                        return new ShopAuthManager(auth0AuthManager, keycloakAuthManager, shopAppRegionInteractor2, dispatcherProvider6);
                    case 168:
                        AppConfigModule appConfigModule = singletonCImpl.K;
                        ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c);
                        appConfigModule.getClass();
                        if (AppEnvironment.Production.INSTANCE != null) {
                            return ShopSignUpConfig.h;
                        }
                        throw new NoWhenBranchMatchedException();
                    case 169:
                        return new DigipayInteractor((PayClient) singletonCImpl.c2.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (DispatcherProvider) singletonCImpl.n1.get(), (ShopAppTokenAuthenticator) singletonCImpl.I0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 170:
                        au.com.woolworths.android.onesite.di.modules.NetworkModule networkModule2 = singletonCImpl.N;
                        ShopCheckoutAppModule shopCheckoutAppModule = singletonCImpl.A;
                        return NetworkModule_ProvideApiServiceFactory.a(networkModule2, (ApiInterface) singletonCImpl.H1.get(), SingletonCImpl.U0(singletonCImpl), DoubleCheck.a(singletonCImpl.Y0), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), (AppConfigurationInteractor) singletonCImpl.P1.get(), (SchedulersProvider) singletonCImpl.o1.get(), (AppBuildConfig) singletonCImpl.f2.get(), new MakePayment(ShopCheckoutAppModule_ProvideCheckoutPaymentRepository$shop_checkout_releaseFactory.a(shopCheckoutAppModule, (ApolloClient) singletonCImpl.U3.get(), new PaymentResponseMapper())), new MakeZeroPayment(ShopCheckoutAppModule_ProvideCheckoutPaymentRepository$shop_checkout_releaseFactory.a(shopCheckoutAppModule, (ApolloClient) singletonCImpl.U3.get(), new PaymentResponseMapper())), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 171:
                        return BaseNetworkModule_ProvidePaymentApolloClientFactory.a(singletonCImpl.d, (OkHttpClient) singletonCImpl.f1.get(), SingletonCImpl.h1(singletonCImpl), SingletonCImpl.d1(singletonCImpl), (AppConfig) singletonCImpl.W0.get());
                    case 172:
                        return CheckoutAppModule_ProvideCheckOutInteractor$app_common_releaseFactory.a(singletonCImpl.V, SingletonCImpl.U0(singletonCImpl), (SchedulersProvider) singletonCImpl.o1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (AppBuildConfig) singletonCImpl.f2.get());
                    case 173:
                        return AppModule_ProvidesGoogleAdLoadingTimeoutConfigFactory.a(singletonCImpl.b, (FeatureToggleManager) singletonCImpl.P0.get());
                    case 174:
                        return BaseRewardsAppModule_ProvideRewardsBannerInteractorFactory.a(singletonCImpl.g, Contexts.a(singletonCImpl.e.f23776a));
                    case 175:
                        return ShopCartAppModule_ProvideReplaceProductResultRouterFactory.a();
                    case 176:
                        return BaseShopAppModule_ProvidesInStoreModeInteractor$base_shop_app_releaseFactory.a(singletonCImpl.f, (CollectionModeRepository) singletonCImpl.F1.get());
                    case 177:
                        RewardsPreferencesAppModule rewardsPreferencesAppModule = singletonCImpl.y;
                        ApplicationContextModule applicationContextModule = singletonCImpl.e;
                        Application applicationA5 = Contexts.a(applicationContextModule.f23776a);
                        ApolloClient apolloClient2 = (ApolloClient) singletonCImpl.Q1.get();
                        Gson gsonA = RewardsPreferencesAppModule_ProvideGsonFactory.a(singletonCImpl.y);
                        BaseDataModule baseDataModule2 = singletonCImpl.I;
                        Context context5 = applicationContextModule.f23776a;
                        SharedPreferences sharedPreferencesA = BaseDataModule_ProvidesRewardsAccountChatbotPrefs$base_impl_releaseFactory.a(baseDataModule2, Contexts.a(context5));
                        DispatcherProvider dispatcherProvider7 = (DispatcherProvider) singletonCImpl.n1.get();
                        FeatureToggleManager featureToggleManager3 = (FeatureToggleManager) singletonCImpl.P0.get();
                        Preconditions.d(context5);
                        AccountSettingsRepositoryOld accountSettingsRepositoryOld = new AccountSettingsRepositoryOld(applicationA5, apolloClient2, gsonA, sharedPreferencesA, dispatcherProvider7, featureToggleManager3, context5);
                        AccountNotificationBadgeInteractor accountNotificationBadgeInteractor = (AccountNotificationBadgeInteractor) singletonCImpl.b4.get();
                        RewardsBannerInteractor rewardsBannerInteractor = (RewardsBannerInteractor) singletonCImpl.Y3.get();
                        MedalliaInteractor medalliaInteractor = (MedalliaInteractor) singletonCImpl.t2.get();
                        FeatureToggleManager featureToggleManager4 = (FeatureToggleManager) singletonCImpl.P0.get();
                        singletonCImpl.o0.getClass();
                        return RewardsPreferencesAppModule_ProvideAccountSettingsInteractorFactory.a(rewardsPreferencesAppModule, accountSettingsRepositoryOld, accountNotificationBadgeInteractor, rewardsBannerInteractor, medalliaInteractor, featureToggleManager4);
                    case 178:
                        return BaseRewardsAppModule_ProvideAccountNotificationBadgeInteractorFactory.a(singletonCImpl.g, (DispatcherProvider) singletonCImpl.n1.get());
                    case 179:
                        return BaseModule_ProvideRewardsPointsBalanceRepositoryFactory.a();
                    case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                        return ShopListsDataAppModule_ProvideShoppingListInteractorFactory.a(singletonCImpl.c0, (ShoppingListLocalRepository) singletonCImpl.A2.get());
                    case 181:
                        return ShopListsDataAppModule_ProvideShoppingListItemInteractorFactory.a(singletonCImpl.c0, (ShoppingListLocalRepository) singletonCImpl.A2.get(), (ShoppingListItemsLocalRepositoryWithSoftDeletion) singletonCImpl.y2.get());
                    case 182:
                        return PushNotificationPermissionModule_ProvidePushNotificationPermissionInteractorFactory.a(singletonCImpl.p0, Contexts.a(singletonCImpl.e.f23776a), (DispatcherProvider) singletonCImpl.n1.get());
                    case 183:
                        return ProductDetailsAppModule_ProvidesProductDetailsInteractorFactory.a(singletonCImpl.q0, new ProductDetailsPageRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get()), (CollectionModeInteractor) singletonCImpl.q1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 184:
                        return ShopListsDataAppModule_ProvideWatchlistInteractorFactory.a(singletonCImpl.c0, (ShoppingListItemInteractor) singletonCImpl.f4.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (ShoppingListLocalRepository) singletonCImpl.A2.get(), (ShoppingListItemsLocalRepository) singletonCImpl.z2.get(), (DispatcherProvider) singletonCImpl.n1.get());
                    case 185:
                        return BaseNetworkModule_ProvideAemContentApolloClientFactory.a(singletonCImpl.d, (OkHttpClient) singletonCImpl.j4.get(), (SseNetworkTransport) singletonCImpl.y1.get(), SingletonCImpl.h1(singletonCImpl), SingletonCImpl.d1(singletonCImpl), (AppConfig) singletonCImpl.W0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 186:
                        ReleaseModule releaseModule = singletonCImpl.c;
                        OkHttpClient okHttpClient = (OkHttpClient) singletonCImpl.f1.get();
                        ReleaseModule_ProvideAemContentOkHttpClientFactory.a(releaseModule, okHttpClient);
                        return okHttpClient;
                    case 187:
                        return AdvertisingAppModule_ProvidesGoogleAdManagerInteractorFactory.a(singletonCImpl.r0, (GoogleAdManagerRepository) singletonCImpl.l4.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (GoogleAdLoadingTimeoutConfig) singletonCImpl.X3.get());
                    case 188:
                        return AdvertisingAppModule_ProvidesGoogleAdManagerRepositoryFactory.a(singletonCImpl.r0, Contexts.a(singletonCImpl.e.f23776a), (Gson) singletonCImpl.g1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 189:
                        return AppModule_ProvidesShippingCalculatorDataStoreFactory.a(singletonCImpl.b, (Context) singletonCImpl.k1.get());
                    case 190:
                        return new EverydayExtrasSignUpInteractor();
                    case 191:
                        return new SignUpQueryParamsManager((FeatureToggleManager) singletonCImpl.P0.get());
                    case BERTags.PRIVATE /* 192 */:
                        return AppModule_ProvideRewardsAppTokenAuthenticatorFactory.a(singletonCImpl.b, DoubleCheck.a(singletonCImpl.f1), DoubleCheck.a(singletonCImpl.Y1), (AppConfig) singletonCImpl.W0.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (Gson) singletonCImpl.G0.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (Auth0AuthManager) singletonCImpl.l1.get(), (NetworkExceptions) singletonCImpl.m1.get());
                    case 193:
                        return BaseModule_ProvideJwtApiFactory.a((OkHttpClient) singletonCImpl.f1.get(), (AppConfig) singletonCImpl.W0.get(), (SchedulersProvider) singletonCImpl.o1.get(), (Gson) singletonCImpl.G0.get());
                    case 194:
                        InstorePresenceAppModule instorePresenceAppModule = singletonCImpl.o;
                        ApplicationContextModule applicationContextModule2 = singletonCImpl.e;
                        Context context6 = applicationContextModule2.f23776a;
                        Preconditions.d(context6);
                        return InstorePresenceAppModule_ProvideInstorePresenceInteractorFactory.a(instorePresenceAppModule, context6, (CollectionModeInteractor) singletonCImpl.q1.get(), (InstorePresenceRepository) singletonCImpl.s4.get(), (RepositoryManager) singletonCImpl.t1.get(), (InStoreWifiInteractor) singletonCImpl.M2.get(), (LocationInteractor) singletonCImpl.D3.get(), SingletonCImpl.W0(singletonCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), BaseDataModule_ProvidesInstorePresencePrefs$base_impl_releaseFactory.a(singletonCImpl.I, Contexts.a(applicationContextModule2.f23776a)), (InstorePresenceAnalyticsProvider) singletonCImpl.O1.get(), (DispatcherProvider) singletonCImpl.n1.get());
                    case 195:
                        return InstorePresenceAppModule_ProvideInstoreLocationRepositoryFactory.a(singletonCImpl.o, singletonCImpl.z1());
                    case 196:
                        Context context7 = singletonCImpl.e.f23776a;
                        Preconditions.d(context7);
                        return AppCommsModule_ProvideInboxClientFactory.a(context7, (FeatureToggleManager) singletonCImpl.P0.get(), (InboxUserIdSource) singletonCImpl.u4.get(), (InboxChatbotSessionIdSource) singletonCImpl.v4.get(), AppCommsModule_ProvideInboxDataFetcherFactory.a((ApolloClient) singletonCImpl.C1.get()), (SwrveDataSource) singletonCImpl.w4.get());
                    case 197:
                        return AppCommsConfigsModule_ProvideInboxUserIdSourceFactory.a((ShopAccountInteractor) singletonCImpl.Y0.get());
                    case 198:
                        return AppCommsConfigsModule_ProvideInboxChatbotSessionIdSourceFactory.a((ShopAccountInteractor) singletonCImpl.Y0.get());
                    case 199:
                        return null;
                    default:
                        throw new AssertionError(i);
                }
            }
        }

        public SingletonCImpl(AdvertisingAppModule advertisingAppModule, AppBuildConfigModule appBuildConfigModule, AppConfigModule appConfigModule, AppModule appModule, BaseShopAppModule baseShopAppModule, ApplicationContextModule applicationContextModule, BaseDataModule baseDataModule, BaseNetworkModule baseNetworkModule, BaseRewardsAppModule baseRewardsAppModule, BuyAgainAppModule buyAgainAppModule, CartInfoModule cartInfoModule, CartUpdateModule cartUpdateModule, CatalogueAppModule catalogueAppModule, CheckoutAppModule checkoutAppModule, CollectionModeModule collectionModeModule, DeliveryAddressAppModule deliveryAddressAppModule, DeviceFingerprintAppModule deviceFingerprintAppModule, DigipaySdkAppModule digipaySdkAppModule, EditOrderModule editOrderModule, ForceUpgradeAppModule forceUpgradeAppModule, FusedLocationModule fusedLocationModule, GeolocationAppModule geolocationAppModule, HomepageAppModule homepageAppModule, HttpInterceptorModule httpInterceptorModule, InStoreWifiAppModule inStoreWifiAppModule, InstoreCartAppModule instoreCartAppModule, InstoreNavigationAppModule instoreNavigationAppModule, InstorePresenceAppModule instorePresenceAppModule, LegacyAppModule legacyAppModule, LegacyDataModule legacyDataModule, LegacyDigipayModule legacyDigipayModule, MarketingAppModule marketingAppModule, MoreFeatureAppModule moreFeatureAppModule, NavigationModule navigationModule, NetworkModule networkModule, au.com.woolworths.android.onesite.di.modules.NetworkModule networkModule2, NotificationModule notificationModule, OliveVoiceAppModule oliveVoiceAppModule, OnboardingSduiAppModule onboardingSduiAppModule, ProductAppModule productAppModule, ProductAvailabilityModule productAvailabilityModule, ProductDetailsAppModule productDetailsAppModule, au.com.woolworths.shop.product.details.di.ProductDetailsAppModule productDetailsAppModule2, ProductListAppModule productListAppModule, au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule productListAppModule2, au.com.woolworths.feature.product.list.v2.di.ProductListAppModule productListAppModule3, PromotionBannerAppModule promotionBannerAppModule, PushNotificationPermissionModule pushNotificationPermissionModule, RecipeDetailsAppModule recipeDetailsAppModule, RecipesAppModule recipesAppModule, ReleaseModule releaseModule, au.com.woolworths.feature.shop.instore.navigation.di.ReleaseModule releaseModule2, RemoteDismissibleBannerModule remoteDismissibleBannerModule, RewardsAccountAppModule rewardsAccountAppModule, RewardsCardAppModule rewardsCardAppModule, RewardsOffersAppModule rewardsOffersAppModule, RewardsOnboardingAppModule rewardsOnboardingAppModule, RewardsPreferencesAppModule rewardsPreferencesAppModule, RewardsServiceMessageModule rewardsServiceMessageModule, ScanNGoModule scanNGoModule, ViewModelModule viewModelModule, BffScanNGoModule bffScanNGoModule, ScanNGoNotificationModule scanNGoNotificationModule, SduiModule sduiModule, ShippingCalculatorAppModule shippingCalculatorAppModule, ShopAppRegionModule shopAppRegionModule, ShopAskOliveAppModule shopAskOliveAppModule, ShopAuthAppModule shopAuthAppModule, ShopCheckoutAppModule shopCheckoutAppModule, ShopListsAppModule shopListsAppModule, ShopListsDataAppModule shopListsDataAppModule, ShopLoginAppModule shopLoginAppModule, ShopMarketplaceAppModule shopMarketplaceAppModule, ShopMyOrdersAppModule shopMyOrdersAppModule, ShopReceiptDetailsAppModule shopReceiptDetailsAppModule, ShopScanAndGoAppModule shopScanAndGoAppModule, ShopStoreLocatorAppModule shopStoreLocatorAppModule, au.com.woolworths.feature.shop.storelocator.legacy.di.ShopStoreLocatorAppModule shopStoreLocatorAppModule2, ShopWPayAppModule shopWPayAppModule, ShopWxidAppModule shopWxidAppModule, TigerNewOffersModule tigerNewOffersModule, VocAppModule vocAppModule, WxidAppModule wxidAppModule) {
            this.f4159a = shopAuthAppModule;
            this.b = appModule;
            this.c = releaseModule;
            this.d = baseNetworkModule;
            this.e = applicationContextModule;
            this.f = baseShopAppModule;
            this.g = baseRewardsAppModule;
            this.h = buyAgainAppModule;
            this.i = catalogueAppModule;
            this.j = deliveryAddressAppModule;
            this.k = editOrderModule;
            this.l = homepageAppModule;
            this.m = inStoreWifiAppModule;
            this.n = instoreNavigationAppModule;
            this.o = instorePresenceAppModule;
            this.p = legacyAppModule;
            this.q = moreFeatureAppModule;
            this.r = oliveVoiceAppModule;
            this.s = productAppModule;
            this.t = productDetailsAppModule;
            this.u = promotionBannerAppModule;
            this.v = recipesAppModule;
            this.w = rewardsCardAppModule;
            this.x = rewardsOffersAppModule;
            this.y = rewardsPreferencesAppModule;
            this.z = shopAskOliveAppModule;
            this.A = shopCheckoutAppModule;
            this.B = shopListsAppModule;
            this.C = shopMarketplaceAppModule;
            this.D = shopMyOrdersAppModule;
            this.E = shopScanAndGoAppModule;
            this.F = shopWPayAppModule;
            this.G = tigerNewOffersModule;
            this.H = vocAppModule;
            this.I = baseDataModule;
            this.J = shopAppRegionModule;
            this.K = appConfigModule;
            this.L = deviceFingerprintAppModule;
            this.M = httpInterceptorModule;
            this.N = networkModule2;
            this.O = scanNGoModule;
            this.P = collectionModeModule;
            this.Q = shopStoreLocatorAppModule2;
            this.R = wxidAppModule;
            this.S = rewardsAccountAppModule;
            this.T = cartInfoModule;
            this.U = cartUpdateModule;
            this.V = checkoutAppModule;
            this.W = legacyDigipayModule;
            this.X = digipaySdkAppModule;
            this.Y = shopLoginAppModule;
            this.Z = appBuildConfigModule;
            this.a0 = marketingAppModule;
            this.b0 = navigationModule;
            this.c0 = shopListsDataAppModule;
            this.d0 = viewModelModule;
            this.e0 = bffScanNGoModule;
            this.f0 = shopWxidAppModule;
            this.g0 = releaseModule2;
            this.h0 = geolocationAppModule;
            this.i0 = fusedLocationModule;
            this.j0 = sduiModule;
            this.k0 = legacyDataModule;
            this.l0 = shopReceiptDetailsAppModule;
            this.m0 = productListAppModule;
            this.n0 = productListAppModule2;
            this.o0 = forceUpgradeAppModule;
            this.p0 = pushNotificationPermissionModule;
            this.q0 = productDetailsAppModule2;
            this.r0 = advertisingAppModule;
            this.s0 = rewardsServiceMessageModule;
            this.t0 = instoreCartAppModule;
            this.u0 = notificationModule;
            this.v0 = rewardsOnboardingAppModule;
            this.w0 = onboardingSduiAppModule;
            this.x0 = networkModule;
            this.y0 = productAvailabilityModule;
            this.z0 = recipeDetailsAppModule;
            this.A0 = remoteDismissibleBannerModule;
            this.B0 = shippingCalculatorAppModule;
            this.C0 = shopStoreLocatorAppModule;
            this.D0 = productListAppModule3;
            this.E0 = scanNGoNotificationModule;
            DelegateFactory.a(this.I0, DoubleCheck.b(new SwitchingProvider(this, 0)));
            this.o1 = DoubleCheck.b(new SwitchingProvider(this, 34));
            this.p1 = DoubleCheck.b(new SwitchingProvider(this, 40));
            this.q1 = new DelegateFactory();
            this.r1 = new DelegateFactory();
            this.s1 = DoubleCheck.b(new SwitchingProvider(this, 41));
            this.t1 = DoubleCheck.b(new SwitchingProvider(this, 39));
            this.u1 = DoubleCheck.b(new SwitchingProvider(this, 43));
            this.v1 = DoubleCheck.b(new SwitchingProvider(this, 44));
            this.w1 = DoubleCheck.b(new SwitchingProvider(this, 49));
            this.x1 = DoubleCheck.b(new SwitchingProvider(this, 48));
            this.y1 = DoubleCheck.b(new SwitchingProvider(this, 47));
            this.z1 = DoubleCheck.b(new SwitchingProvider(this, 50));
            this.A1 = DoubleCheck.b(new SwitchingProvider(this, 51));
            this.B1 = DoubleCheck.b(new SwitchingProvider(this, 52));
            this.C1 = DoubleCheck.b(new SwitchingProvider(this, 46));
            this.D1 = DoubleCheck.b(new SwitchingProvider(this, 45));
            this.E1 = DoubleCheck.b(new SwitchingProvider(this, 42));
            this.F1 = DoubleCheck.b(new SwitchingProvider(this, 53));
            this.G1 = DoubleCheck.b(new SwitchingProvider(this, 55));
            this.H1 = DoubleCheck.b(new SwitchingProvider(this, 56));
            this.I1 = DoubleCheck.b(new SwitchingProvider(this, 54));
            this.J1 = DoubleCheck.b(new SwitchingProvider(this, 38));
            DelegateFactory.a(this.q1, new SwitchingProvider(this, 37));
            this.K1 = DoubleCheck.b(new SwitchingProvider(this, 58));
            this.L1 = DoubleCheck.b(new SwitchingProvider(this, 57));
            this.M1 = DoubleCheck.b(new SwitchingProvider(this, 59));
            this.N1 = DoubleCheck.b(new SwitchingProvider(this, 60));
            this.O1 = DoubleCheck.b(new SwitchingProvider(this, 61));
            this.P1 = DoubleCheck.b(new SwitchingProvider(this, 63));
            this.Q1 = DoubleCheck.b(new SwitchingProvider(this, 64));
            this.R1 = DoubleCheck.b(new SwitchingProvider(this, 66));
            this.S1 = DoubleCheck.b(new SwitchingProvider(this, 67));
            this.T1 = DoubleCheck.b(new SwitchingProvider(this, 68));
            this.U1 = DoubleCheck.b(new SwitchingProvider(this, 65));
            this.V1 = DoubleCheck.b(new SwitchingProvider(this, 69));
            this.W1 = DoubleCheck.b(new SwitchingProvider(this, 70));
            this.X1 = DoubleCheck.b(new SwitchingProvider(this, 71));
            this.Y1 = DoubleCheck.b(new SwitchingProvider(this, 62));
            this.Z1 = DoubleCheck.b(new SwitchingProvider(this, 72));
            this.a2 = DoubleCheck.b(new SwitchingProvider(this, 36));
            DelegateFactory.a(this.r1, DoubleCheck.b(new SwitchingProvider(this, 35)));
            this.b2 = DoubleCheck.b(new SwitchingProvider(this, 76));
            this.c2 = DoubleCheck.b(new SwitchingProvider(this, 75));
            this.d2 = DoubleCheck.b(new SwitchingProvider(this, 74));
            this.e2 = DoubleCheck.b(new SwitchingProvider(this, 73));
            this.f2 = DoubleCheck.b(new SwitchingProvider(this, 79));
            this.g2 = DoubleCheck.b(new SwitchingProvider(this, 78));
            this.h2 = DoubleCheck.b(new SwitchingProvider(this, 77));
            this.i2 = DoubleCheck.b(new SwitchingProvider(this, 83));
            this.j2 = DoubleCheck.b(new SwitchingProvider(this, 82));
            this.k2 = DoubleCheck.b(new SwitchingProvider(this, 81));
            this.l2 = DoubleCheck.b(new SwitchingProvider(this, 85));
            this.m2 = DoubleCheck.b(new SwitchingProvider(this, 84));
            this.n2 = DoubleCheck.b(new SwitchingProvider(this, 87));
            this.o2 = DoubleCheck.b(new SwitchingProvider(this, 88));
            this.p2 = DoubleCheck.b(new SwitchingProvider(this, 89));
            this.q2 = DoubleCheck.b(new SwitchingProvider(this, 86));
            this.r2 = DoubleCheck.b(new SwitchingProvider(this, 80));
            this.s2 = DoubleCheck.b(new SwitchingProvider(this, 90));
            this.t2 = DoubleCheck.b(new SwitchingProvider(this, 91));
            this.u2 = DoubleCheck.b(new SwitchingProvider(this, 92));
            this.v2 = DoubleCheck.b(new SwitchingProvider(this, 93));
            this.w2 = DoubleCheck.b(new SwitchingProvider(this, 97));
            this.x2 = DoubleCheck.b(new SwitchingProvider(this, 100));
            this.y2 = DoubleCheck.b(new SwitchingProvider(this, 99));
            this.z2 = DoubleCheck.b(new SwitchingProvider(this, 98));
            this.A2 = DoubleCheck.b(new SwitchingProvider(this, 96));
            this.B2 = DoubleCheck.b(new SwitchingProvider(this, 103));
            this.C2 = DoubleCheck.b(new SwitchingProvider(this, 105));
            this.D2 = DoubleCheck.b(new SwitchingProvider(this, 104));
            this.E2 = DoubleCheck.b(new SwitchingProvider(this, 102));
            this.F2 = DoubleCheck.b(new SwitchingProvider(this, 101));
            this.G2 = DoubleCheck.b(new SwitchingProvider(this, 106));
            this.H2 = DoubleCheck.b(new SwitchingProvider(this, 95));
            this.I2 = DoubleCheck.b(new SwitchingProvider(this, 94));
            this.J2 = DoubleCheck.b(new SwitchingProvider(this, 109));
            this.K2 = DoubleCheck.b(new SwitchingProvider(this, 108));
            this.L2 = DoubleCheck.b(new SwitchingProvider(this, 107));
            this.M2 = DoubleCheck.b(new SwitchingProvider(this, 110));
            this.N2 = DoubleCheck.b(new SwitchingProvider(this, 111));
            this.O2 = DoubleCheck.b(new SwitchingProvider(this, 113));
            this.P2 = DoubleCheck.b(new SwitchingProvider(this, 114));
            this.Q2 = DoubleCheck.b(new SwitchingProvider(this, 117));
            this.R2 = DoubleCheck.b(new SwitchingProvider(this, 116));
            this.S2 = DoubleCheck.b(new SwitchingProvider(this, 119));
            this.T2 = DoubleCheck.b(new SwitchingProvider(this, 118));
            this.U2 = DoubleCheck.b(new SwitchingProvider(this, 115));
            this.V2 = DoubleCheck.b(new SwitchingProvider(this, 120));
            this.W2 = DoubleCheck.b(new SwitchingProvider(this, 121));
            this.X2 = DoubleCheck.b(new SwitchingProvider(this, 112));
            this.Y2 = new SwitchingProvider(this, 122);
            this.Z2 = new SwitchingProvider(this, 123);
            this.a3 = new SwitchingProvider(this, 124);
            this.b3 = DoubleCheck.b(new SwitchingProvider(this, 126));
            this.c3 = new SwitchingProvider(this, 125);
            this.d3 = new SwitchingProvider(this, 127);
            this.e3 = new SwitchingProvider(this, 128);
            this.f3 = new SwitchingProvider(this, 129);
            this.g3 = DoubleCheck.b(new SwitchingProvider(this, 131));
            this.h3 = new SwitchingProvider(this, 130);
            this.i3 = new SwitchingProvider(this, 132);
            this.j3 = new SwitchingProvider(this, 133);
            this.k3 = new SwitchingProvider(this, 134);
            this.l3 = new SwitchingProvider(this, 135);
            this.m3 = new SwitchingProvider(this, 136);
            this.n3 = new SwitchingProvider(this, 137);
            this.o3 = new SwitchingProvider(this, 138);
            this.p3 = new SwitchingProvider(this, 139);
            this.q3 = new SwitchingProvider(this, 140);
            this.r3 = new SwitchingProvider(this, 141);
            this.s3 = new SwitchingProvider(this, 142);
            this.t3 = new SwitchingProvider(this, 143);
            this.u3 = DoubleCheck.b(new SwitchingProvider(this, 144));
            this.v3 = DoubleCheck.b(new SwitchingProvider(this, 146));
            this.w3 = DoubleCheck.b(new SwitchingProvider(this, 147));
            this.x3 = DoubleCheck.b(new SwitchingProvider(this, 145));
            this.y3 = DoubleCheck.b(new SwitchingProvider(this, 149));
            this.z3 = DoubleCheck.b(new SwitchingProvider(this, 150));
            this.A3 = DoubleCheck.b(new SwitchingProvider(this, 151));
            this.B3 = DoubleCheck.b(new SwitchingProvider(this, 153));
            this.C3 = DoubleCheck.b(new SwitchingProvider(this, 154));
            this.D3 = DoubleCheck.b(new SwitchingProvider(this, 152));
            this.E3 = DoubleCheck.b(new SwitchingProvider(this, 148));
            this.F3 = DoubleCheck.b(new SwitchingProvider(this, ModuleDescriptor.MODULE_VERSION));
            this.G3 = DoubleCheck.b(new SwitchingProvider(this, 157));
            this.H3 = DoubleCheck.b(new SwitchingProvider(this, 156));
            this.I3 = DoubleCheck.b(new SwitchingProvider(this, 158));
            this.J3 = DoubleCheck.b(new SwitchingProvider(this, 159));
            this.K3 = DoubleCheck.b(new SwitchingProvider(this, 160));
            this.L3 = DoubleCheck.b(new SwitchingProvider(this, 162));
            this.M3 = DoubleCheck.b(new SwitchingProvider(this, 163));
            this.N3 = DoubleCheck.b(new SwitchingProvider(this, 161));
            this.O3 = DoubleCheck.b(new SwitchingProvider(this, 164));
            this.P3 = DoubleCheck.b(new SwitchingProvider(this, 165));
            this.Q3 = DoubleCheck.b(new SwitchingProvider(this, 166));
            this.R3 = DoubleCheck.b(new SwitchingProvider(this, 167));
            this.S3 = DoubleCheck.b(new SwitchingProvider(this, 168));
            this.T3 = DoubleCheck.b(new SwitchingProvider(this, 169));
            this.U3 = DoubleCheck.b(new SwitchingProvider(this, 171));
            this.V3 = DoubleCheck.b(new SwitchingProvider(this, 170));
            this.W3 = DoubleCheck.b(new SwitchingProvider(this, 172));
            this.X3 = DoubleCheck.b(new SwitchingProvider(this, 173));
            this.Y3 = DoubleCheck.b(new SwitchingProvider(this, 174));
            this.Z3 = DoubleCheck.b(new SwitchingProvider(this, 175));
            this.a4 = DoubleCheck.b(new SwitchingProvider(this, 176));
            this.b4 = DoubleCheck.b(new SwitchingProvider(this, 178));
            this.c4 = DoubleCheck.b(new SwitchingProvider(this, 177));
            this.d4 = DoubleCheck.b(new SwitchingProvider(this, 179));
            this.e4 = DoubleCheck.b(new SwitchingProvider(this, SubsamplingScaleImageView.ORIENTATION_180));
            this.f4 = DoubleCheck.b(new SwitchingProvider(this, 181));
            this.g4 = DoubleCheck.b(new SwitchingProvider(this, 182));
            this.h4 = DoubleCheck.b(new SwitchingProvider(this, 183));
            this.i4 = DoubleCheck.b(new SwitchingProvider(this, 184));
            this.j4 = DoubleCheck.b(new SwitchingProvider(this, 186));
            this.k4 = DoubleCheck.b(new SwitchingProvider(this, 185));
            this.l4 = DoubleCheck.b(new SwitchingProvider(this, 188));
            this.m4 = DoubleCheck.b(new SwitchingProvider(this, 187));
            this.n4 = DoubleCheck.b(new SwitchingProvider(this, 189));
            this.o4 = DoubleCheck.b(new SwitchingProvider(this, 190));
            this.p4 = DoubleCheck.b(new SwitchingProvider(this, 191));
            this.q4 = DoubleCheck.b(new SwitchingProvider(this, BERTags.PRIVATE));
            this.r4 = DoubleCheck.b(new SwitchingProvider(this, 193));
            this.s4 = DoubleCheck.b(new SwitchingProvider(this, 195));
            this.t4 = DoubleCheck.b(new SwitchingProvider(this, 194));
            this.u4 = DoubleCheck.b(new SwitchingProvider(this, 197));
            this.v4 = DoubleCheck.b(new SwitchingProvider(this, 198));
            this.w4 = DoubleCheck.b(new SwitchingProvider(this, 199));
            this.x4 = DoubleCheck.b(new SwitchingProvider(this, 196));
            this.y4 = DoubleCheck.b(new SwitchingProvider(this, 200));
            this.z4 = DoubleCheck.b(new SwitchingProvider(this, 201));
            this.A4 = DoubleCheck.b(new SwitchingProvider(this, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER));
            this.B4 = DoubleCheck.b(new SwitchingProvider(this, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER));
            this.C4 = DoubleCheck.b(new SwitchingProvider(this, 204));
            this.D4 = DoubleCheck.b(new SwitchingProvider(this, 205));
            this.E4 = DoubleCheck.b(new SwitchingProvider(this, 206));
            this.F4 = DoubleCheck.b(new SwitchingProvider(this, 208));
            this.G4 = DoubleCheck.b(new SwitchingProvider(this, 207));
            this.H4 = DoubleCheck.b(new SwitchingProvider(this, Primes.SMALL_FACTOR_LIMIT));
            this.I4 = DoubleCheck.b(new SwitchingProvider(this, 210));
            this.J4 = DoubleCheck.b(new SwitchingProvider(this, 212));
            this.K4 = DoubleCheck.b(new SwitchingProvider(this, 209));
            this.L4 = DoubleCheck.b(new SwitchingProvider(this, 213));
            this.M4 = DoubleCheck.b(new SwitchingProvider(this, 215));
            this.N4 = DoubleCheck.b(new SwitchingProvider(this, 214));
            this.O4 = DoubleCheck.b(new SwitchingProvider(this, 216));
            this.P4 = DoubleCheck.b(new SwitchingProvider(this, 217));
            this.Q4 = DoubleCheck.b(new SwitchingProvider(this, 218));
            this.R4 = DoubleCheck.b(new SwitchingProvider(this, 219));
            this.S4 = DoubleCheck.b(new SwitchingProvider(this, 220));
            this.T4 = DoubleCheck.b(new SwitchingProvider(this, 221));
            this.U4 = DoubleCheck.b(new SwitchingProvider(this, 222));
            this.V4 = DoubleCheck.b(new SwitchingProvider(this, 223));
            this.W4 = DoubleCheck.b(new SwitchingProvider(this, BERTags.FLAGS));
            this.X4 = DoubleCheck.b(new SwitchingProvider(this, 225));
            this.Y4 = DoubleCheck.b(new SwitchingProvider(this, 226));
            this.Z4 = DoubleCheck.b(new SwitchingProvider(this, 227));
            this.a5 = DoubleCheck.b(new SwitchingProvider(this, 228));
            this.b5 = DoubleCheck.b(new SwitchingProvider(this, 229));
            this.c5 = DoubleCheck.b(new SwitchingProvider(this, 231));
            this.d5 = DoubleCheck.b(new SwitchingProvider(this, 230));
            this.e5 = DoubleCheck.b(new SwitchingProvider(this, 232));
            this.f5 = DoubleCheck.b(new SwitchingProvider(this, 234));
            this.g5 = DoubleCheck.b(new SwitchingProvider(this, 233));
        }

        public static AppConfigClientImpl Q0(SingletonCImpl singletonCImpl) {
            ForceUpgradeAppModule forceUpgradeAppModule = singletonCImpl.o0;
            ApolloClient apolloClient = (ApolloClient) singletonCImpl.C1.get();
            Intrinsics.h(apolloClient, "apolloClient");
            ShopAppConfigFetcher shopAppConfigFetcher = new ShopAppConfigFetcher(apolloClient);
            ForceUpgradeAppModule forceUpgradeAppModule2 = singletonCImpl.o0;
            ApplicationContextModule applicationContextModule = singletonCImpl.e;
            Context context = applicationContextModule.f23776a;
            Preconditions.d(context);
            forceUpgradeAppModule2.getClass();
            DataStore dataStore = (DataStore) UpgradeConfigDataStoreKt.b.getValue(context, UpgradeConfigDataStoreKt.f8513a[0]);
            DataStore dataStore2 = (DataStore) SoftUpgradeAlertBannerStoreKt.b.getValue(context, SoftUpgradeAlertBannerStoreKt.f8512a[0]);
            DataStore dataStore3 = (DataStore) AppConfigDataStoreKt.b.getValue(context, AppConfigDataStoreKt.f8510a[0]);
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            Intrinsics.g(clockSystemDefaultZone, "systemDefaultZone(...)");
            AppConfigRepositoryImpl appConfigRepositoryImpl = new AppConfigRepositoryImpl(dataStore, dataStore2, dataStore3, clockSystemDefaultZone);
            Preconditions.d(applicationContextModule.f23776a);
            RewardsAccountInteractor rewardsAccountInteractor = (RewardsAccountInteractor) singletonCImpl.Y1.get();
            ReleaseSettingsInteractorImpl releaseSettingsInteractorImplA = ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c);
            forceUpgradeAppModule.getClass();
            Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
            Clock clockSystemDefaultZone2 = Clock.systemDefaultZone();
            Intrinsics.g(clockSystemDefaultZone2, "systemDefaultZone(...)");
            return new AppConfigClientImpl(shopAppConfigFetcher, appConfigRepositoryImpl, releaseSettingsInteractorImplA, rewardsAccountInteractor, clockSystemDefaultZone2);
        }

        public static BranchDeepLinkInteractorImpl R0(SingletonCImpl singletonCImpl) {
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            Intrinsics.h(analyticsManager, "analyticsManager");
            BranchAnalyticsInteractor branchAnalyticsInteractor = new BranchAnalyticsInteractor(analyticsManager);
            AnalyticsManager analyticsManager2 = (AnalyticsManager) singletonCImpl.r2.get();
            Intrinsics.h(analyticsManager2, "analyticsManager");
            return new BranchDeepLinkInteractorImpl(branchAnalyticsInteractor, analyticsManager2);
        }

        public static BuyAgainEntryPointInteractor S0(SingletonCImpl singletonCImpl) {
            return BuyAgainAppModule_ProvideBuyAgainEntryPointInteractorFactory.a(singletonCImpl.h, (ShopAccountInteractor) singletonCImpl.Y0.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        public static CartRepositoryImpl T0(SingletonCImpl singletonCImpl) {
            ApolloClient apolloClient = (ApolloClient) singletonCImpl.C1.get();
            FeatureToggleManager featureManager = (FeatureToggleManager) singletonCImpl.P0.get();
            ShopAppFlavorInteractor shopAppFlavorInteractor = (ShopAppFlavorInteractor) singletonCImpl.N0.get();
            Intrinsics.h(apolloClient, "apolloClient");
            Intrinsics.h(featureManager, "featureManager");
            Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
            return new CartRepositoryImpl(apolloClient, featureManager, shopAppFlavorInteractor);
        }

        public static CheckoutApiInterface U0(SingletonCImpl singletonCImpl) {
            return CheckoutAppModule_ProvidesCheckoutApiFactory.a(singletonCImpl.V, (AppConfig) singletonCImpl.W0.get(), (OkHttpClient) singletonCImpl.f1.get(), (Gson) singletonCImpl.G0.get(), (SchedulersProvider) singletonCImpl.o1.get());
        }

        public static ImageToTextRepository V0(SingletonCImpl singletonCImpl) {
            return ShopListsAppModule_ProvideImageToTextRepositoryFactory.a(singletonCImpl.B, (ApigeeXApi) singletonCImpl.K4.get());
        }

        public static LegacyStoreLocatorInteractorImpl W0(SingletonCImpl singletonCImpl) {
            return AppModule_ProvideStoreLocatorInteractorLegacyFactory.a(singletonCImpl.b, (ShopAccountInteractor) singletonCImpl.Y0.get(), singletonCImpl.L(), (RepositoryManager) singletonCImpl.t1.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (LocationInteractor) singletonCImpl.D3.get(), new StoreLocatorRepository(singletonCImpl.z1(), (AppBuildConfig) singletonCImpl.f2.get(), (DispatcherProvider) singletonCImpl.n1.get()));
        }

        public static LogOutInteractorImpl X0(SingletonCImpl singletonCImpl) throws NumberFormatException {
            ShopLoginAppModule shopLoginAppModule = singletonCImpl.Y;
            ShopAccountInteractor shopAccountInteractor = (ShopAccountInteractor) singletonCImpl.Y0.get();
            RewardsAccountInteractor rewardsAccountInteractor = (RewardsAccountInteractor) singletonCImpl.Y1.get();
            GuestLoginInteractorImpl guestLoginInteractorImplL = singletonCImpl.L();
            CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) singletonCImpl.q1.get();
            CartUpdateInteractor cartUpdateInteractor = (CartUpdateInteractor) singletonCImpl.D2.get();
            WxidClientImpl wxidClientImplE = singletonCImpl.e();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            ShippingCalculatorDataStore shippingCalculatorDataStore = (ShippingCalculatorDataStore) singletonCImpl.n4.get();
            ShopListsAppModule shopListsAppModule = singletonCImpl.B;
            ApplicationContextModule applicationContextModule = singletonCImpl.e;
            Context context = applicationContextModule.f23776a;
            Preconditions.d(context);
            return ShopLoginAppModule_ProvideLogoutInteractorFactory.a(shopLoginAppModule, shopAccountInteractor, rewardsAccountInteractor, guestLoginInteractorImplL, collectionModeInteractor, cartUpdateInteractor, wxidClientImplE, featureToggleManager, shippingCalculatorDataStore, ShopListsAppModule_ProvidesListsDataStoreFactory.a(shopListsAppModule, context), au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule_ProvidesProductsSharedPrefsFactory.a(singletonCImpl.n0, Contexts.a(applicationContextModule.f23776a)));
        }

        public static PermissionFlagInteractorImpl Y0(SingletonCImpl singletonCImpl) {
            return new PermissionFlagInteractorImpl(singletonCImpl.y1());
        }

        public static ProductsInteractor Z0(SingletonCImpl singletonCImpl) {
            return new ProductsInteractor(new ProductsRepository((ApolloClient) singletonCImpl.C1.get()), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        public static ResourceResolverImpl a1(SingletonCImpl singletonCImpl) {
            return ScanNGoModule_ProvideResourceResolverFactory.a(singletonCImpl.O, (Context) singletonCImpl.k1.get());
        }

        public static RewardsOfferActivationInteractor b1(SingletonCImpl singletonCImpl) {
            RewardsOffersAppModule rewardsOffersAppModule = singletonCImpl.x;
            RewardsOfferRepository rewardsOfferRepository = (RewardsOfferRepository) singletonCImpl.N4.get();
            ApplicationContextModule applicationContextModule = singletonCImpl.e;
            Context context = applicationContextModule.f23776a;
            Preconditions.d(context);
            BranchRepository branchRepository = new BranchRepository(context);
            Context context2 = applicationContextModule.f23776a;
            Preconditions.d(context2);
            return RewardsOffersAppModule_ProvideRewardsOfferActivationInteractorFactory.a(rewardsOffersAppModule, rewardsOfferRepository, new BranchInteractor(branchRepository, new BranchAnalyticsManager(context2), (FeatureToggleManager) singletonCImpl.P0.get()), (RefreshNotifier) singletonCImpl.O4.get());
        }

        public static RewardsServiceMessageInteractorImpl c1(SingletonCImpl singletonCImpl) {
            return RewardsServiceMessageModule_ProvideRewardsServiceMessageInteractorFactory.a(singletonCImpl.s0, (FeatureToggleManager) singletonCImpl.P0.get(), (RewardsAccountInteractor) singletonCImpl.Y1.get());
        }

        public static ImmutableSet d1(SingletonCImpl singletonCImpl) {
            singletonCImpl.getClass();
            ImmutableSet.Builder builderM = ImmutableSet.m(5);
            singletonCImpl.d.getClass();
            builderM.j(EmptySet.d);
            FirebasePerfMonitor firebasePerfMonitor = (FirebasePerfMonitor) singletonCImpl.Z0.get();
            Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
            builderM.a(new FirebasePerfApolloInterceptor(firebasePerfMonitor));
            builderM.a(new BaseNetworkModule$provideApolloHeadersInterceptor$1());
            singletonCImpl.R.getClass();
            final ApplicationType applicationType = (ApplicationType) singletonCImpl.B1.get();
            Intrinsics.h(applicationType, "applicationType");
            builderM.a(new ApolloInterceptor() { // from class: au.com.woolworths.android.onesite.di.BaseNetworkModule$provideShopWxidHeaderInterceptor$1
                @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
                public final Flow a(ApolloRequest apolloRequest, DefaultInterceptorChain defaultInterceptorChain) {
                    ApolloRequest.Builder builderA = apolloRequest.a();
                    String str = WxidSessionImpl.b;
                    if (applicationType == ApplicationType.e && str != null) {
                        builderA.a("x-wxid", str);
                    }
                    return defaultInterceptorChain.a(builderA.b());
                }
            });
            DeviceFingerprintAppModule deviceFingerprintAppModule = singletonCImpl.L;
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            BotmanagerInteractor botmanagerInteractorK = singletonCImpl.k();
            singletonCImpl.b.getClass();
            ShopAppFeature shopAppFeature = ShopAppFeature.d;
            BotmanagerApolloInterceptor botmanagerApolloInterceptor = new BotmanagerApolloInterceptor(featureToggleManager, botmanagerInteractorK);
            deviceFingerprintAppModule.getClass();
            builderM.a(botmanagerApolloInterceptor);
            return builderM.k();
        }

        public static ImmutableSet e1(SingletonCImpl singletonCImpl) {
            ReleaseModule releaseModule = singletonCImpl.c;
            AppConfig appConfig = (AppConfig) singletonCImpl.W0.get();
            releaseModule.getClass();
            Intrinsics.h(appConfig, "appConfig");
            return ImmutableSet.q(SetsKt.c(new RestApiBaseUrlInterceptor(appConfig)));
        }

        public static ImmutableSet f1(SingletonCImpl singletonCImpl) {
            singletonCImpl.getClass();
            ImmutableSet.Builder builderM = ImmutableSet.m(36);
            singletonCImpl.b.getClass();
            builderM.j(CollectionsKt.L0(ShopAppFeature.f));
            EnumEntries enumEntries = MoreFeature.g;
            builderM.j(CollectionsKt.L0(enumEntries));
            builderM.j(CollectionsKt.L0(KeycloakAuthFeature.f));
            singletonCImpl.f.getClass();
            builderM.j(CollectionsKt.L0(BaseShopAppFeature.x0));
            singletonCImpl.g.getClass();
            builderM.j(CollectionsKt.L0(RewardsBaseFeature.u));
            singletonCImpl.h.getClass();
            builderM.j(CollectionsKt.L0(ShopBuyAgainFeature.g));
            singletonCImpl.i.getClass();
            builderM.j(CollectionsKt.L0(CatalogueFeature.i));
            singletonCImpl.j.getClass();
            builderM.j(CollectionsKt.L0(DeliveryAddressFeature.e));
            singletonCImpl.k.getClass();
            builderM.j(CollectionsKt.L0(EditOrderFeature.f));
            builderM.j(CollectionsKt.L0(BaseFeature.s));
            builderM.j(SetsKt.i(InboxFeature.d));
            builderM.j(CollectionsKt.L0(ShopCartFeature.k));
            builderM.j(CollectionsKt.L0(SpecialsHomeFeature.j));
            singletonCImpl.l.getClass();
            builderM.j(CollectionsKt.L0(HomeFeature.l));
            singletonCImpl.m.getClass();
            builderM.j(CollectionsKt.L0(InStoreWifiFeature.f));
            singletonCImpl.n.getClass();
            builderM.j(CollectionsKt.L0(InstoreNavigationFeature.g));
            singletonCImpl.o.getClass();
            builderM.j(CollectionsKt.L0(InstorePresenceFeature.f));
            singletonCImpl.p.getClass();
            builderM.j(CollectionsKt.L0(LegacyShopAppFeature.e));
            singletonCImpl.q.getClass();
            builderM.j(CollectionsKt.L0(enumEntries));
            singletonCImpl.r.getClass();
            builderM.j(CollectionsKt.L0(OliveVoiceFeature.e));
            singletonCImpl.s.getClass();
            builderM.j(CollectionsKt.L0(ProductFeature.i));
            singletonCImpl.t.getClass();
            builderM.j(CollectionsKt.L0(ProductDetailsFeature.g));
            singletonCImpl.u.getClass();
            builderM.j(CollectionsKt.L0(PromotionBannerFeature.e));
            builderM.j(RecipesAppModule_ProvideRecipesFeatureFactory.a(singletonCImpl.v));
            singletonCImpl.w.getClass();
            builderM.j(CollectionsKt.L0(RewardsCardFeature.e));
            builderM.a((Feature) singletonCImpl.J0.get());
            singletonCImpl.y.getClass();
            builderM.j(SetsKt.i(ShowAdPreferencesFeature.d));
            singletonCImpl.z.getClass();
            builderM.j(CollectionsKt.L0(AskOliveFeatures.i));
            singletonCImpl.A.getClass();
            builderM.j(CollectionsKt.L0(CheckoutFeature.q));
            singletonCImpl.B.getClass();
            builderM.j(CollectionsKt.L0(ShoppingListsFeature.n));
            singletonCImpl.C.getClass();
            builderM.j(CollectionsKt.L0(MarketplaceFeature.h));
            singletonCImpl.D.getClass();
            builderM.j(CollectionsKt.L0(MyOrdersFeature.r));
            singletonCImpl.E.getClass();
            builderM.j(CollectionsKt.L0(ScanAndGoFeature.j));
            singletonCImpl.F.getClass();
            builderM.j(CollectionsKt.L0(WPayFeature.h));
            singletonCImpl.G.getClass();
            builderM.a(TigerNewFeature.d);
            singletonCImpl.H.getClass();
            builderM.j(CollectionsKt.L0(VocFeature.f));
            return builderM.k();
        }

        public static ImmutableSet g1(SingletonCImpl singletonCImpl) {
            DeviceFingerprintAppModule deviceFingerprintAppModule = singletonCImpl.L;
            BotmanagerInteractor botmanagerInteractorK = singletonCImpl.k();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            singletonCImpl.b.getClass();
            ShopAppFeature shopAppFeature = ShopAppFeature.d;
            BotmanagerOkHttpInterceptor botmanagerOkHttpInterceptor = new BotmanagerOkHttpInterceptor(featureToggleManager, botmanagerInteractorK);
            deviceFingerprintAppModule.getClass();
            Interceptor interceptor = (Interceptor) singletonCImpl.d1.get();
            singletonCImpl.c.getClass();
            return ImmutableSet.o(4, botmanagerOkHttpInterceptor, interceptor, new GraphQlPreprocessorInterceptor(), new GraphQlPerformanceTrackingInterceptor());
        }

        public static ImmutableSet h1(SingletonCImpl singletonCImpl) {
            singletonCImpl.getClass();
            ImmutableSet.Builder builderM = ImmutableSet.m(3);
            builderM.a((Pair) singletonCImpl.z1.get());
            builderM.a((Pair) singletonCImpl.A1.get());
            singletonCImpl.d.getClass();
            Set set = Collections.EMPTY_SET;
            Intrinsics.g(set, "emptySet(...)");
            builderM.j(set);
            return builderM.k();
        }

        public static ImmutableSet i1(SingletonCImpl singletonCImpl) {
            singletonCImpl.getClass();
            ImmutableSet.Builder builderM = ImmutableSet.m(7);
            CollectionModeModule collectionModeModule = singletonCImpl.P;
            CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) singletonCImpl.q1.get();
            collectionModeModule.getClass();
            Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
            builderM.a(collectionModeInteractor);
            EditOrderModule editOrderModule = singletonCImpl.k;
            EditOrderInteractor editOrderInteractor = (EditOrderInteractor) singletonCImpl.L1.get();
            SubscriptionAnalyticsDataInteractor subscriptionAnalyticsDataInteractor = (SubscriptionAnalyticsDataInteractor) singletonCImpl.M1.get();
            editOrderModule.getClass();
            Intrinsics.h(editOrderInteractor, "editOrderInteractor");
            Intrinsics.h(subscriptionAnalyticsDataInteractor, "subscriptionAnalyticsDataInteractor");
            builderM.j(ArraysKt.r0(new PersistentMetadataProvider[]{editOrderInteractor, subscriptionAnalyticsDataInteractor}));
            AdobeAnalyticsInteractor adobeAnalyticsInteractor = (AdobeAnalyticsInteractor) singletonCImpl.a1.get();
            Intrinsics.h(adobeAnalyticsInteractor, "adobeAnalyticsInteractor");
            builderM.j(SetsKt.i(adobeAnalyticsInteractor));
            InStoreWifiAppModule inStoreWifiAppModule = singletonCImpl.m;
            WiFiStoreDetailsAnalyticsProvider wiFiStoreDetailsAnalyticsProvider = (WiFiStoreDetailsAnalyticsProvider) singletonCImpl.N1.get();
            inStoreWifiAppModule.getClass();
            Intrinsics.h(wiFiStoreDetailsAnalyticsProvider, "wiFiStoreDetailsAnalyticsProvider");
            builderM.j(SetsKt.i(wiFiStoreDetailsAnalyticsProvider));
            InstorePresenceAppModule instorePresenceAppModule = singletonCImpl.o;
            InstorePresenceAnalyticsProvider instorePresenceAnalyticsProvider = (InstorePresenceAnalyticsProvider) singletonCImpl.O1.get();
            instorePresenceAppModule.getClass();
            Intrinsics.h(instorePresenceAnalyticsProvider, "instorePresenceAnalyticsProvider");
            builderM.j(SetsKt.i(instorePresenceAnalyticsProvider));
            builderM.j(RewardsAccountAppModule_ProvideBaseRewardsAccountPersistentMetadataProvidersFactory.provideBaseRewardsAccountPersistentMetadataProviders(singletonCImpl.S, (RewardsAccountInteractor) singletonCImpl.Y1.get()));
            ShopAuthAppModule shopAuthAppModule = singletonCImpl.f4159a;
            ShopAccountInteractor accountInteractorImpl = (ShopAccountInteractor) singletonCImpl.Y0.get();
            shopAuthAppModule.getClass();
            Intrinsics.h(accountInteractorImpl, "accountInteractorImpl");
            builderM.j(SetsKt.i(accountInteractorImpl));
            return builderM.k();
        }

        public static ImmutableSet j1(SingletonCImpl singletonCImpl) {
            singletonCImpl.getClass();
            ImmutableSet.Builder builderM = ImmutableSet.m(4);
            singletonCImpl.f.getClass();
            builderM.j(CollectionsKt.L0(ShopRemoteConfig.v));
            singletonCImpl.g.getClass();
            builderM.j(CollectionsKt.L0(RewardsRemoteConfig.i));
            singletonCImpl.m.getClass();
            builderM.j(CollectionsKt.L0(InStoreWiFiNotificationHelper.InStoreWifiForShopRemoteConfig.f));
            singletonCImpl.E.getClass();
            builderM.j(CollectionsKt.L0(ScanAndGoRemoteConfig.f));
            return builderM.k();
        }

        public static SharedPreferences k1(SingletonCImpl singletonCImpl) {
            BaseDataModule baseDataModule = singletonCImpl.I;
            Application applicationA = Contexts.a(singletonCImpl.e.f23776a);
            baseDataModule.getClass();
            return androidx.constraintlayout.core.state.a.b(applicationA.getPackageName(), ".firebase", applicationA, 0, "getSharedPreferences(...)");
        }

        public static SharedPreferences l1(SingletonCImpl singletonCImpl) {
            BaseDataModule baseDataModule = singletonCImpl.I;
            Application applicationA = Contexts.a(singletonCImpl.e.f23776a);
            baseDataModule.getClass();
            return androidx.constraintlayout.core.state.a.b(applicationA.getPackageName(), ".adobe.analytics", applicationA, 0, "getSharedPreferences(...)");
        }

        public static SharedPreferences m1(SingletonCImpl singletonCImpl) {
            BaseDataModule baseDataModule = singletonCImpl.I;
            Application applicationA = Contexts.a(singletonCImpl.e.f23776a);
            baseDataModule.getClass();
            SharedPreferences sharedPreferences = applicationA.getApplicationContext().getSharedPreferences("accountPrefs", 0);
            Intrinsics.g(sharedPreferences, "getSharedPreferences(...)");
            return sharedPreferences;
        }

        public static ShopAppRegionRepository o1(SingletonCImpl singletonCImpl) {
            ShopAppRegionModule shopAppRegionModule = singletonCImpl.J;
            Context context = singletonCImpl.e.f23776a;
            Preconditions.d(context);
            ShopAppFlavorInteractor shopAppFlavorInteractor = (ShopAppFlavorInteractor) singletonCImpl.N0.get();
            shopAppRegionModule.getClass();
            Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
            return new ShopAppRegionRepository(context, shopAppFlavorInteractor);
        }

        public static ShoppingModeSelectorRepository p1(SingletonCImpl singletonCImpl) {
            return new ShoppingModeSelectorRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final DispatchingAndroidInjector A() {
            ImmutableMap.Builder builderB = ImmutableMap.b(12);
            builderB.c(SngInitializerActivity.class, this.i3);
            builderB.c(TermsConditionsActivity.class, this.j3);
            builderB.c(MessageActivity.class, this.k3);
            builderB.c(ContactUsActivity.class, this.l3);
            builderB.c(ParkingVoucherActivity.class, this.m3);
            builderB.c(OnBoardingActivity.class, this.n3);
            builderB.c(AvailableStoresActivity.class, this.o3);
            builderB.c(AvailableStoreListActivity.class, this.p3);
            builderB.c(SngEntryActivity.class, this.q3);
            builderB.c(SngRewardsSetupActivity.class, this.r3);
            builderB.c(SetupCompleteActivity.class, this.s3);
            builderB.c(AddPaymentSetupActivity.class, this.t3);
            return DispatchingAndroidInjector_Factory.a(builderB.a(true), ImmutableMap.l());
        }

        public final SupportedLinksHelper A1() {
            return new SupportedLinksHelper((FeatureToggleManager) this.P0.get(), (ShopAppRegionInteractor) this.O0.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final LegacyShopAnalyticsManager B() {
            return (LegacyShopAnalyticsManager) this.r1.get();
        }

        public final DefaultTokenProvider B1() throws NumberFormatException {
            String strW1 = w1();
            ScanNGoModule scanNGoModule = this.O;
            scanNGoModule.getClass();
            TokenRefreshService tokenRefreshServiceA = ScanNGoModule_GetRefreshTokenServiceFactory.a(scanNGoModule, strW1, ScanNGoModule_CreateHttpRefreshClientFactory.a(scanNGoModule, ScanNGoModule_CreateBaseHttpClientFactory.a(scanNGoModule), ScanNGoModule_GetSngAPIKeyInterceptorFactory.a(scanNGoModule, (ScanAndGoConfig) this.P2.get())));
            DigitalPayProvider digitalPayProvider = (DigitalPayProvider) this.R2.get();
            DefaultLocalTokenProvider defaultLocalTokenProviderU1 = u1();
            ApplicationContextModule applicationContextModule = this.e;
            Application applicationA = Contexts.a(applicationContextModule.f23776a);
            OkHttpClient okHttpClient = (OkHttpClient) this.f1.get();
            AppConfig appConfig = (AppConfig) this.W0.get();
            SchedulersProvider schedulersProvider = (SchedulersProvider) this.o1.get();
            ShopScanAndGoAppModule shopScanAndGoAppModule = this.E;
            return ScanNGoModule_GetTokenProviderFactory.a(scanNGoModule, tokenRefreshServiceA, digitalPayProvider, defaultLocalTokenProviderU1, ShopScanAndGoAppModule_ProvideOnCredentialsExpiredFactory.a(shopScanAndGoAppModule, ShopScanAndGoAppModule_ProvideScanAndGoInteractorFactory.a(shopScanAndGoAppModule, ShopScanAndGoAppModule_ProvideScanAndGoRepositoryFactory.a(shopScanAndGoAppModule, applicationA, ShopScanAndGoAppModule_ProvideScanAndGoApiFactory.a(shopScanAndGoAppModule, okHttpClient, appConfig, schedulersProvider, ShopScanAndGoAppModule_ProvideGsonFactory.a(shopScanAndGoAppModule)), (DeviceInfoProvider) this.T2.get(), ShopScanAndGoAppModule_ProvidesSharedPreferencesFactory.a(shopScanAndGoAppModule, Contexts.a(applicationContextModule.f23776a))), s1(), u1(), ShopScanAndGoAppModule_ProvideLocalStorageFactory.a(shopScanAndGoAppModule, ShopScanAndGoAppModule_ProvideGsonFactory.a(shopScanAndGoAppModule), ShopScanAndGoAppModule_ProvidesSharedPreferencesFactory.a(shopScanAndGoAppModule, Contexts.a(applicationContextModule.f23776a))), (DigitalPayProvider) this.R2.get(), (RewardsAccountInteractor) this.Y1.get())), (ScanAndGoFeatureConfig) this.S2.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final KeycloakTokenAuthenticator C() {
            return (KeycloakTokenAuthenticator) this.R0.get();
        }

        @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
        public final Set D() {
            return ImmutableSet.w();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final Auth0AuthManager E() {
            return (Auth0AuthManager) this.l1.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final AdobeAnalyticsInteractor F() {
            return (AdobeAnalyticsInteractor) this.a1.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final androidx.work.Configuration G() {
            return (androidx.work.Configuration) this.I2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final Bark.Barker H() {
            return (Bark.Barker) this.x3.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final FeatureToggleManager I() {
            return (FeatureToggleManager) this.P0.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final ShopAccountInteractor J() {
            return (ShopAccountInteractor) this.Y0.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final AnalyticsProvider K() {
            return (AnalyticsProvider) this.u2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final GuestLoginInteractorImpl L() throws NumberFormatException {
            OkHttpClient okHttpClient = (OkHttpClient) this.f1.get();
            AppConfig appConfig = (AppConfig) this.W0.get();
            SchedulersProvider schedulersProvider = (SchedulersProvider) this.o1.get();
            Gson gson = (Gson) this.G0.get();
            this.Y.getClass();
            Intrinsics.h(okHttpClient, "okHttpClient");
            Intrinsics.h(appConfig, "appConfig");
            Intrinsics.h(schedulersProvider, "schedulersProvider");
            Intrinsics.h(gson, "gson");
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.b(appConfig.getL());
            builder.f27005a = okHttpClient;
            builder.c.add(GsonConverterFactory.c(gson));
            builder.a(RxJava2CallAdapterFactory.d(schedulersProvider.d()));
            Object objB = builder.c().b(GuestLoginApi.class);
            Intrinsics.g(objB, "create(...)");
            GuestLoginRepository guestLoginRepository = new GuestLoginRepository((GuestLoginApi) objB);
            SchedulersProvider schedulersProvider2 = (SchedulersProvider) this.o1.get();
            LegacyShoppingModeRepository shoppingModeRepository = (LegacyShoppingModeRepository) this.E1.get();
            ShopAccountInteractor accountInteractor = (ShopAccountInteractor) this.Y0.get();
            TrolleyInteractor trolleyInteractor = (TrolleyInteractor) this.h2.get();
            AppConfigurationInteractor appConfigurationInteractor = (AppConfigurationInteractor) this.P1.get();
            CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) this.q1.get();
            PickUpLocatorRepository pickUpLocatorRepository = (PickUpLocatorRepository) this.I1.get();
            ShopAppRegionInteractor shopAppRegionInteractor = (ShopAppRegionInteractor) this.O0.get();
            Intrinsics.h(schedulersProvider2, "schedulersProvider");
            Intrinsics.h(shoppingModeRepository, "shoppingModeRepository");
            Intrinsics.h(accountInteractor, "accountInteractor");
            Intrinsics.h(trolleyInteractor, "trolleyInteractor");
            Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
            Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
            Intrinsics.h(pickUpLocatorRepository, "pickUpLocatorRepository");
            Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
            return new GuestLoginInteractorImpl(guestLoginRepository, schedulersProvider2, shoppingModeRepository, accountInteractor, trolleyInteractor, appConfigurationInteractor, collectionModeInteractor, pickUpLocatorRepository, shopAppRegionInteractor);
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final SharedPreferences M() {
            Application applicationA = Contexts.a(this.e.f23776a);
            this.I.getClass();
            return androidx.constraintlayout.core.state.a.b(applicationA.getPackageName(), ".checkout", applicationA, 0, "getSharedPreferences(...)");
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final SseNetworkTransport N() {
            return (SseNetworkTransport) this.y1.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final InStoreWifiInteractor O() {
            return (InStoreWifiInteractor) this.M2.get();
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public final ActivityRetainedComponentBuilder P() {
            return new ActivityRetainedCBuilder(this.F0);
        }

        @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
        public final ServiceComponentBuilder a() {
            return new ServiceCBuilder(this.F0);
        }

        @Override // au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationReceiver_GeneratedInjector
        public final void b(InStoreWiFiNotificationReceiver inStoreWiFiNotificationReceiver) {
            InStoreWiFiNotificationReceiver_MembersInjector.a(inStoreWiFiNotificationReceiver, (InStoreWiFiNotificationHelper) this.N2.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint, com.woolworths.scanlibrary.di.component.ScanNGoComponent, au.com.woolworths.base.wallet.ocr.DependencyAccessor
        public final AnalyticsManager c() {
            return (AnalyticsManager) this.r2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final UserManager d() {
            return (UserManager) this.X2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final WxidClientImpl e() {
            ApolloClient apolloClient = (ApolloClient) this.C1.get();
            this.f0.getClass();
            Intrinsics.h(apolloClient, "apolloClient");
            ShopWxidFetcher shopWxidFetcher = new ShopWxidFetcher(apolloClient);
            this.R.getClass();
            Context context = this.e.f23776a;
            Preconditions.d(context);
            return new WxidClientImpl(shopWxidFetcher, (DataStore) WxidDataStoreKt.b.getValue(context, WxidDataStoreKt.f8938a[0]));
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final FirebaseCrashlytics f() {
            return FirebaseCrashlyticsKt.a();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final MedalliaInteractor g() {
            return (MedalliaInteractor) this.t2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final CollectionModeInteractor h() {
            return (CollectionModeInteractor) this.q1.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final InStoreWiFiNotificationHelper i() {
            return (InStoreWiFiNotificationHelper) this.N2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final LinkNavigator j() {
            return (LinkNavigator) this.s2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final BotmanagerInteractor k() {
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) this.P0.get();
            this.b.getClass();
            ShopRemoteConfig shopRemoteConfig = ShopRemoteConfig.e;
            return new BotmanagerInteractor(featureToggleManager, (AppConfig) this.W0.get(), (FirebasePerfMonitor) this.Z0.get(), (Gson) this.g1.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final ShoppingListSyncInteractor l() {
            return (ShoppingListSyncInteractor) this.L2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final DeviceAccessibilityTracker m() {
            return (DeviceAccessibilityTracker) this.Z1.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final PaymentServicesInteractor n() {
            return (PaymentServicesInteractor) this.e2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final AccessibilityAnalytics o() {
            return (AccessibilityAnalytics) this.v2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final TrafficDriversInteractor p() {
            return (TrafficDriversInteractor) this.u3.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final SwrveInteractor q() {
            return (SwrveInteractor) this.j2.get();
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final SchedulersProvider r() {
            return (SchedulersProvider) this.o1.get();
        }

        public final FetchScanAndGoInteractor r1() {
            ApplicationContextModule applicationContextModule = this.e;
            Application applicationA = Contexts.a(applicationContextModule.f23776a);
            OkHttpClient okHttpClient = (OkHttpClient) this.f1.get();
            AppConfig appConfig = (AppConfig) this.W0.get();
            SchedulersProvider schedulersProvider = (SchedulersProvider) this.o1.get();
            BffScanNGoModule bffScanNGoModule = this.e0;
            return BffScanNGoModule_ProvideScanAndGoInteractorFactory.a(bffScanNGoModule, BffScanNGoModule_ProvideBffScanAndGoRepositoryFactory.a(bffScanNGoModule, applicationA, BffScanNGoModule_ProvideScanAndGoBffApiFactory.a(bffScanNGoModule, okHttpClient, appConfig, schedulersProvider, BffScanNGoModule_ProvideGsonFactory.a(bffScanNGoModule)), (DeviceInfoProvider) this.T2.get(), ShopScanAndGoAppModule_ProvidesSharedPreferencesFactory.a(this.E, Contexts.a(applicationContextModule.f23776a))), s1(), u1(), BffScanNGoModule_ProvideLocalStorageFactory.a(bffScanNGoModule, BffScanNGoModule_ProvideGsonFactory.a(bffScanNGoModule), (SharedPreferences) this.s1.get()), (DigitalPayProvider) this.R2.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final ShopAppTokenAuthenticator s() {
            return (ShopAppTokenAuthenticator) this.I0.get();
        }

        public final AuthenticatedUser s1() {
            return ScanNGoModule_GetAuthenticatedUserInfoFactory.a(this.O, v1());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final RewardsAccountInteractor t() {
            return (RewardsAccountInteractor) this.Y1.get();
        }

        public final DeviceRegistrationUC t1() {
            ScanNGoRepository scanNGoRepositoryX1 = x1();
            ScanNGoModule scanNGoModule = this.O;
            return ScanNGoModule_ProvidesDeviceRegistrationUCFactory.a(scanNGoModule, scanNGoRepositoryX1, ScanNGoModule_GetSchedulerFactory.a(scanNGoModule), (DeviceInfoProvider) this.T2.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor u() {
            return (au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor) this.F3.get();
        }

        public final DefaultLocalTokenProvider u1() {
            return ScanNGoModule_GetLocalTokenProviderFactory.a(this.O, v1());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final FirebasePerfMonitor v() {
            return (FirebasePerfMonitor) this.Z0.get();
        }

        public final SecuredSharedPreference v1() {
            return ScanNGoModule_GetSecuredSharedPreferenceFactory.a(this.O, (Context) this.k1.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final SubscriptionAnalyticsDataInteractor w() {
            return (SubscriptionAnalyticsDataInteractor) this.M1.get();
        }

        public final String w1() {
            return ScanNGoModule_GetHostUrlFactory.a(this.O, (SharedPreferences) this.s1.get(), (ScanAndGoConfig) this.P2.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final AppConfigurationInteractor x() {
            return (AppConfigurationInteractor) this.P1.get();
        }

        public final ScanNGoRepository x1() {
            ScanNGoModule scanNGoModule = this.O;
            scanNGoModule.getClass();
            OkHttpClient okHttpClientA = ScanNGoModule_CreateBaseHttpClientFactory.a(scanNGoModule);
            DefaultLocalTokenProvider defaultLocalTokenProviderU1 = u1();
            ScanNGoModule scanNGoModule2 = this.O;
            return ScanNGoModule_GetRemoteSourceFactory.a(scanNGoModule, ScanNGoModule_GetApigeeServicesFactory.a(scanNGoModule, ScanNGoModule_CreateSngHttpClientFactory.a(scanNGoModule, okHttpClientA, ScanNGoModule_GetSngAuthorizationHeaderInterceptorFactory.a(scanNGoModule2, defaultLocalTokenProviderU1), ScanNGoModule_GetSngAPIKeyInterceptorFactory.a(scanNGoModule2, (ScanAndGoConfig) this.P2.get()), ScanNGoModule_GetSngDisableInAppPaymentToggleInterceptorFactory.a(scanNGoModule2, (FeatureToggleManager) this.P0.get()), (TokenAuthenticator) this.U2.get()), ScanNGoModule_ProvideGsonFactory.a(scanNGoModule2), w1()), (FeatureToggleManager) this.P0.get());
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final SnGViewModelFactory y() {
            ImmutableMap.Builder builderB = ImmutableMap.b(8);
            builderB.c(ExitScanCodeViewModel.class, this.Y2);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchViewModel.class, this.Z2);
            builderB.c(AvailableStoreViewModel.class, this.a3);
            builderB.c(SngEntryViewModel.class, this.c3);
            builderB.c(SngRewardSetupViewModel.class, this.d3);
            builderB.c(SetupUpCompleteViewModel.class, this.e3);
            builderB.c(AddPaymentSetupViewModel.class, this.f3);
            builderB.c(ScannerViewModel.class, this.h3);
            return ViewModelModule_ProvidesViewModelFactoryFactory.a(this.d0, builderB.a(true));
        }

        public final SharedPreferences y1() {
            Application applicationA = Contexts.a(this.e.f23776a);
            this.I.getClass();
            return androidx.constraintlayout.core.state.a.b(applicationA.getPackageName(), "_preferences", applicationA, 0, "getSharedPreferences(...)");
        }

        @Override // au.com.woolworths.android.onesite.app.di.ShopEntryPoint
        public final TimberDynatraceLogger z() {
            return new TimberDynatraceLogger();
        }

        public final StoreLocatorApiInterface z1() throws NumberFormatException {
            AppConfig appConfig = (AppConfig) this.W0.get();
            SchedulersProvider schedulersProvider = (SchedulersProvider) this.o1.get();
            OkHttpClient okHttpClient = (OkHttpClient) this.f1.get();
            Gson gson = (Gson) this.G0.get();
            this.Q.getClass();
            Intrinsics.h(appConfig, "appConfig");
            Intrinsics.h(schedulersProvider, "schedulersProvider");
            Intrinsics.h(okHttpClient, "okHttpClient");
            Intrinsics.h(gson, "gson");
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.b(appConfig.getL());
            builder.f27005a = okHttpClient;
            builder.c.add(new LoggingConverterFactory(GsonConverterFactory.c(gson)));
            builder.a(RxJava2CallAdapterFactory.d(schedulersProvider.d()));
            Object objB = builder.c().b(StoreLocatorApiInterface.class);
            Intrinsics.g(objB, "create(...)");
            return (StoreLocatorApiInterface) objB;
        }
    }

    public static final class SngEntryActivitySubcomponentFactory implements ActivityBuilderModule_BindSngEntryActivity.SngEntryActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4161a;

        public SngEntryActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4161a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new SngEntryActivitySubcomponentImpl(this.f4161a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class SngEntryActivitySubcomponentImpl implements ActivityBuilderModule_BindSngEntryActivity.SngEntryActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4162a;

        public SngEntryActivitySubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4162a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            SngEntryActivity sngEntryActivity = (SngEntryActivity) obj;
            SingletonCImpl singletonCImpl = this.f4162a;
            sngEntryActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            sngEntryActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            sngEntryActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            sngEntryActivity.z = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            BffScanNGoModule bffScanNGoModule = singletonCImpl.e0;
            FetchScanAndGoInteractor fetchScanAndGoInteractorR1 = singletonCImpl.r1();
            RewardsAccountInteractor rewardsAccountInteractor = (RewardsAccountInteractor) singletonCImpl.Y1.get();
            SchedulersProvider schedulersProvider = (SchedulersProvider) singletonCImpl.o1.get();
            NetworkExceptions networkExceptions = (NetworkExceptions) singletonCImpl.m1.get();
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            bffScanNGoModule.getClass();
            Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
            Intrinsics.h(schedulersProvider, "schedulersProvider");
            Intrinsics.h(networkExceptions, "networkExceptions");
            Intrinsics.h(analyticsManager, "analyticsManager");
            sngEntryActivity.E = new SngLauncherImpl(fetchScanAndGoInteractorR1, rewardsAccountInteractor, schedulersProvider, networkExceptions, analyticsManager, new ScanAndGoNavAdapterImpl());
            sngEntryActivity.F = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            sngEntryActivity.G = new LandingContentProvider((Context) singletonCImpl.k1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }
    }

    public static final class SngInitializerActivitySubcomponentFactory implements ActivityBuilderModule_BindSplashActivity.SngInitializerActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4163a;

        public SngInitializerActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4163a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            SplashActivityModule splashActivityModule = new SplashActivityModule();
            return new SngInitializerActivitySubcomponentImpl(this.f4163a, splashActivityModule, (SngInitializerActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class SngInitializerActivitySubcomponentImpl implements ActivityBuilderModule_BindSplashActivity.SngInitializerActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SngInitializerActivity f4164a;
        public final SingletonCImpl b;

        public SngInitializerActivitySubcomponentImpl(SingletonCImpl singletonCImpl, SplashActivityModule splashActivityModule, SngInitializerActivity sngInitializerActivity) {
            this.b = singletonCImpl;
            this.f4164a = sngInitializerActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            SngInitializerActivity sngInitializerActivity = (SngInitializerActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            UserManager userManager = (UserManager) singletonCImpl.X2.get();
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O);
            DeviceInfoProvider deviceInfoProvider = (DeviceInfoProvider) singletonCImpl.T2.get();
            Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
            GetServiceMessageUC getServiceMessageUC = new GetServiceMessageUC(scanNGoRepositoryX1, deviceInfoProvider, schedulerA);
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            ScanAndGoFeatureConfig sngFeatureConfig = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            Intrinsics.h(userManager, "userManager");
            Intrinsics.h(analyticsManager, "analyticsManager");
            Intrinsics.h(sngFeatureConfig, "sngFeatureConfig");
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            sngInitializerActivity.t = new SplashPresenter(this.f4164a, userManager, getServiceMessageUC, analyticsManager, sngFeatureConfig, featureToggleManager);
            sngInitializerActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            sngInitializerActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            sngInitializerActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            sngInitializerActivity.z = (PayClient) singletonCImpl.Q2.get();
            sngInitializerActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            sngInitializerActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
        }
    }

    public static final class SngRewardsSetupActivitySubcomponentFactory implements ActivityBuilderModule_BindSngRewardsSetupActivity.SngRewardsSetupActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4165a;

        public SngRewardsSetupActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4165a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new SngRewardsSetupActivitySubcomponentImpl(this.f4165a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class SngRewardsSetupActivitySubcomponentImpl implements ActivityBuilderModule_BindSngRewardsSetupActivity.SngRewardsSetupActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4166a;

        public SngRewardsSetupActivitySubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4166a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            SngRewardsSetupActivity sngRewardsSetupActivity = (SngRewardsSetupActivity) obj;
            SingletonCImpl singletonCImpl = this.f4166a;
            sngRewardsSetupActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            sngRewardsSetupActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            sngRewardsSetupActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            sngRewardsSetupActivity.z = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class StepUpDialogFragmentSubcomponentFactory implements CheckOutFragmentProviderModule_ProvideStepUpDialogFragmentFactory.StepUpDialogFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4167a;

        public StepUpDialogFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl, CheckOutActivitySubcomponentImpl checkOutActivitySubcomponentImpl) {
            this.f4167a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            return new StepUpDialogFragmentSubcomponentImpl(this.f4167a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class StepUpDialogFragmentSubcomponentImpl implements CheckOutFragmentProviderModule_ProvideStepUpDialogFragmentFactory.StepUpDialogFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4168a;

        public StepUpDialogFragmentSubcomponentImpl(SingletonCImpl singletonCImpl) {
            this.f4168a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            ((StepUpDialogFragment) obj).i = (PayClient) this.f4168a.Q2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class TapActivitySubcomponentFactory implements UserActivityBuilderModule_BindTapOnActivity.TapActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4169a;
        public final UserComponentImpl b;

        public TapActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4169a = singletonCImpl;
            this.b = userComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            TapActivityModule tapActivityModule = new TapActivityModule();
            return new TapActivitySubcomponentImpl(this.f4169a, this.b, tapActivityModule, (TapActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class TapActivitySubcomponentImpl implements UserActivityBuilderModule_BindTapOnActivity.TapActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final TapActivity f4170a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;
        public final Provider d;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4171a;
            public final UserComponentImpl b;
            public final TapActivitySubcomponentImpl c;

            public SwitchingProvider(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, TapActivitySubcomponentImpl tapActivitySubcomponentImpl) {
                this.f4171a = singletonCImpl;
                this.b = userComponentImpl;
                this.c = tapActivitySubcomponentImpl;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return new TapOnFragmentSubcomponentFactory(this.f4171a, this.b, this.c);
            }
        }

        public TapActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, TapActivityModule tapActivityModule, TapActivity tapActivity) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.f4170a = tapActivity;
            this.d = new SwitchingProvider(singletonCImpl, userComponentImpl, this);
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            TapActivity tapActivity = (TapActivity) obj;
            UserComponentImpl userComponentImpl = this.c;
            User authUser = (User) userComponentImpl.m.get();
            SingletonCImpl singletonCImpl = this.b;
            MedalliaInteractor medalliaInteractor = (MedalliaInteractor) singletonCImpl.t2.get();
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            SurveyManager surveyManager = (SurveyManager) singletonCImpl.W2.get();
            DeviceInfoProvider deviceInfoProvider = (DeviceInfoProvider) singletonCImpl.T2.get();
            DeviceRegistrationUC deviceRegistrationUCT1 = singletonCImpl.t1();
            FirebaseApp firebaseApp = (FirebaseApp) singletonCImpl.O2.get();
            Intrinsics.h(authUser, "authUser");
            Intrinsics.h(medalliaInteractor, "medalliaInteractor");
            Intrinsics.h(analyticsManager, "analyticsManager");
            Intrinsics.h(surveyManager, "surveyManager");
            Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
            Intrinsics.h(firebaseApp, "firebaseApp");
            tapActivity.t = new TapPresenter(this.f4170a, authUser, analyticsManager, medalliaInteractor, surveyManager, deviceInfoProvider, deviceRegistrationUCT1, firebaseApp);
            tapActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            tapActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            tapActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            tapActivity.z = (PayClient) singletonCImpl.Q2.get();
            tapActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            tapActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            ImmutableMap.Builder builderB = ImmutableMap.b(21);
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            builderB.c(TapActivity.class, userComponentImpl.c);
            builderB.c(AddPaymentActivity.class, userComponentImpl.d);
            builderB.c(UpdateCreditCardActivity.class, userComponentImpl.e);
            builderB.c(MyAccountActivity.class, userComponentImpl.f);
            builderB.c(TransactionListActivity.class, userComponentImpl.g);
            builderB.c(ReceiptActivity.class, userComponentImpl.h);
            builderB.c(ExitScanCodeActivity.class, userComponentImpl.i);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchActivity.class, userComponentImpl.j);
            builderB.c(TapOnFragment.class, this.d);
            tapActivity.G = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
            tapActivity.I = singletonCImpl.s1();
            tapActivity.J = (LogoutManager) userComponentImpl.n.get();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            tapActivity.K = ScanNGoModule_GetFaqUsUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            tapActivity.L = ScanNGoModule_GetTnCUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            tapActivity.M = ScanNGoModule_GetPrivacyUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            tapActivity.N = ScanNGoModule_GetCollectionUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            tapActivity.O = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class TapOnFragmentSubcomponentFactory implements TapFragmentProviderModule_ProvideFragmentFactory.TapOnFragmentSubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4172a;
        public final UserComponentImpl b;

        public TapOnFragmentSubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, TapActivitySubcomponentImpl tapActivitySubcomponentImpl) {
            this.f4172a = singletonCImpl;
            this.b = userComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            TapOnModule tapOnModule = new TapOnModule();
            return new TapOnFragmentSubcomponentImpl(this.f4172a, this.b, tapOnModule, (TapOnFragment) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class TapOnFragmentSubcomponentImpl implements TapFragmentProviderModule_ProvideFragmentFactory.TapOnFragmentSubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final TapOnFragment f4173a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;

        public TapOnFragmentSubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, TapOnModule tapOnModule, TapOnFragment tapOnFragment) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.f4173a = tapOnFragment;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            TapOnFragment tapOnFragment = (TapOnFragment) obj;
            SingletonCImpl singletonCImpl = this.b;
            AuthenticatedUser authenticatedUserS1 = singletonCImpl.s1();
            UserComponentImpl userComponentImpl = this.c;
            SessionInfo sessionInfo = (SessionInfo) userComponentImpl.k.get();
            CartSessionManager cartSessionManager = (CartSessionManager) userComponentImpl.l.get();
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            GetStoreDetailsUseCase getStoreDetailsUseCase = new GetStoreDetailsUseCase(scanNGoRepositoryX1, ScanNGoModule_GetSchedulerFactory.a(scanNGoModule));
            GetTapOnStoreDetailsUseCase getTapOnStoreDetailsUseCase = new GetTapOnStoreDetailsUseCase(singletonCImpl.x1(), ScanNGoModule_GetSchedulerFactory.a(scanNGoModule));
            UserModule userModule = userComponentImpl.f4181a;
            SingletonCImpl singletonCImpl2 = userComponentImpl.b;
            ScanNGoRepository scanNGoRepositoryX12 = singletonCImpl2.x1();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl2.O);
            userModule.getClass();
            GetParkingReceiptUC getParkingReceiptUC = new GetParkingReceiptUC(scanNGoRepositoryX12, schedulerA);
            DeviceInfoProvider deviceInfoProvider = (DeviceInfoProvider) singletonCImpl.T2.get();
            UserConfigurations userConfigurations = (UserConfigurations) singletonCImpl.V2.get();
            AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
            FirebaseApp firebaseApp = (FirebaseApp) singletonCImpl2.H3.get();
            userModule.getClass();
            Intrinsics.h(firebaseApp, "firebaseApp");
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
            Intrinsics.g(firebaseAuth, "getInstance(...)");
            FirebaseAuthenticationRepositoryImpl firebaseAuthenticationRepositoryImpl = new FirebaseAuthenticationRepositoryImpl(firebaseAuth);
            FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            DeviceFingerprintInteractor deviceFingerprintInteractor = (DeviceFingerprintInteractor) singletonCImpl.b3.get();
            DispatcherProvider dispatcherProvider = (DispatcherProvider) singletonCImpl.n1.get();
            FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlyticsKt.a();
            FirebasePerfMonitor firebasePerfMonitor = (FirebasePerfMonitor) singletonCImpl.Z0.get();
            ResourceResolverImpl resourceResolverImplA1 = SingletonCImpl.a1(singletonCImpl);
            Intrinsics.h(sessionInfo, "sessionInfo");
            Intrinsics.h(cartSessionManager, "cartSessionManager");
            Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
            Intrinsics.h(userConfigurations, "userConfigurations");
            Intrinsics.h(analyticsManager, "analyticsManager");
            Intrinsics.h(featureToggleManager, "featureToggleManager");
            Intrinsics.h(deviceFingerprintInteractor, "deviceFingerprintInteractor");
            Intrinsics.h(dispatcherProvider, "dispatcherProvider");
            Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
            tapOnFragment.d = new TapOnPresenter(this.f4173a, authenticatedUserS1, sessionInfo, getTapOnStoreDetailsUseCase, getStoreDetailsUseCase, getParkingReceiptUC, cartSessionManager, deviceInfoProvider, userConfigurations, firebaseAuthenticationRepositoryImpl, analyticsManager, featureToggleManager, deviceFingerprintInteractor, dispatcherProvider, firebaseCrashlyticsA, firebasePerfMonitor, resourceResolverImplA1);
            tapOnFragment.e = (UserManager) singletonCImpl.X2.get();
            singletonCImpl.y();
            tapOnFragment.f = (FeatureToggleManager) singletonCImpl.P0.get();
            tapOnFragment.g = (AnalyticsProvider) singletonCImpl.u2.get();
            tapOnFragment.h = (AnalyticsManager) singletonCImpl.r2.get();
            tapOnFragment.i = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            singletonCImpl.c.getClass();
            tapOnFragment.l = "";
            Context context = (Context) singletonCImpl.k1.get();
            Intrinsics.h(context, "context");
            tapOnFragment.m = new BlueCatsBeaconScanner(context);
            tapOnFragment.n = new PermissionFlagInteractorImpl(singletonCImpl.y1());
        }
    }

    public static final class TermsConditionsActivitySubcomponentFactory implements ActivityBuilderModule_BindTermsConditions.TermsConditionsActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4174a;

        public TermsConditionsActivitySubcomponentFactory(SingletonCImpl singletonCImpl) {
            this.f4174a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            TermsConditionsActivityModule termsConditionsActivityModule = new TermsConditionsActivityModule();
            return new TermsConditionsActivitySubcomponentImpl(this.f4174a, termsConditionsActivityModule, (TermsConditionsActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class TermsConditionsActivitySubcomponentImpl implements ActivityBuilderModule_BindTermsConditions.TermsConditionsActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final TermsConditionsActivity f4175a;
        public final SingletonCImpl b;

        public TermsConditionsActivitySubcomponentImpl(SingletonCImpl singletonCImpl, TermsConditionsActivityModule termsConditionsActivityModule, TermsConditionsActivity termsConditionsActivity) {
            this.b = singletonCImpl;
            this.f4175a = termsConditionsActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            TermsConditionsActivity termsConditionsActivity = (TermsConditionsActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            ScanNGoModule scanNGoModule = singletonCImpl.O;
            TermsNConditionUC termsNConditionUC = new TermsNConditionUC(scanNGoRepositoryX1, ScanNGoModule_GetSchedulerFactory.a(scanNGoModule));
            AuthenticatedUser authenticatedUserS1 = singletonCImpl.s1();
            UserConfigurations userConfigurations = (UserConfigurations) singletonCImpl.V2.get();
            DeviceInfoProvider deviceInfoProvider = (DeviceInfoProvider) singletonCImpl.T2.get();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(userConfigurations, "userConfigurations");
            Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            termsConditionsActivity.t = new TermsConditionsPresenter(this.f4175a, termsNConditionUC, authenticatedUserS1, userConfigurations, deviceInfoProvider, analyticsAggregator);
            termsConditionsActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            termsConditionsActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            termsConditionsActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            termsConditionsActivity.z = (PayClient) singletonCImpl.Q2.get();
            termsConditionsActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            termsConditionsActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
            termsConditionsActivity.I = ScanNGoModule_GetTnCUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            termsConditionsActivity.J = ScanNGoModule_GetPrivacyUrlFactory.a(scanNGoModule, singletonCImpl.w1());
            termsConditionsActivity.K = ScanNGoModule_GetCollectionUrlFactory.a(scanNGoModule, singletonCImpl.w1());
        }
    }

    /* loaded from: classes3.dex */
    public static final class TransactionListActivitySubcomponentFactory implements UserActivityBuilderModule_BindTransactionListActivity.TransactionListActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4176a;
        public final UserComponentImpl b;

        public TransactionListActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4176a = singletonCImpl;
            this.b = userComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            TransactionListActivityModule transactionListActivityModule = new TransactionListActivityModule();
            return new TransactionListActivitySubcomponentImpl(this.f4176a, this.b, transactionListActivityModule, (TransactionListActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class TransactionListActivitySubcomponentImpl implements UserActivityBuilderModule_BindTransactionListActivity.TransactionListActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final TransactionListActivity f4177a;
        public final SingletonCImpl b;
        public final UserComponentImpl c;

        public TransactionListActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, TransactionListActivityModule transactionListActivityModule, TransactionListActivity transactionListActivity) {
            this.b = singletonCImpl;
            this.c = userComponentImpl;
            this.f4177a = transactionListActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            TransactionListActivity transactionListActivity = (TransactionListActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            GetTransactionListUseCase getTransactionListUseCase = new GetTransactionListUseCase(singletonCImpl.x1(), ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O));
            GetReceiptWithCartIdUC getReceiptWithCartIdUCG = this.c.g();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            transactionListActivity.t = new TransactionListPresenter(this.f4177a, getTransactionListUseCase, getReceiptWithCartIdUCG, analyticsAggregator);
            transactionListActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            transactionListActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            transactionListActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            transactionListActivity.z = (PayClient) singletonCImpl.Q2.get();
            transactionListActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            transactionListActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class UpdateCreditCardActivitySubcomponentFactory implements UserActivityBuilderModule_BindUpdateCreditCardActivity.UpdateCreditCardActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4178a;

        public UpdateCreditCardActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl) {
            this.f4178a = singletonCImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            UpdateCreditCardActivityModule updateCreditCardActivityModule = new UpdateCreditCardActivityModule();
            return new UpdateCreditCardActivitySubcomponentImpl(this.f4178a, updateCreditCardActivityModule, (UpdateCreditCardActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class UpdateCreditCardActivitySubcomponentImpl implements UserActivityBuilderModule_BindUpdateCreditCardActivity.UpdateCreditCardActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCreditCardActivity f4179a;
        public final SingletonCImpl b;

        public UpdateCreditCardActivitySubcomponentImpl(SingletonCImpl singletonCImpl, UpdateCreditCardActivityModule updateCreditCardActivityModule, UpdateCreditCardActivity updateCreditCardActivity) {
            this.b = singletonCImpl;
            this.f4179a = updateCreditCardActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) throws NumberFormatException {
            UpdateCreditCardActivity updateCreditCardActivity = (UpdateCreditCardActivity) obj;
            SingletonCImpl singletonCImpl = this.b;
            DefaultTokenProvider defaultTokenProviderB1 = singletonCImpl.B1();
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            updateCreditCardActivity.t = new UpdateCreditCardPresenter(this.f4179a, defaultTokenProviderB1, analyticsAggregator);
            updateCreditCardActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            updateCreditCardActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            updateCreditCardActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            updateCreditCardActivity.z = (PayClient) singletonCImpl.Q2.get();
            updateCreditCardActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            updateCreditCardActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
        }
    }

    public static final class UserComponentBuilder implements UserComponent.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4180a;
        public UserModule b;

        public UserComponentBuilder(SingletonCImpl singletonCImpl) {
            this.f4180a = singletonCImpl;
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent.Builder
        public final UserComponent.Builder a(UserModule userModule) {
            this.b = userModule;
            return this;
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent.Builder
        public final UserComponent build() {
            Preconditions.a(UserModule.class, this.b);
            return new UserComponentImpl(this.f4180a, this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class UserComponentImpl implements UserComponent {

        /* renamed from: a, reason: collision with root package name */
        public final UserModule f4181a;
        public final SingletonCImpl b;
        public final Provider c;
        public final Provider d;
        public final Provider e;
        public final Provider f;
        public final Provider g;
        public final Provider h;
        public final Provider i;
        public final Provider j;
        public final Provider k;
        public final Provider l;
        public final Provider m;
        public final Provider n;
        public final Provider o;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4182a;
            public final UserComponentImpl b;
            public final int c;

            public SwitchingProvider(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, int i) {
                this.f4182a = singletonCImpl;
                this.b = userComponentImpl;
                this.c = i;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SingletonCImpl singletonCImpl = this.f4182a;
                UserComponentImpl userComponentImpl = this.b;
                int i = this.c;
                switch (i) {
                    case 0:
                        return new TapActivitySubcomponentFactory(singletonCImpl, userComponentImpl);
                    case 1:
                        return new AddPaymentActivitySubcomponentFactory(singletonCImpl, userComponentImpl);
                    case 2:
                        return new UpdateCreditCardActivitySubcomponentFactory(singletonCImpl, userComponentImpl);
                    case 3:
                        return new MyAccountActivitySubcomponentFactory(singletonCImpl, userComponentImpl);
                    case 4:
                        return new TransactionListActivitySubcomponentFactory(singletonCImpl, userComponentImpl);
                    case 5:
                        return new ReceiptActivitySubcomponentFactory(singletonCImpl, userComponentImpl);
                    case 6:
                        return new ExitScanCodeActivitySubcomponentFactory(singletonCImpl, userComponentImpl);
                    case 7:
                        return new SearchActivitySubcomponentFactory(singletonCImpl, userComponentImpl);
                    case 8:
                        UserModule userModule = userComponentImpl.f4181a;
                        ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
                        DefaultLocalTokenProvider defaultLocalTokenProviderU1 = singletonCImpl.u1();
                        SessionInfo sessionInfo = (SessionInfo) userComponentImpl.k.get();
                        AuthenticatedUser authenticatedUserS1 = singletonCImpl.s1();
                        CartSessionComponentBuilder cartSessionComponentBuilder = new CartSessionComponentBuilder(singletonCImpl, userComponentImpl);
                        SngShoppingSession sngShoppingSession = (SngShoppingSession) singletonCImpl.g3.get();
                        userModule.getClass();
                        Intrinsics.h(sessionInfo, "sessionInfo");
                        Intrinsics.h(sngShoppingSession, "sngShoppingSession");
                        return new CartSessionManager(scanNGoRepositoryX1, authenticatedUserS1, sessionInfo, defaultLocalTokenProviderU1, cartSessionComponentBuilder, sngShoppingSession);
                    case 9:
                        UserModule userModule2 = userComponentImpl.f4181a;
                        SecuredSharedPreference securedSharedPreferenceV1 = singletonCImpl.v1();
                        userModule2.getClass();
                        return new SessionInfo(securedSharedPreferenceV1);
                    case 10:
                        User user = userComponentImpl.f4181a.f21168a;
                        Preconditions.d(user);
                        return user;
                    case 11:
                        UserModule userModule3 = userComponentImpl.f4181a;
                        SingletonCImpl singletonCImpl2 = userComponentImpl.b;
                        ScanNGoRepository scanNGoRepositoryX12 = singletonCImpl2.x1();
                        Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl2.O);
                        userModule3.getClass();
                        return new LogoutManager(userModule3.f21168a, new SignoutUC(scanNGoRepositoryX12, schedulerA));
                    case 12:
                        UserModule userModule4 = userComponentImpl.f4181a;
                        SecuredSharedPreference securedSharedPreferenceV12 = singletonCImpl.v1();
                        userModule4.getClass();
                        return new PaymentDetailImpl(securedSharedPreferenceV12);
                    default:
                        throw new AssertionError(i);
                }
            }
        }

        public UserComponentImpl(SingletonCImpl singletonCImpl, UserModule userModule) {
            this.b = singletonCImpl;
            this.f4181a = userModule;
            this.c = new SwitchingProvider(singletonCImpl, this, 0);
            this.d = new SwitchingProvider(singletonCImpl, this, 1);
            this.e = new SwitchingProvider(singletonCImpl, this, 2);
            this.f = new SwitchingProvider(singletonCImpl, this, 3);
            this.g = new SwitchingProvider(singletonCImpl, this, 4);
            this.h = new SwitchingProvider(singletonCImpl, this, 5);
            this.i = new SwitchingProvider(singletonCImpl, this, 6);
            this.j = new SwitchingProvider(singletonCImpl, this, 7);
            this.k = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 9));
            this.l = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 8));
            this.m = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 10));
            this.n = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 11));
            this.o = DoubleCheck.b(new SwitchingProvider(singletonCImpl, this, 12));
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final AutoCompleteUC a() {
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O);
            this.f4181a.getClass();
            return new AutoCompleteUC(scanNGoRepositoryX1, schedulerA);
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final ProductSearchUC b() {
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O);
            this.f4181a.getClass();
            return new ProductSearchUC(scanNGoRepositoryX1, schedulerA);
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final void c(UserManager userManager) {
            ImmutableMap.Builder builderB = ImmutableMap.b(20);
            SingletonCImpl singletonCImpl = this.b;
            builderB.c(SngInitializerActivity.class, singletonCImpl.i3);
            builderB.c(TermsConditionsActivity.class, singletonCImpl.j3);
            builderB.c(MessageActivity.class, singletonCImpl.k3);
            builderB.c(ContactUsActivity.class, singletonCImpl.l3);
            builderB.c(ParkingVoucherActivity.class, singletonCImpl.m3);
            builderB.c(OnBoardingActivity.class, singletonCImpl.n3);
            builderB.c(AvailableStoresActivity.class, singletonCImpl.o3);
            builderB.c(AvailableStoreListActivity.class, singletonCImpl.p3);
            builderB.c(SngEntryActivity.class, singletonCImpl.q3);
            builderB.c(SngRewardsSetupActivity.class, singletonCImpl.r3);
            builderB.c(SetupCompleteActivity.class, singletonCImpl.s3);
            builderB.c(AddPaymentSetupActivity.class, singletonCImpl.t3);
            builderB.c(TapActivity.class, this.c);
            builderB.c(AddPaymentActivity.class, this.d);
            builderB.c(UpdateCreditCardActivity.class, this.e);
            builderB.c(MyAccountActivity.class, this.f);
            builderB.c(TransactionListActivity.class, this.g);
            builderB.c(ReceiptActivity.class, this.h);
            builderB.c(ExitScanCodeActivity.class, this.i);
            builderB.c(com.woolworths.scanlibrary.ui.productsearch.SearchActivity.class, this.j);
            userManager.d = new DispatchingAndroidInjector(builderB.a(true), ImmutableMap.l());
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final SessionInfo d() {
            return (SessionInfo) this.k.get();
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final CartSessionManager e() {
            return (CartSessionManager) this.l.get();
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final RecallConfirmAtPosUC f() {
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O);
            this.f4181a.getClass();
            return new RecallConfirmAtPosUC(scanNGoRepositoryX1, schedulerA);
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final GetReceiptWithCartIdUC g() {
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O);
            this.f4181a.getClass();
            return new GetReceiptWithCartIdUC(scanNGoRepositoryX1, schedulerA);
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final GetProfileUC h() {
            SingletonCImpl singletonCImpl = this.b;
            ScanNGoRepository scanNGoRepositoryX1 = singletonCImpl.x1();
            Scheduler schedulerA = ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O);
            this.f4181a.getClass();
            return new GetProfileUC(scanNGoRepositoryX1, schedulerA);
        }

        @Override // com.woolworths.scanlibrary.di.user.UserComponent
        public final FireStoreDataRepositoryImpl i() {
            SingletonCImpl singletonCImpl = this.b;
            FirebaseApp firebaseApp = (FirebaseApp) singletonCImpl.H3.get();
            UserModule userModule = this.f4181a;
            userModule.getClass();
            Intrinsics.h(firebaseApp, "firebaseApp");
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
            Intrinsics.g(firebaseAuth, "getInstance(...)");
            FirebaseAuthenticationRepositoryImpl firebaseAuthenticationRepositoryImpl = new FirebaseAuthenticationRepositoryImpl(firebaseAuth);
            FirebaseApp firebaseApp2 = (FirebaseApp) singletonCImpl.H3.get();
            userModule.getClass();
            Intrinsics.h(firebaseApp2, "firebaseApp");
            FirebaseFirestore firebaseFirestoreB = FirebaseFirestore.b(firebaseApp2);
            GetFireStoreAccessUC getFireStoreAccessUC = new GetFireStoreAccessUC(singletonCImpl.x1(), ScanNGoModule_GetSchedulerFactory.a(singletonCImpl.O));
            CoroutineContextProvider coroutineContextProvider = new CoroutineContextProvider();
            SessionInfo sessionInfo = (SessionInfo) this.k.get();
            FirebaseCrashlytics firebaseCrashlyticsA = FirebaseCrashlyticsKt.a();
            userModule.getClass();
            Intrinsics.h(sessionInfo, "sessionInfo");
            return new FireStoreDataRepositoryImpl(firebaseAuthenticationRepositoryImpl, firebaseFirestoreB, getFireStoreAccessUC, coroutineContextProvider, sessionInfo, firebaseCrashlyticsA);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ViewCBuilder implements ShopApplication_HiltComponents.ViewC.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4183a;
        public final ActivityCImpl b;
        public View c;

        public ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.f4183a = singletonCImpl;
            this.b = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public final ViewComponentBuilder a(View view) {
            view.getClass();
            this.c = view;
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public final ViewComponent build() {
            Preconditions.a(View.class, this.c);
            return new ViewCImpl(this.f4183a, this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ViewCImpl extends ShopApplication_HiltComponents.ViewC {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4184a;
        public final ActivityCImpl b;

        public ViewCImpl(SingletonCImpl singletonCImpl, ActivityCImpl activityCImpl) {
            this.f4184a = singletonCImpl;
            this.b = activityCImpl;
        }

        @Override // au.com.woolworths.product.offers.ProductsBoostView_GeneratedInjector
        public final void a(ProductsBoostView productsBoostView) {
            SingletonCImpl singletonCImpl = this.f4184a;
            productsBoostView.featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            productsBoostView.inStoreModeInteractor = (InStoreModeInteractor) singletonCImpl.a4.get();
            productsBoostView.productBoostInteractor = (ProductBoostInteractor) singletonCImpl.C2.get();
            productsBoostView.dispatcherProvider = (DispatcherProvider) singletonCImpl.n1.get();
        }

        @Override // au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView_GeneratedInjector
        public final void b(SortByView sortByView) {
            SingletonCImpl singletonCImpl = this.f4184a;
            sortByView.featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            sortByView.listsUtils = (ListsUtils) singletonCImpl.N3.get();
        }

        @Override // au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView_GeneratedInjector
        public final void c(ListDetailsView listDetailsView) {
            listDetailsView.featureToggleManager = (FeatureToggleManager) this.f4184a.P0.get();
        }

        @Override // au.com.woolworths.product.infoview.ProductInfoView_GeneratedInjector
        public final void d(ProductInfoView productInfoView) {
            SingletonCImpl singletonCImpl = this.f4184a;
            productInfoView.featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            productInfoView.inStoreModeInteractor = (InStoreModeInteractor) singletonCImpl.a4.get();
        }

        @Override // au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperView_GeneratedInjector
        public final void e(StepperView stepperView) {
            LegacyActivityModule legacyActivityModule = this.b.b;
            StepperPresenter stepperPresenter = new StepperPresenter();
            stepperPresenter.f4373a = null;
            stepperPresenter.b = new CompositeDisposable();
            stepperPresenter.c = new CompositeDisposable();
            stepperView.stepperPresenter = stepperPresenter;
        }

        @Override // au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView_GeneratedInjector
        public final void f(WatchlistToggleView watchlistToggleView) {
            SingletonCImpl singletonCImpl = this.f4184a;
            watchlistToggleView.featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
            watchlistToggleView.listsUtils = (ListsUtils) singletonCImpl.N3.get();
        }
    }

    public static final class ViewModelCBuilder implements ShopApplication_HiltComponents.ViewModelC.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4185a;
        public final ActivityRetainedCImpl b;
        public SavedStateHandle c;
        public RetainedLifecycleImpl d;

        public ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.f4185a = singletonCImpl;
            this.b = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public final ViewModelComponentBuilder a(SavedStateHandle savedStateHandle) {
            this.c = savedStateHandle;
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public final ViewModelComponentBuilder b(RetainedLifecycleImpl retainedLifecycleImpl) {
            this.d = retainedLifecycleImpl;
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public final ViewModelComponent build() {
            Preconditions.a(SavedStateHandle.class, this.c);
            Preconditions.a(ViewModelLifecycle.class, this.d);
            return new ViewModelCImpl(this.f4185a, this.b, new InstoreNavigationModule(), new ProductFinderModule(), this.c);
        }
    }

    public static final class ViewModelCImpl extends ShopApplication_HiltComponents.ViewModelC {
        public final Provider A;
        public final Provider A0;
        public final Provider A1;
        public final Provider A2;
        public final Provider B;
        public final Provider B0;
        public final Provider B1;
        public final Provider B2;
        public final Provider C;
        public final Provider C0;
        public final Provider C1;
        public final Provider C2;
        public final Provider D;
        public final Provider D0;
        public final Provider D1;
        public final Provider D2;
        public final Provider E;
        public final Provider E0;
        public final Provider E1;
        public final Provider E2;
        public final Provider F;
        public final Provider F0;
        public final Provider F1;
        public final Provider F2;
        public final Provider G;
        public final Provider G0;
        public final Provider G1;
        public final Provider G2;
        public final Provider H;
        public final Provider H0;
        public final Provider H1;
        public final Provider H2;
        public final Provider I;
        public final Provider I0;
        public final Provider I1;
        public final Provider I2;
        public final Provider J;
        public final Provider J0;
        public final Provider J1;
        public final Provider J2;
        public final Provider K;
        public final Provider K0;
        public final Provider K1;
        public final Provider K2;
        public final Provider L;
        public final Provider L0;
        public final Provider L1;
        public final Provider L2;
        public final Provider M;
        public final Provider M0;
        public final Provider M1;
        public final Provider M2;
        public final Provider N;
        public final Provider N0;
        public final Provider N1;
        public final Provider N2;
        public final Provider O;
        public final Provider O0;
        public final Provider O1;
        public final Provider O2;
        public final Provider P;
        public final Provider P0;
        public final Provider P1;
        public final Provider P2;
        public final Provider Q;
        public final Provider Q0;
        public final Provider Q1;
        public final Provider Q2;
        public final Provider R;
        public final Provider R0;
        public final Provider R1;
        public final Provider R2;
        public final Provider S;
        public final Provider S0;
        public final Provider S1;
        public final Provider S2;
        public final Provider T;
        public final Provider T0;
        public final Provider T1;
        public final Provider T2;
        public final Provider U;
        public final Provider U0;
        public final Provider U1;
        public final Provider U2;
        public final Provider V;
        public final Provider V0;
        public final Provider V1;
        public final Provider V2;
        public final Provider W;
        public final Provider W0;
        public final Provider W1;
        public final Provider W2;
        public final Provider X;
        public final Provider X0;
        public final Provider X1;
        public final Provider X2;
        public final Provider Y;
        public final Provider Y0;
        public final Provider Y1;
        public final Provider Y2;
        public final Provider Z;
        public final Provider Z0;
        public final Provider Z1;
        public final Provider Z2;

        /* renamed from: a, reason: collision with root package name */
        public final SavedStateHandle f4186a;
        public final Provider a0;
        public final Provider a1;
        public final Provider a2;
        public final Provider a3;
        public final InstoreNavigationModule b;
        public final Provider b0;
        public final Provider b1;
        public final Provider b2;
        public final Provider b3;
        public final ProductFinderModule c;
        public final Provider c0;
        public final Provider c1;
        public final Provider c2;
        public final Provider c3;
        public final SingletonCImpl d;
        public final Provider d0;
        public final Provider d1;
        public final Provider d2;
        public final Provider d3;
        public final ActivityRetainedCImpl e;
        public final Provider e0;
        public final Provider e1;
        public final Provider e2;
        public final Provider e3;
        public final Provider f;
        public final Provider f0;
        public final Provider f1;
        public final Provider f2;
        public final Provider f3;
        public final Provider g;
        public final Provider g0;
        public final Provider g1;
        public final Provider g2;
        public final Provider g3;
        public final Provider h;
        public final Provider h0;
        public final Provider h1;
        public final Provider h2;
        public final Provider h3;
        public final Provider i;
        public final Provider i0;
        public final Provider i1;
        public final Provider i2;
        public final Provider i3;
        public final Provider j;
        public final Provider j0;
        public final Provider j1;
        public final Provider j2;
        public final Provider j3;
        public final Provider k;
        public final Provider k0;
        public final Provider k1;
        public final Provider k2;
        public final Provider k3;
        public final Provider l;
        public final Provider l0;
        public final Provider l1;
        public final Provider l2;
        public final Provider l3;
        public final Provider m;
        public final Provider m0;
        public final Provider m1;
        public final Provider m2;
        public final Provider n;
        public final Provider n0;
        public final Provider n1;
        public final Provider n2;
        public final Provider o;
        public final Provider o0;
        public final Provider o1;
        public final Provider o2;
        public final Provider p;
        public final Provider p0;
        public final Provider p1;
        public final Provider p2;
        public final Provider q;
        public final Provider q0;
        public final Provider q1;
        public final Provider q2;
        public final Provider r;
        public final Provider r0;
        public final Provider r1;
        public final Provider r2;
        public final Provider s;
        public final Provider s0;
        public final Provider s1;
        public final Provider s2;
        public final Provider t;
        public final Provider t0;
        public final Provider t1;
        public final Provider t2;
        public final Provider u;
        public final Provider u0;
        public final Provider u1;
        public final Provider u2;
        public final Provider v;
        public final Provider v0;
        public final Provider v1;
        public final Provider v2;
        public final Provider w;
        public final Provider w0;
        public final Provider w1;
        public final Provider w2;
        public final Provider x;
        public final Provider x0;
        public final Provider x1;
        public final Provider x2;
        public final Provider y;
        public final Provider y0;
        public final Provider y1;
        public final Provider y2;
        public final Provider z;
        public final Provider z0;
        public final Provider z1;
        public final Provider z2;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a, reason: collision with root package name */
            public final SingletonCImpl f4187a;
            public final ActivityRetainedCImpl b;
            public final ViewModelCImpl c;
            public final int d;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int i) {
                this.f4187a = singletonCImpl;
                this.b = activityRetainedCImpl;
                this.c = viewModelCImpl;
                this.d = i;
            }

            public final Object a() throws NumberFormatException {
                ActivityRetainedCImpl activityRetainedCImpl = this.b;
                ViewModelCImpl viewModelCImpl = this.c;
                SingletonCImpl singletonCImpl = this.f4187a;
                int i = this.d;
                switch (i) {
                    case 0:
                        return new AccountDetailsViewModel(ViewModelCImpl.c(viewModelCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), (ShopAuthManager) singletonCImpl.R3.get());
                    case 1:
                        return new AccountSettingsViewModelOld((RewardsAccountInteractor) singletonCImpl.Y1.get(), (AccountSettingsInteractorOld) singletonCImpl.c4.get(), ViewModelCImpl.Z(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (MedalliaInteractor) singletonCImpl.t2.get(), (AccountNotificationBadgeInteractor) singletonCImpl.b4.get(), (RewardsBannerInteractor) singletonCImpl.Y3.get(), SingletonCImpl.Q0(singletonCImpl));
                    case 2:
                        return new AccountSettingsViewModel(ViewModelCImpl.d(viewModelCImpl), (RewardsAccountInteractor) singletonCImpl.Y1.get(), (AccountNotificationBadgeInteractor) singletonCImpl.b4.get(), (RewardsBannerInteractor) singletonCImpl.Y3.get(), (MedalliaInteractor) singletonCImpl.t2.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 3:
                        return new AddDeliveryAddressBottomSheetViewModel();
                    case 4:
                        return new AddDeliveryAddressManuallyViewModel(ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), ViewModelCImpl.v(viewModelCImpl), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 5:
                        Context context = singletonCImpl.e.f23776a;
                        Preconditions.d(context);
                        return new AddGiftCardViewModel(context, ViewModelCImpl.B(viewModelCImpl), ViewModelCImpl.e(viewModelCImpl));
                    case 6:
                        return new AddToCartViewModel((CartUpdateInteractor) singletonCImpl.D2.get(), (AnalyticsManager) singletonCImpl.r2.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), new EducationBottomSheetRepository(activityRetainedCImpl.n.y1()), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (LegacyShoppingModeRepository) singletonCImpl.E1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 7:
                        return new AddToListBottomSheetViewModel((ShoppingListInteractor) singletonCImpl.e4.get(), (ShoppingListItemInteractor) singletonCImpl.f4.get(), (ProductBoostInteractor) singletonCImpl.C2.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 8:
                        return new ApplicableDeliveryMethodViewModel(viewModelCImpl.f4186a);
                    case 9:
                        return new AskForPushNotificationPermissionViewModel((PushNotificationPermissionInteractor) singletonCImpl.g4.get());
                    case 10:
                        AskOliveViewModel askOliveViewModelA = AskOliveViewModel_Factory.a((AppConfig) singletonCImpl.W0.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), new OliveLinkDelegate(), (ConnectionManager) singletonCImpl.L0.get(), ViewModelCImpl.z(viewModelCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), (ShopAppTokenAuthenticator) singletonCImpl.I0.get(), (DispatcherProvider) singletonCImpl.n1.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                        ViewModelCImpl.D(viewModelCImpl, askOliveViewModelA);
                        return askOliveViewModelA;
                    case 11:
                        return new BarcodeScannerViewModel(ViewModelCImpl.g(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (SchedulersProvider) singletonCImpl.o1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 12:
                        return new BayNumberSelectorViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 13:
                        return new BrandedShopViewModel(ViewModelCImpl.h(viewModelCImpl), (CartUpdateInteractor) singletonCImpl.D2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (TrolleyInteractor) singletonCImpl.h2.get(), (AnalyticsManager) singletonCImpl.r2.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get());
                    case 14:
                        return new BuyAgainQuantitySelectorViewModel((FeatureToggleManager) singletonCImpl.P0.get());
                    case 15:
                        return new BuyAgainViewModelLegacy(ViewModelCImpl.i(viewModelCImpl), (TrolleyInteractor) singletonCImpl.h2.get(), (ProductBoostInteractor) singletonCImpl.C2.get(), (AnalyticsManager) singletonCImpl.r2.get(), (ShopAccountInteractor) singletonCImpl.Y0.get());
                    case 16:
                        return new BuyAgainViewModel(ViewModelCImpl.i(viewModelCImpl), (ProductBoostInteractor) singletonCImpl.C2.get(), (AnalyticsManager) singletonCImpl.r2.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (CartUpdateInteractor) singletonCImpl.D2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (WatchlistInteractor) singletonCImpl.i4.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get());
                    case 17:
                        return new CameraPermissionViewModel(SingletonCImpl.Y0(singletonCImpl));
                    case 18:
                        return new CartBadgeActionViewModel((CartUpdateInteractor) singletonCImpl.D2.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 19:
                        return new CartPreAuthViewModel();
                    case 20:
                        return new CartViewModel(SingletonCImpl.T0(singletonCImpl), (ShopAccountInteractor) singletonCImpl.Y0.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (CartUpdateInteractor) singletonCImpl.D2.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get());
                    case 21:
                        return new CatalogueBrowseViewModel(ViewModelCImpl.j(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 22:
                        return new CatalogueDetailsViewModel(ViewModelCImpl.k(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 23:
                        return new CatalogueHomeViewModel(ViewModelCImpl.l(viewModelCImpl), viewModelCImpl.c0(), (CartUpdateInteractor) singletonCImpl.D2.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 24:
                        return new CatalogueIntroViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 25:
                        return new CatalogueProductListViewModel((AnalyticsManager) singletonCImpl.r2.get(), ViewModelCImpl.m(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 26:
                        return new CatalogueStoreSelectorViewModel(ViewModelCImpl.n(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 27:
                        return new CategoryListingViewModel(ViewModelCImpl.o(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 28:
                        return new CheckoutBridgeViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 29:
                        return new CheckoutDetailsViewModel(ViewModelCImpl.q(viewModelCImpl), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 30:
                        return new CheckoutProductViewModel(ViewModelCImpl.q(viewModelCImpl), (TrolleyInteractor) singletonCImpl.h2.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 31:
                        return new CheckoutSummaryViewModel(ViewModelCImpl.r(viewModelCImpl), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 32:
                        return new CheckoutViewModel((PaymentServicesInteractor) singletonCImpl.e2.get(), (CheckoutInteractor) singletonCImpl.W3.get(), (ApiService) singletonCImpl.V3.get(), (Gson) singletonCImpl.G0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 33:
                        return new CloseAccountViewModel(ViewModelCImpl.s(viewModelCImpl));
                    case 34:
                        return new CmoReviewViewModel(ViewModelCImpl.p(viewModelCImpl), (EditOrderInteractor) singletonCImpl.L1.get());
                    case 35:
                        return new CollectionModeSetupViewModel((CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (LaunchManager) singletonCImpl.P3.get());
                    case 36:
                        return new ComposeProductListActivityViewModel((CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 37:
                        return new au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityViewModel((CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 38:
                        return new ConfigActionViewModel((PreferencesManager) singletonCImpl.p1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (ApplicationType) singletonCImpl.B1.get());
                    case 39:
                        return new ConfirmSubscriptionViewModel(ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), (DigipayInteractor) singletonCImpl.T3.get(), ViewModelCImpl.w(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 40:
                        return new ConfirmationViewModel(ViewModelCImpl.w(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 41:
                        return new ContactDetailsContentViewModel();
                    case 42:
                        return new ContentPageViewModel(ViewModelCImpl.t(viewModelCImpl), (CartUpdateInteractor) singletonCImpl.D2.get(), (TrolleyInteractor) singletonCImpl.h2.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (GoogleAdManagerInteractor) singletonCImpl.m4.get(), ViewModelCImpl.f(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), (WatchlistInteractor) singletonCImpl.i4.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), viewModelCImpl.c0(), (InstoreNavigationInteractor) singletonCImpl.E3.get());
                    case 43:
                        return new CreateUpdateShoppingListViewModel((ShoppingListInteractor) singletonCImpl.e4.get(), (ShoppingListItemInteractor) singletonCImpl.f4.get(), ViewModelCImpl.u(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (ListsInMemoryRepository) singletonCImpl.E2.get());
                    case 44:
                        return new CreditCardViewModel((DigipayInteractor) singletonCImpl.T3.get());
                    case 45:
                        return new DeleteAccountViewModel((AnalyticsManager) singletonCImpl.r2.get(), ActivityRetainedCImpl.e(activityRetainedCImpl), (SchedulersProvider) singletonCImpl.o1.get());
                    case 46:
                        return new DeliveryUnlimitedSignUpLandingViewModel(ViewModelCImpl.w(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 47:
                        return new EReceiptDetailsViewModel(ViewModelCImpl.x(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), ShopReceiptDetailsAppModule_ProvidesStoreLocationProvider$receipts_releaseFactory.a(singletonCImpl.l0));
                    case 48:
                        return new EditDriverInstructionsViewModel(ViewModelCImpl.y(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 49:
                        return new EditOrderBannerViewModel((EditOrderInteractor) singletonCImpl.L1.get());
                    case 50:
                        return new EditOrderConditionsViewModel((EditOrderInteractor) singletonCImpl.L1.get(), (CartUpdateInteractor) singletonCImpl.D2.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 51:
                        return new EditOrderErrorViewModel((AnalyticsManager) singletonCImpl.r2.get(), (EditOrderInteractor) singletonCImpl.L1.get());
                    case 52:
                        return new EducationBottomSheetViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 53:
                        EverydayExtrasSignUpInteractor everydayExtrasSignUpInteractor = (EverydayExtrasSignUpInteractor) singletonCImpl.o4.get();
                        SingletonCImpl singletonCImpl2 = activityRetainedCImpl.n;
                        return new EverydayExtraChoosePlanBottomSheetViewModel(everydayExtrasSignUpInteractor, new EverydayExtraChoosePlanInteractorImpl(new EverydayExtraChoosePlanRepository((ApolloClient) singletonCImpl2.Q1.get()), (SignUpQueryParamsManager) singletonCImpl2.p4.get()), SingletonCImpl.c1(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 54:
                        EverydayExtrasSignUpInteractor everydayExtrasSignUpInteractor2 = (EverydayExtrasSignUpInteractor) singletonCImpl.o4.get();
                        SingletonCImpl singletonCImpl3 = activityRetainedCImpl.n;
                        return new EverydayExtraChoosePlanViewModel(everydayExtrasSignUpInteractor2, new EverydayExtraChoosePlanInteractorImpl(new EverydayExtraChoosePlanRepository((ApolloClient) singletonCImpl3.Q1.get()), (SignUpQueryParamsManager) singletonCImpl3.p4.get()), SingletonCImpl.c1(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 55:
                        return new EverydayExtraFinalGlanceBottomSheetViewModel(ActivityRetainedCImpl.f(activityRetainedCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 56:
                        return new EverydayExtraLandingViewModel((EverydayExtrasSignUpInteractor) singletonCImpl.o4.get(), ActivityRetainedCImpl.g(activityRetainedCImpl), SingletonCImpl.c1(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 57:
                        return new EverydayExtraOnboardingViewModel((EverydayExtrasSignUpInteractor) singletonCImpl.o4.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 58:
                        return new EverydayExtraSummaryViewModel((EverydayExtrasSignUpInteractor) singletonCImpl.o4.get(), ActivityRetainedCImpl.h(activityRetainedCImpl), SingletonCImpl.c1(singletonCImpl), ActivityRetainedCImpl.l(activityRetainedCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 59:
                        return new EverydayExtrasSignUpViewModel((EverydayExtrasSignUpInteractor) singletonCImpl.o4.get(), (SignUpQueryParamsManager) singletonCImpl.p4.get());
                    case 60:
                        return new Feedback2FormViewModel((MedalliaInteractor) singletonCImpl.t2.get(), ReleaseModule_ProvideJwtRepositoryFactory.a(singletonCImpl.c, (JwtApi) singletonCImpl.r4.get()), (ApplicationType) singletonCImpl.B1.get());
                    case 61:
                        return new FeedbackFormViewModel((MedalliaInteractor) singletonCImpl.t2.get());
                    case 62:
                        return new FoodTrackerViewModel(ViewModelCImpl.A(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 63:
                        return new FreshMagContentViewModel(ViewModelCImpl.E(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 64:
                        return new FreshMagHomeViewModel(new FreshMagHomeInteractor(new FreshMagHomeRepositoryImpl((ApolloClient) viewModelCImpl.e.n.C1.get()), (DispatcherProvider) viewModelCImpl.d.n1.get()), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 65:
                        return new FulfilmentWindowsViewModel(ViewModelCImpl.q(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 66:
                        return new FullPageVideoPlayerViewModel((AnalyticsManager) singletonCImpl.r2.get(), (DispatcherProvider) singletonCImpl.n1.get());
                    case 67:
                        return new GuestLoginViewModel();
                    case 68:
                        return new HaveYouForgottenViewModel(SingletonCImpl.T0(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get());
                    case 69:
                        return new HealthierBottomSheetViewModel((AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 70:
                        Application applicationA = ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e);
                        SingletonCImpl singletonCImpl4 = viewModelCImpl.d;
                        CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) singletonCImpl4.q1.get();
                        RepositoryManager repositoryManager = (RepositoryManager) singletonCImpl4.t1.get();
                        HomeRepository homeRepository = new HomeRepository((ApolloClient) singletonCImpl4.C1.get(), (DispatcherProvider) singletonCImpl4.n1.get(), (FeatureToggleManager) singletonCImpl4.P0.get(), singletonCImpl4.A1());
                        CatalogueAppModule catalogueAppModule = singletonCImpl4.i;
                        HomeInteractor homeInteractor = new HomeInteractor(collectionModeInteractor, repositoryManager, homeRepository, CatalogueAppModule_ProvidesCatalogueRepositoryFactory.a(catalogueAppModule, BaseDataModule_ProvidesCatalogueSharedPrefsFactory.a(singletonCImpl4.I, Contexts.a(singletonCImpl4.e.f23776a)), CatalogueAppModule_ProvideCatalogueGson$catalogue_releaseFactory.a(catalogueAppModule)), (InStoreWifiInteractor) singletonCImpl4.M2.get(), (FeatureToggleManager) singletonCImpl4.P0.get(), (ShopAccountInteractor) singletonCImpl4.Y0.get());
                        AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
                        SchedulersProvider schedulersProvider = (SchedulersProvider) singletonCImpl.o1.get();
                        CollectionModeInteractor collectionModeInteractor2 = (CollectionModeInteractor) singletonCImpl.q1.get();
                        RewardsAccountInteractor rewardsAccountInteractor = (RewardsAccountInteractor) singletonCImpl.Y1.get();
                        TrolleyInteractor trolleyInteractor = (TrolleyInteractor) singletonCImpl.h2.get();
                        BaseDataModule baseDataModule = singletonCImpl.I;
                        Application applicationA2 = Contexts.a(singletonCImpl.e.f23776a);
                        baseDataModule.getClass();
                        return new HomePageViewModel(applicationA, homeInteractor, analyticsManager, schedulersProvider, collectionModeInteractor2, rewardsAccountInteractor, trolleyInteractor, androidx.constraintlayout.core.state.a.b(applicationA2.getPackageName(), ".rewards.account", applicationA2, 0, "getSharedPreferences(...)"), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (GoogleAdManagerInteractor) singletonCImpl.m4.get(), (EditOrderInteractor) singletonCImpl.L1.get(), (ShoppingListInteractor) singletonCImpl.e4.get(), (ProductBoostInteractor) singletonCImpl.C2.get(), ViewModelCImpl.f(viewModelCImpl), SingletonCImpl.S0(singletonCImpl), (ShopAccountInteractor) singletonCImpl.Y0.get(), (InstorePresenceInteractor) singletonCImpl.t4.get(), SingletonCImpl.W0(singletonCImpl), (LocationInteractor) singletonCImpl.D3.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get(), (WatchlistInteractor) singletonCImpl.i4.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (ShopAppFlavorInteractor) singletonCImpl.N0.get());
                    case 71:
                        SingletonCImpl singletonCImpl5 = viewModelCImpl.d;
                        return new IdVerificationViewModel(new IdVerificationInteractor(new IdVerificationRepository((ApolloClient) singletonCImpl5.C1.get()), (DispatcherProvider) singletonCImpl5.n1.get()), (AnalyticsManager) singletonCImpl.r2.get());
                    case 72:
                        return new InboxViewModel((AnalyticsManager) singletonCImpl.r2.get(), (LinkNavigator) singletonCImpl.s2.get(), AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b), (InboxClient) singletonCImpl.x4.get(), InboxConfigModule_InboxTimeSource$inbox_releaseFactory.a(), InboxModule_ProvideInboxAnalyticsFactoryFactory.a((FeatureToggleManager) activityRetainedCImpl.n.P0.get()));
                    case 73:
                        return new InstoreCartViewModel((AnalyticsManager) singletonCImpl.r2.get(), (InstoreCartRepository) singletonCImpl.y4.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get(), (CollectionModeInteractor) singletonCImpl.q1.get());
                    case 74:
                        return new InstoreMapViewModel((LocationInteractor) singletonCImpl.D3.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get(), (BuildingInteractor) singletonCImpl.A3.get(), (MapFocusInteractor) viewModelCImpl.B0.get(), (PositioningInteractor) singletonCImpl.y3.get(), (PositionAnimator) viewModelCImpl.C0.get(), (RoutingInteractor) viewModelCImpl.D0.get(), new MapEventTracker((AnalyticsManager) viewModelCImpl.d.r2.get()), (OriientTrackingInteractor) singletonCImpl.z4.get(), (ProximityInteractor) viewModelCImpl.E0.get(), SingletonCImpl.Z0(singletonCImpl));
                    case 75:
                        return InstoreNavigationModule_ProvideMapFocusInteractorFactory.a(viewModelCImpl.b, (PositioningInteractor) singletonCImpl.y3.get(), (BuildingInteractor) singletonCImpl.A3.get());
                    case 76:
                        return InstoreNavigationModule_ProvidePositionAnimatorFactory.a(viewModelCImpl.b);
                    case 77:
                        return InstoreNavigationModule_ProvideRoutingInteractorFactory.a(viewModelCImpl.b, (PositioningInteractor) singletonCImpl.y3.get(), (BuildingInteractor) singletonCImpl.A3.get());
                    case 78:
                        return InstoreNavigationModule_ProvideProximityInteractorFactory.a(viewModelCImpl.b, (BuildingInteractor) singletonCImpl.A3.get());
                    case 79:
                        return new InstoreWifiViewModel((InStoreWifiInteractor) singletonCImpl.M2.get(), (AnalyticsManager) singletonCImpl.r2.get(), AppModule_ProvideInstoreWifiAnalyticsInteractorFactory.a(singletonCImpl.b, (AnalyticsManager) singletonCImpl.r2.get()));
                    case 80:
                        return new JoinWifiViewModel((InStoreWifiInteractor) singletonCImpl.M2.get(), (AnalyticsManager) singletonCImpl.r2.get(), (AppConfig) singletonCImpl.W0.get(), AppModule_ProvideInstoreWifiAnalyticsInteractorFactory.a(singletonCImpl.b, (AnalyticsManager) singletonCImpl.r2.get()));
                    case 81:
                        return new ListDetailsViewModel((ListDetailsInteractor) singletonCImpl.A4.get(), (ShoppingListInteractor) singletonCImpl.e4.get(), (AnalyticsManager) singletonCImpl.r2.get(), (ListsInMemoryRepository) singletonCImpl.E2.get(), (ListsUtils) singletonCImpl.N3.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (RepositoryManager) singletonCImpl.t1.get(), (ProductItemState) singletonCImpl.B4.get());
                    case 82:
                        return new ListsBottomSheetViewModel((ShoppingListInteractor) singletonCImpl.e4.get(), (ListsInMemoryRepository) singletonCImpl.E2.get(), (ListsUtils) singletonCImpl.N3.get());
                    case 83:
                        return new ListsViewModel((AnalyticsManager) singletonCImpl.r2.get(), (ShoppingListSyncInteractor) singletonCImpl.L2.get(), (ShoppingListInteractor) singletonCImpl.e4.get(), (ListsInMemoryRepository) singletonCImpl.E2.get(), (InstorePresenceInteractor) singletonCImpl.t4.get(), SingletonCImpl.W0(singletonCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get());
                    case 84:
                        ShopLoginModule shopLoginModule = activityRetainedCImpl.g;
                        SingletonCImpl singletonCImpl6 = activityRetainedCImpl.n;
                        DispatcherProvider dispatcherProvider = (DispatcherProvider) singletonCImpl6.n1.get();
                        AuthInteractor shopAuthInteractor = (AuthInteractor) singletonCImpl6.i1.get();
                        RewardsAccountInteractor rewardsAccountInteractor2 = (RewardsAccountInteractor) singletonCImpl6.Y1.get();
                        ShopAccountInteractor accountInteractor = (ShopAccountInteractor) singletonCImpl6.Y0.get();
                        AppConfigurationInteractor appConfigurationInteractor = (AppConfigurationInteractor) singletonCImpl6.P1.get();
                        TrolleyInteractor trolleyInteractor2 = (TrolleyInteractor) singletonCImpl6.h2.get();
                        CollectionModeInteractor collectionModeInteractor3 = (CollectionModeInteractor) singletonCImpl6.q1.get();
                        ShoppingModeInteractor shoppingModeInteractor = (ShoppingModeInteractor) singletonCImpl6.C4.get();
                        FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl6.P0.get();
                        WxidClientImpl wxidClientImplE = singletonCImpl6.e();
                        ShopAppRegionInteractor shopAppRegionInteractor = (ShopAppRegionInteractor) singletonCImpl6.O0.get();
                        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
                        Intrinsics.h(shopAuthInteractor, "shopAuthInteractor");
                        Intrinsics.h(rewardsAccountInteractor2, "rewardsAccountInteractor");
                        Intrinsics.h(accountInteractor, "accountInteractor");
                        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
                        Intrinsics.h(trolleyInteractor2, "trolleyInteractor");
                        Intrinsics.h(collectionModeInteractor3, "collectionModeInteractor");
                        Intrinsics.h(shoppingModeInteractor, "shoppingModeInteractor");
                        Intrinsics.h(featureToggleManager, "featureToggleManager");
                        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
                        return new LoginViewModel(new LoginInteractor(dispatcherProvider, shopAuthInteractor, rewardsAccountInteractor2, accountInteractor, appConfigurationInteractor, trolleyInteractor2, collectionModeInteractor3, shoppingModeInteractor, wxidClientImplE, featureToggleManager, shopAppRegionInteractor), (CollectionModeInteractor) singletonCImpl.q1.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (AnalyticsManager) singletonCImpl.r2.get(), (CartUpdateInteractor) singletonCImpl.D2.get(), (LegacyShoppingModeRepository) singletonCImpl.E1.get());
                    case 85:
                        Provider provider = singletonCImpl.P0;
                        ApplicationContextModule applicationContextModule = singletonCImpl.e;
                        BaseDataModule baseDataModule2 = singletonCImpl.I;
                        AppModule appModule = singletonCImpl.b;
                        FeatureToggleManager featureToggleManager2 = (FeatureToggleManager) provider.get();
                        PreferencesManager preferencesManager = (PreferencesManager) singletonCImpl.p1.get();
                        WowNotificationManager wowNotificationManager = (WowNotificationManager) singletonCImpl.D4.get();
                        CollectionModeInteractor collectionModeInteractor4 = (CollectionModeInteractor) singletonCImpl.q1.get();
                        GuestLoginInteractorImpl guestLoginInteractorImplL = singletonCImpl.L();
                        ShopAccountInteractor shopAccountInteractor = (ShopAccountInteractor) singletonCImpl.Y0.get();
                        ShopAppRegionInteractor shopAppRegionInteractor2 = (ShopAppRegionInteractor) singletonCImpl.O0.get();
                        NewBadgeInteractor newBadgeInteractorA = AppModule_ProvidesNewBadgeInteractorFactory.a(appModule, AppModule_ProvidesNewBadgeRepositoryFactory.a(appModule, BaseDataModule_ProvidesNewBadgePrefs$base_impl_releaseFactory.a(baseDataModule2, Contexts.a(applicationContextModule.f23776a))));
                        Application applicationA3 = Contexts.a(applicationContextModule.f23776a);
                        baseDataModule2.getClass();
                        SharedPreferences sharedPreferencesB = androidx.constraintlayout.core.state.a.b(applicationA3.getPackageName(), ".shop.onboarding", applicationA3, 0, "getSharedPreferences(...)");
                        FeatureToggleManager featureToggleManager3 = (FeatureToggleManager) singletonCImpl.P0.get();
                        appModule.getClass();
                        Intrinsics.h(featureToggleManager3, "featureToggleManager");
                        return new MainViewModel(featureToggleManager2, preferencesManager, wowNotificationManager, collectionModeInteractor4, guestLoginInteractorImplL, shopAccountInteractor, shopAppRegionInteractor2, newBadgeInteractorA, new OnboardingInteractorImpl(new OnboardingRepository(sharedPreferencesB, featureToggleManager3)), AppModule_ProvideSwrveEventTrackerFactory.a(appModule), (AnalyticsManager) singletonCImpl.r2.get(), (InstorePresenceInteractor) singletonCImpl.t4.get(), (CartUpdateInteractor) singletonCImpl.D2.get(), (PreferencesDetailsInteractor) singletonCImpl.L3.get(), (AppBuildConfig) singletonCImpl.f2.get(), SingletonCImpl.Q0(singletonCImpl), (InboxClient) singletonCImpl.x4.get());
                    case 86:
                        return new MarketplaceBrandsViewModel((AnalyticsManager) singletonCImpl.r2.get(), ActivityRetainedCImpl.i(activityRetainedCImpl));
                    case 87:
                        return new MarketplaceCategoriesViewModel((AnalyticsManager) singletonCImpl.r2.get(), ActivityRetainedCImpl.i(activityRetainedCImpl));
                    case 88:
                        return new MarketplacePersonalisedViewModel((AnalyticsManager) singletonCImpl.r2.get(), ActivityRetainedCImpl.i(activityRetainedCImpl), (TrolleyInteractor) singletonCImpl.h2.get());
                    case 89:
                        return new MarketplacePickupBottomSheetViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 90:
                        return new MarketplaceSellersViewModel((AnalyticsManager) singletonCImpl.r2.get(), ActivityRetainedCImpl.i(activityRetainedCImpl));
                    case 91:
                        return new MarketplaceViewModel((AnalyticsManager) singletonCImpl.r2.get(), ActivityRetainedCImpl.i(activityRetainedCImpl));
                    case 92:
                        Provider provider2 = singletonCImpl.Y1;
                        ApplicationContextModule applicationContextModule2 = singletonCImpl.e;
                        BaseDataModule baseDataModule3 = singletonCImpl.I;
                        AppModule appModule2 = singletonCImpl.b;
                        RewardsAccountInteractor rewardsAccountInteractor3 = (RewardsAccountInteractor) provider2.get();
                        AnalyticsManager analyticsManager2 = (AnalyticsManager) singletonCImpl.r2.get();
                        LegacyShopAnalyticsManager legacyShopAnalyticsManager = (LegacyShopAnalyticsManager) singletonCImpl.r1.get();
                        SchedulersProvider schedulersProvider2 = (SchedulersProvider) singletonCImpl.o1.get();
                        NewBadgeInteractor newBadgeInteractorA2 = AppModule_ProvidesNewBadgeInteractorFactory.a(appModule2, AppModule_ProvidesNewBadgeRepositoryFactory.a(appModule2, BaseDataModule_ProvidesNewBadgePrefs$base_impl_releaseFactory.a(baseDataModule3, Contexts.a(applicationContextModule2.f23776a))));
                        AppConfig appConfig = (AppConfig) singletonCImpl.W0.get();
                        FeatureToggleManager featureToggleManager4 = (FeatureToggleManager) singletonCImpl.P0.get();
                        SingletonCImpl singletonCImpl7 = viewModelCImpl.d;
                        GuestLoginInteractorImpl guestLoginInteractorImplL2 = singletonCImpl7.L();
                        ShopAccountInteractor shopAccountInteractor2 = (ShopAccountInteractor) singletonCImpl7.Y0.get();
                        LogOutInteractorImpl logOutInteractorImplX0 = SingletonCImpl.X0(singletonCImpl7);
                        InStoreWifiInteractor inStoreWifiInteractor = (InStoreWifiInteractor) singletonCImpl7.M2.get();
                        ApolloClient apolloClient = (ApolloClient) singletonCImpl7.C1.get();
                        FeatureToggleManager featureToggleManager5 = (FeatureToggleManager) singletonCImpl7.P0.get();
                        Context context2 = singletonCImpl7.e.f23776a;
                        Preconditions.d(context2);
                        MoreInteractor moreInteractor = new MoreInteractor(guestLoginInteractorImplL2, shopAccountInteractor2, logOutInteractorImplX0, inStoreWifiInteractor, new MoreRepository(apolloClient, featureToggleManager5, context2), (ShoppingListSyncInteractor) singletonCImpl7.L2.get(), (CollectionModeInteractor) singletonCImpl7.q1.get(), (RewardsAccountInteractor) singletonCImpl7.Y1.get());
                        BannerDismissInteractor bannerDismissInteractorF = ViewModelCImpl.f(viewModelCImpl);
                        CollectionModeInteractor collectionModeInteractor5 = (CollectionModeInteractor) singletonCImpl.q1.get();
                        ShopAuthManager shopAuthManager = (ShopAuthManager) singletonCImpl.R3.get();
                        ShopAccountInteractor shopAccountInteractor3 = (ShopAccountInteractor) singletonCImpl.Y0.get();
                        Application applicationA4 = Contexts.a(applicationContextModule2.f23776a);
                        baseDataModule3.getClass();
                        SharedPreferences sharedPreferencesB2 = androidx.constraintlayout.core.state.a.b(applicationA4.getPackageName(), ".shop.onboarding", applicationA4, 0, "getSharedPreferences(...)");
                        FeatureToggleManager featureToggleManager6 = (FeatureToggleManager) singletonCImpl.P0.get();
                        appModule2.getClass();
                        Intrinsics.h(featureToggleManager6, "featureToggleManager");
                        return new MoreViewModel(rewardsAccountInteractor3, analyticsManager2, legacyShopAnalyticsManager, schedulersProvider2, newBadgeInteractorA2, appConfig, featureToggleManager4, moreInteractor, bannerDismissInteractorF, collectionModeInteractor5, shopAuthManager, shopAccountInteractor3, new OnboardingInteractorImpl(new OnboardingRepository(sharedPreferencesB2, featureToggleManager6)), (ShopAppRegionInteractor) singletonCImpl.O0.get(), SingletonCImpl.Q0(singletonCImpl), (ShopAppFlavorInteractor) singletonCImpl.N0.get());
                    case 93:
                        return new MyListsViewModel((ShoppingListSyncInteractor) singletonCImpl.L2.get(), (ShoppingListInteractor) singletonCImpl.e4.get(), (ShoppingListItemInteractor) singletonCImpl.f4.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), SingletonCImpl.S0(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (ListsInMemoryRepository) singletonCImpl.E2.get(), (ShoppingListsRepository) singletonCImpl.B2.get(), (WatchlistInteractor) singletonCImpl.i4.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 94:
                        return new NutritionBottomSheetViewModel();
                    case 95:
                        return new au.com.woolworths.feature.product.list.nutrition.NutritionBottomSheetViewModel();
                    case 96:
                        OliveVoiceModule oliveVoiceModule = activityRetainedCImpl.i;
                        SingletonCImpl singletonCImpl8 = activityRetainedCImpl.n;
                        OliveVoiceInteractorImpl oliveVoiceInteractorImplA = OliveVoiceModule_ProvidesOliveVoiceInteractorFactory.a(oliveVoiceModule, OliveVoiceModule_ProvidesOliveVoiceRepositoryFactory.a(oliveVoiceModule, (ApolloClient) singletonCImpl8.C1.get(), OliveVoiceModule_ProvidesSharedPreferencesFactory.a(oliveVoiceModule, Contexts.a(singletonCImpl8.e.f23776a)), (FeatureToggleManager) singletonCImpl8.P0.get()));
                        OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImplA = OliveVoiceModule_ProvidesOliveVoiceSpeechRecogniserFactory.a(activityRetainedCImpl.i);
                        AnalyticsManager analyticsManager3 = (AnalyticsManager) singletonCImpl.r2.get();
                        FeatureToggleManager featureToggleManager7 = (FeatureToggleManager) singletonCImpl.P0.get();
                        Context context3 = singletonCImpl.e.f23776a;
                        Preconditions.d(context3);
                        return new OliveVoiceViewModel(oliveVoiceInteractorImplA, oliveVoiceSpeechRecogniserImplA, analyticsManager3, featureToggleManager7, context3);
                    case 97:
                        return new OnboardingCoachMarksViewModel((ProgressiveCoachMarkManager) singletonCImpl.E4.get());
                    case 98:
                        Provider provider3 = singletonCImpl.r2;
                        ApplicationContextModule applicationContextModule3 = singletonCImpl.e;
                        AnalyticsManager analyticsManager4 = (AnalyticsManager) provider3.get();
                        BranchDeepLinkInteractorImpl branchDeepLinkInteractorImplR0 = SingletonCImpl.R0(singletonCImpl);
                        AppModule appModule3 = singletonCImpl.b;
                        BaseDataModule baseDataModule4 = singletonCImpl.I;
                        Application applicationA5 = Contexts.a(applicationContextModule3.f23776a);
                        baseDataModule4.getClass();
                        SharedPreferences sharedPreferencesB3 = androidx.constraintlayout.core.state.a.b(applicationA5.getPackageName(), ".shop.onboarding", applicationA5, 0, "getSharedPreferences(...)");
                        FeatureToggleManager featureToggleManager8 = (FeatureToggleManager) singletonCImpl.P0.get();
                        appModule3.getClass();
                        Intrinsics.h(featureToggleManager8, "featureToggleManager");
                        OnboardingInteractorImpl onboardingInteractorImpl = new OnboardingInteractorImpl(new OnboardingRepository(sharedPreferencesB3, featureToggleManager8));
                        GuestLoginInteractorImpl guestLoginInteractorImplL3 = singletonCImpl.L();
                        OnboardingSduiAppModule onboardingSduiAppModule = singletonCImpl.w0;
                        Context context4 = applicationContextModule3.f23776a;
                        Preconditions.d(context4);
                        onboardingSduiAppModule.getClass();
                        return new OnboardingSduiViewModel(analyticsManager4, branchDeepLinkInteractorImplR0, onboardingInteractorImpl, guestLoginInteractorImplL3, new DefaultOnboardingContentPageDataProviderImpl(context4));
                    case 99:
                        AnalyticsManager analyticsManager5 = (AnalyticsManager) singletonCImpl.r2.get();
                        BranchDeepLinkInteractorImpl branchDeepLinkInteractorImplR02 = SingletonCImpl.R0(singletonCImpl);
                        FeatureToggleManager featureToggleManager9 = (FeatureToggleManager) singletonCImpl.P0.get();
                        AppModule appModule4 = singletonCImpl.b;
                        BaseDataModule baseDataModule5 = singletonCImpl.I;
                        Application applicationA6 = Contexts.a(singletonCImpl.e.f23776a);
                        baseDataModule5.getClass();
                        SharedPreferences sharedPreferencesB4 = androidx.constraintlayout.core.state.a.b(applicationA6.getPackageName(), ".shop.onboarding", applicationA6, 0, "getSharedPreferences(...)");
                        FeatureToggleManager featureToggleManager10 = (FeatureToggleManager) singletonCImpl.P0.get();
                        appModule4.getClass();
                        Intrinsics.h(featureToggleManager10, "featureToggleManager");
                        return new OnboardingViewModel(analyticsManager5, branchDeepLinkInteractorImplR02, featureToggleManager9, new OnboardingInteractorImpl(new OnboardingRepository(sharedPreferencesB4, featureToggleManager10)), singletonCImpl.L(), (NetworkExceptions) singletonCImpl.m1.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get());
                    default:
                        throw new AssertionError(i);
                }
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i = this.d;
                int i2 = i / 100;
                if (i2 == 0) {
                    return a();
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new AssertionError(i);
                    }
                    switch (i) {
                        case 200:
                            return new OfferDetailsViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.10
                                @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel.Factory
                                public final OfferDetailsViewModel a(OfferDetailsParams offerDetailsParams, boolean z, List list) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    SingletonCImpl singletonCImpl = switchingProvider.b.n;
                                    OfferDetailsInteractorImpl offerDetailsInteractorImpl = new OfferDetailsInteractorImpl(new OfferDetailsRepository((ApolloClient) singletonCImpl.Q1.get(), (FeatureToggleManager) singletonCImpl.P0.get()), new ShopAppInstallationInteractor(Contexts.a(singletonCImpl.e.f23776a)));
                                    RewardsOfferAnalyticsManager rewardsOfferAnalyticsManagerY = ViewModelCImpl.Y(switchingProvider.c);
                                    SingletonCImpl singletonCImpl2 = switchingProvider.f4187a;
                                    return new OfferDetailsViewModel(offerDetailsParams, z, list, offerDetailsInteractorImpl, rewardsOfferAnalyticsManagerY, (SwrveInteractor) singletonCImpl2.j2.get(), (FeatureToggleManager) singletonCImpl2.P0.get());
                                }
                            };
                        case 201:
                            return new OfferListPageViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.11
                                @Override // au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel.Factory
                                public final OfferListPageViewModel a(String str, String str2) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    ViewModelCImpl viewModelCImpl = switchingProvider.c;
                                    OfferListPageInteractor offerListPageInteractor = new OfferListPageInteractor((RewardsOfferRepository) viewModelCImpl.d.N4.get());
                                    au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor rewardsBannerInteractorU = ViewModelCImpl.U(viewModelCImpl);
                                    SingletonCImpl singletonCImpl = switchingProvider.f4187a;
                                    return new OfferListPageViewModel(str, str2, offerListPageInteractor, rewardsBannerInteractorU, SingletonCImpl.b1(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get(), ViewModelCImpl.Y(viewModelCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b));
                                }
                            };
                        case DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER /* 202 */:
                            return new OrderDetailsHelpViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.12
                                @Override // au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpViewModel.Factory
                                public final OrderDetailsHelpViewModel a(Screen screen) {
                                    return new OrderDetailsHelpViewModel(screen, (AnalyticsManager) SwitchingProvider.this.f4187a.r2.get());
                                }
                            };
                        case DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER /* 203 */:
                            return new PaymentViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.13
                                @Override // au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel.Factory
                                public final PaymentViewModel a(String str) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    ViewModelCImpl viewModelCImpl = switchingProvider.c;
                                    PaymentDataRepository paymentDataRepository = new PaymentDataRepository((ApolloClient) viewModelCImpl.e.n.C1.get());
                                    SingletonCImpl singletonCImpl = viewModelCImpl.d;
                                    return new PaymentViewModel(str, new DeliveryUnlimitedPaymentInteractor(paymentDataRepository, (SharedHeaders) singletonCImpl.c1.get(), ReleaseModule_ProvidesSquadWebViewInteractorFactory.a(singletonCImpl.c)), new UnlinkCreditCardInteractor(new CreditCardDataRepository((ApolloClient) viewModelCImpl.e.n.C1.get())), new CreditCardFormEventParser(), new WPayAnalyticsTracker((AnalyticsManager) viewModelCImpl.d.r2.get()), (ConnectionManager) switchingProvider.f4187a.L0.get());
                                }
                            };
                        case 204:
                            return new ProductDetailsViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.14
                                @Override // au.com.woolworths.shop.product.details.ProductDetailsViewModel.Factory
                                public final ProductDetailsViewModel a(String str, String str2, boolean z) {
                                    SingletonCImpl singletonCImpl = SwitchingProvider.this.f4187a;
                                    return new ProductDetailsViewModel(str, z, str2, (ProductDetailsPageInteractor) singletonCImpl.h4.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (AnalyticsManager) singletonCImpl.r2.get(), (TrolleyInteractor) singletonCImpl.h2.get(), (ProductBoostInteractor) singletonCImpl.C2.get(), (CartUpdateInteractor) singletonCImpl.D2.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get(), (WatchlistInteractor) singletonCImpl.i4.get(), singletonCImpl.A1(), (ShippingCalculatorDataStore) singletonCImpl.n4.get());
                                }
                            };
                        case 205:
                            return new ProductListViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.15
                                @Override // au.com.woolworths.feature.product.list.ProductListViewModel.Factory
                                public final ProductListViewModel a(Activities.ProductList.Extras extras) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    au.com.woolworths.feature.product.list.ProductListInteractor productListInteractor = (au.com.woolworths.feature.product.list.ProductListInteractor) switchingProvider.b.w.get();
                                    ViewModelCImpl viewModelCImpl = switchingProvider.c;
                                    au.com.woolworths.feature.product.list.ProductListInteractor productListInteractor2 = (au.com.woolworths.feature.product.list.ProductListInteractor) viewModelCImpl.e.w.get();
                                    SingletonCImpl singletonCImpl = viewModelCImpl.d;
                                    ProductListPaginationAdapter productListPaginationAdapter = new ProductListPaginationAdapter(productListInteractor2, (FeatureToggleManager) singletonCImpl.P0.get(), (RepositoryManager) singletonCImpl.t1.get());
                                    SingletonCImpl singletonCImpl2 = switchingProvider.f4187a;
                                    ShopAccountInteractor shopAccountInteractor = (ShopAccountInteractor) singletonCImpl2.Y0.get();
                                    AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl2.r2.get();
                                    TrolleyInteractor trolleyInteractor = (TrolleyInteractor) singletonCImpl2.h2.get();
                                    GoogleAdManagerInteractor googleAdManagerInteractor = (GoogleAdManagerInteractor) singletonCImpl2.m4.get();
                                    FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl2.P0.get();
                                    RepositoryManager repositoryManager = (RepositoryManager) singletonCImpl2.t1.get();
                                    ProductBoostInteractor productBoostInteractor = (ProductBoostInteractor) singletonCImpl2.C2.get();
                                    RewardsOfferActivationInteractor rewardsOfferActivationInteractorB1 = SingletonCImpl.b1(singletonCImpl2);
                                    InstoreNavigationInteractor instoreNavigationInteractor = (InstoreNavigationInteractor) singletonCImpl2.E3.get();
                                    ReplaceProductResultRouter replaceProductResultRouter = (ReplaceProductResultRouter) singletonCImpl2.Z3.get();
                                    WatchlistInteractor watchlistInteractor = (WatchlistInteractor) singletonCImpl2.i4.get();
                                    InstoreNavigationAppModule instoreNavigationAppModule = singletonCImpl2.n;
                                    return new ProductListViewModel(extras, productListInteractor, productListPaginationAdapter, shopAccountInteractor, analyticsManager, trolleyInteractor, googleAdManagerInteractor, featureToggleManager, repositoryManager, productBoostInteractor, rewardsOfferActivationInteractorB1, instoreNavigationInteractor, replaceProductResultRouter, watchlistInteractor, InstoreNavigationAppModule_ProvideMapFeatureHighlightStatusInteractorFactory.a(instoreNavigationAppModule, InstoreNavigationAppModule_ProvidesProductFinderRepositoryFactory.a(instoreNavigationAppModule, InstoreNavigationAppModule_ProvidesSharedPreferencesFactory.a(instoreNavigationAppModule, Contexts.a(singletonCImpl2.e.f23776a))), (InstoreNavigationInteractor) singletonCImpl2.E3.get()), (ShopAppRegionInteractor) singletonCImpl2.O0.get(), NhpModule_ProvideEdrOfferBoosterFactory.a((ApolloClient) singletonCImpl2.C1.get()), (CartUpdateInteractor) singletonCImpl2.D2.get(), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl2.c));
                                }
                            };
                        case 206:
                            return new ProductListViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.16
                                @Override // au.com.woolworths.feature.product.list.v2.ProductListViewModel.Factory
                                public final au.com.woolworths.feature.product.list.v2.ProductListViewModel a(Activities.ProductList.Extras extras) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    SingletonCImpl singletonCImpl = switchingProvider.f4187a;
                                    CartUpdateInteractor cartUpdateInteractor = (CartUpdateInteractor) singletonCImpl.D2.get();
                                    CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) singletonCImpl.q1.get();
                                    FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
                                    InstoreNavigationInteractor instoreNavigationInteractor = (InstoreNavigationInteractor) singletonCImpl.E3.get();
                                    ProductListInteractorImpl productListInteractorImplJ = ActivityRetainedCImpl.j(switchingProvider.b);
                                    ViewModelCImpl viewModelCImpl = switchingProvider.c;
                                    return new au.com.woolworths.feature.product.list.v2.ProductListViewModel(extras, cartUpdateInteractor, collectionModeInteractor, featureToggleManager, instoreNavigationInteractor, productListInteractorImplJ, new au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter(ActivityRetainedCImpl.j(viewModelCImpl.e), (RepositoryManager) viewModelCImpl.d.t1.get()), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (WatchlistInteractor) singletonCImpl.i4.get());
                                }
                            };
                        case 207:
                            return new QuickAddOfferViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.17
                                @Override // au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel.Factory
                                public final QuickAddOfferViewModel a(String str) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    return new QuickAddOfferViewModel(str, new QuickAddOfferInteractor(new QuickAddOfferDataRepository((ApolloClient) switchingProvider.c.e.n.C1.get())), (AnalyticsManager) switchingProvider.f4187a.r2.get());
                                }
                            };
                        case 208:
                            return new ReviewsViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.18
                                @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel.Factory
                                public final ReviewsViewModel a(String str) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    SingletonCImpl singletonCImpl = switchingProvider.c.d;
                                    return new ReviewsViewModel(str, new RatingsAndReviewsPaginationAdapter(new ReviewsInteractor(new ReviewsRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.C1.get())), singletonCImpl.A1()), (AnalyticsManager) switchingProvider.f4187a.r2.get());
                                }
                            };
                        case 209:
                            return new RewardsOfferDetailsViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.19
                                @Override // au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel.Factory
                                public final RewardsOfferDetailsViewModel a(OfferDetailsParamsLegacy offerDetailsParamsLegacy, boolean z, List list) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    ViewModelCImpl viewModelCImpl = switchingProvider.c;
                                    RewardsOfferDetailInteractorLegacy rewardsOfferDetailInteractorLegacy = new RewardsOfferDetailInteractorLegacy((RewardsOfferRepository) viewModelCImpl.d.N4.get());
                                    RewardsOfferDetailScreenInteractorLegacy rewardsOfferDetailScreenInteractorLegacy = new RewardsOfferDetailScreenInteractorLegacy((RewardsOfferRepository) viewModelCImpl.d.N4.get());
                                    SingletonCImpl singletonCImpl = switchingProvider.f4187a;
                                    return new RewardsOfferDetailsViewModel(rewardsOfferDetailInteractorLegacy, rewardsOfferDetailScreenInteractorLegacy, SingletonCImpl.b1(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get(), ViewModelCImpl.Y(viewModelCImpl), AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b), (FeatureToggleManager) singletonCImpl.P0.get(), offerDetailsParamsLegacy, z, list);
                                }
                            };
                        case 210:
                            return new SelectPlanViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.20
                                @Override // au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanViewModel.Factory
                                public final SelectPlanViewModel a(ArrayList arrayList, boolean z) {
                                    SingletonCImpl singletonCImpl = SwitchingProvider.this.f4187a;
                                    return new SelectPlanViewModel(arrayList, z, Contexts.a(singletonCImpl.e.f23776a), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                                }
                            };
                        case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                            return new StoreDetailsViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.21
                                @Override // au.com.woolworths.feature.shop.storelocator.details.StoreDetailsViewModel.Factory
                                public final StoreDetailsViewModel a(boolean z) {
                                    SingletonCImpl singletonCImpl = SwitchingProvider.this.f4187a;
                                    return new StoreDetailsViewModel(SingletonCImpl.W0(singletonCImpl), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), SingletonCImpl.p1(singletonCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), z);
                                }
                            };
                        case 212:
                            return new StoreDetailsViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.22
                                @Override // au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel.Factory
                                public final au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel a(boolean z) {
                                    SingletonCImpl singletonCImpl = SwitchingProvider.this.f4187a;
                                    return new au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel(SingletonCImpl.W0(singletonCImpl), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), SingletonCImpl.p1(singletonCImpl), (FeatureToggleManager) singletonCImpl.P0.get(), z);
                                }
                            };
                        case 213:
                            return new SubmitReviewViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.23
                                @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel.Factory
                                public final SubmitReviewViewModel a(String str) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    SingletonCImpl singletonCImpl = switchingProvider.f4187a;
                                    AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
                                    SingletonCImpl singletonCImpl2 = switchingProvider.c.d;
                                    return new SubmitReviewViewModel(str, analyticsManager, new SubmitReviewInteractor(new SubmitReviewRepository((DispatcherProvider) singletonCImpl2.n1.get(), (ApolloClient) singletonCImpl2.C1.get())), (ShopAccountInteractor) singletonCImpl.Y0.get());
                                }
                            };
                        case 214:
                            return new YourGroceriesViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.24
                                @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel.Factory
                                public final YourGroceriesViewModel a(String str) {
                                    SwitchingProvider switchingProvider = SwitchingProvider.this;
                                    SingletonCImpl singletonCImpl = switchingProvider.f4187a;
                                    AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
                                    ViewModelCImpl viewModelCImpl = switchingProvider.c;
                                    SingletonCImpl singletonCImpl2 = viewModelCImpl.d;
                                    return new YourGroceriesViewModel(str, analyticsManager, new YourGroceriesInteractor(new YourGroceriesRepository((ApolloClient) singletonCImpl2.C1.get(), (FeatureToggleManager) singletonCImpl2.P0.get())), new SubstitutionRatingRepository((Context) viewModelCImpl.d.k1.get()), (FeatureToggleManager) singletonCImpl.P0.get());
                                }
                            };
                        default:
                            throw new AssertionError(i);
                    }
                }
                ActivityRetainedCImpl activityRetainedCImpl = this.b;
                ViewModelCImpl viewModelCImpl = this.c;
                SingletonCImpl singletonCImpl = this.f4187a;
                switch (i) {
                    case 100:
                        return new OrderCancellationPromptViewModel(ViewModelCImpl.F(viewModelCImpl), (DispatcherProvider) singletonCImpl.n1.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 101:
                        return new OrderConfirmationViewModel(ViewModelCImpl.H(viewModelCImpl), (EditOrderInteractor) singletonCImpl.L1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FirebaseAnalyticsManagerImpl) singletonCImpl.l2.get(), (GoogleAdManagerInteractor) singletonCImpl.m4.get(), (CartUpdateInteractor) singletonCImpl.D2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 102:
                        return new OrderDetailsViewModel(ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), ViewModelCImpl.I(viewModelCImpl), ViewModelCImpl.G(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (FeatureToggleManager) singletonCImpl.P0.get(), ViewModelCImpl.J(viewModelCImpl), ViewModelCImpl.M(viewModelCImpl), ViewModelCImpl.L(viewModelCImpl), (NotificationManager) singletonCImpl.M3.get(), (LocationInteractor) singletonCImpl.D3.get(), (EditOrderInteractor) singletonCImpl.L1.get(), ViewModelCImpl.b0(viewModelCImpl));
                    case 103:
                        return new OrdersListViewModel(ViewModelCImpl.K(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 104:
                        return new OrdersViewModel((ShopAccountInteractor) singletonCImpl.Y0.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 105:
                        return new PastShopsViewModel((PastShopInteractor) singletonCImpl.G4.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 106:
                        return new PayServicesErrorViewModel((PaymentServicesInteractor) singletonCImpl.e2.get(), (SchedulersProvider) singletonCImpl.o1.get());
                    case 107:
                        SingletonCImpl singletonCImpl2 = viewModelCImpl.d;
                        return new PickUpLocationResultViewModel(new PickUpLocatorInteractor((PickUpLocatorRepository) singletonCImpl2.I1.get(), (CollectionModeInteractor) singletonCImpl2.q1.get()), SingletonCImpl.W0(singletonCImpl), (NetworkExceptions) singletonCImpl.m1.get(), (SchedulersProvider) singletonCImpl.o1.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 108:
                        SingletonCImpl singletonCImpl3 = viewModelCImpl.d;
                        return new PickUpLocatorViewModel(new PickUpLocatorInteractor((PickUpLocatorRepository) singletonCImpl3.I1.get(), (CollectionModeInteractor) singletonCImpl3.q1.get()), (AnalyticsManager) singletonCImpl.r2.get(), (SchedulersProvider) singletonCImpl.o1.get(), (LocationInteractor) singletonCImpl.D3.get(), (NetworkExceptions) singletonCImpl.m1.get());
                    case 109:
                        return new PickupEtaSelectorViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 110:
                        Context context = singletonCImpl.e.f23776a;
                        Preconditions.d(context);
                        return new ProcessorViewModel(context, SingletonCImpl.V0(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 111:
                        return new ProductAvailabilityViewModel((ProductAvailabilityInteractor) singletonCImpl.L4.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 112:
                        return new ProductBoostResultViewModel((ProductBoostInteractor) singletonCImpl.C2.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 113:
                        return new ProductCategoryViewModel((AnalyticsManager) singletonCImpl.r2.get(), (InstorePresenceInteractor) singletonCImpl.t4.get(), SingletonCImpl.W0(singletonCImpl));
                    case 114:
                        return new au.com.woolworths.product.details.ProductDetailsViewModel(ViewModelCImpl.N(viewModelCImpl), (ShopAccountInteractor) singletonCImpl.Y0.get(), (TrolleyInteractor) singletonCImpl.h2.get(), (ProductBoostInteractor) singletonCImpl.C2.get(), (AnalyticsManager) singletonCImpl.r2.get(), SingletonCImpl.b1(singletonCImpl), new EducationBottomSheetRepository(activityRetainedCImpl.n.y1()), (ListsInMemoryRepository) singletonCImpl.E2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get(), singletonCImpl.A1());
                    case 115:
                        ProductFinderModule productFinderModule = viewModelCImpl.c;
                        SingletonCImpl singletonCImpl4 = viewModelCImpl.d;
                        InstoreNavigationAppModule instoreNavigationAppModule = singletonCImpl4.n;
                        return new ProductFinderOnboardingViewModel(ProductFinderModule_ProvidesProductFinderOnboardingInteractorFactory.a(productFinderModule, InstoreNavigationAppModule_ProvidesProductFinderRepositoryFactory.a(instoreNavigationAppModule, InstoreNavigationAppModule_ProvidesSharedPreferencesFactory.a(instoreNavigationAppModule, Contexts.a(singletonCImpl4.e.f23776a)))), (AnalyticsManager) singletonCImpl.r2.get());
                    case 116:
                        CollectionModeInteractor collectionModeInteractor = (CollectionModeInteractor) singletonCImpl.q1.get();
                        InstoreNavigationInteractor instoreNavigationInteractor = (InstoreNavigationInteractor) singletonCImpl.E3.get();
                        LocationInteractor locationInteractor = (LocationInteractor) singletonCImpl.D3.get();
                        WoolworthsSupermarketDatabase woolworthsSupermarketDatabase = (WoolworthsSupermarketDatabase) singletonCImpl.O3.get();
                        ProductFinderModule productFinderModule2 = viewModelCImpl.c;
                        SingletonCImpl singletonCImpl5 = viewModelCImpl.d;
                        InstoreNavigationAppModule instoreNavigationAppModule2 = singletonCImpl5.n;
                        return new ProductFinderViewModel(collectionModeInteractor, instoreNavigationInteractor, locationInteractor, woolworthsSupermarketDatabase, ProductFinderModule_ProvidesProductFinderOnboardingInteractorFactory.a(productFinderModule2, InstoreNavigationAppModule_ProvidesProductFinderRepositoryFactory.a(instoreNavigationAppModule2, InstoreNavigationAppModule_ProvidesSharedPreferencesFactory.a(instoreNavigationAppModule2, Contexts.a(singletonCImpl5.e.f23776a)))), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 117:
                        return new ProductImageGalleryViewModel((AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 118:
                        return new ProductListOptionsViewModel((FeatureToggleManager) singletonCImpl.P0.get(), (au.com.woolworths.feature.product.list.ProductListInteractor) activityRetainedCImpl.w.get(), (AnalyticsManager) singletonCImpl.r2.get(), viewModelCImpl.f4186a);
                    case 119:
                        return new au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel((FeatureToggleManager) singletonCImpl.P0.get(), (ProductListInteractor) activityRetainedCImpl.z.get(), (AnalyticsManager) singletonCImpl.r2.get(), viewModelCImpl.f4186a);
                    case 120:
                        ProductListInteractor productListInteractor = (ProductListInteractor) activityRetainedCImpl.z.get();
                        ShopAccountInteractor shopAccountInteractor = (ShopAccountInteractor) singletonCImpl.Y0.get();
                        AnalyticsManager analyticsManager = (AnalyticsManager) singletonCImpl.r2.get();
                        TrolleyInteractor trolleyInteractor = (TrolleyInteractor) singletonCImpl.h2.get();
                        GoogleAdManagerInteractor googleAdManagerInteractor = (GoogleAdManagerInteractor) singletonCImpl.m4.get();
                        FeatureToggleManager featureToggleManager = (FeatureToggleManager) singletonCImpl.P0.get();
                        RepositoryManager repositoryManager = (RepositoryManager) singletonCImpl.t1.get();
                        ProductBoostInteractor productBoostInteractor = (ProductBoostInteractor) singletonCImpl.C2.get();
                        RewardsOfferActivationInteractor rewardsOfferActivationInteractorB1 = SingletonCImpl.b1(singletonCImpl);
                        InstoreNavigationInteractor instoreNavigationInteractor2 = (InstoreNavigationInteractor) singletonCImpl.E3.get();
                        ReplaceProductResultRouter replaceProductResultRouter = (ReplaceProductResultRouter) singletonCImpl.Z3.get();
                        WatchlistInteractor watchlistInteractor = (WatchlistInteractor) singletonCImpl.i4.get();
                        InstoreNavigationAppModule instoreNavigationAppModule3 = singletonCImpl.n;
                        return new au.com.woolworths.feature.product.list.legacy.ProductListViewModel(productListInteractor, shopAccountInteractor, analyticsManager, trolleyInteractor, googleAdManagerInteractor, featureToggleManager, repositoryManager, productBoostInteractor, rewardsOfferActivationInteractorB1, instoreNavigationInteractor2, replaceProductResultRouter, watchlistInteractor, InstoreNavigationAppModule_ProvideMapFeatureHighlightStatusInteractorFactory.a(instoreNavigationAppModule3, InstoreNavigationAppModule_ProvidesProductFinderRepositoryFactory.a(instoreNavigationAppModule3, InstoreNavigationAppModule_ProvidesSharedPreferencesFactory.a(instoreNavigationAppModule3, Contexts.a(singletonCImpl.e.f23776a))), (InstoreNavigationInteractor) singletonCImpl.E3.get()), (ShopAppRegionInteractor) singletonCImpl.O0.get(), ReleaseModule_ProvidesSettingsInteractorFactory.a(singletonCImpl.c), NhpModule_ProvideEdrOfferBoosterFactory.a((ApolloClient) singletonCImpl.C1.get()));
                    case 121:
                        return new ProductMessageBottomSheetViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 122:
                        return new ProgressStepperInfoUpliftViewModel(viewModelCImpl.f4186a);
                    case 123:
                        return new ProgressStepperInfoViewModel(viewModelCImpl.f4186a);
                    case 124:
                        return new PromoAppViewModel(ViewModelCImpl.O(viewModelCImpl));
                    case 125:
                        return new PromotionDetailsViewModel(ViewModelCImpl.P(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (WatchlistInteractor) singletonCImpl.i4.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 126:
                        return new PromotionListingViewModel(ViewModelCImpl.Q(viewModelCImpl), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 127:
                        return new PromotionViewModel();
                    case 128:
                        return new ProofOfDeliveryViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 129:
                        return new RecipeDetailsViewModel(ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), (RecipeDetailsInteractor) singletonCImpl.P4.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (AnalyticsManager) singletonCImpl.r2.get(), (GoogleAdManagerInteractor) singletonCImpl.m4.get(), (CartUpdateInteractor) singletonCImpl.D2.get());
                    case 130:
                        return new RecipeListViewModel(ApplicationContextModule_ProvideApplicationFactory.a(singletonCImpl.e), ViewModelCImpl.S(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (GoogleAdManagerInteractor) singletonCImpl.m4.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 131:
                        return new RecipeSearchViewModel(ViewModelCImpl.R(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 132:
                        return new RefundViewModel();
                    case 133:
                        return new RemoteDismissibleBannerViewModel((BannerRemoteDismissInteractor) singletonCImpl.Q4.get());
                    case 134:
                        return new RewardsAppModalViewModel(ViewModelCImpl.T(viewModelCImpl), (PushNotificationPermissionInteractor) singletonCImpl.g4.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 135:
                        return new RewardsAuthenticationViewModelNew((FeatureToggleManager) singletonCImpl.P0.get(), (RewardsAccountInteractor) singletonCImpl.Y1.get());
                    case 136:
                        return new RewardsAuthenticationViewModel((RewardsAccountInteractor) singletonCImpl.Y1.get(), (SchedulersProvider) singletonCImpl.o1.get(), (NetworkExceptions) singletonCImpl.m1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (SharedHeaders) singletonCImpl.c1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 137:
                        return new RewardsBoostersViewModelLegacy(ViewModelCImpl.Z(viewModelCImpl), (RewardsAccountInteractor) singletonCImpl.Y1.get(), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (AnalyticsManager) singletonCImpl.r2.get(), AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b));
                    case 138:
                        return new RewardsCallbackUrlViewModel(ViewModelCImpl.X(viewModelCImpl), (RewardsAccountInteractor) singletonCImpl.Y1.get());
                    case 139:
                        return new RewardsCardOverlayViewModel((RewardsAccountInteractor) singletonCImpl.Y1.get(), ViewModelCImpl.V(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (AppIdentifier) singletonCImpl.Q3.get());
                    case 140:
                        return new RewardsHomeBridgeViewModel();
                    case 141:
                        return new RewardsMagicLinkViewModel(ViewModelCImpl.X(viewModelCImpl), (AccountSettingsInteractorOld) singletonCImpl.c4.get(), (RewardsAccountInteractor) singletonCImpl.Y1.get(), (RewardsAppTokenAuthenticator) singletonCImpl.q4.get());
                    case 142:
                        return new RewardsOffersHomeViewModel((RewardsAccountInteractor) singletonCImpl.Y1.get(), ViewModelCImpl.W(viewModelCImpl), SingletonCImpl.b1(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get(), AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b), ViewModelCImpl.U(viewModelCImpl), ViewModelCImpl.C(viewModelCImpl), (DeepLinkInteractor) singletonCImpl.S4.get(), (HomeRefreshInteractor) singletonCImpl.T4.get(), (FeatureToggleManager) singletonCImpl.P0.get(), ViewModelCImpl.Y(viewModelCImpl));
                    case 143:
                        RewardsAccountInteractor rewardsAccountInteractor = (RewardsAccountInteractor) singletonCImpl.Y1.get();
                        SingletonCImpl singletonCImpl6 = viewModelCImpl.d;
                        return new RewardsOffersViewModelLegacy(rewardsAccountInteractor, new RewardsOfferFeedInteractor((RewardsOfferRepository) singletonCImpl6.N4.get(), (RewardsPointsBalanceRepository) singletonCImpl6.d4.get()), SingletonCImpl.b1(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get(), ViewModelCImpl.Y(viewModelCImpl), AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b), ViewModelCImpl.U(viewModelCImpl), ViewModelCImpl.C(viewModelCImpl), (DeepLinkInteractor) singletonCImpl.S4.get());
                    case 144:
                        RewardsAccountInteractor rewardsAccountInteractor2 = (RewardsAccountInteractor) singletonCImpl.Y1.get();
                        SingletonCImpl singletonCImpl7 = viewModelCImpl.d;
                        return new RewardsPointsViewModel(rewardsAccountInteractor2, new RewardsOfferFeedInteractor((RewardsOfferRepository) singletonCImpl7.N4.get(), (RewardsPointsBalanceRepository) singletonCImpl7.d4.get()), SingletonCImpl.b1(singletonCImpl), (AnalyticsManager) singletonCImpl.r2.get(), AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b), ViewModelCImpl.U(viewModelCImpl), ViewModelCImpl.C(viewModelCImpl), (DeepLinkInteractor) singletonCImpl.S4.get(), (HomeRefreshInteractor) singletonCImpl.T4.get(), (FeatureToggleManager) singletonCImpl.P0.get(), ViewModelCImpl.Y(viewModelCImpl), (RewardsPageScrollManager) singletonCImpl.U4.get());
                    case 145:
                        return new RewardsPreferenceDetailsViewModelLegacy(new RewardsPreferenceDetailsInteractor((RewardsPreferenceDetailsRepository) viewModelCImpl.d.V4.get()), (RewardsActivityInteractor) singletonCImpl.W4.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 146:
                        RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor = new RewardsPreferenceDetailsInteractor((RewardsPreferenceDetailsRepository) viewModelCImpl.d.V4.get());
                        RewardsActivityInteractor rewardsActivityInteractor = (RewardsActivityInteractor) singletonCImpl.W4.get();
                        RewardsAccountInteractor rewardsAccountInteractor3 = (RewardsAccountInteractor) singletonCImpl.Y1.get();
                        AnalyticsManager analyticsManager2 = (AnalyticsManager) singletonCImpl.r2.get();
                        NotificationManager notificationManager = (NotificationManager) singletonCImpl.M3.get();
                        Context context2 = singletonCImpl.e.f23776a;
                        Preconditions.d(context2);
                        return new RewardsPreferenceDetailsViewModel(rewardsPreferenceDetailsInteractor, rewardsActivityInteractor, rewardsAccountInteractor3, analyticsManager2, notificationManager, context2);
                    case 147:
                        return new RewardsPushPreferenceDetailsViewModelLegacy(new RewardsPreferenceDetailsInteractor((RewardsPreferenceDetailsRepository) viewModelCImpl.d.V4.get()), (RewardsActivityInteractor) singletonCImpl.W4.get(), (AnalyticsManager) singletonCImpl.r2.get(), (NotificationManager) singletonCImpl.M3.get());
                    case 148:
                        return new RewardsRedemptionSettingsViewModel(ActivityRetainedCImpl.k(activityRetainedCImpl), (AppConfig) singletonCImpl.W0.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 149:
                        return new RewardsSettingsViewModel(ViewModelCImpl.a0(viewModelCImpl), (NetworkExceptions) singletonCImpl.m1.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 150:
                        return new RewardsSetupPrimingViewModel((LaunchManager) singletonCImpl.P3.get(), new GetScreenDataInteractor(new PrimingScreenRepositoryImpl((DispatcherProvider) viewModelCImpl.e.n.n1.get())), (AnalyticsManager) singletonCImpl.r2.get());
                    case 151:
                        return new RewardsSetupViewModel((LaunchManager) singletonCImpl.P3.get(), (AnalyticsManager) singletonCImpl.r2.get(), (LegacyShopAnalyticsManager) singletonCImpl.r1.get());
                    case 152:
                        return new RewardsViewModelLegacy((RewardsAccountInteractor) singletonCImpl.Y1.get());
                    case 153:
                        return new RewardsWalletOcrViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 154:
                        return new SavedRecipesViewModel(ViewModelCImpl.S(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get(), (ShopAccountInteractor) singletonCImpl.Y0.get());
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                        RewardsRedemptionSettingsModule rewardsRedemptionSettingsModule = activityRetainedCImpl.j;
                        return new SecureDollarsViewModel(RewardsRedemptionSettingsModule_ProvideSecureDollarsInteractorFactory.a(rewardsRedemptionSettingsModule, RewardsRedemptionSettingsModule_ProvideSecureDollarsRepositoryFactory.a(rewardsRedemptionSettingsModule, (ApolloClient) activityRetainedCImpl.n.Q1.get())), (AnalyticsManager) singletonCImpl.r2.get());
                    case 156:
                        return new SecurityPreferencesViewModel(new SecurityPreferencesInteractor(new SecurityPreferencesRepository((ApolloClient) viewModelCImpl.d.Q1.get())), (AnalyticsManager) singletonCImpl.r2.get());
                    case 157:
                        return new ServiceUnavailableViewModel();
                    case 158:
                        return new ShippingCalculatorViewModel((ShippingCalculatorInteractor) singletonCImpl.Y4.get(), (ShippingCalculatorDataStore) singletonCImpl.n4.get());
                    case 159:
                        SingletonCImpl singletonCImpl8 = viewModelCImpl.d;
                        return new ShopAppDeepLinkHandlerViewModel(new ShopAppDeepLinkInteractor(new ShopAppDeepLinkRepository((ApolloClient) singletonCImpl8.C1.get(), singletonCImpl8.A1())), (CollectionModeInteractor) singletonCImpl.q1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 160:
                        return new ShopNotificationPreferencesDetailsViewModel((AnalyticsManager) singletonCImpl.r2.get(), (PreferencesDetailsInteractor) singletonCImpl.L3.get(), (NotificationManager) singletonCImpl.M3.get());
                    case 161:
                        return new ShopNotificationPreferencesGuestViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 162:
                        return new ShopNotificationPreferencesViewModel((ShopAccountInteractor) singletonCImpl.Y0.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 163:
                        SingletonCImpl singletonCImpl9 = viewModelCImpl.d;
                        GetReceiptListInteractor getReceiptListInteractor = new GetReceiptListInteractor(new ReceiptListRepository((DispatcherProvider) singletonCImpl9.n1.get(), (ApolloClient) singletonCImpl9.C1.get()));
                        SingletonCImpl singletonCImpl10 = viewModelCImpl.d;
                        return new ShopReceiptListViewModel(getReceiptListInteractor, new ReceiptPaginationAdapter(new GetReceiptListInteractor(new ReceiptListRepository((DispatcherProvider) singletonCImpl10.n1.get(), (ApolloClient) singletonCImpl10.C1.get()))), (AnalyticsManager) singletonCImpl.r2.get());
                    case 164:
                        return new ShopRewardsViewModel((ShopAppRegionInteractor) singletonCImpl.O0.get(), (RewardsAccountInteractor) singletonCImpl.Y1.get(), ViewModelCImpl.Z(viewModelCImpl), (FirebasePerfMonitor) singletonCImpl.Z0.get(), (AnalyticsManager) singletonCImpl.r2.get(), AppModule_ProvideSwrveEventTrackerFactory.a(singletonCImpl.b));
                    case 165:
                        Application applicationA = Contexts.a(singletonCImpl.e.f23776a);
                        ShoppingListInteractor shoppingListInteractor = (ShoppingListInteractor) singletonCImpl.e4.get();
                        ShoppingListItemInteractor shoppingListItemInteractor = (ShoppingListItemInteractor) singletonCImpl.f4.get();
                        ShoppingListsRepository shoppingListsRepository = (ShoppingListsRepository) singletonCImpl.B2.get();
                        ShoppingListSyncInteractor shoppingListSyncInteractor = (ShoppingListSyncInteractor) singletonCImpl.L2.get();
                        TrolleyInteractor trolleyInteractor2 = (TrolleyInteractor) singletonCImpl.h2.get();
                        ProductBoostInteractor productBoostInteractor2 = (ProductBoostInteractor) singletonCImpl.C2.get();
                        ListsInMemoryRepository listsInMemoryRepository = (ListsInMemoryRepository) singletonCImpl.E2.get();
                        ListsUtils listsUtils = (ListsUtils) singletonCImpl.N3.get();
                        SingletonCImpl singletonCImpl11 = viewModelCImpl.d;
                        return new ShoppingListDetailsViewModel(applicationA, shoppingListInteractor, shoppingListItemInteractor, shoppingListsRepository, shoppingListSyncInteractor, trolleyInteractor2, productBoostInteractor2, listsInMemoryRepository, listsUtils, new BoostExt((ProductBoostInteractor) singletonCImpl11.C2.get(), (TrolleyInteractor) singletonCImpl11.h2.get(), (CartUpdateInteractor) singletonCImpl11.D2.get(), (ListsInMemoryRepository) singletonCImpl11.E2.get()), (ProductItemState) singletonCImpl.B4.get(), (ListDetailsInteractor) singletonCImpl.A4.get(), (AnalyticsManager) singletonCImpl.r2.get(), (WatchlistInteractor) singletonCImpl.i4.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 166:
                        return new SignUpViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 167:
                        return new SngListsViewModel((AnalyticsManager) singletonCImpl.r2.get());
                    case 168:
                        return new SortByBottomSheetViewModel((ListsInMemoryRepository) singletonCImpl.E2.get(), (AnalyticsManager) singletonCImpl.r2.get(), (ListsUtils) singletonCImpl.N3.get());
                    case 169:
                        ShoppingListInteractor shoppingListInteractor2 = (ShoppingListInteractor) singletonCImpl.e4.get();
                        ListsInMemoryRepository listsInMemoryRepository2 = (ListsInMemoryRepository) singletonCImpl.E2.get();
                        ShoppingListsRepository shoppingListsRepository2 = (ShoppingListsRepository) singletonCImpl.B2.get();
                        ShopAccountInteractor shopAccountInteractor2 = (ShopAccountInteractor) singletonCImpl.Y0.get();
                        AnalyticsManager analyticsManager3 = (AnalyticsManager) singletonCImpl.r2.get();
                        ListsUtils listsUtils2 = (ListsUtils) singletonCImpl.N3.get();
                        FeatureToggleManager featureToggleManager2 = (FeatureToggleManager) singletonCImpl.P0.get();
                        ShopListsAppModule shopListsAppModule = singletonCImpl.B;
                        Context context3 = singletonCImpl.e.f23776a;
                        Preconditions.d(context3);
                        return new SortByViewModel(shoppingListInteractor2, listsInMemoryRepository2, shoppingListsRepository2, shopAccountInteractor2, analyticsManager3, listsUtils2, featureToggleManager2, ShopListsAppModule_ProvidesListsDataStoreFactory.a(shopListsAppModule, context3));
                    case 170:
                        TrolleyInteractor trolleyInteractor3 = (TrolleyInteractor) singletonCImpl.h2.get();
                        CollectionModeInteractor collectionModeInteractor2 = (CollectionModeInteractor) singletonCImpl.q1.get();
                        SingletonCImpl singletonCImpl12 = viewModelCImpl.d;
                        return new SpecialsHomeViewModel(trolleyInteractor3, collectionModeInteractor2, new SpecialsHomeInteractor(new SpecialsHomeRepository((ApolloClient) singletonCImpl12.C1.get(), (FeatureToggleManager) singletonCImpl12.P0.get(), singletonCImpl12.A1()), (CollectionModeInteractor) singletonCImpl12.q1.get(), viewModelCImpl.c0()), viewModelCImpl.c0(), (FeatureToggleManager) singletonCImpl.P0.get(), (AnalyticsManager) singletonCImpl.r2.get(), (WatchlistInteractor) singletonCImpl.i4.get(), (InstoreNavigationInteractor) singletonCImpl.E3.get());
                    case 171:
                        SingletonCImpl singletonCImpl13 = viewModelCImpl.d;
                        return new SpinSurpriseGameViewModel(new SpinSurpriseGameInteractor(new SpinSurpriseGameRepository((DispatcherProvider) singletonCImpl13.n1.get(), (ApolloClient) singletonCImpl13.Q1.get())), (AnalyticsManager) singletonCImpl.r2.get());
                    case 172:
                        Provider provider = singletonCImpl.p1;
                        AppModule appModule = singletonCImpl.b;
                        PreferencesManager preferencesManager = (PreferencesManager) provider.get();
                        BaseDataModule baseDataModule = singletonCImpl.I;
                        Application applicationA2 = Contexts.a(singletonCImpl.e.f23776a);
                        baseDataModule.getClass();
                        SharedPreferences sharedPreferencesB = androidx.constraintlayout.core.state.a.b(applicationA2.getPackageName(), ".shop.onboarding", applicationA2, 0, "getSharedPreferences(...)");
                        FeatureToggleManager featureToggleManager3 = (FeatureToggleManager) singletonCImpl.P0.get();
                        appModule.getClass();
                        Intrinsics.h(featureToggleManager3, "featureToggleManager");
                        OnboardingRepository onboardingRepository = new OnboardingRepository(sharedPreferencesB, featureToggleManager3);
                        LegacyShopAnalyticsManager legacyShopAnalyticsManager = (LegacyShopAnalyticsManager) singletonCImpl.r1.get();
                        ApiInterface apiInterface = (ApiInterface) singletonCImpl.H1.get();
                        FirebasePerfMonitor firebasePerfMonitor = (FirebasePerfMonitor) singletonCImpl.Z0.get();
                        appModule.getClass();
                        Intrinsics.h(apiInterface, "apiInterface");
                        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
                        return new SplashViewModel(preferencesManager, onboardingRepository, legacyShopAnalyticsManager, new ConfigManagerImpl(apiInterface, firebasePerfMonitor), SingletonCImpl.Q0(singletonCImpl), (PreLoaderService) singletonCImpl.Z4.get(), (ShopAccountInteractor) singletonCImpl.Y0.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (ShopAppFlavorInteractor) singletonCImpl.N0.get());
                    case 173:
                        return new StoreLocatorViewModel(AppModule_ProvideStoreLocatorInteractorFactory.a(singletonCImpl.b, (ShopAccountInteractor) singletonCImpl.Y0.get(), singletonCImpl.L(), (RepositoryManager) singletonCImpl.t1.get(), (CollectionModeInteractor) singletonCImpl.q1.get(), (LocationInteractor) singletonCImpl.D3.get(), ShopStoreLocatorAppModule_ProvideStoreLocatorRepositoryFactory.a(singletonCImpl.C0, (ApolloClient) singletonCImpl.C1.get())), (LocationInteractor) singletonCImpl.D3.get(), (LegacyShopAnalyticsManager) singletonCImpl.r1.get(), (NetworkExceptions) singletonCImpl.m1.get());
                    case 174:
                        return new au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel(SingletonCImpl.W0(singletonCImpl), (LocationInteractor) singletonCImpl.D3.get(), (LegacyShopAnalyticsManager) singletonCImpl.r1.get(), (NetworkExceptions) singletonCImpl.m1.get());
                    case 175:
                        ShopProductNavigationModule shopProductNavigationModule = activityRetainedCImpl.k;
                        SingletonCImpl singletonCImpl14 = activityRetainedCImpl.n;
                        return new SubCategoryViewModel(ShopProductNavigationModule_ProvideProductNavigationInteractorFactory.a(shopProductNavigationModule, (RepositoryManager) singletonCImpl14.t1.get(), ShopProductNavigationModule_ProvideProductCategoryRepositoryFactory.a(shopProductNavigationModule, (ApolloClient) singletonCImpl14.C1.get())), (AnalyticsManager) singletonCImpl.r2.get());
                    case 176:
                        return new SubstitutionViewModel(new SubstitutionInteractor(new SubstitutionRepository((ApolloClient) viewModelCImpl.d.C1.get())), ViewModelCImpl.f(viewModelCImpl), (AnalyticsManager) singletonCImpl.r2.get());
                    case 177:
                        return new SuggestedListsViewModel(ShopListsDataModule_ProvideSuggestedListsInteractorFactory.a(activityRetainedCImpl.l, (SuggestedListsRepository) activityRetainedCImpl.n.a5.get()), (AnalyticsManager) singletonCImpl.r2.get(), (ListsUtils) singletonCImpl.N3.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 178:
                        return new TermsAndConditionsViewModel();
                    case 179:
                        SingletonCImpl singletonCImpl15 = viewModelCImpl.d;
                        GetTimeSelectorDataInteractor getTimeSelectorDataInteractor = new GetTimeSelectorDataInteractor(ShopCheckoutAppModule_ProvideCheckoutTimeSelectorRepository$shop_checkout_releaseFactory.a(singletonCImpl15.A, (ApolloClient) singletonCImpl15.C1.get(), (DispatcherProvider) singletonCImpl15.n1.get(), (FeatureToggleManager) singletonCImpl15.P0.get()));
                        SingletonCImpl singletonCImpl16 = viewModelCImpl.d;
                        return new TimeSelectorViewModel(getTimeSelectorDataInteractor, new ReserveTimeSlotInteractor(ShopCheckoutAppModule_ProvideCheckoutTimeSelectorRepository$shop_checkout_releaseFactory.a(singletonCImpl16.A, (ApolloClient) singletonCImpl16.C1.get(), (DispatcherProvider) singletonCImpl16.n1.get(), (FeatureToggleManager) singletonCImpl16.P0.get())), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                        UnlockChristmasFundsInteractor unlockChristmasFundsInteractor = (UnlockChristmasFundsInteractor) singletonCImpl.b5.get();
                        SingletonCImpl singletonCImpl17 = viewModelCImpl.d;
                        return new UnlockChristmasFundsViewModelV2(unlockChristmasFundsInteractor, new RedemptionStateInteractor((RedemptionStateRepository) singletonCImpl17.X4.get(), (DispatcherProvider) singletonCImpl17.n1.get()), (AnalyticsManager) singletonCImpl.r2.get());
                    case 181:
                        return new UnlockChristmasFundsViewModel((UnlockChristmasFundsInteractor) singletonCImpl.b5.get(), (AnalyticsManager) singletonCImpl.r2.get());
                    case 182:
                        return new ViewSimilarProductsViewModel((SimilarProductsInteractor) singletonCImpl.d5.get(), (ShoppingListItemInteractor) singletonCImpl.f4.get(), (ShoppingListInteractor) singletonCImpl.e4.get(), (AnalyticsManager) singletonCImpl.r2.get(), (ListsInMemoryRepository) singletonCImpl.E2.get(), (TrolleyInteractor) singletonCImpl.h2.get());
                    case 183:
                        SingletonCImpl singletonCImpl18 = viewModelCImpl.d;
                        VocDeviceInfoInteractor vocDeviceInfoInteractor = new VocDeviceInfoInteractor((Context) singletonCImpl18.k1.get(), (LocationInteractor) singletonCImpl18.D3.get());
                        SingletonCImpl singletonCImpl19 = viewModelCImpl.d;
                        return new VocFreeTextViewModel(new VocFreeTextInteractor(vocDeviceInfoInteractor, new VocRepository((DispatcherProvider) singletonCImpl19.n1.get(), (ApolloClient) singletonCImpl19.C1.get())));
                    case 184:
                        return new VocSurveyWebViewViewModel((ConnectionManager) singletonCImpl.L0.get());
                    case 185:
                        SingletonCImpl singletonCImpl20 = viewModelCImpl.d;
                        SingletonCImpl singletonCImpl21 = viewModelCImpl.d;
                        return new VocViewModel(new VocInteractor(new VocDeviceInfoInteractor((Context) singletonCImpl20.k1.get(), (LocationInteractor) singletonCImpl20.D3.get()), (CollectionModeInteractor) singletonCImpl21.q1.get(), new VocRepository((DispatcherProvider) singletonCImpl21.n1.get(), (ApolloClient) singletonCImpl21.C1.get())), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 186:
                        ActivityRetainedCImpl activityRetainedCImpl2 = viewModelCImpl.e;
                        SingletonCImpl singletonCImpl22 = viewModelCImpl.d;
                        CheckoutWPayDataRepository checkoutWPayDataRepositoryD = ActivityRetainedCImpl.d(activityRetainedCImpl2);
                        Provider provider2 = singletonCImpl22.c1;
                        ReleaseModule releaseModule = singletonCImpl22.c;
                        GetPaymentInstrumentsInteractor getPaymentInstrumentsInteractor = new GetPaymentInstrumentsInteractor(checkoutWPayDataRepositoryD, (SharedHeaders) provider2.get(), ReleaseModule_ProvidesSquadWebViewInteractorFactory.a(releaseModule));
                        UnlinkCreditCardInteractor unlinkCreditCardInteractor = new UnlinkCreditCardInteractor(new CreditCardDataRepository((ApolloClient) viewModelCImpl.e.n.C1.get()));
                        SingletonCImpl singletonCImpl23 = activityRetainedCImpl2.n;
                        SingletonCImpl singletonCImpl24 = activityRetainedCImpl2.n;
                        GetLinkPayPalInteractor getLinkPayPalInteractor = new GetLinkPayPalInteractor(new PayPalDataRepository((ApolloClient) singletonCImpl23.C1.get()), (SharedHeaders) singletonCImpl22.c1.get(), ReleaseModule_ProvidesSquadWebViewInteractorFactory.a(releaseModule));
                        UnlinkGiftCardInteractor unlinkGiftCardInteractor = new UnlinkGiftCardInteractor(new GiftCardDataRepository((ApolloClient) singletonCImpl24.C1.get()));
                        UnlinkPayPalInteractor unlinkPayPalInteractor = new UnlinkPayPalInteractor(new PayPalDataRepository((ApolloClient) singletonCImpl24.C1.get()));
                        DeviceFingerprintInteractor deviceFingerprintInteractor = (DeviceFingerprintInteractor) singletonCImpl22.b3.get();
                        Context context4 = singletonCImpl24.e.f23776a;
                        Preconditions.d(context4);
                        ShopWPayAppModule shopWPayAppModule = singletonCImpl24.F;
                        Context context5 = singletonCImpl24.e.f23776a;
                        Preconditions.d(context5);
                        return new WPayForOrderViewModel(getPaymentInstrumentsInteractor, unlinkCreditCardInteractor, getLinkPayPalInteractor, unlinkGiftCardInteractor, unlinkPayPalInteractor, new ProvideFingerprintInteractor(deviceFingerprintInteractor, new FraudPreventionDataRepository(context4, ShopWPayAppModule_ProvidesMagnesSDKFactory.a(shopWPayAppModule, context5, (AppConfig) singletonCImpl24.W0.get())), new PaymentIdentityDataRepository(), (FeatureToggleManager) singletonCImpl22.P0.get()), new MakePaymentInteractor(ActivityRetainedCImpl.d(activityRetainedCImpl2)), new CurrencyFormatter(), new CreditCardFormEventParser(), new GooglePayDataParser(), (ConnectionManager) singletonCImpl.L0.get(), new WPayAnalyticsTracker((AnalyticsManager) singletonCImpl22.r2.get()), (GooglePayManager) singletonCImpl.J3.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 187:
                        return new WatchlistBottomSheetViewModel((ListsUtils) singletonCImpl.N3.get());
                    case 188:
                        return new WatchlistToggleViewModel((ShoppingListInteractor) singletonCImpl.e4.get(), (PreferencesDetailsInteractor) singletonCImpl.L3.get(), (WatchlistInteractor) singletonCImpl.i4.get(), (ListsUtils) singletonCImpl.N3.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
                    case 189:
                        SingletonCImpl singletonCImpl25 = viewModelCImpl.d;
                        return new WebLinkViewModel(new WebLinkInteractor(new WebLinkRepository((ApolloClient) singletonCImpl25.C1.get(), (DispatcherProvider) singletonCImpl25.n1.get(), ReleaseModule_ProvidesSquadWebViewInteractorFactory.a(singletonCImpl25.c))));
                    case 190:
                        return new YourGroceriesPaymentSummaryViewModel();
                    case 191:
                        return new AddBundlesToCartViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.1
                            @Override // au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel.Factory
                            public final AddBundlesToCartViewModel a(Bundle bundle) {
                                SingletonCImpl singletonCImpl26 = SwitchingProvider.this.f4187a;
                                return new AddBundlesToCartViewModel(bundle, (CollectionModeInteractor) singletonCImpl26.q1.get(), (CartUpdateInteractor) singletonCImpl26.D2.get(), (AnalyticsManager) singletonCImpl26.r2.get(), (BundlesInteractor) singletonCImpl26.e5.get());
                            }
                        };
                    case BERTags.PRIVATE /* 192 */:
                        return new AddCreditCardViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.2
                            @Override // au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel.Factory
                            public final AddCreditCardViewModel a(PaymentFlowTypeData paymentFlowTypeData) {
                                SwitchingProvider switchingProvider = SwitchingProvider.this;
                                ViewModelCImpl viewModelCImpl2 = switchingProvider.c;
                                CreditCardDataRepository creditCardDataRepository = new CreditCardDataRepository((ApolloClient) viewModelCImpl2.e.n.C1.get());
                                SingletonCImpl singletonCImpl26 = viewModelCImpl2.d;
                                return new AddCreditCardViewModel(paymentFlowTypeData, new GetAddCreditCardInteractor(creditCardDataRepository, (SharedHeaders) singletonCImpl26.c1.get(), ReleaseModule_ProvidesSquadWebViewInteractorFactory.a(singletonCImpl26.c)), new LinkCreditCardInteractor(new CreditCardDataRepository((ApolloClient) viewModelCImpl2.e.n.C1.get())), (ConnectionManager) switchingProvider.f4187a.L0.get(), new AddCreditCardAnalyticsTracker((AnalyticsManager) viewModelCImpl2.d.r2.get()), new CreditCardFormEventParser());
                            }
                        };
                    case 193:
                        return new BundlesViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.3
                            @Override // au.com.woolworths.feature.shop.bundles.BundlesViewModel.Factory
                            public final BundlesViewModel a(String str) {
                                SingletonCImpl singletonCImpl26 = SwitchingProvider.this.f4187a;
                                return new BundlesViewModel(str, (BundlesInteractor) singletonCImpl26.e5.get(), (CartUpdateInteractor) singletonCImpl26.D2.get(), (CollectionModeInteractor) singletonCImpl26.q1.get(), (InstoreNavigationInteractor) singletonCImpl26.E3.get(), (FeatureToggleManager) singletonCImpl26.P0.get(), (ProductBoostInteractor) singletonCImpl26.C2.get(), (AnalyticsManager) singletonCImpl26.r2.get());
                            }
                        };
                    case 194:
                        return new CountrySelectorViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.4
                            @Override // au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel.Factory
                            public final CountrySelectorViewModel a(Activities.CountrySelector.Source source) {
                                SingletonCImpl singletonCImpl26 = SwitchingProvider.this.b.n;
                                return new CountrySelectorViewModel(source, new CountrySelectorInteractorImpl((ShoppingListSyncInteractor) singletonCImpl26.L2.get(), (InStoreWifiInteractor) singletonCImpl26.M2.get(), SingletonCImpl.X0(singletonCImpl26), (ShopAppRegionInteractor) singletonCImpl26.O0.get(), (CollectionModeInteractor) singletonCImpl26.q1.get(), singletonCImpl26.L(), (CartUpdateInteractor) singletonCImpl26.D2.get(), (ShopAuthManager) singletonCImpl26.R3.get()));
                            }
                        };
                    case 195:
                        return new DeliveryAddressSearchViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.5
                            @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel.Factory
                            public final DeliveryAddressSearchViewModel a(DeliveryAddressSearchViewModel.ScreenOptions screenOptions) {
                                SingletonCImpl singletonCImpl26 = SwitchingProvider.this.f4187a;
                                return new DeliveryAddressSearchViewModel(screenOptions, (ShopAccountInteractor) singletonCImpl26.Y0.get(), (SchedulersProvider) singletonCImpl26.o1.get(), (LegacyShoppingModeRepository) singletonCImpl26.E1.get(), (NetworkExceptions) singletonCImpl26.m1.get(), (FulfilmentExceptions) singletonCImpl26.K3.get(), (AnalyticsManager) singletonCImpl26.r2.get(), (CollectionModeInteractor) singletonCImpl26.q1.get());
                            }
                        };
                    case 196:
                        return new DynamicPageViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.6
                            @Override // au.com.woolworths.dynamic.page.ui.DynamicPageViewModel.Factory
                            public final DynamicPageViewModel a(String str) {
                                SwitchingProvider switchingProvider = SwitchingProvider.this;
                                ActivityRetainedCImpl activityRetainedCImpl3 = switchingProvider.b;
                                DynamicPageInteractorImpl dynamicPageInteractorImplA = DynamicPageModule_ProvideDynamicPageInteractor$dynamic_page_releaseFactory.a(activityRetainedCImpl3.m, new DynamicPageRepository((ApolloClient) activityRetainedCImpl3.n.C1.get()));
                                SingletonCImpl singletonCImpl26 = switchingProvider.f4187a;
                                return new DynamicPageViewModel(str, dynamicPageInteractorImplA, (TrolleyInteractor) singletonCImpl26.h2.get(), (AnalyticsManager) singletonCImpl26.r2.get(), singletonCImpl26.A1());
                            }
                        };
                    case 197:
                        return new HelpAndSupportViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.7
                            @Override // au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportViewModel.Factory
                            public final HelpAndSupportViewModel a(Screen screen) {
                                return new HelpAndSupportViewModel(screen, (AnalyticsManager) SwitchingProvider.this.f4187a.r2.get());
                            }
                        };
                    case 198:
                        return new MagicMatchViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.8
                            @Override // au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel.Factory
                            public final MagicMatchViewModel a(String str) {
                                SingletonCImpl singletonCImpl26 = SwitchingProvider.this.f4187a;
                                return new MagicMatchViewModel(str, (MagicMatchInteractor) singletonCImpl26.g5.get(), (ShoppingListInteractor) singletonCImpl26.e4.get());
                            }
                        };
                    case 199:
                        return new ModeSelectorViewModel.Factory() { // from class: au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.9
                            @Override // au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.Factory
                            public final ModeSelectorViewModel a(Activities.ModeSelectorActivity.ExtraCollectionModeSelector extraCollectionModeSelector) {
                                SingletonCImpl singletonCImpl26 = SwitchingProvider.this.f4187a;
                                return new ModeSelectorViewModel(extraCollectionModeSelector, SingletonCImpl.p1(singletonCImpl26), (CollectionModeInteractor) singletonCImpl26.q1.get(), (LocationInteractor) singletonCImpl26.D3.get(), (AnalyticsManager) singletonCImpl26.r2.get(), (FeatureToggleManager) singletonCImpl26.P0.get(), (ShopAccountInteractor) singletonCImpl26.Y0.get(), (ShopAppRegionInteractor) singletonCImpl26.O0.get());
                            }
                        };
                    default:
                        throw new AssertionError(i);
                }
            }
        }

        public ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, InstoreNavigationModule instoreNavigationModule, ProductFinderModule productFinderModule, SavedStateHandle savedStateHandle) {
            this.d = singletonCImpl;
            this.e = activityRetainedCImpl;
            this.f4186a = savedStateHandle;
            this.b = instoreNavigationModule;
            this.c = productFinderModule;
            this.f = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 0);
            this.g = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 1);
            this.h = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 2);
            this.i = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 3);
            this.j = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 4);
            this.k = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 5);
            this.l = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 6);
            this.m = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 7);
            this.n = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 8);
            this.o = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 9);
            this.p = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 10);
            this.q = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 11);
            this.r = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 12);
            this.s = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 13);
            this.t = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 14);
            this.u = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 15);
            this.v = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 16);
            this.w = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 17);
            this.x = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 18);
            this.y = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 19);
            this.z = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 20);
            this.A = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 21);
            this.B = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 22);
            this.C = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 23);
            this.D = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 24);
            this.E = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 25);
            this.F = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 26);
            this.G = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 27);
            this.H = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 28);
            this.I = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 29);
            this.J = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 30);
            this.K = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 31);
            this.L = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 32);
            this.M = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 33);
            this.N = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 34);
            this.O = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 35);
            this.P = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 36);
            this.Q = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 37);
            this.R = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 38);
            this.S = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 39);
            this.T = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 40);
            this.U = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 41);
            this.V = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 42);
            this.W = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 43);
            this.X = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 44);
            this.Y = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 45);
            this.Z = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 46);
            this.a0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 47);
            this.b0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 48);
            this.c0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 49);
            this.d0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 50);
            this.e0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 51);
            this.f0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 52);
            this.g0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 53);
            this.h0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 54);
            this.i0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 55);
            this.j0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 56);
            this.k0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 57);
            this.l0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 58);
            this.m0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 59);
            this.n0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 60);
            this.o0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 61);
            this.p0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 62);
            this.q0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 63);
            this.r0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 64);
            this.s0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 65);
            this.t0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 66);
            this.u0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 67);
            this.v0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 68);
            this.w0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 69);
            this.x0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 70);
            this.y0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 71);
            this.z0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 72);
            this.A0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 73);
            this.B0 = DoubleCheck.b(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 75));
            this.C0 = DoubleCheck.b(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 76));
            this.D0 = DoubleCheck.b(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 77));
            this.E0 = DoubleCheck.b(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 78));
            this.F0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 74);
            this.G0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 79);
            this.H0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 80);
            this.I0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 81);
            this.J0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 82);
            this.K0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 83);
            this.L0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 84);
            this.M0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 85);
            this.N0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 86);
            this.O0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 87);
            this.P0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 88);
            this.Q0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 89);
            this.R0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 90);
            this.S0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 91);
            this.T0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 92);
            this.U0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 93);
            this.V0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 94);
            this.W0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 95);
            this.X0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 96);
            this.Y0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 97);
            this.Z0 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 98);
            this.a1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 99);
            this.b1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 100);
            this.c1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 101);
            this.d1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 102);
            this.e1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 103);
            this.f1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 104);
            this.g1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 105);
            this.h1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 106);
            this.i1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 107);
            this.j1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 108);
            this.k1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 109);
            this.l1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 110);
            this.m1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 111);
            this.n1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 112);
            this.o1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 113);
            this.p1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 114);
            this.q1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 115);
            this.r1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 116);
            this.s1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 117);
            this.t1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 118);
            this.u1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 119);
            this.v1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 120);
            this.w1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 121);
            this.x1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 122);
            this.y1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 123);
            this.z1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 124);
            this.A1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 125);
            this.B1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 126);
            this.C1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 127);
            this.D1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 128);
            this.E1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 129);
            this.F1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 130);
            this.G1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 131);
            this.H1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 132);
            this.I1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 133);
            this.J1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 134);
            this.K1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 135);
            this.L1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 136);
            this.M1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 137);
            this.N1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 138);
            this.O1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 139);
            this.P1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 140);
            this.Q1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 141);
            this.R1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 142);
            this.S1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 143);
            this.T1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 144);
            this.U1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 145);
            this.V1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 146);
            this.W1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 147);
            this.X1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 148);
            this.Y1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 149);
            this.Z1 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 150);
            this.a2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 151);
            this.b2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 152);
            this.c2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 153);
            this.d2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 154);
            this.e2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, ModuleDescriptor.MODULE_VERSION);
            this.f2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 156);
            this.g2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 157);
            this.h2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 158);
            this.i2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 159);
            this.j2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 160);
            this.k2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 161);
            this.l2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 162);
            this.m2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 163);
            this.n2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 164);
            this.o2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 165);
            this.p2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 166);
            this.q2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 167);
            this.r2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 168);
            this.s2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 169);
            this.t2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 170);
            this.u2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 171);
            this.v2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 172);
            this.w2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 173);
            this.x2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 174);
            this.y2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 175);
            this.z2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 176);
            this.A2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 177);
            this.B2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 178);
            this.C2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 179);
            this.D2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, SubsamplingScaleImageView.ORIENTATION_180);
            this.E2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 181);
            this.F2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 182);
            this.G2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 183);
            this.H2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 184);
            this.I2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 185);
            this.J2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 186);
            this.K2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 187);
            this.L2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 188);
            this.M2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 189);
            this.N2 = new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 190);
            this.O2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 191));
            this.P2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, BERTags.PRIVATE));
            this.Q2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 193));
            this.R2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 194));
            this.S2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 195));
            this.T2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 196));
            this.U2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 197));
            this.V2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 198));
            this.W2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 199));
            this.X2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 200));
            this.Y2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 201));
            this.Z2 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER));
            this.a3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER));
            this.b3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 204));
            this.c3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 205));
            this.d3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 206));
            this.e3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 207));
            this.f3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 208));
            this.g3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 209));
            this.h3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 210));
            this.i3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, Primes.SMALL_FACTOR_LIMIT));
            this.j3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 212));
            this.k3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 213));
            this.l3 = SingleCheck.a(new SwitchingProvider(singletonCImpl, activityRetainedCImpl, this, 214));
        }

        public static FoodTrackerInteractor A(ViewModelCImpl viewModelCImpl) {
            return new FoodTrackerInteractor(new FoodTrackerRepository((ApolloClient) viewModelCImpl.d.C1.get()));
        }

        public static GetAddGiftCardInteractor B(ViewModelCImpl viewModelCImpl) {
            return new GetAddGiftCardInteractor(new GiftCardDataRepository((ApolloClient) viewModelCImpl.e.n.C1.get()));
        }

        public static HomepageCoachMarkInteractor C(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new HomepageCoachMarkInteractor(ReleaseModule_ProvideJwtRepositoryFactory.a(singletonCImpl.c, (JwtApi) singletonCImpl.r4.get()), (Gson) singletonCImpl.G0.get(), (DispatcherProvider) singletonCImpl.n1.get());
        }

        public static void D(ViewModelCImpl viewModelCImpl, AskOliveViewModel askOliveViewModel) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            ShopAskOliveAppModule shopAskOliveAppModule = singletonCImpl.z;
            Context context = singletonCImpl.e.f23776a;
            Preconditions.d(context);
            AskOliveViewModel_MembersInjector.a(askOliveViewModel, ShopAskOliveAppModule_ProvideVersionNameFactory.a(shopAskOliveAppModule, context));
        }

        public static MagazineInteractor E(ViewModelCImpl viewModelCImpl) {
            ActivityRetainedCImpl activityRetainedCImpl = viewModelCImpl.e;
            activityRetainedCImpl.getClass();
            return new MagazineInteractor(new MagazineRepositoryImpl(FreshMagModule_Companion_ProvideMagazineServiceFactory.a(FreshMagModule_Companion_ProvideCatalogueOkHttpClientFactory.a(new SaleFinderInterceptor(new SaleFinderConfigInteractor(), (ConnectionManager) activityRetainedCImpl.n.L0.get())), new SaleFinderConfigInteractor())), (FeatureToggleManager) viewModelCImpl.d.P0.get());
        }

        public static OrderCancellationInteractor F(ViewModelCImpl viewModelCImpl) {
            return new OrderCancellationInteractor(viewModelCImpl.d0());
        }

        public static OrderCheckInInteractor G(ViewModelCImpl viewModelCImpl) {
            return new OrderCheckInInteractor(new PickUpRepository((ApolloClient) viewModelCImpl.d.C1.get()));
        }

        public static OrderConfirmationInteractor H(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new OrderConfirmationInteractor(new OrderConfirmationRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1()), (CollectionModeInteractor) singletonCImpl.q1.get(), (GoogleAdManagerInteractor) singletonCImpl.m4.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        public static OrderDetailsInteractor I(ViewModelCImpl viewModelCImpl) {
            return new OrderDetailsInteractor(viewModelCImpl.d0());
        }

        public static OrderInvoiceDownloader J(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new OrderInvoiceDownloader(new OrderInvoiceRepository((ApolloClient) singletonCImpl.C1.get()), (DispatcherProvider) singletonCImpl.n1.get());
        }

        public static OrdersInteractor K(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new OrdersInteractor(new OrdersRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.C1.get()));
        }

        public static PerfectOrderInteractor L(ViewModelCImpl viewModelCImpl) {
            viewModelCImpl.getClass();
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new PerfectOrderInteractor(new PerfectOrderRepository(new PerfectOrderDataSource(BaseDataModule_ProvidesPerfectOrderSharedPrefs$base_impl_releaseFactory.a(singletonCImpl.I, Contexts.a(singletonCImpl.e.f23776a)))));
        }

        public static PickupOrderMessageInteractor M(ViewModelCImpl viewModelCImpl) {
            return new PickupOrderMessageInteractor(new PickupOrderMessageRepository((ApolloClient) viewModelCImpl.d.C1.get()));
        }

        public static ProductDetailsInteractor N(ViewModelCImpl viewModelCImpl) {
            return new ProductDetailsInteractor(viewModelCImpl.e0());
        }

        public static PromoRewardsAppInteractor O(ViewModelCImpl viewModelCImpl) {
            return new PromoRewardsAppInteractor(new RewardsAppModalRepository((ApolloClient) viewModelCImpl.d.Q1.get()));
        }

        public static PromotionDetailsInteractor P(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new PromotionDetailsInteractor(new PromotionDetailsRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get()), (CollectionModeInteractor) singletonCImpl.q1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (TrolleyInteractor) singletonCImpl.h2.get(), (DispatcherProvider) singletonCImpl.n1.get());
        }

        public static PromotionListingInteractor Q(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new PromotionListingInteractor(new PromotionListingRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get()), (CollectionModeInteractor) singletonCImpl.q1.get());
        }

        public static RecipeSearchInteractor R(ViewModelCImpl viewModelCImpl) {
            return new RecipeSearchInteractor(new RecipeSearchRepository((Context) viewModelCImpl.d.k1.get()));
        }

        public static RecipesInteractor S(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new RecipesInteractor(new RecipesRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1()), (CollectionModeInteractor) singletonCImpl.q1.get(), (GoogleAdManagerInteractor) singletonCImpl.m4.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        public static RewardsAppModalInteractor T(ViewModelCImpl viewModelCImpl) {
            return new RewardsAppModalInteractor((DispatcherProvider) viewModelCImpl.d.n1.get());
        }

        public static au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor U(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor(new RewardsBannerRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.Q1.get()));
        }

        public static RewardsCardInteractor V(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new RewardsCardInteractor(new RewardsCardRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.Q1.get()));
        }

        public static RewardsHomeOfferFeedInteractor W(ViewModelCImpl viewModelCImpl) {
            return new RewardsHomeOfferFeedInteractor((RewardsHomeOfferRepository) viewModelCImpl.d.R4.get());
        }

        public static RewardsMagicLinkInteractor X(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new RewardsMagicLinkInteractor(new RewardsMagicLinkRepository((AppConfig) singletonCImpl.W0.get(), (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get()));
        }

        public static RewardsOfferAnalyticsManager Y(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new RewardsOfferAnalyticsManager((RewardsAccountInteractor) singletonCImpl.Y1.get(), (AnalyticsManager) singletonCImpl.r2.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        public static RewardsPointsBalanceInteractor Z(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new RewardsPointsBalanceInteractor((RewardsPointsBalanceRepository) singletonCImpl.d4.get(), (DispatcherProvider) singletonCImpl.n1.get());
        }

        public static RewardsSettingsInteractor a0(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new RewardsSettingsInteractor((RewardsAccountInteractor) singletonCImpl.Y1.get(), new RewardsSettingsOptionManager((ShopAppRegionInteractor) singletonCImpl.O0.get()));
        }

        public static SubmitDriverRatingSurveyInteractor b0(ViewModelCImpl viewModelCImpl) {
            return new SubmitDriverRatingSurveyInteractor(new SubmitDriverRatingSurveyRepository((ApolloClient) viewModelCImpl.d.C1.get()));
        }

        public static AccountDetailsInteractor c(ViewModelCImpl viewModelCImpl) {
            return new AccountDetailsInteractor(new AccountDetailsRepository((ApolloClient) viewModelCImpl.d.C1.get()));
        }

        public static AccountSettingsInteractor d(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new AccountSettingsInteractor(new AccountSettingsRepository(Contexts.a(singletonCImpl.e.f23776a), (ApolloClient) singletonCImpl.Q1.get(), (DispatcherProvider) singletonCImpl.n1.get()), (MedalliaInteractor) singletonCImpl.t2.get(), (RewardsBannerInteractor) singletonCImpl.Y3.get(), (AccountNotificationBadgeInteractor) singletonCImpl.b4.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }

        public static AddGiftCardAnalyticsTracker e(ViewModelCImpl viewModelCImpl) {
            return new AddGiftCardAnalyticsTracker((AnalyticsManager) viewModelCImpl.d.r2.get());
        }

        public static BannerDismissInteractor f(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new BannerDismissInteractor(BaseDataModule_ProvideBannerDismissPrefs$base_impl_releaseFactory.a(singletonCImpl.I, Contexts.a(singletonCImpl.e.f23776a)), (ShopAccountInteractor) singletonCImpl.Y0.get());
        }

        public static BarcodeScannerInteractor g(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new BarcodeScannerInteractor(SingletonCImpl.Y0(singletonCImpl), viewModelCImpl.e0(), (ProductDetailsPageInteractor) singletonCImpl.h4.get(), (RepositoryManager) singletonCImpl.t1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1());
        }

        public static BrandedShopInteractor h(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new BrandedShopInteractor(new BrandedShopRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get()), (CollectionModeInteractor) singletonCImpl.q1.get(), singletonCImpl.A1());
        }

        public static BuyAgainInteractor i(ViewModelCImpl viewModelCImpl) {
            viewModelCImpl.getClass();
            SingletonCImpl singletonCImpl = viewModelCImpl.e.n;
            return new BuyAgainInteractor(new BuyAgainRepositoryImpl((ApolloClient) singletonCImpl.C1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), BaseDataModule_ProvidesBuyAgainSharedPrefsFactory.a(singletonCImpl.I, Contexts.a(singletonCImpl.e.f23776a))), (CollectionModeInteractor) viewModelCImpl.d.q1.get());
        }

        public static CatalogueBrowseInteractor j(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new CatalogueBrowseInteractor(new CatalogueBrowseRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1()), (CollectionModeInteractor) singletonCImpl.q1.get());
        }

        public static CatalogueDetailsInteractor k(ViewModelCImpl viewModelCImpl) {
            return new CatalogueDetailsInteractor(viewModelCImpl.c0(), viewModelCImpl.e.m());
        }

        public static CatalogueHomeInteractor l(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new CatalogueHomeInteractor(new CatalogueHomeRepository((ApolloClient) singletonCImpl.C1.get()), (CollectionModeInteractor) singletonCImpl.q1.get(), viewModelCImpl.c0());
        }

        public static CatalogueProductListInteractor m(ViewModelCImpl viewModelCImpl) {
            ActivityRetainedCImpl activityRetainedCImpl = viewModelCImpl.e;
            CatalogueModule catalogueModule = activityRetainedCImpl.e;
            SaleFinderProductListRepository saleFinderProductListRepositoryA = CatalogueModule_ProvideSaleFinderProductListRepository$catalogue_releaseFactory.a(catalogueModule, activityRetainedCImpl.m());
            SingletonCImpl singletonCImpl = activityRetainedCImpl.n;
            ConsolidatedProductListInteractor consolidatedProductListInteractor = new ConsolidatedProductListInteractor(saleFinderProductListRepositoryA, CatalogueModule_ProvideProductsForStoreInteractor$catalogue_releaseFactory.a(catalogueModule, (RepositoryManager) singletonCImpl.t1.get(), SingletonCImpl.Z0(singletonCImpl)));
            SingletonCImpl singletonCImpl2 = viewModelCImpl.d;
            return new CatalogueProductListInteractor(consolidatedProductListInteractor, (CollectionModeInteractor) singletonCImpl2.q1.get(), (TrolleyInteractor) singletonCImpl2.h2.get());
        }

        public static CatalogueStoreSelectorInteractor n(ViewModelCImpl viewModelCImpl) {
            ActivityRetainedCImpl activityRetainedCImpl = viewModelCImpl.e;
            return new CatalogueStoreSelectorInteractor(activityRetainedCImpl.m(), CatalogueModule_ProvideCatalogueConfigInteractorFactory.a(activityRetainedCImpl.e), viewModelCImpl.c0());
        }

        public static CategoryListingInteractor o(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new CategoryListingInteractor(new CategoryListingRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get()), (CollectionModeInteractor) singletonCImpl.q1.get(), (TrolleyInteractor) singletonCImpl.h2.get(), (DispatcherProvider) singletonCImpl.n1.get());
        }

        public static ChangeMyOrderInteractor p(ViewModelCImpl viewModelCImpl) {
            return new ChangeMyOrderInteractor(new ChangeMyOrderRepository((ApolloClient) viewModelCImpl.d.C1.get()));
        }

        public static CheckoutContentInteractor q(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new CheckoutContentInteractor(new CheckoutContentRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (ShopAppRegionInteractor) singletonCImpl.O0.get(), (ShopAppFlavorInteractor) singletonCImpl.N0.get()), DoubleCheck.a(singletonCImpl.E1), (DispatcherProvider) singletonCImpl.n1.get(), singletonCImpl.M());
        }

        public static CheckoutSummaryInteractor r(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new CheckoutSummaryInteractor(new CheckoutSummaryRepository((ApolloClient) singletonCImpl.C1.get(), (FeatureToggleManager) singletonCImpl.P0.get(), (ShopAppFlavorInteractor) singletonCImpl.N0.get()));
        }

        public static CloseAccountInteractor s(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new CloseAccountInteractor(new CloseAccountRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.Q1.get()), (RewardsAccountInteractor) singletonCImpl.Y1.get(), (DispatcherProvider) singletonCImpl.n1.get());
        }

        public static ContentPageInteractor t(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new ContentPageInteractor(new ContentPageRepository((ApolloClient) singletonCImpl.k4.get(), (FeatureToggleManager) singletonCImpl.P0.get(), singletonCImpl.A1()));
        }

        public static CreateShoppingListInteractor u(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new CreateShoppingListInteractor((ShoppingListInteractor) singletonCImpl.e4.get(), (ShoppingListItemInteractor) singletonCImpl.f4.get(), SingletonCImpl.Z0(singletonCImpl), (ListsInMemoryRepository) singletonCImpl.E2.get());
        }

        public static DeliveryAddressInteractor v(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new DeliveryAddressInteractor(new DeliveryAddressRepository((ShopAccountInteractor) singletonCImpl.Y0.get(), (LegacyShoppingModeRepository) singletonCImpl.E1.get(), (DispatcherProvider) singletonCImpl.n1.get()));
        }

        public static DeliveryUnlimitedSignUpInteractor w(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new DeliveryUnlimitedSignUpInteractor(new DeliveryUnlimitedSignUpRepository((ApolloClient) singletonCImpl.C1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FeatureToggleManager) singletonCImpl.P0.get()));
        }

        public static EReceiptDetailsInteractor x(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            ShopReceiptDetailsRepository shopReceiptDetailsRepositoryA = ShopReceiptDetailsAppModule_ProvidesEReceiptDetailsRepository$receipts_releaseFactory.a(singletonCImpl.l0, (ApolloClient) singletonCImpl.C1.get(), (DispatcherProvider) singletonCImpl.n1.get());
            ActivityRetainedCImpl activityRetainedCImpl = viewModelCImpl.e;
            SharedEReceiptDetailsModule sharedEReceiptDetailsModule = activityRetainedCImpl.f;
            SingletonCImpl singletonCImpl2 = activityRetainedCImpl.n;
            return new EReceiptDetailsInteractor(shopReceiptDetailsRepositoryA, SharedEReceiptDetailsModule_ProvideFileDownloaderFactory.a(sharedEReceiptDetailsModule, (OkHttpClient) singletonCImpl2.f1.get(), (DispatcherProvider) singletonCImpl2.n1.get()), Contexts.a(singletonCImpl.e.f23776a));
        }

        public static EditDriverInstructionsInteractor y(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new EditDriverInstructionsInteractor(new EditDriverInstructionsRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.C1.get()));
        }

        public static FetchChatbotFeedInteractor z(ViewModelCImpl viewModelCImpl) {
            SingletonCImpl singletonCImpl = viewModelCImpl.d;
            return new FetchChatbotFeedInteractor((CollectionModeInteractor) singletonCImpl.q1.get(), new AskOliveRepository((DispatcherProvider) singletonCImpl.n1.get(), (ApolloClient) singletonCImpl.C1.get()));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public final LazyClassKeyMap a() {
            ImmutableMap.Builder builderB = ImmutableMap.b(187);
            builderB.c("au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel", this.f);
            builderB.c("au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld", this.g);
            builderB.c("au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel", this.h);
            builderB.c("au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetViewModel", this.i);
            builderB.c("au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel", this.j);
            builderB.c("au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardViewModel", this.k);
            builderB.c("au.com.woolworths.product.addtocart.AddToCartViewModel", this.l);
            builderB.c("au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel", this.m);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.infomodal.ApplicableDeliveryMethodViewModel", this.n);
            builderB.c("au.com.woolworths.feature.rewards.permissions.ui.AskForPushNotificationPermissionViewModel", this.o);
            builderB.c("au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel", this.p);
            builderB.c("au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerViewModel", this.q);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorViewModel", this.r);
            builderB.c("au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel", this.s);
            builderB.c("au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorViewModel", this.t);
            builderB.c("au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy", this.u);
            builderB.c("au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel", this.v);
            builderB.c("au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionViewModel", this.w);
            builderB.c("au.com.woolworths.shop.cart.ui.CartBadgeActionViewModel", this.x);
            builderB.c("au.com.woolworths.product.cartpreauth.CartPreAuthViewModel", this.y);
            builderB.c("au.com.woolworths.shop.cart.ui.cart.CartViewModel", this.z);
            builderB.c("au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseViewModel", this.A);
            builderB.c("au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsViewModel", this.B);
            builderB.c("au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel", this.C);
            builderB.c("au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroViewModel", this.D);
            builderB.c("au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel", this.E);
            builderB.c("au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel", this.F);
            builderB.c("au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel", this.G);
            builderB.c("au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel", this.H);
            builderB.c("au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel", this.I);
            builderB.c("au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel", this.J);
            builderB.c("au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel", this.K);
            builderB.c("au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel", this.L);
            builderB.c("au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountViewModel", this.M);
            builderB.c("au.com.woolworths.feature.shop.editorder.review.CmoReviewViewModel", this.N);
            builderB.c("au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupViewModel", this.O);
            builderB.c("au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel", this.P);
            builderB.c("au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityViewModel", this.Q);
            builderB.c("au.com.woolworths.feature.shared.force.upgrade.ConfigActionViewModel", this.R);
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel", this.S);
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationViewModel", this.T);
            builderB.c("au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContentViewModel", this.U);
            builderB.c("au.com.woolworths.feature.shop.contentpage.ContentPageViewModel", this.V);
            builderB.c("au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel", this.W);
            builderB.c("au.com.woolworths.shop.digipay.creditcard.CreditCardViewModel", this.X);
            builderB.c("au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel", this.Y);
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingViewModel", this.Z);
            builderB.c("au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsViewModel", this.a0);
            builderB.c("au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel", this.b0);
            builderB.c("au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerViewModel", this.c0);
            builderB.c("au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsViewModel", this.d0);
            builderB.c("au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorViewModel", this.e0);
            builderB.c("au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetViewModel", this.f0);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel", this.g0);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel", this.h0);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel", this.i0);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel", this.j0);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingViewModel", this.k0);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel", this.l0);
            builderB.c("au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpViewModel", this.m0);
            builderB.c("au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel", this.n0);
            builderB.c("au.com.woolworths.feature.shared.feedback.ui.FeedbackFormViewModel", this.o0);
            builderB.c("au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerViewModel", this.p0);
            builderB.c("au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel", this.q0);
            builderB.c("au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel", this.r0);
            builderB.c("au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel", this.s0);
            builderB.c("au.com.woolworths.feature.shop.video.FullPageVideoPlayerViewModel", this.t0);
            builderB.c("au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginViewModel", this.u0);
            builderB.c("au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenViewModel", this.v0);
            builderB.c("au.com.woolworths.product.details.HealthierBottomSheetViewModel", this.w0);
            builderB.c("au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel", this.x0);
            builderB.c("au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel", this.y0);
            builderB.c("au.com.woolworths.feature.shop.inbox.InboxViewModel", this.z0);
            builderB.c("au.com.woolworths.feature.shop.instore.cart.InstoreCartViewModel", this.A0);
            builderB.c("au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel", this.F0);
            builderB.c("au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiViewModel", this.G0);
            builderB.c("au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel", this.H0);
            builderB.c("au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewModel", this.I0);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel", this.J0);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.ListsViewModel", this.K0);
            builderB.c("au.com.woolworths.feature.shop.login.LoginViewModel", this.L0);
            builderB.c("au.com.woolworths.android.onesite.modules.main.MainViewModel", this.M0);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.brands.MarketplaceBrandsViewModel", this.N0);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesViewModel", this.O0);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedViewModel", this.P0);
            builderB.c("au.com.woolworths.shop.checkout.ui.content.bottomsheet.MarketplacePickupBottomSheetViewModel", this.Q0);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.sellers.MarketplaceSellersViewModel", this.R0);
            builderB.c("au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel", this.S0);
            builderB.c("au.com.woolworths.feature.shop.more.MoreViewModel", this.T0);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel", this.U0);
            builderB.c("au.com.woolworths.feature.product.list.legacy.nutrition.NutritionBottomSheetViewModel", this.V0);
            builderB.c("au.com.woolworths.feature.product.list.nutrition.NutritionBottomSheetViewModel", this.W0);
            builderB.c("au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel", this.X0);
            builderB.c("au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarksViewModel", this.Y0);
            builderB.c("au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiViewModel", this.Z0);
            builderB.c("au.com.woolworths.feature.shop.onboarding.OnboardingViewModel", this.a1);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptViewModel", this.b1);
            builderB.c("au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel", this.c1);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel", this.d1);
            builderB.c("au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel", this.e1);
            builderB.c("au.com.woolworths.feature.shop.myorders.orders.OrdersViewModel", this.f1);
            builderB.c("au.com.woolworths.shop.lists.ui.pastshops.PastShopsViewModel", this.g1);
            builderB.c("au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorViewModel", this.h1);
            builderB.c("au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultViewModel", this.i1);
            builderB.c("au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorViewModel", this.j1);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorViewModel", this.k1);
            builderB.c("au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorViewModel", this.l1);
            builderB.c("au.com.woolworths.feature.shop.product.availability.ProductAvailabilityViewModel", this.m1);
            builderB.c("au.com.woolworths.product.offers.ProductBoostResultViewModel", this.n1);
            builderB.c("au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryViewModel", this.o1);
            builderB.c("au.com.woolworths.product.details.ProductDetailsViewModel", this.p1);
            builderB.c("au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel", this.q1);
            builderB.c("au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel", this.r1);
            builderB.c("au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryViewModel", this.s1);
            builderB.c("au.com.woolworths.feature.product.list.ProductListOptionsViewModel", this.t1);
            builderB.c("au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel", this.u1);
            builderB.c("au.com.woolworths.feature.product.list.legacy.ProductListViewModel", this.v1);
            builderB.c("au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetViewModel", this.w1);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoUpliftViewModel", this.x1);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoViewModel", this.y1);
            builderB.c("au.com.woolworths.shop.rewards.promo.PromoAppViewModel", this.z1);
            builderB.c("au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel", this.A1);
            builderB.c("au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingViewModel", this.B1);
            builderB.c("au.com.woolworths.promotion.banner.ui.PromotionViewModel", this.C1);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryViewModel", this.D1);
            builderB.c("au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel", this.E1);
            builderB.c("au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListViewModel", this.F1);
            builderB.c("au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel", this.G1);
            builderB.c("au.com.woolworths.shop.checkout.ui.summary.refund.RefundViewModel", this.H1);
            builderB.c("au.com.woolworths.sdui.rewards.broadcastbanner.RemoteDismissibleBannerViewModel", this.I1);
            builderB.c("au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalViewModel", this.J1);
            builderB.c("au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew", this.K1);
            builderB.c("au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModel", this.L1);
            builderB.c("au.com.woolworths.feature.shop.foryou.RewardsBoostersViewModelLegacy", this.M1);
            builderB.c("au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel", this.N1);
            builderB.c("au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel", this.O1);
            builderB.c("au.com.woolworths.feature.rewards.offers.RewardsHomeBridgeViewModel", this.P1);
            builderB.c("au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkViewModel", this.Q1);
            builderB.c("au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel", this.R1);
            builderB.c("au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy", this.S1);
            builderB.c("au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel", this.T1);
            builderB.c("au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy", this.U1);
            builderB.c("au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel", this.V1);
            builderB.c("au.com.woolworths.feature.rewards.account.preferences.notification.RewardsPushPreferenceDetailsViewModelLegacy", this.W1);
            builderB.c("au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel", this.X1);
            builderB.c("au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsViewModel", this.Y1);
            builderB.c("au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel", this.Z1);
            builderB.c("au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupViewModel", this.a2);
            builderB.c("au.com.woolworths.shop.rewards.RewardsViewModelLegacy", this.b2);
            builderB.c("au.com.woolworths.base.wallet.ocr.RewardsWalletOcrViewModel", this.c2);
            builderB.c("au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesViewModel", this.d2);
            builderB.c("au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsViewModel", this.e2);
            builderB.c("au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesViewModel", this.f2);
            builderB.c("au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableViewModel", this.g2);
            builderB.c("au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorViewModel", this.h2);
            builderB.c("au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkHandlerViewModel", this.i2);
            builderB.c("au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsViewModel", this.j2);
            builderB.c("au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestViewModel", this.k2);
            builderB.c("au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesViewModel", this.l2);
            builderB.c("au.com.woolworths.shop.receipts.ShopReceiptListViewModel", this.m2);
            builderB.c("au.com.woolworths.shop.rewards.ShopRewardsViewModel", this.n2);
            builderB.c("au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel", this.o2);
            builderB.c("au.com.woolworths.feature.shop.signup.SignUpViewModel", this.p2);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.sng.SngListsViewModel", this.q2);
            builderB.c("au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetViewModel", this.r2);
            builderB.c("au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel", this.s2);
            builderB.c("au.com.woolworths.shop.specials.SpecialsHomeViewModel", this.t2);
            builderB.c("au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameViewModel", this.u2);
            builderB.c("au.com.woolworths.android.onesite.modules.splash.SplashViewModel", this.v2);
            builderB.c("au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel", this.w2);
            builderB.c("au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel", this.x2);
            builderB.c("au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel", this.y2);
            builderB.c("au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel", this.z2);
            builderB.c("au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel", this.A2);
            builderB.c("au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsViewModel", this.B2);
            builderB.c("au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel", this.C2);
            builderB.c("au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModelV2", this.D2);
            builderB.c("au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModel", this.E2);
            builderB.c("au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel", this.F2);
            builderB.c("au.com.woolworths.feature.shop.voc.freetext.VocFreeTextViewModel", this.G2);
            builderB.c("au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewViewModel", this.H2);
            builderB.c("au.com.woolworths.feature.shop.voc.score.VocViewModel", this.I2);
            builderB.c("au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel", this.J2);
            builderB.c("au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetViewModel", this.K2);
            builderB.c("au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel", this.L2);
            builderB.c("au.com.woolworths.feature.shop.weblink.WebLinkViewModel", this.M2);
            builderB.c("au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryViewModel", this.N2);
            return new LazyClassKeyMap(builderB.a(true));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public final LazyClassKeyMap b() {
            ImmutableMap.Builder builderB = ImmutableMap.b(24);
            builderB.c("au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel", this.O2.get());
            builderB.c("au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel", this.P2.get());
            builderB.c("au.com.woolworths.feature.shop.bundles.BundlesViewModel", this.Q2.get());
            builderB.c("au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel", this.R2.get());
            builderB.c("au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel", this.S2.get());
            builderB.c("au.com.woolworths.dynamic.page.ui.DynamicPageViewModel", this.T2.get());
            builderB.c("au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportViewModel", this.U2.get());
            builderB.c("au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel", this.V2.get());
            builderB.c("au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel", this.W2.get());
            builderB.c("au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel", this.X2.get());
            builderB.c("au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel", this.Y2.get());
            builderB.c("au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpViewModel", this.Z2.get());
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel", this.a3.get());
            builderB.c("au.com.woolworths.shop.product.details.ProductDetailsViewModel", this.b3.get());
            builderB.c("au.com.woolworths.feature.product.list.ProductListViewModel", this.c3.get());
            builderB.c("au.com.woolworths.feature.product.list.v2.ProductListViewModel", this.d3.get());
            builderB.c("au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel", this.e3.get());
            builderB.c("au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel", this.f3.get());
            builderB.c("au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel", this.g3.get());
            builderB.c("au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanViewModel", this.h3.get());
            builderB.c("au.com.woolworths.feature.shop.storelocator.details.StoreDetailsViewModel", this.i3.get());
            builderB.c("au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel", this.j3.get());
            builderB.c("au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel", this.k3.get());
            builderB.c("au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel", this.l3.get());
            return new LazyClassKeyMap(builderB.a(true));
        }

        public final CatalogueStoreInteractor c0() {
            SingletonCImpl singletonCImpl = this.d;
            CatalogueAppModule catalogueAppModule = singletonCImpl.i;
            return new CatalogueStoreInteractor(CatalogueAppModule_ProvidesCatalogueRepositoryFactory.a(catalogueAppModule, BaseDataModule_ProvidesCatalogueSharedPrefsFactory.a(singletonCImpl.I, Contexts.a(singletonCImpl.e.f23776a)), CatalogueAppModule_ProvideCatalogueGson$catalogue_releaseFactory.a(catalogueAppModule)));
        }

        public final OrderDetailsRepository d0() {
            SingletonCImpl singletonCImpl = this.d;
            ApolloClient apolloClient = (ApolloClient) singletonCImpl.C1.get();
            return new OrderDetailsRepository(BaseDataModule_ProvidesOrderDetailsPrefs$base_impl_releaseFactory.a(singletonCImpl.I, Contexts.a(singletonCImpl.e.f23776a)), (FeatureToggleManager) singletonCImpl.P0.get(), apolloClient);
        }

        public final ProductDetailsRepository e0() {
            SingletonCImpl singletonCImpl = this.d;
            return new ProductDetailsRepository((ApolloClient) singletonCImpl.C1.get(), (DispatcherProvider) singletonCImpl.n1.get(), (FeatureToggleManager) singletonCImpl.P0.get());
        }
    }

    /* loaded from: classes3.dex */
    public static final class ViewWithFragmentCBuilder implements ShopApplication_HiltComponents.ViewWithFragmentC.Builder {
    }

    /* loaded from: classes3.dex */
    public static final class ViewWithFragmentCImpl extends ShopApplication_HiltComponents.ViewWithFragmentC {
    }

    /* loaded from: classes3.dex */
    public static final class WeightedArticleSelectionActivitySubcomponentFactory implements SessionActivityBuilderModule_BindWeightedArticleSelectionActivity.WeightedArticleSelectionActivitySubcomponent.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final SingletonCImpl f4212a;
        public final CartSessionComponentImpl b;

        public WeightedArticleSelectionActivitySubcomponentFactory(SingletonCImpl singletonCImpl, UserComponentImpl userComponentImpl, CartSessionComponentImpl cartSessionComponentImpl) {
            this.f4212a = singletonCImpl;
            this.b = cartSessionComponentImpl;
        }

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            WeightListActivityModule weightListActivityModule = new WeightListActivityModule();
            return new WeightedArticleSelectionActivitySubcomponentImpl(this.f4212a, this.b, weightListActivityModule, (WeightedArticleSelectionActivity) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class WeightedArticleSelectionActivitySubcomponentImpl implements SessionActivityBuilderModule_BindWeightedArticleSelectionActivity.WeightedArticleSelectionActivitySubcomponent {

        /* renamed from: a, reason: collision with root package name */
        public final WeightedArticleSelectionActivity f4213a;
        public final SingletonCImpl b;
        public final CartSessionComponentImpl c;

        public WeightedArticleSelectionActivitySubcomponentImpl(SingletonCImpl singletonCImpl, CartSessionComponentImpl cartSessionComponentImpl, WeightListActivityModule weightListActivityModule, WeightedArticleSelectionActivity weightedArticleSelectionActivity) {
            this.b = singletonCImpl;
            this.c = cartSessionComponentImpl;
            this.f4213a = weightedArticleSelectionActivity;
        }

        @Override // dagger.android.AndroidInjector
        public final void a(Object obj) {
            WeightedArticleSelectionActivity weightedArticleSelectionActivity = (WeightedArticleSelectionActivity) obj;
            Cart shoppingCart = (Cart) this.c.l.get();
            SingletonCImpl singletonCImpl = this.b;
            AnalyticsProvider analyticsAggregator = (AnalyticsProvider) singletonCImpl.u2.get();
            Intrinsics.h(shoppingCart, "shoppingCart");
            Intrinsics.h(analyticsAggregator, "analyticsAggregator");
            weightedArticleSelectionActivity.t = new WeightedListPresenter(this.f4213a, shoppingCart, analyticsAggregator);
            weightedArticleSelectionActivity.w = (FeatureToggleManager) singletonCImpl.P0.get();
            weightedArticleSelectionActivity.x = (AnalyticsProvider) singletonCImpl.u2.get();
            weightedArticleSelectionActivity.y = (AnalyticsManager) singletonCImpl.r2.get();
            weightedArticleSelectionActivity.z = (PayClient) singletonCImpl.Q2.get();
            weightedArticleSelectionActivity.A = (ScanAndGoFeatureConfig) singletonCImpl.S2.get();
            weightedArticleSelectionActivity.B = (OnSngAppCloseHandler) singletonCImpl.I3.get();
        }
    }
}
