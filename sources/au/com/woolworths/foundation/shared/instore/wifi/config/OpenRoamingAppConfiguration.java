package au.com.woolworths.foundation.shared.instore.wifi.config;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration;", "", "ShopAppConfig", "ShopAppNzConfig", "RewardsAppConfig", "Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration$RewardsAppConfig;", "Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration$ShopAppConfig;", "Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration$ShopAppNzConfig;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class OpenRoamingAppConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final String f8658a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration$RewardsAppConfig;", "Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class RewardsAppConfig extends OpenRoamingAppConfiguration {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RewardsAppConfig);
        }

        public final int hashCode() {
            return 1835194569;
        }

        public final String toString() {
            return "RewardsAppConfig";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration$ShopAppConfig;", "Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShopAppConfig extends OpenRoamingAppConfiguration {
        public static final ShopAppConfig b = new ShopAppConfig("com.woolworths", "5bba6f2b-3399-6246-9257-hcc6c95ba337", "WooliesApp");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShopAppConfig);
        }

        public final int hashCode() {
            return 893636579;
        }

        public final String toString() {
            return "ShopAppConfig";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration$ShopAppNzConfig;", "Lau/com/woolworths/foundation/shared/instore/wifi/config/OpenRoamingAppConfiguration;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class ShopAppNzConfig extends OpenRoamingAppConfiguration {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShopAppNzConfig);
        }

        public final int hashCode() {
            return 1732353167;
        }

        public final String toString() {
            return "ShopAppNzConfig";
        }
    }

    public OpenRoamingAppConfiguration(String str, String str2, String str3) {
        this.f8658a = str3;
    }
}
