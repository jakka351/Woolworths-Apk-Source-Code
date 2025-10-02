package au.com.woolworths.feature.shared.instore.wifi.notifications;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.remoteconfig.RemoteConfig;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shared.instore.wifi.WiFiStoreDetailsAnalyticsProvider;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.salesforce.marketingcloud.messages.iam.j;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/notifications/InStoreWiFiNotificationHelper;", "", "InStoreWifiForShopRemoteConfig", "Companion", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InStoreWiFiNotificationHelper {

    /* renamed from: a, reason: collision with root package name */
    public final InStoreWifiInteractor f6522a;
    public final WiFiStoreDetailsAnalyticsProvider b;
    public final FeatureToggleManager c;
    public final ContextScope d;
    public final InStoreWiFiNotificationHelper$backgroundExceptionHandler$1 e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/notifications/InStoreWiFiNotificationHelper$Companion;", "", "", "DELAY_CALCULATION_CONSTANT", "J", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/notifications/InStoreWiFiNotificationHelper$InStoreWifiForShopRemoteConfig;", "Lau/com/woolworths/android/onesite/remoteconfig/RemoteConfig;", "", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InStoreWifiForShopRemoteConfig implements RemoteConfig {
        public static final InStoreWifiForShopRemoteConfig d;
        public static final /* synthetic */ InStoreWifiForShopRemoteConfig[] e;
        public static final /* synthetic */ EnumEntries f;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shared/instore/wifi/notifications/InStoreWiFiNotificationHelper.InStoreWifiForShopRemoteConfig.IN_STORE_WIFI_LOCATION_DETAILS_CALL_DELAY", "Lau/com/woolworths/feature/shared/instore/wifi/notifications/InStoreWiFiNotificationHelper$InStoreWifiForShopRemoteConfig;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class IN_STORE_WIFI_LOCATION_DETAILS_CALL_DELAY extends InStoreWifiForShopRemoteConfig {
            @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
            public final String getDefaultValue() {
                return "3";
            }
        }

        static {
            IN_STORE_WIFI_LOCATION_DETAILS_CALL_DELAY in_store_wifi_location_details_call_delay = new IN_STORE_WIFI_LOCATION_DETAILS_CALL_DELAY("IN_STORE_WIFI_LOCATION_DETAILS_CALL_DELAY", 0);
            d = in_store_wifi_location_details_call_delay;
            InStoreWifiForShopRemoteConfig[] inStoreWifiForShopRemoteConfigArr = {in_store_wifi_location_details_call_delay};
            e = inStoreWifiForShopRemoteConfigArr;
            f = EnumEntriesKt.a(inStoreWifiForShopRemoteConfigArr);
        }

        public static InStoreWifiForShopRemoteConfig valueOf(String str) {
            return (InStoreWifiForShopRemoteConfig) Enum.valueOf(InStoreWifiForShopRemoteConfig.class, str);
        }

        public static InStoreWifiForShopRemoteConfig[] values() {
            return (InStoreWifiForShopRemoteConfig[]) e.clone();
        }

        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        /* renamed from: getKey */
        public final String getD() {
            return "s_instore_wifi_location_details_call_delay";
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper$backgroundExceptionHandler$1] */
    public InStoreWiFiNotificationHelper(InStoreWifiInteractor interactor, WiFiStoreDetailsAnalyticsProvider analyticsProvider, FeatureToggleManager featureToggleManager, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(analyticsProvider, "analyticsProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f6522a = interactor;
        this.b = analyticsProvider;
        this.c = featureToggleManager;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.d = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        this.e = new DNASpacesBackgroundExceptionHandler() { // from class: au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper$backgroundExceptionHandler$1
            @Override // com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler
            public final void a(Exception exc) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(ReportOwner.Squad.u.a(), exc, "Failed to get location details for InStore Wifi", 8);
                this.f6523a.b.f8657a = j.h;
            }
        };
    }

    public final void a() {
        boolean zI = this.f6522a.i();
        WiFiStoreDetailsAnalyticsProvider wiFiStoreDetailsAnalyticsProvider = this.b;
        if (zI) {
            wiFiStoreDetailsAnalyticsProvider.f8657a = "disconnected";
        } else {
            wiFiStoreDetailsAnalyticsProvider.f8657a = null;
        }
    }

    public final void b(Context context) {
        BuildersKt.c(this.d, null, null, new InStoreWiFiNotificationHelper$updateWiFiStoreDetails$1(this, context, null), 3);
    }
}
