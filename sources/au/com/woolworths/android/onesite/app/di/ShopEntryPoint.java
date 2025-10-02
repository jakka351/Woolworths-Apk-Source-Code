package au.com.woolworths.android.onesite.app.di;

import android.content.SharedPreferences;
import androidx.work.Configuration;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.analytics.a11y.AccessibilityAnalytics;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.logging.dynatrace.TimberDynatraceLogger;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor;
import au.com.woolworths.devicefingerprint.BotmanagerInteractor;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.navigation.LinkNavigator;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.wxid.impl.WxidClientImpl;
import au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport;
import au.com.woolworths.marketing.SwrveInteractor;
import au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor;
import au.com.woolworths.shop.auth.KeycloakTokenAuthenticator;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.base.mvvm.SnGViewModelFactory;
import com.woolworths.scanlibrary.domain.login.UserManager;
import dagger.android.DispatchingAndroidInjector;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import kotlin.Metadata;

@EntryPoint
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/app/di/ShopEntryPoint;", "", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InstallIn
/* loaded from: classes.dex */
public interface ShopEntryPoint {
    DispatchingAndroidInjector A();

    LegacyShopAnalyticsManager B();

    KeycloakTokenAuthenticator C();

    Auth0AuthManager E();

    AdobeAnalyticsInteractor F();

    Configuration G();

    Bark.Barker H();

    FeatureToggleManager I();

    ShopAccountInteractor J();

    AnalyticsProvider K();

    GuestLoginInteractorImpl L();

    SharedPreferences M();

    SseNetworkTransport N();

    InStoreWifiInteractor O();

    AnalyticsManager c();

    UserManager d();

    WxidClientImpl e();

    FirebaseCrashlytics f();

    MedalliaInteractor g();

    CollectionModeInteractor h();

    InStoreWiFiNotificationHelper i();

    LinkNavigator j();

    BotmanagerInteractor k();

    ShoppingListSyncInteractor l();

    DeviceAccessibilityTracker m();

    PaymentServicesInteractor n();

    AccessibilityAnalytics o();

    TrafficDriversInteractor p();

    SwrveInteractor q();

    SchedulersProvider r();

    ShopAppTokenAuthenticator s();

    RewardsAccountInteractor t();

    BannerDismissInteractor u();

    FirebasePerfMonitor v();

    SubscriptionAnalyticsDataInteractor w();

    AppConfigurationInteractor x();

    SnGViewModelFactory y();

    TimberDynatraceLogger z();
}
