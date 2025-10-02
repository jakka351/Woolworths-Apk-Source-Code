package au.com.woolworths.android.onesite.app;

import YU.a;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.Configuration;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.shared.AppLaunchAccessibilityAnalytics;
import au.com.woolworths.android.onesite.ShopAppFeature;
import au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker;
import au.com.woolworths.android.onesite.analytics.FontScale;
import au.com.woolworths.android.onesite.analytics.a11y.AccessibilityAnalytics;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor;
import au.com.woolworths.android.onesite.app.di.ShopEntryPoint;
import au.com.woolworths.android.onesite.app.di.SnGLibraryEntryPoint;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.logging.LoggingTree;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.notification.SwrveConfigData;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeDefaults;
import au.com.woolworths.design.core.ui.foundation.ThemeContext;
import au.com.woolworths.design.core.ui.foundation.color.CoreColorTokensKt;
import au.com.woolworths.design.core.ui.foundation.color.CoreColors;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevationTokensKt;
import au.com.woolworths.design.core.ui.foundation.icon.CoreIconsKt;
import au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyTokensKt;
import au.com.woolworths.devicefingerprint.BotmanagerInteractor;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationReceiver;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTracker;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTrackerFactory;
import au.com.woolworths.marketing.SwrveInteractor;
import au.com.woolworths.marketing.data.ShoppingModeSwrveUserProp;
import au.com.woolworths.rewards.base.data.RewardsPaymentEDPOnboardedMetadata;
import au.com.woolworths.sdui.shop.broadcastbanner.BannerDismissInteractorFactory;
import au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor;
import au.com.woolworths.shop.auth.KeycloakTokenAuthenticator;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import coil3.ComponentRegistry;
import coil3.Extras;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import coil3.Uri;
import coil3.gif.AnimatedImageDecoder;
import coil3.network.NetworkFetcher;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.transition.CrossfadeTransition;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.Identity;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.MobileCoreInitializer;
import com.adobe.marketing.mobile.identity.IdentityExtension;
import com.adobe.marketing.mobile.services.Log;
import com.akamai.botman.CYFMonitor;
import com.bumptech.glide.Glide;
import com.cyberfend.cyfsecurity.CYFManager;
import com.dynatrace.android.callback.Callback;
import com.github.piasy.biv.BigImageViewer;
import com.github.piasy.biv.loader.glide.GlideImageLoader;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MDFormListener;
import com.medallia.digital.mobilesdk.MDFormListenerData;
import com.medallia.digital.mobilesdk.MDResultCallback;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import com.swrve.sdk.Swrve;
import com.swrve.sdk.SwrveEmpty;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.SwrveNotificationConfig;
import com.swrve.sdk.SwrveSDK;
import com.swrve.sdk.SwrveSDKBase;
import com.swrve.sdk.config.SwrveConfig;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.base.mvvm.SnGViewModelFactory;
import com.woolworths.scanlibrary.di.component.SnGAppProvider;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.ui.menu.setting.di.SnGLibraryEntryPointFactory;
import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.hilt.EntryPoints;
import io.branch.referral.Branch;
import io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.internal.operators.observable.ObservableFilter;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lau/com/woolworths/android/onesite/app/BaseShopApplication;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "Lcom/woolworths/scanlibrary/di/component/SnGAppProvider;", "Lcom/woolworths/scanlibrary/ui/menu/setting/di/SnGLibraryEntryPointFactory;", "Ldagger/android/HasAndroidInjector;", "Lcoil3/SingletonImageLoader$Factory;", "Lau/com/woolworths/foundation/feature/analytics/AnalyticsTrackerFactory;", "Lau/com/woolworths/sdui/shop/broadcastbanner/BannerDismissInteractorFactory;", "<init>", "()V", "Companion", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class BaseShopApplication extends Application implements Configuration.Provider, SnGAppProvider, SnGLibraryEntryPointFactory, HasAndroidInjector, SingletonImageLoader.Factory, AnalyticsTrackerFactory, BannerDismissInteractorFactory {
    public static final /* synthetic */ int i = 0;
    public final Lazy d;
    public final Lazy e;
    public final BehaviorSubject f;
    public final ContextScope g;
    public final Lazy h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/app/BaseShopApplication$Companion;", "", "", "LEGACY_DATABASE_NAME", "Ljava/lang/String;", "PARAM_SHOPPER_ID", "STACK_TRACE_INTENT_ACTION_NAME", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BaseShopApplication() {
        final int i2 = 0;
        this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.app.b
            public final /* synthetic */ BaseShopApplication e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                BaseShopApplication baseShopApplication = this.e;
                switch (i3) {
                    case 0:
                        int i4 = BaseShopApplication.i;
                        Object objA = EntryPoints.a(ShopEntryPoint.class, baseShopApplication);
                        Intrinsics.g(objA, "get(...)");
                        return (ShopEntryPoint) objA;
                    case 1:
                        int i5 = BaseShopApplication.i;
                        Object objA2 = EntryPoints.a(SnGLibraryEntryPoint.class, baseShopApplication);
                        Intrinsics.g(objA2, "get(...)");
                        return (SnGLibraryEntryPoint) objA2;
                    default:
                        int i6 = BaseShopApplication.i;
                        return baseShopApplication.i().G();
                }
            }
        });
        final int i3 = 1;
        this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.app.b
            public final /* synthetic */ BaseShopApplication e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                BaseShopApplication baseShopApplication = this.e;
                switch (i32) {
                    case 0:
                        int i4 = BaseShopApplication.i;
                        Object objA = EntryPoints.a(ShopEntryPoint.class, baseShopApplication);
                        Intrinsics.g(objA, "get(...)");
                        return (ShopEntryPoint) objA;
                    case 1:
                        int i5 = BaseShopApplication.i;
                        Object objA2 = EntryPoints.a(SnGLibraryEntryPoint.class, baseShopApplication);
                        Intrinsics.g(objA2, "get(...)");
                        return (SnGLibraryEntryPoint) objA2;
                    default:
                        int i6 = BaseShopApplication.i;
                        return baseShopApplication.i().G();
                }
            }
        });
        Boolean bool = Boolean.FALSE;
        BehaviorSubject behaviorSubject = new BehaviorSubject();
        behaviorSubject.d.lazySet(bool);
        this.f = behaviorSubject;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.g = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        final int i4 = 2;
        this.h = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.app.b
            public final /* synthetic */ BaseShopApplication e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i4;
                BaseShopApplication baseShopApplication = this.e;
                switch (i32) {
                    case 0:
                        int i42 = BaseShopApplication.i;
                        Object objA = EntryPoints.a(ShopEntryPoint.class, baseShopApplication);
                        Intrinsics.g(objA, "get(...)");
                        return (ShopEntryPoint) objA;
                    case 1:
                        int i5 = BaseShopApplication.i;
                        Object objA2 = EntryPoints.a(SnGLibraryEntryPoint.class, baseShopApplication);
                        Intrinsics.g(objA2, "get(...)");
                        return (SnGLibraryEntryPoint) objA2;
                    default:
                        int i6 = BaseShopApplication.i;
                        return baseShopApplication.i().G();
                }
            }
        });
    }

    public static final void k(BaseShopApplication baseShopApplication, CollectionMode collectionMode) {
        if (baseShopApplication.i().J().d()) {
            SwrveInteractor swrveInteractorQ = baseShopApplication.i().q();
            ShoppingModeSwrveUserProp shoppingModeSwrveUserProp = new ShoppingModeSwrveUserProp(collectionMode.getModeName());
            swrveInteractorQ.getClass();
            SwrveInteractor.d(shoppingModeSwrveUserProp);
        }
    }

    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        return i().A();
    }

    @Override // coil3.SingletonImageLoader.Factory
    public final ImageLoader a(Context context) {
        Intrinsics.h(context, "context");
        ImageLoader.Builder builder = new ImageLoader.Builder(this);
        Extras.Key key = ImageRequestsKt.f13141a;
        Extras.Key key2 = ImageRequests_androidKt.f13142a;
        builder.d.b(ImageRequests_androidKt.b, new CrossfadeTransition.Factory(200));
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        int i2 = 1;
        builder2.e.add(new coil3.b(new AnimatedImageDecoder.Factory(), i2));
        builder2.a(new NetworkFetcher.Factory(new androidx.lifecycle.d(new androidx.lifecycle.compose.d(i2), 8)), Reflection.f24268a.b(Uri.class));
        builder.c = builder2.c();
        return builder.a();
    }

    @Override // com.woolworths.scanlibrary.di.component.SnGAppProvider
    public final SnGViewModelFactory b() {
        return i().y();
    }

    @Override // com.woolworths.scanlibrary.di.component.SnGAppProvider
    public final AnalyticsProvider c() {
        return i().K();
    }

    @Override // com.woolworths.scanlibrary.di.component.SnGAppProvider
    public final UserManager d() {
        return i().d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.android.onesite.app.c] */
    @Override // au.com.woolworths.foundation.feature.analytics.AnalyticsTrackerFactory
    public final c e() {
        return new AnalyticsTracker() { // from class: au.com.woolworths.android.onesite.app.c
            @Override // au.com.woolworths.foundation.feature.analytics.AnalyticsTracker
            public final void a(Event event) {
                int i2 = BaseShopApplication.i;
                Intrinsics.h(event, "event");
                this.f4217a.i().c().g(event);
            }
        };
    }

    @Override // au.com.woolworths.sdui.shop.broadcastbanner.BannerDismissInteractorFactory
    public final BannerDismissInteractor f() {
        return i().u();
    }

    @Override // androidx.work.Configuration.Provider
    public final Configuration g() {
        return (Configuration) this.h.getD();
    }

    @Override // com.woolworths.scanlibrary.ui.menu.setting.di.SnGLibraryEntryPointFactory
    public final SnGLibraryEntryPoint h() {
        return (SnGLibraryEntryPoint) this.e.getD();
    }

    public final ShopEntryPoint i() {
        return (ShopEntryPoint) this.d.getD();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public final void j() {
        SwrveInteractor swrveInteractorQ = i().q();
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel("swrve_notification_channel", getString(com.woolworths.R.string.swrve_channel_name), 3);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        swrveInteractorQ.getClass();
        SwrveConfig swrveConfig = new SwrveConfig();
        swrveConfig.k = true;
        swrveConfig.e = false;
        int color = swrveInteractorQ.b.getColor(com.woolworths.R.color.color_accent);
        SwrveNotificationConfig.Builder builder = new SwrveNotificationConfig.Builder(notificationChannel);
        builder.f19064a = SplashScreenActivity.class;
        builder.c = YU.a.A("#", Integer.toHexString(color));
        swrveConfig.f = new SwrveNotificationConfig(builder);
        swrveConfig.h = swrveInteractorQ.c.e;
        Application application = swrveInteractorQ.b;
        SwrveConfigData swrveConfigData = swrveInteractorQ.f9049a;
        int i2 = swrveConfigData.b;
        String str = swrveConfigData.f4581a;
        synchronized (SwrveSDK.class) {
            try {
                if (SwrveHelper.p(str)) {
                    SwrveHelper.r("Api key not specified");
                    throw null;
                }
                if (str.toLowerCase(Locale.ENGLISH).startsWith("secret-")) {
                    SwrveHelper.r("Api key should not start with secret-");
                    throw null;
                }
                ArrayList arrayList = swrveConfig.d;
                if (arrayList != null && arrayList.contains(SwrveHelper.f19056a)) {
                    SwrveLogger.e("Current device is part of the model blacklist", new Object[0]);
                    SwrveSDKBase.f19075a = new SwrveEmpty(application, str);
                }
                if (SwrveSDKBase.f19075a == null) {
                    SwrveSDKBase.f19075a = new Swrve(application, i2, str, swrveConfig);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (swrveInteractorQ.d.contains("is_logged_in")) {
            return;
        }
        SharedPreferences sharedPreferences = swrveInteractorQ.d;
        Intrinsics.g(sharedPreferences, "sharedPreferences");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        SwrveSDKBase.a();
        editorEdit.putBoolean("is_logged_in", SwrveSDKBase.f19075a.getUserId() != null);
        editorEdit.apply();
    }

    @Override // android.app.Application
    public void onCreate() {
        String shopperId;
        final String strM;
        final String str;
        String shopperId2;
        String shopperId3;
        Callback.i(this);
        super.onCreate();
        CoreColors coreColors = CoreThemeDefaults.f4772a;
        CoreThemeDefaults.f4772a = CoreColorTokensKt.f4781a;
        CoreThemeDefaults.d = CoreTypographyTokensKt.f5136a;
        CoreThemeDefaults.e = CoreIconsKt.b;
        CoreThemeDefaults.f = CoreElevationTokensKt.f4877a;
        CoreThemeDefaults.g = ThemeContext.d;
        i().v().c("app_on_create");
        int i2 = 0;
        int i3 = 1;
        if (i().I().c(BaseFeature.d)) {
            AppCompatDelegate.A(-1);
            CoreTheme.f4771a = true;
        } else {
            AppCompatDelegate.A(1);
            CoreTheme.f4771a = false;
        }
        i().I().d();
        Bark.f8483a.j(i().H());
        ActivityNavigatorKt.f4556a = Region.i;
        i().v().c("app_cold_start_interactive_state");
        if (i().I().c(ShopAppFeature.d)) {
            BotmanagerInteractor botmanagerInteractorK = i().k();
            botmanagerInteractorK.c.c("akamai_botmanager_initialize_sdk");
            synchronized (CYFMonitor.class) {
                CYFManager cYFManager = com.cyberfend.cyfsecurity.CYFMonitor.f14058a;
                synchronized (com.cyberfend.cyfsecurity.CYFMonitor.class) {
                    com.cyberfend.cyfsecurity.CYFMonitor.f14058a.getClass();
                    YU.R.f = true;
                }
            }
            String strR = botmanagerInteractorK.b.r();
            synchronized (CYFMonitor.class) {
                synchronized (com.cyberfend.cyfsecurity.CYFMonitor.class) {
                    com.cyberfend.cyfsecurity.CYFMonitor.c(this, strR);
                }
            }
            botmanagerInteractorK.c.d("akamai_botmanager_initialize_sdk");
        }
        BigImageViewer.b = new BigImageViewer(new GlideImageLoader(getApplicationContext()));
        FirebaseCrashlytics firebaseCrashlyticsF = i().f();
        CrashlyticsCore crashlyticsCore = firebaseCrashlyticsF.f15252a;
        Boolean bool = Boolean.TRUE;
        DataCollectionArbiter dataCollectionArbiter = crashlyticsCore.b;
        synchronized (dataCollectionArbiter) {
            dataCollectionArbiter.f = false;
            dataCollectionArbiter.g = bool;
            SharedPreferences.Editor editorEdit = dataCollectionArbiter.f15276a.edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", true);
            editorEdit.apply();
            synchronized (dataCollectionArbiter.c) {
                try {
                    if (dataCollectionArbiter.a()) {
                        if (!dataCollectionArbiter.e) {
                            dataCollectionArbiter.d.trySetResult(null);
                            dataCollectionArbiter.e = true;
                        }
                    } else if (dataCollectionArbiter.e) {
                        dataCollectionArbiter.d = new TaskCompletionSource();
                        dataCollectionArbiter.e = false;
                    }
                } finally {
                }
            }
        }
        String deviceId = i().x().getDeviceId();
        CrashlyticsCore crashlyticsCore2 = firebaseCrashlyticsF.f15252a;
        crashlyticsCore2.o.f15286a.a(new com.google.firebase.crashlytics.internal.common.c(i3, crashlyticsCore2, deviceId));
        Member memberN = i().J().n();
        if (memberN != null && (shopperId3 = memberN.getShopperId()) != null) {
            CrashlyticsCore crashlyticsCore3 = firebaseCrashlyticsF.f15252a;
            crashlyticsCore3.o.f15286a.a(new com.google.firebase.crashlytics.internal.common.d(crashlyticsCore3, "shopper_id", shopperId3));
        }
        Timber.Forest forest = Timber.f27013a;
        forest.r(new LoggingTree());
        AdobeAnalyticsInteractor adobeAnalyticsInteractorF = i().F();
        MobileCore.b(adobeAnalyticsInteractorF.b);
        String strO = adobeAnalyticsInteractorF.f4066a.o();
        if (strO == null) {
            Log.b("MobileCore", "MobileCore", "configureWithAppID failed - appId is null.", new Object[0]);
        } else {
            HashMap mapR = androidx.constraintlayout.core.state.a.r("config.appId", strO);
            Event.Builder builder = new Event.Builder("Configure with App ID", "com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent", null);
            builder.d(mapR);
            MobileCore.a(builder.a());
        }
        MobileCoreInitializer.g.a(CollectionsKt.Q(IdentityExtension.class), new androidx.compose.ui.graphics.colorspace.a(8));
        boolean z = adobeAnalyticsInteractorF.c.a().length() == 0;
        adobeAnalyticsInteractorF.d.c(z ? "adobe_ecid_first_time_sync" : "adobe_ecid_re_sync");
        Identity.a(new au.com.woolworths.android.onesite.analytics.adobe.a(adobeAnalyticsInteractorF, z));
        int i4 = 5;
        this.f.f(i().r().b()).g(new a(i4, new d(this, i2)));
        j();
        int i5 = 3;
        BuildersKt.c(this.g, null, null, new BaseShopApplication$observeRewardLinkStatusForSwrve$1(this, null), 3);
        final MedalliaInteractor medalliaInteractorG = i().g();
        MedalliaInteractor.InitState initState = medalliaInteractorG.c;
        MedalliaInteractor.InitState initState2 = MedalliaInteractor.InitState.e;
        if (initState != initState2 && initState != MedalliaInteractor.InitState.f) {
            medalliaInteractorG.c = initState2;
            forest.b("Initialising Medallia", new Object[0]);
            MedalliaDigital.init(medalliaInteractorG.b, medalliaInteractorG.f6485a.s(), new MDResultCallback() { // from class: au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$initMedallia$1
                @Override // com.medallia.digital.mobilesdk.MDResultCallback
                public final void onError(MDExternalError mDExternalError) {
                    medalliaInteractorG.c = MedalliaInteractor.InitState.g;
                    Timber.f27013a.b(a.A("Medallia initialisation error ", mDExternalError != null ? mDExternalError.getMessage() : null), new Object[0]);
                }

                @Override // com.medallia.digital.mobilesdk.MDResultCallback
                public final void onSuccess() {
                    MedalliaInteractor.InitState initState3 = MedalliaInteractor.InitState.f;
                    final MedalliaInteractor medalliaInteractor = medalliaInteractorG;
                    medalliaInteractor.c = initState3;
                    MedalliaDigital.setFormListener(new MDFormListener() { // from class: au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$createFormListener$1
                        @Override // com.medallia.digital.mobilesdk.MDFormListener
                        public final void onFormClosed(MDFormListenerData listenerData) {
                            Intrinsics.h(listenerData, "listenerData");
                            SharedFlowImpl sharedFlowImpl = medalliaInteractor.d;
                            String engagementId = listenerData.getEngagementId();
                            Intrinsics.g(engagementId, "getEngagementId(...)");
                            boolean zF = sharedFlowImpl.f(new MedalliaFormEvent.FormClosed(engagementId));
                            Timber.Forest forest2 = Timber.f27013a;
                            long timestamp = listenerData.getTimestamp();
                            String engagementId2 = listenerData.getEngagementId();
                            String strName = listenerData.getFormTriggerType().name();
                            StringBuilder sb = new StringBuilder("Medallia~onFormClosed ");
                            sb.append(zF);
                            sb.append(" ");
                            sb.append(timestamp);
                            forest2.b(androidx.constraintlayout.core.state.a.l(sb, ", ", engagementId2, ", ", strName), new Object[0]);
                        }

                        @Override // com.medallia.digital.mobilesdk.MDFormListener
                        public final void onFormDismissed(MDFormListenerData listenerData) {
                            Intrinsics.h(listenerData, "listenerData");
                            SharedFlowImpl sharedFlowImpl = medalliaInteractor.d;
                            String engagementId = listenerData.getEngagementId();
                            Intrinsics.g(engagementId, "getEngagementId(...)");
                            boolean zF = sharedFlowImpl.f(new MedalliaFormEvent.FormDismissed(engagementId));
                            Timber.Forest forest2 = Timber.f27013a;
                            long timestamp = listenerData.getTimestamp();
                            String engagementId2 = listenerData.getEngagementId();
                            String strName = listenerData.getFormTriggerType().name();
                            StringBuilder sb = new StringBuilder("Medallia~onFormDismissed ");
                            sb.append(zF);
                            sb.append(" ");
                            sb.append(timestamp);
                            forest2.b(androidx.constraintlayout.core.state.a.l(sb, ", ", engagementId2, ", ", strName), new Object[0]);
                        }

                        @Override // com.medallia.digital.mobilesdk.MDFormListener
                        public final void onFormDisplayed(MDFormListenerData listenerData) {
                            Intrinsics.h(listenerData, "listenerData");
                            SharedFlowImpl sharedFlowImpl = medalliaInteractor.d;
                            String engagementId = listenerData.getEngagementId();
                            Intrinsics.g(engagementId, "getEngagementId(...)");
                            boolean zF = sharedFlowImpl.f(new MedalliaFormEvent.FormDisplayed(engagementId));
                            Timber.Forest forest2 = Timber.f27013a;
                            long timestamp = listenerData.getTimestamp();
                            String engagementId2 = listenerData.getEngagementId();
                            String formLocaleSet = listenerData.getFormLocaleSet();
                            String formLocaleDisplay = listenerData.getFormLocaleDisplay();
                            String strName = listenerData.getFormTriggerType().name();
                            StringBuilder sb = new StringBuilder("Medallia~onFormDisplayed ");
                            sb.append(zF);
                            sb.append(" ");
                            sb.append(timestamp);
                            androidx.constraintlayout.core.state.a.B(sb, ", ", engagementId2, ", ", formLocaleSet);
                            forest2.b(androidx.constraintlayout.core.state.a.l(sb, ", ", formLocaleDisplay, ", ", strName), new Object[0]);
                        }

                        @Override // com.medallia.digital.mobilesdk.MDFormListener
                        public final void onFormLinkSelected(MDFormListenerData listenerData) {
                            Intrinsics.h(listenerData, "listenerData");
                            SharedFlowImpl sharedFlowImpl = medalliaInteractor.d;
                            String engagementId = listenerData.getEngagementId();
                            Intrinsics.g(engagementId, "getEngagementId(...)");
                            String url = listenerData.getUrl();
                            Intrinsics.g(url, "getUrl(...)");
                            boolean zF = sharedFlowImpl.f(new MedalliaFormEvent.FormLinkSelected(engagementId, url, listenerData.isBlocked()));
                            Timber.Forest forest2 = Timber.f27013a;
                            long timestamp = listenerData.getTimestamp();
                            String engagementId2 = listenerData.getEngagementId();
                            String strName = listenerData.getFormTriggerType().name();
                            String url2 = listenerData.getUrl();
                            boolean zIsBlocked = listenerData.isBlocked();
                            StringBuilder sb = new StringBuilder("Medallia~onFormLinkSelected ");
                            sb.append(zF);
                            sb.append(" ");
                            sb.append(timestamp);
                            androidx.constraintlayout.core.state.a.B(sb, ", ", engagementId2, ", ", strName);
                            sb.append(", ");
                            sb.append(url2);
                            sb.append(", ");
                            sb.append(zIsBlocked);
                            forest2.b(sb.toString(), new Object[0]);
                        }

                        @Override // com.medallia.digital.mobilesdk.MDFormListener
                        public final void onFormSubmitted(MDFormListenerData listenerData) {
                            Intrinsics.h(listenerData, "listenerData");
                            SharedFlowImpl sharedFlowImpl = medalliaInteractor.d;
                            String engagementId = listenerData.getEngagementId();
                            Intrinsics.g(engagementId, "getEngagementId(...)");
                            boolean zF = sharedFlowImpl.f(new MedalliaFormEvent.FormSubmitted(engagementId));
                            Timber.Forest forest2 = Timber.f27013a;
                            long timestamp = listenerData.getTimestamp();
                            String engagementId2 = listenerData.getEngagementId();
                            String strName = listenerData.getFormTriggerType().name();
                            StringBuilder sb = new StringBuilder("Medallia~onFormSubmitted ");
                            sb.append(zF);
                            sb.append(" ");
                            sb.append(timestamp);
                            forest2.b(androidx.constraintlayout.core.state.a.l(sb, ", ", engagementId2, ", ", strName), new Object[0]);
                        }

                        @Override // com.medallia.digital.mobilesdk.MDFormListener
                        public final void onFormThankYouPrompt(MDFormListenerData listenerData) {
                            Intrinsics.h(listenerData, "listenerData");
                            SharedFlowImpl sharedFlowImpl = medalliaInteractor.d;
                            String engagementId = listenerData.getEngagementId();
                            Intrinsics.g(engagementId, "getEngagementId(...)");
                            boolean zF = sharedFlowImpl.f(new MedalliaFormEvent.FormThankYouPrompt(engagementId));
                            Timber.Forest forest2 = Timber.f27013a;
                            long timestamp = listenerData.getTimestamp();
                            String engagementId2 = listenerData.getEngagementId();
                            String strName = listenerData.getFormTriggerType().name();
                            StringBuilder sb = new StringBuilder("Medallia~onFormThankYouPrompt ");
                            sb.append(zF);
                            sb.append(" ");
                            sb.append(timestamp);
                            forest2.b(androidx.constraintlayout.core.state.a.l(sb, ", ", engagementId2, ", ", strName), new Object[0]);
                        }
                    });
                    Timber.f27013a.b("Medallia SDK Initialised", new Object[0]);
                }
            });
        }
        k(this, i().h().w());
        int i6 = 6;
        i().h().k().g(new a(7, new d(this, i6)));
        Branch.f(this);
        try {
            getApplicationContext().deleteDatabase("woolworths_onesite.db");
        } catch (Exception e) {
            Member memberN2 = i().J().n();
            if (memberN2 == null || (shopperId = memberN2.getShopperId()) == null) {
                shopperId = "Guest";
            }
            Timber.f27013a.n(YU.a.h("deleteLegacyListsDatabase for ", shopperId, " failed!"), e, new Object[0]);
        }
        if (i().J().S()) {
            BuildersKt.c(this.g, null, null, new BaseShopApplication$syncSubscriptionDataForAnalytics$1(this, null), 3);
        }
        i().m().c();
        AccessibilityAnalytics accessibilityAnalyticsO = i().o();
        DeviceAccessibilityTracker deviceA11yTracker = accessibilityAnalyticsO.f4064a;
        AppLaunchAccessibilityAnalytics.Accessibility.Action.Companion companion = AppLaunchAccessibilityAnalytics.Accessibility.Action.d;
        List list = AccessibilityAnalytics.DeviceData.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AccessibilityAnalytics.DeviceData deviceData = (AccessibilityAnalytics.DeviceData) next;
            deviceData.getClass();
            Intrinsics.h(deviceA11yTracker, "deviceA11yTracker");
            if (deviceData.a(deviceA11yTracker)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 == null || (strM = CollectionsKt.M(arrayList2, " | ", null, null, new au.com.woolworths.android.onesite.analytics.a11y.a(i2), 30)) == null) {
            strM = DevicePublicKeyStringDef.NONE;
        }
        Collection collection = AccessibilityAnalytics.DeviceData.f;
        if (collection == null || !((AbstractCollection) collection).isEmpty()) {
            Iterator it2 = ((AbstractList) collection).iterator();
            while (it2.hasNext()) {
                AccessibilityAnalytics.DeviceData deviceData2 = (AccessibilityAnalytics.DeviceData) it2.next();
                deviceData2.getClass();
                Intrinsics.h(deviceA11yTracker, "deviceA11yTracker");
                if (deviceData2.a(deviceA11yTracker)) {
                    str = RewardsPaymentEDPOnboardedMetadata.YES_TRACKING_DATA;
                    break;
                }
            }
            str = "no";
        } else {
            str = "no";
        }
        FontScale fontScaleB = deviceA11yTracker.b();
        final String str2 = AccessibilityAnalytics.WhenMappings.f4065a[fontScaleB.ordinal()] == 1 ? null : fontScaleB.e;
        companion.getClass();
        accessibilityAnalyticsO.b.g(new au.com.woolworths.analytics.Event(strM, str2, str) { // from class: au.com.woolworths.analytics.shared.AppLaunchAccessibilityAnalytics$Accessibility$Action$Companion$accessibilitySettings$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(AppLaunchAccessibilityAnalytics.Accessibility.e);
                spreadBuilder.a(new Pair("event.Category", "accessibility_settings"));
                spreadBuilder.a(new Pair("event.Action", "check"));
                androidx.constraintlayout.core.state.a.y("event.Label", strM, spreadBuilder);
                androidx.constraintlayout.core.state.a.z("event.Description", str2 == null ? "" : str2, spreadBuilder, "user.AccessibilityPreference", str);
                ArrayList arrayList3 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            public final String d() {
                return "accessibility_settings_check";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof au.com.woolworths.analytics.Event)) {
                    return false;
                }
                au.com.woolworths.analytics.Event event = (au.com.woolworths.analytics.Event) obj;
                return "accessibility_settings_check".equals(event.d()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.c());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        BuildersKt.c(this.g, null, null, new BaseShopApplication$initInstoreWifi$1(this, null), 3);
        getApplicationContext().registerReceiver(new InStoreWiFiNotificationReceiver(), new IntentFilter("android.net.wifi.STATE_CHANGE"), "android.permission.CHANGE_WIFI_STATE", null);
        int i7 = 2;
        this.f.f(i().r().b()).g(new a(i7, new d(this, i5)));
        BuildersKt.c(this.g, null, null, new BaseShopApplication$observeInstoreWifiOptInStatusForSwrve$1(this, null), 3);
        i().E().g(this);
        if (i().J().S()) {
            this.f.f(i().r().b()).g(new a(i6, new d(this, i3)));
        }
        int i8 = 4;
        if (i().I().c(BaseFeature.l)) {
            this.f.f(i().r().b()).g(new a(i8, new d(this, i4)));
        }
        Member memberN3 = i().J().n();
        if (memberN3 != null && (shopperId2 = memberN3.getShopperId()) != null) {
            i().z().b(shopperId2);
        }
        BuildersKt.c(this.g, null, null, new BaseShopApplication$initBannerDismissInteractor$1(this, null), 3);
        ShopAppTokenAuthenticator shopAppTokenAuthenticatorS = i().s();
        BaseShopApplication$observerTokenRefresh$1 baseShopApplication$observerTokenRefresh$1 = new BaseShopApplication$observerTokenRefresh$1(this);
        shopAppTokenAuthenticatorS.getClass();
        shopAppTokenAuthenticatorS.k.add(baseShopApplication$observerTokenRefresh$1);
        KeycloakTokenAuthenticator keycloakTokenAuthenticatorC = i().C();
        BaseShopApplication$observerTokenRefresh$2 baseShopApplication$observerTokenRefresh$2 = new BaseShopApplication$observerTokenRefresh$2(this);
        keycloakTokenAuthenticatorC.getClass();
        keycloakTokenAuthenticatorC.c = baseShopApplication$observerTokenRefresh$2;
        BehaviorSubject behaviorSubject = i().J().i;
        behaviorSubject.getClass();
        new ObservableFilter(new ObservableDistinctUntilChanged(behaviorSubject), new a(i2, new au.com.woolworths.android.onesite.analytics.a11y.a(i3))).g(new a(i3, new d(this, i7)));
        i().J().k.g(new a(i5, new d(this, i8)));
        ContextScope contextScope = this.g;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(contextScope, DefaultIoScheduler.f, null, new BaseShopApplication$initGoogleAdManager$1(this, null), 2);
        i().j().initialize();
        ProcessLifecycleOwner.l.i.a(new DefaultLifecycleObserver() { // from class: au.com.woolworths.android.onesite.app.BaseShopApplication.onCreate.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStart(LifecycleOwner owner) {
                Intrinsics.h(owner, "owner");
                BaseShopApplication baseShopApplication = BaseShopApplication.this;
                baseShopApplication.f.onNext(Boolean.TRUE);
                if (baseShopApplication.i().I().c(BaseFeature.f)) {
                    baseShopApplication.i().N().c();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStop(LifecycleOwner lifecycleOwner) {
                BaseShopApplication baseShopApplication = BaseShopApplication.this;
                baseShopApplication.f.onNext(Boolean.FALSE);
                if (baseShopApplication.i().I().c(BaseFeature.f)) {
                    baseShopApplication.i().N().d();
                }
            }
        });
        SharedPreferences.Editor editorEdit2 = i().M().edit();
        editorEdit2.clear();
        editorEdit2.apply();
        i().v().d("app_on_create");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Glide.a(this).c(i2);
    }
}
